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

public val WindowsGroup.CloseInactive: IntellijIconData
    get() {
        if (_closeInactive != null) {
            return _closeInactive!!
        }
        _closeInactive = IntellijIconData(imageVector = { CloseInactiveComposable(it) })
        return _closeInactive!!
    }

private var _closeInactive: IntellijIconData? = null

private fun CloseInactiveComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "CloseInactive", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.7578f, 3.0503f)
        lineToRelative(9.1924f, 9.1924f)
        lineToRelative(-0.7071f, 0.7071f)
        lineToRelative(-9.1924f, -9.1924f)
        close()
    }
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.2432f, 3.0503f)
        lineToRelative(-9.1924f, 9.1924f)
        lineToRelative(0.7071f, 0.7071f)
        lineToRelative(9.1924f, -9.1924f)
        close()
    }
}
.build()
