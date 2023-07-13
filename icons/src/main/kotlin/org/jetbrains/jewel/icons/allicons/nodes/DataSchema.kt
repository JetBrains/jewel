package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.DataSchema: IntellijIconData
    get() {
        if (_dataSchema != null) {
            return _dataSchema!!
        }
        _dataSchema = IntellijIconData(name = "DataSchema",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { DataSchemaComposable(it) })
        return _dataSchema!!
    }

private var _dataSchema: IntellijIconData? = null

private fun DataSchemaComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "DataSchema", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.0f, 4.0f)
        curveTo(1.0f, 2.8954f, 1.8954f, 2.0f, 3.0f, 2.0f)
        horizontalLineTo(13.0f)
        curveTo(14.1046f, 2.0f, 15.0f, 2.8954f, 15.0f, 4.0f)
        verticalLineTo(11.0f)
        curveTo(15.0f, 9.9855f, 14.6224f, 9.0593f, 14.0f, 8.3542f)
        verticalLineTo(6.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(7.0f)
        curveTo(10.6547f, 7.0f, 10.3196f, 7.0437f, 10.0f, 7.126f)
        verticalLineTo(6.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(7.5351f)
        curveTo(7.7529f, 13.3764f, 8.0302f, 13.714f, 8.3542f, 14.0f)
        horizontalLineTo(3.0f)
        curveTo(1.8954f, 14.0f, 1.0f, 13.1046f, 1.0f, 12.0f)
        verticalLineTo(4.0f)
        close()
        moveTo(6.0f, 3.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(3.0f)
        close()
        moveTo(5.0f, 3.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(3.0f)
        close()
        moveTo(2.0f, 6.0f)
        verticalLineTo(12.0f)
        curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(2.0f)
        close()
        moveTo(14.0f, 5.0f)
        verticalLineTo(4.0f)
        curveTo(14.0f, 3.4477f, 13.5523f, 3.0f, 13.0f, 3.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(14.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.7383f, 13.4454f)
        curveTo(12.2479f, 13.7946f, 11.6479f, 14.0f, 11.0f, 14.0f)
        curveTo(9.3432f, 14.0f, 8.0f, 12.6569f, 8.0f, 11.0f)
        curveTo(8.0f, 9.3432f, 9.3432f, 8.0f, 11.0f, 8.0f)
        curveTo(12.6569f, 8.0f, 14.0f, 9.3432f, 14.0f, 11.0f)
        curveTo(14.0f, 11.6479f, 13.7946f, 12.2479f, 13.4454f, 12.7383f)
        lineTo(14.8536f, 14.1464f)
        curveTo(15.0488f, 14.3417f, 15.0488f, 14.6583f, 14.8536f, 14.8536f)
        curveTo(14.6583f, 15.0488f, 14.3417f, 15.0488f, 14.1464f, 14.8536f)
        lineTo(12.7383f, 13.4454f)
        close()
        moveTo(13.0f, 11.0f)
        curveTo(13.0f, 12.1046f, 12.1046f, 13.0f, 11.0f, 13.0f)
        curveTo(9.8954f, 13.0f, 9.0f, 12.1046f, 9.0f, 11.0f)
        curveTo(9.0f, 9.8954f, 9.8954f, 9.0f, 11.0f, 9.0f)
        curveTo(12.1046f, 9.0f, 13.0f, 9.8954f, 13.0f, 11.0f)
        close()
    }
}
.build()
