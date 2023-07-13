package org.jetbrains.jewel.icons.allicons.meetnewui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.MeetnewuiGroup

public val MeetnewuiGroup.LightThemeSelected: IntellijIconData
    get() {
        if (_lightThemeSelected != null) {
            return _lightThemeSelected!!
        }
        _lightThemeSelected = IntellijIconData(name = "LightThemeSelected",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { LightThemeSelectedComposable(it) })
        return _lightThemeSelected!!
    }

private var _lightThemeSelected: IntellijIconData? = null

private fun LightThemeSelectedComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "LightThemeSelected", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    group {
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(8.5f, 1.0f)
            curveTo(8.5f, 0.7239f, 8.2761f, 0.5f, 8.0f, 0.5f)
            curveTo(7.7239f, 0.5f, 7.5f, 0.7239f, 7.5f, 1.0f)
            verticalLineTo(3.0247f)
            curveTo(7.6645f, 3.0084f, 7.8313f, 3.0f, 8.0f, 3.0f)
            curveTo(8.1687f, 3.0f, 8.3356f, 3.0084f, 8.5f, 3.0247f)
            verticalLineTo(1.0f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(3.4038f, 2.6967f)
            lineTo(4.8356f, 4.1285f)
            curveTo(4.5771f, 4.3401f, 4.3401f, 4.5771f, 4.1285f, 4.8356f)
            lineTo(2.6967f, 3.4038f)
            curveTo(2.5014f, 3.2085f, 2.5014f, 2.892f, 2.6967f, 2.6967f)
            curveTo(2.892f, 2.5014f, 3.2085f, 2.5014f, 3.4038f, 2.6967f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(3.0247f, 7.5f)
            horizontalLineTo(1.0f)
            curveTo(0.7239f, 7.5f, 0.5f, 7.7239f, 0.5f, 8.0f)
            curveTo(0.5f, 8.2761f, 0.7239f, 8.5f, 1.0f, 8.5f)
            horizontalLineTo(3.0247f)
            curveTo(3.0084f, 8.3356f, 3.0f, 8.1687f, 3.0f, 8.0f)
            curveTo(3.0f, 7.8313f, 3.0084f, 7.6645f, 3.0247f, 7.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(2.6967f, 12.5962f)
            lineTo(4.1285f, 11.1644f)
            curveTo(4.3401f, 11.4229f, 4.5771f, 11.6599f, 4.8356f, 11.8715f)
            lineTo(3.4038f, 13.3033f)
            curveTo(3.2085f, 13.4986f, 2.892f, 13.4986f, 2.6967f, 13.3033f)
            curveTo(2.5014f, 13.108f, 2.5014f, 12.7915f, 2.6967f, 12.5962f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(7.5f, 12.9753f)
            verticalLineTo(15.0f)
            curveTo(7.5f, 15.2761f, 7.7239f, 15.5f, 8.0f, 15.5f)
            curveTo(8.2761f, 15.5f, 8.5f, 15.2761f, 8.5f, 15.0f)
            verticalLineTo(12.9753f)
            curveTo(8.3356f, 12.9916f, 8.1687f, 13.0f, 8.0f, 13.0f)
            curveTo(7.8313f, 13.0f, 7.6645f, 12.9916f, 7.5f, 12.9753f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(12.5962f, 13.3033f)
            lineTo(11.1644f, 11.8715f)
            curveTo(11.4229f, 11.6599f, 11.6599f, 11.4229f, 11.8715f, 11.1644f)
            lineTo(13.3033f, 12.5962f)
            curveTo(13.4986f, 12.7915f, 13.4986f, 13.108f, 13.3033f, 13.3033f)
            curveTo(13.108f, 13.4986f, 12.7915f, 13.4986f, 12.5962f, 13.3033f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(12.9753f, 8.5f)
            horizontalLineTo(15.0f)
            curveTo(15.2761f, 8.5f, 15.5f, 8.2761f, 15.5f, 8.0f)
            curveTo(15.5f, 7.7239f, 15.2761f, 7.5f, 15.0f, 7.5f)
            horizontalLineTo(12.9753f)
            curveTo(12.9916f, 7.6645f, 13.0f, 7.8313f, 13.0f, 8.0f)
            curveTo(13.0f, 8.1687f, 12.9916f, 8.3356f, 12.9753f, 8.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(13.3033f, 3.4038f)
            lineTo(11.8715f, 4.8356f)
            curveTo(11.6599f, 4.5771f, 11.4229f, 4.3401f, 11.1644f, 4.1285f)
            lineTo(12.5962f, 2.6967f)
            curveTo(12.7915f, 2.5014f, 13.108f, 2.5014f, 13.3033f, 2.6967f)
            curveTo(13.4986f, 2.892f, 13.4986f, 3.2085f, 13.3033f, 3.4038f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                EvenOdd) {
            moveTo(12.0f, 8.0f)
            curveTo(12.0f, 10.2091f, 10.2091f, 12.0f, 8.0f, 12.0f)
            curveTo(5.7909f, 12.0f, 4.0f, 10.2091f, 4.0f, 8.0f)
            curveTo(4.0f, 5.7909f, 5.7909f, 4.0f, 8.0f, 4.0f)
            curveTo(10.2091f, 4.0f, 12.0f, 5.7909f, 12.0f, 8.0f)
            close()
            moveTo(11.0f, 8.0f)
            curveTo(11.0f, 9.6568f, 9.6568f, 11.0f, 8.0f, 11.0f)
            curveTo(6.3432f, 11.0f, 5.0f, 9.6568f, 5.0f, 8.0f)
            curveTo(5.0f, 6.3432f, 6.3432f, 5.0f, 8.0f, 5.0f)
            curveTo(9.6568f, 5.0f, 11.0f, 6.3432f, 11.0f, 8.0f)
            close()
        }
        path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(8.0f, 8.0f)
            moveToRelative(-3.0f, 0.0f)
            arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
            arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
        }
    }
}
.build()
