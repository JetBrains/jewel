package org.jetbrains.jewel.icons.allicons.general

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

public val GeneralGroup.ProjectStructure: IntellijIconData
    get() {
        if (_projectStructure != null) {
            return _projectStructure!!
        }
        _projectStructure = IntellijIconData(name = "ProjectStructure",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { ProjectStructureComposable(it) })
        return _projectStructure!!
    }

private var _projectStructure: IntellijIconData? = null

private fun ProjectStructureComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "ProjectStructure", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.0f, 12.5f)
        curveTo(13.0f, 12.2239f, 13.2239f, 12.0f, 13.5f, 12.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 12.0f, 16.0f, 12.2239f, 16.0f, 12.5f)
        verticalLineTo(14.5f)
        curveTo(16.0f, 14.7761f, 15.7761f, 15.0f, 15.5f, 15.0f)
        horizontalLineTo(13.5f)
        curveTo(13.2239f, 15.0f, 13.0f, 14.7761f, 13.0f, 14.5f)
        verticalLineTo(12.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.0f, 12.5f)
        curveTo(9.0f, 12.2239f, 9.2239f, 12.0f, 9.5f, 12.0f)
        horizontalLineTo(11.5f)
        curveTo(11.7761f, 12.0f, 12.0f, 12.2239f, 12.0f, 12.5f)
        verticalLineTo(14.5f)
        curveTo(12.0f, 14.7761f, 11.7761f, 15.0f, 11.5f, 15.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 15.0f, 9.0f, 14.7761f, 9.0f, 14.5f)
        verticalLineTo(12.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.0f, 8.5f)
        curveTo(13.0f, 8.2239f, 13.2239f, 8.0f, 13.5f, 8.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 8.0f, 16.0f, 8.2239f, 16.0f, 8.5f)
        verticalLineTo(10.5f)
        curveTo(16.0f, 10.7761f, 15.7761f, 11.0f, 15.5f, 11.0f)
        horizontalLineTo(13.5f)
        curveTo(13.2239f, 11.0f, 13.0f, 10.7761f, 13.0f, 10.5f)
        verticalLineTo(8.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        lineTo(8.0938f, 5.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(7.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        close()
    }
}
.build()
