package org.jetbrains.jewel

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

@Stable
class IntelliJIconColors(
    generalStroke: Color,
    generalFill: Color,
    blueSolid: Color
) {

    var generalStroke by mutableStateOf(generalStroke, structuralEqualityPolicy())
        internal set

    var generalFill by mutableStateOf(generalFill, structuralEqualityPolicy())
        internal set

    var blueSolid by mutableStateOf(blueSolid, structuralEqualityPolicy())
        internal set

    fun copy(
        generalStroke: Color = this.generalStroke,
        generalFill: Color = this.generalFill,
        blueSolid: Color = this.blueSolid,
    ): IntelliJIconColors {
        return IntelliJIconColors(
            generalStroke = generalStroke,
            generalFill = generalFill,
            blueSolid = blueSolid,
        )
    }

    override fun toString(): String {
        return "IntellijColors(" +
            "generalStroke=$generalStroke, " +
            "generalFill=$generalFill, " +
            "blueSolid=$blueSolid, " +
            ")"
    }
}

internal val LocalIntelliJIconColors = staticCompositionLocalOf<IntelliJIconColors> {
    error("No IntelliJIconColors provided")
}
