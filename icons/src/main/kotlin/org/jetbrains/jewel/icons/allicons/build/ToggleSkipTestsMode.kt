package org.jetbrains.jewel.icons.allicons.build

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.BuildGroup

public val BuildGroup.ToggleSkipTestsMode: IntellijIconData
    get() {
        if (_toggleSkipTestsMode != null) {
            return _toggleSkipTestsMode!!
        }
        _toggleSkipTestsMode = IntellijIconData(name = "ToggleSkipTestsMode",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { ToggleSkipTestsModeComposable(it) })
        return _toggleSkipTestsMode!!
    }

private var _toggleSkipTestsMode: IntellijIconData? = null

private fun ToggleSkipTestsModeComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ToggleSkipTestsMode", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.5f, 12.5f)
        lineTo(12.5f, 3.5f)
    }
}
.build()
