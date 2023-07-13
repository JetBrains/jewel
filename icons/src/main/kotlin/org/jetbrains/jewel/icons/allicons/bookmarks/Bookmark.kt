package org.jetbrains.jewel.icons.allicons.bookmarks

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
import org.jetbrains.jewel.icons.allicons.BookmarksGroup

public val BookmarksGroup.Bookmark: IntellijIconData
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = IntellijIconData(name = "Bookmark",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { BookmarkComposable(it) })
        return _bookmark!!
    }

private var _bookmark: IntellijIconData? = null

private fun BookmarkComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Bookmark", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFAF0F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 3.5f)
        curveTo(3.0f, 2.3954f, 3.8954f, 1.5f, 5.0f, 1.5f)
        horizontalLineTo(10.9989f)
        curveTo(12.1034f, 1.5f, 12.9989f, 2.3954f, 12.9989f, 3.5f)
        verticalLineTo(14.9184f)
        curveTo(12.9989f, 15.3379f, 12.5134f, 15.5709f, 12.1861f, 15.3085f)
        lineTo(7.9994f, 11.9524f)
        lineTo(3.8127f, 15.3085f)
        curveTo(3.4854f, 15.5709f, 3.0f, 15.3379f, 3.0f, 14.9184f)
        verticalLineTo(3.5f)
        close()
    }
}
.build()
