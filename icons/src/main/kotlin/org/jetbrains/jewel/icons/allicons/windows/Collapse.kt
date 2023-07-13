package org.jetbrains.jewel.icons.allicons.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.WindowsGroup

public val WindowsGroup.Collapse: IntellijIconData
    get() {
        if (_collapse != null) {
            return _collapse!!
        }
        _collapse = IntellijIconData(name = "Collapse",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { CollapseComposable(it) })
        return _collapse!!
    }

private var _collapse: IntellijIconData? = null

private fun CollapseComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Collapse", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(10.0001f, 2.0001f)
        verticalLineTo(2.5001f)
        verticalLineTo(5.293f)
        lineTo(14.1465f, 1.1465f)
        lineTo(14.5001f, 0.793f)
        lineTo(15.2072f, 1.5001f)
        lineTo(14.8536f, 1.8536f)
        lineTo(10.7073f, 6.0f)
        lineTo(13.5f, 5.9998f)
        lineTo(14.0f, 5.9998f)
        lineTo(14.0f, 6.9998f)
        lineTo(13.5f, 6.9998f)
        lineTo(9.5001f, 7.0001f)
        lineTo(9.0001f, 7.0001f)
        verticalLineTo(6.5001f)
        verticalLineTo(2.5001f)
        verticalLineTo(2.0001f)
        horizontalLineTo(10.0001f)
        close()
        moveTo(0.793f, 14.5002f)
        lineTo(1.1465f, 14.1466f)
        lineTo(5.293f, 10.0001f)
        horizontalLineTo(2.5001f)
        horizontalLineTo(2.0001f)
        verticalLineTo(9.0001f)
        horizontalLineTo(2.5001f)
        horizontalLineTo(6.5001f)
        horizontalLineTo(7.0001f)
        verticalLineTo(9.5001f)
        verticalLineTo(13.5001f)
        verticalLineTo(14.0001f)
        horizontalLineTo(6.0001f)
        verticalLineTo(13.5001f)
        verticalLineTo(10.7073f)
        lineTo(1.8536f, 14.8537f)
        lineTo(1.5001f, 15.2073f)
        lineTo(0.793f, 14.5002f)
        close()
    }
}
.build()
