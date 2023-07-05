package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.HomeFolder: IntellijIconData
    get() {
        if (_homeFolder != null) {
            return _homeFolder!!
        }
        _homeFolder = IntellijIconData(imageVector = { HomeFolderComposable(it) })
        return _homeFolder!!
    }

private var _homeFolder: IntellijIconData? = null

private fun HomeFolderComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "HomeFolder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.3321f, 2.632f)
        lineTo(13.3321f, 7.0754f)
        curveTo(13.4389f, 7.1703f, 13.5f, 7.3063f, 13.5f, 7.4491f)
        verticalLineTo(13.0f)
        curveTo(13.5f, 13.2761f, 13.2761f, 13.5f, 13.0f, 13.5f)
        horizontalLineTo(10.0f)
        curveTo(9.7239f, 13.5f, 9.5f, 13.2761f, 9.5f, 13.0f)
        verticalLineTo(11.0f)
        curveTo(9.5f, 10.1716f, 8.8284f, 9.5f, 8.0f, 9.5f)
        curveTo(7.1716f, 9.5f, 6.5f, 10.1716f, 6.5f, 11.0f)
        verticalLineTo(13.0f)
        curveTo(6.5f, 13.2761f, 6.2761f, 13.5f, 6.0f, 13.5f)
        horizontalLineTo(3.0f)
        curveTo(2.7239f, 13.5f, 2.5f, 13.2761f, 2.5f, 13.0f)
        verticalLineTo(7.4491f)
        curveTo(2.5f, 7.3063f, 2.5611f, 7.1703f, 2.6679f, 7.0754f)
        lineTo(7.6679f, 2.632f)
        curveTo(7.8573f, 2.4637f, 8.1427f, 2.4637f, 8.3321f, 2.632f)
        close()
    }
}
.build()
