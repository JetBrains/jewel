package org.jetbrains.jewel.intui.window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.intui.core.IntUiThemeDefinition
import org.jetbrains.jewel.intui.standalone.rememberSvgLoader
import org.jetbrains.jewel.intui.window.styling.IntUiDecoratedWindowStyle
import org.jetbrains.jewel.intui.window.styling.IntUiTitleBarStyle
import org.jetbrains.jewel.window.styling.DecoratedWindowStyle
import org.jetbrains.jewel.window.styling.LocalDecoratedWindowStyle
import org.jetbrains.jewel.window.styling.LocalTitleBarStyle
import org.jetbrains.jewel.window.styling.TitleBarStyle

@Composable
fun IntUiThemeDefinition.titleBarStyle(svgLoader: SvgLoader, lightHeaderInLight: Boolean = false): TitleBarStyle =
    if (isDark) {
        IntUiTitleBarStyle.dark(svgLoader)
    } else if (lightHeaderInLight) {
        IntUiTitleBarStyle.lightWithLightHeader(svgLoader)
    } else {
        IntUiTitleBarStyle.light(svgLoader)
    }

@Composable
fun IntUiThemeDefinition.decoratedWindowStyle(): DecoratedWindowStyle =
    if (isDark) {
        IntUiDecoratedWindowStyle.dark()
    } else {
        IntUiDecoratedWindowStyle.light()
    }

@Composable
fun IntUiThemeDefinition.withDecoratedWindow(lightHeaderInLight: Boolean = false): IntUiThemeDefinition {
    val svgLoader by rememberSvgLoader(!lightHeaderInLight)

    return withExtensions(
        LocalDecoratedWindowStyle provides decoratedWindowStyle(),
        LocalTitleBarStyle provides titleBarStyle(svgLoader, lightHeaderInLight),
    )
}
