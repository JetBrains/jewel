package org.jetbrains.jewel.icons.allicons.ide

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
import org.jetbrains.jewel.icons.allicons.IdeGroup

public val IdeGroup.ExternalLink: IntellijIconData
    get() {
        if (_externalLink != null) {
            return _externalLink!!
        }
        _externalLink = IntellijIconData(imageVector = { ExternalLinkComposable(it) })
        return _externalLink!!
    }

private var _externalLink: IntellijIconData? = null

private fun ExternalLinkComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ExternalLink", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.0f, 5.5f)
        curveTo(5.0f, 5.2239f, 5.2239f, 5.0f, 5.5f, 5.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(10.5f)
        curveTo(11.0f, 10.7761f, 10.7761f, 11.0f, 10.5f, 11.0f)
        curveTo(10.2239f, 11.0f, 10.0f, 10.7761f, 10.0f, 10.5f)
        verticalLineTo(6.7071f)
        lineTo(4.8535f, 11.8536f)
        curveTo(4.6583f, 12.0488f, 4.3417f, 12.0488f, 4.1465f, 11.8536f)
        curveTo(3.9512f, 11.6583f, 3.9512f, 11.3417f, 4.1465f, 11.1464f)
        lineTo(9.2929f, 6.0f)
        horizontalLineTo(5.5f)
        curveTo(5.2239f, 6.0f, 5.0f, 5.7761f, 5.0f, 5.5f)
        close()
    }
}
.build()
