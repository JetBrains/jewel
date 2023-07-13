package org.jetbrains.jewel.icons.allicons.run

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
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.RestartDebug: IntellijIconData
    get() {
        if (_restartDebug != null) {
            return _restartDebug!!
        }
        _restartDebug = IntellijIconData(name = "RestartDebug",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { RestartDebugComposable(it) })
        return _restartDebug!!
    }

private var _restartDebug: IntellijIconData? = null

private fun RestartDebugComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "RestartDebug", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    group {
        path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(14.0f, 10.0f)
            curveTo(14.0f, 10.0847f, 13.9948f, 10.1682f, 13.9845f, 10.2501f)
            curveTo(13.4557f, 9.7833f, 12.7609f, 9.5f, 12.0f, 9.5f)
            curveTo(11.2391f, 9.5f, 10.5443f, 9.7833f, 10.0155f, 10.2501f)
            curveTo(10.0052f, 10.1682f, 10.0f, 10.0847f, 10.0f, 10.0f)
            curveTo(10.0f, 8.8954f, 10.8954f, 8.0f, 12.0f, 8.0f)
            curveTo(13.1046f, 8.0f, 14.0f, 8.8954f, 14.0f, 10.0f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(14.0f, 12.5f)
            curveTo(14.0f, 11.3954f, 13.1046f, 10.5f, 12.0f, 10.5f)
            curveTo(10.8954f, 10.5f, 10.0f, 11.3954f, 10.0f, 12.5f)
            verticalLineTo(13.0f)
            curveTo(10.0f, 14.1046f, 10.8954f, 15.0f, 12.0f, 15.0f)
            curveTo(13.1046f, 15.0f, 14.0f, 14.1046f, 14.0f, 13.0f)
            verticalLineTo(12.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF208A3C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                EvenOdd) {
            moveTo(14.0f, 10.0f)
            curveTo(14.0f, 10.0847f, 13.9947f, 10.1682f, 13.9845f, 10.2501f)
            curveTo(14.1237f, 10.373f, 14.2515f, 10.5086f, 14.3658f, 10.6552f)
            lineTo(15.2226f, 10.084f)
            curveTo(15.4525f, 9.9308f, 15.7629f, 9.9929f, 15.9161f, 10.2227f)
            curveTo(16.0692f, 10.4524f, 16.0072f, 10.7628f, 15.7773f, 10.916f)
            lineTo(14.8428f, 11.5391f)
            curveTo(14.9447f, 11.8408f, 15.0f, 12.1639f, 15.0f, 12.5f)
            verticalLineTo(13.0f)
            curveTo(15.0f, 13.4863f, 14.8843f, 13.9456f, 14.6789f, 14.3517f)
            lineTo(15.7773f, 15.084f)
            curveTo(16.0072f, 15.2371f, 16.0692f, 15.5476f, 15.9161f, 15.7773f)
            curveTo(15.7629f, 16.0071f, 15.4525f, 16.0692f, 15.2226f, 15.916f)
            lineTo(14.0847f, 15.1573f)
            curveTo(13.5449f, 15.679f, 12.8099f, 16.0f, 12.0f, 16.0f)
            curveTo(11.1901f, 16.0f, 10.4551f, 15.679f, 9.9153f, 15.1573f)
            lineTo(8.7773f, 15.916f)
            curveTo(8.5476f, 16.0692f, 8.2372f, 16.0071f, 8.084f, 15.7773f)
            curveTo(7.9309f, 15.5476f, 7.9929f, 15.2371f, 8.2226f, 15.084f)
            lineTo(9.321f, 14.3517f)
            curveTo(9.1157f, 13.9456f, 9.0f, 13.4863f, 9.0f, 13.0f)
            verticalLineTo(12.5f)
            curveTo(9.0f, 12.1639f, 9.0553f, 11.8408f, 9.1572f, 11.5391f)
            lineTo(8.2226f, 10.916f)
            curveTo(7.9929f, 10.7628f, 7.9309f, 10.4524f, 8.084f, 10.2227f)
            curveTo(8.2372f, 9.9929f, 8.5476f, 9.9308f, 8.7773f, 10.084f)
            lineTo(9.6341f, 10.6552f)
            curveTo(9.7485f, 10.5086f, 9.8763f, 10.373f, 10.0155f, 10.2501f)
            curveTo(10.0052f, 10.1682f, 10.0f, 10.0847f, 10.0f, 10.0f)
            curveTo(10.0f, 8.8954f, 10.8954f, 8.0f, 12.0f, 8.0f)
            curveTo(13.1046f, 8.0f, 14.0f, 8.8954f, 14.0f, 10.0f)
            close()
            moveTo(10.3917f, 14.189f)
            curveTo(10.397f, 14.196f, 10.4022f, 14.2031f, 10.4075f, 14.2101f)
            curveTo(10.7728f, 14.6901f, 11.3502f, 15.0f, 12.0f, 15.0f)
            curveTo(12.651f, 15.0f, 13.2292f, 14.689f, 13.5945f, 14.2075f)
            curveTo(13.5985f, 14.2021f, 13.6025f, 14.1968f, 13.6066f, 14.1915f)
            curveTo(13.8538f, 13.8587f, 14.0f, 13.4464f, 14.0f, 13.0f)
            verticalLineTo(12.5f)
            curveTo(14.0f, 11.3954f, 13.1046f, 10.5f, 12.0f, 10.5f)
            curveTo(10.8954f, 10.5f, 10.0f, 11.3954f, 10.0f, 12.5f)
            verticalLineTo(13.0f)
            curveTo(10.0f, 13.4453f, 10.1456f, 13.8566f, 10.3917f, 14.189f)
            close()
            moveTo(11.0632f, 9.6491f)
            curveTo(11.2053f, 9.2699f, 11.5712f, 9.0f, 12.0f, 9.0f)
            curveTo(12.4288f, 9.0f, 12.7947f, 9.2699f, 12.9368f, 9.6491f)
            curveTo(12.642f, 9.5523f, 12.3271f, 9.5f, 12.0f, 9.5f)
            curveTo(11.6728f, 9.5f, 11.358f, 9.5523f, 11.0632f, 9.6491f)
            close()
        }
        path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(14.0f, 1.5f)
            curveTo(14.0f, 1.2239f, 13.7761f, 1.0f, 13.5f, 1.0f)
            curveTo(13.2239f, 1.0f, 13.0f, 1.2239f, 13.0f, 1.5f)
            verticalLineTo(4.6824f)
            curveTo(11.9256f, 3.0663f, 10.0877f, 2.0f, 8.0f, 2.0f)
            curveTo(4.6863f, 2.0f, 2.0f, 4.6863f, 2.0f, 8.0f)
            curveTo(2.0f, 11.3137f, 4.6863f, 14.0f, 8.0f, 14.0f)
            curveTo(8.042f, 14.0f, 8.0839f, 13.9996f, 8.1257f, 13.9987f)
            curveTo(8.0436f, 13.6795f, 8.0f, 13.3448f, 8.0f, 13.0f)
            curveTo(5.2386f, 13.0f, 3.0f, 10.7614f, 3.0f, 8.0f)
            curveTo(3.0f, 5.2386f, 5.2386f, 3.0f, 8.0f, 3.0f)
            curveTo(9.6353f, 3.0f, 11.0878f, 3.785f, 12.0005f, 5.0f)
            horizontalLineTo(9.5f)
            curveTo(9.2239f, 5.0f, 9.0f, 5.2239f, 9.0f, 5.5f)
            curveTo(9.0f, 5.7761f, 9.2239f, 6.0f, 9.5f, 6.0f)
            horizontalLineTo(14.0f)
            verticalLineTo(1.5f)
            close()
        }
    }
}
.build()
