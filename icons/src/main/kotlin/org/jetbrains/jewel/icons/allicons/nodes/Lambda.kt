package org.jetbrains.jewel.icons.allicons.nodes

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

public val NodesGroup.Lambda: IntellijIconData
    get() {
        if (_lambda != null) {
            return _lambda!!
        }
        _lambda = IntellijIconData(name = "Lambda",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { LambdaComposable(it) })
        return _lambda!!
    }

private var _lambda: IntellijIconData? = null

private fun LambdaComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Lambda", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.redFill), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.6369f, 4.0f)
        horizontalLineTo(6.4584f)
        curveTo(7.4345f, 4.0f, 7.9226f, 4.5774f, 8.2322f, 5.3631f)
        lineTo(10.8453f, 12.0f)
        horizontalLineTo(9.7158f)
        lineTo(8.0596f, 7.5313f)
        lineTo(6.2738f, 12.0f)
        horizontalLineTo(5.1548f)
        lineTo(7.5536f, 6.2083f)
        lineTo(7.1845f, 5.4405f)
        curveTo(7.0476f, 5.1429f, 6.7738f, 4.9167f, 6.4107f, 4.9167f)
        horizontalLineTo(5.6369f)
        verticalLineTo(4.0f)
        close()
    }
}
.build()
