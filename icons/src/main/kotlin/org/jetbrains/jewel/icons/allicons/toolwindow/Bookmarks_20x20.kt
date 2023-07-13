package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Bookmarks_20x20: IntellijIconData
    get() {
        if (_bookmarks_20x20 != null) {
            return _bookmarks_20x20!!
        }
        _bookmarks_20x20 = IntellijIconData(name = "Bookmarks_20x20",size = DpSize(height = 20.0.dp,
                width = 20.0.dp),imageVector = { Bookmarks_20x20Composable(it) })
        return _bookmarks_20x20!!
    }

private var _bookmarks_20x20: IntellijIconData? = null

private fun Bookmarks_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Bookmarks_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.4617f, 13.8316f)
        lineTo(10.0f, 13.471f)
        lineTo(9.5383f, 13.8316f)
        lineTo(4.6539f, 17.647f)
        curveTo(4.4898f, 17.7752f, 4.25f, 17.6582f, 4.25f, 17.45f)
        verticalLineTo(3.5f)
        curveTo(4.25f, 2.8096f, 4.8096f, 2.25f, 5.5f, 2.25f)
        horizontalLineTo(14.5f)
        curveTo(15.1904f, 2.25f, 15.75f, 2.8096f, 15.75f, 3.5f)
        verticalLineTo(17.45f)
        curveTo(15.75f, 17.6582f, 15.5102f, 17.7752f, 15.3461f, 17.647f)
        lineTo(10.4617f, 13.8316f)
        close()
    }
}
.build()
