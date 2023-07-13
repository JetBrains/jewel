package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val ToolwindowGroup.Documentation: IntellijIconData
    get() {
        if (_documentation != null) {
            return _documentation!!
        }
        _documentation = IntellijIconData(name = "Documentation",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { DocumentationComposable(it) })
        return _documentation!!
    }

private var _documentation: IntellijIconData? = null

private fun DocumentationComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Documentation", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 3.5f)
        lineTo(10.0f, 3.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 5.0f)
        lineTo(11.5f, 12.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 13.5f)
        lineTo(4.0f, 13.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 12.0f)
        lineTo(2.5f, 5.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 3.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 6.0f)
        lineTo(8.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 6.5f)
        lineTo(9.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 7.0f)
        lineTo(5.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 6.5f)
        lineTo(5.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 8.0f)
        lineTo(8.5f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 8.5f)
        lineTo(9.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 9.0f)
        lineTo(5.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 8.5f)
        lineTo(5.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 10.0f)
        lineTo(8.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 10.5f)
        lineTo(9.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 11.0f)
        lineTo(5.5f, 11.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 10.5f)
        lineTo(5.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.0019f, 2.0f)
        horizontalLineTo(11.6f)
        curveTo(12.3732f, 2.0f, 13.0f, 2.6268f, 13.0f, 3.4f)
        verticalLineTo(3.9108f)
        curveTo(13.0013f, 3.9404f, 13.0019f, 3.9701f, 13.0019f, 4.0f)
        verticalLineTo(11.5482f)
        curveTo(13.6065f, 11.1124f, 14.0f, 10.4021f, 14.0f, 9.6f)
        verticalLineTo(3.4f)
        curveTo(14.0f, 2.0745f, 12.9255f, 1.0f, 11.6f, 1.0f)
        horizontalLineTo(6.4f)
        curveTo(5.597f, 1.0f, 4.8861f, 1.3944f, 4.4504f, 2.0f)
        horizontalLineTo(6.4f)
        horizontalLineTo(11.0019f)
        close()
    }
}
.build()
