package org.jetbrains.jewel.icons.allicons.general.inspections

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
import org.jetbrains.jewel.icons.allicons.general.InspectionsGroup

public val InspectionsGroup.InspectionsEye: IntellijIconData
    get() {
        if (_inspectionsEye != null) {
            return _inspectionsEye!!
        }
        _inspectionsEye = IntellijIconData(imageVector = { InspectionsEyeComposable(it) })
        return _inspectionsEye!!
    }

private var _inspectionsEye: IntellijIconData? = null

private fun InspectionsEyeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "InspectionsEye", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-1.5f, 0.0f)
        arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
        arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 11.5f)
        curveTo(5.6235f, 11.5f, 3.2737f, 9.9449f, 2.5309f, 8.0f)
        curveTo(3.2737f, 6.0551f, 5.6235f, 4.5f, 8.0f, 4.5f)
        curveTo(10.3765f, 4.5f, 12.7263f, 6.0551f, 13.4691f, 8.0f)
        curveTo(12.7263f, 9.9449f, 10.3765f, 11.5f, 8.0f, 11.5f)
        close()
    }
}
.build()
