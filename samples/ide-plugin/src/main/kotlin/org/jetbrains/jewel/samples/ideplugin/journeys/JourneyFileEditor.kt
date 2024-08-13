package org.jetbrains.jewel.samples.ideplugin.journeys

import com.intellij.openapi.fileEditor.FileEditor
import com.intellij.openapi.fileEditor.FileEditorState
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.UserDataHolderBase
import com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.jewel.bridge.JewelComposePanel
import org.jetbrains.jewel.foundation.enableNewSwingCompositing
import java.awt.BorderLayout
import java.beans.PropertyChangeListener
import javax.swing.JComponent
import javax.swing.JPanel

class JourneyFileEditor(project: Project, file: VirtualFile) : UserDataHolderBase(), FileEditor {
    private var myProject: Project = project
    private var myBaseFile: VirtualFile = file
    private val panel: JPanel = JPanel(BorderLayout())

    init {
        enableNewSwingCompositing()

        panel.add(JewelComposePanel {
            HomeView()
        }, BorderLayout.CENTER)
    }

    override fun dispose() { }

    override fun getComponent(): JComponent = panel

    override fun getPreferredFocusedComponent(): JComponent? = panel

    override fun getName(): String = "Journey Editor"

    override fun setState(p0: FileEditorState) { }

    override fun getFile(): VirtualFile {
        return myBaseFile
    }

    override fun isModified(): Boolean {
        return false
    }

    override fun isValid(): Boolean {
        return true
    }

    override fun addPropertyChangeListener(p0: PropertyChangeListener) { }

    override fun removePropertyChangeListener(p0: PropertyChangeListener) { }
}