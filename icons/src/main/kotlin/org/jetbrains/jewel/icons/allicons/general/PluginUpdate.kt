package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.PluginUpdate: IntellijIconData
    get() {
        if (_pluginUpdate != null) {
            return _pluginUpdate!!
        }
        _pluginUpdate = IntellijIconData(name = "PluginUpdate",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { PluginUpdateComposable(it) })
        return _pluginUpdate!!
    }

private var _pluginUpdate: IntellijIconData? = null

private fun PluginUpdateComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "PluginUpdate", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    group {
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(8.5f, 5.2071f)
            lineTo(11.1464f, 7.8536f)
            curveTo(11.3417f, 8.0488f, 11.6583f, 8.0488f, 11.8536f, 7.8536f)
            curveTo(12.0488f, 7.6583f, 12.0488f, 7.3417f, 11.8536f, 7.1465f)
            lineTo(8.3535f, 3.6465f)
            curveTo(8.1583f, 3.4512f, 7.8417f, 3.4512f, 7.6465f, 3.6465f)
            lineTo(4.1465f, 7.1465f)
            curveTo(3.9512f, 7.3417f, 3.9512f, 7.6583f, 4.1465f, 7.8536f)
            curveTo(4.3417f, 8.0488f, 4.6583f, 8.0488f, 4.8535f, 7.8536f)
            lineTo(7.5f, 5.2071f)
            verticalLineTo(12.0f)
            curveTo(7.5f, 12.2761f, 7.7239f, 12.5f, 8.0f, 12.5f)
            curveTo(8.2761f, 12.5f, 8.5f, 12.2761f, 8.5f, 12.0f)
            verticalLineTo(5.2071f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                EvenOdd) {
            moveTo(8.0f, 16.0f)
            curveTo(12.4183f, 16.0f, 16.0f, 12.4183f, 16.0f, 8.0f)
            curveTo(16.0f, 3.5817f, 12.4183f, 0.0f, 8.0f, 0.0f)
            curveTo(3.5817f, 0.0f, 0.0f, 3.5817f, 0.0f, 8.0f)
            curveTo(0.0f, 12.4183f, 3.5817f, 16.0f, 8.0f, 16.0f)
            close()
            moveTo(8.0f, 15.0f)
            curveTo(11.866f, 15.0f, 15.0f, 11.866f, 15.0f, 8.0f)
            curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
            curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
            curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
            close()
        }
    }
}
.build()
