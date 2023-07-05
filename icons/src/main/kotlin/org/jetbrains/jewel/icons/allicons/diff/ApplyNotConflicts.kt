package org.jetbrains.jewel.icons.allicons.diff

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
import org.jetbrains.jewel.icons.allicons.DiffGroup

public val DiffGroup.ApplyNotConflicts: IntellijIconData
    get() {
        if (_applyNotConflicts != null) {
            return _applyNotConflicts!!
        }
        _applyNotConflicts = IntellijIconData(imageVector = { ApplyNotConflictsComposable(it) })
        return _applyNotConflicts!!
    }

private var _applyNotConflicts: IntellijIconData? = null

private fun ApplyNotConflictsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ApplyNotConflicts", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.5f, 2.5f)
        lineTo(7.5f, 5.5f)
        lineTo(4.5f, 8.5f)
        moveTo(0.5f, 8.5f)
        lineTo(3.5f, 5.5f)
        lineTo(0.5f, 2.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.5f, 13.5f)
        lineTo(8.5f, 10.5f)
        lineTo(11.5f, 7.5f)
        moveTo(15.5f, 7.5f)
        lineTo(12.5f, 10.5f)
        lineTo(15.5f, 13.5f)
    }
}
.build()
