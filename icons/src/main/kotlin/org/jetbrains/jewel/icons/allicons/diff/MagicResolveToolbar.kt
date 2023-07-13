package org.jetbrains.jewel.icons.allicons.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.DiffGroup

public val DiffGroup.MagicResolveToolbar: IntellijIconData
    get() {
        if (_magicResolveToolbar != null) {
            return _magicResolveToolbar!!
        }
        _magicResolveToolbar = IntellijIconData(name = "MagicResolveToolbar",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { MagicResolveToolbarComposable(it) })
        return _magicResolveToolbar!!
    }

private var _magicResolveToolbar: IntellijIconData? = null

private fun MagicResolveToolbarComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "MagicResolveToolbar", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.7929f, 13.7929f)
        lineTo(2.2071f, 13.2071f)
        curveTo(1.8166f, 12.8166f, 1.8166f, 12.1834f, 2.2071f, 11.7929f)
        lineTo(8.7929f, 5.2071f)
        curveTo(9.1834f, 4.8166f, 9.8166f, 4.8166f, 10.2071f, 5.2071f)
        lineTo(10.7929f, 5.7929f)
        curveTo(11.1834f, 6.1834f, 11.1834f, 6.8166f, 10.7929f, 7.2071f)
        lineTo(4.2071f, 13.7929f)
        curveTo(3.8166f, 14.1834f, 3.1834f, 14.1834f, 2.7929f, 13.7929f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.5f, 8.5f)
        lineTo(7.5f, 6.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 2.5f)
        verticalLineTo(1.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 5.5f)
        horizontalLineTo(14.5f)
        moveTo(11.5f, 9.5f)
        lineTo(12.5f, 10.5f)
        moveTo(6.5f, 4.5f)
        lineTo(5.5f, 3.5f)
    }
}
.build()
