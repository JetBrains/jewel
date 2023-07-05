package org.jetbrains.jewel.icons.allicons.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.Rerun: IntellijIconData
    get() {
        if (_rerun != null) {
            return _rerun!!
        }
        _rerun = IntellijIconData(imageVector = { RerunComposable(it) })
        return _rerun!!
    }

private var _rerun: IntellijIconData? = null

private fun RerunComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Rerun",
        defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f, viewportHeight =
        14.0f).apply {
    path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.3563f, 6.2593f)
        curveTo(8.8171f, 6.6581f, 8.8171f, 7.3728f, 8.3563f, 7.7716f)
        lineTo(3.1575f, 12.2709f)
        curveTo(2.5098f, 12.8315f, 1.5031f, 12.3714f, 1.5031f, 11.5148f)
        lineTo(1.5031f, 2.5161f)
        curveTo(1.5031f, 1.6595f, 2.5098f, 1.1994f, 3.1575f, 1.76f)
        lineTo(8.3563f, 6.2593f)
        close()
    }
    path(fill = SolidColor(Color(0xFF208A3C)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(8.6835f, 5.8812f)
        curveTo(9.3747f, 6.4794f, 9.3747f, 7.5515f, 8.6835f, 8.1497f)
        lineTo(3.4848f, 12.649f)
        curveTo(2.5132f, 13.4899f, 1.0031f, 12.7997f, 1.0031f, 11.5148f)
        lineTo(1.0031f, 2.5161f)
        curveTo(1.0031f, 1.2312f, 2.5132f, 0.5411f, 3.4848f, 1.3819f)
        lineTo(8.6835f, 5.8812f)
        close()
        moveTo(8.0291f, 7.3935f)
        curveTo(8.2595f, 7.1941f, 8.2595f, 6.8368f, 8.0291f, 6.6374f)
        lineTo(2.8303f, 2.1381f)
        curveTo(2.5065f, 1.8578f, 2.0031f, 2.0878f, 2.0031f, 2.5161f)
        lineTo(2.0031f, 11.5148f)
        curveTo(2.0031f, 11.9431f, 2.5065f, 12.1731f, 2.8303f, 11.8929f)
        lineTo(8.0291f, 7.3935f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF208A3C)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.8572f, 1.5f)
        lineTo(12.3563f, 6.2593f)
        curveTo(12.8171f, 6.6581f, 12.8171f, 7.3728f, 12.3563f, 7.7716f)
        lineTo(6.8928f, 12.5f)
    }
}
.build()
