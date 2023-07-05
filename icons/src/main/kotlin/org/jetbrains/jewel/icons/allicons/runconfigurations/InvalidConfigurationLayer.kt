package org.jetbrains.jewel.icons.allicons.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunconfigurationsGroup

public val RunconfigurationsGroup.InvalidConfigurationLayer: IntellijIconData
    get() {
        if (_invalidConfigurationLayer != null) {
            return _invalidConfigurationLayer!!
        }
        _invalidConfigurationLayer = IntellijIconData(imageVector = {
                InvalidConfigurationLayerComposable(it) })
        return _invalidConfigurationLayer!!
    }

private var _invalidConfigurationLayer: IntellijIconData? = null

private fun InvalidConfigurationLayerComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "InvalidConfigurationLayer", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(10.1464f, 0.1464f)
        curveTo(10.3417f, -0.0488f, 10.6583f, -0.0488f, 10.8536f, 0.1464f)
        lineTo(13.0f, 2.2929f)
        lineTo(15.1464f, 0.1464f)
        curveTo(15.3417f, -0.0488f, 15.6583f, -0.0488f, 15.8536f, 0.1464f)
        curveTo(16.0488f, 0.3417f, 16.0488f, 0.6583f, 15.8536f, 0.8536f)
        lineTo(13.7071f, 3.0f)
        lineTo(15.8536f, 5.1465f)
        curveTo(16.0488f, 5.3417f, 16.0488f, 5.6583f, 15.8536f, 5.8535f)
        curveTo(15.6583f, 6.0488f, 15.3417f, 6.0488f, 15.1464f, 5.8535f)
        lineTo(13.0f, 3.7071f)
        lineTo(10.8536f, 5.8535f)
        curveTo(10.6583f, 6.0488f, 10.3417f, 6.0488f, 10.1464f, 5.8535f)
        curveTo(9.9512f, 5.6583f, 9.9512f, 5.3417f, 10.1464f, 5.1465f)
        lineTo(12.2929f, 3.0f)
        lineTo(10.1464f, 0.8536f)
        curveTo(9.9512f, 0.6583f, 9.9512f, 0.3417f, 10.1464f, 0.1464f)
        close()
    }
}
.build()
