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

public val NodesGroup.PpWeb: IntellijIconData
    get() {
        if (_ppWeb != null) {
            return _ppWeb!!
        }
        _ppWeb = IntellijIconData(name = "PpWeb",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { PpWebComposable(it) })
        return _ppWeb!!
    }

private var _ppWeb: IntellijIconData? = null

private fun PpWebComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "PpWeb",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 8.0f)
        curveTo(10.5f, 9.8819f, 10.1721f, 11.5619f, 9.6617f, 12.7528f)
        curveTo(9.4062f, 13.3491f, 9.1147f, 13.7997f, 8.8165f, 14.094f)
        curveTo(8.5205f, 14.3862f, 8.2451f, 14.5f, 8.0f, 14.5f)
        curveTo(7.7549f, 14.5f, 7.4795f, 14.3862f, 7.1835f, 14.094f)
        curveTo(6.8853f, 13.7997f, 6.5938f, 13.3491f, 6.3383f, 12.7528f)
        curveTo(5.8279f, 11.5619f, 5.5f, 9.8819f, 5.5f, 8.0f)
        curveTo(5.5f, 6.1181f, 5.8279f, 4.4381f, 6.3383f, 3.2472f)
        curveTo(6.5938f, 2.6509f, 6.8853f, 2.2003f, 7.1835f, 1.906f)
        curveTo(7.4795f, 1.6138f, 7.7549f, 1.5f, 8.0f, 1.5f)
        curveTo(8.2451f, 1.5f, 8.5205f, 1.6138f, 8.8165f, 1.906f)
        curveTo(9.1147f, 2.2003f, 9.4062f, 2.6509f, 9.6617f, 3.2472f)
        curveTo(10.1721f, 4.4381f, 10.5f, 6.1181f, 10.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(14.2218f, 5.5f)
        horizontalLineTo(1.7773f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(14.2218f, 10.5f)
        horizontalLineTo(1.7773f)
    }
}
.build()
