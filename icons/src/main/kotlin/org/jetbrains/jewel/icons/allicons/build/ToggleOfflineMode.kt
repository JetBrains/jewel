package org.jetbrains.jewel.icons.allicons.build

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
import org.jetbrains.jewel.icons.allicons.BuildGroup

public val BuildGroup.ToggleOfflineMode: IntellijIconData
    get() {
        if (_toggleOfflineMode != null) {
            return _toggleOfflineMode!!
        }
        _toggleOfflineMode = IntellijIconData(imageVector = { ToggleOfflineModeComposable(it) })
        return _toggleOfflineMode!!
    }

private var _toggleOfflineMode: IntellijIconData? = null

private fun ToggleOfflineModeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ToggleOfflineMode", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.697f, 4.8182f)
        curveTo(2.6079f, 4.9774f, 2.5265f, 5.1415f, 2.4533f, 5.31f)
        curveTo(1.0122f, 5.9148f, 0.0f, 7.3392f, 0.0f, 9.0f)
        curveTo(0.0f, 11.2091f, 1.7909f, 13.0f, 4.0f, 13.0f)
        horizontalLineTo(10.8788f)
        lineTo(9.8788f, 12.0f)
        horizontalLineTo(4.0f)
        curveTo(2.3431f, 12.0f, 1.0f, 10.6569f, 1.0f, 9.0f)
        curveTo(1.0f, 7.756f, 1.7574f, 6.6865f, 2.8403f, 6.2321f)
        lineTo(3.2104f, 6.0767f)
        lineTo(3.3704f, 5.7086f)
        curveTo(3.3922f, 5.6584f, 3.4149f, 5.6088f, 3.4384f, 5.5596f)
        lineTo(2.697f, 4.8182f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5599f, 3.4385f)
        lineTo(4.8183f, 2.6969f)
        curveTo(5.6117f, 2.253f, 6.5263f, 2.0f, 7.5f, 2.0f)
        curveTo(10.0221f, 2.0f, 12.1476f, 3.6976f, 12.7965f, 6.0124f)
        curveTo(14.5907f, 6.1629f, 16.0f, 7.6669f, 16.0f, 9.5f)
        curveTo(16.0f, 10.6909f, 15.4052f, 11.7429f, 14.4965f, 12.3751f)
        lineTo(13.7733f, 11.6519f)
        curveTo(14.5077f, 11.2164f, 15.0f, 10.4157f, 15.0f, 9.5f)
        curveTo(15.0f, 8.1911f, 13.9934f, 7.1163f, 12.7129f, 7.0089f)
        lineTo(12.021f, 6.9509f)
        lineTo(11.8336f, 6.2823f)
        curveTo(11.3026f, 4.3878f, 9.5621f, 3.0f, 7.5f, 3.0f)
        curveTo(6.8056f, 3.0f, 6.1476f, 3.1573f, 5.5599f, 3.4385f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.2826f, 1.9896f)
        lineTo(1.9897f, 1.2825f)
        lineTo(14.7176f, 14.0104f)
        lineTo(14.0105f, 14.7175f)
        lineTo(1.2826f, 1.9896f)
        close()
    }
}
.build()
