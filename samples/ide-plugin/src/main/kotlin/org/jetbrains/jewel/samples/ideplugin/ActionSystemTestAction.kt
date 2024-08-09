package org.jetbrains.jewel.samples.ideplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.DataKey
import com.intellij.openapi.diagnostic.Logger

class ActionSystemTestAction : AnAction() {
    private val logger = Logger.getInstance(ActionSystemTestAction::class.java)

    override fun actionPerformed(anActionEvent: AnActionEvent) {
        logger.debug(anActionEvent.getData(COMPONENT_DATA_KEY))
    }

    companion object {
        val COMPONENT_DATA_KEY = DataKey.create<String>("COMPONENT")
    }
}
