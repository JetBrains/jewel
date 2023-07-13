package org.jetbrains.jewel.icons.allicons.vcs

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
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.ChangesUpdate_12x12: IntellijIconData
    get() {
        if (_changesUpdate_12x12 != null) {
            return _changesUpdate_12x12!!
        }
        _changesUpdate_12x12 = IntellijIconData(name = "ChangesUpdate_12x12",size = DpSize(height =
                12.0.dp, width = 12.0.dp),imageVector = { ChangesUpdate_12x12Composable(it) })
        return _changesUpdate_12x12!!
    }

private var _changesUpdate_12x12: IntellijIconData? = null

private fun ChangesUpdate_12x12Composable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ChangesUpdate_12x12", defaultWidth = 12.0.dp, defaultHeight = 12.0.dp,
        viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.2305f, 2.6309f)
        curveTo(8.9281f, 2.3285f, 8.5055f, 2.3368f, 8.1782f, 2.6641f)
        lineTo(4.7642f, 6.0781f)
        lineTo(4.0723f, 6.8363f)
        lineTo(4.1593f, 5.4483f)
        lineTo(4.1676f, 4.1142f)
        curveTo(4.1717f, 3.9278f, 4.122f, 3.7372f, 3.9728f, 3.588f)
        curveTo(3.6994f, 3.3146f, 3.285f, 3.3146f, 2.9867f, 3.6129f)
        curveTo(2.85f, 3.7496f, 2.7754f, 3.9319f, 2.7671f, 4.1473f)
        verticalLineTo(8.3403f)
        curveTo(2.763f, 8.535f, 2.8459f, 8.7339f, 2.9867f, 8.8747f)
        curveTo(3.1235f, 9.0115f, 3.3223f, 9.0943f, 3.5171f, 9.0902f)
        lineTo(7.7141f, 9.0943f)
        curveTo(7.9296f, 9.0861f, 8.1119f, 9.0115f, 8.2486f, 8.8747f)
        curveTo(8.5469f, 8.5764f, 8.5469f, 8.1621f, 8.2735f, 7.8887f)
        curveTo(8.1202f, 7.7354f, 7.9337f, 7.6898f, 7.7431f, 7.6898f)
        lineTo(6.409f, 7.6981f)
        lineTo(5.0252f, 7.7809f)
        lineTo(5.7793f, 7.0932f)
        lineTo(9.1932f, 3.6792f)
        curveTo(9.5206f, 3.3519f, 9.533f, 2.9334f, 9.2305f, 2.6309f)
        close()
    }
}
.build()
