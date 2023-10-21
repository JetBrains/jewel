package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.JewelTheme
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.intui.standalone.defaultTextStyle
import org.jetbrains.jewel.intui.standalone.standalonePainterProvider
import org.jetbrains.jewel.painter.PainterProvider

@Composable
fun org.jetbrains.jewel.core.component.styling.LinkStyle.Companion.light(
    colors: org.jetbrains.jewel.core.component.styling.LinkColors = org.jetbrains.jewel.core.component.styling.LinkColors.light(),
    metrics: org.jetbrains.jewel.core.component.styling.LinkMetrics = org.jetbrains.jewel.core.component.styling.LinkMetrics.defaults(),
    icons: org.jetbrains.jewel.core.component.styling.LinkIcons = org.jetbrains.jewel.core.component.styling.LinkIcons.defaults(),
    textStyles: org.jetbrains.jewel.core.component.styling.LinkTextStyles = org.jetbrains.jewel.core.component.styling.LinkTextStyles.light(),
) = org.jetbrains.jewel.core.component.styling.LinkStyle(colors, metrics, icons, textStyles)

@Composable
fun org.jetbrains.jewel.core.component.styling.LinkStyle.Companion.dark(
    colors: org.jetbrains.jewel.core.component.styling.LinkColors = org.jetbrains.jewel.core.component.styling.LinkColors.dark(),
    metrics: org.jetbrains.jewel.core.component.styling.LinkMetrics = org.jetbrains.jewel.core.component.styling.LinkMetrics.defaults(),
    icons: org.jetbrains.jewel.core.component.styling.LinkIcons = org.jetbrains.jewel.core.component.styling.LinkIcons.defaults(),
    textStyles: org.jetbrains.jewel.core.component.styling.LinkTextStyles = org.jetbrains.jewel.core.component.styling.LinkTextStyles.dark(),
) = org.jetbrains.jewel.core.component.styling.LinkStyle(colors, metrics, icons, textStyles)

@Composable
fun org.jetbrains.jewel.core.component.styling.LinkColors.Companion.light(
    content: Color = IntUiLightTheme.colors.blue(2),
    contentDisabled: Color = IntUiLightTheme.colors.grey(8),
    contentFocused: Color = content,
    contentPressed: Color = content,
    contentHovered: Color = content,
    contentVisited: Color = content,
) = org.jetbrains.jewel.core.component.styling.LinkColors(
    content,
    contentDisabled,
    contentFocused,
    contentPressed,
    contentHovered,
    contentVisited,
)

@Composable
fun org.jetbrains.jewel.core.component.styling.LinkColors.Companion.dark(
    content: Color = IntUiDarkTheme.colors.blue(9),
    contentDisabled: Color = IntUiDarkTheme.colors.grey(7),
    contentFocused: Color = content,
    contentPressed: Color = content,
    contentHovered: Color = content,
    contentVisited: Color = content,
) = org.jetbrains.jewel.core.component.styling.LinkColors(
    content,
    contentDisabled,
    contentFocused,
    contentPressed,
    contentHovered,
    contentVisited,
)

fun org.jetbrains.jewel.core.component.styling.LinkMetrics.Companion.defaults(
    focusHaloCornerSize: CornerSize = CornerSize(2.dp),
    textIconGap: Dp = 0.dp,
    iconSize: DpSize = DpSize(16.dp, 16.dp),
) = org.jetbrains.jewel.core.component.styling.LinkMetrics(focusHaloCornerSize, textIconGap, iconSize)

fun org.jetbrains.jewel.core.component.styling.LinkIcons.Companion.defaults(
    dropdownChevron: PainterProvider = standalonePainterProvider("expui/general/chevronDown.svg"),
    externalLink: PainterProvider = standalonePainterProvider("expui/ide/externalLink.svg"),
) = org.jetbrains.jewel.core.component.styling.LinkIcons(dropdownChevron, externalLink)

@Composable
fun org.jetbrains.jewel.core.component.styling.LinkTextStyles.Companion.light(
    normal: TextStyle = JewelTheme.defaultTextStyle.copy(textDecoration = TextDecoration.Underline),
    disabled: TextStyle = JewelTheme.defaultTextStyle,
    focused: TextStyle = normal,
    pressed: TextStyle = normal,
    hovered: TextStyle = normal,
    visited: TextStyle = normal,
): org.jetbrains.jewel.core.component.styling.LinkTextStyles =
    org.jetbrains.jewel.core.component.styling.LinkTextStyles(normal, disabled, focused, pressed, hovered, visited)

@Composable
fun org.jetbrains.jewel.core.component.styling.LinkTextStyles.Companion.dark(
    normal: TextStyle = JewelTheme.defaultTextStyle.copy(textDecoration = TextDecoration.Underline),
    disabled: TextStyle = JewelTheme.defaultTextStyle,
    focused: TextStyle = normal,
    pressed: TextStyle = normal,
    hovered: TextStyle = normal,
    visited: TextStyle = normal,
): org.jetbrains.jewel.core.component.styling.LinkTextStyles =
    org.jetbrains.jewel.core.component.styling.LinkTextStyles(normal, disabled, focused, pressed, hovered, visited)
