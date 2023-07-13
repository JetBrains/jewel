package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.ToolWindowInternal_20x20: IntellijIconData
    get() {
        if (_toolWindowInternal_20x20 != null) {
            return _toolWindowInternal_20x20!!
        }
        _toolWindowInternal_20x20 = IntellijIconData(name = "ToolWindowInternal_20x20",size =
                DpSize(height = 20.0.dp, width = 20.0.dp),imageVector = {
                ToolWindowInternal_20x20Composable(it) })
        return _toolWindowInternal_20x20!!
    }

private var _toolWindowInternal_20x20: IntellijIconData? = null

private fun ToolWindowInternal_20x20Composable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ToolWindowInternal_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveToRelative(8.76f, 14.36f)
        lineToRelative(-2.45f, 2.45f)
        curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
        reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
        arcToRelative(1.49f, 1.49f, 0.0f, false, true, 0.0f, -2.12f)
        lineToRelative(2.46f, -2.46f)
        moveToRelative(8.16f, -3.92f)
        lineToRelative(-1.43f, 1.43f)
        moveToRelative(-2.11f, -2.13f)
        lineToRelative(1.42f, -1.42f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = StrokeCap.Companion.Round, strokeLineJoin =
            Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveToRelative(11.25f, 4.75f)
        lineToRelative(2.5f, -2.5f)
        lineToRelative(4.0f, 4.0f)
        lineToRelative(-1.0f, 4.0f)
        lineToRelative(-5.5f, -5.5f)
        close()
        moveTo(13.69f, 16.81f)
        curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
        reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
        curveToRelative(0.29f, -0.29f, 0.44f, -0.68f, 0.44f, -1.06f)
        reflectiveCurveToRelative(-0.15f, -0.77f, -0.44f, -1.06f)
        lineTo(8.55f, 7.37f)
        curveToRelative(0.12f, -0.35f, 0.2f, -0.73f, 0.2f, -1.12f)
        curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
        curveToRelative(-0.19f, 0.0f, -0.37f, 0.03f, -0.55f, 0.06f)
        lineToRelative(-0.59f, 0.59f)
        lineToRelative(2.14f, 2.14f)
        lineToRelative(-1.72f, 1.72f)
        lineToRelative(-2.14f, -2.14f)
        lineToRelative(-0.59f, 0.59f)
        curveToRelative(-0.03f, 0.18f, -0.06f, 0.36f, -0.06f, 0.55f)
        curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
        curveToRelative(0.43f, 0.0f, 0.83f, -0.09f, 1.21f, -0.23f)
        lineToRelative(7.23f, 7.29f)
        lineToRelative(0.01f, -0.01f)
        close()
    }
}
.build()
