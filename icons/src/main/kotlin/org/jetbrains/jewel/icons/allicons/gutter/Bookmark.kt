package org.jetbrains.jewel.icons.allicons.gutter

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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.Bookmark: IntellijIconData
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = IntellijIconData(name = "Bookmark",size = DpSize(height = 14.0.dp, width =
                14.0.dp),imageVector = { BookmarkComposable(it) })
        return _bookmark!!
    }

private var _bookmark: IntellijIconData? = null

private fun BookmarkComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Bookmark", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFFFAF0F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.0f, 2.4883f)
        curveTo(2.0f, 1.6599f, 2.6716f, 0.9883f, 3.5f, 0.9883f)
        horizontalLineTo(10.5f)
        curveTo(11.3284f, 0.9883f, 12.0f, 1.6599f, 12.0f, 2.4883f)
        verticalLineTo(13.5968f)
        curveTo(12.0f, 13.917f, 11.6425f, 14.1075f, 11.3768f, 13.9289f)
        lineTo(7.0f, 10.9883f)
        lineTo(2.6234f, 13.9322f)
        curveTo(2.3577f, 14.111f, 2.0f, 13.9205f, 2.0f, 13.6002f)
        verticalLineTo(2.4883f)
        close()
    }
}
.build()
