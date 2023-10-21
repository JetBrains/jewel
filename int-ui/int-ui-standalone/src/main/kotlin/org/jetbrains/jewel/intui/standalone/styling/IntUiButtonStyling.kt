package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme

val org.jetbrains.jewel.core.component.styling.ButtonStyle.Companion.Default: IntUiDefaultButtonStyleFactory
    get() = IntUiDefaultButtonStyleFactory

object IntUiDefaultButtonStyleFactory {

    @Composable
    fun light(
        colors: org.jetbrains.jewel.core.component.styling.ButtonColors = org.jetbrains.jewel.core.component.styling.ButtonColors.Default.light(),
        metrics: org.jetbrains.jewel.core.component.styling.ButtonMetrics = org.jetbrains.jewel.core.component.styling.ButtonMetrics.default(),
    ) = org.jetbrains.jewel.core.component.styling.ButtonStyle(colors, metrics)

    @Composable
    fun dark(
        colors: org.jetbrains.jewel.core.component.styling.ButtonColors = org.jetbrains.jewel.core.component.styling.ButtonColors.Default.dark(),
        metrics: org.jetbrains.jewel.core.component.styling.ButtonMetrics = org.jetbrains.jewel.core.component.styling.ButtonMetrics.default(),
    ) = org.jetbrains.jewel.core.component.styling.ButtonStyle(colors, metrics)
}

val org.jetbrains.jewel.core.component.styling.ButtonStyle.Companion.Outlined: IntUiOutlinedButtonStyleFactory
    get() = IntUiOutlinedButtonStyleFactory

object IntUiOutlinedButtonStyleFactory {

    @Composable
    fun light(
        colors: org.jetbrains.jewel.core.component.styling.ButtonColors = org.jetbrains.jewel.core.component.styling.ButtonColors.Outlined.light(),
        metrics: org.jetbrains.jewel.core.component.styling.ButtonMetrics = org.jetbrains.jewel.core.component.styling.ButtonMetrics.outlined(),
    ) = org.jetbrains.jewel.core.component.styling.ButtonStyle(colors, metrics)

    @Composable
    fun dark(
        colors: org.jetbrains.jewel.core.component.styling.ButtonColors = org.jetbrains.jewel.core.component.styling.ButtonColors.Outlined.dark(),
        metrics: org.jetbrains.jewel.core.component.styling.ButtonMetrics = org.jetbrains.jewel.core.component.styling.ButtonMetrics.outlined(),
    ) = org.jetbrains.jewel.core.component.styling.ButtonStyle(colors, metrics)
}

val org.jetbrains.jewel.core.component.styling.ButtonColors.Companion.Default: IntUiDefaultButtonColorFactory
    get() = IntUiDefaultButtonColorFactory

object IntUiDefaultButtonColorFactory {

    @Composable
    fun light(
        background: Brush = SolidColor(IntUiLightTheme.colors.blue(4)),
        backgroundDisabled: Brush = SolidColor(IntUiLightTheme.colors.grey(12)),
        backgroundFocused: Brush = SolidColor(IntUiLightTheme.colors.blue(4)),
        backgroundPressed: Brush = SolidColor(IntUiLightTheme.colors.blue(2)),
        backgroundHovered: Brush = SolidColor(IntUiLightTheme.colors.blue(3)),
        content: Color = IntUiLightTheme.colors.grey(14),
        contentDisabled: Color = IntUiLightTheme.colors.grey(8),
        contentFocused: Color = IntUiLightTheme.colors.grey(14),
        contentPressed: Color = IntUiLightTheme.colors.grey(14),
        contentHovered: Color = IntUiLightTheme.colors.grey(14),
        border: Brush = SolidColor(IntUiLightTheme.colors.blue(4)),
        borderDisabled: Brush = SolidColor(IntUiLightTheme.colors.grey(11)),
        borderFocused: Brush = SolidColor(IntUiLightTheme.colors.blue(4)),
        borderPressed: Brush = border,
        borderHovered: Brush = border,
    ) = org.jetbrains.jewel.core.component.styling.ButtonColors(
        background,
        backgroundDisabled,
        backgroundFocused,
        backgroundPressed,
        backgroundHovered,
        content,
        contentDisabled,
        contentFocused,
        contentPressed,
        contentHovered,
        border,
        borderDisabled,
        borderFocused,
        borderPressed,
        borderHovered,
    )

    @Composable
    fun dark(
        background: Brush = SolidColor(IntUiDarkTheme.colors.blue(6)),
        backgroundDisabled: Brush = SolidColor(IntUiDarkTheme.colors.grey(5)),
        backgroundFocused: Brush = SolidColor(IntUiDarkTheme.colors.blue(6)),
        backgroundPressed: Brush = SolidColor(IntUiDarkTheme.colors.blue(4)),
        backgroundHovered: Brush = SolidColor(IntUiDarkTheme.colors.blue(5)),
        content: Color = IntUiDarkTheme.colors.grey(14),
        contentDisabled: Color = IntUiDarkTheme.colors.grey(8),
        contentFocused: Color = IntUiDarkTheme.colors.grey(14),
        contentPressed: Color = IntUiDarkTheme.colors.grey(14),
        contentHovered: Color = IntUiDarkTheme.colors.grey(14),
        border: Brush = SolidColor(IntUiDarkTheme.colors.blue(6)),
        borderDisabled: Brush = SolidColor(IntUiDarkTheme.colors.grey(4)),
        borderFocused: Brush = SolidColor(IntUiDarkTheme.colors.grey(1)),
        borderPressed: Brush = border,
        borderHovered: Brush = border,
    ) = org.jetbrains.jewel.core.component.styling.ButtonColors(
        background,
        backgroundDisabled,
        backgroundFocused,
        backgroundPressed,
        backgroundHovered,
        content,
        contentDisabled,
        contentFocused,
        contentPressed,
        contentHovered,
        border,
        borderDisabled,
        borderFocused,
        borderPressed,
        borderHovered,
    )
}

