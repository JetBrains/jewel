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
import org.jetbrains.jewel.painter.PainterProvider
import org.jetbrains.jewel.styling.CheckboxColors
import org.jetbrains.jewel.styling.CheckboxIcons
import org.jetbrains.jewel.styling.CheckboxMetrics
import org.jetbrains.jewel.styling.CheckboxStyle

val CheckboxStyle.Companion.Defaults: IntUiCheckboxStyleFactory
    get() = IntUiCheckboxStyleFactory

object IntUiCheckboxStyleFactory {

    @Composable
    fun light(
        colors: CheckboxColors = CheckboxColors.Defaults.light(),
        metrics: CheckboxMetrics = CheckboxMetrics.defaults(),
        icons: CheckboxIcons = CheckboxIcons.Defaults.light(),
    ) = CheckboxStyle(colors, metrics, icons)

    @Composable
    fun dark(
        colors: CheckboxColors = CheckboxColors.Defaults.dark(),
        metrics: CheckboxMetrics = CheckboxMetrics.defaults(),
        icons: CheckboxIcons = CheckboxIcons.Defaults.dark(),
    ) = CheckboxStyle(colors, metrics, icons)
}

val CheckboxColors.Companion.Defaults: IntUiCheckboxColorsFactory
    get() = IntUiCheckboxColorsFactory

object IntUiCheckboxColorsFactory {

    @Composable
    fun light(
        content: Color = Color.Unspecified,
        contentDisabled: Color = IntUiLightTheme.colors.grey(8),
        contentSelected: Color = content,
    ) = CheckboxColors(content, contentDisabled, contentSelected)

    @Composable
    fun dark(
        content: Color = Color.Unspecified,
        contentDisabled: Color = IntUiDarkTheme.colors.grey(7),
        contentSelected: Color = content,
    ) = CheckboxColors(content, contentDisabled, contentSelected)
}

fun CheckboxMetrics.Companion.defaults(
    checkboxSize: DpSize = DpSize(19.dp, 19.dp),
    checkboxCornerSize: CornerSize = CornerSize(3.dp),
    outlineSize: DpSize = DpSize(15.dp, 15.dp),
    outlineOffset: DpOffset = DpOffset(2.5.dp, 1.5.dp),
    iconContentGap: Dp = 5.dp,
) = CheckboxMetrics(checkboxSize, checkboxCornerSize, outlineSize, outlineOffset, iconContentGap)

val CheckboxIcons.Companion.Defaults: IntUiCheckboxIconsFactory
    get() = IntUiCheckboxIconsFactory

object IntUiCheckboxIconsFactory {

    @Composable
    fun light(
        checkbox: PainterProvider = checkbox("com/intellij/ide/ui/laf/icons/intellij/checkBox.svg"),
    ) = CheckboxIcons(checkbox)

    @Composable
    fun dark(
        checkbox: PainterProvider = checkbox("com/intellij/ide/ui/laf/icons/darcula/checkBox.svg"),
    ) = CheckboxIcons(checkbox)

    @Composable
    private fun checkbox(basePath: String): PainterProvider =
        standalonePainterProvider(basePath)
}
