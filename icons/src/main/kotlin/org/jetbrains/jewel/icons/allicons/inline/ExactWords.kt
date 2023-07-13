package org.jetbrains.jewel.icons.allicons.`inline`

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

public val InlineGroup.ExactWords: IntellijIconData
    get() {
        if (_exactWords != null) {
            return _exactWords!!
        }
        _exactWords = IntellijIconData(name = "ExactWords",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ExactWordsComposable(it) })
        return _exactWords!!
    }

private var _exactWords: IntellijIconData? = null

private fun ExactWordsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ExactWords", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.2695f, 13.0f)
        lineTo(1.299f, 3.9f)
        horizontalLineTo(2.703f)
        lineTo(5.043f, 11.2125f)
        lineTo(7.2725f, 3.9f)
        horizontalLineTo(8.6115f)
        lineTo(10.8735f, 11.2125f)
        lineTo(13.155f, 3.9f)
        horizontalLineTo(14.5135f)
        lineTo(11.543f, 13.0f)
        horizontalLineTo(10.1585f)
        lineTo(7.9225f, 5.7785f)
        lineTo(5.6475f, 13.0f)
        horizontalLineTo(4.2695f)
        close()
    }
}
.build()
