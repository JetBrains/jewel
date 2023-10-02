package org.jetbrains.jewel.samples.ideplugin

import com.intellij.openapi.Disposable
import com.intellij.openapi.actionSystem.ActionToolbar
import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.ex.CheckboxAction
import com.intellij.openapi.actionSystem.impl.ActionButton
import com.intellij.openapi.actionSystem.impl.MoreActionGroup
import com.intellij.openapi.observable.util.whenKeyTyped
import com.intellij.openapi.project.DumbAware
import com.intellij.ui.OnePixelSplitter
import com.intellij.ui.SearchTextField
import com.intellij.ui.SimpleColoredRenderer
import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBList
import com.intellij.util.ui.JBUI
import com.intellij.util.ui.components.BorderLayoutPanel

class SwingDemoPanel(parentDisposable: Disposable) : BorderLayoutPanel() {

    private val sidePanel = BorderLayoutPanel().apply { }

    private var currentContentSource: ContentSource<*> = AndroidStudioReleases

    private val filterTextField = SearchTextField(false).apply {
        whenKeyTyped(parentDisposable) {
            filterContent(text)
        }
    }

    private val actions: List<AnAction> = listOf(
        object : CheckboxAction("Android Studio releases"), DumbAware {

            override fun isSelected(e: AnActionEvent): Boolean =
                currentContentSource == AndroidStudioReleases

            override fun setSelected(e: AnActionEvent, state: Boolean) {
                setContentSource(AndroidStudioReleases)
            }

            override fun getActionUpdateThread() = ActionUpdateThread.BGT
        },
        object : CheckboxAction("Android desserts"), DumbAware {

            override fun isSelected(e: AnActionEvent): Boolean =
                currentContentSource == AndroidReleases

            override fun setSelected(e: AnActionEvent, state: Boolean) {
                setContentSource(AndroidReleases)
            }

            override fun getActionUpdateThread() = ActionUpdateThread.BGT
        }
    )

    private val overflowAction = MoreActionGroup()
        .apply { addAll(actions) }

    private val overflowActionButton: ActionButton =
        ActionButton(
            overflowAction,
            overflowAction.templatePresentation,
            "JewelSwingDemoTopBar",
            ActionToolbar.DEFAULT_MINIMUM_BUTTON_SIZE
        )

    private val topBar = BorderLayoutPanel().apply {
        addToLeft(JBLabel("Filter elements: "))
        addToCenter(filterTextField)
        addToRight(overflowActionButton)
        border = JBUI.Borders.empty(4)
    }

    private val list = JBList<ContentItem>()

    private val mainPanel = BorderLayoutPanel().apply {
        addToTop(topBar)
        addToCenter(list)
    }

    init {
        val splitter = OnePixelSplitter(false, .7f, .3f, 1f)
        splitter.firstComponent = mainPanel
        splitter.secondComponent = sidePanel
        splitter.foreground
        addToCenter(splitter)

        list.installCellRenderer {
            SimpleColoredRenderer().apply {
                appendWithClipping(it.displayText, null)
            }
        }
    }

    private fun setContentSource(contentSource: ContentSource<*>) {
        currentContentSource = contentSource

        list.model = JBList.createDefaultListModel(contentSource.items)
    }

    private fun filterContent(text: String) {
        // TODO
    }
}
