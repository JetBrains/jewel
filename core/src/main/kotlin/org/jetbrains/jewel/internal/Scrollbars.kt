package org.jetbrains.jewel.internal

import androidx.compose.foundation.HorizontalScrollbar
import androidx.compose.foundation.LocalScrollbarStyle
import androidx.compose.foundation.ScrollbarAdapter
import androidx.compose.foundation.ScrollbarStyle
import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.styles.localNotProvided

@Composable
fun VerticalScrollbar(
    adapter: ScrollbarAdapter,
    modifier: Modifier = Modifier,
    reverseLayout: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    defaults: ScrollerDefaults = IntelliJTheme.scrollerDefaults,
    colors: ScrollerColors = defaults.colors()
) =
    CompositionLocalProvider(
        LocalScrollbarStyle provides ScrollbarStyle(
            defaults.minHeight(),
            defaults.thickness(),
            defaults.shape(),
            defaults.hoverDurationMillis(),
            colors.unHoverColor(),
            colors.hoverColor()
        )
    ) {
        VerticalScrollbar(
            adapter = adapter,
            modifier = modifier,
            reverseLayout = reverseLayout,
            style = LocalScrollbarStyle.current,
            interactionSource = interactionSource
        )
    }

@Composable
fun HorizontalScrollbar(
    adapter: ScrollbarAdapter,
    modifier: Modifier = Modifier,
    reverseLayout: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    defaults: ScrollerDefaults = IntelliJTheme.scrollerDefaults,
    colors: ScrollerColors = defaults.colors()
) = CompositionLocalProvider(
    LocalScrollbarStyle provides ScrollbarStyle(
        defaults.minHeight(),
        defaults.thickness(),
        defaults.shape(),
        defaults.hoverDurationMillis(),
        colors.unHoverColor(),
        colors.hoverColor()
    )
) {
    HorizontalScrollbar(
        adapter = adapter,
        modifier = modifier,
        reverseLayout = reverseLayout,
        style = LocalScrollbarStyle.current,
        interactionSource = interactionSource
    )
}

@Stable
interface ScrollerDefaults {

    @Composable
    fun shape(): Shape

    @Composable
    fun minHeight(): Dp

    @Composable
    fun thickness(): Dp

    @Composable
    fun hoverDurationMillis(): Int

    @Composable
    fun colors(): ScrollerColors
}

@Stable
interface ScrollerColors {
    @Composable
    fun unHoverColor(): Color

    @Composable
    fun hoverColor(): Color
}

fun scrollerColors(
    unHoverColor: Color,
    hoverColor: Color
): ScrollerColors = DefaultScrollerColors(unHoverColor, hoverColor)

@Immutable
private data class DefaultScrollerColors(
    private val unHoverColor: Color,
    private val hoverColor: Color
) : ScrollerColors {
    @Composable
    override fun unHoverColor(): Color = unHoverColor

    @Composable
    override fun hoverColor(): Color = hoverColor
}

internal val LocalScrollerDefault = staticCompositionLocalOf<ScrollerDefaults> {
    localNotProvided()
}
