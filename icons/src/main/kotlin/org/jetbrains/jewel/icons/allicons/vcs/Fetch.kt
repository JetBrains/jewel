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

public val VcsGroup.Fetch: IntellijIconData
    get() {
        if (_fetch != null) {
            return _fetch!!
        }
        _fetch = IntellijIconData(name = "Fetch",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { FetchComposable(it) })
        return _fetch!!
    }

private var _fetch: IntellijIconData? = null

private fun FetchComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Fetch",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.8536f, 3.1465f)
        curveTo(13.0488f, 3.3417f, 13.0488f, 3.6583f, 12.8536f, 3.8535f)
        lineTo(11.4393f, 5.2678f)
        curveTo(11.2441f, 5.463f, 10.9275f, 5.463f, 10.7322f, 5.2678f)
        curveTo(10.537f, 5.0725f, 10.537f, 4.7559f, 10.7322f, 4.5607f)
        lineTo(12.1464f, 3.1465f)
        curveTo(12.3417f, 2.9512f, 12.6583f, 2.9512f, 12.8536f, 3.1465f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0251f, 5.9749f)
        curveTo(10.2204f, 6.1701f, 10.2204f, 6.4867f, 10.0251f, 6.682f)
        lineTo(8.6109f, 8.0962f)
        curveTo(8.4157f, 8.2915f, 8.0991f, 8.2915f, 7.9038f, 8.0962f)
        curveTo(7.7085f, 7.9009f, 7.7085f, 7.5844f, 7.9038f, 7.3891f)
        lineTo(9.318f, 5.9749f)
        curveTo(9.5133f, 5.7796f, 9.8299f, 5.7796f, 10.0251f, 5.9749f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.1967f, 8.8033f)
        curveTo(7.392f, 8.9986f, 7.392f, 9.3152f, 7.1967f, 9.5104f)
        lineTo(5.7825f, 10.9246f)
        curveTo(5.5872f, 11.1199f, 5.2706f, 11.1199f, 5.0754f, 10.9246f)
        curveTo(4.8801f, 10.7294f, 4.8801f, 10.4128f, 5.0754f, 10.2175f)
        lineTo(6.4896f, 8.8033f)
        curveTo(6.6849f, 8.608f, 7.0014f, 8.608f, 7.1967f, 8.8033f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.5f, 5.0f)
        curveTo(3.7761f, 5.0f, 4.0f, 5.2239f, 4.0f, 5.5f)
        verticalLineTo(7.5f)
        curveTo(4.0f, 7.7761f, 3.7761f, 8.0f, 3.5f, 8.0f)
        curveTo(3.2239f, 8.0f, 3.0f, 7.7761f, 3.0f, 7.5f)
        verticalLineTo(5.5f)
        curveTo(3.0f, 5.2239f, 3.2239f, 5.0f, 3.5f, 5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.5f, 9.0f)
        curveTo(3.7761f, 9.0f, 4.0f, 9.2239f, 4.0f, 9.5f)
        verticalLineTo(12.0f)
        horizontalLineTo(6.5f)
        curveTo(6.7761f, 12.0f, 7.0f, 12.2239f, 7.0f, 12.5f)
        curveTo(7.0f, 12.7761f, 6.7761f, 13.0f, 6.5f, 13.0f)
        horizontalLineTo(3.5f)
        curveTo(3.2239f, 13.0f, 3.0f, 12.7761f, 3.0f, 12.5f)
        verticalLineTo(9.5f)
        curveTo(3.0f, 9.2239f, 3.2239f, 9.0f, 3.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 12.5f)
        curveTo(8.0f, 12.2239f, 8.2239f, 12.0f, 8.5f, 12.0f)
        horizontalLineTo(10.5f)
        curveTo(10.7761f, 12.0f, 11.0f, 12.2239f, 11.0f, 12.5f)
        curveTo(11.0f, 12.7761f, 10.7761f, 13.0f, 10.5f, 13.0f)
        horizontalLineTo(8.5f)
        curveTo(8.2239f, 13.0f, 8.0f, 12.7761f, 8.0f, 12.5f)
        close()
    }
}
.build()
