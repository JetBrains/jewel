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

public val RunGroup.Run: IntellijIconData
    get() {
        if (_run != null) {
            return _run!!
        }
        _run = IntellijIconData(imageVector = { RunComposable(it) })
        return _run!!
    }

private var _run: IntellijIconData? = null

private fun RunComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Run",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = SolidColor(Color(0xFF208A3C)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 7.134f)
        curveTo(14.1667f, 7.5189f, 14.1667f, 8.4811f, 13.5f, 8.866f)
        lineTo(4.5f, 14.0622f)
        curveTo(3.8333f, 14.4471f, 3.0f, 13.966f, 3.0f, 13.1962f)
        lineTo(3.0f, 2.8038f)
        curveTo(3.0f, 2.034f, 3.8333f, 1.5529f, 4.5f, 1.9378f)
        lineTo(13.5f, 7.134f)
        close()
    }
}
.build()
