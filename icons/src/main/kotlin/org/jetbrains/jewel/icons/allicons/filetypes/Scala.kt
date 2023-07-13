package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Scala: IntellijIconData
    get() {
        if (_scala != null) {
            return _scala!!
        }
        _scala = IntellijIconData(name = "Scala",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ScalaComposable(it) })
        return _scala!!
    }

private var _scala: IntellijIconData? = null

private fun ScalaComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Scala",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.801f, 1.8199f)
        curveTo(3.7786f, 1.9221f, 3.0f, 2.7825f, 3.0f, 3.81f)
        verticalLineTo(5.5f)
        lineTo(13.0f, 4.5f)
        verticalLineTo(1.0f)
        lineTo(4.801f, 1.8199f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 6.75f)
        verticalLineTo(10.25f)
        lineTo(13.0f, 9.25f)
        verticalLineTo(5.75f)
        lineTo(3.0f, 6.75f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 15.0f)
        verticalLineTo(11.5f)
        lineTo(13.0f, 10.5f)
        verticalLineTo(12.19f)
        curveTo(13.0f, 13.2175f, 12.2214f, 14.0779f, 11.199f, 14.1801f)
        lineTo(3.0f, 15.0f)
        close()
    }
}
.build()
