package org.jetbrains.jewel.themes.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.jewel.styling.LabelledTextFieldColors
import org.jetbrains.jewel.styling.LabelledTextFieldMetrics
import org.jetbrains.jewel.styling.LabelledTextFieldStyle
import org.jetbrains.jewel.styling.LabelledTextFieldTextStyles
import org.jetbrains.jewel.themes.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.themes.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.themes.intui.standalone.IntUiTheme

@Stable
data class IntUiLabelledTextFieldStyle(
    override val colors: IntUiLabelledTextFieldColors,
    override val metrics: IntUiLabelledTextFieldMetrics,
    override val textStyle: TextStyle,
    override val textStyles: IntUiLabelledTextFieldTextStyles,
) : LabelledTextFieldStyle {

    companion object {

        @Composable
        fun light(
            colors: IntUiLabelledTextFieldColors = IntUiLabelledTextFieldColors.light(),
            metrics: IntUiLabelledTextFieldMetrics = IntUiLabelledTextFieldMetrics(),
            textStyle: TextStyle = IntUiTheme.defaultLightTextStyle,
            textStyles: IntUiLabelledTextFieldTextStyles = IntUiLabelledTextFieldTextStyles.light(),
        ) = IntUiLabelledTextFieldStyle(colors, metrics, textStyle, textStyles)

        @Composable
        fun dark(
            colors: IntUiLabelledTextFieldColors = IntUiLabelledTextFieldColors.dark(),
            metrics: IntUiLabelledTextFieldMetrics = IntUiLabelledTextFieldMetrics(),
            textStyle: TextStyle = IntUiTheme.defaultDarkTextStyle,
            textStyles: IntUiLabelledTextFieldTextStyles = IntUiLabelledTextFieldTextStyles.dark(),
        ) = IntUiLabelledTextFieldStyle(colors, metrics, textStyle, textStyles)
    }
}

