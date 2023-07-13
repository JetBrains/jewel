package org.jetbrains.jewel.icons.allicons.javaee

import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.JavaeeGroup

public val JavaeeGroup.Home: IntellijIconData
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = IntellijIconData(name = "Home",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { HomeComposable(it) })
        return _home!!
    }

private var _home: IntellijIconData? = null

private fun HomeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Home",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.8385f, 8.6323f)
        lineTo(15.3385f, 10.9364f)
        curveTo(15.4414f, 11.0312f, 15.5f, 11.1649f, 15.5f, 11.3051f)
        verticalLineTo(14.999f)
        curveTo(15.5f, 15.2762f, 15.2757f, 15.5f, 15.0f, 15.5f)
        horizontalLineTo(10.0f)
        curveTo(9.7243f, 15.5f, 9.5f, 15.2762f, 9.5f, 14.999f)
        verticalLineTo(11.3051f)
        curveTo(9.5f, 11.1649f, 9.5586f, 11.0312f, 9.6615f, 10.9364f)
        lineTo(12.1615f, 8.6323f)
        curveTo(12.3528f, 8.4559f, 12.6472f, 8.4559f, 12.8385f, 8.6323f)
        close()
    }
    path(fill = SolidColor(colorScheme.greenFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.9776f, 8.5639f)
        curveTo(14.9924f, 8.3779f, 15.0f, 8.1898f, 15.0f, 8.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        curveTo(8.0f, 14.9997f, 8.0f, 15.0003f, 8.0f, 15.0f)
        verticalLineTo(11.3051f)
        curveTo(8.0f, 10.7461f, 8.2337f, 10.2124f, 8.6449f, 9.8334f)
        lineTo(11.1449f, 7.5293f)
        curveTo(11.9106f, 6.8236f, 13.0894f, 6.8236f, 13.8551f, 7.5293f)
        lineTo(14.9776f, 8.5639f)
        close()
    }
    path(fill = SolidColor(colorScheme.greenStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.9776f, 8.5639f)
        curveTo(14.9924f, 8.3779f, 15.0f, 8.1898f, 15.0f, 8.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        curveTo(8.0f, 14.9997f, 8.0f, 15.0003f, 8.0f, 15.0f)
        verticalLineTo(14.0f)
        curveTo(4.6863f, 14.0f, 2.0f, 11.3137f, 2.0f, 8.0f)
        curveTo(2.0f, 4.6863f, 4.6863f, 2.0f, 8.0f, 2.0f)
        curveTo(11.1975f, 2.0f, 13.8108f, 4.5012f, 13.9902f, 7.6538f)
        lineTo(14.9776f, 8.5639f)
        close()
    }
    path(fill = SolidColor(colorScheme.greenStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 11.5f)
        horizontalLineTo(6.0f)
        verticalLineTo(10.5f)
        horizontalLineTo(7.5f)
        verticalLineTo(5.5f)
        horizontalLineTo(6.0f)
        verticalLineTo(4.5f)
        horizontalLineTo(10.0f)
        verticalLineTo(5.5f)
        horizontalLineTo(8.5f)
        verticalLineTo(9.9816f)
        curveTo(8.1793f, 10.3454f, 8.0f, 10.8156f, 8.0f, 11.3051f)
        verticalLineTo(11.5f)
        close()
    }
}
.build()
