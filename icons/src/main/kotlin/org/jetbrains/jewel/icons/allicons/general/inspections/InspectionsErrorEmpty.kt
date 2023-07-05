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

public val InspectionsGroup.InspectionsErrorEmpty: IntellijIconData
    get() {
        if (_inspectionsErrorEmpty != null) {
            return _inspectionsErrorEmpty!!
        }
        _inspectionsErrorEmpty = IntellijIconData(imageVector = {
                InspectionsErrorEmptyComposable(it) })
        return _inspectionsErrorEmpty!!
    }

private var _inspectionsErrorEmpty: IntellijIconData? = null

private fun InspectionsErrorEmptyComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "InspectionsErrorEmpty", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
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
        moveTo(8.75f, 5.25f)
        curveTo(8.75f, 4.8358f, 8.4142f, 4.5f, 8.0f, 4.5f)
        curveTo(7.5858f, 4.5f, 7.25f, 4.8358f, 7.25f, 5.25f)
        verticalLineTo(7.75f)
        curveTo(7.25f, 8.1642f, 7.5858f, 8.5f, 8.0f, 8.5f)
        curveTo(8.4142f, 8.5f, 8.75f, 8.1642f, 8.75f, 7.75f)
        verticalLineTo(5.25f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(2.0f, 8.0f)
        curveTo(2.0f, 4.6863f, 4.6863f, 2.0f, 8.0f, 2.0f)
        curveTo(11.3137f, 2.0f, 14.0f, 4.6863f, 14.0f, 8.0f)
        curveTo(14.0f, 11.3137f, 11.3137f, 14.0f, 8.0f, 14.0f)
        curveTo(4.6863f, 14.0f, 2.0f, 11.3137f, 2.0f, 8.0f)
        close()
        moveTo(8.0f, 3.0f)
        curveTo(5.2386f, 3.0f, 3.0f, 5.2386f, 3.0f, 8.0f)
        curveTo(3.0f, 10.7614f, 5.2386f, 13.0f, 8.0f, 13.0f)
        curveTo(10.7614f, 13.0f, 13.0f, 10.7614f, 13.0f, 8.0f)
        curveTo(13.0f, 5.2386f, 10.7614f, 3.0f, 8.0f, 3.0f)
        close()
    }
}
.build()
