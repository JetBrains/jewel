package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.PreviewHorizontally: IntellijIconData
    get() {
        if (_previewHorizontally != null) {
            return _previewHorizontally!!
        }
        _previewHorizontally = IntellijIconData(name = "PreviewHorizontally",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { PreviewHorizontallyComposable(it) })
        return _previewHorizontally!!
    }

private var _previewHorizontally: IntellijIconData? = null

private fun PreviewHorizontallyComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "PreviewHorizontally", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.9999f, 3.0f)
        lineTo(11.9999f, 3.0f)
        curveTo(12.5522f, 3.0f, 12.9999f, 3.4477f, 12.9999f, 4.0f)
        lineTo(12.9999f, 6.0f)
        lineTo(2.9999f, 6.0f)
        lineTo(2.9999f, 4.0f)
        curveTo(2.9999f, 3.4477f, 3.4476f, 3.0f, 3.9999f, 3.0f)
        close()
        moveTo(1.9999f, 7.0f)
        lineTo(1.9999f, 12.0f)
        curveTo(1.9999f, 13.1046f, 2.8954f, 14.0f, 3.9999f, 14.0f)
        lineTo(11.9999f, 14.0f)
        curveTo(13.1045f, 14.0f, 13.9999f, 13.1046f, 13.9999f, 12.0f)
        lineTo(13.9999f, 4.0f)
        curveTo(13.9999f, 2.8954f, 13.1045f, 2.0f, 11.9999f, 2.0f)
        lineTo(3.9999f, 2.0f)
        curveTo(2.8954f, 2.0f, 1.9999f, 2.8954f, 1.9999f, 4.0f)
        lineTo(1.9999f, 6.0f)
        lineTo(1.9999f, 6.0f)
        lineTo(1.9999f, 7.0f)
        lineTo(1.9999f, 7.0f)
        close()
        moveTo(2.9999f, 7.0f)
        lineTo(12.9999f, 7.0f)
        lineTo(12.9999f, 12.0f)
        curveTo(12.9999f, 12.5523f, 12.5522f, 13.0f, 11.9999f, 13.0f)
        lineTo(3.9999f, 13.0f)
        curveTo(3.4476f, 13.0f, 2.9999f, 12.5523f, 2.9999f, 12.0f)
        lineTo(2.9999f, 7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 8.5f)
        lineTo(10.5f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 9.0f)
        lineTo(11.0f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 9.5f)
        lineTo(5.5f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 9.0f)
        lineTo(5.0f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 8.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 10.5f)
        lineTo(10.5f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 11.0f)
        lineTo(11.0f, 11.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 11.5f)
        lineTo(5.5f, 11.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 11.0f)
        lineTo(5.0f, 11.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 10.5f)
        close()
    }
}
.build()
