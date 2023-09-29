package org.jetbrains.jewel.samples.ideplugin

import com.intellij.openapi.Disposable
import com.intellij.openapi.actionSystem.ActionToolbar
import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.DefaultActionGroup
import com.intellij.openapi.actionSystem.Toggleable
import com.intellij.openapi.actionSystem.ex.CheckboxAction
import com.intellij.openapi.actionSystem.impl.ActionButton
import com.intellij.openapi.observable.util.whenKeyTyped
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.openapi.ui.Splitter
import com.intellij.openapi.ui.popup.JBPopup
import com.intellij.openapi.ui.popup.JBPopupFactory
import com.intellij.openapi.ui.popup.util.PopupUtil
import com.intellij.ui.SearchTextField
import com.intellij.ui.awt.RelativePoint
import com.intellij.ui.components.JBList
import com.intellij.util.ui.JBUI
import com.intellij.util.ui.components.BorderLayoutPanel
import java.awt.Dimension
import java.awt.Point

class SwingDemoPanel(parentDisposable: Disposable) : BorderLayoutPanel() {

    private val sidePanel = BorderLayoutPanel().apply { }

    private var currentContentSource = ContentSource.AndroidStudio

    private val filterTextField = SearchTextField(false).apply {
        whenKeyTyped(parentDisposable) {
            filterContent(text)
        }
    }

    private val actions = listOf(
        object : CheckboxAction("Android desserts"), DumbAware {

            override fun isSelected(e: AnActionEvent): Boolean =
                currentContentSource == ContentSource.AndroidStudio //ContentSource.AndroidDesserts

            override fun setSelected(e: AnActionEvent, state: Boolean) {
                setContentSource(ContentSource.AndroidStudio)
            }

            override fun getActionUpdateThread() = ActionUpdateThread.BGT
        }
    )

    // Inspired by com.intellij.toolWindow.ShowMoreToolWindowsAction
    private val overflowAction = object : DumbAwareAction(), Toggleable {

        private val minPopupWidth: Int
            get() = JBUI.scale(300)

        override fun actionPerformed(e: AnActionEvent) {
            val popup = createPopup(e) ?: return
            showPopup(popup)
        }

        fun createPopup(e: AnActionEvent): JBPopup? {
            val popup =
                JBPopupFactory.getInstance()
                    .createActionGroupPopup(null, DefaultActionGroup(actions), e.dataContext, null, true)
            popup.setMinimumSize(Dimension(minPopupWidth, -1))
            PopupUtil.addToggledStateListener(popup, e.presentation)
            return popup
        }

        fun showPopup(popup: JBPopup) {
            val point = Point(overflowActionButton.x, overflowActionButton.y + overflowActionButton.height)
            popup.show(RelativePoint(overflowActionButton, point))
        }
    }

    private val overflowActionButton: ActionButton =
        ActionButton(
            overflowAction,
            overflowAction.templatePresentation,
            "JewelSwingDemoTopBar",
            ActionToolbar.DEFAULT_MINIMUM_BUTTON_SIZE
        )

    private val topBar = BorderLayoutPanel().apply {
        addToCenter(filterTextField)
        addToRight(overflowActionButton)
    }

    private val list = JBList<ContentItem>()

    private val mainPanel = BorderLayoutPanel().apply {
        addToTop(topBar)
        addToCenter(list)
    }

    init {
        val splitter = Splitter(false, .7f, .3f, 1f)
        splitter.firstComponent = mainPanel
        splitter.secondComponent = sidePanel
        addToCenter(splitter)
    }

    private fun setContentSource(contentSource: ContentSource) {
        currentContentSource = contentSource
        // TODO update content in the list/details
    }

    private fun filterContent(text: String) {
    }
}
