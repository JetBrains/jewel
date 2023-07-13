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

public val DiffGroup.ArrowLeftRight: IntellijIconData
    get() {
        if (_arrowLeftRight != null) {
            return _arrowLeftRight!!
        }
        _arrowLeftRight = IntellijIconData(name = "ArrowLeftRight",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { ArrowLeftRightComposable(it) })
        return _arrowLeftRight!!
    }

private var _arrowLeftRight: IntellijIconData? = null

private fun ArrowLeftRightComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ArrowLeftRight", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 7.5f)
        horizontalLineTo(14.5f)
        moveTo(1.5f, 7.5f)
        lineTo(5.5f, 11.5f)
        moveTo(1.5f, 7.5f)
        lineTo(5.5f, 3.5f)
        moveTo(14.5f, 7.5f)
        lineTo(10.5f, 11.5f)
        moveTo(14.5f, 7.5f)
        lineTo(10.5f, 3.5f)
    }
}
.build()
