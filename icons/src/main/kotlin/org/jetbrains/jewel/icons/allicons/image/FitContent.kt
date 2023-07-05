package org.jetbrains.jewel.icons.allicons.image

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
import org.jetbrains.jewel.icons.allicons.ImageGroup

public val ImageGroup.FitContent: IntellijIconData
    get() {
        if (_fitContent != null) {
            return _fitContent!!
        }
        _fitContent = IntellijIconData(imageVector = { FitContentComposable(it) })
        return _fitContent!!
    }

private var _fitContent: IntellijIconData? = null

private fun FitContentComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "FitContent", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.5f, 7.0f)
        lineTo(11.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 7.5f)
        lineTo(12.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 11.0f)
        lineTo(11.5f, 11.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 10.5f)
        lineTo(11.0f, 7.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.0f, 10.5f)
        lineTo(12.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 11.0f)
        lineTo(8.5f, 11.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 10.5f)
        lineTo(8.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 10.0f)
        lineTo(11.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 10.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.5f, 5.0f)
        lineTo(4.5f, 5.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 5.5f)
        lineTo(5.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 9.0f)
        lineTo(4.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 8.5f)
        lineTo(4.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 5.5f)
        lineTo(8.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 6.0f)
        lineTo(4.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 5.5f)
        lineTo(4.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 5.0f)
        lineTo(7.5f, 5.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 5.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 2.5f)
        lineTo(13.0f, 2.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 4.0f)
        lineTo(14.5f, 12.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 13.5f)
        lineTo(3.0f, 13.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 12.0f)
        lineTo(1.5f, 4.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 2.5f)
        close()
    }
}
.build()
