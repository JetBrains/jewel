package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.ui.component.styling.ComboBoxColors
import org.jetbrains.jewel.ui.component.styling.ComboBoxIcons
import org.jetbrains.jewel.ui.component.styling.ComboBoxMetrics
import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle
import org.jetbrains.jewel.ui.component.styling.MenuStyle
import org.jetbrains.jewel.ui.icon.IconKey
import org.jetbrains.jewel.ui.icons.AllIconsKeys

public val ComboBoxStyle.Companion.Default: IntUiDefaultComboBoxStyleFactory
    get() = IntUiDefaultComboBoxStyleFactory

public object IntUiDefaultComboBoxStyleFactory {
    @Composable
    public fun light(
        colors: ComboBoxColors = ComboBoxColors.Default.light(),
        metrics: ComboBoxMetrics = ComboBoxMetrics.default(),
        icons: ComboBoxIcons = ComboBoxIcons.defaults(),
        menuStyle: MenuStyle = MenuStyle.light(),
    ): ComboBoxStyle = ComboBoxStyle(colors, metrics, icons, menuStyle)

    @Composable
    public fun dark(
        colors: ComboBoxColors = ComboBoxColors.Default.dark(),
        metrics: ComboBoxMetrics = ComboBoxMetrics.default(),
        icons: ComboBoxIcons = ComboBoxIcons.defaults(),
        menuStyle: MenuStyle = MenuStyle.dark(),
    ): ComboBoxStyle = ComboBoxStyle(colors, metrics, icons, menuStyle)
}

public val ComboBoxStyle.Companion.Undecorated: IntUiUndecoratedComboBoxStyleFactory
    get() = IntUiUndecoratedComboBoxStyleFactory

public object IntUiUndecoratedComboBoxStyleFactory {
    @Composable
    public fun light(
        colors: ComboBoxColors = ComboBoxColors.Undecorated.light(),
        metrics: ComboBoxMetrics = ComboBoxMetrics.undecorated(),
        icons: ComboBoxIcons = ComboBoxIcons.defaults(),
        menuStyle: MenuStyle = MenuStyle.light(),
    ): ComboBoxStyle = ComboBoxStyle(colors, metrics, icons, menuStyle)

    @Composable
    public fun dark(
        colors: ComboBoxColors = ComboBoxColors.Undecorated.dark(),
        metrics: ComboBoxMetrics = ComboBoxMetrics.undecorated(),
        icons: ComboBoxIcons = ComboBoxIcons.defaults(),
        menuStyle: MenuStyle = MenuStyle.dark(),
    ): ComboBoxStyle = ComboBoxStyle(colors, metrics, icons, menuStyle)
}

public val ComboBoxColors.Companion.Default: IntUiDefaultComboBoxColorsFactory
    get() = IntUiDefaultComboBoxColorsFactory

public object IntUiDefaultComboBoxColorsFactory {
    @Composable
    public fun light(
        background: Color = IntUiLightTheme.colors.gray(14),
        backgroundDisabled: Color = IntUiLightTheme.colors.gray(13),
        backgroundFocused: Color = background,
        backgroundPressed: Color = background,
        backgroundHovered: Color = background,
        nonEditableBackground: Color = White,
        content: Color = IntUiLightTheme.colors.gray(1),
        contentDisabled: Color = IntUiLightTheme.colors.gray(8),
        contentFocused: Color = content,
        contentPressed: Color = content,
        contentHovered: Color = content,
        border: Color = IntUiLightTheme.colors.gray(9),
        borderDisabled: Color = IntUiLightTheme.colors.gray(11),
        borderFocused: Color = IntUiLightTheme.colors.blue(4),
        borderPressed: Color = border,
        borderHovered: Color = border,
        iconTint: Color = Color.Unspecified,
        iconTintDisabled: Color = iconTint,
        iconTintFocused: Color = iconTint,
        iconTintPressed: Color = iconTint,
        iconTintHovered: Color = iconTint,
    ): ComboBoxColors =
        ComboBoxColors(
            background = background,
            backgroundDisabled = backgroundDisabled,
            backgroundFocused = backgroundFocused,
            backgroundPressed = backgroundPressed,
            backgroundHovered = backgroundHovered,
            nonEditableBackground = nonEditableBackground,
            content = content,
            contentDisabled = contentDisabled,
            contentFocused = contentFocused,
            contentPressed = contentPressed,
            contentHovered = contentHovered,
            border = border,
            borderDisabled = borderDisabled,
            borderFocused = borderFocused,
            borderPressed = borderPressed,
            borderHovered = borderHovered,
            iconTint = iconTint,
            iconTintDisabled = iconTintDisabled,
            iconTintFocused = iconTintFocused,
            iconTintPressed = iconTintPressed,
            iconTintHovered = iconTintHovered,
        )

