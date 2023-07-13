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

public val DiffGroup.ArrowRightDown_14x14: IntellijIconData
    get() {
        if (_arrowRightDown_14x14 != null) {
            return _arrowRightDown_14x14!!
        }
        _arrowRightDown_14x14 = IntellijIconData(name = "ArrowRightDown_14x14",size = DpSize(height
                = 14.0.dp, width = 14.0.dp),imageVector = { ArrowRightDown_14x14Composable(it) })
        return _arrowRightDown_14x14!!
    }

private var _arrowRightDown_14x14: IntellijIconData? = null

private fun ArrowRightDown_14x14Composable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ArrowRightDown_14x14", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.5f, 4.5f)
        verticalLineTo(11.5f)
        horizontalLineTo(4.5f)
        moveTo(8.5f, 1.5f)
        verticalLineTo(8.5f)
        horizontalLineTo(1.5f)
    }
}
.build()
