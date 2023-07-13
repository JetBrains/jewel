package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.ToolWindowJsonPath_20x20: IntellijIconData
    get() {
        if (_toolWindowJsonPath_20x20 != null) {
            return _toolWindowJsonPath_20x20!!
        }
        _toolWindowJsonPath_20x20 = IntellijIconData(name = "ToolWindowJsonPath_20x20",size =
                DpSize(height = 20.0.dp, width = 20.0.dp),imageVector = {
                ToolWindowJsonPath_20x20Composable(it) })
        return _toolWindowJsonPath_20x20!!
    }

private var _toolWindowJsonPath_20x20: IntellijIconData? = null

private fun ToolWindowJsonPath_20x20Composable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ToolWindowJsonPath_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.3709f, 12.3231f)
        curveTo(4.3836f, 11.8469f, 4.228f, 11.4691f, 3.9041f, 11.1897f)
        curveTo(3.5803f, 10.9039f, 3.1453f, 10.761f, 2.5992f, 10.761f)
        lineTo(2.0f, 10.761f)
        verticalLineTo(9.1608f)
        lineTo(2.5992f, 9.1608f)
        curveTo(3.1517f, 9.1608f, 3.5866f, 9.0211f, 3.9041f, 8.7417f)
        curveTo(4.228f, 8.456f, 4.3836f, 8.0718f, 4.3709f, 7.5892f)
        lineTo(4.3328f, 5.2747f)
        curveTo(4.3201f, 4.6143f, 4.4598f, 4.0364f, 4.7519f, 3.5411f)
        curveTo(5.0503f, 3.0458f, 5.4758f, 2.6648f, 6.0282f, 2.3981f)
        curveTo(6.5807f, 2.1314f, 7.2315f, 1.998f, 7.9808f, 1.998f)
        horizontalLineTo(9.0f)
        verticalLineTo(3.503f)
        horizontalLineTo(8.0285f)
        curveTo(7.3935f, 3.503f, 6.8918f, 3.6808f, 6.5235f, 4.0364f)
        curveTo(6.1552f, 4.3857f, 5.9742f, 4.8587f, 5.9806f, 5.4556f)
        lineTo(6.0187f, 7.7035f)
        curveTo(6.0314f, 8.3449f, 5.8536f, 8.8656f, 5.4853f, 9.2656f)
        curveTo(5.1233f, 9.6657f, 4.6312f, 9.8911f, 4.0089f, 9.9419f)
        curveTo(4.6312f, 10.0562f, 5.1233f, 10.3197f, 5.4853f, 10.7325f)
        curveTo(5.8536f, 11.1389f, 6.0314f, 11.6342f, 6.0187f, 12.2184f)
        lineTo(5.9806f, 14.7234f)
        curveTo(5.9679f, 15.2695f, 6.1298f, 15.7013f, 6.4664f, 16.0188f)
        curveTo(6.8093f, 16.3363f, 7.2728f, 16.4951f, 7.857f, 16.4951f)
        horizontalLineTo(9.0f)
        verticalLineTo(18.0f)
        horizontalLineTo(7.8094f)
        curveTo(7.1109f, 18.0f, 6.4981f, 17.873f, 5.9711f, 17.619f)
        curveTo(5.444f, 17.3714f, 5.0376f, 17.0126f, 4.7519f, 16.5427f)
        curveTo(4.4661f, 16.0792f, 4.3264f, 15.5362f, 4.3328f, 14.9139f)
        lineTo(4.3709f, 12.3231f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(16.0959f, 11.1897f)
        curveTo(15.772f, 11.4691f, 15.6165f, 11.8469f, 15.6292f, 12.3231f)
        lineTo(15.6672f, 14.9139f)
        curveTo(15.6736f, 15.5362f, 15.5339f, 16.0792f, 15.2482f, 16.5427f)
        curveTo(14.9624f, 17.0126f, 14.556f, 17.3714f, 14.029f, 17.619f)
        curveTo(13.5019f, 17.873f, 12.8891f, 18.0f, 12.1906f, 18.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(16.4951f)
        horizontalLineTo(12.143f)
        curveTo(12.7272f, 16.4951f, 13.1876f, 16.3363f, 13.5241f, 16.0188f)
        curveTo(13.867f, 15.7013f, 14.0321f, 15.2695f, 14.0194f, 14.7234f)
        lineTo(13.9813f, 12.2184f)
        curveTo(13.9686f, 11.6342f, 14.1433f, 11.1389f, 14.5052f, 10.7325f)
        curveTo(14.8735f, 10.3197f, 15.3688f, 10.0562f, 15.9911f, 9.9419f)
        curveTo(15.3688f, 9.8911f, 14.8735f, 9.6657f, 14.5052f, 9.2656f)
        curveTo(14.1433f, 8.8656f, 13.9686f, 8.3449f, 13.9813f, 7.7035f)
        lineTo(14.0194f, 5.4556f)
        curveTo(14.0258f, 4.8587f, 13.8448f, 4.3857f, 13.4765f, 4.0364f)
        curveTo(13.1082f, 3.6808f, 12.6066f, 3.503f, 11.9715f, 3.503f)
        horizontalLineTo(11.0f)
        verticalLineTo(1.998f)
        horizontalLineTo(12.0192f)
        curveTo(12.7685f, 1.998f, 13.4193f, 2.1314f, 13.9718f, 2.3981f)
        curveTo(14.5242f, 2.6648f, 14.9465f, 3.0458f, 15.2386f, 3.5411f)
        curveTo(15.5371f, 4.0364f, 15.6799f, 4.6143f, 15.6672f, 5.2747f)
        lineTo(15.6292f, 7.5892f)
        curveTo(15.6165f, 8.0718f, 15.7689f, 8.456f, 16.0864f, 8.7417f)
        curveTo(16.4102f, 9.0211f, 16.8484f, 9.1608f, 17.4008f, 9.1608f)
        lineTo(18.0f, 9.1608f)
        verticalLineTo(10.761f)
        lineTo(17.4008f, 10.761f)
        curveTo(16.8547f, 10.761f, 16.4197f, 10.9039f, 16.0959f, 11.1897f)
        close()
    }
}
.build()
