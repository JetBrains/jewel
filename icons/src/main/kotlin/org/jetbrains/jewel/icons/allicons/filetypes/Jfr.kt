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

public val FiletypesGroup.Jfr: IntellijIconData
    get() {
        if (_jfr != null) {
            return _jfr!!
        }
        _jfr = IntellijIconData(name = "Jfr",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { JfrComposable(it) })
        return _jfr!!
    }

private var _jfr: IntellijIconData? = null

private fun JfrComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Jfr",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.0959f, 13.0f)
        verticalLineTo(11.9795f)
        horizontalLineTo(2.616f)
        curveTo(2.837f, 11.9795f, 3.0016f, 11.8842f, 3.11f, 11.6935f)
        curveTo(3.2183f, 11.5028f, 3.2724f, 11.2103f, 3.2724f, 10.816f)
        verticalLineTo(3.9f)
        horizontalLineTo(4.358f)
        verticalLineTo(10.881f)
        curveTo(4.358f, 11.362f, 4.2973f, 11.7607f, 4.176f, 12.077f)
        curveTo(4.0546f, 12.389f, 3.8705f, 12.6208f, 3.6235f, 12.7725f)
        curveTo(3.3765f, 12.9242f, 3.0623f, 13.0f, 2.6809f, 13.0f)
        horizontalLineTo(2.0959f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.6668f, 13.0f)
        verticalLineTo(3.9f)
        horizontalLineTo(8.7608f)
        verticalLineTo(4.927f)
        horizontalLineTo(6.7523f)
        verticalLineTo(8.047f)
        horizontalLineTo(8.5008f)
        verticalLineTo(9.074f)
        horizontalLineTo(6.7523f)
        verticalLineTo(13.0f)
        horizontalLineTo(5.6668f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.3751f, 13.0f)
        lineTo(11.2701f, 8.84f)
        horizontalLineTo(12.3881f)
        lineTo(13.5516f, 13.0f)
        horizontalLineTo(12.3751f)
        close()
        moveTo(9.7166f, 13.0f)
        verticalLineTo(3.9f)
        horizontalLineTo(11.2766f)
        curveTo(11.7749f, 3.9f, 12.1801f, 3.9953f, 12.4921f, 4.186f)
        curveTo(12.8084f, 4.3767f, 13.0403f, 4.667f, 13.1876f, 5.057f)
        curveTo(13.3393f, 5.447f, 13.4151f, 5.941f, 13.4151f, 6.539f)
        curveTo(13.4151f, 7.1457f, 13.3393f, 7.6462f, 13.1876f, 8.0405f)
        curveTo(13.0359f, 8.4305f, 12.7976f, 8.7208f, 12.4726f, 8.9115f)
        curveTo(12.1519f, 9.1022f, 11.7359f, 9.1975f, 11.2246f, 9.1975f)
        horizontalLineTo(10.8021f)
        verticalLineTo(13.0f)
        horizontalLineTo(9.7166f)
        close()
        moveTo(11.2766f, 8.1835f)
        curveTo(11.6276f, 8.1835f, 11.8789f, 8.0535f, 12.0306f, 7.7935f)
        curveTo(12.1823f, 7.5292f, 12.2581f, 7.111f, 12.2581f, 6.539f)
        curveTo(12.2581f, 5.98f, 12.1823f, 5.5705f, 12.0306f, 5.3105f)
        curveTo(11.8789f, 5.0462f, 11.6276f, 4.914f, 11.2766f, 4.914f)
        horizontalLineTo(10.8021f)
        verticalLineTo(8.1835f)
        horizontalLineTo(11.2766f)
        close()
    }
}
.build()
