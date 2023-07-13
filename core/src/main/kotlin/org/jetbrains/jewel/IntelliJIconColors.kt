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
    blueSolid: Color,
    blueFill: Color,
    blueStroke: Color,
    greenSolid: Color,
    greenFill: Color,
    greenStroke: Color,
    redSolid: Color,
    redFill: Color,
    redStroke: Color,
    yellowSolid: Color,
    yellowFill: Color,
    yellowStroke: Color,
    orangeFill: Color,
    orangeStroke: Color,
    purpleFill: Color,
    purpleStroke: Color,
) {

    var generalStroke by mutableStateOf(generalStroke, structuralEqualityPolicy())
        internal set

    var generalFill by mutableStateOf(generalFill, structuralEqualityPolicy())
        internal set

    var blueSolid by mutableStateOf(blueSolid, structuralEqualityPolicy())
        internal set
    var blueFill by mutableStateOf(blueFill, structuralEqualityPolicy())
        internal set
    var blueStroke by mutableStateOf(blueStroke, structuralEqualityPolicy())
        internal set
    var greenSolid by mutableStateOf(greenSolid, structuralEqualityPolicy())
        internal set
    var greenFill by mutableStateOf(greenFill, structuralEqualityPolicy())
        internal set
    var greenStroke by mutableStateOf(greenStroke, structuralEqualityPolicy())
        internal set
    var redSolid by mutableStateOf(redSolid, structuralEqualityPolicy())
        internal set
    var redFill by mutableStateOf(redFill, structuralEqualityPolicy())
        internal set
    var redStroke by mutableStateOf(redStroke, structuralEqualityPolicy())
        internal set
    var yellowSolid by mutableStateOf(yellowSolid, structuralEqualityPolicy())
        internal set
    var yellowFill by mutableStateOf(yellowFill, structuralEqualityPolicy())
        internal set
    var yellowStroke by mutableStateOf(yellowStroke, structuralEqualityPolicy())
        internal set
    var orangeFill by mutableStateOf(orangeFill, structuralEqualityPolicy())
        internal set
    var orangeStroke by mutableStateOf(orangeStroke, structuralEqualityPolicy())
        internal set
    var purpleFill by mutableStateOf(purpleFill, structuralEqualityPolicy())
        internal set
    var purpleStroke by mutableStateOf(purpleStroke, structuralEqualityPolicy())
        internal set

    fun copy(
        generalStroke: Color = this.generalStroke,
        generalFill: Color = this.generalFill,
        blueSolid: Color = this.blueSolid,
        blueFill: Color = this.blueFill,
        blueStroke: Color = this.blueStroke,
        greenSolid: Color = this.greenSolid,
        greenFill: Color = this.greenFill,
        greenStroke: Color = this.greenStroke,
        redSolid: Color = this.redSolid,
        redFill: Color = this.redFill,
        redStroke: Color = this.redStroke,
        yellowSolid: Color = this.yellowSolid,
        yellowFill: Color = this.yellowFill,
        yellowStroke: Color = this.yellowStroke,
        orangeFill: Color = this.orangeFill,
        orangeStroke: Color = this.orangeStroke,
        purpleFill: Color = this.purpleFill,
        purpleStroke: Color = this.purpleStroke,
    ): IntelliJIconColors {
        return IntelliJIconColors(
            generalStroke = generalStroke,
            generalFill = generalFill,
            blueSolid = blueSolid,
            blueFill = blueFill,
            blueStroke = blueStroke,
            greenSolid = greenSolid,
            greenFill = greenFill,
            greenStroke = greenStroke,
            redSolid = redSolid,
            redFill = redFill,
            redStroke = redStroke,
            yellowSolid = yellowSolid,
            yellowFill = yellowFill,
            yellowStroke = yellowStroke,
            orangeFill = orangeFill,
            orangeStroke = orangeStroke,
            purpleFill = purpleFill,
            purpleStroke = purpleStroke
        )
    }

    override fun toString(): String {
        return "IntellijColors(" +
            "generalStroke=$generalStroke, " +
            "generalFill=$generalFill, " +
            "blueSolid=$blueSolid, " +
            "blueFill=$blueFill, " +
            "blueStroke=$blueStroke, " +
            "greenSolid=$greenSolid, " +
            "greenFill=$greenFill, " +
            "greenStroke=$greenStroke, " +
            "redSolid=$redSolid, " +
            "redFill=$redFill, " +
            "redStroke=$redStroke, " +
            "yellowSolid=$yellowSolid, " +
            "yellowFill=$yellowFill, " +
            "yellowStroke=$yellowStroke, " +
            "orangeFill=$orangeFill, " +
            "orangeStroke=$orangeStroke, " +
            "purpleFill=$purpleFill, " +
            "purpleStroke=$purpleStroke, " +
            ")"
    }
}

internal val LocalIntelliJIconColors = staticCompositionLocalOf<IntelliJIconColors> {
    error("No IntelliJIconColors provided")
}
