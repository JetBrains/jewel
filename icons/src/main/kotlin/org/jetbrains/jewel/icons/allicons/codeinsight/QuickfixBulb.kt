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

public val CodeinsightGroup.QuickfixBulb: IntellijIconData
    get() {
        if (_quickfixBulb != null) {
            return _quickfixBulb!!
        }
        _quickfixBulb = IntellijIconData(imageVector = { QuickfixBulbComposable(it) })
        return _quickfixBulb!!
    }

private var _quickfixBulb: IntellijIconData? = null

private fun QuickfixBulbComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "QuickfixBulb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
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
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
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
        moveTo(8.0f, 2.0f)
        curveTo(8.4971f, 2.0f, 8.9f, 2.403f, 8.9f, 2.9f)
        verticalLineTo(5.4f)
        curveTo(8.9f, 5.8971f, 8.4971f, 6.3f, 8.0f, 6.3f)
        curveTo(7.5029f, 6.3f, 7.1f, 5.8971f, 7.1f, 5.4f)
        lineTo(7.1f, 2.9f)
        curveTo(7.1f, 2.403f, 7.5029f, 2.0f, 8.0f, 2.0f)
        close()
        moveTo(7.9999f, 9.2f)
        curveTo(8.6074f, 9.2f, 9.0999f, 8.7075f, 9.0999f, 8.1f)
        curveTo(9.0999f, 7.4925f, 8.6074f, 7.0f, 7.9999f, 7.0f)
        curveTo(7.3924f, 7.0f, 6.8999f, 7.4925f, 6.8999f, 8.1f)
        curveTo(6.8999f, 8.7075f, 7.3924f, 9.2f, 7.9999f, 9.2f)
        close()
    }
}
.build()
