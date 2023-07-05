package org.jetbrains.jewel.icons.allicons.javaee

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
import org.jetbrains.jewel.icons.allicons.JavaeeGroup

public val JavaeeGroup.UpdateRunningApplication: IntellijIconData
    get() {
        if (_updateRunningApplication != null) {
            return _updateRunningApplication!!
        }
        _updateRunningApplication = IntellijIconData(imageVector = {
                UpdateRunningApplicationComposable(it) })
        return _updateRunningApplication!!
    }

private var _updateRunningApplication: IntellijIconData? = null

private fun UpdateRunningApplicationComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "UpdateRunningApplication", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 1.5f)
        verticalLineTo(5.5f)
        horizontalLineTo(12.9003f)
        moveTo(9.5f, 5.5f)
        horizontalLineTo(12.9003f)
        moveTo(12.9003f, 5.5f)
        curveTo(11.9899f, 3.7192f, 10.1373f, 2.5f, 8.0f, 2.5f)
        curveTo(4.9624f, 2.5f, 2.5f, 4.9624f, 2.5f, 8.0f)
        curveTo(2.5f, 11.0376f, 4.9624f, 13.5f, 8.0f, 13.5f)
        curveTo(10.1373f, 13.5f, 11.9899f, 12.2808f, 12.9003f, 10.5f)
    }
}
.build()
