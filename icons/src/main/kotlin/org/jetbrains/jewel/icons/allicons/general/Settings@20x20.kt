package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.`Settings@20x20`: IntellijIconData
    get() {
        if (`_settings@20x20` != null) {
            return `_settings@20x20`!!
        }
        `_settings@20x20` = IntellijIconData(imageVector = { `Settings@20x20Composable`(it) })
        return `_settings@20x20`!!
    }

private var `_settings@20x20`: IntellijIconData? = null

private fun `Settings@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "Settings@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.9645f, 5.5478f)
        curveTo(3.6334f, 5.9957f, 3.3514f, 6.4813f, 3.1258f, 6.9967f)
        lineTo(4.1499f, 8.7263f)
        curveTo(4.6149f, 9.5118f, 4.6149f, 10.4882f, 4.1499f, 11.2736f)
        lineTo(3.1258f, 13.0033f)
        curveTo(3.3514f, 13.5187f, 3.6334f, 14.0043f, 3.9645f, 14.4522f)
        lineTo(5.9723f, 14.4302f)
        curveTo(6.885f, 14.4202f, 7.7306f, 14.9084f, 8.1783f, 15.7038f)
        lineTo(9.1633f, 17.4539f)
        curveTo(9.4378f, 17.4843f, 9.7172f, 17.5f, 10.0007f, 17.5f)
        curveTo(10.2843f, 17.5f, 10.5637f, 17.4843f, 10.8382f, 17.4539f)
        lineTo(11.8232f, 15.7038f)
        curveTo(12.2709f, 14.9084f, 13.1165f, 14.4202f, 14.0292f, 14.4302f)
        lineTo(16.037f, 14.4522f)
        curveTo(16.368f, 14.0043f, 16.6501f, 13.5186f, 16.8756f, 13.0033f)
        lineTo(15.8516f, 11.2736f)
        curveTo(15.3866f, 10.4882f, 15.3866f, 9.5118f, 15.8516f, 8.7263f)
        lineTo(16.8756f, 6.9967f)
        curveTo(16.6501f, 6.4813f, 16.368f, 5.9957f, 16.037f, 5.5478f)
        lineTo(14.0292f, 5.5698f)
        curveTo(13.1165f, 5.5798f, 12.2709f, 5.0916f, 11.8232f, 4.2962f)
        lineTo(10.8382f, 2.5461f)
        curveTo(10.5637f, 2.5157f, 10.2843f, 2.5f, 10.0007f, 2.5f)
        curveTo(9.7172f, 2.5f, 9.4378f, 2.5157f, 9.1633f, 2.5461f)
        lineTo(8.1783f, 4.2962f)
        curveTo(7.7306f, 5.0916f, 6.885f, 5.5798f, 5.9723f, 5.5698f)
        lineTo(3.9645f, 5.5478f)
        close()
        moveTo(13.6234f, 10.0f)
        curveTo(13.6234f, 12.0008f, 12.0015f, 13.6227f, 10.0007f, 13.6227f)
        curveTo(8.0f, 13.6227f, 6.378f, 12.0008f, 6.378f, 10.0f)
        curveTo(6.378f, 7.9992f, 8.0f, 6.3773f, 10.0007f, 6.3773f)
        curveTo(12.0015f, 6.3773f, 13.6234f, 7.9992f, 13.6234f, 10.0f)
        close()
        moveTo(5.9887f, 4.0699f)
        curveTo(6.3538f, 4.0739f, 6.6921f, 3.8786f, 6.8711f, 3.5604f)
        lineTo(7.9875f, 1.5769f)
        curveTo(8.1302f, 1.3235f, 8.3757f, 1.1415f, 8.6634f, 1.0987f)
        curveTo(9.0998f, 1.0337f, 9.5463f, 1.0f, 10.0007f, 1.0f)
        curveTo(10.4552f, 1.0f, 10.9017f, 1.0337f, 11.3381f, 1.0987f)
        curveTo(11.6258f, 1.1415f, 11.8713f, 1.3235f, 12.014f, 1.5769f)
        lineTo(13.1303f, 3.5604f)
        curveTo(13.3094f, 3.8786f, 13.6477f, 4.0739f, 14.0127f, 4.0699f)
        lineTo(16.2875f, 4.045f)
        curveTo(16.5778f, 4.0418f, 16.8576f, 4.163f, 17.0387f, 4.3899f)
        curveTo(17.594f, 5.0856f, 18.0482f, 5.8654f, 18.3793f, 6.7072f)
        curveTo(18.4856f, 6.9775f, 18.4507f, 7.2807f, 18.3027f, 7.5306f)
        lineTo(17.1424f, 9.4905f)
        curveTo(16.9563f, 9.8047f, 16.9563f, 10.1953f, 17.1424f, 10.5094f)
        lineTo(18.3027f, 12.4694f)
        curveTo(18.4507f, 12.7193f, 18.4856f, 13.0225f, 18.3793f, 13.2928f)
        curveTo(18.0482f, 14.1346f, 17.594f, 14.9144f, 17.0387f, 15.6101f)
        curveTo(16.8576f, 15.837f, 16.5778f, 15.9582f, 16.2875f, 15.955f)
        lineTo(14.0128f, 15.9301f)
        curveTo(13.6477f, 15.9261f, 13.3094f, 16.1214f, 13.1303f, 16.4395f)
        lineTo(12.014f, 18.423f)
        curveTo(11.8713f, 18.6765f, 11.6258f, 18.8584f, 11.3381f, 18.9013f)
        curveTo(10.9017f, 18.9663f, 10.4552f, 19.0f, 10.0007f, 19.0f)
        curveTo(9.5463f, 19.0f, 9.0998f, 18.9663f, 8.6634f, 18.9013f)
        curveTo(8.3757f, 18.8584f, 8.1302f, 18.6765f, 7.9875f, 18.423f)
        lineTo(6.8711f, 16.4395f)
        curveTo(6.6921f, 16.1214f, 6.3538f, 15.9261f, 5.9887f, 15.9301f)
        lineTo(3.714f, 15.955f)
        curveTo(3.4237f, 15.9582f, 3.1439f, 15.837f, 2.9628f, 15.6101f)
        curveTo(2.4075f, 14.9144f, 1.9533f, 14.1346f, 1.6222f, 13.2928f)
        curveTo(1.5158f, 13.0225f, 1.5508f, 12.7193f, 1.6988f, 12.4694f)
        lineTo(2.8591f, 10.5094f)
        curveTo(3.0451f, 10.1953f, 3.0451f, 9.8047f, 2.8591f, 9.4905f)
        lineTo(1.6988f, 7.5306f)
        curveTo(1.5508f, 7.2806f, 1.5158f, 6.9775f, 1.6222f, 6.7071f)
        curveTo(1.9533f, 5.8654f, 2.4075f, 5.0856f, 2.9628f, 4.3899f)
        curveTo(3.1439f, 4.163f, 3.4237f, 4.0418f, 3.714f, 4.045f)
        lineTo(5.9887f, 4.0699f)
        close()
        moveTo(12.1234f, 10.0f)
        curveTo(12.1234f, 11.1723f, 11.1731f, 12.1227f, 10.0007f, 12.1227f)
        curveTo(8.8284f, 12.1227f, 7.878f, 11.1723f, 7.878f, 10.0f)
        curveTo(7.878f, 8.8277f, 8.8284f, 7.8773f, 10.0007f, 7.8773f)
        curveTo(11.1731f, 7.8773f, 12.1234f, 8.8277f, 12.1234f, 10.0f)
        close()
    }
}
.build()
