package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.TestCustom: IntellijIconData
    get() {
        if (_testCustom != null) {
            return _testCustom!!
        }
        _testCustom = IntellijIconData(name = "TestCustom",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { TestCustomComposable(it) })
        return _testCustom!!
    }

private var _testCustom: IntellijIconData? = null

private fun TestCustomComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TestCustom", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.purpleStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.1109f, 1.6068f)
        curveTo(7.5014f, 1.6553f, 7.8152f, 1.9518f, 7.8856f, 2.339f)
        lineTo(9.371f, 10.509f)
        lineTo(10.6808f, 7.6276f)
        curveTo(10.8268f, 7.3063f, 11.1472f, 7.1f, 11.5001f, 7.1f)
        horizontalLineTo(14.5001f)
        curveTo(14.9972f, 7.1f, 15.4001f, 7.5029f, 15.4001f, 8.0f)
        curveTo(15.4001f, 8.4971f, 14.9972f, 8.9f, 14.5001f, 8.9f)
        horizontalLineTo(12.0796f)
        lineTo(9.8194f, 13.8724f)
        curveTo(9.6566f, 14.2307f, 9.2799f, 14.4416f, 8.8893f, 14.3932f)
        curveTo(8.4988f, 14.3447f, 8.185f, 14.0482f, 8.1146f, 13.661f)
        lineTo(6.6292f, 5.491f)
        lineTo(5.3194f, 8.3724f)
        curveTo(5.1734f, 8.6937f, 4.853f, 8.9f, 4.5001f, 8.9f)
        horizontalLineTo(1.5001f)
        curveTo(1.003f, 8.9f, 0.6001f, 8.4971f, 0.6001f, 8.0f)
        curveTo(0.6001f, 7.5029f, 1.003f, 7.1f, 1.5001f, 7.1f)
        horizontalLineTo(3.9206f)
        lineTo(6.1808f, 2.1276f)
        curveTo(6.3436f, 1.7693f, 6.7203f, 1.5584f, 7.1109f, 1.6068f)
        close()
    }
}
.build()
