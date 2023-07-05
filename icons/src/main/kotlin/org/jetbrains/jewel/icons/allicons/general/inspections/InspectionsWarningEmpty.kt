package org.jetbrains.jewel.icons.allicons.general.inspections

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
import org.jetbrains.jewel.icons.allicons.general.InspectionsGroup

public val InspectionsGroup.InspectionsWarningEmpty: IntellijIconData
    get() {
        if (_inspectionsWarningEmpty != null) {
            return _inspectionsWarningEmpty!!
        }
        _inspectionsWarningEmpty = IntellijIconData(imageVector = {
                InspectionsWarningEmptyComposable(it) })
        return _inspectionsWarningEmpty!!
    }

private var _inspectionsWarningEmpty: IntellijIconData? = null

private fun InspectionsWarningEmptyComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "InspectionsWarningEmpty", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.0f, 10.5f)
        curveTo(9.0f, 11.0523f, 8.5523f, 11.5f, 8.0f, 11.5f)
        curveTo(7.4477f, 11.5f, 7.0f, 11.0523f, 7.0f, 10.5f)
        curveTo(7.0f, 9.9477f, 7.4477f, 9.5f, 8.0f, 9.5f)
        curveTo(8.5523f, 9.5f, 9.0f, 9.9477f, 9.0f, 10.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.75f, 5.75f)
        curveTo(8.75f, 5.3358f, 8.4142f, 5.0f, 8.0f, 5.0f)
        curveTo(7.5858f, 5.0f, 7.25f, 5.3358f, 7.25f, 5.75f)
        verticalLineTo(7.75f)
        curveTo(7.25f, 8.1642f, 7.5858f, 8.5f, 8.0f, 8.5f)
        curveTo(8.4142f, 8.5f, 8.75f, 8.1642f, 8.75f, 7.75f)
        verticalLineTo(5.75f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(9.3074f, 2.7815f)
        curveTo(8.7339f, 1.762f, 7.266f, 1.762f, 6.6926f, 2.7815f)
        lineTo(2.2025f, 10.7646f)
        curveTo(1.6401f, 11.7646f, 2.3627f, 13.0f, 3.5099f, 13.0f)
        horizontalLineTo(12.49f)
        curveTo(13.6372f, 13.0f, 14.3598f, 11.7646f, 13.7974f, 10.7646f)
        lineTo(9.3074f, 2.7815f)
        close()
        moveTo(12.9258f, 11.2549f)
        lineTo(8.4358f, 3.2717f)
        curveTo(8.2446f, 2.9319f, 7.7553f, 2.9319f, 7.5642f, 3.2717f)
        lineTo(3.0741f, 11.2549f)
        curveTo(2.8867f, 11.5882f, 3.1275f, 12.0f, 3.5099f, 12.0f)
        horizontalLineTo(12.49f)
        curveTo(12.8724f, 12.0f, 13.1133f, 11.5882f, 12.9258f, 11.2549f)
        close()
    }
}
.build()
