package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.intui.standalone.standalonePainterProvider
import org.jetbrains.jewel.ui.painter.PainterProvider

@Composable
fun org.jetbrains.jewel.ui.component.styling.CheckboxStyle.Companion.light(
    colors: org.jetbrains.jewel.ui.component.styling.CheckboxColors = org.jetbrains.jewel.ui.component.styling.CheckboxColors.light(),
    metrics: org.jetbrains.jewel.ui.component.styling.CheckboxMetrics = org.jetbrains.jewel.ui.component.styling.CheckboxMetrics.defaults(),
    icons: org.jetbrains.jewel.ui.component.styling.CheckboxIcons = org.jetbrains.jewel.ui.component.styling.CheckboxIcons.light(),
) = org.jetbrains.jewel.ui.component.styling.CheckboxStyle(colors, metrics, icons)

@Composable
fun org.jetbrains.jewel.ui.component.styling.CheckboxStyle.Companion.dark(
    colors: org.jetbrains.jewel.ui.component.styling.CheckboxColors = org.jetbrains.jewel.ui.component.styling.CheckboxColors.dark(),
    metrics: org.jetbrains.jewel.ui.component.styling.CheckboxMetrics = org.jetbrains.jewel.ui.component.styling.CheckboxMetrics.defaults(),
    icons: org.jetbrains.jewel.ui.component.styling.CheckboxIcons = org.jetbrains.jewel.ui.component.styling.CheckboxIcons.dark(),
) = org.jetbrains.jewel.ui.component.styling.CheckboxStyle(colors, metrics, icons)

@Composable
fun org.jetbrains.jewel.ui.component.styling.CheckboxColors.Companion.light(
    content: Color = Color.Unspecified,
    contentDisabled: Color = IntUiLightTheme.colors.grey(8),
    contentSelected: Color = content,
) = org.jetbrains.jewel.ui.component.styling.CheckboxColors(content, contentDisabled, contentSelected)

@Composable
fun org.jetbrains.jewel.ui.component.styling.CheckboxColors.Companion.dark(
    content: Color = Color.Unspecified,
    contentDisabled: Color = IntUiDarkTheme.colors.grey(7),
    contentSelected: Color = content,
) = org.jetbrains.jewel.ui.component.styling.CheckboxColors(content, contentDisabled, contentSelected)

fun org.jetbrains.jewel.ui.component.styling.CheckboxMetrics.Companion.defaults(
    checkboxSize: DpSize = DpSize(19.dp, 19.dp),
    checkboxCornerSize: CornerSize = CornerSize(3.dp),
    outlineSize: DpSize = DpSize(15.dp, 15.dp),
    outlineOffset: DpOffset = DpOffset(2.5.dp, 1.5.dp),
    iconContentGap: Dp = 5.dp,
) = org.jetbrains.jewel.ui.component.styling.CheckboxMetrics(
    checkboxSize,
    checkboxCornerSize,
    outlineSize,
    outlineOffset,
    iconContentGap,
)

@Composable
fun org.jetbrains.jewel.ui.component.styling.CheckboxIcons.Companion.light(
    checkbox: PainterProvider = checkbox("com/intellij/ide/ui/laf/icons/intellij/checkBox.svg"),
) = org.jetbrains.jewel.ui.component.styling.CheckboxIcons(checkbox)

@Composable
fun org.jetbrains.jewel.ui.component.styling.CheckboxIcons.Companion.dark(
    checkbox: PainterProvider = checkbox("com/intellij/ide/ui/laf/icons/darcula/checkBox.svg"),
) = org.jetbrains.jewel.ui.component.styling.CheckboxIcons(checkbox)

@Composable
private fun checkbox(basePath: String): PainterProvider =
    standalonePainterProvider(basePath)
