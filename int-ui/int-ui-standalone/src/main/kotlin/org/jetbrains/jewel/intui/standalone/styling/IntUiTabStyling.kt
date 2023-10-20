package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.intui.standalone.standalonePainterProvider
import org.jetbrains.jewel.painter.PainterProvider
import org.jetbrains.jewel.styling.TabColors
import org.jetbrains.jewel.styling.TabContentAlpha
import org.jetbrains.jewel.styling.TabIcons
import org.jetbrains.jewel.styling.TabMetrics
import org.jetbrains.jewel.styling.TabStyle

val TabStyle.Companion.Default
    get() = IntUiDefaultTabStyleFactory

object IntUiDefaultTabStyleFactory {

    @Composable
    fun light(
        colors: TabColors = TabColors.Default.light(),
        metrics: TabMetrics = TabMetrics.defaults(),
        icons: TabIcons = TabIcons.defaults(),
        contentAlpha: TabContentAlpha = TabContentAlpha.default(),
    ) = TabStyle(colors, metrics, icons, contentAlpha)

    @Composable
    fun dark(
        colors: TabColors = TabColors.Default.dark(),
        metrics: TabMetrics = TabMetrics.defaults(),
        icons: TabIcons = TabIcons.defaults(),
        contentAlpha: TabContentAlpha = TabContentAlpha.default(),
    ) = TabStyle(colors, metrics, icons, contentAlpha)
}

val TabStyle.Companion.Editor
    get() = IntUiEditorTabStyleFactory

object IntUiEditorTabStyleFactory {

    @Composable
    fun light(
        colors: TabColors = TabColors.Editor.light(),
        metrics: TabMetrics = TabMetrics.defaults(),
        icons: TabIcons = TabIcons.defaults(),
        contentAlpha: TabContentAlpha = TabContentAlpha.editor(),
    ) = TabStyle(colors, metrics, icons, contentAlpha)

    @Composable
    fun dark(
        colors: TabColors = TabColors.Editor.dark(),
        metrics: TabMetrics = TabMetrics.defaults(),
        icons: TabIcons = TabIcons.defaults(),
        contentAlpha: TabContentAlpha = TabContentAlpha.editor(),
    ) = TabStyle(colors, metrics, icons, contentAlpha)
}

val TabColors.Companion.Default
    get() = IntUiDefaultTabColorsFactory

object IntUiDefaultTabColorsFactory {

    fun light(
        background: Color = IntUiLightTheme.colors.grey(14),
        backgroundFocused: Color = background,
        backgroundHovered: Color = IntUiLightTheme.colors.grey(12),
        backgroundPressed: Color = backgroundHovered,
        backgroundSelected: Color = background,
        backgroundDisabled: Color = background,
        content: Color = IntUiLightTheme.colors.grey(1),
        contentHovered: Color = content,
        contentDisabled: Color = content,
        contentPressed: Color = content,
        contentFocused: Color = content,
        contentSelected: Color = content,
        underline: Color = Color.Unspecified,
        underlineHovered: Color = underline,
        underlineDisabled: Color = underline,
        underlinePressed: Color = underline,
        underlineFocused: Color = underline,
        underlineSelected: Color = IntUiLightTheme.colors.blue(4),
    ) = TabColors(
        background,
        backgroundDisabled,
        backgroundFocused,
        backgroundPressed,
        backgroundHovered,
        backgroundSelected,
        content,
        contentDisabled,
        contentFocused,
        contentPressed,
        contentHovered,
        contentSelected,
        underline,
        underlineDisabled,
        underlineFocused,
        underlinePressed,
        underlineHovered,
        underlineSelected,
    )

    fun dark(
        background: Color = Color.Unspecified,
        backgroundFocused: Color = background,
        backgroundHovered: Color = IntUiDarkTheme.colors.grey(4),
        backgroundPressed: Color = backgroundHovered,
        backgroundSelected: Color = background,
        backgroundDisabled: Color = background,
        content: Color = Color.Unspecified,
        contentHovered: Color = content,
        contentDisabled: Color = content,
        contentPressed: Color = content,
        contentFocused: Color = content,
        contentSelected: Color = content,
        underline: Color = Color.Unspecified,
        underlineHovered: Color = underline,
        underlineDisabled: Color = underline,
        underlinePressed: Color = underline,
        underlineFocused: Color = underline,
        underlineSelected: Color = IntUiDarkTheme.colors.blue(6),
    ) = TabColors(
        background,
        backgroundDisabled,
        backgroundFocused,
        backgroundPressed,
        backgroundHovered,
        backgroundSelected,
        content,
        contentDisabled,
        contentFocused,
        contentPressed,
        contentHovered,
        contentSelected,
        underline,
        underlineDisabled,
        underlineFocused,
        underlinePressed,
        underlineHovered,
        underlineSelected,
    )
}

