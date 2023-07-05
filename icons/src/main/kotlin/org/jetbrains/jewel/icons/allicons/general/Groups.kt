package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.Groups: IntellijIconData
    get() {
        if (_groups != null) {
            return _groups!!
        }
        _groups = IntellijIconData(imageVector = { GroupsComposable(it) })
        return _groups!!
    }

private var _groups: IntellijIconData? = null

private fun GroupsComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Groups", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.0f, 1.5f)
        lineTo(6.0f, 1.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 2.0f)
        lineTo(6.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 6.5f)
        lineTo(2.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 6.0f)
        lineTo(1.5f, 2.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 1.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.0f, 8.5f)
        lineTo(6.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 9.0f)
        lineTo(6.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 13.5f)
        lineTo(2.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 13.0f)
        lineTo(1.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 8.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(9.0f, 8.5f)
        lineTo(13.0f, 8.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 9.0f)
        lineTo(13.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 13.5f)
        lineTo(9.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 13.0f)
        lineTo(8.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 8.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(9.0f, 1.5f)
        lineTo(13.0f, 1.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 2.0f)
        lineTo(13.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 6.5f)
        lineTo(9.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 6.0f)
        lineTo(8.5f, 2.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 1.5f)
        close()
    }
}
.build()
