package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.RunAnything: IntellijIconData
    get() {
        if (_runAnything != null) {
            return _runAnything!!
        }
        _runAnything = IntellijIconData(imageVector = { RunAnythingComposable(it) })
        return _runAnything!!
    }

private var _runAnything: IntellijIconData? = null

private fun RunAnythingComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "RunAnything", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 2.5f)
        lineTo(13.0f, 2.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 4.0f)
        lineTo(14.5f, 12.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 13.5f)
        lineTo(3.0f, 13.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 12.0f)
        lineTo(1.5f, 4.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.95f, 9.3268f)
        curveTo(8.0833f, 9.4038f, 8.0833f, 9.5962f, 7.95f, 9.6732f)
        lineTo(4.8f, 11.4919f)
        curveTo(4.6667f, 11.5688f, 4.5f, 11.4726f, 4.5f, 11.3187f)
        lineTo(4.5f, 7.6814f)
        curveTo(4.5f, 7.5274f, 4.6667f, 7.4312f, 4.8f, 7.5081f)
        lineTo(7.95f, 9.3268f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.25f, 5.25f)
        horizontalLineToRelative(13.5f)
        verticalLineToRelative(0.5f)
        horizontalLineToRelative(-13.5f)
        close()
    }
}
.build()
