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

public val NodesGroup.ClassInitializer: IntellijIconData
    get() {
        if (_classInitializer != null) {
            return _classInitializer!!
        }
        _classInitializer = IntellijIconData(name = "ClassInitializer",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { ClassInitializerComposable(it) })
        return _classInitializer!!
    }

private var _classInitializer: IntellijIconData? = null

private fun ClassInitializerComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ClassInitializer", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.orangeFill), stroke = SolidColor(Color(0xFFE66D17)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(5.0f, 6.0f)
        curveTo(4.7239f, 6.0f, 4.5f, 6.2239f, 4.5f, 6.5f)
        curveTo(4.5f, 6.7761f, 4.7239f, 7.0f, 5.0f, 7.0f)
        horizontalLineTo(11.0f)
        curveTo(11.2761f, 7.0f, 11.5f, 6.7761f, 11.5f, 6.5f)
        curveTo(11.5f, 6.2239f, 11.2761f, 6.0f, 11.0f, 6.0f)
        horizontalLineTo(5.0f)
        close()
        moveTo(5.0f, 9.0f)
        curveTo(4.7239f, 9.0f, 4.5f, 9.2239f, 4.5f, 9.5f)
        curveTo(4.5f, 9.7761f, 4.7239f, 10.0f, 5.0f, 10.0f)
        horizontalLineTo(11.0f)
        curveTo(11.2762f, 10.0f, 11.5f, 9.7761f, 11.5f, 9.5f)
        curveTo(11.5f, 9.2239f, 11.2762f, 9.0f, 11.0f, 9.0f)
        horizontalLineTo(5.0f)
        close()
    }
}
.build()
