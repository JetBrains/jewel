package org.jetbrains.jewel.samples.ideplugin.journeys

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileEditor.FileEditor
import com.intellij.openapi.fileEditor.FileEditorPolicy
import com.intellij.openapi.fileEditor.FileEditorProvider
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon

class JourneyFileType : FileType {
    companion object {
        val INSTANCE = JourneyFileType()
    }

    override fun getName(): String = "Journey File"

    override fun getDescription(): String {
        return "File type for Gemini test journeys"
    }

    override fun getDefaultExtension(): String {
        return ".journey"
    }

    override fun getIcon(): Icon {
        return AllIcons.FileTypes.Perl
    }

    override fun isBinary(): Boolean {
        return false
    }
}

class JourneyEditorProvider : FileEditorProvider {
    override fun accept(project: Project, file: VirtualFile): Boolean {
        // Determine if this provider should handle the given file
        return file.extension == "journey"
    }

    override fun createEditor(project: Project, file: VirtualFile): FileEditor {
        return JourneyFileEditor(project, file)
    }

    override fun getEditorTypeId(): String = "JourneyEditor"

    override fun getPolicy(): FileEditorPolicy = FileEditorPolicy.HIDE_DEFAULT_EDITOR
}