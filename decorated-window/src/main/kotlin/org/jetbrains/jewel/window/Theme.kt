package org.jetbrains.jewel.window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.window.styling.LocalTitleBarStyle
import org.jetbrains.jewel.window.styling.TitleBarStyle

val IntelliJTheme.Companion.defaultTitleBarStyle: TitleBarStyle
    @Composable
    @ReadOnlyComposable
    get() = LocalTitleBarStyle.current
