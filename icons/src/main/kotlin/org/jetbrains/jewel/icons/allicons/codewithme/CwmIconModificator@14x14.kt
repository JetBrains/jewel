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

public val CodewithmeGroup.`CwmIconModificator@14x14`: IntellijIconData
    get() {
        if (`_cwmIconModificator@14x14` != null) {
            return `_cwmIconModificator@14x14`!!
        }
        `_cwmIconModificator@14x14` = IntellijIconData(imageVector = {
                `CwmIconModificator@14x14Composable`(it) })
        return `_cwmIconModificator@14x14`!!
    }

private var `_cwmIconModificator@14x14`: IntellijIconData? = null

private fun `CwmIconModificator@14x14Composable`(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "CwmIconModificator@14x14", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
        viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.5f, 10.5f)
        curveTo(6.5f, 11.6046f, 5.6046f, 12.5f, 4.5f, 12.5f)
        curveTo(3.3954f, 12.5f, 2.5f, 11.6046f, 2.5f, 10.5f)
        curveTo(2.5f, 9.3954f, 3.3954f, 8.5f, 4.5f, 8.5f)
        curveTo(5.6046f, 8.5f, 6.5f, 9.3954f, 6.5f, 10.5f)
        close()
        moveTo(4.5f, 14.5f)
        curveTo(6.364f, 14.5f, 7.9296f, 13.2254f, 8.3739f, 11.5f)
        horizontalLineTo(9.5f)
        verticalLineTo(12.5f)
        curveTo(9.5f, 13.0523f, 9.9477f, 13.5f, 10.5f, 13.5f)
        curveTo(11.0523f, 13.5f, 11.5f, 13.0523f, 11.5f, 12.5f)
        verticalLineTo(11.5f)
        curveTo(12.0523f, 11.5f, 12.5f, 11.0523f, 12.5f, 10.5f)
        curveTo(12.5f, 9.9477f, 12.0523f, 9.5f, 11.5f, 9.5f)
        horizontalLineTo(8.3739f)
        curveTo(7.9296f, 7.7747f, 6.364f, 6.5f, 4.5f, 6.5f)
        curveTo(2.2909f, 6.5f, 0.5f, 8.2909f, 0.5f, 10.5f)
        curveTo(0.5f, 12.7091f, 2.2909f, 14.5f, 4.5f, 14.5f)
        close()
    }
}
.build()
