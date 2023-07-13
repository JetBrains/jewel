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

public val NodesGroup.Enum: IntellijIconData
    get() {
        if (_enum != null) {
            return _enum!!
        }
        _enum = IntellijIconData(name = "Enum",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { EnumComposable(it) })
        return _enum!!
    }

private var _enum: IntellijIconData? = null

private fun EnumComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Enum",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.blueFill), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.49f, 11.5f)
        horizontalLineTo(10.51f)
        verticalLineTo(10.585f)
        horizontalLineTo(6.48f)
        verticalLineTo(8.435f)
        horizontalLineTo(10.07f)
        verticalLineTo(7.515f)
        horizontalLineTo(6.48f)
        verticalLineTo(5.415f)
        horizontalLineTo(10.41f)
        verticalLineTo(4.5f)
        horizontalLineTo(5.49f)
        verticalLineTo(11.5f)
        close()
    }
}
.build()
