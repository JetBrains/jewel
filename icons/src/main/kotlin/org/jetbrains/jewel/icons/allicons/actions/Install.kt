package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.Install: IntellijIconData
    get() {
        if (_install != null) {
            return _install!!
        }
        _install = IntellijIconData(imageVector = { InstallComposable(it) })
        return _install!!
    }

private var _install: IntellijIconData? = null

private fun InstallComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Install", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF369650)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.9999f, 1.0f)
        curveTo(8.2761f, 1.0f, 8.4999f, 1.2239f, 8.4999f, 1.5f)
        lineTo(8.4998f, 6.7929f)
        lineTo(10.1461f, 5.1466f)
        curveTo(10.3414f, 4.9513f, 10.658f, 4.9513f, 10.8532f, 5.1466f)
        curveTo(11.0485f, 5.3419f, 11.0485f, 5.6585f, 10.8532f, 5.8537f)
        lineTo(7.9998f, 8.7071f)
        lineTo(5.1465f, 5.8537f)
        curveTo(4.9512f, 5.6585f, 4.9512f, 5.3419f, 5.1465f, 5.1466f)
        curveTo(5.3417f, 4.9513f, 5.6583f, 4.9513f, 5.8535f, 5.1466f)
        lineTo(7.4998f, 6.7929f)
        lineTo(7.4999f, 1.5f)
        curveTo(7.4999f, 1.2239f, 7.7238f, 1.0f, 7.9999f, 1.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF369650)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.0f, 12.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(12.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF369650)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(2.0f, 11.0f)
        verticalLineTo(14.0f)
        curveTo(2.0f, 14.5523f, 2.4477f, 15.0f, 3.0f, 15.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 15.0f, 14.0f, 14.5523f, 14.0f, 14.0f)
        verticalLineTo(11.0f)
        curveTo(14.0f, 10.4477f, 13.5523f, 10.0f, 13.0f, 10.0f)
        horizontalLineTo(3.0f)
        curveTo(2.4477f, 10.0f, 2.0f, 10.4477f, 2.0f, 11.0f)
        close()
        moveTo(3.0f, 14.0f)
        verticalLineTo(11.0f)
        horizontalLineTo(13.0f)
        lineTo(13.0f, 14.0f)
        horizontalLineTo(3.0f)
        close()
    }
}
.build()
