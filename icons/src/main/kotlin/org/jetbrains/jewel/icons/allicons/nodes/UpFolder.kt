package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.UpFolder: IntellijIconData
    get() {
        if (_upFolder != null) {
            return _upFolder!!
        }
        _upFolder = IntellijIconData(name = "UpFolder",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { UpFolderComposable(it) })
        return _upFolder!!
    }

private var _upFolder: IntellijIconData? = null

private fun UpFolderComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "UpFolder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.5f, 9.0f)
        curveTo(11.6716f, 9.0f, 11.0f, 8.3284f, 11.0f, 7.5f)
        verticalLineTo(5.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(3.5135f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(13.25f)
        curveTo(14.2165f, 14.0f, 15.0f, 13.1643f, 15.0f, 12.1333f)
        verticalLineTo(9.0f)
        horizontalLineTo(12.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.1464f, 0.1464f)
        curveTo(12.3417f, -0.0488f, 12.6583f, -0.0488f, 12.8536f, 0.1464f)
        lineTo(15.8536f, 3.1465f)
        curveTo(16.0488f, 3.3417f, 16.0488f, 3.6583f, 15.8536f, 3.8535f)
        curveTo(15.6583f, 4.0488f, 15.3417f, 4.0488f, 15.1464f, 3.8535f)
        lineTo(13.0f, 1.7071f)
        verticalLineTo(7.5f)
        curveTo(13.0f, 7.7761f, 12.7761f, 8.0f, 12.5f, 8.0f)
        curveTo(12.2239f, 8.0f, 12.0f, 7.7761f, 12.0f, 7.5f)
        verticalLineTo(1.7071f)
        lineTo(9.8535f, 3.8535f)
        curveTo(9.6583f, 4.0488f, 9.3417f, 4.0488f, 9.1465f, 3.8535f)
        curveTo(8.9512f, 3.6583f, 8.9512f, 3.3417f, 9.1465f, 3.1465f)
        lineTo(12.1464f, 0.1464f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.0f, 9.0f)
        verticalLineTo(12.1333f)
        curveTo(14.0f, 12.6738f, 13.6044f, 13.0f, 13.25f, 13.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        lineTo(8.0f, 4.9088f)
        verticalLineTo(3.5135f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(13.25f)
        curveTo(14.2165f, 14.0f, 15.0f, 13.1643f, 15.0f, 12.1333f)
        verticalLineTo(9.0f)
        horizontalLineTo(14.0f)
        close()
    }
}
.build()
