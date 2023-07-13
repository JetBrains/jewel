package org.jetbrains.jewel.icons.allicons.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val WindowsGroup.HelpInactive: IntellijIconData
    get() {
        if (_helpInactive != null) {
            return _helpInactive!!
        }
        _helpInactive = IntellijIconData(name = "HelpInactive",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { HelpInactiveComposable(it) })
        return _helpInactive!!
    }

private var _helpInactive: IntellijIconData? = null

private fun HelpInactiveComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "HelpInactive", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(8.0f, 2.0f)
        curveTo(5.0f, 2.0f, 5.0f, 4.9147f, 5.0f, 5.0f)
        horizontalLineTo(6.0f)
        curveTo(6.0f, 5.0f, 6.0f, 3.0f, 8.0f, 3.0f)
        curveTo(9.1569f, 3.0f, 10.0f, 3.7429f, 10.0f, 5.0f)
        curveTo(10.0f, 7.2857f, 7.0f, 6.0625f, 7.0f, 10.0f)
        horizontalLineTo(8.0f)
        curveTo(8.0f, 6.625f, 11.0f, 8.0f, 11.0f, 5.0f)
        curveTo(11.0f, 3.5808f, 10.0f, 2.0f, 8.0f, 2.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.0f, 12.0f)
        horizontalLineToRelative(1.0f)
        verticalLineToRelative(1.0f)
        horizontalLineToRelative(-1.0f)
        close()
    }
}
.build()
