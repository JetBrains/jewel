package org.jetbrains.jewel.icons.allicons.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.RecursiveMethod: IntellijIconData
    get() {
        if (_recursiveMethod != null) {
            return _recursiveMethod!!
        }
        _recursiveMethod = IntellijIconData(name = "RecursiveMethod",size = DpSize(height = 14.0.dp,
                width = 14.0.dp),imageVector = { RecursiveMethodComposable(it) })
        return _recursiveMethod!!
    }

private var _recursiveMethod: IntellijIconData? = null

private fun RecursiveMethodComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "RecursiveMethod", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 1.4003f)
        lineTo(9.5f, 1.4003f)
        lineTo(9.5f, 2.0f)
        moveTo(9.5f, 5.4003f)
        lineTo(9.5f, 2.0f)
        moveTo(9.5f, 2.0f)
        curveTo(11.2808f, 2.9104f, 12.5f, 4.7629f, 12.5f, 6.9003f)
        curveTo(12.5f, 9.9379f, 10.0376f, 12.4003f, 7.0f, 12.4003f)
        curveTo(3.9624f, 12.4003f, 1.5f, 9.9379f, 1.5f, 6.9003f)
        curveTo(1.5f, 4.7629f, 2.7192f, 2.9104f, 4.5f, 2.0f)
    }
    path(fill = SolidColor(colorScheme.greenSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.0f, 7.0f)
        moveToRelative(-2.0f, 0.0f)
        arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
        arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
    }
}
.build()
