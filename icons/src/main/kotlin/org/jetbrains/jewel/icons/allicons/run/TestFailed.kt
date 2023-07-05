package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.TestFailed: IntellijIconData
    get() {
        if (_testFailed != null) {
            return _testFailed!!
        }
        _testFailed = IntellijIconData(imageVector = { TestFailedComposable(it) })
        return _testFailed!!
    }

private var _testFailed: IntellijIconData? = null

private fun TestFailedComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TestFailed", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(8.0f, 15.0f)
        curveTo(11.866f, 15.0f, 15.0f, 11.866f, 15.0f, 8.0f)
        curveTo(15.0f, 4.134f, 11.866f, 1.0f, 8.0f, 1.0f)
        curveTo(4.134f, 1.0f, 1.0f, 4.134f, 1.0f, 8.0f)
        curveTo(1.0f, 11.866f, 4.134f, 15.0f, 8.0f, 15.0f)
        close()
        moveTo(5.8159f, 4.6843f)
        curveTo(5.5035f, 4.3719f, 4.9969f, 4.3719f, 4.6845f, 4.6843f)
        curveTo(4.3721f, 4.9967f, 4.3721f, 5.5033f, 4.6845f, 5.8157f)
        lineTo(6.8688f, 8.0f)
        lineTo(4.6845f, 10.1843f)
        curveTo(4.3721f, 10.4967f, 4.3721f, 11.0033f, 4.6845f, 11.3157f)
        curveTo(4.9969f, 11.6281f, 5.5035f, 11.6281f, 5.8159f, 11.3157f)
        lineTo(8.0002f, 9.1314f)
        lineTo(10.1845f, 11.3157f)
        curveTo(10.4969f, 11.6281f, 11.0035f, 11.6281f, 11.3159f, 11.3157f)
        curveTo(11.6283f, 11.0033f, 11.6283f, 10.4967f, 11.3159f, 10.1843f)
        lineTo(9.1316f, 8.0f)
        lineTo(11.3159f, 5.8157f)
        curveTo(11.6283f, 5.5033f, 11.6283f, 4.9967f, 11.3159f, 4.6843f)
        curveTo(11.0035f, 4.3719f, 10.4969f, 4.3719f, 10.1845f, 4.6843f)
        lineTo(8.0002f, 6.8686f)
        lineTo(5.8159f, 4.6843f)
        close()
    }
}
.build()
