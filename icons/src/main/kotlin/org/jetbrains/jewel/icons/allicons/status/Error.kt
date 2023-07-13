package org.jetbrains.jewel.icons.allicons.status

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
import org.jetbrains.jewel.icons.allicons.StatusGroup

public val StatusGroup.Error: IntellijIconData
    get() {
        if (_error != null) {
            return _error!!
        }
        _error = IntellijIconData(name = "Error",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ErrorComposable(it) })
        return _error!!
    }

private var _error: IntellijIconData? = null

private fun ErrorComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Error",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-7.0f, 0.0f)
        arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
        arcToRelative(7.0f, 7.0f, 0.0f, true, true, -14.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.8f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 4.5f)
        lineTo(8.0f, 8.0f)
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0004f, 11.1f)
        moveToRelative(-1.1f, 0.0f)
        arcToRelative(1.1f, 1.1f, 0.0f, true, true, 2.2f, 0.0f)
        arcToRelative(1.1f, 1.1f, 0.0f, true, true, -2.2f, 0.0f)
    }
}
.build()
