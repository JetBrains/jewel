package org.jetbrains.jewel.icons.allicons.codeinsight

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
import org.jetbrains.jewel.icons.allicons.CodeinsightGroup

public val CodeinsightGroup.InlayGlobe: IntellijIconData
    get() {
        if (_inlayGlobe != null) {
            return _inlayGlobe!!
        }
        _inlayGlobe = IntellijIconData(name = "InlayGlobe",size = DpSize(height = 12.0.dp, width =
                12.0.dp),imageVector = { InlayGlobeComposable(it) })
        return _inlayGlobe!!
    }

private var _inlayGlobe: IntellijIconData? = null

private fun InlayGlobeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "InlayGlobe", defaultWidth = 12.0.dp, defaultHeight = 12.0.dp, viewportWidth = 12.0f,
        viewportHeight = 12.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 6.0f)
        curveTo(8.0f, 7.4642f, 7.7292f, 8.7656f, 7.3126f, 9.6822f)
        curveTo(6.8754f, 10.6439f, 6.3737f, 11.0f, 6.0f, 11.0f)
        curveTo(5.6263f, 11.0f, 5.1246f, 10.6439f, 4.6874f, 9.6822f)
        curveTo(4.2708f, 8.7656f, 4.0f, 7.4642f, 4.0f, 6.0f)
        curveTo(4.0f, 4.5358f, 4.2708f, 3.2344f, 4.6874f, 2.3178f)
        curveTo(5.1246f, 1.3561f, 5.6263f, 1.0f, 6.0f, 1.0f)
        curveTo(6.3737f, 1.0f, 6.8754f, 1.3561f, 7.3126f, 2.3178f)
        curveTo(7.7292f, 3.2344f, 8.0f, 4.5358f, 8.0f, 6.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.0f, 6.0f)
        moveToRelative(-5.0f, 0.0f)
        arcToRelative(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f)
        arcToRelative(5.0f, 5.0f, 0.0f, true, true, -10.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 4.3f)
        horizontalLineTo(1.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 7.7f)
        horizontalLineTo(1.5f)
    }
}
.build()
