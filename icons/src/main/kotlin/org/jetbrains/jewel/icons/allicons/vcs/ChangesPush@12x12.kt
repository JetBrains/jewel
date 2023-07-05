package org.jetbrains.jewel.icons.allicons.vcs

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
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.`ChangesPush@12x12`: IntellijIconData
    get() {
        if (`_changesPush@12x12` != null) {
            return `_changesPush@12x12`!!
        }
        `_changesPush@12x12` = IntellijIconData(imageVector = { `ChangesPush@12x12Composable`(it) })
        return `_changesPush@12x12`!!
    }

private var `_changesPush@12x12`: IntellijIconData? = null

private fun `ChangesPush@12x12Composable`(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ChangesPush@12x12", defaultWidth = 12.0.dp, defaultHeight = 12.0.dp,
        viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
    path(fill = SolidColor(Color(0xFF369650)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(3.75f, 3.5f)
        curveTo(3.75f, 3.0858f, 4.0858f, 2.75f, 4.5f, 2.75f)
        horizontalLineTo(8.5f)
        curveTo(8.9142f, 2.75f, 9.25f, 3.0858f, 9.25f, 3.5f)
        verticalLineTo(7.5f)
        curveTo(9.25f, 7.9142f, 8.9142f, 8.25f, 8.5f, 8.25f)
        curveTo(8.0858f, 8.25f, 7.75f, 7.9142f, 7.75f, 7.5f)
        verticalLineTo(5.3107f)
        lineTo(4.0303f, 9.0303f)
        curveTo(3.7374f, 9.3232f, 3.2626f, 9.3232f, 2.9697f, 9.0303f)
        curveTo(2.6768f, 8.7374f, 2.6768f, 8.2626f, 2.9697f, 7.9697f)
        lineTo(6.6893f, 4.25f)
        horizontalLineTo(4.5f)
        curveTo(4.0858f, 4.25f, 3.75f, 3.9142f, 3.75f, 3.5f)
        close()
    }
}
.build()
