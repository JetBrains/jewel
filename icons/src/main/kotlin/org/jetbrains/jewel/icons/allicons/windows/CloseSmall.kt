package org.jetbrains.jewel.icons.allicons.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val WindowsGroup.CloseSmall: IntellijIconData
    get() {
        if (_closeSmall != null) {
            return _closeSmall!!
        }
        _closeSmall = IntellijIconData(imageVector = { CloseSmallComposable(it) })
        return _closeSmall!!
    }

private var _closeSmall: IntellijIconData? = null

private fun CloseSmallComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "CloseSmall", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(4.1809f, 4.8385f)
        lineTo(4.8629f, 4.1071f)
        lineTo(11.8205f, 11.1615f)
        lineTo(11.1385f, 11.8929f)
        lineTo(4.1809f, 4.8385f)
        close()
    }
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(11.1377f, 4.1071f)
        lineTo(11.8197f, 4.8385f)
        lineTo(4.8622f, 11.8929f)
        lineTo(4.1802f, 11.1615f)
        lineTo(11.1377f, 4.1071f)
        close()
    }
}
.build()
