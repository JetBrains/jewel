package org.jetbrains.jewel.icons.allicons.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.WindowsGroup

public val WindowsGroup.MinimizeInactive: IntellijIconData
    get() {
        if (_minimizeInactive != null) {
            return _minimizeInactive!!
        }
        _minimizeInactive = IntellijIconData(name = "MinimizeInactive",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { MinimizeInactiveComposable(it) })
        return _minimizeInactive!!
    }

private var _minimizeInactive: IntellijIconData? = null

private fun MinimizeInactiveComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "MinimizeInactive", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 8.0f)
        horizontalLineToRelative(10.0f)
        verticalLineToRelative(1.0f)
        horizontalLineToRelative(-10.0f)
        close()
    }
}
.build()
