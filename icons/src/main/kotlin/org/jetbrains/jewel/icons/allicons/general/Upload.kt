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

public val GeneralGroup.Upload: IntellijIconData
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = IntellijIconData(name = "Upload",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { UploadComposable(it) })
        return _upload!!
    }

private var _upload: IntellijIconData? = null

private fun UploadComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Upload", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.8535f, 4.6463f)
        curveTo(11.0488f, 4.8416f, 11.0488f, 5.1581f, 10.8536f, 5.3534f)
        curveTo(10.6583f, 5.5487f, 10.3417f, 5.5487f, 10.1465f, 5.3534f)
        lineTo(8.4997f, 3.7068f)
        lineTo(8.4997f, 10.5142f)
        curveTo(8.4997f, 10.7903f, 8.2759f, 11.0142f, 7.9997f, 11.0142f)
        curveTo(7.7236f, 11.0142f, 7.4997f, 10.7903f, 7.4997f, 10.5142f)
        lineTo(7.4997f, 3.7073f)
        lineTo(5.8534f, 5.3536f)
        curveTo(5.6582f, 5.5488f, 5.3416f, 5.5488f, 5.1463f, 5.3535f)
        curveTo(4.9511f, 5.1583f, 4.9511f, 4.8417f, 5.1463f, 4.6464f)
        lineTo(7.6464f, 2.1464f)
        curveTo(7.8417f, 1.9511f, 8.1582f, 1.9511f, 8.3535f, 2.1464f)
        lineTo(10.8535f, 4.6463f)
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
