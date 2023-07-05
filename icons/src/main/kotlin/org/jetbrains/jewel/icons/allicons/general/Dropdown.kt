package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Dropdown: IntellijIconData
    get() {
        if (_dropdown != null) {
            return _dropdown!!
        }
        _dropdown = IntellijIconData(imageVector = { DropdownComposable(it) })
        return _dropdown!!
    }

private var _dropdown: IntellijIconData? = null

private fun DropdownComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Dropdown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(16.0f, 12.0f)
        verticalLineTo(16.0f)
        horizontalLineTo(12.0f)
        lineTo(16.0f, 12.0f)
        close()
    }
}
.build()
