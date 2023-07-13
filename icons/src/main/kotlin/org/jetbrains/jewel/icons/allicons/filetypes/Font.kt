package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Font: IntellijIconData
    get() {
        if (_font != null) {
            return _font!!
        }
        _font = IntellijIconData(name = "Font",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { FontComposable(it) })
        return _font!!
    }

private var _font: IntellijIconData? = null

private fun FontComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Font",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0794f, 12.0f)
        lineTo(2.8805f, 9.6903f)
        horizontalLineTo(6.2896f)
        lineTo(7.0865f, 12.0f)
        horizontalLineTo(8.4842f)
        lineTo(5.3436f, 3.2727f)
        horizontalLineTo(3.8223f)
        lineTo(0.6816f, 12.0f)
        horizontalLineTo(2.0794f)
        close()
        moveTo(3.264f, 8.5824f)
        lineTo(4.551f, 4.8579f)
        horizontalLineTo(4.6191f)
        lineTo(5.9061f, 8.5824f)
        horizontalLineTo(3.264f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.5471f, 12.1449f)
        curveTo(12.6294f, 12.1449f, 13.2388f, 11.5951f, 13.4817f, 11.1051f)
        horizontalLineTo(13.5328f)
        verticalLineTo(12.0f)
        horizontalLineTo(14.7772f)
        verticalLineTo(7.6534f)
        curveTo(14.7772f, 5.7486f, 13.2772f, 5.3693f, 12.2374f, 5.3693f)
        curveTo(11.0527f, 5.3693f, 9.9618f, 5.8466f, 9.5357f, 7.0398f)
        lineTo(10.7331f, 7.3125f)
        curveTo(10.9206f, 6.848f, 11.3979f, 6.4005f, 12.2544f, 6.4005f)
        curveTo(13.0769f, 6.4005f, 13.4988f, 6.8309f, 13.4988f, 7.5724f)
        verticalLineTo(7.6023f)
        curveTo(13.4988f, 8.0667f, 13.0215f, 8.0582f, 11.8453f, 8.1946f)
        curveTo(10.6053f, 8.3395f, 9.3354f, 8.6633f, 9.3354f, 10.1505f)
        curveTo(9.3354f, 11.4375f, 10.3027f, 12.1449f, 11.5471f, 12.1449f)
        close()
        moveTo(11.824f, 11.1221f)
        curveTo(11.1039f, 11.1221f, 10.584f, 10.7983f, 10.584f, 10.1676f)
        curveTo(10.584f, 9.4858f, 11.1891f, 9.2429f, 11.9263f, 9.1449f)
        curveTo(12.3397f, 9.0895f, 13.3198f, 8.9787f, 13.503f, 8.7954f)
        verticalLineTo(9.6392f)
        curveTo(13.503f, 10.4148f, 12.8851f, 11.1221f, 11.824f, 11.1221f)
        close()
    }
}
.build()
