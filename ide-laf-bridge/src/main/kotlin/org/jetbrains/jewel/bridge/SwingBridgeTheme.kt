package org.jetbrains.jewel.bridge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.intellij.openapi.components.service
import org.jetbrains.jewel.themes.intui.core.BaseIntUiTheme

private val bridgeService = service<SwingBridgeService>()

@Composable
fun SwingBridgeTheme(content: @Composable () -> Unit) {
    val components by bridgeService.components.collectAsState()

    // TODO handle non-Int UI themes, too
    BaseIntUiTheme(components.themeDefinition, components.componentStyling, content)
}
