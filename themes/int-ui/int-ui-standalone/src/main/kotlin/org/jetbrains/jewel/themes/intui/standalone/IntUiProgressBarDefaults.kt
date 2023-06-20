package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.internal.ProgressBarDefaults

@Suppress("VariableNaming", "MagicNumbers")
abstract class IntUiProgressBarDefaults : ProgressBarDefaults {

    @Composable
    override fun height(): Dp = 4.dp

    @Composable
    override fun clipShape() = RoundedCornerShape(2.dp)

    @Composable
    override fun gradientWidth(): Dp = 140.dp

    @Composable
    override fun animationDurationMillis() = 800
}
