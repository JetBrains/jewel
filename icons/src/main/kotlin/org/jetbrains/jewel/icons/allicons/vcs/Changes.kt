package org.jetbrains.jewel.icons.allicons.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.Changes: IntellijIconData
    get() {
        if (_changes != null) {
            return _changes!!
        }
        _changes = IntellijIconData(imageVector = { ChangesComposable(it) })
        return _changes!!
    }

private var _changes: IntellijIconData? = null

private fun ChangesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Changes", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 5.0f)
        lineTo(8.5f, 5.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 5.5f)
        lineTo(9.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 6.0f)
        lineTo(2.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 5.5f)
        lineTo(2.0f, 5.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 8.0f)
        lineTo(6.5f, 8.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 8.5f)
        lineTo(7.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 9.0f)
        lineTo(2.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 8.5f)
        lineTo(2.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 8.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 2.0f)
        lineTo(13.5f, 2.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 2.5f)
        lineTo(14.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 3.0f)
        lineTo(2.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 2.5f)
        lineTo(2.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 2.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.5f, 14.5f)
        lineTo(10.5f, 12.5f)
        lineTo(8.5f, 10.5f)
        moveTo(5.5f, 12.5f)
        horizontalLineTo(10.0f)
        moveTo(12.5f, 10.5f)
        lineTo(10.5f, 8.5f)
        lineTo(12.5f, 6.5f)
        moveTo(15.5f, 8.5f)
        horizontalLineTo(11.0f)
    }
}
.build()
