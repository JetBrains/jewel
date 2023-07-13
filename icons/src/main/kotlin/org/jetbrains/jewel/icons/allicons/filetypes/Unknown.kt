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

public val FiletypesGroup.Unknown: IntellijIconData
    get() {
        if (_unknown != null) {
            return _unknown!!
        }
        _unknown = IntellijIconData(name = "Unknown",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { UnknownComposable(it) })
        return _unknown!!
    }

private var _unknown: IntellijIconData? = null

private fun UnknownComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Unknown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
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
        moveTo(7.3255f, 9.03f)
        curveTo(7.3255f, 8.8033f, 7.3638f, 8.605f, 7.4405f, 8.435f)
        curveTo(7.5205f, 8.2617f, 7.6155f, 8.115f, 7.7255f, 7.995f)
        curveTo(7.8388f, 7.8717f, 7.9855f, 7.7317f, 8.1655f, 7.575f)
        curveTo(8.3255f, 7.435f, 8.4505f, 7.3183f, 8.5405f, 7.225f)
        curveTo(8.6338f, 7.1283f, 8.7105f, 7.0167f, 8.7705f, 6.89f)
        curveTo(8.8338f, 6.7633f, 8.8655f, 6.6217f, 8.8655f, 6.465f)
        curveTo(8.8655f, 6.215f, 8.7888f, 6.0117f, 8.6355f, 5.855f)
        curveTo(8.4821f, 5.695f, 8.2788f, 5.615f, 8.0255f, 5.615f)
        curveTo(7.7455f, 5.615f, 7.5205f, 5.705f, 7.3505f, 5.885f)
        curveTo(7.1838f, 6.065f, 7.1021f, 6.3f, 7.1055f, 6.59f)
        horizontalLineTo(5.7255f)
        curveTo(5.7255f, 6.13f, 5.8188f, 5.735f, 6.0055f, 5.405f)
        curveTo(6.1921f, 5.0717f, 6.4588f, 4.8183f, 6.8055f, 4.645f)
        curveTo(7.1555f, 4.4683f, 7.5671f, 4.38f, 8.0405f, 4.38f)
        curveTo(8.4971f, 4.38f, 8.8938f, 4.4617f, 9.2305f, 4.625f)
        curveTo(9.5671f, 4.7883f, 9.8255f, 5.02f, 10.0055f, 5.32f)
        curveTo(10.1855f, 5.6167f, 10.2738f, 5.9667f, 10.2705f, 6.37f)
        curveTo(10.2705f, 6.6733f, 10.2221f, 6.935f, 10.1255f, 7.155f)
        curveTo(10.0288f, 7.375f, 9.9138f, 7.555f, 9.7805f, 7.695f)
        curveTo(9.6471f, 7.835f, 9.4721f, 7.9933f, 9.2555f, 8.17f)
        curveTo(9.1055f, 8.29f, 8.9871f, 8.39f, 8.9005f, 8.47f)
        curveTo(8.8171f, 8.55f, 8.7471f, 8.6417f, 8.6905f, 8.745f)
        curveTo(8.6371f, 8.845f, 8.6105f, 8.9567f, 8.6105f, 9.08f)
        verticalLineTo(9.255f)
        horizontalLineTo(7.3255f)
        verticalLineTo(9.03f)
        close()
        moveTo(8.7405f, 11.5f)
        horizontalLineTo(7.2405f)
        verticalLineTo(10.0f)
        horizontalLineTo(8.7405f)
        verticalLineTo(11.5f)
        close()
    }
}
.build()
