package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Test: IntellijIconData
    get() {
        if (_test != null) {
            return _test!!
        }
        _test = IntellijIconData(name = "Test",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { TestComposable(it) })
        return _test!!
    }

private var _test: IntellijIconData? = null

private fun TestComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Test",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFF7F7)), stroke = SolidColor(Color(0xFFDB3B4B)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.4622f, 11.5f)
        horizontalLineTo(9.4606f)
        verticalLineTo(10.5943f)
        horizontalLineTo(8.5931f)
        curveTo(8.2657f, 10.5943f, 8.0202f, 10.3488f, 8.0202f, 10.0214f)
        verticalLineTo(6.8188f)
        horizontalLineTo(9.4606f)
        lineTo(9.4661f, 5.9131f)
        horizontalLineTo(8.0202f)
        verticalLineTo(4.5f)
        horizontalLineTo(7.0764f)
        verticalLineTo(5.4493f)
        curveTo(7.0764f, 5.7221f, 6.8854f, 5.9131f, 6.6126f, 5.9131f)
        horizontalLineTo(5.9088f)
        lineTo(5.9033f, 6.8188f)
        horizontalLineTo(6.9836f)
        lineTo(6.9891f, 10.1142f)
        curveTo(6.9891f, 10.9108f, 7.611f, 11.5f, 8.4622f, 11.5f)
        close()
    }
}
.build()
