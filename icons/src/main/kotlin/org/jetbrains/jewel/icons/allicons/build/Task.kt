package org.jetbrains.jewel.icons.allicons.build

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.BuildGroup

public val BuildGroup.Task: IntellijIconData
    get() {
        if (_task != null) {
            return _task!!
        }
        _task = IntellijIconData(imageVector = { TaskComposable(it) })
        return _task!!
    }

private var _task: IntellijIconData? = null

private fun TaskComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Task",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.2266f, 4.3696f)
        curveTo(2.9223f, 4.7692f, 2.6674f, 5.2078f, 2.4704f, 5.6763f)
        lineTo(3.3099f, 7.0943f)
        curveTo(3.6406f, 7.6528f, 3.6406f, 8.3472f, 3.3099f, 8.9057f)
        lineTo(2.4704f, 10.3237f)
        curveTo(2.6674f, 10.7922f, 2.9223f, 11.2308f, 3.2266f, 11.6304f)
        lineTo(4.8726f, 11.6124f)
        curveTo(5.5216f, 11.6053f, 6.123f, 11.9524f, 6.4413f, 12.5181f)
        lineTo(7.249f, 13.953f)
        curveTo(7.4959f, 13.984f, 7.7479f, 14.0f, 8.0041f, 14.0f)
        curveTo(8.2602f, 14.0f, 8.5121f, 13.984f, 8.759f, 13.9531f)
        lineTo(9.5667f, 12.5181f)
        curveTo(9.8851f, 11.9524f, 10.4864f, 11.6053f, 11.1354f, 11.6124f)
        lineTo(12.7816f, 11.6304f)
        curveTo(13.0858f, 11.2308f, 13.3408f, 10.7923f, 13.5377f, 10.3239f)
        lineTo(12.6981f, 8.9057f)
        curveTo(12.3674f, 8.3472f, 12.3674f, 7.6528f, 12.6981f, 7.0943f)
        lineTo(13.5377f, 5.6761f)
        curveTo(13.3408f, 5.2077f, 13.0858f, 4.7692f, 12.7816f, 4.3696f)
        lineTo(11.1354f, 4.3876f)
        curveTo(10.4864f, 4.3948f, 9.8851f, 4.0476f, 9.5667f, 3.4819f)
        lineTo(8.759f, 2.0469f)
        curveTo(8.5121f, 2.016f, 8.2602f, 2.0f, 8.0041f, 2.0f)
        curveTo(7.7479f, 2.0f, 7.4959f, 2.016f, 7.249f, 2.047f)
        lineTo(6.4413f, 3.4819f)
        curveTo(6.123f, 4.0476f, 5.5216f, 4.3948f, 4.8726f, 4.3876f)
        lineTo(3.2266f, 4.3696f)
        close()
        moveTo(10.655f, 8.0f)
        curveTo(10.655f, 9.4641f, 9.4681f, 10.651f, 8.004f, 10.651f)
        curveTo(6.5399f, 10.651f, 5.353f, 9.4641f, 5.353f, 8.0f)
        curveTo(5.353f, 6.5359f, 6.5399f, 5.349f, 8.004f, 5.349f)
        curveTo(9.4681f, 5.349f, 10.655f, 6.5359f, 10.655f, 8.0f)
        close()
        moveTo(4.8836f, 3.3877f)
        curveTo(5.1675f, 3.3908f, 5.4306f, 3.2389f, 5.5699f, 2.9915f)
        lineTo(6.4382f, 1.4488f)
        curveTo(6.5491f, 1.2516f, 6.7401f, 1.1101f, 6.9639f, 1.0768f)
        curveTo(7.3033f, 1.0262f, 7.6506f, 1.0f, 8.0041f, 1.0f)
        curveTo(8.3575f, 1.0f, 8.7048f, 1.0262f, 9.0441f, 1.0767f)
        curveTo(9.2679f, 1.1101f, 9.4589f, 1.2516f, 9.5699f, 1.4487f)
        lineTo(10.4382f, 2.9915f)
        curveTo(10.5774f, 3.2389f, 10.8405f, 3.3908f, 11.1245f, 3.3877f)
        lineTo(12.8938f, 3.3683f)
        curveTo(13.1196f, 3.3658f, 13.3372f, 3.4601f, 13.4781f, 3.6366f)
        curveTo(13.9099f, 4.1777f, 14.2632f, 4.7842f, 14.5207f, 5.4388f)
        curveTo(14.6034f, 5.6491f, 14.5763f, 5.8849f, 14.4612f, 6.0793f)
        lineTo(13.5586f, 7.6038f)
        curveTo(13.4139f, 7.8481f, 13.4139f, 8.1519f, 13.5586f, 8.3962f)
        lineTo(14.4612f, 9.9207f)
        curveTo(14.5763f, 10.1151f, 14.6034f, 10.3509f, 14.5207f, 10.5612f)
        curveTo(14.2632f, 11.2158f, 13.9099f, 11.8223f, 13.4781f, 12.3634f)
        curveTo(13.3372f, 12.5399f, 13.1196f, 12.6342f, 12.8938f, 12.6317f)
        lineTo(11.1245f, 12.6123f)
        curveTo(10.8405f, 12.6092f, 10.5774f, 12.7611f, 10.4382f, 13.0085f)
        lineTo(9.5699f, 14.5513f)
        curveTo(9.4589f, 14.7484f, 9.2679f, 14.8899f, 9.0441f, 14.9233f)
        curveTo(8.7048f, 14.9738f, 8.3575f, 15.0f, 8.0041f, 15.0f)
        curveTo(7.6506f, 15.0f, 7.3033f, 14.9738f, 6.9639f, 14.9232f)
        curveTo(6.7401f, 14.8899f, 6.5491f, 14.7484f, 6.4382f, 14.5512f)
        lineTo(5.5699f, 13.0085f)
        curveTo(5.4306f, 12.7611f, 5.1675f, 12.6092f, 4.8836f, 12.6123f)
        lineTo(3.1144f, 12.6317f)
        curveTo(2.8886f, 12.6342f, 2.671f, 12.5399f, 2.5301f, 12.3634f)
        curveTo(2.0982f, 11.8223f, 1.7449f, 11.2158f, 1.4874f, 10.561f)
        curveTo(1.4047f, 10.3508f, 1.4318f, 10.115f, 1.5469f, 9.9206f)
        lineTo(2.4494f, 8.3962f)
        curveTo(2.5941f, 8.1519f, 2.5941f, 7.8481f, 2.4494f, 7.6038f)
        lineTo(1.5469f, 6.0794f)
        curveTo(1.4318f, 5.885f, 1.4047f, 5.6492f, 1.4874f, 5.439f)
        curveTo(1.7449f, 4.7842f, 2.0982f, 4.1777f, 2.5301f, 3.6366f)
        curveTo(2.671f, 3.4601f, 2.8886f, 3.3658f, 3.1144f, 3.3683f)
        lineTo(4.8836f, 3.3877f)
        close()
        moveTo(9.655f, 8.0f)
        curveTo(9.655f, 8.9118f, 8.9158f, 9.651f, 8.004f, 9.651f)
        curveTo(7.0922f, 9.651f, 6.353f, 8.9118f, 6.353f, 8.0f)
        curveTo(6.353f, 7.0882f, 7.0922f, 6.349f, 8.004f, 6.349f)
        curveTo(8.9158f, 6.349f, 9.655f, 7.0882f, 9.655f, 8.0f)
        close()
    }
}
.build()
