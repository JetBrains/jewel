package org.jetbrains.jewel.themes.intui.standalone.internal.dark

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.internal.AreaColor
import org.jetbrains.jewel.internal.ButtonColors
import org.jetbrains.jewel.internal.buttonColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiButtonDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette

@Suppress("MagicNumber")
object DarkButtonDefaults : IntUiButtonDefaults() {

    @Composable
    override fun primaryButtonColors(): ButtonColors {
        val palette = LocalIntUiPalette.current
        return remember(palette) {
            buttonColors(
                normalArea = AreaColor(
                    background = palette.blue(6),
                    foreground = palette.grey(14)
                ),
                normalStroke = Stroke.None,
                disabledArea = AreaColor(
                    background = palette.grey(5),
                    foreground = palette.grey(8)
                ),
                disabledStroke = Stroke.None,
                hoverArea = AreaColor(
                    background = palette.blue(5),
                    foreground = palette.grey(14)
                ),
                hoverStroke = Stroke.None,
                pressedArea = AreaColor(
                    background = palette.blue(4),
                    foreground = palette.grey(14)
                ),
                pressedStroke = Stroke.None,
                focusedArea = AreaColor(
                    background = palette.blue(6),
                    foreground = palette.grey(14)
                ),
                focusedStroke = Stroke(1.dp, palette.grey(2), Stroke.Alignment.Outside),
                focusHoloStroke = Stroke(3.dp, palette.blue(6), Stroke.Alignment.Outside)
            )
        }
    }

    @Composable
    override fun outlinedButtonColors(): ButtonColors {
        val palette = LocalIntUiPalette.current
        return remember(palette) {
            buttonColors(
                normalArea = AreaColor(
                    background = palette.grey(2),
                    foreground = palette.grey(12)
                ),
                normalStroke = Stroke(1.dp, palette.grey(5), Stroke.Alignment.Inside),
                disabledArea = AreaColor(
                    background = palette.grey(5),
                    foreground = palette.grey(8)
                ),
                disabledStroke = Stroke.None,
                hoverArea = AreaColor(
                    background = palette.grey(2),
                    foreground = palette.grey(12)
                ),
                hoverStroke = Stroke(1.dp, palette.grey(7), Stroke.Alignment.Inside),
                pressedArea = AreaColor(
                    background = palette.grey(2),
                    foreground = palette.grey(12)
                ),
                pressedStroke = Stroke(1.dp, palette.grey(7), Stroke.Alignment.Inside),
                focusedArea = AreaColor(
                    background = palette.grey(2),
                    foreground = palette.grey(12)
                ),
                focusedStroke = Stroke.None,
                focusHoloStroke = Stroke(2.dp, palette.blue(6), Stroke.Alignment.Center)
            )
        }
    }
}
