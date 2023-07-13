package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Scss: IntellijIconData
    get() {
        if (_scss != null) {
            return _scss!!
        }
        _scss = IntellijIconData(name = "Scss",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ScssComposable(it) })
        return _scss!!
    }

private var _scss: IntellijIconData? = null

private fun ScssComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Scss",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFCC6699)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(13.8113f, 2.7127f)
        curveTo(13.3919f, 1.068f, 10.6649f, 0.5274f, 8.084f, 1.4443f)
        curveTo(6.548f, 1.99f, 4.8852f, 2.8464f, 3.6896f, 3.9648f)
        curveTo(2.268f, 5.2944f, 2.0413f, 6.4517f, 2.1348f, 6.9353f)
        curveTo(2.4644f, 8.6416f, 4.8024f, 9.7569f, 5.7634f, 10.5844f)
        verticalLineTo(10.5894f)
        curveTo(5.4801f, 10.7289f, 3.4058f, 11.7786f, 2.9204f, 12.8518f)
        curveTo(2.4082f, 13.984f, 3.0019f, 14.7964f, 3.395f, 14.9057f)
        curveTo(4.6129f, 15.2446f, 5.8627f, 14.6351f, 6.5343f, 13.6333f)
        curveTo(7.1824f, 12.6665f, 7.1285f, 11.4181f, 6.8468f, 10.7971f)
        curveTo(7.2353f, 10.6946f, 7.6883f, 10.6487f, 8.264f, 10.7159f)
        curveTo(9.8884f, 10.9056f, 10.2071f, 11.9199f, 10.1462f, 12.3443f)
        curveTo(10.0852f, 12.7689f, 9.7446f, 13.0023f, 9.6306f, 13.0727f)
        curveTo(9.5167f, 13.1432f, 9.4819f, 13.1676f, 9.4915f, 13.2199f)
        curveTo(9.5053f, 13.2961f, 9.5581f, 13.2933f, 9.6552f, 13.2768f)
        curveTo(9.7889f, 13.2543f, 10.5082f, 12.9315f, 10.5389f, 12.148f)
        curveTo(10.5781f, 11.1532f, 9.6247f, 10.0403f, 7.9366f, 10.0694f)
        curveTo(7.2414f, 10.0814f, 6.8043f, 10.1475f, 6.4885f, 10.265f)
        curveTo(6.4652f, 10.2384f, 6.4414f, 10.212f, 6.4169f, 10.1858f)
        curveTo(5.3733f, 9.0724f, 3.4441f, 8.2847f, 3.5259f, 6.788f)
        curveTo(3.5556f, 6.2438f, 3.7448f, 4.8109f, 7.2329f, 3.0727f)
        curveTo(10.0902f, 1.6489f, 12.3777f, 2.0407f, 12.773f, 2.9091f)
        curveTo(13.3377f, 4.1496f, 11.5505f, 6.4553f, 8.5831f, 6.788f)
        curveTo(7.4526f, 6.9147f, 6.8573f, 6.4765f, 6.7092f, 6.3133f)
        curveTo(6.5533f, 6.1416f, 6.53f, 6.1338f, 6.4719f, 6.166f)
        curveTo(6.3771f, 6.2186f, 6.4372f, 6.3702f, 6.4719f, 6.4606f)
        curveTo(6.5605f, 6.6912f, 6.924f, 7.1001f, 7.5439f, 7.3035f)
        curveTo(8.0891f, 7.4825f, 9.4165f, 7.5807f, 11.0218f, 6.9599f)
        curveTo(12.8197f, 6.2643f, 14.2236f, 4.3297f, 13.8113f, 2.7127f)
        close()
        moveTo(6.1623f, 11.094f)
        curveTo(6.297f, 11.5924f, 6.2823f, 12.0571f, 6.1431f, 12.478f)
        curveTo(6.1276f, 12.5247f, 6.1106f, 12.5709f, 6.0921f, 12.6166f)
        curveTo(6.0736f, 12.6623f, 6.0536f, 12.7074f, 6.0321f, 12.752f)
        curveTo(5.9248f, 12.9746f, 5.7808f, 13.1831f, 5.6045f, 13.3754f)
        curveTo(5.0664f, 13.9624f, 4.3147f, 14.1843f, 3.9924f, 13.9974f)
        curveTo(3.6443f, 13.7956f, 3.8186f, 12.968f, 4.4425f, 12.3086f)
        curveTo(5.1135f, 11.5992f, 6.0791f, 11.1431f, 6.0791f, 11.1431f)
        lineTo(6.0777f, 11.1401f)
        curveTo(6.1054f, 11.1252f, 6.1336f, 11.1097f, 6.1623f, 11.094f)
        close()
    }
}
.build()
