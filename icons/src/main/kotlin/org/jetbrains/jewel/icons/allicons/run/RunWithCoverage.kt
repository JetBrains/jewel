package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.RunWithCoverage: IntellijIconData
    get() {
        if (_runWithCoverage != null) {
            return _runWithCoverage!!
        }
        _runWithCoverage = IntellijIconData(imageVector = { RunWithCoverageComposable(it) })
        return _runWithCoverage!!
    }

private var _runWithCoverage: IntellijIconData? = null

private fun RunWithCoverageComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "RunWithCoverage", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    group {
        path(fill = SolidColor(Color(0xFF208A3C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                EvenOdd) {
            moveTo(9.0f, 9.5021f)
            curveTo(9.0f, 8.3244f, 10.2951f, 7.6061f, 11.2942f, 8.2297f)
            lineTo(15.2962f, 10.7275f)
            curveTo(16.2372f, 11.3149f, 16.2372f, 12.6851f, 15.2962f, 13.2725f)
            lineTo(11.2942f, 15.7703f)
            curveTo(10.2951f, 16.3939f, 9.0f, 15.6756f, 9.0f, 14.4978f)
            verticalLineTo(9.5021f)
            close()
            moveTo(10.7647f, 9.078f)
            curveTo(10.4317f, 8.8701f, 10.0f, 9.1096f, 10.0f, 9.5021f)
            verticalLineTo(14.4978f)
            curveTo(10.0f, 14.8904f, 10.4317f, 15.1298f, 10.7647f, 14.922f)
            lineTo(14.7667f, 12.4241f)
            curveTo(15.0804f, 12.2284f, 15.0804f, 11.7716f, 14.7667f, 11.5758f)
            lineTo(10.7647f, 9.078f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(10.0f, 9.5021f)
            curveTo(10.0f, 9.1096f, 10.4317f, 8.8701f, 10.7647f, 9.078f)
            lineTo(14.7667f, 11.5758f)
            curveTo(15.0804f, 11.7716f, 15.0804f, 12.2284f, 14.7667f, 12.4241f)
            lineTo(10.7647f, 14.922f)
            curveTo(10.4317f, 15.1298f, 10.0f, 14.8904f, 10.0f, 14.4978f)
            verticalLineTo(9.5021f)
            close()
        }
        path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(14.0f, 3.0025f)
            lineTo(8.0f, 0.457f)
            lineTo(2.0f, 3.0025f)
            verticalLineTo(8.7779f)
            curveTo(2.0f, 10.5438f, 2.8925f, 11.8352f, 4.0324f, 12.8568f)
            curveTo(4.8708f, 13.6082f, 5.8918f, 14.2526f, 6.8286f, 14.8439f)
            curveTo(7.1398f, 15.0402f, 7.4418f, 15.2308f, 7.7246f, 15.4175f)
            lineTo(8.0f, 15.5992f)
            lineTo(8.0f, 14.4032f)
            curveTo(7.7689f, 14.2539f, 7.5355f, 14.1065f, 7.3025f, 13.9594f)
            curveTo(6.3847f, 13.3799f, 5.4699f, 12.8023f, 4.6998f, 12.1121f)
            curveTo(3.679f, 11.1973f, 3.0f, 10.1554f, 3.0f, 8.7779f)
            verticalLineTo(3.6645f)
            lineTo(8.0f, 1.5433f)
            lineTo(13.0f, 3.6645f)
            verticalLineTo(8.1174f)
            lineTo(14.0f, 8.7415f)
            verticalLineTo(3.0025f)
            close()
        }
    }
}
.build()
