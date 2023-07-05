package org.jetbrains.jewel.icons.allicons.general.inspections

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.general.InspectionsGroup

public val InspectionsGroup.InspectionsOKEmpty: IntellijIconData
    get() {
        if (_inspectionsOKEmpty != null) {
            return _inspectionsOKEmpty!!
        }
        _inspectionsOKEmpty = IntellijIconData(imageVector = { InspectionsOKEmptyComposable(it) })
        return _inspectionsOKEmpty!!
    }

private var _inspectionsOKEmpty: IntellijIconData? = null

private fun InspectionsOKEmptyComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "InspectionsOKEmpty", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF369650)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = EvenOdd) {
        moveTo(13.2778f, 3.7221f)
        curveTo(13.7074f, 4.1517f, 13.7074f, 4.8482f, 13.2778f, 5.2778f)
        lineTo(6.0f, 12.5556f)
        lineTo(2.2222f, 8.7778f)
        curveTo(1.7926f, 8.3482f, 1.7926f, 7.6517f, 2.2222f, 7.2221f)
        curveTo(2.6518f, 6.7925f, 3.3483f, 6.7925f, 3.7778f, 7.2221f)
        lineTo(6.0f, 9.4443f)
        lineTo(11.7222f, 3.7221f)
        curveTo(12.1518f, 3.2925f, 12.8483f, 3.2925f, 13.2778f, 3.7221f)
        close()
    }
}
.build()
