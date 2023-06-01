package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.internal.AreaColor
import org.jetbrains.jewel.internal.ButtonColors
import org.jetbrains.jewel.internal.ButtonDefaults
import org.jetbrains.jewel.internal.Stroke

object IntUiButtonDefaults : ButtonDefaults {

    private val ButtonHorizontalPadding = 12.dp
    private val ButtonVerticalPadding = 6.dp

    val ContentPadding = PaddingValues(
        start = ButtonHorizontalPadding,
        top = ButtonVerticalPadding,
        end = ButtonHorizontalPadding,
        bottom = ButtonVerticalPadding
    )

    val MinWidth = 72.dp

    val MinHeight = 28.dp

    val Shape = RoundedCornerShape(4.dp)

    @Composable
    override fun shape(): RoundedCornerShape {
        return Shape
    }

    @Composable
    override fun contentPadding(): PaddingValues {
        return ContentPadding
    }

    @Composable
    override fun minWidth(): Dp {
        return MinWidth
    }

    @Composable
    override fun minHeight(): Dp {
        return MinHeight
    }

    @Composable
    override fun buttonColors(): ButtonColors {
        val palette = LocalIntUiPalettes.current
        return remember(palette) {
            org.jetbrains.jewel.internal.buttonColors(
                normalArea = AreaColor(
                    background = palette.blue().buttonDefault(),
                    foreground = palette.grey().textOnDark(),
                ),
                normalStroke = Stroke.None,
                disabledArea = AreaColor(
                    background = palette.grey().disabledBackground(),
                    foreground = palette.grey().disabledText(),
                ),
                disabledStroke = Stroke.None,
                hoverArea = AreaColor(
                    background = palette.blue().buttonHovered(),
                    foreground = palette.grey().textOnDark(),
                ),
                hoverStroke = Stroke.None,
                pressedArea = AreaColor(
                    background = palette.blue().buttonPressed(),
                    foreground = palette.grey().textOnDark(),
                ),
                pressedStroke = Stroke.None,
                focusedArea = AreaColor(
                    background = palette.blue().buttonDefault(),
                    foreground = palette.grey().textOnDark(),
                ),
                focusedStroke = Stroke(1.dp, palette.grey().mainBackground(), Stroke.Alignment.Outside),
                focusHoloStroke = Stroke(3.dp, palette.blue().buttonDefault(), Stroke.Alignment.Outside),
            )
        }
    }

    @Composable
    override fun outlineButtonColors(): ButtonColors {
        TODO("Not yet implemented")
    }
}
