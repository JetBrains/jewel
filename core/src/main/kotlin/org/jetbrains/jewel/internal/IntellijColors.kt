package org.jetbrains.jewel.internal

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.styles.localNotProvided

@Stable
class IntellijColors(
    foreground: Color,
    background: Color,
    borderColor: Color,

    disabledForeground: Color,
    disabledBackground: Color,
    disabledBorderColor: Color
) {

    var foreground by mutableStateOf(foreground, structuralEqualityPolicy())
        internal set

    var background by mutableStateOf(background, structuralEqualityPolicy())
        internal set

    var borderColor by mutableStateOf(borderColor, structuralEqualityPolicy())
        internal set

    var disabledForeground by mutableStateOf(disabledForeground, structuralEqualityPolicy())
        internal set

    var disabledBackground by mutableStateOf(disabledBackground, structuralEqualityPolicy())
        internal set

    var disabledBorderColor by mutableStateOf(disabledBorderColor, structuralEqualityPolicy())
        internal set

    fun copy(
        foreground: Color = this.foreground,
        background: Color = this.background,
        borderColor: Color = this.borderColor,
        disabledForeground: Color = this.disabledForeground,
        disabledBackground: Color = this.disabledBackground,
        disabledBorderColor: Color = this.disabledBorderColor
    ): IntellijColors {
        return IntellijColors(
            foreground = foreground,
            background = background,
            borderColor = borderColor,
            disabledForeground = disabledForeground,
            disabledBackground = disabledBackground,
            disabledBorderColor = disabledBorderColor
        )
    }

    override fun toString(): String {
        return "IntellijColors(" +
            "foreground=$foreground, " +
            "background=$background, " +
            "borderColor=$borderColor, " +
            "disabledForeground=$disabledForeground, " +
            "disabledBackground=$disabledBackground, " +
            "disabledBorderColor=$disabledBorderColor" +
            ")"
    }
}

internal val LocalIntellijColors = staticCompositionLocalOf<IntellijColors> {
    localNotProvided()
}
