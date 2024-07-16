package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.ui.component.styling.ToggleColors
import org.jetbrains.jewel.ui.component.styling.ToggleMetrics
import org.jetbrains.jewel.ui.component.styling.ToggleStyle

@Composable
public fun ToggleStyle.Companion.light(
    colors: ToggleColors = ToggleColors.light(),
    metrics: ToggleMetrics = ToggleMetrics.default()
): ToggleStyle = ToggleStyle(colors, metrics)

@Composable
public fun ToggleStyle.Companion.dark(
    colors: ToggleColors = ToggleColors.dark(),
    metrics: ToggleMetrics =ToggleMetrics.default()
): ToggleStyle = ToggleStyle(colors, metrics)

@Composable
public fun ToggleColors.Companion.light(
    content: Color = Color.Unspecified,
    contentDisabled: Color = IntUiLightTheme.colors.grey(8) //TODO
): ToggleColors = ToggleColors(content, contentDisabled)

@Composable
public fun ToggleColors.Companion.dark(
    content: Color = Color.Unspecified,
    contentDisabled: Color = IntUiLightTheme.colors.grey(7) //TODO
): ToggleColors = ToggleColors(content, contentDisabled)

@Composable
public fun ToggleMetrics.Companion.default(
    cornerSize: CornerSize = CornerSize(2.dp), //TODO
    padding: PaddingValues = PaddingValues() //TODO
): ToggleMetrics =
    ToggleMetrics(
        cornerSize = cornerSize,
        padding = padding
    )