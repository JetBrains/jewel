package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.ErrorIntroduction: IntellijIconData
    get() {
        if (_errorIntroduction != null) {
            return _errorIntroduction!!
        }
        _errorIntroduction = IntellijIconData(name = "ErrorIntroduction",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { ErrorIntroductionComposable(it) })
        return _errorIntroduction!!
    }

private var _errorIntroduction: IntellijIconData? = null

private fun ErrorIntroductionComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ErrorIntroduction", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.redFill), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 1.2f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 4.5f)
        lineTo(8.0f, 8.5f)
    }
    path(fill = SolidColor(colorScheme.redStroke), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 0.6f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0002f, 10.8f)
        moveToRelative(-0.5f, 0.0f)
        arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
        arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
    }
}
.build()
