package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Show: IntellijIconData
    get() {
        if (_show != null) {
            return _show!!
        }
        _show = IntellijIconData(name = "Show",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ShowComposable(it) })
        return _show!!
    }

private var _show: IntellijIconData? = null

private fun ShowComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Show",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-2.5f, 0.0f)
        arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
        arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.348f, 11.4645f)
        curveTo(2.0328f, 10.5496f, 1.0144f, 9.3186f, 0.5298f, 8.0f)
        curveTo(1.0144f, 6.6814f, 2.0328f, 5.4504f, 3.348f, 4.5354f)
        curveTo(4.714f, 3.5852f, 6.366f, 3.0f, 8.0f, 3.0f)
        curveTo(9.634f, 3.0f, 11.286f, 3.5852f, 12.652f, 4.5354f)
        curveTo(13.9672f, 5.4504f, 14.9856f, 6.6814f, 15.4702f, 8.0f)
        curveTo(14.9856f, 9.3186f, 13.9672f, 10.5496f, 12.652f, 11.4645f)
        curveTo(11.286f, 12.4148f, 9.634f, 13.0f, 8.0f, 13.0f)
        curveTo(6.366f, 13.0f, 4.714f, 12.4148f, 3.348f, 11.4645f)
        close()
    }
}
.build()
