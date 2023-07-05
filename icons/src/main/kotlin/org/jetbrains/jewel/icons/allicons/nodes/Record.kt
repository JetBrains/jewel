package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Record: IntellijIconData
    get() {
        if (_record != null) {
            return _record!!
        }
        _record = IntellijIconData(imageVector = { RecordComposable(it) })
        return _record!!
    }

private var _record: IntellijIconData? = null

private fun RecordComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Record", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFE7EFFD)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.93f, 8.405f)
        horizontalLineTo(9.025f)
        lineTo(10.925f, 11.5f)
        horizontalLineTo(9.775f)
        lineTo(7.93f, 8.405f)
        close()
        moveTo(5.7f, 4.5f)
        horizontalLineTo(8.585f)
        curveTo(9.0483f, 4.5f, 9.4533f, 4.5867f, 9.7999f, 4.76f)
        curveTo(10.15f, 4.93f, 10.42f, 5.1717f, 10.61f, 5.485f)
        curveTo(10.8f, 5.795f, 10.895f, 6.1583f, 10.895f, 6.575f)
        curveTo(10.895f, 6.9883f, 10.7983f, 7.3533f, 10.605f, 7.67f)
        curveTo(10.4116f, 7.9867f, 10.1383f, 8.2317f, 9.785f, 8.405f)
        curveTo(9.4316f, 8.575f, 9.0183f, 8.66f, 8.5449f, 8.66f)
        horizontalLineTo(6.7f)
        verticalLineTo(11.5f)
        horizontalLineTo(5.7f)
        verticalLineTo(4.5f)
        close()
        moveTo(8.5599f, 7.77f)
        curveTo(8.82f, 7.77f, 9.0466f, 7.7217f, 9.24f, 7.625f)
        curveTo(9.4333f, 7.5283f, 9.5833f, 7.39f, 9.6899f, 7.21f)
        curveTo(9.7966f, 7.03f, 9.8499f, 6.8183f, 9.8499f, 6.575f)
        curveTo(9.8499f, 6.335f, 9.7966f, 6.1267f, 9.6899f, 5.95f)
        curveTo(9.5833f, 5.77f, 9.4333f, 5.6317f, 9.24f, 5.535f)
        curveTo(9.0466f, 5.4383f, 8.82f, 5.39f, 8.5599f, 5.39f)
        horizontalLineTo(6.7f)
        verticalLineTo(7.77f)
        horizontalLineTo(8.5599f)
        close()
    }
}
.build()
