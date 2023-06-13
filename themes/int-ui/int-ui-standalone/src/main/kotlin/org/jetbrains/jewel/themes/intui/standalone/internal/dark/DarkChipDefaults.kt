package org.jetbrains.jewel.themes.intui.standalone.internal.dark

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.internal.ChipColors
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiChipDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.LocalIntUiPalette
import org.jetbrains.jewel.toBrush

@Suppress("MagicNumber")
object DarkChipDefaults : IntUiChipDefaults() {

    @Composable
    override fun chipColors(): ChipColors {
        val palette = LocalIntUiPalette.current
        return remember(palette) {
            org.jetbrains.jewel.internal.chipColors(
                backgroundBrush = palette.grey(2).toBrush(),
                contentColor = palette.grey(12),
                borderStroke = Stroke(1.dp, palette.grey(5), Stroke.Alignment.Inside),
                focusedBackground = palette.grey(2).toBrush(),
                focusedContentColor = palette.grey(12),
                focusedBorderStroke = Stroke.None,
                focusedHaloStroke = Stroke(2.dp, palette.blue(6), Stroke.Alignment.Center),
                hoveredBackground = palette.grey(2).toBrush(),
                hoveredContentColor = palette.grey(1),
                hoveredBorderStroke = Stroke(1.dp, palette.grey(7), Stroke.Alignment.Inside),
                pressedBackground = palette.grey(2).toBrush(),
                pressedContentColor = palette.grey(12),
                pressedBorderStroke = Stroke(1.dp, palette.grey(7), Stroke.Alignment.Inside),
                disabledBackground = palette.grey(5).toBrush(),
                disabledContentColor = palette.grey(8),
                disabledBorderStroke = Stroke(1.dp, palette.grey(6), Stroke.Alignment.Inside)
            )
        }
    }
}
