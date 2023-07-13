package org.jetbrains.jewel.icons.allicons.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.DiffGroup

public val DiffGroup.ApplyNotConflictsRight: IntellijIconData
    get() {
        if (_applyNotConflictsRight != null) {
            return _applyNotConflictsRight!!
        }
        _applyNotConflictsRight = IntellijIconData(name = "ApplyNotConflictsRight",size =
                DpSize(height = 16.0.dp, width = 16.0.dp),imageVector = {
                ApplyNotConflictsRightComposable(it) })
        return _applyNotConflictsRight!!
    }

private var _applyNotConflictsRight: IntellijIconData? = null

private fun ApplyNotConflictsRightComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ApplyNotConflictsRight", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.5f, 3.5f)
        lineTo(3.0f, 8.0f)
        lineTo(7.5f, 12.5f)
        moveTo(12.5f, 3.5f)
        lineTo(8.0f, 8.0f)
        lineTo(12.5f, 12.5f)
    }
}
.build()
