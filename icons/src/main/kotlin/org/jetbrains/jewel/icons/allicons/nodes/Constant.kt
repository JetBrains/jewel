package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Constant: IntellijIconData
    get() {
        if (_constant != null) {
            return _constant!!
        }
        _constant = IntellijIconData(imageVector = { ConstantComposable(it) })
        return _constant!!
    }

private var _constant: IntellijIconData? = null

private fun ConstantComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Constant", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFF4EB)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(0.5863f, 6.5857f)
        lineTo(6.586f, 0.586f)
        curveTo(7.367f, -0.195f, 8.6334f, -0.195f, 9.4144f, 0.586f)
        lineTo(15.4141f, 6.5857f)
        curveTo(16.1951f, 7.3668f, 16.1951f, 8.6331f, 15.4141f, 9.4142f)
        lineTo(9.4144f, 15.4139f)
        curveTo(8.6334f, 16.1949f, 7.367f, 16.1949f, 6.586f, 15.4139f)
        lineTo(0.5863f, 9.4142f)
        curveTo(-0.1948f, 8.6331f, -0.1948f, 7.3668f, 0.5863f, 6.5857f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(7.2931f, 1.2931f)
        lineTo(1.2934f, 7.2928f)
        curveTo(0.9029f, 7.6834f, 0.9029f, 8.3165f, 1.2934f, 8.7071f)
        lineTo(7.2931f, 14.7067f)
        curveTo(7.6836f, 15.0973f, 8.3168f, 15.0973f, 8.7073f, 14.7067f)
        lineTo(14.707f, 8.7071f)
        curveTo(15.0975f, 8.3165f, 15.0975f, 7.6834f, 14.707f, 7.2928f)
        lineTo(8.7073f, 1.2931f)
        curveTo(8.3168f, 0.9026f, 7.6836f, 0.9026f, 7.2931f, 1.2931f)
        close()
        moveTo(6.586f, 0.586f)
        lineTo(0.5863f, 6.5857f)
        curveTo(-0.1948f, 7.3668f, -0.1948f, 8.6331f, 0.5863f, 9.4142f)
        lineTo(6.586f, 15.4139f)
        curveTo(7.367f, 16.1949f, 8.6334f, 16.1949f, 9.4144f, 15.4139f)
        lineTo(15.4141f, 9.4142f)
        curveTo(16.1951f, 8.6331f, 16.1951f, 7.3668f, 15.4141f, 6.5857f)
        lineTo(9.4144f, 0.586f)
        curveTo(8.6334f, -0.195f, 7.367f, -0.195f, 6.586f, 0.586f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.1329f, 11.5f)
        curveTo(9.6219f, 11.5f, 10.8981f, 10.6008f, 11.2123f, 9.3246f)
        horizontalLineTo(10.1971f)
        curveTo(9.8829f, 10.0546f, 9.1046f, 10.5767f, 8.1329f, 10.5767f)
        curveTo(6.7938f, 10.5767f, 5.827f, 9.5035f, 5.827f, 8.0f)
        curveTo(5.827f, 6.4966f, 6.7938f, 5.4233f, 8.1329f, 5.4233f)
        curveTo(9.1046f, 5.4233f, 9.8829f, 5.9454f, 10.1971f, 6.6754f)
        horizontalLineTo(11.2123f)
        curveTo(10.8981f, 5.3992f, 9.6219f, 4.5f, 8.1329f, 4.5f)
        curveTo(6.2137f, 4.5f, 4.7876f, 5.9938f, 4.7876f, 8.0f)
        curveTo(4.7876f, 10.0062f, 6.2137f, 11.5f, 8.1329f, 11.5f)
        close()
    }
}
.build()
