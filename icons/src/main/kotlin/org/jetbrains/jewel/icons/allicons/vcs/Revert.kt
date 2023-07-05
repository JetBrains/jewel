package org.jetbrains.jewel.icons.allicons.vcs

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
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.Revert: IntellijIconData
    get() {
        if (_revert != null) {
            return _revert!!
        }
        _revert = IntellijIconData(imageVector = { RevertComposable(it) })
        return _revert!!
    }

private var _revert: IntellijIconData? = null

private fun RevertComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Revert", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.8536f, 1.8535f)
        curveTo(6.0489f, 1.6583f, 6.0489f, 1.3417f, 5.8536f, 1.1465f)
        curveTo(5.6584f, 0.9512f, 5.3418f, 0.9512f, 5.1465f, 1.1465f)
        lineTo(1.6465f, 4.6465f)
        lineTo(1.293f, 5.0f)
        lineTo(1.6465f, 5.3535f)
        lineTo(5.1465f, 8.8535f)
        curveTo(5.3418f, 9.0488f, 5.6584f, 9.0488f, 5.8536f, 8.8535f)
        curveTo(6.0489f, 8.6583f, 6.0489f, 8.3417f, 5.8536f, 8.1465f)
        lineTo(3.2072f, 5.5f)
        horizontalLineTo(10.5001f)
        curveTo(12.4331f, 5.5f, 14.0001f, 7.067f, 14.0001f, 9.0f)
        curveTo(14.0001f, 10.933f, 12.4331f, 12.5f, 10.5001f, 12.5f)
        horizontalLineTo(5.5001f)
        curveTo(5.2239f, 12.5f, 5.0001f, 12.7239f, 5.0001f, 13.0f)
        curveTo(5.0001f, 13.2761f, 5.2239f, 13.5f, 5.5001f, 13.5f)
        horizontalLineTo(10.5001f)
        curveTo(12.9854f, 13.5f, 15.0001f, 11.4853f, 15.0001f, 9.0f)
        curveTo(15.0001f, 6.5147f, 12.9854f, 4.5f, 10.5001f, 4.5f)
        horizontalLineTo(3.2072f)
        lineTo(5.8536f, 1.8535f)
        close()
    }
}
.build()
