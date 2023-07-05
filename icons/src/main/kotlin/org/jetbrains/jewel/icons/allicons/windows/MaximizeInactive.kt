package org.jetbrains.jewel.icons.allicons.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.WindowsGroup

public val WindowsGroup.MaximizeInactive: IntellijIconData
    get() {
        if (_maximizeInactive != null) {
            return _maximizeInactive!!
        }
        _maximizeInactive = IntellijIconData(imageVector = { MaximizeInactiveComposable(it) })
        return _maximizeInactive!!
    }

private var _maximizeInactive: IntellijIconData? = null

private fun MaximizeInactiveComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "MaximizeInactive", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.5f, 3.5f)
        horizontalLineToRelative(9.0f)
        verticalLineToRelative(9.0f)
        horizontalLineToRelative(-9.0f)
        close()
    }
}
.build()
