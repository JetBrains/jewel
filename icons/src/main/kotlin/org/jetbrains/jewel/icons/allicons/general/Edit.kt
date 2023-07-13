package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Edit: IntellijIconData
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = IntellijIconData(name = "Edit",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { EditComposable(it) })
        return _edit!!
    }

private var _edit: IntellijIconData? = null

private fun EditComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Edit",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.5973f, 7.6547f)
        lineTo(13.6882f, 5.5605f)
        curveTo(14.1053f, 5.1541f, 14.1003f, 4.496f, 13.6948f, 4.0863f)
        lineTo(12.0267f, 2.3136f)
        lineTo(12.0224f, 2.3093f)
        curveTo(11.6123f, 1.9f, 10.942f, 1.8933f, 10.5331f, 2.3108f)
        lineTo(8.3867f, 4.4441f)
        moveTo(11.5973f, 7.6547f)
        lineTo(8.3867f, 4.4441f)
        moveTo(11.5973f, 7.6547f)
        lineTo(5.7404f, 13.5f)
        horizontalLineTo(2.5004f)
        lineTo(2.5f, 10.32f)
        lineTo(8.3867f, 4.4441f)
    }
}
.build()
