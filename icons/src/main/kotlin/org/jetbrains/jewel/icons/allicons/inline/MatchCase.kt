package org.jetbrains.jewel.icons.allicons.`inline`

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
import org.jetbrains.jewel.icons.allicons.InlineGroup

public val InlineGroup.MatchCase: IntellijIconData
    get() {
        if (_matchCase != null) {
            return _matchCase!!
        }
        _matchCase = IntellijIconData(imageVector = { MatchCaseComposable(it) })
        return _matchCase!!
    }

private var _matchCase: IntellijIconData? = null

private fun MatchCaseComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MatchCase", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.5162f, 13.0001f)
        curveTo(3.6854f, 13.0001f, 2.9334f, 12.7967f, 2.2602f, 12.3899f)
        curveTo(1.587f, 11.9787f, 1.0587f, 11.4161f, 0.6753f, 10.702f)
        curveTo(0.2918f, 9.9879f, 0.1001f, 9.1873f, 0.1001f, 8.3001f)
        curveTo(0.1001f, 7.4129f, 0.2918f, 6.6122f, 0.6753f, 5.8982f)
        curveTo(1.0587f, 5.1841f, 1.587f, 4.6236f, 2.2602f, 4.2168f)
        curveTo(2.9334f, 3.8057f, 3.6854f, 3.6001f, 4.5162f, 3.6001f)
        curveTo(5.2021f, 3.6001f, 5.8434f, 3.7364f, 6.4398f, 4.0091f)
        curveTo(7.0363f, 4.2774f, 7.5263f, 4.6474f, 7.9097f, 5.1192f)
        curveTo(8.2932f, 5.5909f, 8.5211f, 6.1146f, 8.5936f, 6.6901f)
        horizontalLineTo(7.3154f)
        curveTo(7.2259f, 6.3396f, 7.0427f, 6.0193f, 6.7658f, 5.7294f)
        curveTo(6.4931f, 5.4394f, 6.1586f, 5.2122f, 5.7624f, 5.0477f)
        curveTo(5.3662f, 4.8833f, 4.9508f, 4.8011f, 4.5162f, 4.8011f)
        curveTo(3.9282f, 4.8011f, 3.3999f, 4.9504f, 2.9313f, 5.249f)
        curveTo(2.4626f, 5.5476f, 2.094f, 5.9631f, 1.8256f, 6.4954f)
        curveTo(1.5615f, 7.0277f, 1.4294f, 7.6293f, 1.4294f, 8.3001f)
        curveTo(1.4294f, 8.9709f, 1.5615f, 9.5725f, 1.8256f, 10.1048f)
        curveTo(2.094f, 10.6371f, 2.4626f, 11.0526f, 2.9313f, 11.3512f)
        curveTo(3.3999f, 11.6498f, 3.9282f, 11.7991f, 4.5162f, 11.7991f)
        curveTo(4.9508f, 11.7991f, 5.3662f, 11.7169f, 5.7624f, 11.5524f)
        curveTo(6.1586f, 11.388f, 6.4931f, 11.1629f, 6.7658f, 10.8773f)
        curveTo(7.0427f, 10.5873f, 7.2259f, 10.2671f, 7.3154f, 9.9165f)
        horizontalLineTo(8.5936f)
        curveTo(8.5211f, 10.4921f, 8.2932f, 11.0158f, 7.9097f, 11.4875f)
        curveTo(7.5263f, 11.9549f, 7.0363f, 12.325f, 6.4398f, 12.5976f)
        curveTo(5.8434f, 12.8659f, 5.2021f, 13.0001f, 4.5162f, 13.0001f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.8005f, 13.0001f)
        curveTo(12.17f, 13.0001f, 11.6012f, 12.8486f, 11.0942f, 12.5457f)
        curveTo(10.5872f, 12.2427f, 10.1888f, 11.8273f, 9.8991f, 11.2993f)
        curveTo(9.6094f, 10.7669f, 9.4645f, 10.174f, 9.4645f, 9.5205f)
        curveTo(9.4645f, 8.867f, 9.6094f, 8.2763f, 9.8991f, 7.7483f)
        curveTo(10.1888f, 7.216f, 10.5872f, 6.7983f, 11.0942f, 6.4954f)
        curveTo(11.6012f, 6.1925f, 12.17f, 6.041f, 12.8005f, 6.041f)
        curveTo(13.3331f, 6.041f, 13.8167f, 6.134f, 14.2513f, 6.3201f)
        curveTo(14.6901f, 6.5062f, 15.0501f, 6.7767f, 15.3313f, 7.1316f)
        curveTo(15.6168f, 7.4865f, 15.8064f, 7.9084f, 15.9001f, 8.3975f)
        horizontalLineTo(14.6475f)
        curveTo(14.5623f, 8.1378f, 14.4259f, 7.9171f, 14.2385f, 7.7353f)
        curveTo(14.0553f, 7.5535f, 13.838f, 7.4172f, 13.5866f, 7.3263f)
        curveTo(13.3395f, 7.2311f, 13.0775f, 7.1835f, 12.8005f, 7.1835f)
        curveTo(12.4128f, 7.1835f, 12.0634f, 7.2831f, 11.7524f, 7.4821f)
        curveTo(11.4414f, 7.6812f, 11.1985f, 7.9582f, 11.0239f, 8.3131f)
        curveTo(10.8534f, 8.668f, 10.7682f, 9.0704f, 10.7682f, 9.5205f)
        curveTo(10.7682f, 9.9663f, 10.8534f, 10.3666f, 11.0239f, 10.7215f)
        curveTo(11.1985f, 11.0764f, 11.4414f, 11.3555f, 11.7524f, 11.5589f)
        curveTo(12.0634f, 11.758f, 12.4128f, 11.8576f, 12.8005f, 11.8576f)
        curveTo(13.0775f, 11.8576f, 13.3395f, 11.8121f, 13.5866f, 11.7212f)
        curveTo(13.838f, 11.626f, 14.0553f, 11.4875f, 14.2385f, 11.3058f)
        curveTo(14.4259f, 11.124f, 14.5623f, 10.9033f, 14.6475f, 10.6436f)
        horizontalLineTo(15.9001f)
        curveTo(15.8106f, 11.1197f, 15.6189f, 11.5351f, 15.3249f, 11.89f)
        curveTo(15.0352f, 12.2449f, 14.6709f, 12.5197f, 14.2321f, 12.7145f)
        curveTo(13.7975f, 12.9049f, 13.3203f, 13.0001f, 12.8005f, 13.0001f)
        close()
    }
}
.build()
