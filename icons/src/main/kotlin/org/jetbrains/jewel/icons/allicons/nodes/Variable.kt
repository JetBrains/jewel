package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Variable: IntellijIconData
    get() {
        if (_variable != null) {
            return _variable!!
        }
        _variable = IntellijIconData(name = "Variable",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { VariableComposable(it) })
        return _variable!!
    }

private var _variable: IntellijIconData? = null

private fun VariableComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Variable", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.orangeFill), stroke = SolidColor(Color(0xFFE66D17)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.5459f, 11.4f)
        horizontalLineTo(8.4658f)
        lineTo(10.8213f, 5.4f)
        horizontalLineTo(9.79f)
        lineTo(8.044f, 10.1051f)
        lineTo(6.2393f, 5.4f)
        horizontalLineTo(5.1787f)
        lineTo(7.5459f, 11.4f)
        close()
    }
}
.build()
