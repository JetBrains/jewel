package org.jetbrains.jewel.icons.allicons.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunconfigurationsGroup

public val RunconfigurationsGroup.Junit: IntellijIconData
    get() {
        if (_junit != null) {
            return _junit!!
        }
        _junit = IntellijIconData(imageVector = { JunitComposable(it) })
        return _junit!!
    }

private var _junit: IntellijIconData? = null

private fun JunitComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Junit",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFF7F7)), stroke = SolidColor(Color(0xFFDB3B4B)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = EvenOdd) {
        moveTo(1.3852f, 8.4191f)
        curveTo(1.1754f, 8.1901f, 1.1749f, 7.839f, 1.3842f, 7.6095f)
        lineTo(5.4565f, 3.1442f)
        curveTo(5.8257f, 2.7393f, 6.4999f, 3.0005f, 6.4999f, 3.5484f)
        lineTo(6.5f, 12.4571f)
        curveTo(6.5f, 13.0044f, 5.8273f, 13.2659f, 5.4575f, 12.8625f)
        lineTo(1.3852f, 8.4191f)
        close()
    }
    path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = SolidColor(Color(0xFF208A3C)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = EvenOdd) {
        moveTo(14.6284f, 7.5946f)
        curveTo(14.8386f, 7.824f, 14.8386f, 8.176f, 14.6284f, 8.4053f)
        lineTo(10.5424f, 12.8628f)
        curveTo(10.1726f, 13.2662f, 9.5f, 13.0046f, 9.5f, 12.4574f)
        lineTo(9.5f, 3.5426f)
        curveTo(9.5f, 2.9954f, 10.1727f, 2.7338f, 10.5425f, 3.1372f)
        lineTo(14.6284f, 7.5946f)
        close()
    }
}
.build()
