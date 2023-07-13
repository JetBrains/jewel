package org.jetbrains.jewel.icons.allicons.general.inspections

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.general.InspectionsGroup

public val InspectionsGroup.InspectionsTypos: IntellijIconData
    get() {
        if (_inspectionsTypos != null) {
            return _inspectionsTypos!!
        }
        _inspectionsTypos = IntellijIconData(name = "InspectionsTypos",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { InspectionsTyposComposable(it) })
        return _inspectionsTypos!!
    }

private var _inspectionsTypos: IntellijIconData? = null

private fun InspectionsTyposComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "InspectionsTypos", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.greenSolid),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 14.5001f)
        lineTo(4.5f, 12.5001f)
        lineTo(6.5f, 14.5001f)
        lineTo(8.75f, 12.5001f)
        lineTo(11.0f, 14.5001f)
        lineTo(13.0f, 12.5001f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.greenSolid),
            strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 7.0f)
        lineTo(6.0f, 10.0f)
        lineTo(12.5f, 3.5f)
    }
}
.build()
