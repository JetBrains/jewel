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

public val GeneralGroup.SplitVertically: IntellijIconData
    get() {
        if (_splitVertically != null) {
            return _splitVertically!!
        }
        _splitVertically = IntellijIconData(name = "SplitVertically",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { SplitVerticallyComposable(it) })
        return _splitVertically!!
    }

private var _splitVertically: IntellijIconData? = null

private fun SplitVerticallyComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "SplitVertically", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.5f, 3.0f)
        horizontalLineTo(12.0f)
        curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(13.0f, 12.5523f, 12.5523f, 13.0f, 12.0f, 13.0f)
        horizontalLineTo(8.5f)
        verticalLineTo(3.0f)
        close()
        moveTo(7.5f, 2.0f)
        horizontalLineTo(8.5f)
        horizontalLineTo(12.0f)
        curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
        horizontalLineTo(8.5f)
        horizontalLineTo(7.5f)
        horizontalLineTo(4.0f)
        curveTo(2.8954f, 14.0f, 2.0f, 13.1046f, 2.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
        horizontalLineTo(7.5f)
        close()
        moveTo(7.5f, 13.0f)
        horizontalLineTo(4.0f)
        curveTo(3.4477f, 13.0f, 3.0f, 12.5523f, 3.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
        horizontalLineTo(7.5f)
        verticalLineTo(13.0f)
        close()
    }
}
.build()