@Immutable
data class IntUiLabelledTextFieldColors(
    override val background: Color,
    override val backgroundDisabled: Color,
    override val backgroundFocused: Color,
    override val backgroundPressed: Color,
    override val backgroundHovered: Color,
    override val backgroundWarning: Color,
    override val backgroundError: Color,
    override val content: Color,
    override val contentDisabled: Color,
    override val contentFocused: Color,
    override val contentPressed: Color,
    override val contentHovered: Color,
    override val contentWarning: Color,
    override val contentError: Color,
    override val border: Color,
    override val borderDisabled: Color,
    override val borderFocused: Color,
    override val borderPressed: Color,
    override val borderHovered: Color,
    override val borderWarning: Color,
    override val borderError: Color,
    override val cursor: Brush,
    override val cursorDisabled: Brush,
    override val cursorFocused: Brush,
    override val cursorPressed: Brush,
    override val cursorHovered: Brush,
    override val cursorWarning: Brush,
    override val cursorError: Brush,
    override val placeholder: Color,
    override val label: Color,
    override val hint: Color,
) : LabelledTextFieldColors {

    companion object {

        @Composable
        fun light(
            background: Color = IntUiLightTheme.colors.grey(14),
            backgroundDisabled: Color = IntUiLightTheme.colors.grey(13),
            backgroundFocused: Color = background,
            backgroundPressed: Color = background,
            backgroundHovered: Color = background,
            backgroundWarning: Color = background,
            backgroundError: Color = background,
            content: Color = IntUiLightTheme.colors.grey(1),
            contentDisabled: Color = IntUiLightTheme.colors.grey(8),
            contentFocused: Color = content,
            contentPressed: Color = content,
            contentHovered: Color = content,
            contentWarning: Color = content,
            contentError: Color = content,
            border: Color = IntUiLightTheme.colors.grey(9),
            borderDisabled: Color = IntUiLightTheme.colors.grey(11),
            borderFocused: Color = IntUiLightTheme.colors.blue(4),
            borderPressed: Color = border,
            borderHovered: Color = border,
            borderWarning: Color = IntUiLightTheme.colors.yellow(4),
            borderError: Color = IntUiLightTheme.colors.red(4),
            cursor: Brush = SolidColor(IntUiLightTheme.colors.grey(1)),
            cursorDisabled: Brush = cursor,
            cursorFocused: Brush = cursor,
            cursorPressed: Brush = cursor,
            cursorHovered: Brush = cursor,
            cursorWarning: Brush = cursor,
            cursorError: Brush = cursor,
            placeholder: Color = IntUiLightTheme.colors.grey(8),
            label: Color = IntUiLightTheme.colors.grey(1),
            hint: Color = IntUiLightTheme.colors.grey(6),
        ) = IntUiLabelledTextFieldColors(
            background,
            backgroundDisabled,
            backgroundFocused,
            backgroundPressed,
            backgroundHovered,
            backgroundWarning,
            backgroundError,
            content,
            contentDisabled,
            contentFocused,
            contentPressed,
            contentHovered,
            contentWarning,
            contentError,
            border,
            borderDisabled,
            borderFocused,
            borderPressed,
            borderHovered,
            borderWarning,
            borderError,
            cursor,
            cursorDisabled,
            cursorFocused,
            cursorPressed,
            cursorHovered,
            cursorWarning,
            cursorError,
            placeholder,
            label,
            hint,
        )

        @Composable
        fun dark(
            background: Color = IntUiDarkTheme.colors.grey(2),
            backgroundDisabled: Color = background,
            backgroundFocused: Color = background,
            backgroundPressed: Color = background,
            backgroundHovered: Color = background,
            backgroundWarning: Color = background,
            backgroundError: Color = background,
            content: Color = IntUiDarkTheme.colors.grey(12),
            contentDisabled: Color = IntUiDarkTheme.colors.grey(7),
            contentFocused: Color = content,
            contentPressed: Color = content,
            contentHovered: Color = content,
            contentWarning: Color = content,
            contentError: Color = content,
            border: Color = IntUiDarkTheme.colors.grey(5),
            borderDisabled: Color = border,
            borderFocused: Color = IntUiDarkTheme.colors.blue(6),
            borderPressed: Color = border,
            borderHovered: Color = border,
            borderWarning: Color = IntUiDarkTheme.colors.yellow(4),
            borderError: Color = IntUiDarkTheme.colors.red(4),
            cursor: Brush = SolidColor(IntUiDarkTheme.colors.grey(12)),
            cursorDisabled: Brush = cursor,
            cursorFocused: Brush = cursor,
            cursorPressed: Brush = cursor,
            cursorHovered: Brush = cursor,
            cursorWarning: Brush = cursor,
            cursorError: Brush = cursor,
            placeholder: Color = IntUiDarkTheme.colors.grey(7),
            label: Color = IntUiDarkTheme.colors.grey(12),
            hint: Color = IntUiDarkTheme.colors.grey(7),
        ) = IntUiLabelledTextFieldColors(
            background,
            backgroundDisabled,
            backgroundFocused,
            backgroundPressed,
            backgroundHovered,
            backgroundWarning,
            backgroundError,
            content,
            contentDisabled,
            contentFocused,
            contentPressed,
            contentHovered,
            contentWarning,
            contentError,
            border,
            borderDisabled,
            borderFocused,
            borderPressed,
            borderHovered,
            borderWarning,
            borderError,
            cursor,
            cursorDisabled,
            cursorFocused,
            cursorPressed,
            cursorHovered,
            cursorWarning,
            cursorError,
            placeholder,
            label,
            hint,
        )
    }
}

@Stable
data class IntUiLabelledTextFieldMetrics(
    override val cornerSize: CornerSize = CornerSize(4.dp),
    override val contentPadding: PaddingValues = PaddingValues(horizontal = 6.dp, vertical = 9.dp),
    override val minSize: DpSize = DpSize(144.dp, 28.dp),
    override val borderWidth: Dp = 1.dp,
    override val labelSpacing: Dp = 6.dp,
    override val hintSpacing: Dp = 6.dp,
) : LabelledTextFieldMetrics

@Immutable
data class IntUiLabelledTextFieldTextStyles(
    override val label: TextStyle,
    override val hint: TextStyle,
) : LabelledTextFieldTextStyles {

    companion object {

        @Composable
        fun light(
            label: TextStyle = IntUiTheme.defaultLightTextStyle,
            hint: TextStyle = IntUiTheme.defaultLightTextStyle.copy(
                fontSize = 12.sp,
                lineHeight = 16.sp,
            ),
        ) = IntUiLabelledTextFieldTextStyles(label, hint)

        @Composable
        fun dark(
            label: TextStyle = IntUiTheme.defaultDarkTextStyle,
            hint: TextStyle = IntUiTheme.defaultDarkTextStyle.copy(
                fontSize = 12.sp,
                lineHeight = 16.sp,
            ),
        ) = IntUiLabelledTextFieldTextStyles(label, hint)
    }
}
