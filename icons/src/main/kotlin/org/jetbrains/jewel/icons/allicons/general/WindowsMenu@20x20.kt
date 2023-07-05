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

public val GeneralGroup.`WindowsMenu@20x20`: IntellijIconData
    get() {
        if (`_windowsMenu@20x20` != null) {
            return `_windowsMenu@20x20`!!
        }
        `_windowsMenu@20x20` = IntellijIconData(imageVector = { `WindowsMenu@20x20Composable`(it) })
        return `_windowsMenu@20x20`!!
    }

private var `_windowsMenu@20x20`: IntellijIconData? = null

private fun `WindowsMenu@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "WindowsMenu@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.75f, 2.5f)
        lineTo(17.25f, 2.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 18.0f, 3.25f)
        lineTo(18.0f, 3.25f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 17.25f, 4.0f)
        lineTo(2.75f, 4.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 3.25f)
        lineTo(2.0f, 3.25f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.75f, 2.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.75f, 7.0f)
        lineTo(17.25f, 7.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 18.0f, 7.75f)
        lineTo(18.0f, 7.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 17.25f, 8.5f)
        lineTo(2.75f, 8.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 7.75f)
        lineTo(2.0f, 7.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.75f, 7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.75f, 11.5f)
        lineTo(17.25f, 11.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 18.0f, 12.25f)
        lineTo(18.0f, 12.25f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 17.25f, 13.0f)
        lineTo(2.75f, 13.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 12.25f)
        lineTo(2.0f, 12.25f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.75f, 11.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.75f, 16.0f)
        lineTo(17.25f, 16.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 18.0f, 16.75f)
        lineTo(18.0f, 16.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 17.25f, 17.5f)
        lineTo(2.75f, 17.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 16.75f)
        lineTo(2.0f, 16.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 2.75f, 16.0f)
        close()
    }
}
.build()
