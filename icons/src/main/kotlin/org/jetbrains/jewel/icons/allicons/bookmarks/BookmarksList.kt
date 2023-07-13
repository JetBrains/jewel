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

public val BookmarksGroup.BookmarksList: IntellijIconData
    get() {
        if (_bookmarksList != null) {
            return _bookmarksList!!
        }
        _bookmarksList = IntellijIconData(name = "BookmarksList",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { BookmarksListComposable(it) })
        return _bookmarksList!!
    }

private var _bookmarksList: IntellijIconData? = null

private fun BookmarksListComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "BookmarksList", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFAF0F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 10.0f)
        curveTo(10.0f, 9.4477f, 10.4477f, 9.0f, 11.0f, 9.0f)
        horizontalLineTo(13.9994f)
        curveTo(14.5517f, 9.0f, 14.9994f, 9.4477f, 14.9994f, 10.0f)
        verticalLineTo(15.7092f)
        curveTo(14.9994f, 15.9189f, 14.7567f, 16.0354f, 14.5931f, 15.9042f)
        lineTo(12.4997f, 14.2262f)
        lineTo(10.4064f, 15.9042f)
        curveTo(10.2427f, 16.0354f, 10.0f, 15.9189f, 10.0f, 15.7092f)
        verticalLineTo(10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 12.0f)
        lineTo(7.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 12.5f)
        lineTo(8.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 13.0f)
        lineTo(2.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 12.5f)
        lineTo(2.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 12.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 6.0f)
        lineTo(13.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 6.5f)
        lineTo(14.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 7.0f)
        lineTo(2.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 6.5f)
        lineTo(2.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 9.0f)
        lineTo(7.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 9.5f)
        lineTo(8.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 10.0f)
        lineTo(2.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 9.5f)
        lineTo(2.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 3.0f)
        lineTo(13.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 3.5f)
        lineTo(14.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 4.0f)
        lineTo(2.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 3.5f)
        lineTo(2.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 3.0f)
        close()
    }
}
.build()
