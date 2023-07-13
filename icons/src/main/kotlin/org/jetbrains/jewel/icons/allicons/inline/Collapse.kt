package org.jetbrains.jewel.icons.allicons.`inline`

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.InlineGroup

public val InlineGroup.Collapse: IntellijIconData
    get() {
        if (_collapse != null) {
            return _collapse!!
        }
        _collapse = IntellijIconData(name = "Collapse",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { CollapseComposable(it) })
        return _collapse!!
    }

private var _collapse: IntellijIconData? = null

private fun CollapseComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Collapse", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA8ADBD)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 14.5f)
        lineTo(6.0f, 10.0f)
        moveTo(14.5f, 1.5f)
        lineTo(10.0f, 6.0f)
        moveTo(2.5f, 9.5f)
        horizontalLineTo(6.5f)
        lineTo(6.5f, 13.5f)
        moveTo(13.5f, 6.5f)
        lineTo(9.5f, 6.5f)
        verticalLineTo(2.5f)
    }
}
.build()
