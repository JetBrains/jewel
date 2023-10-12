package org.jetbrains.jewel.util

import androidx.compose.ui.graphics.Color
import kotlin.math.pow
import kotlin.math.roundToInt

fun Color.toHexString(): String {
    val r = Integer.toHexString((red * 255).roundToInt())
    val g = Integer.toHexString((green * 255).roundToInt())
    val b = Integer.toHexString((blue * 255).roundToInt())

    return buildString {
        append('#')
        append(r.padStart(2, '0'))
        append(g.padStart(2, '0'))
        append(b.padStart(2, '0'))

        if (alpha != 1.0f) {
            val a = Integer.toHexString((alpha * 255).roundToInt())
            append(a.padStart(2, '0'))
        }
    }
}

fun Color.isDark(): Boolean = (luminance + 0.05) / 0.05 < 4.5

val Color.luminance: Double
    get() = linearRGBComponentValue(red) * 0.2126 + linearRGBComponentValue(green) * 0.7152 + linearRGBComponentValue(blue) * 0.0722

private fun linearRGBComponentValue(colorValue: Float): Double =
    if (colorValue <= 0.03928) colorValue / 12.92 else ((colorValue + 0.055) / 1.055).pow(2.4)
