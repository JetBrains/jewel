package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.TestUnknown: IntellijIconData
    get() {
        if (_testUnknown != null) {
            return _testUnknown!!
        }
        _testUnknown = IntellijIconData(imageVector = { TestUnknownComposable(it) })
        return _testUnknown!!
    }

private var _testUnknown: IntellijIconData? = null

private fun TestUnknownComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TestUnknown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.6712f, 10.5796f)
        verticalLineTo(10.4319f)
        curveTo(6.675f, 9.7463f, 6.7393f, 9.2008f, 6.8643f, 8.7955f)
        curveTo(6.9931f, 8.3902f, 7.175f, 8.0644f, 7.4098f, 7.8182f)
        curveTo(7.6446f, 7.5682f, 7.9306f, 7.3391f, 8.2677f, 7.1307f)
        curveTo(8.4988f, 6.9868f, 8.7052f, 6.8296f, 8.8871f, 6.6591f)
        curveTo(9.0727f, 6.4849f, 9.2185f, 6.2917f, 9.3246f, 6.0796f)
        curveTo(9.4306f, 5.8637f, 9.4837f, 5.6231f, 9.4837f, 5.358f)
        curveTo(9.4837f, 5.0588f, 9.4136f, 4.7993f, 9.2734f, 4.5796f)
        curveTo(9.1333f, 4.3599f, 8.9439f, 4.1894f, 8.7052f, 4.0682f)
        curveTo(8.4704f, 3.947f, 8.2072f, 3.8864f, 7.9155f, 3.8864f)
        curveTo(7.6465f, 3.8864f, 7.3909f, 3.9451f, 7.1484f, 4.0625f)
        curveTo(6.9098f, 4.1762f, 6.7109f, 4.3504f, 6.5518f, 4.5853f)
        curveTo(6.3965f, 4.8163f, 6.3094f, 5.1099f, 6.2905f, 5.466f)
        horizontalLineTo(4.2677f)
        curveTo(4.2867f, 4.7463f, 4.4609f, 4.144f, 4.7905f, 3.6591f)
        curveTo(5.1238f, 3.1743f, 5.5632f, 2.8107f, 6.1087f, 2.5682f)
        curveTo(6.6579f, 2.3258f, 7.264f, 2.2046f, 7.9268f, 2.2046f)
        curveTo(8.6503f, 2.2046f, 9.2867f, 2.3315f, 9.8359f, 2.5853f)
        curveTo(10.389f, 2.8391f, 10.8189f, 3.2008f, 11.1257f, 3.6705f)
        curveTo(11.4363f, 4.1364f, 11.5916f, 4.6894f, 11.5916f, 5.3296f)
        curveTo(11.5916f, 5.7614f, 11.5215f, 6.1478f, 11.3814f, 6.4887f)
        curveTo(11.245f, 6.8296f, 11.05f, 7.1326f, 10.7962f, 7.3978f)
        curveTo(10.5424f, 7.6629f, 10.2412f, 7.8997f, 9.8927f, 8.108f)
        curveTo(9.5859f, 8.2974f, 9.334f, 8.4944f, 9.1371f, 8.6989f)
        curveTo(8.9439f, 8.9035f, 8.7999f, 9.144f, 8.7052f, 9.4205f)
        curveTo(8.6143f, 9.6932f, 8.567f, 10.0303f, 8.5632f, 10.4319f)
        verticalLineTo(10.5796f)
        horizontalLineTo(6.6712f)
        close()
        moveTo(7.6598f, 14.125f)
        curveTo(7.3189f, 14.125f, 7.0253f, 14.0038f, 6.7791f, 13.7614f)
        curveTo(6.5329f, 13.519f, 6.4098f, 13.2235f, 6.4098f, 12.875f)
        curveTo(6.4098f, 12.5341f, 6.5329f, 12.2425f, 6.7791f, 12.0f)
        curveTo(7.0253f, 11.7576f, 7.3189f, 11.6364f, 7.6598f, 11.6364f)
        curveTo(7.9969f, 11.6364f, 8.2886f, 11.7576f, 8.5348f, 12.0f)
        curveTo(8.7848f, 12.2425f, 8.9098f, 12.5341f, 8.9098f, 12.875f)
        curveTo(8.9098f, 13.1061f, 8.8511f, 13.3163f, 8.7337f, 13.5057f)
        curveTo(8.62f, 13.6951f, 8.4685f, 13.8466f, 8.2791f, 13.9603f)
        curveTo(8.0935f, 14.0701f, 7.8871f, 14.125f, 7.6598f, 14.125f)
        close()
    }
}
.build()
