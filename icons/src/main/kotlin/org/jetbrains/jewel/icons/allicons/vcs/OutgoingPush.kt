package org.jetbrains.jewel.icons.allicons.vcs

import androidx.compose.ui.graphics.Color
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

public val VcsGroup.OutgoingPush: IntellijIconData
    get() {
        if (_outgoingPush != null) {
            return _outgoingPush!!
        }
        _outgoingPush = IntellijIconData(name = "OutgoingPush",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { OutgoingPushComposable(it) })
        return _outgoingPush!!
    }

private var _outgoingPush: IntellijIconData? = null

private fun OutgoingPushComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "OutgoingPush", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF369650)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(3.1465f, 12.1464f)
        curveTo(2.9512f, 12.3417f, 2.9512f, 12.6583f, 3.1465f, 12.8536f)
        curveTo(3.3417f, 13.0488f, 3.6583f, 13.0488f, 3.8536f, 12.8536f)
        lineTo(12.0f, 4.7071f)
        verticalLineTo(10.5f)
        curveTo(12.0f, 10.7761f, 12.2238f, 11.0f, 12.5f, 11.0f)
        curveTo(12.7761f, 11.0f, 13.0f, 10.7761f, 13.0f, 10.5f)
        verticalLineTo(3.5f)
        curveTo(13.0f, 3.2239f, 12.7761f, 3.0f, 12.5f, 3.0f)
        horizontalLineTo(5.5f)
        curveTo(5.2238f, 3.0f, 5.0f, 3.2239f, 5.0f, 3.5f)
        curveTo(5.0f, 3.7761f, 5.2238f, 4.0f, 5.5f, 4.0f)
        horizontalLineTo(11.2929f)
        lineTo(3.1465f, 12.1464f)
        close()
    }
}
.build()
