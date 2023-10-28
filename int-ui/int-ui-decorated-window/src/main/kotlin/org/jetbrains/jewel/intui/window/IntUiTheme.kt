package org.jetbrains.jewel.intui.window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.intui.window.styling.dark
import org.jetbrains.jewel.intui.window.styling.light
import org.jetbrains.jewel.ui.ComponentStyling
import org.jetbrains.jewel.window.styling.DecoratedWindowStyle
import org.jetbrains.jewel.window.styling.LocalDecoratedWindowStyle
import org.jetbrains.jewel.window.styling.LocalTitleBarStyle
import org.jetbrains.jewel.window.styling.TitleBarStyle

fun ComponentStyling.decoratedWindow(
    windowStyle: DecoratedWindowStyle,
    titleBarStyle: TitleBarStyle,
): ComponentStyling = provide(
    LocalDecoratedWindowStyle provides windowStyle,
    LocalTitleBarStyle provides titleBarStyle,
)

fun ComponentStyling.decoratedWindow(): ComponentStyling = with(DecoratedWindowComponentStyling)

private object DecoratedWindowComponentStyling : ComponentStyling {

    @Composable
    override fun styles(): Array<out ProvidedValue<*>> {
        val isDark = JewelTheme.isDark
        val windowStyle: DecoratedWindowStyle = if (isDark) {
            DecoratedWindowStyle.dark()
        } else {
            DecoratedWindowStyle.light()
        }
        val titleBarStyle: TitleBarStyle = if (isDark) {
            TitleBarStyle.dark()
        } else {
            TitleBarStyle.light()
        }

        return arrayOf(
            LocalDecoratedWindowStyle provides windowStyle,
            LocalTitleBarStyle provides titleBarStyle,
        )
    }

    override fun toString(): String = "DecoratedWindowComponentStyle"
}
