package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Download: IntellijIconData
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = IntellijIconData(imageVector = { DownloadComposable(it) })
        return _download!!
    }

private var _download: IntellijIconData? = null

private fun DownloadComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Download", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.8535f, 8.3537f)
        curveTo(11.0488f, 8.1584f, 11.0488f, 7.8419f, 10.8536f, 7.6466f)
        curveTo(10.6583f, 7.4513f, 10.3417f, 7.4513f, 10.1465f, 7.6466f)
        lineTo(8.4997f, 9.2932f)
        lineTo(8.4997f, 2.5f)
        curveTo(8.4997f, 2.2239f, 8.2759f, 2.0f, 7.9997f, 2.0f)
        curveTo(7.7236f, 2.0f, 7.4997f, 2.2239f, 7.4997f, 2.5f)
        lineTo(7.4997f, 9.2927f)
        lineTo(5.8534f, 7.6465f)
        curveTo(5.6582f, 7.4512f, 5.3416f, 7.4512f, 5.1463f, 7.6465f)
        curveTo(4.9511f, 7.8417f, 4.9511f, 8.1583f, 5.1463f, 8.3536f)
        lineTo(7.6464f, 10.8536f)
        curveTo(7.8417f, 11.0489f, 8.1582f, 11.0489f, 8.3535f, 10.8536f)
        lineTo(10.8535f, 8.3537f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 14.0f)
        lineTo(13.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 13.5f)
        lineTo(14.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, false, 13.5f, 13.0f)
        lineTo(2.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, false, 2.0f, 13.5f)
        lineTo(2.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, false, 2.5f, 14.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 10.0f)
        lineTo(2.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 10.5f)
        lineTo(3.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 14.0f)
        lineTo(2.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 13.5f)
        lineTo(2.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.5f, 10.0f)
        lineTo(13.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 10.5f)
        lineTo(14.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 14.0f)
        lineTo(13.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 13.5f)
        lineTo(13.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 10.0f)
        close()
    }
}
.build()
