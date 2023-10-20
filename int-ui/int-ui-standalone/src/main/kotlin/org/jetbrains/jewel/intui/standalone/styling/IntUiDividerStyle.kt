package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.styling.DividerMetrics
import org.jetbrains.jewel.styling.DividerStyle

@Composable
fun DividerStyle.Companion.light(
    color: Color = IntUiLightTheme.colors.grey(12),
    metrics: DividerMetrics = DividerMetrics.defaults(),
) = DividerStyle(color, metrics)

@Composable
fun DividerStyle.Companion.dark(
    color: Color = IntUiDarkTheme.colors.grey(1),
    metrics: DividerMetrics = DividerMetrics.defaults(),
) = DividerStyle(color, metrics)

fun DividerMetrics.Companion.defaults(
    thickness: Dp = 1.dp,
    startIndent: Dp = 0.dp,
) = DividerMetrics(thickness, startIndent)
