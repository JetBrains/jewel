package org.jetbrains.jewel.icons.allicons.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.Unfold: IntellijIconData
    get() {
        if (_unfold != null) {
            return _unfold!!
        }
        _unfold = IntellijIconData(imageVector = { UnfoldComposable(it) })
        return _unfold!!
    }

private var _unfold: IntellijIconData? = null

private fun UnfoldComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Unfold", defaultWidth = 9.0.dp, defaultHeight = 9.0.dp, viewportWidth = 9.0f,
        viewportHeight = 9.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA8ADBD)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 8.0f)
        lineTo(6.5f, 4.5f)
        lineTo(3.0f, 1.0f)
    }
}
.build()
