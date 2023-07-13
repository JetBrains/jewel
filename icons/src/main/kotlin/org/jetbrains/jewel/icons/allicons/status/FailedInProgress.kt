package org.jetbrains.jewel.icons.allicons.status

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.StatusGroup

public val StatusGroup.FailedInProgress: IntellijIconData
    get() {
        if (_failedInProgress != null) {
            return _failedInProgress!!
        }
        _failedInProgress = IntellijIconData(name = "FailedInProgress",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { FailedInProgressComposable(it) })
        return _failedInProgress!!
    }

private var _failedInProgress: IntellijIconData? = null

private fun FailedInProgressComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "FailedInProgress", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.redSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.0363f, 4.1284f)
        curveTo(3.3907f, 4.3428f, 3.5043f, 4.8039f, 3.2899f, 5.1583f)
        curveTo(2.7887f, 5.9871f, 2.5f, 6.9587f, 2.5f, 8.0f)
        curveTo(2.5f, 9.0422f, 2.7891f, 10.0145f, 3.2912f, 10.8437f)
        curveTo(3.5057f, 11.1981f, 3.3923f, 11.6592f, 3.038f, 11.8737f)
        curveTo(2.6836f, 12.0883f, 2.2225f, 11.9749f, 2.008f, 11.6206f)
        curveTo(1.3681f, 10.5636f, 1.0f, 9.3237f, 1.0f, 8.0f)
        curveTo(1.0f, 6.6774f, 1.3675f, 5.4384f, 2.0064f, 4.382f)
        curveTo(2.2208f, 4.0276f, 2.6818f, 3.9141f, 3.0363f, 4.1284f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE46A76)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(4.127f, 12.9625f)
        curveTo(4.3415f, 12.6081f, 4.8026f, 12.4947f, 5.157f, 12.7092f)
        curveTo(5.9861f, 13.211f, 6.9583f, 13.5f, 8.0002f, 13.5f)
        curveTo(9.0401f, 13.5f, 10.0104f, 13.2122f, 10.8384f, 12.7122f)
        curveTo(11.193f, 12.4981f, 11.654f, 12.612f, 11.8681f, 12.9666f)
        curveTo(12.0822f, 13.3212f, 11.9683f, 13.7822f, 11.6137f, 13.9963f)
        curveTo(10.5583f, 14.6335f, 9.3209f, 15.0f, 8.0002f, 15.0f)
        curveTo(6.6768f, 15.0f, 5.4371f, 14.632f, 4.3803f, 13.9924f)
        curveTo(4.026f, 13.778f, 3.9126f, 13.3168f, 4.127f, 12.9625f)
        close()
    }
    path(fill = SolidColor(Color(0xFFED99A1)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(12.9606f, 4.1247f)
        curveTo(13.3149f, 3.91f, 13.7761f, 4.0232f, 13.9907f, 4.3775f)
        curveTo(14.6313f, 5.4349f, 14.9998f, 6.6755f, 14.9998f, 8.0f)
        curveTo(14.9998f, 9.3234f, 14.6319f, 10.5631f, 13.9923f, 11.6199f)
        curveTo(13.7778f, 11.9743f, 13.3167f, 12.0877f, 12.9623f, 11.8732f)
        curveTo(12.6079f, 11.6587f, 12.4945f, 11.1976f, 12.709f, 10.8432f)
        curveTo(13.2108f, 10.0141f, 13.4998f, 9.0419f, 13.4998f, 8.0f)
        curveTo(13.4998f, 6.9572f, 13.2104f, 5.9843f, 12.7078f, 5.1547f)
        curveTo(12.4931f, 4.8005f, 12.6063f, 4.3393f, 12.9606f, 4.1247f)
        close()
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.9998f, 2.5f)
        curveTo(6.9589f, 2.5f, 5.9877f, 2.7884f, 5.1591f, 3.2893f)
        curveTo(4.8046f, 3.5036f, 4.3436f, 3.3899f, 4.1293f, 3.0355f)
        curveTo(3.915f, 2.681f, 4.0286f, 2.2199f, 4.3831f, 2.0056f)
        curveTo(5.4392f, 1.3672f, 6.6778f, 1.0f, 7.9998f, 1.0f)
        curveTo(9.32f, 1.0f, 10.5569f, 1.3662f, 11.612f, 2.0029f)
        curveTo(11.9667f, 2.2169f, 12.0807f, 2.6779f, 11.8666f, 3.0326f)
        curveTo(11.6526f, 3.3872f, 11.1916f, 3.5012f, 10.837f, 3.2872f)
        curveTo(10.0092f, 2.7876f, 9.0392f, 2.5f, 7.9998f, 2.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.9001f, 4.5f)
        curveTo(8.9001f, 4.003f, 8.4972f, 3.6f, 8.0001f, 3.6f)
        curveTo(7.503f, 3.6f, 7.1001f, 4.003f, 7.1001f, 4.5f)
        lineTo(7.1001f, 8.0f)
        curveTo(7.1001f, 8.4971f, 7.503f, 8.9f, 8.0001f, 8.9f)
        curveTo(8.4972f, 8.9f, 8.9001f, 8.4971f, 8.9001f, 8.0f)
        lineTo(8.9001f, 4.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0004f, 12.2f)
        curveTo(8.6079f, 12.2f, 9.1004f, 11.7075f, 9.1004f, 11.1f)
        curveTo(9.1004f, 10.4925f, 8.6079f, 10.0f, 8.0004f, 10.0f)
        curveTo(7.3929f, 10.0f, 6.9004f, 10.4925f, 6.9004f, 11.1f)
        curveTo(6.9004f, 11.7075f, 7.3929f, 12.2f, 8.0004f, 12.2f)
        close()
    }
}
.build()
