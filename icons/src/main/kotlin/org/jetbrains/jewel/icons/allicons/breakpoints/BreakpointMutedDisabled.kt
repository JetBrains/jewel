package org.jetbrains.jewel.icons.allicons.breakpoints

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.BreakpointsGroup

public val BreakpointsGroup.BreakpointMutedDisabled: IntellijIconData
    get() {
        if (_breakpointMutedDisabled != null) {
            return _breakpointMutedDisabled!!
        }
        _breakpointMutedDisabled = IntellijIconData(imageVector = {
                BreakpointMutedDisabledComposable(it) })
        return _breakpointMutedDisabled!!
    }

private var _breakpointMutedDisabled: IntellijIconData? = null

private fun BreakpointMutedDisabledComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointMutedDisabled", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
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
