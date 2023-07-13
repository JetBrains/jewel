package org.jetbrains.jewel.icons.allicons.image

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
import org.jetbrains.jewel.icons.allicons.ImageGroup

public val ImageGroup.ColorPicker: IntellijIconData
    get() {
        if (_colorPicker != null) {
            return _colorPicker!!
        }
        _colorPicker = IntellijIconData(name = "ColorPicker",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ColorPickerComposable(it) })
        return _colorPicker!!
    }

private var _colorPicker: IntellijIconData? = null

private fun ColorPickerComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ColorPicker", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.9506f, 7.8014f)
        lineTo(14.0415f, 5.7071f)
        curveTo(14.4586f, 5.3007f, 14.4535f, 4.6427f, 14.048f, 4.2329f)
        lineTo(12.3274f, 2.5127f)
        curveTo(11.9173f, 2.1034f, 11.2952f, 2.0399f, 10.8863f, 2.4574f)
        lineTo(8.7399f, 4.5907f)
        moveTo(11.9506f, 7.8014f)
        lineTo(8.7399f, 4.5907f)
        moveTo(11.9506f, 7.8014f)
        lineTo(6.8007f, 12.9395f)
        lineTo(3.0464f, 14.0803f)
        curveTo(2.6631f, 14.1968f, 2.3053f, 13.8377f, 2.4231f, 13.4548f)
        lineTo(3.5603f, 9.7595f)
        lineTo(8.7399f, 4.5907f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.8848f, 2.9707f)
        lineTo(13.5513f, 8.6373f)
        arcTo(0.5f, 0.5f, 119.0546f, false, true, 13.5513f, 9.3444f)
        lineTo(13.5513f, 9.3444f)
        arcTo(0.5f, 0.5f, 119.0546f, false, true, 12.8442f, 9.3444f)
        lineTo(7.1777f, 3.6779f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.1777f, 2.9707f)
        lineTo(7.1777f, 2.9707f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.8848f, 2.9707f)
        close()
    }
}
.build()
