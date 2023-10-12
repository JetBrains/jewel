package org.jetbrains.jewel.intui.window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.intui.core.IntUiThemeDefinition
import org.jetbrains.jewel.intui.standalone.rememberSvgLoader
import org.jetbrains.jewel.intui.window.styling.IntUiTitleBarStyle
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
fun IntUiThemeDefinition.withTitleBar(lightHeaderInLight: Boolean = false): IntUiThemeDefinition {
    val svgLoader by rememberSvgLoader(!lightHeaderInLight)

    return withExtension(LocalTitleBarStyle provides titleBarStyle(svgLoader, lightHeaderInLight))
}
