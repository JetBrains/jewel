package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.CloseSmallHovered: IntellijIconData
    get() {
        if (_closeSmallHovered != null) {
            return _closeSmallHovered!!
        }
        _closeSmallHovered = IntellijIconData(imageVector = { CloseSmallHoveredComposable(it) })
        return _closeSmallHovered!!
    }

private var _closeSmallHovered: IntellijIconData? = null

private fun CloseSmallHoveredComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "CloseSmallHovered", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF313547)), stroke = null, fillAlpha = 0.1f, strokeAlpha = 0.1f,
            strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-8.0f, 0.0f)
        arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
        arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(11.4939f, 4.4878f)
        curveTo(11.3002f, 4.2801f, 10.9724f, 4.2755f, 10.7729f, 4.4777f)
        lineTo(8.0007f, 7.2885f)
        lineTo(5.2287f, 4.4779f)
        curveTo(5.0292f, 4.2756f, 4.7014f, 4.2802f, 4.5077f, 4.488f)
        curveTo(4.3251f, 4.6838f, 4.3293f, 4.9888f, 4.5174f, 5.1795f)
        lineTo(7.2991f, 7.9999f)
        lineTo(4.5176f, 10.8201f)
        curveTo(4.3295f, 11.0108f, 4.3253f, 11.3158f, 4.5079f, 11.5116f)
        curveTo(4.7016f, 11.7194f, 5.0294f, 11.724f, 5.2289f, 11.5217f)
        lineTo(8.0007f, 8.7113f)
        lineTo(10.7727f, 11.5219f)
        curveTo(10.9722f, 11.7241f, 11.3f, 11.7196f, 11.4937f, 11.5118f)
        curveTo(11.6764f, 11.3159f, 11.6721f, 11.0109f, 11.484f, 10.8203f)
        lineTo(8.7024f, 7.9999f)
        lineTo(11.4843f, 5.1793f)
        curveTo(11.6723f, 4.9887f, 11.6766f, 4.6837f, 11.4939f, 4.4878f)
        close()
    }
}
.build()
