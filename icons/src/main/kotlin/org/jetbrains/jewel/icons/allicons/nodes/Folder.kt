package org.jetbrains.jewel.icons.allicons.nodes

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

public val NodesGroup.Folder: IntellijIconData
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = IntellijIconData(imageVector = { FolderComposable(it) })
        return _folder!!
    }

private var _folder: IntellijIconData? = null

private fun FolderComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Folder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.1058f, 4.3461f)
        lineTo(8.2534f, 4.5f)
        horizontalLineTo(8.4667f)
        horizontalLineTo(13.0f)
        curveTo(13.8284f, 4.5f, 14.5f, 5.1716f, 14.5f, 6.0f)
        verticalLineTo(12.1333f)
        curveTo(14.5f, 12.9529f, 13.932f, 13.5f, 13.3667f, 13.5f)
        horizontalLineTo(2.6333f)
        curveTo(2.068f, 13.5f, 1.5f, 12.9529f, 1.5f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(1.5f, 3.0471f, 2.068f, 2.5f, 2.6333f, 2.5f)
        horizontalLineTo(6.1217f)
        curveTo(6.2579f, 2.5f, 6.3882f, 2.5556f, 6.4825f, 2.6539f)
        lineTo(8.1058f, 4.3461f)
        close()
    }
}
.build()
