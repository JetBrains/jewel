package org.jetbrains.jewel.icons.allicons.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.DiffGroup

public val DiffGroup.`Remove@14x14`: IntellijIconData
    get() {
        if (`_remove@14x14` != null) {
            return `_remove@14x14`!!
        }
        `_remove@14x14` = IntellijIconData(imageVector = { `Remove@14x14Composable`(it) })
        return `_remove@14x14`!!
    }

private var `_remove@14x14`: IntellijIconData? = null

private fun `Remove@14x14Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Remove@14x14", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.5f, 12.5f)
        lineTo(12.5f, 1.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 12.5f)
        lineTo(1.5f, 1.5f)
    }
}
.build()
