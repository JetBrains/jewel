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

public val NodesGroup.ModuleJava: IntellijIconData
    get() {
        if (_moduleJava != null) {
            return _moduleJava!!
        }
        _moduleJava = IntellijIconData(name = "ModuleJava",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ModuleJavaComposable(it) })
        return _moduleJava!!
    }

private var _moduleJava: IntellijIconData? = null

private fun ModuleJavaComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ModuleJava", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueFill), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 2.5f)
        lineTo(12.0f, 2.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 4.0f)
        lineTo(13.5f, 12.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 13.5f)
        lineTo(4.0f, 13.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 12.0f)
        lineTo(2.5f, 4.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 2.5f)
        close()
    }
}
.build()
