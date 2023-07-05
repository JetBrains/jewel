package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Regexp: IntellijIconData
    get() {
        if (_regexp != null) {
            return _regexp!!
        }
        _regexp = IntellijIconData(imageVector = { RegexpComposable(it) })
        return _regexp!!
    }

private var _regexp: IntellijIconData? = null

private fun RegexpComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Regexp", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 2.5f)
        lineTo(12.0f, 2.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 4.0f)
        lineTo(13.5f, 12.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 13.5f)
        lineTo(4.0f, 13.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 12.0f)
        lineTo(2.5f, 4.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.0f, 10.5f)
        curveTo(4.0f, 10.2239f, 4.2239f, 10.0f, 4.5f, 10.0f)
        horizontalLineTo(5.5f)
        curveTo(5.7761f, 10.0f, 6.0f, 10.2239f, 6.0f, 10.5f)
        verticalLineTo(11.5f)
        curveTo(6.0f, 11.7761f, 5.7761f, 12.0f, 5.5f, 12.0f)
        horizontalLineTo(4.5f)
        curveTo(4.2239f, 12.0f, 4.0f, 11.7761f, 4.0f, 11.5f)
        verticalLineTo(10.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(9.5f, 4.5f)
        verticalLineTo(7.0f)
        moveTo(9.5f, 7.0f)
        lineTo(10.9695f, 9.0225f)
        moveTo(9.5f, 7.0f)
        lineTo(8.0305f, 9.0225f)
        moveTo(9.5f, 7.0f)
        lineTo(7.1224f, 6.2275f)
        moveTo(9.5f, 7.0f)
        lineTo(11.8776f, 6.2275f)
    }
}
.build()
