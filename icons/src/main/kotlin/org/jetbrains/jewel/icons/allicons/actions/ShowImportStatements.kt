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

public val ActionsGroup.ShowImportStatements: IntellijIconData
    get() {
        if (_showImportStatements != null) {
            return _showImportStatements!!
        }
        _showImportStatements = IntellijIconData(name = "ShowImportStatements",size = DpSize(height
                = 16.0.dp, width = 16.0.dp),imageVector = { ShowImportStatementsComposable(it) })
        return _showImportStatements!!
    }

private var _showImportStatements: IntellijIconData? = null

private fun ShowImportStatementsComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ShowImportStatements", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 2.0f)
        lineTo(8.0f, 2.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 3.0f)
        lineTo(9.0f, 3.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 4.0f)
        lineTo(8.0f, 4.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 3.0f)
        lineTo(7.0f, 3.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 2.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.5f, 6.0f)
        lineTo(8.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 6.5f)
        lineTo(9.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 14.0f)
        lineTo(8.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 13.5f)
        lineTo(8.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 6.0f)
        lineTo(8.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 6.5f)
        lineTo(9.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 7.0f)
        lineTo(5.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 6.5f)
        lineTo(5.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.5f, 13.0f)
        lineTo(11.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 13.5f)
        lineTo(12.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 14.0f)
        lineTo(4.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 13.5f)
        lineTo(4.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 13.0f)
        close()
    }
}
.build()
