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

public val MeetnewuiGroup.DarkThemeSelected: IntellijIconData
    get() {
        if (_darkThemeSelected != null) {
            return _darkThemeSelected!!
        }
        _darkThemeSelected = IntellijIconData(name = "DarkThemeSelected",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { DarkThemeSelectedComposable(it) })
        return _darkThemeSelected!!
    }

private var _darkThemeSelected: IntellijIconData? = null

private fun DarkThemeSelectedComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "DarkThemeSelected", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.5f, 10.5f)
        curveTo(12.485f, 10.5f, 13.4152f, 10.2623f, 14.2356f, 9.8414f)
        curveTo(13.4417f, 12.5343f, 10.9502f, 14.5f, 8.0f, 14.5f)
        curveTo(4.4102f, 14.5f, 1.5f, 11.5899f, 1.5f, 8.0f)
        curveTo(1.5f, 5.0498f, 3.4657f, 2.5583f, 6.1586f, 1.7644f)
        curveTo(5.7377f, 2.5848f, 5.5f, 3.515f, 5.5f, 4.5f)
        curveTo(5.5f, 7.8137f, 8.1863f, 10.5f, 11.5f, 10.5f)
        close()
    }
}
.build()
