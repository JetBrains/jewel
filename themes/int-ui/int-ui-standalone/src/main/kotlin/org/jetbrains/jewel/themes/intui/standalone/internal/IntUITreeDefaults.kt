package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.internal.TreeDefaults

@Suppress("MagicNumber")
abstract class IntUITreeDefaults : TreeDefaults {

    @Composable
    override fun minWidth(): Dp = 40.dp

    @Composable
    override fun minHeight(): Dp = 40.dp

    @Composable
    override fun indentPadding(): Dp = 8.dp

    @Composable
    override fun dropDownArrowIconPainter(): Painter = painterResource("intui/chevronRight.svg")
}
