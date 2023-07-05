package org.jetbrains.jewel.icons.allicons.`inline`

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.InlineGroup

public val InlineGroup.Expand: IntellijIconData
    get() {
        if (_expand != null) {
            return _expand!!
        }
        _expand = IntellijIconData(imageVector = { ExpandComposable(it) })
        return _expand!!
    }

private var _expand: IntellijIconData? = null

private fun ExpandComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Expand", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA8ADBD)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(6.5f, 9.5f)
        lineTo(2.0f, 14.0f)
        moveTo(9.5f, 6.5f)
        lineTo(14.0f, 2.0f)
        moveTo(5.5f, 14.5f)
        horizontalLineTo(1.5f)
        verticalLineTo(10.5f)
        moveTo(10.5f, 1.5f)
        lineTo(14.5f, 1.5f)
        verticalLineTo(5.5f)
    }
}
.build()
