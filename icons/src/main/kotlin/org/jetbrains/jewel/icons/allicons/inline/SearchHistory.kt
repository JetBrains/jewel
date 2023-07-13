package org.jetbrains.jewel.icons.allicons.`inline`

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
import org.jetbrains.jewel.icons.allicons.InlineGroup

public val InlineGroup.SearchHistory: IntellijIconData
    get() {
        if (_searchHistory != null) {
            return _searchHistory!!
        }
        _searchHistory = IntellijIconData(name = "SearchHistory",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { SearchHistoryComposable(it) })
        return _searchHistory!!
    }

private var _searchHistory: IntellijIconData? = null

private fun SearchHistoryComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "SearchHistory", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.8535f, 10.1432f)
        curveTo(8.6583f, 9.9479f, 8.3417f, 9.9479f, 8.1465f, 10.1432f)
        curveTo(7.9512f, 10.3384f, 7.9512f, 10.655f, 8.1465f, 10.8503f)
        lineTo(8.8535f, 10.1432f)
        close()
        moveTo(11.1457f, 13.8495f)
        curveTo(11.3409f, 14.0447f, 11.6575f, 14.0447f, 11.8528f, 13.8495f)
        curveTo(12.048f, 13.6542f, 12.048f, 13.3376f, 11.8528f, 13.1424f)
        lineTo(11.1457f, 13.8495f)
        close()
        moveTo(9.0f, 7.0f)
        curveTo(9.0f, 9.2091f, 7.2091f, 11.0f, 5.0f, 11.0f)
        verticalLineTo(12.0f)
        curveTo(7.7614f, 12.0f, 10.0f, 9.7614f, 10.0f, 7.0f)
        horizontalLineTo(9.0f)
        close()
        moveTo(5.0f, 11.0f)
        curveTo(2.7909f, 11.0f, 1.0f, 9.2091f, 1.0f, 7.0f)
        horizontalLineTo(0.0f)
        curveTo(0.0f, 9.7614f, 2.2386f, 12.0f, 5.0f, 12.0f)
        verticalLineTo(11.0f)
        close()
        moveTo(1.0f, 7.0f)
        curveTo(1.0f, 4.7909f, 2.7909f, 3.0f, 5.0f, 3.0f)
        verticalLineTo(2.0f)
        curveTo(2.2386f, 2.0f, 0.0f, 4.2386f, 0.0f, 7.0f)
        horizontalLineTo(1.0f)
        close()
        moveTo(5.0f, 3.0f)
        curveTo(7.2091f, 3.0f, 9.0f, 4.7909f, 9.0f, 7.0f)
        horizontalLineTo(10.0f)
        curveTo(10.0f, 4.2386f, 7.7614f, 2.0f, 5.0f, 2.0f)
        verticalLineTo(3.0f)
        close()
        moveTo(8.1465f, 10.8503f)
        lineTo(11.1457f, 13.8495f)
        lineTo(11.8528f, 13.1424f)
        lineTo(8.8535f, 10.1432f)
        lineTo(8.1465f, 10.8503f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.0f, 7.0f)
        lineTo(13.5f, 9.5f)
        lineTo(16.0f, 7.0f)
        horizontalLineTo(11.0f)
        close()
    }
}
.build()
