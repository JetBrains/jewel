package org.jetbrains.jewel.icons.allicons.vcs

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

public val VcsGroup.`Push@20x20`: IntellijIconData
    get() {
        if (`_push@20x20` != null) {
            return `_push@20x20`!!
        }
        `_push@20x20` = IntellijIconData(imageVector = { `Push@20x20Composable`(it) })
        return `_push@20x20`!!
    }

private var `_push@20x20`: IntellijIconData? = null

private fun `Push@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Push@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(5.1464f, 14.1464f)
        curveTo(4.9512f, 14.3417f, 4.9512f, 14.6583f, 5.1464f, 14.8536f)
        curveTo(5.3417f, 15.0488f, 5.6583f, 15.0488f, 5.8535f, 14.8536f)
        lineTo(13.9999f, 6.7071f)
        verticalLineTo(12.5f)
        curveTo(13.9999f, 12.7761f, 14.2238f, 13.0f, 14.4999f, 13.0f)
        curveTo(14.7761f, 13.0f, 14.9999f, 12.7761f, 14.9999f, 12.5f)
        verticalLineTo(5.5f)
        curveTo(14.9999f, 5.2239f, 14.7761f, 5.0f, 14.4999f, 5.0f)
        horizontalLineTo(7.4999f)
        curveTo(7.2238f, 5.0f, 6.9999f, 5.2239f, 6.9999f, 5.5f)
        curveTo(6.9999f, 5.7761f, 7.2238f, 6.0f, 7.4999f, 6.0f)
        horizontalLineTo(13.2929f)
        lineTo(5.1464f, 14.1464f)
        close()
    }
}
.build()
