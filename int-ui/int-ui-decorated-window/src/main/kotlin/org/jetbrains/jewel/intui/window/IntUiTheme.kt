package org.jetbrains.jewel.intui.window

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.intui.core.IntUiThemeDefinition
import org.jetbrains.jewel.intui.window.styling.IntUiTitleBarStyle
import org.jetbrains.jewel.window.styling.LocalTitleBarStyle
import org.jetbrains.jewel.window.styling.TitleBarStyle

@Composable
fun IntUiThemeDefinition.titleBarStyle(lightHeaderInLight: Boolean = false): TitleBarStyle =
    if (isDark) {
        IntUiTitleBarStyle.dark()
    } else if (lightHeaderInLight) {
        IntUiTitleBarStyle.lightWithLightHeader()
    } else {
        IntUiTitleBarStyle.light()
    }

@Composable
fun IntUiThemeDefinition.withTitleBar(lightHeaderInLight: Boolean = false): IntUiThemeDefinition =
    withExtension(LocalTitleBarStyle provides titleBarStyle(lightHeaderInLight))
