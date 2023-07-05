package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.EvaluateExpression: IntellijIconData
    get() {
        if (_evaluateExpression != null) {
            return _evaluateExpression!!
        }
        _evaluateExpression = IntellijIconData(imageVector = { EvaluateExpressionComposable(it) })
        return _evaluateExpression!!
    }

private var _evaluateExpression: IntellijIconData? = null

private fun EvaluateExpressionComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "EvaluateExpression", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 2.5f)
        lineTo(12.0f, 2.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 4.0f)
        lineTo(13.5f, 12.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 13.5f)
        lineTo(4.0f, 13.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 12.0f)
        lineTo(2.5f, 4.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(5.0f, 4.5f)
        lineTo(11.0f, 4.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 5.0f)
        lineTo(11.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 6.5f)
        lineTo(5.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 6.0f)
        lineTo(4.5f, 5.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 4.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.0f, 8.0f)
        lineTo(5.0f, 8.0f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 5.7f, 8.7f)
        lineTo(5.7f, 8.7f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 5.0f, 9.4f)
        lineTo(5.0f, 9.4f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 4.3f, 8.7f)
        lineTo(4.3f, 8.7f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 5.0f, 8.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 8.0f)
        lineTo(8.0f, 8.0f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 8.7f, 8.7f)
        lineTo(8.7f, 8.7f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 8.0f, 9.4f)
        lineTo(8.0f, 9.4f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 7.3f, 8.7f)
        lineTo(7.3f, 8.7f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 8.0f, 8.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.0f, 8.0f)
        lineTo(11.0f, 8.0f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 11.7f, 8.7f)
        lineTo(11.7f, 8.7f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 11.0f, 9.4f)
        lineTo(11.0f, 9.4f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 10.3f, 8.7f)
        lineTo(10.3f, 8.7f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 11.0f, 8.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.0f, 10.6001f)
        lineTo(5.0f, 10.6001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 5.7f, 11.3001f)
        lineTo(5.7f, 11.3001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 5.0f, 12.0001f)
        lineTo(5.0f, 12.0001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 4.3f, 11.3001f)
        lineTo(4.3f, 11.3001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 5.0f, 10.6001f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 10.6001f)
        lineTo(8.0f, 10.6001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 8.7f, 11.3001f)
        lineTo(8.7f, 11.3001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 8.0f, 12.0001f)
        lineTo(8.0f, 12.0001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 7.3f, 11.3001f)
        lineTo(7.3f, 11.3001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 8.0f, 10.6001f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.0f, 10.6001f)
        lineTo(11.0f, 10.6001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 11.7f, 11.3001f)
        lineTo(11.7f, 11.3001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 11.0f, 12.0001f)
        lineTo(11.0f, 12.0001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 10.3f, 11.3001f)
        lineTo(10.3f, 11.3001f)
        arcTo(0.7f, 0.7f, 0.0f, false, true, 11.0f, 10.6001f)
        close()
    }
}
.build()
