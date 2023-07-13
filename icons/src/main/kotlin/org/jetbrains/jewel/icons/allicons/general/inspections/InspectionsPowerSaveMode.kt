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

public val InspectionsGroup.InspectionsPowerSaveMode: IntellijIconData
    get() {
        if (_inspectionsPowerSaveMode != null) {
            return _inspectionsPowerSaveMode!!
        }
        _inspectionsPowerSaveMode = IntellijIconData(name = "InspectionsPowerSaveMode",size =
                DpSize(height = 16.0.dp, width = 16.0.dp),imageVector = {
                InspectionsPowerSaveModeComposable(it) })
        return _inspectionsPowerSaveMode!!
    }

private var _inspectionsPowerSaveMode: IntellijIconData? = null

private fun InspectionsPowerSaveModeComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "InspectionsPowerSaveMode", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.5f, 10.0f)
        curveTo(3.2239f, 10.0f, 3.0f, 9.7761f, 3.0f, 9.5f)
        verticalLineTo(6.5f)
        curveTo(3.0f, 6.2239f, 3.2239f, 6.0f, 3.5f, 6.0f)
        curveTo(3.7761f, 6.0f, 4.0f, 6.2239f, 4.0f, 6.5f)
        verticalLineTo(9.5f)
        curveTo(4.0f, 9.7761f, 3.7761f, 10.0f, 3.5f, 10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 10.0f)
        curveTo(5.2239f, 10.0f, 5.0f, 9.7761f, 5.0f, 9.5f)
        verticalLineTo(6.5f)
        curveTo(5.0f, 6.2239f, 5.2239f, 6.0f, 5.5f, 6.0f)
        curveTo(5.7761f, 6.0f, 6.0f, 6.2239f, 6.0f, 6.5f)
        verticalLineTo(9.5f)
        curveTo(6.0f, 9.7761f, 5.7761f, 10.0f, 5.5f, 10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.0f, 10.0f)
        curveTo(13.0f, 11.1046f, 12.1046f, 12.0f, 11.0f, 12.0f)
        horizontalLineTo(3.0f)
        curveTo(1.8954f, 12.0f, 1.0f, 11.1046f, 1.0f, 10.0f)
        verticalLineTo(6.0f)
        curveTo(1.0f, 4.8954f, 1.8954f, 4.0f, 3.0f, 4.0f)
        horizontalLineTo(11.0f)
        curveTo(12.1046f, 4.0f, 13.0f, 4.8954f, 13.0f, 6.0f)
        horizontalLineTo(14.0f)
        curveTo(14.5523f, 6.0f, 15.0f, 6.4477f, 15.0f, 7.0f)
        verticalLineTo(9.0f)
        curveTo(15.0f, 9.5523f, 14.5523f, 10.0f, 14.0f, 10.0f)
        horizontalLineTo(13.0f)
        close()
        moveTo(3.0f, 5.0f)
        horizontalLineTo(11.0f)
        curveTo(11.5523f, 5.0f, 12.0f, 5.4477f, 12.0f, 6.0f)
        verticalLineTo(10.0f)
        curveTo(12.0f, 10.5523f, 11.5523f, 11.0f, 11.0f, 11.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 11.0f, 2.0f, 10.5523f, 2.0f, 10.0f)
        verticalLineTo(6.0f)
        curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
        close()
        moveTo(13.0f, 9.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(7.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(9.0f)
        close()
    }
}
.build()
