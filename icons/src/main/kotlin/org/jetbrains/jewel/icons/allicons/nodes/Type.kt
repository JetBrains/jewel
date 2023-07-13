package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Type: IntellijIconData
    get() {
        if (_type != null) {
            return _type!!
        }
        _type = IntellijIconData(name = "Type",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { TypeComposable(it) })
        return _type!!
    }

private var _type: IntellijIconData? = null

private fun TypeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Type",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFE7EFFD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.0f, 8.0f)
        curveTo(1.0f, 4.134f, 4.134f, 1.0f, 8.0f, 1.0f)
        verticalLineTo(1.0f)
        curveTo(11.866f, 1.0f, 15.0f, 4.134f, 15.0f, 8.0f)
        verticalLineTo(8.0f)
        curveTo(15.0f, 11.866f, 11.866f, 15.0f, 8.0f, 15.0f)
        verticalLineTo(15.0f)
        curveTo(4.134f, 15.0f, 1.0f, 11.866f, 1.0f, 8.0f)
        verticalLineTo(8.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(2.0f, 8.0f)
        curveTo(2.0f, 11.3137f, 4.6863f, 14.0f, 8.0f, 14.0f)
        curveTo(11.3137f, 14.0f, 14.0f, 11.3137f, 14.0f, 8.0f)
        curveTo(14.0f, 4.6863f, 11.3137f, 2.0f, 8.0f, 2.0f)
        curveTo(4.6863f, 2.0f, 2.0f, 4.6863f, 2.0f, 8.0f)
        close()
        moveTo(8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        curveTo(11.866f, 15.0f, 15.0f, 11.866f, 15.0f, 8.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(7.5f, 6.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(8.5f)
        verticalLineTo(12.0f)
        horizontalLineTo(7.5f)
        verticalLineTo(6.0f)
        close()
    }
}
.build()
