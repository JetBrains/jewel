package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.MouseState
import org.jetbrains.jewel.internal.IntelliJTheme
import org.jetbrains.jewel.internal.LinkDefaults
import org.jetbrains.jewel.internal.LinkState

@Suppress("VariableNaming")
abstract class IntUiLinkDefaults : LinkDefaults {

    val Shape = RoundedCornerShape(2.dp)

    @Composable
    override fun haloShape(): Shape = Shape

    @Composable
    override fun externalLinkIconPainter(): Painter = painterResource("intui/externalLink.svg")

    @Composable
    override fun DropdownLinkIconPainter(): Painter = painterResource("intui/dropdownLink.svg")

    @Composable
    override fun textStyle(state: LinkState): State<TextStyle> {
        val defaultTextStyle = IntelliJTheme.defaultTextStyle

        return rememberUpdatedState(
            when {
                !state.isEnabled -> defaultTextStyle
                state.mouseState == MouseState.None -> defaultTextStyle
                else -> defaultTextStyle.copy(textDecoration = TextDecoration.Underline)
            }
        )
    }
}
