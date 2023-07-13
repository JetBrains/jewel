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

public val VcsGroup.IncomingUpdate: IntellijIconData
    get() {
        if (_incomingUpdate != null) {
            return _incomingUpdate!!
        }
        _incomingUpdate = IntellijIconData(name = "IncomingUpdate",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { IncomingUpdateComposable(it) })
        return _incomingUpdate!!
    }

private var _incomingUpdate: IntellijIconData? = null

private fun IncomingUpdateComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "IncomingUpdate", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.8536f, 3.8535f)
        curveTo(13.0488f, 3.6583f, 13.0488f, 3.3417f, 12.8536f, 3.1465f)
        curveTo(12.6583f, 2.9512f, 12.3417f, 2.9512f, 12.1464f, 3.1465f)
        lineTo(4.0f, 11.2929f)
        verticalLineTo(5.5f)
        curveTo(4.0f, 5.2239f, 3.7761f, 5.0f, 3.5f, 5.0f)
        curveTo(3.2239f, 5.0f, 3.0f, 5.2239f, 3.0f, 5.5f)
        verticalLineTo(12.5f)
        curveTo(3.0f, 12.5683f, 3.0137f, 12.6333f, 3.0384f, 12.6926f)
        curveTo(3.0617f, 12.7484f, 3.0956f, 12.8009f, 3.14f, 12.847f)
        curveTo(3.1442f, 12.8514f, 3.1486f, 12.8557f, 3.153f, 12.86f)
        curveTo(3.2429f, 12.9467f, 3.3653f, 13.0f, 3.5f, 13.0f)
        horizontalLineTo(10.5f)
        curveTo(10.7761f, 13.0f, 11.0f, 12.7761f, 11.0f, 12.5f)
        curveTo(11.0f, 12.2239f, 10.7761f, 12.0f, 10.5f, 12.0f)
        horizontalLineTo(4.7071f)
        lineTo(12.8536f, 3.8535f)
        close()
    }
}
.build()
