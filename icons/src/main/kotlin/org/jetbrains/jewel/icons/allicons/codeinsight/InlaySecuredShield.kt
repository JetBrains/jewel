package org.jetbrains.jewel.icons.allicons.codeinsight

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
import org.jetbrains.jewel.icons.allicons.CodeinsightGroup

public val CodeinsightGroup.InlaySecuredShield: IntellijIconData
    get() {
        if (_inlaySecuredShield != null) {
            return _inlaySecuredShield!!
        }
        _inlaySecuredShield = IntellijIconData(name = "InlaySecuredShield",size = DpSize(height =
                12.0.dp, width = 12.0.dp),imageVector = { InlaySecuredShieldComposable(it) })
        return _inlaySecuredShield!!
    }

private var _inlaySecuredShield: IntellijIconData? = null

private fun InlaySecuredShieldComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "InlaySecuredShield", defaultWidth = 12.0.dp, defaultHeight = 12.0.dp,
        viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.8535f, 4.8535f)
        curveTo(9.0488f, 4.6583f, 9.0488f, 4.3417f, 8.8535f, 4.1465f)
        curveTo(8.6583f, 3.9512f, 8.3417f, 3.9512f, 8.1465f, 4.1465f)
        lineTo(5.5f, 6.7929f)
        lineTo(4.3535f, 5.6465f)
        curveTo(4.1583f, 5.4512f, 3.8417f, 5.4512f, 3.6465f, 5.6465f)
        curveTo(3.4512f, 5.8417f, 3.4512f, 6.1583f, 3.6465f, 6.3535f)
        lineTo(5.1465f, 7.8535f)
        curveTo(5.3417f, 8.0488f, 5.6583f, 8.0488f, 5.8535f, 7.8535f)
        lineTo(8.8535f, 4.8535f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(11.0f, 6.0f)
        curveTo(11.0f, 10.0f, 6.0f, 12.0f, 6.0f, 12.0f)
        curveTo(6.0f, 12.0f, 0.9999f, 10.0f, 1.0f, 6.0f)
        verticalLineTo(2.0f)
        lineTo(6.0f, 0.0f)
        lineTo(11.0f, 2.0f)
        verticalLineTo(6.0f)
        close()
        moveTo(2.0f, 6.0f)
        verticalLineTo(2.677f)
        lineTo(6.0f, 1.077f)
        lineTo(10.0f, 2.677f)
        verticalLineTo(6.0f)
        curveTo(10.0f, 7.5518f, 9.0302f, 8.7952f, 7.8753f, 9.7191f)
        curveTo(7.3111f, 10.1705f, 6.7415f, 10.5129f, 6.3107f, 10.7426f)
        curveTo(6.1953f, 10.8042f, 6.0907f, 10.8572f, 6.0f, 10.9016f)
        curveTo(5.9093f, 10.8572f, 5.8047f, 10.8042f, 5.6893f, 10.7426f)
        curveTo(5.2585f, 10.5129f, 4.6888f, 10.1705f, 4.1247f, 9.7191f)
        curveTo(2.9697f, 8.7952f, 2.0f, 7.5518f, 2.0f, 6.0f)
        close()
    }
}
.build()
