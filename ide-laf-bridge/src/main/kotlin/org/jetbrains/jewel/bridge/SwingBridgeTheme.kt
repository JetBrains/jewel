package org.jetbrains.jewel.bridge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.intellij.openapi.components.service
import org.jetbrains.jewel.ExperimentalJewelApi
import org.jetbrains.jewel.themes.intui.core.BaseIntUiTheme

private val bridgeService = service<SwingBridgeService>()

@OptIn(ExperimentalJewelApi::class)
@Composable
fun SwingBridgeTheme(content: @Composable () -> Unit) {
    val themeDefinition by bridgeService.themeDefinition
    val componentStyling by bridgeService.componentStyling

    // TODO handle non-Int UI themes, too
    BaseIntUiTheme(themeDefinition, componentStyling, swingCompatMode = true, content)
}
