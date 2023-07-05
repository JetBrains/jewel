package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.ToggleVisibility: IntellijIconData
    get() {
        if (_toggleVisibility != null) {
            return _toggleVisibility!!
        }
        _toggleVisibility = IntellijIconData(imageVector = { ToggleVisibilityComposable(it) })
        return _toggleVisibility!!
    }

private var _toggleVisibility: IntellijIconData? = null

private fun ToggleVisibilityComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ToggleVisibility", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 13.5f)
        curveTo(8.3341f, 13.5f, 8.6681f, 13.4772f, 9.0f, 13.4334f)
        verticalLineTo(12.4234f)
        curveTo(8.667f, 12.4738f, 8.3326f, 12.5f, 8.0f, 12.5f)
        curveTo(6.4821f, 12.5f, 4.9279f, 11.9545f, 3.6336f, 11.0541f)
        curveTo(2.445f, 10.2273f, 1.5328f, 9.1418f, 1.066f, 8.0f)
        curveTo(1.5328f, 6.8582f, 2.445f, 5.7727f, 3.6336f, 4.9459f)
        curveTo(4.9279f, 4.0455f, 6.4821f, 3.5f, 8.0f, 3.5f)
        curveTo(9.5179f, 3.5f, 11.0721f, 4.0455f, 12.3664f, 4.9459f)
        curveTo(13.555f, 5.7727f, 14.4672f, 6.8582f, 14.934f, 8.0f)
        lineTo(16.0f, 8.0f)
        curveTo(15.0f, 5.0f, 11.5f, 2.5f, 8.0f, 2.5f)
        curveTo(4.5f, 2.5f, 1.0f, 5.0f, 0.0f, 8.0f)
        curveTo(1.0f, 11.0f, 4.5f, 13.5f, 8.0f, 13.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 5.0f)
        curveTo(9.6568f, 5.0f, 11.0f, 6.3432f, 11.0f, 8.0f)
        curveTo(10.6277f, 8.0f, 10.2792f, 8.1017f, 9.9807f, 8.2789f)
        curveTo(9.9934f, 8.1877f, 10.0f, 8.0946f, 10.0f, 8.0f)
        curveTo(10.0f, 6.8954f, 9.1046f, 6.0f, 8.0f, 6.0f)
        curveTo(6.8954f, 6.0f, 6.0f, 6.8954f, 6.0f, 8.0f)
        curveTo(6.0f, 9.1046f, 6.8954f, 10.0f, 8.0f, 10.0f)
        curveTo(8.3723f, 10.0f, 8.7208f, 9.8983f, 9.0193f, 9.7211f)
        curveTo(9.0066f, 9.8123f, 9.0f, 9.9054f, 9.0f, 10.0f)
        verticalLineTo(10.8293f)
        curveTo(8.6872f, 10.9398f, 8.3506f, 11.0f, 8.0f, 11.0f)
        curveTo(6.3432f, 11.0f, 5.0f, 9.6568f, 5.0f, 8.0f)
        curveTo(5.0f, 6.3432f, 6.3432f, 5.0f, 8.0f, 5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.0f, 12.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(11.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(12.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.0f, 14.0f)
        horizontalLineTo(14.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(14.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.0f, 9.0f)
        curveTo(10.4477f, 9.0f, 10.0f, 9.4477f, 10.0f, 10.0f)
        verticalLineTo(15.0f)
        curveTo(10.0f, 15.5523f, 10.4477f, 16.0f, 11.0f, 16.0f)
        horizontalLineTo(15.0f)
        curveTo(15.5523f, 16.0f, 16.0f, 15.5523f, 16.0f, 15.0f)
        verticalLineTo(10.0f)
        curveTo(16.0f, 9.4477f, 15.5523f, 9.0f, 15.0f, 9.0f)
        horizontalLineTo(11.0f)
        close()
        moveTo(15.0f, 10.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(15.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(10.0f)
        close()
    }
}
.build()
