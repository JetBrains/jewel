package org.jetbrains.jewel.icons.allicons.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.CodewithmeGroup

public val CodewithmeGroup.CwmDisableCall: IntellijIconData
    get() {
        if (_cwmDisableCall != null) {
            return _cwmDisableCall!!
        }
        _cwmDisableCall = IntellijIconData(imageVector = { CwmDisableCallComposable(it) })
        return _cwmDisableCall!!
    }

private var _cwmDisableCall: IntellijIconData? = null

private fun CwmDisableCallComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "CwmDisableCall", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(13.4997f, 10.7357f)
        verticalLineTo(12.3917f)
        curveTo(13.5022f, 13.0247f, 12.933f, 13.5533f, 12.2939f, 13.4957f)
        curveTo(6.7778f, 13.5f, 2.5f, 9.1825f, 2.5043f, 3.7034f)
        curveTo(2.4468f, 3.0677f, 2.9727f, 2.5006f, 3.605f, 2.5001f)
        horizontalLineTo(5.2642f)
        curveTo(5.5326f, 2.4974f, 5.7929f, 2.5923f, 5.9964f, 2.767f)
        curveTo(6.575f, 3.2636f, 6.9472f, 4.9492f, 6.8039f, 5.6193f)
        curveTo(6.6922f, 6.1424f, 6.1648f, 6.5085f, 5.8062f, 6.8663f)
        curveTo(6.5936f, 8.2482f, 7.7401f, 9.3924f, 9.1248f, 10.1782f)
        curveTo(9.4833f, 9.8204f, 9.85f, 9.2941f, 10.3742f, 9.1825f)
        curveTo(11.0467f, 9.0394f, 12.7432f, 9.4121f, 13.2378f, 9.9947f)
        curveTo(13.4132f, 10.2013f, 13.5064f, 10.465f, 13.4997f, 10.7357f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFDB3B4B)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(15.5f, 0.5f)
        lineTo(10.5f, 5.5f)
        moveTo(10.5f, 0.5f)
        lineTo(15.5f, 5.5f)
    }
}
.build()
