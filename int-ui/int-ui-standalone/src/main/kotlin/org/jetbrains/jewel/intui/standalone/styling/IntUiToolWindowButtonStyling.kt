package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.ButtonState
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme

@Stable
data class IntUiToolWindowButtonStyle(
    override val colors: ToolWindowButtonColors,
    override val metrics: ToolWindowButtonMetrics,
) : ToolWindowButtonStyle {

    object Default {

        @Composable
        fun light(
            colors: IntUiToolWindowButtonColors = IntUiToolWindowButtonColors.Default.light(),
            metrics: IntUiToolWindowButtonMetrics = IntUiToolWindowButtonMetrics.Default.create(),
        ): ToolWindowButtonStyle = IntUiToolWindowButtonStyle(colors, metrics)

        @Composable
        fun dark(
            colors: IntUiToolWindowButtonColors = IntUiToolWindowButtonColors.Default.dark(),
            metrics: IntUiToolWindowButtonMetrics = IntUiToolWindowButtonMetrics.Default.create(),
        ): ToolWindowButtonStyle = IntUiToolWindowButtonStyle(colors, metrics)
    }
}

@Immutable
data class IntUiToolWindowButtonColors(
    override val background: Brush,
    override val backgroundFocused: Brush,
    override val backgroundPressed: Brush,
    override val backgroundHovered: Brush,
    override val backgroundSelected: Brush,
    override val backgroundInactive: Brush,
    override val content: Color,
    override val contentFocused: Color,
    override val contentPressed: Color,
    override val contentHovered: Color,
    override val contentSelected: Color,
    override val contentInactive: Color,
) : ToolWindowButtonColors {

    object Default {

        @Composable
        fun light(
            background: Brush = SolidColor(Color.Transparent),
            backgroundFocused: Brush = SolidColor(IntUiLightTheme.colors.grey(12)),
            backgroundPressed: Brush = SolidColor(IntUiLightTheme.colors.grey(12)),
            backgroundHovered: Brush = SolidColor(IntUiLightTheme.colors.grey(12)),
            backgroundSelected: Brush = SolidColor(IntUiLightTheme.colors.blue(4)),
            backgroundInactive: Brush = SolidColor(IntUiLightTheme.colors.grey(11)),
            content: Color = IntUiLightTheme.colors.grey(6),
            contentFocused: Color = IntUiLightTheme.colors.grey(6),
            contentPressed: Color = IntUiLightTheme.colors.grey(6),
            contentHovered: Color = IntUiLightTheme.colors.grey(6),
            contentSelected: Color = IntUiLightTheme.colors.grey(14),
            contentInactive: Color = IntUiLightTheme.colors.grey(6),
        ) = IntUiToolWindowButtonColors(
            background,
            backgroundFocused,
            backgroundPressed,
            backgroundHovered,
            backgroundSelected,
            backgroundInactive,
            content,
            contentFocused,
            contentPressed,
            contentHovered,
            contentSelected,
            contentInactive
        )

        @Composable
        fun dark(
            background: Brush = SolidColor(Color.Transparent),
            backgroundFocused: Brush = SolidColor(IntUiDarkTheme.colors.grey(3)),
            backgroundPressed: Brush = SolidColor(IntUiDarkTheme.colors.grey(3)),
            backgroundHovered: Brush = SolidColor(IntUiDarkTheme.colors.grey(3)),
            backgroundSelected: Brush = SolidColor(IntUiDarkTheme.colors.blue(6)),
            backgroundInactive: Brush = SolidColor(IntUiDarkTheme.colors.grey(5)),
            content: Color = IntUiDarkTheme.colors.grey(11),
            contentFocused: Color = IntUiDarkTheme.colors.grey(11),
            contentPressed: Color = IntUiDarkTheme.colors.grey(11),
            contentHovered: Color = IntUiDarkTheme.colors.grey(11),
            contentSelected: Color = IntUiDarkTheme.colors.grey(14),
            contentInactive: Color = IntUiDarkTheme.colors.grey(11),
        ) = IntUiToolWindowButtonColors(
            background,
            backgroundFocused,
            backgroundPressed,
            backgroundHovered,
            backgroundSelected,
            backgroundInactive,
            content,
            contentFocused,
            contentPressed,
            contentHovered,
            contentSelected,
            contentInactive
        )
    }
}

@Stable
data class IntUiToolWindowButtonMetrics(
    override val selectedCornerSize: CornerSize,
    override val padding: PaddingValues,
    override val minSize: DpSize,
) : ToolWindowButtonMetrics {

    object Default {

        fun create(
            selectedCornerSize: CornerSize = CornerSize(6.dp),
            padding: PaddingValues = PaddingValues(all = 5.dp),
            minSize: DpSize = DpSize(40.dp, 40.dp),
        ) = IntUiToolWindowButtonMetrics(selectedCornerSize, padding, minSize)
    }
}

@Stable
interface ToolWindowButtonStyle {

    val colors: ToolWindowButtonColors
    val metrics: ToolWindowButtonMetrics
}

@Immutable
interface ToolWindowButtonColors {

    val background: Brush
    val backgroundFocused: Brush
    val backgroundPressed: Brush
    val backgroundHovered: Brush
    val backgroundSelected: Brush
    val backgroundInactive: Brush

    @Composable
    fun backgroundFor(state: ButtonState) = rememberUpdatedState(
        when {
            state.isActive && (state.isHovered || state.isFocused) ->
                backgroundSelected
            state.isActive ->
                backgroundSelected
            state.isActive && !state.isFocused ->
                backgroundInactive
            state.isHovered ->
                backgroundHovered
            state.isFocused ->
                backgroundFocused
            else ->
                background
        }
    )

    val content: Color
    val contentFocused: Color
    val contentPressed: Color
    val contentHovered: Color
    val contentSelected: Color
    val contentInactive: Color

    @Composable
    fun contentFor(state: ButtonState) = rememberUpdatedState(
        when {
            state.isActive && (state.isHovered || state.isFocused) ->
                contentSelected
            state.isActive ->
                contentSelected
            state.isActive && !state.isFocused ->
                contentInactive
            state.isHovered ->
                contentHovered
            state.isFocused ->
                contentFocused
            else ->
                content
        }
    )
}

@Stable
interface ToolWindowButtonMetrics {

    val selectedCornerSize: CornerSize
    val padding: PaddingValues
    val minSize: DpSize
}

val LocalDefaultToolWindowButtonStyle = staticCompositionLocalOf<ToolWindowButtonStyle> {
    error("No default ToolWindowButtonStyle provided")
}
