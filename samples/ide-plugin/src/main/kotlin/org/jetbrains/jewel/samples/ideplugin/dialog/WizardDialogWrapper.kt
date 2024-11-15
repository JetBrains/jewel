package org.jetbrains.jewel.samples.ideplugin.dialog

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.spring
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import com.intellij.openapi.application.EDT
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.util.ui.JBDimension
import com.intellij.util.ui.JBEmptyBorder
import java.awt.event.ActionEvent
import javax.swing.Action
import javax.swing.JComponent
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.jetbrains.annotations.Nls
import org.jetbrains.jewel.bridge.JewelComposePanel
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.foundation.enableNewSwingCompositing
import org.jetbrains.jewel.samples.ideplugin.dialog.wizard.MotionTokens

internal class WizardDialogWrapper(
    project: Project,
    @Nls title: String,
    private val pages: List<WizardPage>,
    private val defaultDispatcher: CoroutineDispatcher = Dispatchers.Default,
) : DialogWrapper(project), CoroutineScope {
    private val logger = thisLogger()

    override val coroutineContext: CoroutineContext = SupervisorJob() + Dispatchers.EDT + CoroutineName("ComposeWizard")

    private val currentPageIndex = mutableIntStateOf(0)

    private val cancelAction = CancelAction()
    private val backAction = WizardAction("Back") { onBackClick() }
    private val nextAction = WizardAction("Next") { onNextClick() }
    private val finishAction = WizardAction("Finish") { onFinishClick() }

    private var pageScope: CoroutineScope? = null

    init {
        require(pages.isNotEmpty()) { "Wizard must have at least one page" }
        init()

        this.title = title

        updateActions()
    }

    private fun updateActions() {
        pageScope?.cancel("Page changing")
        val newScope = CoroutineScope(coroutineContext)
        pageScope = newScope

        val pageIndex = currentPageIndex.value
        val page = pages[pageIndex]

        backAction.isEnabled = pageIndex > 0 && page.canGoBackwards.value
        nextAction.isEnabled = pageIndex < pages.lastIndex && page.canGoForward.value
        finishAction.isEnabled = pageIndex == pages.lastIndex && page.canGoForward.value

        newScope.launch(defaultDispatcher) {
            page.canGoBackwards.collect { canGoBackwards ->
                logger.info("CanGoBackwards: $canGoBackwards")
                backAction.isEnabled = pageIndex > 0 && canGoBackwards
            }
        }
        newScope.launch(defaultDispatcher) {
            page.canGoForward.collect { canGoForward ->
                logger.info("CanGoForward: $canGoForward")
                nextAction.isEnabled = pageIndex < pages.lastIndex && canGoForward
                finishAction.isEnabled = pageIndex == pages.lastIndex && canGoForward
            }
        }
    }

    @OptIn(ExperimentalJewelApi::class)
    override fun createCenterPanel(): JComponent {
        enableNewSwingCompositing()

        return JewelComposePanel {
                val index by currentPageIndex
                AnimatedContent(
                    targetState = index,
                    transitionSpec = {
                        val slideDirection =
                            if (targetState > initialState) {
                                AnimatedContentTransitionScope.SlideDirection.Left
                            } else {
                                AnimatedContentTransitionScope.SlideDirection.Right
                            }

                        slideIntoContainer(
                            towards = slideDirection,
                            animationSpec =
                                spring(
                                    dampingRatio = MotionTokens.Expressive.SpringFastSpatialDamping,
                                    stiffness = MotionTokens.Expressive.SpringFastSpatialStiffness,
                                ),
                        ) togetherWith
                            slideOutOfContainer(
                                towards = slideDirection,
                                animationSpec =
                                    spring(
                                        dampingRatio = MotionTokens.Expressive.SpringFastSpatialDamping,
                                        stiffness = MotionTokens.Expressive.SpringFastSpatialStiffness,
                                    ),
                            )
                    },
                ) {
                    pages[it].PageContent()
                }
            }
            .apply { preferredSize = JBDimension(800, 600) }
    }

    override fun createContentPaneBorder() = JBEmptyBorder(12, 0, 12, 8)

    override fun createActions(): Array<Action> = arrayOf(cancelAction, backAction, nextAction, finishAction)

    private fun onBackClick() {
        if (currentPageIndex.value <= 0) {
            logger.warn("Trying to go back beyond the first page")
            return
        }
        currentPageIndex.value -= 1
        updateActions()
    }

    private fun onNextClick() {
        if (currentPageIndex.value >= pages.lastIndex) {
            logger.warn("Trying to go next on or beyond the last page")
            return
        }
        currentPageIndex.value += 1
        updateActions()
    }

    private fun onFinishClick() {
        logger.info("Finish clicked")
        close(OK_EXIT_CODE)
    }

    private inner class CancelAction : DialogWrapperAction("Cancel") {
        override fun doAction(e: ActionEvent?) {
            logger.debug("Cancel clicked")
            doCancelAction()
        }
    }

    private inner class WizardAction(@Nls name: String, private val onAction: () -> Unit) : DialogWrapperAction(name) {
        override fun doAction(e: ActionEvent?) {
            onAction()
        }
    }
}

interface WizardPage {
    @Composable fun PageContent()

    val canGoForward: StateFlow<Boolean>
    val canGoBackwards: StateFlow<Boolean>
}
