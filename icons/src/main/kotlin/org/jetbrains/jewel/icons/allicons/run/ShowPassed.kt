package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.ShowPassed: IntellijIconData
    get() {
        if (_showPassed != null) {
            return _showPassed!!
        }
        _showPassed = IntellijIconData(name = "ShowPassed",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ShowPassedComposable(it) })
        return _showPassed!!
    }

private var _showPassed: IntellijIconData? = null

private fun ShowPassedComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ShowPassed", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 8.25f)
        lineTo(6.0f, 11.75f)
        lineTo(13.5f, 4.25f)
    }
}
.build()
