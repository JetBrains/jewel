package org.jetbrains.jewel.icons.allicons.breakpoints

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.BreakpointsGroup

public val BreakpointsGroup.QuestionBadge: IntellijIconData
    get() {
        if (_questionBadge != null) {
            return _questionBadge!!
        }
        _questionBadge = IntellijIconData(name = "QuestionBadge",size = DpSize(height = 10.0.dp,
                width = 7.0.dp),imageVector = { QuestionBadgeComposable(it) })
        return _questionBadge!!
    }

private var _questionBadge: IntellijIconData? = null

private fun QuestionBadgeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "QuestionBadge", defaultWidth = 7.0.dp, defaultHeight = 10.0.dp, viewportWidth = 7.0f,
        viewportHeight = 10.0f).apply {
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.5f, 0.0f)
        curveTo(1.567f, 0.0f, 0.0f, 1.567f, 0.0f, 3.5f)
        curveTo(0.0f, 4.0071f, 0.1078f, 4.4889f, 0.3018f, 4.924f)
        lineTo(2.3274f, 9.0063f)
        horizontalLineTo(4.5334f)
        lineTo(6.6982f, 4.924f)
        curveTo(6.7145f, 4.8875f, 6.7301f, 4.8506f, 6.7452f, 4.8135f)
        curveTo(6.9095f, 4.4079f, 7.0f, 3.9645f, 7.0f, 3.5f)
        curveTo(7.0f, 1.567f, 5.433f, 0.0f, 3.5f, 0.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke =
            SolidColor(colorScheme.generalStroke), strokeLineWidth = 0.2f, strokeLineCap = Butt,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.387f, 8.2195f)
        moveToRelative(-0.5788f, 0.0f)
        arcToRelative(0.5788f, 0.5788f, 0.0f, true, true, 1.1576f, 0.0f)
        arcToRelative(0.5788f, 0.5788f, 0.0f, true, true, -1.1576f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.1552f, 2.3492f)
        curveTo(3.9775f, 2.246f, 3.7696f, 2.1912f, 3.524f, 2.1912f)
        curveTo(3.2678f, 2.1912f, 3.0486f, 2.2478f, 2.8596f, 2.3552f)
        curveTo(2.6743f, 2.4625f, 2.5295f, 2.6123f, 2.4231f, 2.8101f)
        curveTo(2.3737f, 2.9034f, 2.3356f, 3.0039f, 2.3094f, 3.1124f)
        curveTo(2.2971f, 3.163f, 2.2874f, 3.2154f, 2.2803f, 3.2697f)
        curveTo(2.2476f, 3.5196f, 2.0461f, 3.7537f, 1.7554f, 3.7537f)
        horizontalLineTo(1.6856f)
        curveTo(1.4028f, 3.7537f, 1.1766f, 3.5187f, 1.1874f, 3.2361f)
        lineTo(1.1878f, 3.2247f)
        curveTo(1.1941f, 3.1594f, 1.2029f, 3.095f, 1.2138f, 3.0315f)
        curveTo(1.2589f, 2.7688f, 1.344f, 2.5234f, 1.47f, 2.2971f)
        lineTo(1.4708f, 2.2956f)
        curveTo(1.6727f, 1.9402f, 1.9556f, 1.6631f, 2.3151f, 1.469f)
        curveTo(2.675f, 1.271f, 3.0821f, 1.1755f, 3.5294f, 1.1755f)
        curveTo(3.9651f, 1.1755f, 4.3611f, 1.2671f, 4.7103f, 1.4576f)
        curveTo(5.0613f, 1.6435f, 5.3375f, 1.9069f, 5.5333f, 2.2453f)
        curveTo(5.7298f, 2.5852f, 5.8246f, 2.9712f, 5.8246f, 3.3957f)
        curveTo(5.8246f, 3.727f, 5.77f, 4.0301f, 5.6538f, 4.2998f)
        curveTo(5.5445f, 4.5535f, 5.4068f, 4.7736f, 5.2378f, 4.9553f)
        lineTo(5.237f, 4.9562f)
        lineTo(4.6498f, 5.5159f)
        curveTo(4.4635f, 5.6776f, 4.3217f, 5.8094f, 4.2221f, 5.9124f)
        curveTo(4.138f, 5.9993f, 4.0651f, 6.1029f, 4.0046f, 6.2239f)
        lineTo(4.0037f, 6.2258f)
        curveTo(3.9526f, 6.3254f, 3.9249f, 6.4399f, 3.9249f, 6.5744f)
        curveTo(3.9249f, 6.8341f, 3.7143f, 7.0447f, 3.4545f, 7.0447f)
        horizontalLineTo(3.3421f)
        curveTo(3.0675f, 7.0447f, 2.845f, 6.8222f, 2.845f, 6.5476f)
        curveTo(2.845f, 6.2943f, 2.8921f, 6.0582f, 2.9924f, 5.8447f)
        curveTo(3.0849f, 5.6475f, 3.2016f, 5.4726f, 3.3432f, 5.3226f)
        curveTo(3.4754f, 5.1828f, 3.6458f, 5.022f, 3.8524f, 4.8407f)
        curveTo(4.0592f, 4.6585f, 4.2196f, 4.5045f, 4.3362f, 4.3779f)
        lineTo(4.3377f, 4.3763f)
        lineTo(4.3387f, 4.3753f)
        curveTo(4.4454f, 4.2626f, 4.5375f, 4.1241f, 4.6127f, 3.9581f)
        lineTo(4.614f, 3.9553f)
        curveTo(4.6849f, 3.805f, 4.7233f, 3.6291f, 4.7233f, 3.4225f)
        curveTo(4.7233f, 3.1704f, 4.6707f, 2.9563f, 4.5721f, 2.7736f)
        curveTo(4.4736f, 2.5912f, 4.3368f, 2.4517f, 4.1579f, 2.3507f)
        lineTo(4.1552f, 2.3492f)
        close()
    }
}
.build()
