package org.jetbrains.jewel.icons.allicons.`inline`

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
import org.jetbrains.jewel.icons.allicons.InlineGroup

public val InlineGroup.InlineAdd: IntellijIconData
    get() {
        if (_inlineAdd != null) {
            return _inlineAdd!!
        }
        _inlineAdd = IntellijIconData(name = "InlineAdd",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { InlineAddComposable(it) })
        return _inlineAdd!!
    }

private var _inlineAdd: IntellijIconData? = null

private fun InlineAddComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "InlineAdd", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.5f, 2.5f)
        curveTo(7.5f, 2.2239f, 7.7239f, 2.0f, 8.0f, 2.0f)
        curveTo(8.2761f, 2.0f, 8.5f, 2.2239f, 8.5f, 2.5f)
        horizontalLineTo(7.5f)
        close()
        moveTo(8.5f, 13.5f)
        curveTo(8.5f, 13.7761f, 8.2761f, 14.0f, 8.0f, 14.0f)
        curveTo(7.7239f, 14.0f, 7.5f, 13.7761f, 7.5f, 13.5f)
        horizontalLineTo(8.5f)
        close()
        moveTo(8.5f, 2.5f)
        verticalLineTo(13.5f)
        horizontalLineTo(7.5f)
        verticalLineTo(2.5f)
        horizontalLineTo(8.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 8.5f)
        curveTo(2.2239f, 8.5f, 2.0f, 8.2761f, 2.0f, 8.0f)
        curveTo(2.0f, 7.7239f, 2.2239f, 7.5f, 2.5f, 7.5f)
        lineTo(2.5f, 8.5f)
        close()
        moveTo(13.5f, 7.5f)
        curveTo(13.7761f, 7.5f, 14.0f, 7.7239f, 14.0f, 8.0f)
        curveTo(14.0f, 8.2761f, 13.7761f, 8.5f, 13.5f, 8.5f)
        lineTo(13.5f, 7.5f)
        close()
        moveTo(2.5f, 7.5f)
        lineTo(13.5f, 7.5f)
        lineTo(13.5f, 8.5f)
        lineTo(2.5f, 8.5f)
        lineTo(2.5f, 7.5f)
        close()
    }
}
.build()
