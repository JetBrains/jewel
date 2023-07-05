package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.ToolWindowInternal: IntellijIconData
    get() {
        if (_toolWindowInternal != null) {
            return _toolWindowInternal!!
        }
        _toolWindowInternal = IntellijIconData(imageVector = { ToolWindowInternalComposable(it) })
        return _toolWindowInternal!!
    }

private var _toolWindowInternal: IntellijIconData? = null

private fun ToolWindowInternalComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ToolWindowInternal", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.04f, 9.55f)
        lineTo(3.3f, 12.29f)
        curveToRelative(-0.2f, 0.2f, -0.29f, 0.45f, -0.29f, 0.71f)
        curveToRelative(0.0f, 0.26f, 0.1f, 0.51f, 0.29f, 0.71f)
        curveToRelative(0.19f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
        curveToRelative(0.26f, 0.0f, 0.51f, -0.1f, 0.71f, -0.29f)
        lineToRelative(2.74f, -2.74f)
        moveToRelative(3.51f, -6.36f)
        lineTo(9.55f, 6.04f)
        moveToRelative(1.41f, 1.41f)
        lineToRelative(1.43f, -1.42f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveToRelative(14.19f, 7.83f)
        lineToRelative(0.31f, -3.31f)
        lineToRelative(-3.02f, -3.02f)
        lineToRelative(-1.81f, 1.81f)
        lineToRelative(4.52f, 4.52f)
        close()
        moveTo(12.29f, 13.71f)
        curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
        curveToRelative(0.26f, 0.0f, 0.51f, -0.1f, 0.71f, -0.29f)
        curveToRelative(0.2f, -0.19f, 0.29f, -0.45f, 0.29f, -0.71f)
        curveToRelative(0.0f, -0.26f, -0.1f, -0.51f, -0.29f, -0.71f)
        lineTo(7.2f, 5.78f)
        curveToRelative(0.19f, -0.39f, 0.3f, -0.82f, 0.3f, -1.29f)
        curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
        curveToRelative(-0.13f, 0.0f, -0.26f, 0.02f, -0.38f, 0.04f)
        lineToRelative(-0.53f, 0.53f)
        lineToRelative(1.73f, 1.73f)
        lineTo(3.8f, 5.31f)
        lineTo(2.07f, 3.58f)
        lineToRelative(-0.53f, 0.53f)
        curveToRelative(-0.02f, 0.13f, -0.04f, 0.25f, -0.04f, 0.38f)
        curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
        curveToRelative(0.46f, 0.0f, 0.89f, -0.11f, 1.29f, -0.3f)
        lineToRelative(6.51f, 6.51f)
        lineToRelative(-0.01f, 0.01f)
        close()
    }
}
.build()
