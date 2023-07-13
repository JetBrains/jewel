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

public val WindowsGroup.MinimizeSmall: IntellijIconData
    get() {
        if (_minimizeSmall != null) {
            return _minimizeSmall!!
        }
        _minimizeSmall = IntellijIconData(name = "MinimizeSmall",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { MinimizeSmallComposable(it) })
        return _minimizeSmall!!
    }

private var _minimizeSmall: IntellijIconData? = null

private fun MinimizeSmallComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MinimizeSmall", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 12.0f)
        horizontalLineToRelative(8.0f)
        verticalLineToRelative(1.0f)
        horizontalLineToRelative(-8.0f)
        close()
    }
}
.build()
