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

public val NodesGroup.ClassAnonymous: IntellijIconData
    get() {
        if (_classAnonymous != null) {
            return _classAnonymous!!
        }
        _classAnonymous = IntellijIconData(name = "ClassAnonymous",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { ClassAnonymousComposable(it) })
        return _classAnonymous!!
    }

private var _classAnonymous: IntellijIconData? = null

private fun ClassAnonymousComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ClassAnonymous", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0f, 15.0f)
        curveTo(11.866f, 15.0f, 15.0f, 11.866f, 15.0f, 8.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        close()
        moveTo(8.0f, 10.0f)
        curveTo(9.1046f, 10.0f, 10.0f, 9.1046f, 10.0f, 8.0f)
        curveTo(10.0f, 6.8954f, 9.1046f, 6.0f, 8.0f, 6.0f)
        curveTo(6.8954f, 6.0f, 6.0f, 6.8954f, 6.0f, 8.0f)
        curveTo(6.0f, 9.1046f, 6.8954f, 10.0f, 8.0f, 10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0f, 14.0f)
        curveTo(11.3137f, 14.0f, 14.0f, 11.3137f, 14.0f, 8.0f)
        curveTo(14.0f, 4.6863f, 11.3137f, 2.0f, 8.0f, 2.0f)
        curveTo(4.6863f, 2.0f, 2.0f, 4.6863f, 2.0f, 8.0f)
        curveTo(2.0f, 11.3137f, 4.6863f, 14.0f, 8.0f, 14.0f)
        close()
        moveTo(11.0f, 8.0f)
        curveTo(11.0f, 9.6568f, 9.6568f, 11.0f, 8.0f, 11.0f)
        curveTo(6.3432f, 11.0f, 5.0f, 9.6568f, 5.0f, 8.0f)
        curveTo(5.0f, 6.3432f, 6.3432f, 5.0f, 8.0f, 5.0f)
        curveTo(9.6568f, 5.0f, 11.0f, 6.3432f, 11.0f, 8.0f)
        close()
        moveTo(15.0f, 8.0f)
        curveTo(15.0f, 11.866f, 11.866f, 15.0f, 8.0f, 15.0f)
        curveTo(4.134f, 15.0f, 1.0f, 11.866f, 1.0f, 8.0f)
        curveTo(1.0f, 4.134f, 4.134f, 1.0f, 8.0f, 1.0f)
        curveTo(11.866f, 1.0f, 15.0f, 4.134f, 15.0f, 8.0f)
        close()
        moveTo(10.0f, 8.0f)
        curveTo(10.0f, 9.1046f, 9.1046f, 10.0f, 8.0f, 10.0f)
        curveTo(6.8954f, 10.0f, 6.0f, 9.1046f, 6.0f, 8.0f)
        curveTo(6.0f, 6.8954f, 6.8954f, 6.0f, 8.0f, 6.0f)
        curveTo(9.1046f, 6.0f, 10.0f, 6.8954f, 10.0f, 8.0f)
        close()
    }
}
.build()
