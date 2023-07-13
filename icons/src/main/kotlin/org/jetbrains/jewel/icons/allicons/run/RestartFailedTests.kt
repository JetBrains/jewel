package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.RestartFailedTests: IntellijIconData
    get() {
        if (_restartFailedTests != null) {
            return _restartFailedTests!!
        }
        _restartFailedTests = IntellijIconData(name = "RestartFailedTests",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { RestartFailedTestsComposable(it) })
        return _restartFailedTests!!
    }

private var _restartFailedTests: IntellijIconData? = null

private fun RestartFailedTestsComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "RestartFailedTests", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.redSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.5f, 11.5f)
        moveToRelative(-3.5f, 0.0f)
        arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
        arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 9.0f)
        curveTo(12.2239f, 9.0f, 12.0f, 9.2239f, 12.0f, 9.5f)
        verticalLineTo(11.5f)
        curveTo(12.0f, 11.7761f, 12.2239f, 12.0f, 12.5f, 12.0f)
        curveTo(12.7761f, 12.0f, 13.0f, 11.7761f, 13.0f, 11.5f)
        verticalLineTo(9.5f)
        curveTo(13.0f, 9.2239f, 12.7761f, 9.0f, 12.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 14.0f)
        curveTo(12.7761f, 14.0f, 13.0f, 13.7761f, 13.0f, 13.5f)
        curveTo(13.0f, 13.2239f, 12.7761f, 13.0f, 12.5f, 13.0f)
        curveTo(12.2239f, 13.0f, 12.0f, 13.2239f, 12.0f, 13.5f)
        curveTo(12.0f, 13.7761f, 12.2239f, 14.0f, 12.5f, 14.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.0f, 1.5f)
        curveTo(14.0f, 1.2239f, 13.7761f, 1.0f, 13.5f, 1.0f)
        curveTo(13.2239f, 1.0f, 13.0f, 1.2239f, 13.0f, 1.5f)
        verticalLineTo(4.6824f)
        curveTo(11.9256f, 3.0663f, 10.0877f, 2.0f, 8.0f, 2.0f)
        curveTo(4.6863f, 2.0f, 2.0f, 4.6863f, 2.0f, 8.0f)
        curveTo(2.0f, 11.3137f, 4.6863f, 14.0f, 8.0f, 14.0f)
        curveTo(8.2467f, 14.0f, 8.4899f, 13.9851f, 8.7288f, 13.9562f)
        curveTo(8.5342f, 13.658f, 8.374f, 13.3353f, 8.2538f, 12.9937f)
        curveTo(8.1698f, 12.9979f, 8.0851f, 13.0f, 8.0f, 13.0f)
        curveTo(5.2386f, 13.0f, 3.0f, 10.7614f, 3.0f, 8.0f)
        curveTo(3.0f, 5.2386f, 5.2386f, 3.0f, 8.0f, 3.0f)
        curveTo(9.6353f, 3.0f, 11.0878f, 3.785f, 12.0005f, 5.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 5.0f, 9.0f, 5.2239f, 9.0f, 5.5f)
        curveTo(9.0f, 5.7761f, 9.2239f, 6.0f, 9.5f, 6.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(1.5f)
        close()
    }
}
.build()
