package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.DumpThreads: IntellijIconData
    get() {
        if (_dumpThreads != null) {
            return _dumpThreads!!
        }
        _dumpThreads = IntellijIconData(imageVector = { DumpThreadsComposable(it) })
        return _dumpThreads!!
    }

private var _dumpThreads: IntellijIconData? = null

private fun DumpThreadsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "DumpThreads", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.123f, 5.0f)
        lineTo(10.323f, 3.0f)
        lineTo(5.677f, 3.0f)
        lineTo(4.877f, 5.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 5.0f, 2.0f, 5.4477f, 2.0f, 6.0f)
        verticalLineTo(12.0f)
        curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 13.0f, 14.0f, 12.5523f, 14.0f, 12.0f)
        verticalLineTo(6.0f)
        curveTo(14.0f, 5.4477f, 13.5523f, 5.0f, 13.0f, 5.0f)
        horizontalLineTo(11.123f)
        close()
        moveTo(4.2f, 4.0f)
        horizontalLineTo(3.0f)
        curveTo(1.8954f, 4.0f, 1.0f, 4.8954f, 1.0f, 6.0f)
        verticalLineTo(12.0f)
        curveTo(1.0f, 13.1046f, 1.8954f, 14.0f, 3.0f, 14.0f)
        horizontalLineTo(13.0f)
        curveTo(14.1046f, 14.0f, 15.0f, 13.1046f, 15.0f, 12.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        horizontalLineTo(11.8f)
        lineTo(11.2514f, 2.6286f)
        curveTo(11.0996f, 2.249f, 10.7319f, 2.0f, 10.323f, 2.0f)
        horizontalLineTo(5.677f)
        curveTo(5.2681f, 2.0f, 4.9004f, 2.249f, 4.7486f, 2.6286f)
        lineTo(4.2f, 4.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.75f)
        moveToRelative(-2.5f, 0.0f)
        arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
        arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.0f, 6.0f)
        horizontalLineToRelative(1.0f)
        verticalLineToRelative(1.0f)
        horizontalLineToRelative(-1.0f)
        close()
    }
}
.build()
