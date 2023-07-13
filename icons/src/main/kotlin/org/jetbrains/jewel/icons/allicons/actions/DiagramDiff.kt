package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.DiagramDiff: IntellijIconData
    get() {
        if (_diagramDiff != null) {
            return _diagramDiff!!
        }
        _diagramDiff = IntellijIconData(name = "DiagramDiff",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { DiagramDiffComposable(it) })
        return _diagramDiff!!
    }

private var _diagramDiff: IntellijIconData? = null

private fun DiagramDiffComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "DiagramDiff", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.5f, 15.5f)
        lineTo(10.5f, 13.5f)
        lineTo(8.5f, 11.5f)
        moveTo(5.5f, 13.5f)
        horizontalLineTo(10.0f)
        moveTo(12.5f, 11.5f)
        lineTo(10.5f, 9.5f)
        lineTo(12.5f, 7.5f)
        moveTo(15.5f, 9.5f)
        horizontalLineTo(11.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.0f, 2.0f)
        curveTo(5.0f, 1.4477f, 5.4477f, 1.0f, 6.0f, 1.0f)
        horizontalLineTo(10.0f)
        curveTo(10.5523f, 1.0f, 11.0f, 1.4477f, 11.0f, 2.0f)
        verticalLineTo(5.0f)
        curveTo(11.0f, 5.5523f, 10.5523f, 6.0f, 10.0f, 6.0f)
        horizontalLineTo(8.5f)
        verticalLineTo(7.5f)
        horizontalLineTo(10.3787f)
        lineTo(9.4393f, 8.4393f)
        curveTo(9.4195f, 8.4592f, 9.4004f, 8.4794f, 9.3819f, 8.5f)
        horizontalLineTo(5.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(6.0f)
        curveTo(6.5523f, 10.0f, 7.0f, 10.4477f, 7.0f, 11.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(11.0f)
        horizontalLineTo(2.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(4.0854f)
        curveTo(4.2913f, 14.5826f, 4.8469f, 15.0f, 5.5f, 15.0f)
        horizontalLineTo(2.0f)
        curveTo(1.4477f, 15.0f, 1.0f, 14.5523f, 1.0f, 14.0f)
        verticalLineTo(11.0f)
        curveTo(1.0f, 10.4477f, 1.4477f, 10.0f, 2.0f, 10.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(8.5f)
        curveTo(4.0f, 7.9477f, 4.4477f, 7.5f, 5.0f, 7.5f)
        horizontalLineTo(7.5f)
        verticalLineTo(6.0f)
        horizontalLineTo(6.0f)
        curveTo(5.4477f, 6.0f, 5.0f, 5.5523f, 5.0f, 5.0f)
        verticalLineTo(2.0f)
        close()
        moveTo(10.0f, 2.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(2.0f)
        close()
    }
}
.build()
