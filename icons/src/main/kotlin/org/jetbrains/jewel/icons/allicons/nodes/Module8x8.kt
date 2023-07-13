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

public val NodesGroup.Module8x8: IntellijIconData
    get() {
        if (_module8x8 != null) {
            return _module8x8!!
        }
        _module8x8 = IntellijIconData(name = "Module8x8",size = DpSize(height = 8.0.dp, width =
                8.0.dp),imageVector = { Module8x8Composable(it) })
        return _module8x8!!
    }

private var _module8x8: IntellijIconData? = null

private fun Module8x8Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Module8x8", defaultWidth = 8.0.dp, defaultHeight = 8.0.dp, viewportWidth = 8.0f,
        viewportHeight = 8.0f).apply {
    path(fill = SolidColor(colorScheme.blueFill), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.0f, 0.5f)
        lineTo(6.0f, 0.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 2.0f)
        lineTo(7.5f, 6.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 7.5f)
        lineTo(2.0f, 7.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 0.5f, 6.0f)
        lineTo(0.5f, 2.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 0.5f)
        close()
    }
}
.build()
