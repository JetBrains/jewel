package org.jetbrains.jewel.icons.allicons.general.inspections

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.general.InspectionsGroup

public val InspectionsGroup.InspectionsWarning: IntellijIconData
    get() {
        if (_inspectionsWarning != null) {
            return _inspectionsWarning!!
        }
        _inspectionsWarning = IntellijIconData(imageVector = { InspectionsWarningComposable(it) })
        return _inspectionsWarning!!
    }

private var _inspectionsWarning: IntellijIconData? = null

private fun InspectionsWarningComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "InspectionsWarning", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(9.3091f, 2.7658f)
        curveTo(8.7349f, 1.7447f, 7.2651f, 1.7447f, 6.6909f, 2.7658f)
        lineTo(2.195f, 10.7612f)
        curveTo(1.6319f, 11.7627f, 2.3554f, 13.0f, 3.5041f, 13.0f)
        horizontalLineTo(12.4959f)
        curveTo(13.6446f, 13.0f, 14.3681f, 11.7627f, 13.805f, 10.7612f)
        lineTo(9.3091f, 2.7658f)
        close()
        moveTo(8.0f, 4.4869f)
        curveTo(8.4148f, 4.4869f, 8.751f, 4.8232f, 8.751f, 5.2381f)
        verticalLineTo(7.7419f)
        curveTo(8.751f, 8.1568f, 8.4148f, 8.4931f, 8.0f, 8.4931f)
        curveTo(7.5852f, 8.4931f, 7.249f, 8.1568f, 7.249f, 7.7419f)
        verticalLineTo(5.2381f)
        curveTo(7.249f, 4.8232f, 7.5852f, 4.4869f, 8.0f, 4.4869f)
        close()
        moveTo(9.0013f, 10.4962f)
        curveTo(9.0013f, 11.0493f, 8.553f, 11.4977f, 8.0f, 11.4977f)
        curveTo(7.447f, 11.4977f, 6.9987f, 11.0493f, 6.9987f, 10.4962f)
        curveTo(6.9987f, 9.943f, 7.447f, 9.4946f, 8.0f, 9.4946f)
        curveTo(8.553f, 9.4946f, 9.0013f, 9.943f, 9.0013f, 10.4962f)
        close()
    }
}
.build()
