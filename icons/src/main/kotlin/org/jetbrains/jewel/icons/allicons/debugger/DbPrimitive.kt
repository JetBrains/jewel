package org.jetbrains.jewel.icons.allicons.debugger

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
import org.jetbrains.jewel.icons.allicons.DebuggerGroup

public val DebuggerGroup.DbPrimitive: IntellijIconData
    get() {
        if (_dbPrimitive != null) {
            return _dbPrimitive!!
        }
        _dbPrimitive = IntellijIconData(imageVector = { DbPrimitiveComposable(it) })
        return _dbPrimitive!!
    }

private var _dbPrimitive: IntellijIconData? = null

private fun DbPrimitiveComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "DbPrimitive", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.98f, 6.992f)
        curveTo(9.484f, 6.992f, 8.5f, 5.7359f, 8.5f, 4.1119f)
        verticalLineTo(4.096f)
        curveTo(8.5f, 2.472f, 9.508f, 1.1999f, 10.996f, 1.1999f)
        curveTo(12.476f, 1.1999f, 13.476f, 2.456f, 13.476f, 4.0799f)
        verticalLineTo(4.096f)
        curveTo(13.476f, 5.72f, 12.476f, 6.992f, 10.98f, 6.992f)
        close()
        moveTo(11.002f, 5.88f)
        curveTo(11.746f, 5.88f, 12.218f, 5.128f, 12.218f, 4.1119f)
        verticalLineTo(4.096f)
        curveTo(12.218f, 3.08f, 11.722f, 2.3119f, 10.986f, 2.3119f)
        curveTo(10.25f, 2.3119f, 9.77f, 3.0559f, 9.77f, 4.0799f)
        verticalLineTo(4.096f)
        curveTo(9.77f, 5.1199f, 10.258f, 5.88f, 11.002f, 5.88f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(4.98f, 14.7919f)
        curveTo(3.484f, 14.7919f, 2.5f, 13.5359f, 2.5f, 11.9119f)
        verticalLineTo(11.8959f)
        curveTo(2.5f, 10.2719f, 3.508f, 8.9999f, 4.996f, 8.9999f)
        curveTo(6.476f, 8.9999f, 7.476f, 10.2559f, 7.476f, 11.8799f)
        verticalLineTo(11.8959f)
        curveTo(7.476f, 13.5199f, 6.476f, 14.7919f, 4.98f, 14.7919f)
        close()
        moveTo(5.002f, 13.6799f)
        curveTo(5.746f, 13.6799f, 6.218f, 12.9279f, 6.218f, 11.9119f)
        verticalLineTo(11.8959f)
        curveTo(6.218f, 10.8799f, 5.722f, 10.1119f, 4.986f, 10.1119f)
        curveTo(4.25f, 10.1119f, 3.77f, 10.8559f, 3.77f, 11.8799f)
        verticalLineTo(11.8959f)
        curveTo(3.77f, 12.9199f, 4.258f, 13.6799f, 5.002f, 13.6799f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.91f, 6.0919f)
        horizontalLineTo(5.858f)
        verticalLineTo(1.3513f)
        horizontalLineTo(5.018f)
        lineTo(3.0825f, 1.9724f)
        lineTo(3.3385f, 2.8858f)
        lineTo(4.642f, 2.5048f)
        verticalLineTo(6.0919f)
        horizontalLineTo(3.41f)
        verticalLineTo(6.9919f)
        horizontalLineTo(6.91f)
        verticalLineTo(6.0919f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.8621f, 13.7406f)
        horizontalLineTo(12.9141f)
        verticalLineTo(14.6406f)
        horizontalLineTo(9.4141f)
        verticalLineTo(13.7406f)
        horizontalLineTo(10.6461f)
        verticalLineTo(10.1534f)
        lineTo(9.3426f, 10.5345f)
        lineTo(9.0866f, 9.621f)
        lineTo(11.0221f, 9.0f)
        horizontalLineTo(11.8621f)
        verticalLineTo(13.7406f)
        close()
    }
}
.build()
