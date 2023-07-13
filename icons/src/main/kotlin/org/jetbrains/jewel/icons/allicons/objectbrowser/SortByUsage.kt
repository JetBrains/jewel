package org.jetbrains.jewel.icons.allicons.objectbrowser

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ObjectbrowserGroup

public val ObjectbrowserGroup.SortByUsage: IntellijIconData
    get() {
        if (_sortByUsage != null) {
            return _sortByUsage!!
        }
        _sortByUsage = IntellijIconData(name = "SortByUsage",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { SortByUsageComposable(it) })
        return _sortByUsage!!
    }

private var _sortByUsage: IntellijIconData? = null

private fun SortByUsageComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "SortByUsage", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.3848f, 2.12f)
        horizontalLineTo(14.5848f)
        lineTo(9.5248f, 9.12f)
        horizontalLineTo(8.3248f)
        lineTo(13.3848f, 2.12f)
        close()
        moveTo(9.6498f, 5.4f)
        curveTo(9.3165f, 5.4f, 9.0181f, 5.3283f, 8.7548f, 5.185f)
        curveTo(8.4948f, 5.0417f, 8.2915f, 4.8417f, 8.1448f, 4.585f)
        curveTo(7.9981f, 4.325f, 7.9248f, 4.03f, 7.9248f, 3.7f)
        curveTo(7.9248f, 3.37f, 7.9981f, 3.0767f, 8.1448f, 2.82f)
        curveTo(8.2915f, 2.56f, 8.4948f, 2.3583f, 8.7548f, 2.215f)
        curveTo(9.0181f, 2.0717f, 9.3165f, 2.0f, 9.6498f, 2.0f)
        curveTo(9.9898f, 2.0f, 10.2898f, 2.0717f, 10.5498f, 2.215f)
        curveTo(10.8131f, 2.3583f, 11.0181f, 2.56f, 11.1648f, 2.82f)
        curveTo(11.3148f, 3.0767f, 11.3898f, 3.37f, 11.3898f, 3.7f)
        curveTo(11.3898f, 4.03f, 11.3148f, 4.325f, 11.1648f, 4.585f)
        curveTo(11.0181f, 4.8417f, 10.8131f, 5.0417f, 10.5498f, 5.185f)
        curveTo(10.2898f, 5.3283f, 9.9898f, 5.4f, 9.6498f, 5.4f)
        close()
        moveTo(9.6548f, 4.515f)
        curveTo(9.8015f, 4.515f, 9.9331f, 4.4817f, 10.0498f, 4.415f)
        curveTo(10.1665f, 4.345f, 10.2565f, 4.2483f, 10.3198f, 4.125f)
        curveTo(10.3831f, 4.0017f, 10.4148f, 3.86f, 10.4148f, 3.7f)
        curveTo(10.4148f, 3.54f, 10.3831f, 3.3983f, 10.3198f, 3.275f)
        curveTo(10.2565f, 3.1517f, 10.1665f, 3.0567f, 10.0498f, 2.99f)
        curveTo(9.9331f, 2.92f, 9.8015f, 2.885f, 9.6548f, 2.885f)
        curveTo(9.5081f, 2.885f, 9.3765f, 2.92f, 9.2598f, 2.99f)
        curveTo(9.1465f, 3.0567f, 9.0581f, 3.1517f, 8.9948f, 3.275f)
        curveTo(8.9315f, 3.3983f, 8.8998f, 3.54f, 8.8998f, 3.7f)
        curveTo(8.8998f, 3.86f, 8.9315f, 4.0017f, 8.9948f, 4.125f)
        curveTo(9.0581f, 4.2483f, 9.1465f, 4.345f, 9.2598f, 4.415f)
        curveTo(9.3765f, 4.4817f, 9.5081f, 4.515f, 9.6548f, 4.515f)
        close()
        moveTo(13.2598f, 9.24f)
        curveTo(12.9231f, 9.24f, 12.6248f, 9.1683f, 12.3648f, 9.025f)
        curveTo(12.1048f, 8.8817f, 11.8998f, 8.6817f, 11.7498f, 8.425f)
        curveTo(11.6031f, 8.165f, 11.5298f, 7.87f, 11.5298f, 7.54f)
        curveTo(11.5298f, 7.21f, 11.6031f, 6.9167f, 11.7498f, 6.66f)
        curveTo(11.8998f, 6.4f, 12.1048f, 6.1983f, 12.3648f, 6.055f)
        curveTo(12.6248f, 5.9117f, 12.9231f, 5.84f, 13.2598f, 5.84f)
        curveTo(13.5965f, 5.84f, 13.8965f, 5.9117f, 14.1598f, 6.055f)
        curveTo(14.4265f, 6.1983f, 14.6331f, 6.4f, 14.7798f, 6.66f)
        curveTo(14.9265f, 6.9167f, 14.9998f, 7.21f, 14.9998f, 7.54f)
        curveTo(14.9998f, 7.87f, 14.9265f, 8.165f, 14.7798f, 8.425f)
        curveTo(14.6331f, 8.6817f, 14.4265f, 8.8817f, 14.1598f, 9.025f)
        curveTo(13.8965f, 9.1683f, 13.5965f, 9.24f, 13.2598f, 9.24f)
        close()
        moveTo(13.2598f, 8.355f)
        curveTo(13.4098f, 8.355f, 13.5431f, 8.3217f, 13.6598f, 8.255f)
        curveTo(13.7765f, 8.185f, 13.8665f, 8.0883f, 13.9298f, 7.965f)
        curveTo(13.9965f, 7.8417f, 14.0298f, 7.7f, 14.0298f, 7.54f)
        curveTo(14.0298f, 7.3833f, 13.9965f, 7.2433f, 13.9298f, 7.12f)
        curveTo(13.8665f, 6.9933f, 13.7765f, 6.8967f, 13.6598f, 6.83f)
        curveTo(13.5431f, 6.76f, 13.4098f, 6.725f, 13.2598f, 6.725f)
        curveTo(13.1131f, 6.725f, 12.9815f, 6.76f, 12.8648f, 6.83f)
        curveTo(12.7515f, 6.8967f, 12.6631f, 6.9933f, 12.5998f, 7.12f)
        curveTo(12.5365f, 7.2433f, 12.5048f, 7.3833f, 12.5048f, 7.54f)
        curveTo(12.5048f, 7.7f, 12.5365f, 7.8417f, 12.5998f, 7.965f)
        curveTo(12.6631f, 8.0883f, 12.7515f, 8.185f, 12.8648f, 8.255f)
        curveTo(12.9815f, 8.3217f, 13.1131f, 8.355f, 13.2598f, 8.355f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.8536f, 10.8536f)
        curveTo(8.0488f, 10.6583f, 8.0488f, 10.3417f, 7.8536f, 10.1464f)
        curveTo(7.6583f, 9.9512f, 7.3417f, 9.9512f, 7.1465f, 10.1464f)
        lineTo(5.0f, 12.2929f)
        lineTo(5.0f, 2.5f)
        curveTo(5.0f, 2.2239f, 4.7761f, 2.0f, 4.5f, 2.0f)
        curveTo(4.2239f, 2.0f, 4.0f, 2.2239f, 4.0f, 2.5f)
        lineTo(4.0f, 12.2929f)
        lineTo(1.8536f, 10.1464f)
        curveTo(1.6583f, 9.9512f, 1.3417f, 9.9512f, 1.1465f, 10.1464f)
        curveTo(0.9512f, 10.3417f, 0.9512f, 10.6583f, 1.1465f, 10.8536f)
        lineTo(4.1465f, 13.8536f)
        curveTo(4.3417f, 14.0488f, 4.6583f, 14.0488f, 4.8536f, 13.8536f)
        lineTo(7.8536f, 10.8536f)
        close()
    }
}
.build()