val org.jetbrains.jewel.core.component.styling.ButtonColors.Companion.Outlined: IntUiOutlinedButtonColorFactory
    get() = IntUiOutlinedButtonColorFactory

object IntUiOutlinedButtonColorFactory {

    @Composable
    fun light(
        background: Brush = SolidColor(Color.Transparent),
        backgroundDisabled: Brush = SolidColor(IntUiLightTheme.colors.grey(12)),
        backgroundFocused: Brush = SolidColor(Color.Transparent),
        backgroundPressed: Brush = SolidColor(IntUiLightTheme.colors.grey(13)),
        backgroundHovered: Brush = SolidColor(Color.Transparent),
        content: Color = IntUiLightTheme.colors.grey(1),
        contentDisabled: Color = IntUiLightTheme.colors.grey(8),
        contentFocused: Color = IntUiLightTheme.colors.grey(1),
        contentPressed: Color = IntUiLightTheme.colors.grey(1),
        contentHovered: Color = IntUiLightTheme.colors.grey(1),
        border: Brush = SolidColor(IntUiLightTheme.colors.grey(9)),
        borderDisabled: Brush = SolidColor(IntUiLightTheme.colors.blue(11)),
        borderFocused: Brush = SolidColor(IntUiLightTheme.colors.blue(4)),
        borderPressed: Brush = SolidColor(IntUiLightTheme.colors.grey(7)),
        borderHovered: Brush = SolidColor(IntUiLightTheme.colors.grey(8)),
    ) = org.jetbrains.jewel.core.component.styling.ButtonColors(
        background,
        backgroundDisabled,
        backgroundFocused,
        backgroundPressed,
        backgroundHovered,
        content,
        contentDisabled,
        contentFocused,
        contentPressed,
        contentHovered,
        border,
        borderDisabled,
        borderFocused,
        borderPressed,
        borderHovered,
    )

    @Composable
    fun dark(
        background: Brush = SolidColor(Color.Transparent),
        backgroundDisabled: Brush = SolidColor(IntUiDarkTheme.colors.grey(5)),
        backgroundFocused: Brush = SolidColor(IntUiDarkTheme.colors.grey(6)),
        backgroundPressed: Brush = SolidColor(IntUiDarkTheme.colors.grey(2)),
        backgroundHovered: Brush = SolidColor(Color.Unspecified),
        content: Color = IntUiDarkTheme.colors.grey(12),
        contentDisabled: Color = IntUiDarkTheme.colors.grey(8),
        contentFocused: Color = IntUiDarkTheme.colors.grey(12),
        contentPressed: Color = IntUiDarkTheme.colors.grey(12),
        contentHovered: Color = IntUiDarkTheme.colors.grey(12),
        border: Brush = SolidColor(IntUiDarkTheme.colors.grey(5)),
        borderDisabled: Brush = SolidColor(IntUiDarkTheme.colors.blue(4)),
        borderFocused: Brush = SolidColor(IntUiDarkTheme.colors.grey(2)),
        borderPressed: Brush = SolidColor(IntUiDarkTheme.colors.grey(7)),
        borderHovered: Brush = SolidColor(IntUiDarkTheme.colors.grey(7)),
    ) = org.jetbrains.jewel.core.component.styling.ButtonColors(
        background,
        backgroundDisabled,
        backgroundFocused,
        backgroundPressed,
        backgroundHovered,
        content,
        contentDisabled,
        contentFocused,
        contentPressed,
        contentHovered,
        border,
        borderDisabled,
        borderFocused,
        borderPressed,
        borderHovered,
    )
}

fun org.jetbrains.jewel.core.component.styling.ButtonMetrics.Companion.default(
    cornerSize: CornerSize = CornerSize(4.dp),
    padding: PaddingValues = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
    minSize: DpSize = DpSize(72.dp, 28.dp),
    borderWidth: Dp = 0.dp,
) = org.jetbrains.jewel.core.component.styling.ButtonMetrics(cornerSize, padding, minSize, borderWidth)

fun org.jetbrains.jewel.core.component.styling.ButtonMetrics.Companion.outlined(
    cornerSize: CornerSize = CornerSize(4.dp),
    padding: PaddingValues = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
    minSize: DpSize = DpSize(72.dp, 28.dp),
    borderWidth: Dp = 1.dp,
) = org.jetbrains.jewel.core.component.styling.ButtonMetrics(cornerSize, padding, minSize, borderWidth)
