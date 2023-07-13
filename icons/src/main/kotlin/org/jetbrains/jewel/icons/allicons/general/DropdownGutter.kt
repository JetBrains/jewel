package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.DropdownGutter: IntellijIconData
    get() {
        if (_dropdownGutter != null) {
            return _dropdownGutter!!
        }
        _dropdownGutter = IntellijIconData(name = "DropdownGutter",size = DpSize(height = 15.0.dp,
                width = 15.0.dp),imageVector = { DropdownGutterComposable(it) })
        return _dropdownGutter!!
    }

private var _dropdownGutter: IntellijIconData? = null

private fun DropdownGutterComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "DropdownGutter", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp, viewportWidth = 15.0f,
        viewportHeight = 15.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(15.0f, 11.0f)
        verticalLineTo(15.0f)
        horizontalLineTo(11.0f)
        lineTo(15.0f, 11.0f)
        close()
    }
}
.build()
