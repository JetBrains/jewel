package org.jetbrains.jewel.icons.allicons.nodes

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

public val NodesGroup.Interface: IntellijIconData
    get() {
        if (_interface != null) {
            return _interface!!
        }
        _interface = IntellijIconData(name = "Interface",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { InterfaceComposable(it) })
        return _interface!!
    }

private var _interface: IntellijIconData? = null

private fun InterfaceComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Interface", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.greenFill), stroke = SolidColor(colorScheme.greenStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.greenStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.0f, 4.5f)
        verticalLineTo(5.5f)
        lineTo(8.5f, 5.5f)
        verticalLineTo(10.5f)
        horizontalLineTo(10.0f)
        verticalLineTo(11.5f)
        lineTo(8.5f, 11.5f)
        horizontalLineTo(7.5f)
        lineTo(6.0f, 11.5f)
        verticalLineTo(10.5f)
        horizontalLineTo(7.5f)
        verticalLineTo(5.5f)
        lineTo(6.0f, 5.5f)
        verticalLineTo(4.5f)
        horizontalLineTo(7.5f)
        horizontalLineTo(8.5f)
        horizontalLineTo(10.0f)
        close()
    }
}
.build()
