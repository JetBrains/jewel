package org.jetbrains.jewel.icons.allicons.run.widget

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.run.WidgetGroup

public val WidgetGroup.Loader: IntellijIconData
    get() {
        if (_loader != null) {
            return _loader!!
        }
        _loader = IntellijIconData(name = "Loader",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { LoaderComposable(it) })
        return _loader!!
    }

private var _loader: IntellijIconData? = null

private fun LoaderComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Loader", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 2.0f)
        verticalLineTo(4.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.915f, strokeAlpha = 0.915f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.0f, 2.8038f)
        lineTo(6.0f, 4.5359f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.83f, strokeAlpha = 0.83f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.804f, 5.0f)
        lineTo(4.536f, 6.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.745f, strokeAlpha = 0.745f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.0002f, 8.0f)
        lineTo(4.0002f, 8.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.66f, strokeAlpha = 0.66f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.804f, 11.0f)
        lineTo(4.536f, 10.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.575f, strokeAlpha = 0.575f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.0002f, 13.1962f)
        lineTo(6.0002f, 11.4641f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.49f, strokeAlpha = 0.49f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0002f, 14.0f)
        lineTo(8.0002f, 12.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.405f, strokeAlpha = 0.405f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(11.0002f, 13.1962f)
        lineTo(10.0002f, 11.4641f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.32f, strokeAlpha = 0.32f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(13.1965f, 11.0f)
        lineTo(11.4645f, 10.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.235f, strokeAlpha = 0.235f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(14.0002f, 8.0f)
        lineTo(12.0002f, 8.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.15f, strokeAlpha = 0.15f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(13.1965f, 5.0f)
        lineTo(11.4645f, 6.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)), fillAlpha =
            0.065f, strokeAlpha = 0.065f, strokeLineWidth = 1.0f, strokeLineCap = Round,
            strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(11.0002f, 2.8038f)
        lineTo(10.0002f, 4.5359f)
    }
}
.build()
