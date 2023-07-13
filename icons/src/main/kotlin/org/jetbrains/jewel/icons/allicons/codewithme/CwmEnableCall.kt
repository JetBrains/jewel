package org.jetbrains.jewel.icons.allicons.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.CodewithmeGroup

public val CodewithmeGroup.CwmEnableCall: IntellijIconData
    get() {
        if (_cwmEnableCall != null) {
            return _cwmEnableCall!!
        }
        _cwmEnableCall = IntellijIconData(name = "CwmEnableCall",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { CwmEnableCallComposable(it) })
        return _cwmEnableCall!!
    }

private var _cwmEnableCall: IntellijIconData? = null

private fun CwmEnableCallComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "CwmEnableCall", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
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
}
.build()
