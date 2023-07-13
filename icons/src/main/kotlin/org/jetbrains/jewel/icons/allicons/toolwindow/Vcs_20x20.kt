package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.Vcs_20x20: IntellijIconData
    get() {
        if (_vcs_20x20 != null) {
            return _vcs_20x20!!
        }
        _vcs_20x20 = IntellijIconData(name = "Vcs_20x20",size = DpSize(height = 20.0.dp, width =
                20.0.dp),imageVector = { Vcs_20x20Composable(it) })
        return _vcs_20x20!!
    }

private var _vcs_20x20: IntellijIconData? = null

private fun Vcs_20x20Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Vcs_20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.5f, 4.5f)
        curveTo(7.5f, 5.6046f, 6.6046f, 6.5f, 5.5f, 6.5f)
        curveTo(4.3954f, 6.5f, 3.5f, 5.6046f, 3.5f, 4.5f)
        curveTo(3.5f, 3.3954f, 4.3954f, 2.5f, 5.5f, 2.5f)
        curveTo(6.6046f, 2.5f, 7.5f, 3.3954f, 7.5f, 4.5f)
        close()
        moveTo(9.0f, 4.5f)
        curveTo(9.0f, 6.1756f, 7.8226f, 7.5761f, 6.25f, 7.9195f)
        lineTo(6.25f, 13.25f)
        horizontalLineTo(9.5f)
        curveTo(10.2092f, 13.25f, 10.7035f, 13.2496f, 11.0904f, 13.2232f)
        curveTo(11.4706f, 13.1973f, 11.692f, 13.1487f, 11.861f, 13.0787f)
        curveTo(12.4124f, 12.8504f, 12.8504f, 12.4124f, 13.0787f, 11.861f)
        curveTo(13.1487f, 11.692f, 13.1973f, 11.4706f, 13.2232f, 11.0904f)
        curveTo(13.244f, 10.7848f, 13.2487f, 10.4121f, 13.2497f, 9.9194f)
        curveTo(11.6773f, 9.5759f, 10.5f, 8.1755f, 10.5f, 6.5f)
        curveTo(10.5f, 4.567f, 12.067f, 3.0f, 14.0f, 3.0f)
        curveTo(15.933f, 3.0f, 17.5f, 4.567f, 17.5f, 6.5f)
        curveTo(17.5f, 8.1756f, 16.3225f, 9.5763f, 14.7498f, 9.9195f)
        curveTo(14.7488f, 10.4185f, 14.7439f, 10.8379f, 14.7197f, 11.1925f)
        curveTo(14.6886f, 11.6491f, 14.6229f, 12.0528f, 14.4645f, 12.4351f)
        curveTo(14.0839f, 13.3539f, 13.3539f, 14.0839f, 12.4351f, 14.4645f)
        curveTo(12.0528f, 14.6229f, 11.6491f, 14.6886f, 11.1925f, 14.7197f)
        curveTo(10.7485f, 14.75f, 10.203f, 14.75f, 9.5266f, 14.75f)
        horizontalLineTo(9.5f)
        horizontalLineTo(6.25f)
        verticalLineTo(18.0f)
        curveTo(6.25f, 18.4142f, 5.9142f, 18.75f, 5.5f, 18.75f)
        curveTo(5.0858f, 18.75f, 4.75f, 18.4142f, 4.75f, 18.0f)
        lineTo(4.75f, 7.9195f)
        curveTo(3.1774f, 7.5761f, 2.0f, 6.1756f, 2.0f, 4.5f)
        curveTo(2.0f, 2.567f, 3.567f, 1.0f, 5.5f, 1.0f)
        curveTo(7.433f, 1.0f, 9.0f, 2.567f, 9.0f, 4.5f)
        close()
        moveTo(16.0f, 6.5f)
        curveTo(16.0f, 7.6046f, 15.1046f, 8.5f, 14.0f, 8.5f)
        curveTo(12.8954f, 8.5f, 12.0f, 7.6046f, 12.0f, 6.5f)
        curveTo(12.0f, 5.3954f, 12.8954f, 4.5f, 14.0f, 4.5f)
        curveTo(15.1046f, 4.5f, 16.0f, 5.3954f, 16.0f, 6.5f)
        close()
    }
}
.build()
