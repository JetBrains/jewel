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

public val WindowsGroup.CloseActive: IntellijIconData
    get() {
        if (_closeActive != null) {
            return _closeActive!!
        }
        _closeActive = IntellijIconData(name = "CloseActive",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { CloseActiveComposable(it) })
        return _closeActive!!
    }

private var _closeActive: IntellijIconData? = null

private fun CloseActiveComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "CloseActive", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFA9A9A9)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(3.7574f, 3.0503f)
        lineToRelative(9.1924f, 9.1924f)
        lineToRelative(-0.7071f, 0.7071f)
        lineToRelative(-9.1924f, -9.1924f)
        close()
    }
    path(fill = SolidColor(Color(0xFFA9A9A9)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(12.2426f, 3.0503f)
        lineToRelative(-9.1924f, 9.1924f)
        lineToRelative(0.7071f, 0.7071f)
        lineToRelative(9.1924f, -9.1924f)
        close()
    }
}
.build()
