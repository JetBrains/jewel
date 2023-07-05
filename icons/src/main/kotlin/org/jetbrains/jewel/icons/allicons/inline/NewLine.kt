package org.jetbrains.jewel.icons.allicons.`inline`

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
import org.jetbrains.jewel.icons.allicons.InlineGroup

public val InlineGroup.NewLine: IntellijIconData
    get() {
        if (_newLine != null) {
            return _newLine!!
        }
        _newLine = IntellijIconData(imageVector = { NewLineComposable(it) })
        return _newLine!!
    }

private var _newLine: IntellijIconData? = null

private fun NewLineComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "NewLine", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.8536f, 14.1464f)
        curveTo(6.0489f, 14.3417f, 6.0489f, 14.6583f, 5.8536f, 14.8536f)
        curveTo(5.6584f, 15.0488f, 5.3418f, 15.0488f, 5.1465f, 14.8536f)
        lineTo(1.6465f, 11.3536f)
        lineTo(1.293f, 11.0f)
        lineTo(1.6465f, 10.6464f)
        lineTo(5.1465f, 7.1465f)
        curveTo(5.3418f, 6.9512f, 5.6584f, 6.9512f, 5.8536f, 7.1465f)
        curveTo(6.0489f, 7.3417f, 6.0489f, 7.6583f, 5.8536f, 7.8535f)
        lineTo(3.2072f, 10.5f)
        horizontalLineTo(10.5001f)
        curveTo(12.4331f, 10.5f, 14.0001f, 8.933f, 14.0001f, 7.0f)
        curveTo(14.0001f, 5.067f, 12.4331f, 3.5f, 10.5001f, 3.5f)
        horizontalLineTo(5.5001f)
        curveTo(5.2239f, 3.5f, 5.0001f, 3.2761f, 5.0001f, 3.0f)
        curveTo(5.0001f, 2.7239f, 5.2239f, 2.5f, 5.5001f, 2.5f)
        horizontalLineTo(10.5001f)
        curveTo(12.9854f, 2.5f, 15.0001f, 4.5147f, 15.0001f, 7.0f)
        curveTo(15.0001f, 9.4853f, 12.9854f, 11.5f, 10.5001f, 11.5f)
        horizontalLineTo(3.2072f)
        lineTo(5.8536f, 14.1464f)
        close()
    }
}
.build()
