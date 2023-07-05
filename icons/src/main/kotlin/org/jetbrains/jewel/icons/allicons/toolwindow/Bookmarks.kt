package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Bookmarks: IntellijIconData
    get() {
        if (_bookmarks != null) {
            return _bookmarks!!
        }
        _bookmarks = IntellijIconData(imageVector = { BookmarksComposable(it) })
        return _bookmarks!!
    }

private var _bookmarks: IntellijIconData? = null

private fun BookmarksComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Bookmarks", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.3122f, 11.5622f)
        lineTo(7.9994f, 11.3115f)
        lineTo(7.6867f, 11.5622f)
        lineTo(4.3127f, 14.2669f)
        curveTo(3.9854f, 14.5292f, 3.5f, 14.2962f, 3.5f, 13.8767f)
        verticalLineTo(3.5f)
        curveTo(3.5f, 2.6716f, 4.1716f, 2.0f, 5.0f, 2.0f)
        horizontalLineTo(10.9989f)
        curveTo(11.8273f, 2.0f, 12.4989f, 2.6716f, 12.4989f, 3.5f)
        verticalLineTo(13.8767f)
        curveTo(12.4989f, 14.2962f, 12.0134f, 14.5292f, 11.6861f, 14.2669f)
        lineTo(8.3122f, 11.5622f)
        close()
    }
}
.build()
