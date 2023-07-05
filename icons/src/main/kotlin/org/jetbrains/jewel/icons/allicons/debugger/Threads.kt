package org.jetbrains.jewel.icons.allicons.debugger

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
import org.jetbrains.jewel.icons.allicons.DebuggerGroup

public val DebuggerGroup.Threads: IntellijIconData
    get() {
        if (_threads != null) {
            return _threads!!
        }
        _threads = IntellijIconData(imageVector = { ThreadsComposable(it) })
        return _threads!!
    }

private var _threads: IntellijIconData? = null

private fun ThreadsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Threads", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 1.5f)
        horizontalLineTo(13.5f)
        moveTo(2.5f, 13.5f)
        horizontalLineTo(13.5f)
        moveTo(3.5f, 4.5f)
        horizontalLineTo(12.5f)
        moveTo(3.5f, 10.5f)
        horizontalLineTo(12.5f)
        moveTo(4.5f, 7.5f)
        horizontalLineTo(11.5f)
    }
}
.build()
