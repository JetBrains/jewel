package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Scratch: IntellijIconData
    get() {
        if (_scratch != null) {
            return _scratch!!
        }
        _scratch = IntellijIconData(imageVector = { ScratchComposable(it) })
        return _scratch!!
    }

private var _scratch: IntellijIconData? = null

private fun ScratchComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Scratch", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.5f, 7.0f)
        curveTo(14.433f, 7.0f, 16.0f, 5.433f, 16.0f, 3.5f)
        curveTo(16.0f, 1.567f, 14.433f, 0.0f, 12.5f, 0.0f)
        curveTo(10.567f, 0.0f, 9.0f, 1.567f, 9.0f, 3.5f)
        curveTo(9.0f, 5.433f, 10.567f, 7.0f, 12.5f, 7.0f)
        close()
        moveTo(13.0f, 1.5f)
        curveTo(13.0f, 1.2239f, 12.7761f, 1.0f, 12.5f, 1.0f)
        curveTo(12.2239f, 1.0f, 12.0f, 1.2239f, 12.0f, 1.5f)
        verticalLineTo(3.5f)
        curveTo(12.0f, 3.6326f, 12.0527f, 3.7598f, 12.1464f, 3.8535f)
        lineTo(13.5607f, 5.2678f)
        curveTo(13.7559f, 5.463f, 14.0725f, 5.463f, 14.2678f, 5.2678f)
        curveTo(14.463f, 5.0725f, 14.463f, 4.7559f, 14.2678f, 4.5607f)
        lineTo(13.0f, 3.2929f)
        verticalLineTo(1.5f)
        close()
    }
}
.build()
