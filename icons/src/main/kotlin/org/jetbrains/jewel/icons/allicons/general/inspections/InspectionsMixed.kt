package org.jetbrains.jewel.icons.allicons.general.inspections

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.general.InspectionsGroup

public val InspectionsGroup.InspectionsMixed: IntellijIconData
    get() {
        if (_inspectionsMixed != null) {
            return _inspectionsMixed!!
        }
        _inspectionsMixed = IntellijIconData(name = "InspectionsMixed",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { InspectionsMixedComposable(it) })
        return _inspectionsMixed!!
    }

private var _inspectionsMixed: IntellijIconData? = null

private fun InspectionsMixedComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "InspectionsMixed", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.yellowSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.3684f, 2.1776f)
        curveTo(10.9857f, 1.4968f, 10.0058f, 1.4968f, 9.623f, 2.1776f)
        lineTo(7.92f, 5.206f)
        curveTo(8.837f, 5.4781f, 9.6439f, 6.0059f, 10.258f, 6.707f)
        curveTo(10.3319f, 6.6788f, 10.412f, 6.6634f, 10.4957f, 6.6634f)
        curveTo(10.8644f, 6.6634f, 11.1632f, 6.9623f, 11.1632f, 7.3311f)
        curveTo(11.1632f, 7.5084f, 11.0942f, 7.6695f, 10.9815f, 7.7891f)
        curveTo(11.1687f, 8.1682f, 11.3093f, 8.5744f, 11.3957f, 9.0003f)
        horizontalLineTo(13.493f)
        curveTo(14.2588f, 9.0003f, 14.7411f, 8.1754f, 14.3657f, 7.5078f)
        lineTo(11.3684f, 2.1776f)
        close()
        moveTo(10.4957f, 3.325f)
        curveTo(10.7722f, 3.325f, 10.9964f, 3.5492f, 10.9964f, 3.8257f)
        verticalLineTo(5.5054f)
        curveTo(10.9964f, 5.7819f, 10.7722f, 6.0061f, 10.4957f, 6.0061f)
        curveTo(10.2192f, 6.0061f, 9.9951f, 5.7819f, 9.9951f, 5.5054f)
        verticalLineTo(3.8257f)
        curveTo(9.9951f, 3.5492f, 10.2192f, 3.325f, 10.4957f, 3.325f)
        close()
    }
    path(fill = SolidColor(colorScheme.redSolid), stroke = SolidColor(colorScheme.redSolid),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 10.0f)
        curveTo(3.0f, 8.067f, 4.567f, 6.5f, 6.5f, 6.5f)
        curveTo(8.433f, 6.5f, 10.0f, 8.067f, 10.0f, 10.0f)
        curveTo(10.0f, 11.933f, 8.433f, 13.5f, 6.5f, 13.5f)
        curveTo(4.567f, 13.5f, 3.0f, 11.933f, 3.0f, 10.0f)
        close()
        moveTo(6.5f, 12.8333f)
        curveTo(7.1443f, 12.8333f, 7.6667f, 12.311f, 7.6667f, 11.6667f)
        curveTo(7.6667f, 11.2348f, 7.4321f, 10.8578f, 7.0833f, 10.6561f)
        curveTo(7.3357f, 10.4745f, 7.5f, 10.1783f, 7.5f, 9.8438f)
        verticalLineTo(8.1875f)
        curveTo(7.5f, 7.6352f, 7.0523f, 7.1875f, 6.5f, 7.1875f)
        curveTo(5.9477f, 7.1875f, 5.5f, 7.6352f, 5.5f, 8.1875f)
        verticalLineTo(9.8438f)
        curveTo(5.5f, 10.1783f, 5.6643f, 10.4745f, 5.9167f, 10.6561f)
        curveTo(5.5679f, 10.8578f, 5.3333f, 11.2348f, 5.3333f, 11.6667f)
        curveTo(5.3333f, 12.311f, 5.8557f, 12.8333f, 6.5f, 12.8333f)
        close()
    }
}
.build()
