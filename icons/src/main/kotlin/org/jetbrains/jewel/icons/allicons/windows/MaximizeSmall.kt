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

public val WindowsGroup.MaximizeSmall: IntellijIconData
    get() {
        if (_maximizeSmall != null) {
            return _maximizeSmall!!
        }
        _maximizeSmall = IntellijIconData(imageVector = { MaximizeSmallComposable(it) })
        return _maximizeSmall!!
    }

private var _maximizeSmall: IntellijIconData? = null

private fun MaximizeSmallComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MaximizeSmall", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA8ADBD)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.5f, 4.5f)
        horizontalLineToRelative(7.0f)
        verticalLineToRelative(7.0f)
        horizontalLineToRelative(-7.0f)
        close()
    }
}
.build()
