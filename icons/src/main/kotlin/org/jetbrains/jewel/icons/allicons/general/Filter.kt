package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Filter: IntellijIconData
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = IntellijIconData(name = "Filter",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { FilterComposable(it) })
        return _filter!!
    }

private var _filter: IntellijIconData? = null

private fun FilterComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Filter", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(13.5f, 2.5f)
        horizontalLineTo(2.5f)
        lineTo(6.5f, 7.5f)
        verticalLineTo(14.0f)
        lineTo(9.5f, 12.0f)
        verticalLineTo(7.5f)
        lineTo(13.5f, 2.5f)
        close()
    }
}
.build()
