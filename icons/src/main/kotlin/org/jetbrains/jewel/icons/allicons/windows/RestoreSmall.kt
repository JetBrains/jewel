package org.jetbrains.jewel.icons.allicons.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val WindowsGroup.RestoreSmall: IntellijIconData
    get() {
        if (_restoreSmall != null) {
            return _restoreSmall!!
        }
        _restoreSmall = IntellijIconData(name = "RestoreSmall",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { RestoreSmallComposable(it) })
        return _restoreSmall!!
    }

private var _restoreSmall: IntellijIconData? = null

private fun RestoreSmallComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "RestoreSmall", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(6.0f, 4.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(9.0f)
        horizontalLineTo(11.0f)
        verticalLineTo(5.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(4.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(10.0f, 6.0f)
        horizontalLineTo(4.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(6.0f)
        close()
        moveTo(9.0f, 7.0f)
        horizontalLineTo(5.0f)
        verticalLineTo(11.0f)
        horizontalLineTo(9.0f)
        verticalLineTo(7.0f)
        close()
    }
}
.build()
