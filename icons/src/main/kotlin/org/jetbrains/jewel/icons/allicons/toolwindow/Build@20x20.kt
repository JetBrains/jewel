package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.`Build@20x20`: IntellijIconData
    get() {
        if (`_build@20x20` != null) {
            return `_build@20x20`!!
        }
        `_build@20x20` = IntellijIconData(imageVector = { `Build@20x20Composable`(it) })
        return `_build@20x20`!!
    }

private var `_build@20x20`: IntellijIconData? = null

private fun `Build@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Build@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.5f, 1.75f)
        horizontalLineTo(2.0f)
        verticalLineTo(5.75f)
        horizontalLineTo(4.5f)
        lineTo(5.5f, 5.25f)
        horizontalLineTo(7.0f)
        lineTo(8.25f, 6.25f)
        horizontalLineTo(11.0f)
        lineTo(13.0f, 4.75f)
        curveTo(14.5f, 4.75f, 15.5f, 4.75f, 18.0f, 6.5f)
        curveTo(16.5f, 1.75f, 13.5f, 1.75f, 12.0f, 1.75f)
        horizontalLineTo(8.25f)
        lineTo(7.0f, 2.25f)
        horizontalLineTo(5.5f)
        lineTo(4.5f, 1.75f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.5f, 18.25f)
        horizontalLineTo(11.75f)
        verticalLineTo(11.6803f)
        curveTo(11.75f, 10.9041f, 11.5693f, 10.1385f, 11.2221f, 9.4443f)
        lineTo(11.0f, 9.0f)
        verticalLineTo(6.25f)
        horizontalLineTo(8.25f)
        verticalLineTo(9.0f)
        lineTo(8.0279f, 9.4443f)
        curveTo(7.6807f, 10.1385f, 7.5f, 10.9041f, 7.5f, 11.6803f)
        verticalLineTo(18.25f)
        close()
    }
}
.build()
