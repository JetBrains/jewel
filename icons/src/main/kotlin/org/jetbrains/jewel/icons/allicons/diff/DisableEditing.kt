package org.jetbrains.jewel.icons.allicons.diff

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.DiffGroup

public val DiffGroup.DisableEditing: IntellijIconData
    get() {
        if (_disableEditing != null) {
            return _disableEditing!!
        }
        _disableEditing = IntellijIconData(name = "DisableEditing",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { DisableEditingComposable(it) })
        return _disableEditing!!
    }

private var _disableEditing: IntellijIconData? = null

private fun DisableEditingComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "DisableEditing", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.0f, 5.0f)
        curveTo(5.0f, 3.3431f, 6.3432f, 2.0f, 8.0f, 2.0f)
        curveTo(9.6568f, 2.0f, 11.0f, 3.3431f, 11.0f, 5.0f)
        verticalLineTo(6.0f)
        curveTo(12.1046f, 6.0f, 13.0f, 6.8954f, 13.0f, 8.0f)
        verticalLineTo(12.0f)
        curveTo(13.0f, 13.1046f, 12.1046f, 14.0f, 11.0f, 14.0f)
        horizontalLineTo(5.0f)
        curveTo(3.8954f, 14.0f, 3.0f, 13.1046f, 3.0f, 12.0f)
        verticalLineTo(8.0f)
        curveTo(3.0f, 6.8954f, 3.8954f, 6.0f, 5.0f, 6.0f)
        verticalLineTo(5.0f)
        close()
        moveTo(10.0f, 5.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(5.0f)
        curveTo(6.0f, 3.8954f, 6.8954f, 3.0f, 8.0f, 3.0f)
        curveTo(9.1046f, 3.0f, 10.0f, 3.8954f, 10.0f, 5.0f)
        close()
        moveTo(5.0f, 7.0f)
        curveTo(4.4477f, 7.0f, 4.0f, 7.4477f, 4.0f, 8.0f)
        verticalLineTo(12.0f)
        curveTo(4.0f, 12.5523f, 4.4477f, 13.0f, 5.0f, 13.0f)
        horizontalLineTo(11.0f)
        curveTo(11.5523f, 13.0f, 12.0f, 12.5523f, 12.0f, 12.0f)
        verticalLineTo(8.0f)
        curveTo(12.0f, 7.4477f, 11.5523f, 7.0f, 11.0f, 7.0f)
        horizontalLineTo(5.0f)
        close()
        moveTo(8.0f, 8.5f)
        curveTo(7.7239f, 8.5f, 7.5f, 8.7239f, 7.5f, 9.0f)
        verticalLineTo(11.0f)
        curveTo(7.5f, 11.2761f, 7.7239f, 11.5f, 8.0f, 11.5f)
        curveTo(8.2761f, 11.5f, 8.5f, 11.2761f, 8.5f, 11.0f)
        verticalLineTo(9.0f)
        curveTo(8.5f, 8.7239f, 8.2761f, 8.5f, 8.0f, 8.5f)
        close()
    }
}
.build()
