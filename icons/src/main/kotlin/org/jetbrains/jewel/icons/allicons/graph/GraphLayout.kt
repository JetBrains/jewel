package org.jetbrains.jewel.icons.allicons.graph

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GraphGroup

public val GraphGroup.GraphLayout: IntellijIconData
    get() {
        if (_graphLayout != null) {
            return _graphLayout!!
        }
        _graphLayout = IntellijIconData(imageVector = { GraphLayoutComposable(it) })
        return _graphLayout!!
    }

private var _graphLayout: IntellijIconData? = null

private fun GraphLayoutComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "GraphLayout", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 10.5f)
        verticalLineTo(14.5f)
        horizontalLineTo(6.5f)
        verticalLineTo(10.5f)
        horizontalLineTo(1.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.5f, 10.5f)
        verticalLineTo(14.5f)
        horizontalLineTo(14.5f)
        verticalLineTo(10.5f)
        horizontalLineTo(9.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 5.5f)
        verticalLineTo(1.5f)
        horizontalLineTo(10.5f)
        verticalLineTo(5.5f)
        horizontalLineTo(5.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 6.0f)
        verticalLineTo(8.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.5f, 10.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(8.0f)
        horizontalLineTo(11.5f)
        verticalLineTo(10.0f)
    }
}
.build()
