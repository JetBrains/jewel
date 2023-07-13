package org.jetbrains.jewel.icons.allicons.vcs

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
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.IntelliSort: IntellijIconData
    get() {
        if (_intelliSort != null) {
            return _intelliSort!!
        }
        _intelliSort = IntellijIconData(name = "IntelliSort",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { IntelliSortComposable(it) })
        return _intelliSort!!
    }

private var _intelliSort: IntellijIconData? = null

private fun IntelliSortComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "IntelliSort", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.1465f, 10.6536f)
        curveTo(0.9512f, 10.4583f, 0.9512f, 10.1417f, 1.1465f, 9.9465f)
        curveTo(1.3417f, 9.7512f, 1.6583f, 9.7512f, 1.8535f, 9.9465f)
        lineTo(4.0f, 12.0929f)
        lineTo(4.0f, 2.5f)
        curveTo(4.0f, 2.2239f, 4.2239f, 2.0f, 4.5f, 2.0f)
        curveTo(4.7761f, 2.0f, 5.0f, 2.2239f, 5.0f, 2.5f)
        lineTo(5.0f, 12.0929f)
        lineTo(7.1465f, 9.9465f)
        curveTo(7.3417f, 9.7512f, 7.6583f, 9.7512f, 7.8535f, 9.9465f)
        curveTo(8.0488f, 10.1417f, 8.0488f, 10.4583f, 7.8535f, 10.6536f)
        lineTo(4.8535f, 13.6536f)
        lineTo(4.5f, 14.0071f)
        lineTo(4.1465f, 13.6536f)
        lineTo(1.1465f, 10.6536f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.0f, 2.5f)
        curveTo(11.0f, 2.2239f, 11.2239f, 2.0f, 11.5f, 2.0f)
        curveTo(11.7761f, 2.0f, 12.0f, 2.2239f, 12.0f, 2.5f)
        verticalLineTo(3.5f)
        curveTo(12.0f, 3.521f, 11.9987f, 3.5417f, 11.9962f, 3.562f)
        curveTo(12.8607f, 3.7827f, 13.5f, 4.5667f, 13.5f, 5.5f)
        curveTo(13.5f, 6.4333f, 12.8607f, 7.2173f, 11.9962f, 7.438f)
        curveTo(11.9987f, 7.4583f, 12.0f, 7.479f, 12.0f, 7.5f)
        verticalLineTo(8.5f)
        curveTo(12.0f, 8.521f, 11.9987f, 8.5417f, 11.9962f, 8.562f)
        curveTo(12.8607f, 8.7827f, 13.5f, 9.5667f, 13.5f, 10.5f)
        curveTo(13.5f, 11.4333f, 12.8607f, 12.2173f, 11.9962f, 12.438f)
        curveTo(11.9987f, 12.4583f, 12.0f, 12.479f, 12.0f, 12.5f)
        verticalLineTo(13.5f)
        curveTo(12.0f, 13.7761f, 11.7761f, 14.0f, 11.5f, 14.0f)
        curveTo(11.2239f, 14.0f, 11.0f, 13.7761f, 11.0f, 13.5f)
        verticalLineTo(12.5f)
        curveTo(11.0f, 12.479f, 11.0013f, 12.4583f, 11.0038f, 12.438f)
        curveTo(10.1393f, 12.2173f, 9.5f, 11.4333f, 9.5f, 10.5f)
        curveTo(9.5f, 9.5667f, 10.1393f, 8.7827f, 11.0038f, 8.562f)
        curveTo(11.0013f, 8.5417f, 11.0f, 8.521f, 11.0f, 8.5f)
        verticalLineTo(7.5f)
        curveTo(11.0f, 7.479f, 11.0013f, 7.4583f, 11.0038f, 7.438f)
        curveTo(10.1393f, 7.2173f, 9.5f, 6.4333f, 9.5f, 5.5f)
        curveTo(9.5f, 4.5667f, 10.1393f, 3.7827f, 11.0038f, 3.562f)
        curveTo(11.0013f, 3.5417f, 11.0f, 3.521f, 11.0f, 3.5f)
        verticalLineTo(2.5f)
        close()
        moveTo(11.5f, 6.5f)
        curveTo(12.0523f, 6.5f, 12.5f, 6.0523f, 12.5f, 5.5f)
        curveTo(12.5f, 4.9477f, 12.0523f, 4.5f, 11.5f, 4.5f)
        curveTo(10.9477f, 4.5f, 10.5f, 4.9477f, 10.5f, 5.5f)
        curveTo(10.5f, 6.0523f, 10.9477f, 6.5f, 11.5f, 6.5f)
        close()
        moveTo(12.5f, 10.5f)
        curveTo(12.5f, 11.0523f, 12.0523f, 11.5f, 11.5f, 11.5f)
        curveTo(10.9477f, 11.5f, 10.5f, 11.0523f, 10.5f, 10.5f)
        curveTo(10.5f, 9.9477f, 10.9477f, 9.5f, 11.5f, 9.5f)
        curveTo(12.0523f, 9.5f, 12.5f, 9.9477f, 12.5f, 10.5f)
        close()
    }
}
.build()
