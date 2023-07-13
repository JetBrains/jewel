package org.jetbrains.jewel.icons.allicons.gutter

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.OverridenMethod: IntellijIconData
    get() {
        if (_overridenMethod != null) {
            return _overridenMethod!!
        }
        _overridenMethod = IntellijIconData(name = "OverridenMethod",size = DpSize(height = 14.0.dp,
                width = 14.0.dp),imageVector = { OverridenMethodComposable(it) })
        return _overridenMethod!!
    }

private var _overridenMethod: IntellijIconData? = null

private fun OverridenMethodComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "OverridenMethod", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 7.0f)
        curveTo(10.0f, 9.4853f, 7.9853f, 11.5f, 5.5f, 11.5f)
        curveTo(3.0147f, 11.5f, 1.0f, 9.4853f, 1.0f, 7.0f)
        curveTo(1.0f, 4.5147f, 3.0147f, 2.5f, 5.5f, 2.5f)
        curveTo(7.9853f, 2.5f, 10.0f, 4.5147f, 10.0f, 7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.5f, 6.0f)
        curveTo(11.7761f, 6.0f, 12.0f, 6.2239f, 12.0f, 6.5f)
        verticalLineTo(12.2929f)
        lineTo(13.1464f, 11.1464f)
        curveTo(13.3417f, 10.9512f, 13.6583f, 10.9512f, 13.8536f, 11.1464f)
        curveTo(14.0488f, 11.3417f, 14.0488f, 11.6583f, 13.8536f, 11.8536f)
        lineTo(11.8536f, 13.8536f)
        curveTo(11.6583f, 14.0488f, 11.3417f, 14.0488f, 11.1464f, 13.8536f)
        lineTo(9.1465f, 11.8536f)
        curveTo(8.9512f, 11.6583f, 8.9512f, 11.3417f, 9.1465f, 11.1464f)
        curveTo(9.3417f, 10.9512f, 9.6583f, 10.9512f, 9.8535f, 11.1464f)
        lineTo(11.0f, 12.2929f)
        verticalLineTo(6.5f)
        curveTo(11.0f, 6.2239f, 11.2239f, 6.0f, 11.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(5.4918f, 10.0f)
        curveTo(3.7295f, 10.0f, 2.5f, 8.6492f, 2.5f, 7.0166f)
        verticalLineTo(7.0f)
        curveTo(2.5f, 5.3674f, 3.7459f, 4.0f, 5.5082f, 4.0f)
        curveTo(7.2705f, 4.0f, 8.5f, 5.3508f, 8.5f, 6.9834f)
        verticalLineTo(7.0f)
        curveTo(8.5f, 8.6326f, 7.2541f, 10.0f, 5.4918f, 10.0f)
        close()
        moveTo(5.5082f, 9.0553f)
        curveTo(6.6475f, 9.0553f, 7.4426f, 8.1437f, 7.4426f, 7.0166f)
        verticalLineTo(7.0f)
        curveTo(7.4426f, 5.8729f, 6.6311f, 4.9447f, 5.4918f, 4.9447f)
        curveTo(4.3525f, 4.9447f, 3.5574f, 5.8563f, 3.5574f, 6.9834f)
        verticalLineTo(7.0f)
        curveTo(3.5574f, 8.1271f, 4.3689f, 9.0553f, 5.5082f, 9.0553f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 1.5f)
        curveTo(7.9169f, 1.5f, 9.9697f, 3.0589f, 10.7077f, 5.2261f)
        curveTo(10.2828f, 5.491f, 10.0f, 5.9625f, 10.0f, 6.5f)
        verticalLineTo(7.0f)
        curveTo(10.0f, 4.5147f, 7.9853f, 2.5f, 5.5f, 2.5f)
        curveTo(3.0147f, 2.5f, 1.0f, 4.5147f, 1.0f, 7.0f)
        curveTo(1.0f, 9.4853f, 3.0147f, 11.5f, 5.5f, 11.5f)
        curveTo(6.6154f, 11.5f, 7.636f, 11.0942f, 8.4222f, 10.4222f)
        lineTo(8.4393f, 10.4393f)
        curveTo(8.0501f, 10.8286f, 7.9195f, 11.3786f, 8.0476f, 11.8757f)
        curveTo(7.2859f, 12.2745f, 6.4193f, 12.5f, 5.5f, 12.5f)
        curveTo(2.4624f, 12.5f, 0.0f, 10.0376f, 0.0f, 7.0f)
        curveTo(0.0f, 3.9624f, 2.4624f, 1.5f, 5.5f, 1.5f)
        close()
    }
}
.build()
