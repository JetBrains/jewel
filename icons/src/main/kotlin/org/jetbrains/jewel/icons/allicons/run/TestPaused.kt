package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.TestPaused: IntellijIconData
    get() {
        if (_testPaused != null) {
            return _testPaused!!
        }
        _testPaused = IntellijIconData(imageVector = { TestPausedComposable(it) })
        return _testPaused!!
    }

private var _testPaused: IntellijIconData? = null

private fun TestPausedComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TestPaused", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(11.0f, 2.0f)
        lineTo(11.0f, 2.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 3.0f)
        lineTo(12.0f, 13.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 14.0f)
        lineTo(11.0f, 14.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 13.0f)
        lineTo(10.0f, 3.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 2.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF818594)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.0f, 2.0f)
        lineTo(5.0f, 2.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 3.0f)
        lineTo(6.0f, 13.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 14.0f)
        lineTo(5.0f, 14.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 13.0f)
        lineTo(4.0f, 3.0f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 2.0f)
        close()
    }
}
.build()
