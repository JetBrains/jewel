package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.IdeaProject: IntellijIconData
    get() {
        if (_ideaProject != null) {
            return _ideaProject!!
        }
        _ideaProject = IntellijIconData(name = "IdeaProject",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { IdeaProjectComposable(it) })
        return _ideaProject!!
    }

private var _ideaProject: IntellijIconData? = null

private fun IdeaProjectComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "IdeaProject", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 9.0f)
        lineTo(15.0f, 9.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 10.0f)
        lineTo(16.0f, 15.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 16.0f)
        lineTo(10.0f, 16.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 15.0f)
        lineTo(9.0f, 10.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 9.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 14.5f)
        horizontalLineTo(12.5f)
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0f, 3.8667f)
        curveTo(1.0f, 2.8357f, 1.7313f, 2.0f, 2.6333f, 2.0f)
        horizontalLineTo(6.1217f)
        curveTo(6.3941f, 2.0f, 6.6548f, 2.1112f, 6.8434f, 2.3077f)
        lineTo(8.4667f, 4.0f)
        lineTo(13.0f, 4.0f)
        curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(10.0f)
        curveTo(8.8954f, 8.0f, 8.0f, 8.8954f, 8.0f, 10.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(2.6333f)
        curveTo(1.7313f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(3.8667f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.6333f, 3.0f)
        lineTo(6.1217f, 3.0f)
        lineTo(8.0402f, 5.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.4667f, 4.0f)
        lineTo(6.8434f, 2.3077f)
        curveTo(6.6548f, 2.1112f, 6.3941f, 2.0f, 6.1217f, 2.0f)
        horizontalLineTo(2.6333f)
        curveTo(1.7313f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7313f, 14.0f, 2.6333f, 14.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(2.6333f)
        curveTo(2.4048f, 13.0f, 2.0f, 12.7416f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.2584f, 2.4048f, 3.0f, 2.6333f, 3.0f)
        close()
    }
}
.build()