    @Composable
    public fun dark(
        background: Color = IntUiDarkTheme.colors.gray(2),
        backgroundDisabled: Color = background,
        backgroundFocused: Color = background,
        backgroundPressed: Color = background,
        backgroundHovered: Color = background,
        nonEditableBackground: Color = IntUiDarkTheme.colors.gray(3),
        content: Color = IntUiDarkTheme.colors.gray(12),
        contentDisabled: Color = IntUiDarkTheme.colors.gray(7),
        contentFocused: Color = content,
        contentPressed: Color = content,
        contentHovered: Color = content,
        border: Color = IntUiDarkTheme.colors.gray(5),
        borderDisabled: Color = IntUiDarkTheme.colors.gray(5),
        borderFocused: Color = IntUiDarkTheme.colors.blue(6),
        borderPressed: Color = border,
        borderHovered: Color = border,
        iconTint: Color = IntUiDarkTheme.colors.gray(10),
        iconTintDisabled: Color = IntUiDarkTheme.colors.gray(6),
        iconTintFocused: Color = iconTint,
        iconTintPressed: Color = iconTint,
        iconTintHovered: Color = iconTint,
    ): ComboBoxColors =
        ComboBoxColors(
            background = background,
            backgroundDisabled = backgroundDisabled,
            backgroundFocused = backgroundFocused,
            backgroundPressed = backgroundPressed,
            backgroundHovered = backgroundHovered,
            nonEditableBackground = nonEditableBackground,
            content = content,
            contentDisabled = contentDisabled,
            contentFocused = contentFocused,
            contentPressed = contentPressed,
            contentHovered = contentHovered,
            border = border,
            borderDisabled = borderDisabled,
            borderFocused = borderFocused,
            borderPressed = borderPressed,
            borderHovered = borderHovered,
            iconTint = iconTint,
            iconTintDisabled = iconTintDisabled,
            iconTintFocused = iconTintFocused,
            iconTintPressed = iconTintPressed,
            iconTintHovered = iconTintHovered,
        )
}

public val ComboBoxColors.Companion.Undecorated: IntUiUndecoratedComboBoxColorsFactory
    get() = IntUiUndecoratedComboBoxColorsFactory

public object IntUiUndecoratedComboBoxColorsFactory {
    @Composable
    public fun light(
        background: Color = Color.Transparent,
        backgroundDisabled: Color = background,
        backgroundFocused: Color = background,
        backgroundPressed: Color = IntUiLightTheme.colors.gray(14).copy(alpha = 0.1f),
        backgroundHovered: Color = backgroundPressed,
        nonEditableBackground: Color = White,
        content: Color = IntUiLightTheme.colors.gray(1),
        contentDisabled: Color = IntUiLightTheme.colors.gray(8),
        contentFocused: Color = content,
        contentPressed: Color = content,
        contentHovered: Color = content,
        iconTint: Color = IntUiLightTheme.colors.gray(7),
        iconTintDisabled: Color = IntUiLightTheme.colors.gray(9),
        iconTintFocused: Color = iconTint,
        iconTintPressed: Color = iconTint,
        iconTintHovered: Color = iconTint,
    ): ComboBoxColors =
        ComboBoxColors(
            background = background,
            backgroundDisabled = backgroundDisabled,
            backgroundFocused = backgroundFocused,
            backgroundPressed = backgroundPressed,
            backgroundHovered = backgroundHovered,
            nonEditableBackground = nonEditableBackground,
            content = content,
            contentDisabled = contentDisabled,
            contentFocused = contentFocused,
            contentPressed = contentPressed,
            contentHovered = contentHovered,
            border = Color.Transparent,
            borderDisabled = Color.Transparent,
            borderFocused = Color.Transparent,
            borderPressed = Color.Transparent,
            borderHovered = Color.Transparent,
            iconTint = iconTint,
            iconTintDisabled = iconTintDisabled,
            iconTintFocused = iconTintFocused,
            iconTintPressed = iconTintPressed,
            iconTintHovered = iconTintHovered,
        )

