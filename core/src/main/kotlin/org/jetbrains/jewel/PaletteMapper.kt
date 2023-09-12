package org.jetbrains.jewel

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
class PaletteMapper(
    private val colorOverrides: Map<Color, Color>,
    private val selectedColorOverrides: Map<Color, Color>,
) {

    fun mapColorOrNull(originalColor: Color): Color? {
        if (colorOverrides.isEmpty()) return null

        return colorOverrides[originalColor]
    }

    fun mapSelectedColorOrNull(originalColor: Color): Color? {
        if (selectedColorOverrides.isEmpty()) return null

        return selectedColorOverrides[originalColor]
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PaletteMapper

        if (colorOverrides != other.colorOverrides) return false
        if (selectedColorOverrides != other.selectedColorOverrides) return false

        return true
    }

    override fun hashCode(): Int {
        var result = colorOverrides.hashCode()
        result = 31 * result + selectedColorOverrides.hashCode()
        return result
    }

    override fun toString(): String =
        "PaletteMapper(colorOverrides=$colorOverrides, selectedColorOverrides=$selectedColorOverrides)"
}
