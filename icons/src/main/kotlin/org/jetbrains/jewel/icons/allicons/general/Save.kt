package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Save: IntellijIconData
    get() {
        if (_save != null) {
            return _save!!
        }
        _save = IntellijIconData(imageVector = { SaveComposable(it) })
        return _save!!
    }

private var _save: IntellijIconData? = null

private fun SaveComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Save",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 3.0f)
        verticalLineTo(5.5f)
        horizontalLineTo(10.5f)
        verticalLineTo(3.0f)
        moveTo(4.5f, 13.0f)
        verticalLineTo(9.5f)
        horizontalLineTo(11.5f)
        verticalLineTo(13.0f)
        moveTo(2.5f, 13.5f)
        verticalLineTo(2.5f)
        horizontalLineTo(11.5f)
        lineTo(13.5f, 4.5f)
        verticalLineTo(13.5f)
        horizontalLineTo(2.5f)
        close()
    }
}
.build()
