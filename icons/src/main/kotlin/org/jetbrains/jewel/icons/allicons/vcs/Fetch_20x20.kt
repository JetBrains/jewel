package org.jetbrains.jewel.icons.allicons.vcs

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
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.Fetch_20x20: IntellijIconData
    get() {
        if (_fetch_20x20 != null) {
            return _fetch_20x20!!
        }
        _fetch_20x20 = IntellijIconData(name = "Fetch_20x20",size = DpSize(height = 20.0.dp, width =
                20.0.dp),imageVector = { Fetch_20x20Composable(it) })
        return _fetch_20x20!!
    }

private var _fetch_20x20: IntellijIconData? = null

private fun Fetch_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Fetch_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.8536f, 5.1465f)
        curveTo(15.0488f, 5.3417f, 15.0488f, 5.6583f, 14.8536f, 5.8535f)
        lineTo(13.4393f, 7.2678f)
        curveTo(13.2441f, 7.463f, 12.9275f, 7.463f, 12.7322f, 7.2678f)
        curveTo(12.537f, 7.0725f, 12.537f, 6.7559f, 12.7322f, 6.5607f)
        lineTo(14.1464f, 5.1465f)
        curveTo(14.3417f, 4.9512f, 14.6583f, 4.9512f, 14.8536f, 5.1465f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.0251f, 7.9749f)
        curveTo(12.2204f, 8.1701f, 12.2204f, 8.4867f, 12.0251f, 8.682f)
        lineTo(10.6109f, 10.0962f)
        curveTo(10.4157f, 10.2915f, 10.0991f, 10.2915f, 9.9038f, 10.0962f)
        curveTo(9.7085f, 9.9009f, 9.7085f, 9.5843f, 9.9038f, 9.3891f)
        lineTo(11.318f, 7.9749f)
        curveTo(11.5133f, 7.7796f, 11.8299f, 7.7796f, 12.0251f, 7.9749f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.1967f, 10.8033f)
        curveTo(9.392f, 10.9986f, 9.392f, 11.3151f, 9.1967f, 11.5104f)
        lineTo(7.7825f, 12.9246f)
        curveTo(7.5872f, 13.1199f, 7.2706f, 13.1199f, 7.0754f, 12.9246f)
        curveTo(6.8801f, 12.7294f, 6.8801f, 12.4128f, 7.0754f, 12.2175f)
        lineTo(8.4896f, 10.8033f)
        curveTo(8.6848f, 10.608f, 9.0014f, 10.608f, 9.1967f, 10.8033f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 7.0f)
        curveTo(5.7761f, 7.0f, 6.0f, 7.2239f, 6.0f, 7.5f)
        verticalLineTo(9.5f)
        curveTo(6.0f, 9.7761f, 5.7761f, 10.0f, 5.5f, 10.0f)
        curveTo(5.2239f, 10.0f, 5.0f, 9.7761f, 5.0f, 9.5f)
        verticalLineTo(7.5f)
        curveTo(5.0f, 7.2239f, 5.2239f, 7.0f, 5.5f, 7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 11.0f)
        curveTo(5.7761f, 11.0f, 6.0f, 11.2239f, 6.0f, 11.5f)
        verticalLineTo(14.0f)
        horizontalLineTo(8.5f)
        curveTo(8.7761f, 14.0f, 9.0f, 14.2239f, 9.0f, 14.5f)
        curveTo(9.0f, 14.7761f, 8.7761f, 15.0f, 8.5f, 15.0f)
        horizontalLineTo(5.5f)
        curveTo(5.2239f, 15.0f, 5.0f, 14.7761f, 5.0f, 14.5f)
        verticalLineTo(11.5f)
        curveTo(5.0f, 11.2239f, 5.2239f, 11.0f, 5.5f, 11.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0f, 14.5f)
        curveTo(10.0f, 14.2239f, 10.2239f, 14.0f, 10.5f, 14.0f)
        horizontalLineTo(12.5f)
        curveTo(12.7761f, 14.0f, 13.0f, 14.2239f, 13.0f, 14.5f)
        curveTo(13.0f, 14.7761f, 12.7761f, 15.0f, 12.5f, 15.0f)
        horizontalLineTo(10.5f)
        curveTo(10.2239f, 15.0f, 10.0f, 14.7761f, 10.0f, 14.5f)
        close()
    }
}
.build()
