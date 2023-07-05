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

public val GeneralGroup.MoveUp: IntellijIconData
    get() {
        if (_moveUp != null) {
            return _moveUp!!
        }
        _moveUp = IntellijIconData(imageVector = { MoveUpComposable(it) })
        return _moveUp!!
    }

private var _moveUp: IntellijIconData? = null

private fun MoveUpComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MoveUp", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.8536f, 5.8535f)
        curveTo(12.0488f, 6.0488f, 12.0488f, 6.3654f, 11.8536f, 6.5606f)
        curveTo(11.6583f, 6.7559f, 11.3417f, 6.7559f, 11.1464f, 6.5606f)
        lineTo(8.5f, 3.9142f)
        lineTo(8.5f, 11.5071f)
        curveTo(8.5f, 11.7832f, 8.2761f, 12.0071f, 8.0f, 12.0071f)
        curveTo(7.7239f, 12.0071f, 7.5f, 11.7832f, 7.5f, 11.5071f)
        lineTo(7.5f, 3.9142f)
        lineTo(4.8535f, 6.5606f)
        curveTo(4.6583f, 6.7559f, 4.3417f, 6.7559f, 4.1465f, 6.5606f)
        curveTo(3.9512f, 6.3654f, 3.9512f, 6.0488f, 4.1465f, 5.8535f)
        lineTo(7.6465f, 2.3535f)
        lineTo(8.0f, 2.0f)
        lineTo(8.3535f, 2.3535f)
        lineTo(11.8536f, 5.8535f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 13.0071f)
        lineTo(13.5f, 13.0071f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 13.5071f)
        lineTo(14.0f, 13.5071f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 14.0071f)
        lineTo(2.5f, 14.0071f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 13.5071f)
        lineTo(2.0f, 13.5071f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 13.0071f)
        close()
    }
}
.build()
