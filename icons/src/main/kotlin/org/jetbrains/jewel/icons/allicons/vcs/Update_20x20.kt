package org.jetbrains.jewel.icons.allicons.vcs

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.Update_20x20: IntellijIconData
    get() {
        if (_update_20x20 != null) {
            return _update_20x20!!
        }
        _update_20x20 = IntellijIconData(name = "Update_20x20",size = DpSize(height = 20.0.dp, width
                = 20.0.dp),imageVector = { Update_20x20Composable(it) })
        return _update_20x20!!
    }

private var _update_20x20: IntellijIconData? = null

private fun Update_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Update_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(14.8536f, 5.8535f)
        curveTo(15.0488f, 5.6583f, 15.0488f, 5.3417f, 14.8536f, 5.1465f)
        curveTo(14.6583f, 4.9512f, 14.3417f, 4.9512f, 14.1464f, 5.1465f)
        lineTo(6.0f, 13.2929f)
        verticalLineTo(7.5f)
        curveTo(6.0f, 7.2239f, 5.7761f, 7.0f, 5.5f, 7.0f)
        curveTo(5.2239f, 7.0f, 5.0f, 7.2239f, 5.0f, 7.5f)
        verticalLineTo(14.5f)
        curveTo(5.0f, 14.5683f, 5.0137f, 14.6333f, 5.0384f, 14.6926f)
        curveTo(5.0617f, 14.7484f, 5.0956f, 14.8009f, 5.14f, 14.847f)
        curveTo(5.1442f, 14.8514f, 5.1486f, 14.8557f, 5.153f, 14.86f)
        curveTo(5.2429f, 14.9467f, 5.3653f, 15.0f, 5.5f, 15.0f)
        horizontalLineTo(12.5f)
        curveTo(12.7761f, 15.0f, 13.0f, 14.7761f, 13.0f, 14.5f)
        curveTo(13.0f, 14.2239f, 12.7761f, 14.0f, 12.5f, 14.0f)
        horizontalLineTo(6.7071f)
        lineTo(14.8536f, 5.8535f)
        close()
    }
}
.build()
