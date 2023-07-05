package org.jetbrains.jewel.icons.allicons.general.inspections

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.general.InspectionsGroup

public val InspectionsGroup.InspectionsOK: IntellijIconData
    get() {
        if (_inspectionsOK != null) {
            return _inspectionsOK!!
        }
        _inspectionsOK = IntellijIconData(imageVector = { InspectionsOKComposable(it) })
        return _inspectionsOK!!
    }

private var _inspectionsOK: IntellijIconData? = null

private fun InspectionsOKComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "InspectionsOK", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF55A76A)),
            strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0001f, 7.9999f)
        lineTo(6.0001f, 10.9999f)
        lineTo(12.5001f, 4.4999f)
    }
}
.build()
