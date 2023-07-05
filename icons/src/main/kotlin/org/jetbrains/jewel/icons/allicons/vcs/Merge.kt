package org.jetbrains.jewel.icons.allicons.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.Merge: IntellijIconData
    get() {
        if (_merge != null) {
            return _merge!!
        }
        _merge = IntellijIconData(imageVector = { MergeComposable(it) })
        return _merge!!
    }

private var _merge: IntellijIconData? = null

private fun MergeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Merge",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.0f, 4.0834f)
        lineTo(8.0f, 2.0834f)
        lineTo(10.0f, 4.0834f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 2.5834f)
        verticalLineTo(6.1635f)
        curveTo(8.0f, 6.7474f, 7.7449f, 7.3021f, 7.3016f, 7.682f)
        lineTo(5.1984f, 9.4847f)
        curveTo(4.7551f, 9.8647f, 4.5f, 10.4194f, 4.5f, 11.0032f)
        verticalLineTo(14.0834f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 2.5834f)
        verticalLineTo(6.1635f)
        curveTo(8.0f, 6.7474f, 8.2551f, 7.3021f, 8.6984f, 7.682f)
        lineTo(10.8016f, 9.4847f)
        curveTo(11.2449f, 9.8647f, 11.5f, 10.4194f, 11.5f, 11.0032f)
        verticalLineTo(14.0834f)
    }
}
.build()
