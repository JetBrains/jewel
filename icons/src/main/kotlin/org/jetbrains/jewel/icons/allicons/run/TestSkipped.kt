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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.TestSkipped: IntellijIconData
    get() {
        if (_testSkipped != null) {
            return _testSkipped!!
        }
        _testSkipped = IntellijIconData(imageVector = { TestSkippedComposable(it) })
        return _testSkipped!!
    }

private var _testSkipped: IntellijIconData? = null

private fun TestSkippedComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TestSkipped", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFAF0F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(7.6464f, 1.9896f)
        lineTo(1.9895f, 7.6465f)
        curveTo(1.7943f, 7.8417f, 1.7943f, 8.1583f, 1.9895f, 8.3535f)
        lineTo(7.6464f, 14.0104f)
        curveTo(7.8416f, 14.2057f, 8.1582f, 14.2057f, 8.3535f, 14.0104f)
        lineTo(14.0103f, 8.3535f)
        curveTo(14.2056f, 8.1583f, 14.2056f, 7.8417f, 14.0103f, 7.6465f)
        lineTo(8.3535f, 1.9896f)
        curveTo(8.1582f, 1.7943f, 7.8416f, 1.7943f, 7.6464f, 1.9896f)
        close()
        moveTo(0.9289f, 6.5858f)
        curveTo(0.1478f, 7.3668f, 0.1478f, 8.6332f, 0.9289f, 9.4142f)
        lineTo(6.5857f, 15.0711f)
        curveTo(7.3668f, 15.8521f, 8.6331f, 15.8521f, 9.4141f, 15.0711f)
        lineTo(15.071f, 9.4142f)
        curveTo(15.852f, 8.6332f, 15.852f, 7.3668f, 15.071f, 6.5858f)
        lineTo(9.4141f, 0.9289f)
        curveTo(8.6331f, 0.1479f, 7.3668f, 0.1479f, 6.5857f, 0.9289f)
        lineTo(0.9289f, 6.5858f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFFFAF0F)),
            strokeLineWidth = 1.8f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 8.0f)
        horizontalLineTo(10.5f)
    }
}
.build()
