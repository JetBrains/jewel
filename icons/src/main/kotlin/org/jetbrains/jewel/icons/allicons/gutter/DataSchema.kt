package org.jetbrains.jewel.icons.allicons.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.DataSchema: IntellijIconData
    get() {
        if (_dataSchema != null) {
            return _dataSchema!!
        }
        _dataSchema = IntellijIconData(imageVector = { DataSchemaComposable(it) })
        return _dataSchema!!
    }

private var _dataSchema: IntellijIconData? = null

private fun DataSchemaComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "DataSchema", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(0.0f, 3.0f)
        curveTo(0.0f, 1.8954f, 0.8954f, 1.0f, 2.0f, 1.0f)
        horizontalLineTo(12.0f)
        curveTo(13.1046f, 1.0f, 14.0f, 1.8954f, 14.0f, 3.0f)
        verticalLineTo(10.0f)
        curveTo(14.0f, 8.9855f, 13.6224f, 8.0593f, 13.0f, 7.3542f)
        verticalLineTo(5.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(6.0f)
        curveTo(9.6547f, 6.0f, 9.3196f, 6.0437f, 9.0f, 6.126f)
        verticalLineTo(5.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(6.5351f)
        curveTo(6.7529f, 12.3764f, 7.0302f, 12.714f, 7.3542f, 13.0f)
        horizontalLineTo(2.0f)
        curveTo(0.8954f, 13.0f, 0.0f, 12.1046f, 0.0f, 11.0f)
        verticalLineTo(3.0f)
        close()
        moveTo(5.0f, 2.0f)
        horizontalLineTo(9.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(2.0f)
        close()
        moveTo(4.0f, 2.0f)
        horizontalLineTo(2.0f)
        curveTo(1.4477f, 2.0f, 1.0f, 2.4477f, 1.0f, 3.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(2.0f)
        close()
        moveTo(1.0f, 5.0f)
        verticalLineTo(11.0f)
        curveTo(1.0f, 11.5523f, 1.4477f, 12.0f, 2.0f, 12.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(1.0f)
        close()
        moveTo(13.0f, 4.0f)
        verticalLineTo(3.0f)
        curveTo(13.0f, 2.4477f, 12.5523f, 2.0f, 12.0f, 2.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(4.0f)
        horizontalLineTo(13.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 10.0f)
        moveToRelative(-2.0f, 0.0f)
        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(11.7383f, 12.4454f)
        curveTo(11.2479f, 12.7946f, 10.6479f, 13.0f, 10.0f, 13.0f)
        curveTo(8.3432f, 13.0f, 7.0f, 11.6569f, 7.0f, 10.0f)
        curveTo(7.0f, 8.3432f, 8.3432f, 7.0f, 10.0f, 7.0f)
        curveTo(11.6569f, 7.0f, 13.0f, 8.3432f, 13.0f, 10.0f)
        curveTo(13.0f, 10.6479f, 12.7946f, 11.2479f, 12.4454f, 11.7383f)
        lineTo(13.8536f, 13.1464f)
        curveTo(14.0488f, 13.3417f, 14.0488f, 13.6583f, 13.8536f, 13.8536f)
        curveTo(13.6583f, 14.0488f, 13.3417f, 14.0488f, 13.1464f, 13.8536f)
        lineTo(11.7383f, 12.4454f)
        close()
        moveTo(12.0f, 10.0f)
        curveTo(12.0f, 11.1046f, 11.1046f, 12.0f, 10.0f, 12.0f)
        curveTo(8.8954f, 12.0f, 8.0f, 11.1046f, 8.0f, 10.0f)
        curveTo(8.0f, 8.8954f, 8.8954f, 8.0f, 10.0f, 8.0f)
        curveTo(11.1046f, 8.0f, 12.0f, 8.8954f, 12.0f, 10.0f)
        close()
    }
}
.build()
