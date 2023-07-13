package org.jetbrains.jewel.icons.allicons.welcome

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
import org.jetbrains.jewel.icons.allicons.WelcomeGroup

public val WelcomeGroup.Open: IntellijIconData
    get() {
        if (_open != null) {
            return _open!!
        }
        _open = IntellijIconData(name = "Open",size = DpSize(height = 20.0.dp, width =
                20.0.dp),imageVector = { OpenComposable(it) })
        return _open!!
    }

private var _open: IntellijIconData? = null

private fun OpenComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Open",
        defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight =
        20.0f).apply {
    path(fill = SolidColor(colorScheme.blueFill), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.5199f, 5.5762f)
        lineTo(10.7285f, 5.75f)
        horizontalLineTo(11.0f)
        horizontalLineTo(17.0f)
        curveTo(17.6904f, 5.75f, 18.25f, 6.3096f, 18.25f, 7.0f)
        verticalLineTo(15.1667f)
        curveTo(18.25f, 16.0671f, 17.553f, 16.75f, 16.75f, 16.75f)
        horizontalLineTo(3.25f)
        curveTo(2.4471f, 16.75f, 1.75f, 16.0671f, 1.75f, 15.1667f)
        verticalLineTo(4.8333f)
        curveTo(1.75f, 3.9329f, 2.4471f, 3.25f, 3.25f, 3.25f)
        horizontalLineTo(7.6379f)
        curveTo(7.6964f, 3.25f, 7.7531f, 3.2705f, 7.798f, 3.3079f)
        lineTo(10.5199f, 5.5762f)
        close()
    }
}
.build()
