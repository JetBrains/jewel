package org.jetbrains.jewel.icons.allicons.codewithme

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
import org.jetbrains.jewel.icons.allicons.CodewithmeGroup

public val CodewithmeGroup.`CwmIconModificator@20x20`: IntellijIconData
    get() {
        if (`_cwmIconModificator@20x20` != null) {
            return `_cwmIconModificator@20x20`!!
        }
        `_cwmIconModificator@20x20` = IntellijIconData(imageVector = {
                `CwmIconModificator@20x20Composable`(it) })
        return `_cwmIconModificator@20x20`!!
    }

private var `_cwmIconModificator@20x20`: IntellijIconData? = null

private fun `CwmIconModificator@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "CwmIconModificator@20x20", defaultWidth = 22.0.dp, defaultHeight = 22.0.dp,
        viewportWidth = 22.0f, viewportHeight = 22.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.75f, 16.0f)
        curveTo(7.75f, 16.9665f, 6.9665f, 17.75f, 6.0f, 17.75f)
        curveTo(5.0335f, 17.75f, 4.25f, 16.9665f, 4.25f, 16.0f)
        curveTo(4.25f, 15.0335f, 5.0335f, 14.25f, 6.0f, 14.25f)
        curveTo(6.9665f, 14.25f, 7.75f, 15.0335f, 7.75f, 16.0f)
        close()
        moveTo(6.0f, 20.75f)
        curveTo(8.0997f, 20.75f, 9.88f, 19.3883f, 10.5081f, 17.5f)
        horizontalLineTo(11.5039f)
        verticalLineTo(18.25f)
        curveTo(11.5039f, 19.0784f, 12.1755f, 19.75f, 13.0039f, 19.75f)
        curveTo(13.8323f, 19.75f, 14.5039f, 19.0784f, 14.5039f, 18.25f)
        verticalLineTo(17.4786f)
        curveTo(15.2114f, 17.358f, 15.75f, 16.7419f, 15.75f, 16.0f)
        curveTo(15.75f, 15.1716f, 15.0784f, 14.5f, 14.25f, 14.5f)
        horizontalLineTo(10.5081f)
        curveTo(9.88f, 12.6117f, 8.0997f, 11.25f, 6.0f, 11.25f)
        curveTo(3.3767f, 11.25f, 1.25f, 13.3766f, 1.25f, 16.0f)
        curveTo(1.25f, 18.6234f, 3.3767f, 20.75f, 6.0f, 20.75f)
        close()
    }
}
.build()
