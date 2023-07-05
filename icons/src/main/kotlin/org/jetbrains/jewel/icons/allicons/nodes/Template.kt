package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Template: IntellijIconData
    get() {
        if (_template != null) {
            return _template!!
        }
        _template = IntellijIconData(imageVector = { TemplateComposable(it) })
        return _template!!
    }

private var _template: IntellijIconData? = null

private fun TemplateComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Template", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.5f, 13.5f)
        horizontalLineTo(12.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(14.0f, 11.5f)
        horizontalLineTo(2.0f)
        curveTo(1.7239f, 11.5f, 1.5f, 11.2761f, 1.5f, 11.0f)
        verticalLineTo(10.0f)
        curveTo(1.5f, 9.7239f, 1.7239f, 9.5f, 2.0f, 9.5f)
        horizontalLineTo(7.0f)
        lineTo(5.5463f, 4.4121f)
        curveTo(5.2725f, 3.4539f, 5.992f, 2.5f, 6.9886f, 2.5f)
        horizontalLineTo(9.0114f)
        curveTo(10.008f, 2.5f, 10.7275f, 3.4539f, 10.4537f, 4.4121f)
        lineTo(9.0f, 9.5f)
        horizontalLineTo(14.0f)
        curveTo(14.2761f, 9.5f, 14.5f, 9.7239f, 14.5f, 10.0f)
        verticalLineTo(11.0f)
        curveTo(14.5f, 11.2761f, 14.2761f, 11.5f, 14.0f, 11.5f)
        close()
    }
}
.build()
