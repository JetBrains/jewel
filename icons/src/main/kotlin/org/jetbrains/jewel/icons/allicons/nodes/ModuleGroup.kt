package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.ModuleGroup: IntellijIconData
    get() {
        if (_moduleGroup != null) {
            return _moduleGroup!!
        }
        _moduleGroup = IntellijIconData(name = "ModuleGroup",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ModuleGroupComposable(it) })
        return _moduleGroup!!
    }

private var _moduleGroup: IntellijIconData? = null

private fun ModuleGroupComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ModuleGroup", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.0f, 3.8667f)
        curveTo(1.0f, 2.8357f, 1.7835f, 2.0f, 2.75f, 2.0f)
        horizontalLineTo(6.0382f)
        curveTo(6.2987f, 2.0f, 6.5489f, 2.1016f, 6.7356f, 2.2833f)
        lineTo(8.5f, 4.0f)
        lineTo(13.0f, 4.0f)
        curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
        verticalLineTo(7.0f)
        horizontalLineTo(9.0f)
        curveTo(7.8954f, 7.0f, 7.0f, 7.8954f, 7.0f, 9.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(3.8667f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.8026f, 4.7167f)
        lineTo(8.0938f, 5.0f)
        horizontalLineTo(8.5f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(7.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        lineTo(7.8026f, 4.7167f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueFill), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(9.5f, 8.5f)
        lineTo(14.5f, 8.5f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 15.5f, 9.5f)
        lineTo(15.5f, 14.5f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 14.5f, 15.5f)
        lineTo(9.5f, 15.5f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 8.5f, 14.5f)
        lineTo(8.5f, 9.5f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 9.5f, 8.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.5f, 9.0f)
        horizontalLineToRelative(1.0f)
        verticalLineToRelative(6.0f)
        horizontalLineToRelative(-1.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.0f, 11.5f)
        horizontalLineToRelative(6.0f)
        verticalLineToRelative(1.0f)
        horizontalLineToRelative(-6.0f)
        close()
    }
}
.build()