val TabColors.Companion.Editor
    get() = IntUiEditorTabColorsFactory

object IntUiEditorTabColorsFactory {

    fun light(
        background: Color = Color.Transparent,
        backgroundFocused: Color = background,
        backgroundHovered: Color = background,
        backgroundPressed: Color = background,
        backgroundSelected: Color = background,
        backgroundDisabled: Color = background,
        content: Color = Color.Unspecified,
        contentHovered: Color = content,
        contentDisabled: Color = content,
        contentPressed: Color = content,
        contentFocused: Color = content,
        contentSelected: Color = content,
        underline: Color = Color.Unspecified,
        underlineHovered: Color = underline,
        underlineDisabled: Color = underline,
        underlinePressed: Color = underline,
        underlineFocused: Color = underline,
        underlineSelected: Color = IntUiLightTheme.colors.blue(4),
    ) = TabColors(
        background,
        backgroundDisabled,
        backgroundFocused,
        backgroundPressed,
        backgroundHovered,
        backgroundSelected,
        content,
        contentDisabled,
        contentFocused,
        contentPressed,
        contentHovered,
        contentSelected,
        underline,
        underlineDisabled,
        underlineFocused,
        underlinePressed,
        underlineHovered,
        underlineSelected,
    )

    fun dark(
        background: Color = Color.Unspecified,
        backgroundFocused: Color = background,
        backgroundHovered: Color = background,
        backgroundPressed: Color = background,
        backgroundSelected: Color = background,
        backgroundDisabled: Color = background,

        content: Color = Color.Unspecified,
        contentHovered: Color = content,
        contentDisabled: Color = content,
        contentPressed: Color = content,
        contentFocused: Color = content,
        contentSelected: Color = content,

        underline: Color = Color.Unspecified,
        underlineHovered: Color = underline,
        underlineDisabled: Color = underline,
        underlinePressed: Color = underline,
        underlineFocused: Color = underline,
        underlineSelected: Color = IntUiDarkTheme.colors.blue(6),
    ) = TabColors(
        background,
        backgroundDisabled,
        backgroundFocused,
        backgroundPressed,
        backgroundHovered,
        backgroundSelected,
        content,
        contentDisabled,
        contentFocused,
        contentPressed,
        contentHovered,
        contentSelected,
        underline,
        underlineDisabled,
        underlineFocused,
        underlinePressed,
        underlineHovered,
        underlineSelected,
    )
}

fun TabMetrics.Companion.defaults(
    underlineThickness: Dp = 3.dp,
    tabPadding: PaddingValues = PaddingValues(horizontal = 8.dp),
    closeContentGap: Dp = 8.dp,
    tabHeight: Dp = 40.dp,
) = TabMetrics(underlineThickness, tabPadding, tabHeight, closeContentGap)

fun TabContentAlpha.Companion.default(
    iconNormal: Float = 1f,
    iconDisabled: Float = iconNormal,
    iconFocused: Float = iconNormal,
    iconPressed: Float = iconNormal,
    iconHovered: Float = iconNormal,
    iconSelected: Float = iconNormal,
    labelNormal: Float = iconNormal,
    labelDisabled: Float = iconNormal,
    labelFocused: Float = iconNormal,
    labelPressed: Float = iconNormal,
    labelHovered: Float = iconNormal,
    labelSelected: Float = iconNormal,
) = TabContentAlpha(
    iconNormal,
    iconDisabled,
    iconFocused,
    iconPressed,
    iconHovered,
    iconSelected,
    labelNormal,
    labelDisabled,
    labelFocused,
    labelPressed,
    labelHovered,
    labelSelected,
)

fun TabContentAlpha.Companion.editor(
    iconNormal: Float = .7f,
    iconDisabled: Float = iconNormal,
    iconFocused: Float = iconNormal,
    iconPressed: Float = 1f,
    iconHovered: Float = iconPressed,
    iconSelected: Float = iconPressed,
    labelNormal: Float = .9f,
    labelDisabled: Float = labelNormal,
    labelFocused: Float = labelNormal,
    labelPressed: Float = 1f,
    labelHovered: Float = labelPressed,
    labelSelected: Float = labelPressed,
) =
    TabContentAlpha(
        iconNormal,
        iconDisabled,
        iconFocused,
        iconPressed,
        iconHovered,
        iconSelected,
        labelNormal,
        labelDisabled,
        labelFocused,
        labelPressed,
        labelHovered,
        labelSelected,
    )

fun TabIcons.Companion.defaults(
    close: PainterProvider = standalonePainterProvider("expui/general/closeSmall.svg"),
) = TabIcons(close)
