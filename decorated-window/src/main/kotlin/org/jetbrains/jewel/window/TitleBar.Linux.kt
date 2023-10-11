package org.jetbrains.jewel.window

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.window.styling.TitleBarStyle

@Composable internal fun DecoratedWindowScope.TitleBarOnLinux(
    modifier: Modifier = Modifier,
    gradientStartColor: Color = Color.Unspecified,
    style: TitleBarStyle = IntelliJTheme.defaultTitleBarStyle,
    content: @Composable TitleBarScope.() -> Unit,
) {
    TitleBarImpl(modifier, gradientStartColor, style, { size, state ->
        PaddingValues(0.dp)
    }, content)
}
