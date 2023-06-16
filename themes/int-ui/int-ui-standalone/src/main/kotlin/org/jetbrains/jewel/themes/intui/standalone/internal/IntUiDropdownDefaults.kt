package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.internal.DropdownDefaults
import org.jetbrains.jewel.internal.IntelliJTheme

abstract class IntUiDropdownDefaults : DropdownDefaults {

    private val Shape = RoundedCornerShape(4.dp)

    private val MenuShape = RoundedCornerShape(8.dp)

    private val ContentPadding = PaddingValues(start = 9.dp, end = 8.dp)

    private val MenuMargin = PaddingValues(8.dp)

    private val MenuOffset = DpOffset(0.dp, 2.dp)

    private val MenuContentPadding = PaddingValues(12.dp, 8.dp)

    private val MenuItemContentPadding = PaddingValues(8.dp, 4.dp)

    private val MenuSeparatorPadding = PaddingValues(0.dp)

    private val MinWidth = 108.dp

    private val MinHeight = 28.dp

    private val ShadowSize = 12.dp

    @Composable
    override fun chevronPainter(): Painter = painterResource("intui/chevronBottom.svg")

    @Composable
    override fun shape(): Shape = Shape

    @Composable
    override fun menuShape(): Shape = MenuShape

    @Composable
    override fun textStyle(): TextStyle = IntelliJTheme.defaultTextStyle

    @Composable
    override fun contentPadding(): PaddingValues = ContentPadding

    @Composable
    override fun menuMargin(): PaddingValues = MenuMargin

    @Composable
    override fun menuOffset(): DpOffset = MenuOffset

    @Composable
    override fun menuAlignment(): Alignment.Horizontal = Alignment.CenterHorizontally

    @Composable
    override fun menuPadding(): PaddingValues {
        TODO("Not yet implemented")
    }

    @Composable
    override fun menuContentPadding(): PaddingValues = MenuContentPadding

    @Composable
    override fun menuItemContentPadding(): PaddingValues = MenuItemContentPadding

    @Composable
    override fun minWidth(): Dp = MinWidth

    @Composable
    override fun minHeight(): Dp = MinHeight

    @Composable
    override fun menuShadowSize(): Dp = ShadowSize

    @Composable
    override fun menuSeparatorPadding(): PaddingValues = MenuSeparatorPadding
}
