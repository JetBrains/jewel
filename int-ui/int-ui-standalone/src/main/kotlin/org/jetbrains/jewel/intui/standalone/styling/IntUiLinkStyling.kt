package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.intui.standalone.standalonePainterProvider
import org.jetbrains.jewel.intui.standalone.theme.defaultTextStyle
import org.jetbrains.jewel.ui.component.styling.LinkColors
import org.jetbrains.jewel.ui.component.styling.LinkIcons
import org.jetbrains.jewel.ui.component.styling.LinkMetrics
import org.jetbrains.jewel.ui.component.styling.LinkStyle
import org.jetbrains.jewel.ui.component.styling.LinkTextStyles
import org.jetbrains.jewel.ui.painter.PainterProvider

@Composable
fun LinkStyle.Companion.light(
    colors: LinkColors = LinkColors.light(),
    metrics: LinkMetrics = LinkMetrics.defaults(),
    icons: LinkIcons = LinkIcons.defaults(),
    textStyles: LinkTextStyles = LinkTextStyles.light(),
) = LinkStyle(colors, metrics, icons, textStyles)

@Composable
fun LinkStyle.Companion.dark(
    colors: LinkColors = LinkColors.dark(),
    metrics: LinkMetrics = LinkMetrics.defaults(),
    icons: LinkIcons = LinkIcons.defaults(),
    textStyles: LinkTextStyles = LinkTextStyles.dark(),
) = LinkStyle(colors, metrics, icons, textStyles)

@Composable
fun LinkColors.Companion.light(
    content: Color = IntUiLightTheme.colors.blue(2),
    contentDisabled: Color = IntUiLightTheme.colors.grey(8),
    contentFocused: Color = content,
    contentPressed: Color = content,
    contentHovered: Color = content,
    contentVisited: Color = content,
) = LinkColors(
    content,
    contentDisabled,
    contentFocused,
    contentPressed,
    contentHovered,
    contentVisited,
)

@Composable
fun LinkColors.Companion.dark(
    content: Color = IntUiDarkTheme.colors.blue(9),
    contentDisabled: Color = IntUiDarkTheme.colors.grey(7),
    contentFocused: Color = content,
    contentPressed: Color = content,
    contentHovered: Color = content,
    contentVisited: Color = content,
) = LinkColors(
    content,
    contentDisabled,
    contentFocused,
    contentPressed,
    contentHovered,
    contentVisited,
)

fun LinkMetrics.Companion.defaults(
    focusHaloCornerSize: CornerSize = CornerSize(2.dp),
    textIconGap: Dp = 0.dp,
    iconSize: DpSize = DpSize(16.dp, 16.dp),
) = LinkMetrics(focusHaloCornerSize, textIconGap, iconSize)

fun LinkIcons.Companion.defaults(
    dropdownChevron: PainterProvider = standalonePainterProvider("expui/general/chevronDown.svg"),
    externalLink: PainterProvider = standalonePainterProvider("expui/ide/externalLink.svg"),
) = LinkIcons(dropdownChevron, externalLink)

@Composable
fun LinkTextStyles.Companion.light(
    normal: TextStyle = JewelTheme.defaultTextStyle.copy(textDecoration = TextDecoration.Underline),
    disabled: TextStyle = JewelTheme.defaultTextStyle,
    focused: TextStyle = normal,
    pressed: TextStyle = normal,
    hovered: TextStyle = normal,
    visited: TextStyle = normal,
): LinkTextStyles =
    LinkTextStyles(normal, disabled, focused, pressed, hovered, visited)

@Composable
fun LinkTextStyles.Companion.dark(
    normal: TextStyle = JewelTheme.defaultTextStyle.copy(textDecoration = TextDecoration.Underline),
    disabled: TextStyle = JewelTheme.defaultTextStyle,
    focused: TextStyle = normal,
    pressed: TextStyle = normal,
    hovered: TextStyle = normal,
    visited: TextStyle = normal,
): LinkTextStyles =
    LinkTextStyles(normal, disabled, focused, pressed, hovered, visited)
