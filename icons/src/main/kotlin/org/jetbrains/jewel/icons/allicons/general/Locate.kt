package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Locate: IntellijIconData
    get() {
        if (_locate != null) {
            return _locate!!
        }
        _locate = IntellijIconData(name = "Locate",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { LocateComposable(it) })
        return _locate!!
    }

private var _locate: IntellijIconData? = null

private fun LocateComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Locate", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.5f, 5.0f)
        verticalLineTo(2.0205f)
        curveTo(11.4149f, 2.261f, 13.739f, 4.5851f, 13.9795f, 7.5f)
        horizontalLineTo(11.0f)
        curveTo(10.7239f, 7.5f, 10.5f, 7.7239f, 10.5f, 8.0f)
        curveTo(10.5f, 8.2761f, 10.7239f, 8.5f, 11.0f, 8.5f)
        horizontalLineTo(13.9795f)
        curveTo(13.739f, 11.4149f, 11.4149f, 13.739f, 8.5f, 13.9795f)
        verticalLineTo(11.0f)
        curveTo(8.5f, 10.7239f, 8.2761f, 10.5f, 8.0f, 10.5f)
        curveTo(7.7239f, 10.5f, 7.5f, 10.7239f, 7.5f, 11.0f)
        verticalLineTo(13.9795f)
        curveTo(4.5851f, 13.739f, 2.261f, 11.4149f, 2.0205f, 8.5f)
        horizontalLineTo(5.0f)
        curveTo(5.2761f, 8.5f, 5.5f, 8.2761f, 5.5f, 8.0f)
        curveTo(5.5f, 7.7239f, 5.2761f, 7.5f, 5.0f, 7.5f)
        horizontalLineTo(2.0205f)
        curveTo(2.261f, 4.5851f, 4.5851f, 2.261f, 7.5f, 2.0205f)
        verticalLineTo(5.0f)
        curveTo(7.5f, 5.2761f, 7.7239f, 5.5f, 8.0f, 5.5f)
        curveTo(8.2761f, 5.5f, 8.5f, 5.2761f, 8.5f, 5.0f)
        close()
        moveTo(1.0f, 8.0f)
        curveTo(1.0f, 4.134f, 4.134f, 1.0f, 8.0f, 1.0f)
        curveTo(11.866f, 1.0f, 15.0f, 4.134f, 15.0f, 8.0f)
        curveTo(15.0f, 11.866f, 11.866f, 15.0f, 8.0f, 15.0f)
        curveTo(4.134f, 15.0f, 1.0f, 11.866f, 1.0f, 8.0f)
        close()
    }
}
.build()
