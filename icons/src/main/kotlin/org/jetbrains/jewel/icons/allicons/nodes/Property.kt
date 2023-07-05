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

public val NodesGroup.Property: IntellijIconData
    get() {
        if (_property != null) {
            return _property!!
        }
        _property = IntellijIconData(imageVector = { PropertyComposable(it) })
        return _property!!
    }

private var _property: IntellijIconData? = null

private fun PropertyComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Property", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFAF5FF)), stroke = SolidColor(Color(0xFF834DF0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFF834DF0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.5708f, 5.0f)
        curveTo(7.727f, 5.0f, 7.0634f, 5.371f, 6.6827f, 5.9983f)
        verticalLineTo(5.1228f)
        horizontalLineTo(5.7002f)
        verticalLineTo(12.0f)
        horizontalLineTo(6.7031f)
        verticalLineTo(9.5203f)
        curveTo(7.0869f, 10.1272f, 7.7419f, 10.4854f, 8.5708f, 10.4854f)
        curveTo(10.0291f, 10.4854f, 11.0474f, 9.3699f, 11.0474f, 7.7427f)
        curveTo(11.0474f, 6.1155f, 10.0291f, 5.0f, 8.5708f, 5.0f)
        close()
        moveTo(8.361f, 9.5848f)
        curveTo(7.3837f, 9.5848f, 6.7031f, 8.8326f, 6.7031f, 7.7427f)
        curveTo(6.7031f, 6.6528f, 7.3837f, 5.9006f, 8.361f, 5.9006f)
        curveTo(9.3332f, 5.9006f, 10.0036f, 6.6528f, 10.0036f, 7.7427f)
        curveTo(10.0036f, 8.8326f, 9.3332f, 9.5848f, 8.361f, 9.5848f)
        close()
    }
}
.build()
