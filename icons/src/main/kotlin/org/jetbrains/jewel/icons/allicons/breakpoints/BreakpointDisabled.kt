package org.jetbrains.jewel.icons.allicons.breakpoints

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
import org.jetbrains.jewel.icons.allicons.BreakpointsGroup

public val BreakpointsGroup.BreakpointDisabled: IntellijIconData
    get() {
        if (_breakpointDisabled != null) {
            return _breakpointDisabled!!
        }
        _breakpointDisabled = IntellijIconData(name = "BreakpointDisabled",size = DpSize(height =
                14.0.dp, width = 14.0.dp),imageVector = { BreakpointDisabledComposable(it) })
        return _breakpointDisabled!!
    }

private var _breakpointDisabled: IntellijIconData? = null

private fun BreakpointDisabledComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointDisabled", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFE55765)),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.25f, 7.0f)
        curveTo(13.25f, 10.4518f, 10.4518f, 13.25f, 7.0f, 13.25f)
        curveTo(3.5482f, 13.25f, 0.75f, 10.4518f, 0.75f, 7.0f)
        curveTo(0.75f, 3.5482f, 3.5482f, 0.75f, 7.0f, 0.75f)
        curveTo(10.4518f, 0.75f, 13.25f, 3.5482f, 13.25f, 7.0f)
        close()
    }
}
.build()
