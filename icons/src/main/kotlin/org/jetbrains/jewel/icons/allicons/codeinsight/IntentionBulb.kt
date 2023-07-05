package org.jetbrains.jewel.icons.allicons.codeinsight

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
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.CodeinsightGroup

public val CodeinsightGroup.IntentionBulb: IntellijIconData
    get() {
        if (_intentionBulb != null) {
            return _intentionBulb!!
        }
        _intentionBulb = IntellijIconData(imageVector = { IntentionBulbComposable(it) })
        return _intentionBulb!!
    }

private var _intentionBulb: IntellijIconData? = null

private fun IntentionBulbComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "IntentionBulb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.7014f, 12.0f)
        horizontalLineToRelative(4.6f)
        verticalLineToRelative(1.0f)
        horizontalLineToRelative(-4.6f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.0f, 14.0f)
        horizontalLineTo(10.0f)
        curveTo(10.0f, 14.5523f, 9.5523f, 15.0f, 9.0f, 15.0f)
        horizontalLineTo(7.0f)
        curveTo(6.4477f, 15.0f, 6.0f, 14.5523f, 6.0f, 14.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFFFAF0F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(10.8704f, 9.1475f)
        curveTo(12.0417f, 8.2722f, 12.8f, 6.8747f, 12.8f, 5.3f)
        curveTo(12.8f, 2.649f, 10.6509f, 0.5f, 7.9999f, 0.5f)
        curveTo(5.349f, 0.5f, 3.1999f, 2.649f, 3.1999f, 5.3f)
        curveTo(3.1999f, 6.8746f, 3.9582f, 8.2722f, 5.1294f, 9.1475f)
        lineTo(5.4999f, 11.0f)
        horizontalLineTo(10.4999f)
        lineTo(10.8704f, 9.1475f)
        close()
    }
}
.build()
