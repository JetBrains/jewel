package org.jetbrains.jewel.icons.allicons.diff

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
import org.jetbrains.jewel.icons.allicons.DiffGroup

public val DiffGroup.Revert_14x14: IntellijIconData
    get() {
        if (_revert_14x14 != null) {
            return _revert_14x14!!
        }
        _revert_14x14 = IntellijIconData(name = "Revert_14x14",size = DpSize(height = 14.0.dp, width
                = 14.0.dp),imageVector = { Revert_14x14Composable(it) })
        return _revert_14x14!!
    }

private var _revert_14x14: IntellijIconData? = null

private fun Revert_14x14Composable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Revert_14x14", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.6666f, 12.5f)
        horizontalLineTo(9.4583f)
        curveTo(11.6444f, 12.5f, 13.4166f, 10.7278f, 13.4166f, 8.5417f)
        verticalLineTo(8.5417f)
        curveTo(13.4166f, 6.3555f, 11.6444f, 4.5833f, 9.4583f, 4.5833f)
        horizontalLineTo(0.5f)
        moveTo(0.5f, 4.5833f)
        lineTo(4.5f, 0.5f)
        moveTo(0.5f, 4.5833f)
        lineTo(4.5f, 8.5f)
    }
}
.build()
