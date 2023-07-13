package org.jetbrains.jewel.icons.allicons.`inline`

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.InlineGroup

public val InlineGroup.PreserveCase: IntellijIconData
    get() {
        if (_preserveCase != null) {
            return _preserveCase!!
        }
        _preserveCase = IntellijIconData(name = "PreserveCase",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { PreserveCaseComposable(it) })
        return _preserveCase!!
    }

private var _preserveCase: IntellijIconData? = null

private fun PreserveCaseComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "PreserveCase", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.3695f, 14.0f)
        horizontalLineTo(0.1815f)
        lineTo(3.0085f, 6.3f)
        horizontalLineTo(4.213f)
        lineTo(7.139f, 14.0f)
        horizontalLineTo(5.984f)
        lineTo(5.28f, 12.042f)
        horizontalLineTo(2.013f)
        lineTo(1.3695f, 14.0f)
        close()
        moveTo(3.476f, 7.741f)
        lineTo(2.321f, 11.1235f)
        horizontalLineTo(4.95f)
        lineTo(3.729f, 7.741f)
        lineTo(3.6025f, 7.268f)
        lineTo(3.476f, 7.741f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.8695f, 14.0f)
        horizontalLineTo(8.6815f)
        lineTo(11.5085f, 6.3f)
        horizontalLineTo(12.713f)
        lineTo(15.639f, 14.0f)
        horizontalLineTo(14.484f)
        lineTo(13.78f, 12.042f)
        horizontalLineTo(10.513f)
        lineTo(9.8695f, 14.0f)
        close()
        moveTo(11.976f, 7.741f)
        lineTo(10.821f, 11.1235f)
        horizontalLineTo(13.45f)
        lineTo(12.229f, 7.741f)
        lineTo(12.1025f, 7.268f)
        lineTo(11.976f, 7.741f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.0f, 5.8125f)
        lineTo(9.4063f, 3.4063f)
        lineTo(7.0f, 1.0f)
    }
}
.build()
