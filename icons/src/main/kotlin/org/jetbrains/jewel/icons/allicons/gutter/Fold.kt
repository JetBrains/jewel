package org.jetbrains.jewel.icons.allicons.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.Fold: IntellijIconData
    get() {
        if (_fold != null) {
            return _fold!!
        }
        _fold = IntellijIconData(name = "Fold",size = DpSize(height = 9.0.dp, width =
                9.0.dp),imageVector = { FoldComposable(it) })
        return _fold!!
    }

private var _fold: IntellijIconData? = null

private fun FoldComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Fold",
        defaultWidth = 9.0.dp, defaultHeight = 9.0.dp, viewportWidth = 9.0f, viewportHeight =
        9.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA8ADBD)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 2.75f)
        lineTo(4.5f, 6.25f)
        lineTo(1.0f, 2.75f)
    }
}
.build()
