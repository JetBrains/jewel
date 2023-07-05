package org.jetbrains.jewel.icons.allicons.bookmarks

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
import org.jetbrains.jewel.icons.allicons.BookmarksGroup

public val BookmarksGroup.AddBookmarksList: IntellijIconData
    get() {
        if (_addBookmarksList != null) {
            return _addBookmarksList!!
        }
        _addBookmarksList = IntellijIconData(imageVector = { AddBookmarksListComposable(it) })
        return _addBookmarksList!!
    }

private var _addBookmarksList: IntellijIconData? = null

private fun AddBookmarksListComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "AddBookmarksList", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 12.0f)
        lineTo(6.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 12.5f)
        lineTo(7.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 13.0f)
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
        lineTo(9.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 9.5f)
        lineTo(10.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 10.0f)
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
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.5f, 9.0f)
        curveTo(12.7761f, 9.0f, 13.0f, 9.2239f, 13.0f, 9.5f)
        verticalLineTo(12.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 12.0f, 16.0f, 12.2239f, 16.0f, 12.5f)
        curveTo(16.0f, 12.7761f, 15.7761f, 13.0f, 15.5f, 13.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(15.5f)
        curveTo(13.0f, 15.7761f, 12.7761f, 16.0f, 12.5f, 16.0f)
        curveTo(12.2239f, 16.0f, 12.0f, 15.7761f, 12.0f, 15.5f)
        verticalLineTo(13.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 13.0f, 9.0f, 12.7761f, 9.0f, 12.5f)
        curveTo(9.0f, 12.2239f, 9.2239f, 12.0f, 9.5f, 12.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(9.5f)
        curveTo(12.0f, 9.2239f, 12.2239f, 9.0f, 12.5f, 9.0f)
        close()
    }
}
.build()
