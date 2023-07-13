package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.User: IntellijIconData
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = IntellijIconData(name = "User",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { UserComposable(it) })
        return _user!!
    }

private var _user: IntellijIconData? = null

private fun UserComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "User",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(7.9995f, 7.0f)
        curveTo(9.6564f, 7.0f, 10.9995f, 5.6568f, 10.9995f, 4.0f)
        curveTo(10.9995f, 2.3431f, 9.6564f, 1.0f, 7.9995f, 1.0f)
        curveTo(6.3427f, 1.0f, 4.9995f, 2.3431f, 4.9995f, 4.0f)
        curveTo(4.9995f, 5.6568f, 6.3427f, 7.0f, 7.9995f, 7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.1027f, 13.008f)
        curveTo(2.3991f, 11.3034f, 3.5477f, 8.0f, 7.9997f, 8.0f)
        curveTo(12.4517f, 8.0f, 13.6003f, 11.3034f, 13.8967f, 13.008f)
        curveTo(13.9912f, 13.5521f, 13.552f, 14.0f, 12.9997f, 14.0f)
        horizontalLineTo(2.9997f)
        curveTo(2.4474f, 14.0f, 2.0081f, 13.5521f, 2.1027f, 13.008f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.9995f, 4.0f)
        curveTo(10.9995f, 5.6568f, 9.6564f, 7.0f, 7.9995f, 7.0f)
        curveTo(6.3427f, 7.0f, 4.9995f, 5.6568f, 4.9995f, 4.0f)
        curveTo(4.9995f, 2.3431f, 6.3427f, 1.0f, 7.9995f, 1.0f)
        curveTo(9.6564f, 1.0f, 10.9995f, 2.3431f, 10.9995f, 4.0f)
        close()
        moveTo(9.9995f, 4.0f)
        curveTo(9.9995f, 5.1046f, 9.1041f, 6.0f, 7.9995f, 6.0f)
        curveTo(6.8949f, 6.0f, 5.9995f, 5.1046f, 5.9995f, 4.0f)
        curveTo(5.9995f, 2.8954f, 6.8949f, 2.0f, 7.9995f, 2.0f)
        curveTo(9.1041f, 2.0f, 9.9995f, 2.8954f, 9.9995f, 4.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.9997f, 8.0f)
        curveTo(3.5477f, 8.0f, 2.3991f, 11.3034f, 2.1027f, 13.008f)
        curveTo(2.0081f, 13.5521f, 2.4474f, 14.0f, 2.9997f, 14.0f)
        horizontalLineTo(12.9997f)
        curveTo(13.552f, 14.0f, 13.9912f, 13.5521f, 13.8967f, 13.008f)
        curveTo(13.6003f, 11.3034f, 12.4517f, 8.0f, 7.9997f, 8.0f)
        close()
        moveTo(11.7438f, 10.5114f)
        curveTo(12.4081f, 11.2951f, 12.7281f, 12.2552f, 12.8778f, 13.0f)
        horizontalLineTo(3.1215f)
        curveTo(3.2713f, 12.2552f, 3.5913f, 11.2951f, 4.2556f, 10.5114f)
        curveTo(4.9403f, 9.7037f, 6.058f, 9.0f, 7.9997f, 9.0f)
        curveTo(9.9413f, 9.0f, 11.0591f, 9.7037f, 11.7438f, 10.5114f)
        close()
    }
}
.build()
