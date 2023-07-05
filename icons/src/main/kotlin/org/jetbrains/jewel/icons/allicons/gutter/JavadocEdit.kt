package org.jetbrains.jewel.icons.allicons.gutter

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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.JavadocEdit: IntellijIconData
    get() {
        if (_javadocEdit != null) {
            return _javadocEdit!!
        }
        _javadocEdit = IntellijIconData(imageVector = { JavadocEditComposable(it) })
        return _javadocEdit!!
    }

private var _javadocEdit: IntellijIconData? = null

private fun JavadocEditComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "JavadocEdit", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.5973f, 6.6547f)
        lineTo(12.6882f, 4.5605f)
        curveTo(13.1053f, 4.1541f, 13.1003f, 3.496f, 12.6948f, 3.0863f)
        lineTo(11.0267f, 1.3136f)
        lineTo(11.0224f, 1.3093f)
        curveTo(10.6123f, 0.9f, 9.942f, 0.8933f, 9.5331f, 1.3108f)
        lineTo(7.3867f, 3.4441f)
        moveTo(10.5973f, 6.6547f)
        lineTo(7.3867f, 3.4441f)
        moveTo(10.5973f, 6.6547f)
        lineTo(4.7404f, 12.5f)
        horizontalLineTo(1.5004f)
        lineTo(1.5f, 9.32f)
        lineTo(7.3867f, 3.4441f)
    }
}
.build()