    @Composable
    public fun dark(
        background: Color = Color.Transparent,
        backgroundDisabled: Color = background,
        backgroundFocused: Color = background,
        backgroundPressed: Color = Color(0x0D000000), // Not a palette color
        backgroundHovered: Color = backgroundPressed,
        nonEditableBackground: Color = IntUiDarkTheme.colors.gray(3),
        content: Color = IntUiDarkTheme.colors.gray(12),
        contentDisabled: Color = IntUiDarkTheme.colors.gray(7),
        contentFocused: Color = content,
        contentPressed: Color = content,
        contentHovered: Color = content,
        iconTint: Color = IntUiDarkTheme.colors.gray(10),
        iconTintDisabled: Color = IntUiDarkTheme.colors.gray(6),
        iconTintFocused: Color = iconTint,
        iconTintPressed: Color = iconTint,
        iconTintHovered: Color = iconTint,
    ): ComboBoxColors =
        ComboBoxColors(
            background = background,
            backgroundDisabled = backgroundDisabled,
            backgroundFocused = backgroundFocused,
            backgroundPressed = backgroundPressed,
            backgroundHovered = backgroundHovered,
            nonEditableBackground = nonEditableBackground,
            content = content,
            contentDisabled = contentDisabled,
            contentFocused = contentFocused,
            contentPressed = contentPressed,
            contentHovered = contentHovered,
            border = Color.Transparent,
            borderDisabled = Color.Transparent,
            borderFocused = Color.Transparent,
            borderPressed = Color.Transparent,
            borderHovered = Color.Transparent,
            iconTint = iconTint,
            iconTintDisabled = iconTintDisabled,
            iconTintFocused = iconTintFocused,
            iconTintPressed = iconTintPressed,
            iconTintHovered = iconTintHovered,
        )
}

public fun ComboBoxMetrics.Companion.default(
    arrowMinSize: DpSize = DpSize(21.dp, 22.dp),
    minSize: DpSize = DpSize((49 + 23 + 6).dp, 24.dp),
    cornerSize: CornerSize = CornerSize(4.dp),
    contentPadding: PaddingValues = PaddingValues(horizontal = 6.dp, vertical = 2.dp),
    borderWidth: Dp = 1.dp,
): ComboBoxMetrics = ComboBoxMetrics(arrowMinSize, minSize, cornerSize, contentPadding, borderWidth)

public fun ComboBoxMetrics.Companion.undecorated(
    arrowMinSize: DpSize = DpSize(21.dp, 22.dp),
    minSize: DpSize = DpSize((49 + 23 + 6).dp, 24.dp),
    cornerSize: CornerSize = CornerSize(4.dp),
    contentPadding: PaddingValues = PaddingValues(horizontal = 6.dp, vertical = 2.dp),
    borderWidth: Dp = 0.dp,
): ComboBoxMetrics = ComboBoxMetrics(arrowMinSize, minSize, cornerSize, contentPadding, borderWidth)

public fun ComboBoxIcons.Companion.defaults(chevronDown: IconKey = AllIconsKeys.General.ChevronDown): ComboBoxIcons =
    ComboBoxIcons(chevronDown)
