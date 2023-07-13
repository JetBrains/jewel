package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.TestIgnored: IntellijIconData
    get() {
        if (_testIgnored != null) {
            return _testIgnored!!
        }
        _testIgnored = IntellijIconData(name = "TestIgnored",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { TestIgnoredComposable(it) })
        return _testIgnored!!
    }

private var _testIgnored: IntellijIconData? = null

private fun TestIgnoredComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TestIgnored", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.25f, 0.0f)
        arcToRelative(6.25f, 6.25f, 0.0f, true, true, 12.5f, 0.0f)
        arcToRelative(6.25f, 6.25f, 0.0f, true, true, -12.5f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.5f, 12.5f)
        lineTo(12.5f, 3.5f)
    }
}
.build()
