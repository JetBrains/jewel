package org.jetbrains.jewel.window

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.jetbrains.JBR
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.util.isDark
import org.jetbrains.jewel.window.styling.TitleBarStyle

@Composable internal fun DecoratedWindowScope.TitleBarOnWindows(
    modifier: Modifier = Modifier,
    gradientStartColor: Color = Color.Unspecified,
    style: TitleBarStyle = IntelliJTheme.defaultTitleBarStyle,
    content: @Composable TitleBarScope.() -> Unit,
) {
    val density = LocalDensity.current
    val titleBar = LocalTitleBar.current

    TitleBarImpl(modifier, gradientStartColor, style, { size, state ->
        with(density) {
            titleBar.height = size.height.toDp().value
        }
        titleBar.putProperty("controls.dark", style.colors.background.isDark())
        JBR.getWindowDecorations().setCustomTitleBar(window, titleBar)
    }, { _, state ->
        PaddingValues(start = titleBar.leftInset.dp, end = titleBar.rightInset.dp)
    }, content)
}