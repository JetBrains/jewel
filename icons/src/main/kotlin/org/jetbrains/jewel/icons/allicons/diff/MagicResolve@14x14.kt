package org.jetbrains.jewel.icons.allicons.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.DiffGroup

public val DiffGroup.`MagicResolve@14x14`: IntellijIconData
    get() {
        if (`_magicResolve@14x14` != null) {
            return `_magicResolve@14x14`!!
        }
        `_magicResolve@14x14` = IntellijIconData(imageVector = { `MagicResolve@14x14Composable`(it)
                })
        return `_magicResolve@14x14`!!
    }

private var `_magicResolve@14x14`: IntellijIconData? = null

private fun `MagicResolve@14x14Composable`(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "MagicResolve@14x14", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.7929f, 12.7929f)
        lineTo(1.2071f, 12.2071f)
        curveTo(0.8166f, 11.8166f, 0.8166f, 11.1834f, 1.2071f, 10.7929f)
        lineTo(7.7929f, 4.2071f)
        curveTo(8.1834f, 3.8166f, 8.8166f, 3.8166f, 9.2071f, 4.2071f)
        lineTo(9.7929f, 4.7929f)
        curveTo(10.1834f, 5.1834f, 10.1834f, 5.8166f, 9.7929f, 6.2071f)
        lineTo(3.2071f, 12.7929f)
        curveTo(2.8166f, 13.1834f, 2.1834f, 13.1834f, 1.7929f, 12.7929f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.5f, 7.5f)
        lineTo(6.5f, 5.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.5f, 1.5f)
        verticalLineTo(0.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 4.5f)
        horizontalLineTo(13.5f)
        moveTo(10.5f, 8.5f)
        lineTo(11.5f, 9.5f)
        moveTo(5.5f, 3.5f)
        lineTo(4.5f, 2.5f)
    }
}
.build()
