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

public val FiletypesGroup.Protobuf: IntellijIconData
    get() {
        if (_protobuf != null) {
            return _protobuf!!
        }
        _protobuf = IntellijIconData(name = "Protobuf",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ProtobufComposable(it) })
        return _protobuf!!
    }

private var _protobuf: IntellijIconData? = null

private fun ProtobufComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Protobuf", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFC107)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.5122f, 12.2474f)
        lineTo(13.875f, 10.4077f)
        lineTo(12.0911f, 8.0f)
        lineTo(8.9443f, 12.2474f)
        horizontalLineTo(12.5122f)
        close()
    }
    path(fill = SolidColor(Color(0xFF0F9D58)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(15.3632f, 8.3982f)
        curveTo(15.5456f, 8.152f, 15.5456f, 7.8487f, 15.3632f, 7.6025f)
        lineTo(12.5113f, 3.7533f)
        horizontalLineTo(8.9443f)
        lineTo(13.875f, 10.4084f)
        lineTo(15.3632f, 8.3982f)
        close()
    }
    path(fill = SolidColor(Color(0xFFDB4437)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.4879f, 3.7526f)
        lineTo(2.125f, 5.5923f)
        lineTo(3.9089f, 8.0f)
        lineTo(7.0557f, 3.7526f)
        horizontalLineTo(3.4879f)
        close()
    }
    path(fill = SolidColor(Color(0xFF4285F4)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(0.6368f, 7.6018f)
        curveTo(0.4544f, 7.848f, 0.4544f, 8.1513f, 0.6368f, 8.3975f)
        lineTo(3.4887f, 12.2467f)
        horizontalLineTo(7.0556f)
        lineTo(2.1249f, 5.5922f)
        lineTo(0.6368f, 7.6018f)
        close()
    }
}
.build()
