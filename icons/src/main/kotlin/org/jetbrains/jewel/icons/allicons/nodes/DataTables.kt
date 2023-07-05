package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.DataTables: IntellijIconData
    get() {
        if (_dataTables != null) {
            return _dataTables!!
        }
        _dataTables = IntellijIconData(imageVector = { DataTablesComposable(it) })
        return _dataTables!!
    }

private var _dataTables: IntellijIconData? = null

private fun DataTablesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "DataTables", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 2.5f)
        horizontalLineTo(13.0f)
        curveTo(13.8284f, 2.5f, 14.5f, 3.1716f, 14.5f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(14.5f, 12.8284f, 13.8284f, 13.5f, 13.0f, 13.5f)
        horizontalLineTo(3.0f)
        curveTo(2.1716f, 13.5f, 1.5f, 12.8284f, 1.5f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(1.5f, 3.1716f, 2.1716f, 2.5f, 3.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 3.0f)
        verticalLineTo(13.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 3.0f)
        verticalLineTo(13.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.0f, 5.5f)
        horizontalLineTo(14.0f)
    }
}
.build()
