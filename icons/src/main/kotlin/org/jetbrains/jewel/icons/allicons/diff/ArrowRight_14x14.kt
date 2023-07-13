package org.jetbrains.jewel.icons.allicons.diff

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
import org.jetbrains.jewel.icons.allicons.DiffGroup

public val DiffGroup.ArrowRight_14x14: IntellijIconData
    get() {
        if (_arrowRight_14x14 != null) {
            return _arrowRight_14x14!!
        }
        _arrowRight_14x14 = IntellijIconData(name = "ArrowRight_14x14",size = DpSize(height =
                14.0.dp, width = 14.0.dp),imageVector = { ArrowRight_14x14Composable(it) })
        return _arrowRight_14x14!!
    }

private var _arrowRight_14x14: IntellijIconData? = null

private fun ArrowRight_14x14Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ArrowRight_14x14", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth =
        14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.5f, 11.5f)
        lineTo(12.0f, 7.0f)
        lineTo(7.5f, 2.5f)
        moveTo(2.5f, 11.5f)
        lineTo(7.0f, 7.0f)
        lineTo(2.5f, 2.5f)
    }
}
.build()
