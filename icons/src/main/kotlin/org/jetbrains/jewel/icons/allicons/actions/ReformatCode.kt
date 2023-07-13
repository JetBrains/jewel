package org.jetbrains.jewel.icons.allicons.actions

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
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.ReformatCode: IntellijIconData
    get() {
        if (_reformatCode != null) {
            return _reformatCode!!
        }
        _reformatCode = IntellijIconData(name = "ReformatCode",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { ReformatCodeComposable(it) })
        return _reformatCode!!
    }

private var _reformatCode: IntellijIconData? = null

private fun ReformatCodeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ReformatCode", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 12.0f)
        lineTo(13.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 12.5f)
        lineTo(14.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 13.0f)
        lineTo(2.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 12.5f)
        lineTo(2.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 12.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.5f, 6.0f)
        lineTo(13.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 6.5f)
        lineTo(14.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 7.0f)
        lineTo(6.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 6.5f)
        lineTo(6.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.5f, 9.0f)
        lineTo(13.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 9.5f)
        lineTo(14.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 10.0f)
        lineTo(6.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 9.5f)
        lineTo(6.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 3.0f)
        lineTo(13.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 3.5f)
        lineTo(14.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 4.0f)
        lineTo(2.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 3.5f)
        lineTo(2.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.8f, 6.1f)
        curveTo(2.6485f, 5.9864f, 2.4458f, 5.9681f, 2.2764f, 6.0528f)
        curveTo(2.107f, 6.1375f, 2.0f, 6.3106f, 2.0f, 6.5f)
        verticalLineTo(9.5f)
        curveTo(2.0f, 9.6894f, 2.107f, 9.8625f, 2.2764f, 9.9472f)
        curveTo(2.4458f, 10.0319f, 2.6485f, 10.0136f, 2.8f, 9.9f)
        lineTo(4.8f, 8.4f)
        curveTo(4.9259f, 8.3056f, 5.0f, 8.1574f, 5.0f, 8.0f)
        curveTo(5.0f, 7.8426f, 4.9259f, 7.6944f, 4.8f, 7.6f)
        lineTo(2.8f, 6.1f)
        close()
    }
}
.build()
