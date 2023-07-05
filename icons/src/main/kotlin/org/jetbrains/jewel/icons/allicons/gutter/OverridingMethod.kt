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
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.OverridingMethod: IntellijIconData
    get() {
        if (_overridingMethod != null) {
            return _overridingMethod!!
        }
        _overridingMethod = IntellijIconData(imageVector = { OverridingMethodComposable(it) })
        return _overridingMethod!!
    }

private var _overridingMethod: IntellijIconData? = null

private fun OverridingMethodComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "OverridingMethod", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth =
        14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 7.0f)
        curveTo(10.0f, 9.4853f, 7.9853f, 11.5f, 5.5f, 11.5f)
        curveTo(3.0147f, 11.5f, 1.0f, 9.4853f, 1.0f, 7.0f)
        curveTo(1.0f, 4.5147f, 3.0147f, 2.5f, 5.5f, 2.5f)
        curveTo(7.9853f, 2.5f, 10.0f, 4.5147f, 10.0f, 7.0f)
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
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(11.5f, 8.0f)
        curveTo(11.2239f, 8.0f, 11.0f, 7.7761f, 11.0f, 7.5f)
        lineTo(11.0f, 1.7071f)
        lineTo(9.8535f, 2.8535f)
        curveTo(9.6583f, 3.0488f, 9.3417f, 3.0488f, 9.1465f, 2.8535f)
        curveTo(8.9512f, 2.6583f, 8.9512f, 2.3417f, 9.1465f, 2.1465f)
        lineTo(11.1464f, 0.1464f)
        curveTo(11.3417f, -0.0488f, 11.6583f, -0.0488f, 11.8536f, 0.1464f)
        lineTo(13.8536f, 2.1465f)
        curveTo(14.0488f, 2.3417f, 14.0488f, 2.6583f, 13.8536f, 2.8535f)
        curveTo(13.6583f, 3.0488f, 13.3417f, 3.0488f, 13.1464f, 2.8535f)
        lineTo(12.0f, 1.7071f)
        lineTo(12.0f, 7.5f)
        curveTo(12.0f, 7.7761f, 11.7761f, 8.0f, 11.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 7.0f)
        curveTo(10.0f, 9.4853f, 7.9853f, 11.5f, 5.5f, 11.5f)
        curveTo(3.0147f, 11.5f, 1.0f, 9.4853f, 1.0f, 7.0f)
        curveTo(1.0f, 4.5147f, 3.0147f, 2.5f, 5.5f, 2.5f)
        curveTo(6.6154f, 2.5f, 7.636f, 2.9058f, 8.4222f, 3.5778f)
        lineTo(8.4393f, 3.5607f)
        curveTo(8.0501f, 3.1714f, 7.9195f, 2.6214f, 8.0476f, 2.1243f)
        curveTo(7.2859f, 1.7255f, 6.4193f, 1.5f, 5.5f, 1.5f)
        curveTo(2.4624f, 1.5f, 0.0f, 3.9624f, 0.0f, 7.0f)
        curveTo(0.0f, 10.0376f, 2.4624f, 12.5f, 5.5f, 12.5f)
        curveTo(7.9169f, 12.5f, 9.9697f, 10.9411f, 10.7077f, 8.7739f)
        curveTo(10.2828f, 8.5091f, 10.0f, 8.0375f, 10.0f, 7.5f)
        verticalLineTo(7.0f)
        close()
    }
}
.build()
