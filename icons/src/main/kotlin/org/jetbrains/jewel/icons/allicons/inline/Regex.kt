package org.jetbrains.jewel.icons.allicons.`inline`

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
import org.jetbrains.jewel.icons.allicons.InlineGroup

public val InlineGroup.Regex: IntellijIconData
    get() {
        if (_regex != null) {
            return _regex!!
        }
        _regex = IntellijIconData(imageVector = { RegexComposable(it) })
        return _regex!!
    }

private var _regex: IntellijIconData? = null

private fun RegexComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Regex",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.9675f, 14.0f)
        verticalLineTo(12.35f)
        horizontalLineTo(4.6175f)
        verticalLineTo(14.0f)
        horizontalLineTo(2.9675f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.905f, 4.8255f)
        lineTo(13.1855f, 5.854f)
        lineTo(10.678f, 6.449f)
        lineTo(12.4205f, 8.404f)
        lineTo(11.613f, 9.0925f)
        lineTo(9.9725f, 7.0185f)
        lineTo(8.3235f, 9.0925f)
        lineTo(7.516f, 8.404f)
        lineTo(9.2585f, 6.449f)
        lineTo(6.751f, 5.854f)
        lineTo(7.0315f, 4.8255f)
        lineTo(9.505f, 5.565f)
        lineTo(9.437f, 3.1f)
        horizontalLineTo(10.4995f)
        lineTo(10.4315f, 5.565f)
        lineTo(12.905f, 4.8255f)
        close()
    }
}
.build()
