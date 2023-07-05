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

public val DiffGroup.ApplyNotConflictsLeft: IntellijIconData
    get() {
        if (_applyNotConflictsLeft != null) {
            return _applyNotConflictsLeft!!
        }
        _applyNotConflictsLeft = IntellijIconData(imageVector = {
                ApplyNotConflictsLeftComposable(it) })
        return _applyNotConflictsLeft!!
    }

private var _applyNotConflictsLeft: IntellijIconData? = null

private fun ApplyNotConflictsLeftComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ApplyNotConflictsLeft", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.5f, 12.5f)
        lineTo(13.0f, 8.0f)
        lineTo(8.5f, 3.5f)
        moveTo(3.5f, 12.5f)
        lineTo(8.0f, 8.0f)
        lineTo(3.5f, 3.5f)
    }
}
.build()
