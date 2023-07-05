package org.jetbrains.jewel.icons.allicons.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.ImplementingFunctionalInterface: IntellijIconData
    get() {
        if (_implementingFunctionalInterface != null) {
            return _implementingFunctionalInterface!!
        }
        _implementingFunctionalInterface = IntellijIconData(imageVector = {
                ImplementingFunctionalInterfaceComposable(it) })
        return _implementingFunctionalInterface!!
    }

private var _implementingFunctionalInterface: IntellijIconData? = null

private fun ImplementingFunctionalInterfaceComposable(colorScheme: IntelliJIconColors): ImageVector
        = Builder(name = "ImplementingFunctionalInterface", defaultWidth = 14.0.dp, defaultHeight =
        14.0.dp, viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    group {
        path(fill = SolidColor(Color(0xFFFFF7F7)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(10.0f, 7.0f)
            curveTo(10.0f, 9.4853f, 7.9853f, 11.5f, 5.5f, 11.5f)
            curveTo(3.0147f, 11.5f, 1.0f, 9.4853f, 1.0f, 7.0f)
            curveTo(1.0f, 4.5147f, 3.0147f, 2.5f, 5.5f, 2.5f)
            curveTo(7.9853f, 2.5f, 10.0f, 4.5147f, 10.0f, 7.0f)
            close()
        }
        path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(7.463f, 10.08f)
            curveTo(7.2924f, 10.08f, 7.1484f, 10.0507f, 7.031f, 9.992f)
            curveTo(6.919f, 9.9333f, 6.8257f, 9.8507f, 6.751f, 9.744f)
            curveTo(6.6817f, 9.632f, 6.6204f, 9.496f, 6.567f, 9.336f)
            lineTo(6.119f, 8.0f)
            curveTo(6.087f, 7.8987f, 6.0497f, 7.792f, 6.007f, 7.68f)
            curveTo(5.9644f, 7.5627f, 5.9217f, 7.4427f, 5.879f, 7.32f)
            curveTo(5.8417f, 7.1973f, 5.8097f, 7.08f, 5.783f, 6.968f)
            curveTo(5.7564f, 6.8507f, 5.735f, 6.7413f, 5.719f, 6.64f)
            horizontalLineTo(5.687f)
            curveTo(5.6657f, 6.8587f, 5.6257f, 7.0747f, 5.567f, 7.288f)
            curveTo(5.5084f, 7.5013f, 5.4444f, 7.728f, 5.375f, 7.968f)
            lineTo(4.759f, 10.0f)
            horizontalLineTo(3.663f)
            lineTo(5.239f, 5.68f)
            lineTo(5.103f, 5.312f)
            curveTo(5.0177f, 5.0667f, 4.895f, 4.904f, 4.735f, 4.824f)
            curveTo(4.5804f, 4.7387f, 4.391f, 4.696f, 4.167f, 4.696f)
            curveTo(4.0764f, 4.696f, 3.9937f, 4.7013f, 3.919f, 4.712f)
            curveTo(3.8444f, 4.7227f, 3.7804f, 4.7333f, 3.727f, 4.744f)
            verticalLineTo(3.944f)
            curveTo(3.775f, 3.9333f, 3.8284f, 3.9227f, 3.887f, 3.912f)
            curveTo(3.951f, 3.9013f, 4.0204f, 3.8933f, 4.095f, 3.888f)
            curveTo(4.1697f, 3.8827f, 4.247f, 3.88f, 4.327f, 3.88f)
            curveTo(4.6204f, 3.88f, 4.8737f, 3.92f, 5.087f, 4.0f)
            curveTo(5.3004f, 4.0747f, 5.4817f, 4.2027f, 5.631f, 4.384f)
            curveTo(5.7857f, 4.5653f, 5.9244f, 4.816f, 6.047f, 5.136f)
            lineTo(7.359f, 8.64f)
            curveTo(7.423f, 8.8053f, 7.4764f, 8.9307f, 7.519f, 9.016f)
            curveTo(7.5617f, 9.1013f, 7.607f, 9.16f, 7.655f, 9.192f)
            curveTo(7.703f, 9.224f, 7.7564f, 9.24f, 7.815f, 9.24f)
            curveTo(7.8684f, 9.24f, 7.9137f, 9.2373f, 7.951f, 9.232f)
            curveTo(7.9884f, 9.2213f, 8.0257f, 9.2107f, 8.063f, 9.2f)
            verticalLineTo(9.968f)
            curveTo(8.0257f, 9.9893f, 7.9724f, 10.008f, 7.903f, 10.024f)
            curveTo(7.8337f, 10.04f, 7.759f, 10.0533f, 7.679f, 10.064f)
            curveTo(7.6044f, 10.0747f, 7.5324f, 10.08f, 7.463f, 10.08f)
            close()
        }
        path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                EvenOdd) {
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
        path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
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
}
.build()
