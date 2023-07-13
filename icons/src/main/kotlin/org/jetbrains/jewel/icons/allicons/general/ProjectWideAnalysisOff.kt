package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val GeneralGroup.ProjectWideAnalysisOff: IntellijIconData
    get() {
        if (_projectWideAnalysisOff != null) {
            return _projectWideAnalysisOff!!
        }
        _projectWideAnalysisOff = IntellijIconData(name = "ProjectWideAnalysisOff",size =
                DpSize(height = 16.0.dp, width = 16.0.dp),imageVector = {
                ProjectWideAnalysisOffComposable(it) })
        return _projectWideAnalysisOff!!
    }

private var _projectWideAnalysisOff: IntellijIconData? = null

private fun ProjectWideAnalysisOffComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "ProjectWideAnalysisOff", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.5f, 0.9957f)
        horizontalLineTo(8.5f)
        verticalLineTo(7.1338f)
        curveTo(8.7989f, 7.3067f, 9.0f, 7.6299f, 9.0f, 8.0f)
        curveTo(9.0f, 8.5523f, 8.5523f, 9.0f, 8.0f, 9.0f)
        curveTo(7.4477f, 9.0f, 7.0f, 8.5523f, 7.0f, 8.0f)
        curveTo(7.0f, 7.6299f, 7.2011f, 7.3067f, 7.5f, 7.1338f)
        verticalLineTo(5.0415f)
        curveTo(6.0811f, 5.2795f, 5.0f, 6.5135f, 5.0f, 8.0f)
        curveTo(5.0f, 9.6568f, 6.3432f, 11.0f, 8.0f, 11.0f)
        curveTo(9.6568f, 11.0f, 11.0f, 9.6568f, 11.0f, 8.0f)
        curveTo(11.0f, 7.299f, 10.7596f, 6.6541f, 10.3566f, 6.1434f)
        lineTo(11.0674f, 5.4326f)
        curveTo(11.6495f, 6.1273f, 12.0f, 7.0227f, 12.0f, 8.0f)
        curveTo(12.0f, 10.2091f, 10.2091f, 12.0f, 8.0f, 12.0f)
        curveTo(5.7909f, 12.0f, 4.0f, 10.2091f, 4.0f, 8.0f)
        curveTo(4.0f, 5.9602f, 5.5268f, 4.277f, 7.5f, 4.031f)
        verticalLineTo(2.0205f)
        curveTo(4.4202f, 2.2746f, 2.0f, 4.8547f, 2.0f, 8.0f)
        curveTo(2.0f, 11.3137f, 4.6863f, 14.0f, 8.0f, 14.0f)
        curveTo(11.3137f, 14.0f, 14.0f, 11.3137f, 14.0f, 8.0f)
        curveTo(14.0f, 6.4704f, 13.4276f, 5.0744f, 12.4853f, 4.0147f)
        lineTo(13.1935f, 3.3065f)
        curveTo(14.3162f, 4.5481f, 15.0f, 6.1942f, 15.0f, 8.0f)
        curveTo(15.0f, 11.866f, 11.866f, 15.0f, 8.0f, 15.0f)
        curveTo(4.134f, 15.0f, 1.0f, 11.866f, 1.0f, 8.0f)
        curveTo(1.0f, 4.3021f, 3.8674f, 1.274f, 7.5f, 1.0176f)
        verticalLineTo(0.9957f)
        close()
    }
}
.build()
