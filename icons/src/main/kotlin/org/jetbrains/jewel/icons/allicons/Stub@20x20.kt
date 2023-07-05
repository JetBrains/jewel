package org.jetbrains.jewel.icons.allicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData

public val AllIcons.`Stub@20x20`: IntellijIconData
    get() {
        if (`_stub@20x20` != null) {
            return `_stub@20x20`!!
        }
        `_stub@20x20` = IntellijIconData(imageVector = { `Stub@20x20Composable`(it) })
        return `_stub@20x20`!!
    }

private var `_stub@20x20`: IntellijIconData? = null

private fun `Stub@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Stub@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 2.75f)
        lineTo(16.0f, 2.75f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 17.25f, 4.0f)
        lineTo(17.25f, 16.0f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 16.0f, 17.25f)
        lineTo(4.0f, 17.25f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 2.75f, 16.0f)
        lineTo(2.75f, 4.0f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 4.0f, 2.75f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(3.4591f, 2.3984f)
        lineTo(2.3984f, 3.4591f)
        lineTo(8.9392f, 9.9999f)
        lineTo(2.3983f, 16.5408f)
        lineTo(3.459f, 17.6014f)
        lineTo(9.9999f, 11.0605f)
        lineTo(16.5406f, 17.6012f)
        lineTo(17.6012f, 16.5406f)
        lineTo(11.0605f, 9.9999f)
        lineTo(17.6011f, 3.4593f)
        lineTo(16.5405f, 2.3986f)
        lineTo(9.9999f, 8.9392f)
        lineTo(3.4591f, 2.3984f)
        close()
    }
}
.build()
