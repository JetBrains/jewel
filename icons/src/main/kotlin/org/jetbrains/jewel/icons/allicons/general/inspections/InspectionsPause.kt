package org.jetbrains.jewel.icons.allicons.general.inspections

import androidx.compose.ui.graphics.Color
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

public val InspectionsGroup.InspectionsPause: IntellijIconData
    get() {
        if (_inspectionsPause != null) {
            return _inspectionsPause!!
        }
        _inspectionsPause = IntellijIconData(name = "InspectionsPause",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { InspectionsPauseComposable(it) })
        return _inspectionsPause!!
    }

private var _inspectionsPause: IntellijIconData? = null

private fun InspectionsPauseComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "InspectionsPause", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.5f, 4.0f)
        curveTo(4.5f, 3.7239f, 4.7239f, 3.5f, 5.0f, 3.5f)
        horizontalLineTo(7.0f)
        curveTo(7.2761f, 3.5f, 7.5f, 3.7239f, 7.5f, 4.0f)
        verticalLineTo(11.0f)
        curveTo(7.5f, 11.2761f, 7.2761f, 11.5f, 7.0f, 11.5f)
        horizontalLineTo(5.0f)
        curveTo(4.7239f, 11.5f, 4.5f, 11.2761f, 4.5f, 11.0f)
        verticalLineTo(4.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(9.5f, 4.0f)
        curveTo(9.5f, 3.7239f, 9.7239f, 3.5f, 10.0f, 3.5f)
        horizontalLineTo(12.0f)
        curveTo(12.2761f, 3.5f, 12.5f, 3.7239f, 12.5f, 4.0f)
        verticalLineTo(11.0f)
        curveTo(12.5f, 11.2761f, 12.2761f, 11.5f, 12.0f, 11.5f)
        horizontalLineTo(10.0f)
        curveTo(9.7239f, 11.5f, 9.5f, 11.2761f, 9.5f, 11.0f)
        verticalLineTo(4.0f)
        close()
    }
}
.build()
