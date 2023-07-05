package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.Restart: IntellijIconData
    get() {
        if (_restart != null) {
            return _restart!!
        }
        _restart = IntellijIconData(imageVector = { RestartComposable(it) })
        return _restart!!
    }

private var _restart: IntellijIconData? = null

private fun RestartComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Restart", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.5501f, 1.3999f)
        curveTo(13.5501f, 1.1238f, 13.3262f, 0.8999f, 13.0501f, 0.8999f)
        curveTo(12.774f, 0.8999f, 12.5501f, 1.1238f, 12.5501f, 1.3999f)
        verticalLineTo(4.0887f)
        curveTo(11.4503f, 2.8105f, 9.8199f, 1.9999f, 8.0f, 1.9999f)
        curveTo(4.6863f, 1.9999f, 2.0f, 4.6862f, 2.0f, 7.9999f)
        curveTo(2.0f, 11.3136f, 4.6863f, 13.9999f, 8.0f, 13.9999f)
        curveTo(10.3918f, 13.9999f, 12.4558f, 12.6003f, 13.4194f, 10.5777f)
        curveTo(13.5382f, 10.3284f, 13.4324f, 10.03f, 13.1831f, 9.9113f)
        curveTo(12.9338f, 9.7925f, 12.6354f, 9.8983f, 12.5167f, 10.1476f)
        curveTo(11.7126f, 11.8353f, 9.9918f, 12.9999f, 8.0f, 12.9999f)
        curveTo(5.2386f, 12.9999f, 3.0f, 10.7613f, 3.0f, 7.9999f)
        curveTo(3.0f, 5.2385f, 5.2386f, 2.9999f, 8.0f, 2.9999f)
        curveTo(9.59f, 2.9999f, 11.0069f, 3.7417f, 11.9233f, 4.8999f)
        horizontalLineTo(9.05f)
        curveTo(8.7739f, 4.8999f, 8.55f, 5.1238f, 8.55f, 5.3999f)
        curveTo(8.55f, 5.676f, 8.7739f, 5.8999f, 9.05f, 5.8999f)
        horizontalLineTo(13.0501f)
        horizontalLineTo(13.5501f)
        verticalLineTo(5.3999f)
        verticalLineTo(1.3999f)
        close()
        moveTo(12.5206f, 4.8999f)
        horizontalLineTo(12.5501f)
        verticalLineTo(4.8796f)
        lineTo(12.5206f, 4.8999f)
        close()
    }
}
.build()
