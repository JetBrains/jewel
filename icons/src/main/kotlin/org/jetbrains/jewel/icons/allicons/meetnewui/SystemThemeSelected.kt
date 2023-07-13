package org.jetbrains.jewel.icons.allicons.meetnewui

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
import org.jetbrains.jewel.icons.allicons.MeetnewuiGroup

public val MeetnewuiGroup.SystemThemeSelected: IntellijIconData
    get() {
        if (_systemThemeSelected != null) {
            return _systemThemeSelected!!
        }
        _systemThemeSelected = IntellijIconData(name = "SystemThemeSelected",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { SystemThemeSelectedComposable(it) })
        return _systemThemeSelected!!
    }

private var _systemThemeSelected: IntellijIconData? = null

private fun SystemThemeSelectedComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "SystemThemeSelected", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 8.0f)
        curveTo(1.5f, 11.5899f, 4.4102f, 14.5f, 8.0f, 14.5f)
        verticalLineTo(1.5f)
        curveTo(4.4102f, 1.5f, 1.5f, 4.4102f, 1.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 2.0f)
        verticalLineTo(14.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
}
.build()
