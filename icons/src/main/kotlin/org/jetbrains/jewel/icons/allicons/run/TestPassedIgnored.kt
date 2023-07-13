package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.TestPassedIgnored: IntellijIconData
    get() {
        if (_testPassedIgnored != null) {
            return _testPassedIgnored!!
        }
        _testPassedIgnored = IntellijIconData(name = "TestPassedIgnored",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { TestPassedIgnoredComposable(it) })
        return _testPassedIgnored!!
    }

private var _testPassedIgnored: IntellijIconData? = null

private fun TestPassedIgnoredComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "TestPassedIgnored", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    group {
        path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF55A76A)),
                strokeLineWidth = 2.2f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero) {
            moveTo(2.5f, 7.25f)
            lineTo(6.0f, 10.75f)
            lineTo(13.5f, 3.25f)
        }
        path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                EvenOdd) {
            moveTo(16.0f, 12.5f)
            curveTo(16.0f, 14.433f, 14.433f, 16.0f, 12.5f, 16.0f)
            curveTo(10.567f, 16.0f, 9.0f, 14.433f, 9.0f, 12.5f)
            curveTo(9.0f, 10.567f, 10.567f, 9.0f, 12.5f, 9.0f)
            curveTo(14.433f, 9.0f, 16.0f, 10.567f, 16.0f, 12.5f)
            close()
            moveTo(15.0f, 12.5f)
            curveTo(15.0f, 13.8807f, 13.8807f, 15.0f, 12.5f, 15.0f)
            curveTo(11.9905f, 15.0f, 11.5165f, 14.8476f, 11.1213f, 14.5858f)
            lineTo(14.5858f, 11.1213f)
            curveTo(14.8476f, 11.5165f, 15.0f, 11.9905f, 15.0f, 12.5f)
            close()
            moveTo(10.4142f, 13.8787f)
            lineTo(13.8787f, 10.4142f)
            curveTo(13.4835f, 10.1524f, 13.0095f, 10.0f, 12.5f, 10.0f)
            curveTo(11.1193f, 10.0f, 10.0f, 11.1193f, 10.0f, 12.5f)
            curveTo(10.0f, 13.0095f, 10.1524f, 13.4835f, 10.4142f, 13.8787f)
            close()
        }
    }
}
.build()
