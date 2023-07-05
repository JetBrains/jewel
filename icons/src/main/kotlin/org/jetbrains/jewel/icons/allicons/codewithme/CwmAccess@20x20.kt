package org.jetbrains.jewel.icons.allicons.codewithme

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
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.CodewithmeGroup

public val CodewithmeGroup.`CwmAccess@20x20`: IntellijIconData
    get() {
        if (`_cwmAccess@20x20` != null) {
            return `_cwmAccess@20x20`!!
        }
        `_cwmAccess@20x20` = IntellijIconData(imageVector = { `CwmAccess@20x20Composable`(it) })
        return `_cwmAccess@20x20`!!
    }

private var `_cwmAccess@20x20`: IntellijIconData? = null

private fun `CwmAccess@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "CwmAccess@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.9998f, 5.0f)
        curveTo(13.9998f, 7.2091f, 12.209f, 9.0f, 9.9998f, 9.0f)
        curveTo(7.7907f, 9.0f, 5.9998f, 7.2091f, 5.9998f, 5.0f)
        curveTo(5.9998f, 2.7909f, 7.7907f, 1.0f, 9.9998f, 1.0f)
        curveTo(12.209f, 1.0f, 13.9998f, 2.7909f, 13.9998f, 5.0f)
        close()
        moveTo(12.4998f, 5.0f)
        curveTo(12.4998f, 6.3807f, 11.3805f, 7.5f, 9.9998f, 7.5f)
        curveTo(8.6191f, 7.5f, 7.4998f, 6.3807f, 7.4998f, 5.0f)
        curveTo(7.4998f, 3.6193f, 8.6191f, 2.5f, 9.9998f, 2.5f)
        curveTo(11.3805f, 2.5f, 12.4998f, 3.6193f, 12.4998f, 5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.9998f, 10.0f)
        curveTo(11.4176f, 10.0f, 12.5674f, 10.2859f, 13.4998f, 10.7496f)
        verticalLineTo(12.4962f)
        curveTo(12.6918f, 11.9111f, 11.5781f, 11.5f, 9.9998f, 11.5f)
        curveTo(7.7321f, 11.5f, 6.4235f, 12.3487f, 5.6027f, 13.3429f)
        curveTo(4.8054f, 14.3087f, 4.3927f, 15.5112f, 4.1867f, 16.5f)
        horizontalLineTo(9.9998f)
        verticalLineTo(18.0f)
        horizontalLineTo(3.9998f)
        curveTo(3.1714f, 18.0f, 2.5114f, 17.327f, 2.6569f, 16.5114f)
        curveTo(3.0697f, 14.1974f, 4.5673f, 10.0f, 9.9998f, 10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(16.4998f, 12.25f)
        curveTo(16.4998f, 11.8358f, 16.164f, 11.5f, 15.7498f, 11.5f)
        curveTo(15.3356f, 11.5f, 14.9998f, 11.8358f, 14.9998f, 12.25f)
        verticalLineTo(15.0f)
        horizontalLineTo(12.2498f)
        curveTo(11.8356f, 15.0f, 11.4998f, 15.3358f, 11.4998f, 15.75f)
        curveTo(11.4998f, 16.1642f, 11.8356f, 16.5f, 12.2498f, 16.5f)
        horizontalLineTo(14.9998f)
        verticalLineTo(19.25f)
        curveTo(14.9998f, 19.6642f, 15.3356f, 20.0f, 15.7498f, 20.0f)
        curveTo(16.164f, 20.0f, 16.4998f, 19.6642f, 16.4998f, 19.25f)
        verticalLineTo(16.5f)
        horizontalLineTo(19.2498f)
        curveTo(19.664f, 16.5f, 19.9998f, 16.1642f, 19.9998f, 15.75f)
        curveTo(19.9998f, 15.3358f, 19.664f, 15.0f, 19.2498f, 15.0f)
        horizontalLineTo(16.4998f)
        verticalLineTo(12.25f)
        close()
    }
}
.build()
