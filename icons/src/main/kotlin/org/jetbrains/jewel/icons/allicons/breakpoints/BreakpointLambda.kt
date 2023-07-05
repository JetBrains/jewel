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

public val BreakpointsGroup.BreakpointLambda: IntellijIconData
    get() {
        if (_breakpointLambda != null) {
            return _breakpointLambda!!
        }
        _breakpointLambda = IntellijIconData(imageVector = { BreakpointLambdaComposable(it) })
        return _breakpointLambda!!
    }

private var _breakpointLambda: IntellijIconData? = null

private fun BreakpointLambdaComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "BreakpointLambda", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth =
        14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.8473f, 0.0f)
        horizontalLineTo(4.2908f)
        curveTo(6.0063f, 0.0f, 6.864f, 1.0104f, 7.4079f, 2.3854f)
        lineTo(12.0f, 14.0f)
        horizontalLineTo(10.0152f)
        lineTo(7.1046f, 6.1797f)
        lineTo(3.9665f, 14.0f)
        horizontalLineTo(2.0f)
        lineTo(6.2155f, 3.8646f)
        lineTo(5.5669f, 2.5208f)
        curveTo(5.3264f, 2.0f, 4.8452f, 1.6042f, 4.2071f, 1.6042f)
        horizontalLineTo(2.8473f)
        verticalLineTo(0.0f)
        close()
    }
}
.build()
