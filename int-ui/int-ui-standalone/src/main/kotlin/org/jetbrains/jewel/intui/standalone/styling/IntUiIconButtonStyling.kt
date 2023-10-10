package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.styling.IconButtonColors
import org.jetbrains.jewel.styling.IconButtonMetrics
import org.jetbrains.jewel.styling.IconButtonStyle

@Stable
data class IntUiIconButtonStyle(
    override val colors: IntUiIconButtonColors,
    override val metrics: IntUiIconButtonMetrics,
) : IconButtonStyle {

    companion object {

        @Composable
        fun light() = IntUiIconButtonStyle(IntUiIconButtonColors.light(), IntUiIconButtonMetrics())

        @Composable
        fun dark() = IntUiIconButtonStyle(IntUiIconButtonColors.dark(), IntUiIconButtonMetrics())
    }
}

@Immutable
data class IntUiIconButtonColors(
    override val background: Color,
    override val backgroundDisabled: Color,
    override val backgroundFocused: Color,
    override val backgroundPressed: Color,
    override val backgroundHovered: Color,
) : IconButtonColors {

    companion object {

        @Composable
        fun light(
            background: Color = Color.Unspecified,
            backgroundDisabled: Color = Color.Unspecified,
            backgroundFocused: Color = background,
            backgroundPressed: Color = IntUiLightTheme.colors.grey(11),
            backgroundHovered: Color = IntUiLightTheme.colors.grey(12),
        ) =
            IntUiIconButtonColors(
                background,
                backgroundDisabled,
                backgroundFocused,
                backgroundPressed,
                backgroundHovered,
            )

        @Composable
        fun dark(
            background: Color = Color.Unspecified,
            backgroundDisabled: Color = Color.Unspecified,
            backgroundFocused: Color = background,
            backgroundPressed: Color = IntUiLightTheme.colors.grey(12),
            backgroundHovered: Color = IntUiLightTheme.colors.grey(11),
        ) =
            IntUiIconButtonColors(
                background,
                backgroundDisabled,
                backgroundFocused,
                backgroundPressed,
                backgroundHovered,
            )
    }
}

@Stable
data class IntUiIconButtonMetrics(
    override val cornerSize: CornerSize = CornerSize(4.dp),
    override val padding: PaddingValues = PaddingValues(horizontal = 0.dp, vertical = 0.dp),
    override val minSize: DpSize = DpSize(16.dp, 16.dp),
) : IconButtonMetrics
