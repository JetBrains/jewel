package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Star: IntellijIconData
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = IntellijIconData(imageVector = { StarComposable(it) })
        return _star!!
    }

private var _star: IntellijIconData? = null

private fun StarComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Star",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFAF0F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(8.462f, 2.3812f)
        curveTo(8.3844f, 2.1948f, 8.2023f, 2.0732f, 8.0003f, 2.0732f)
        curveTo(7.7983f, 2.0732f, 7.6162f, 2.1948f, 7.5387f, 2.3812f)
        lineTo(6.0689f, 5.9149f)
        lineTo(2.254f, 6.2207f)
        curveTo(2.0527f, 6.2369f, 1.8808f, 6.3726f, 1.8184f, 6.5646f)
        curveTo(1.756f, 6.7567f, 1.8153f, 6.9675f, 1.9687f, 7.0989f)
        lineTo(4.8752f, 9.5886f)
        lineTo(3.9872f, 13.3113f)
        curveTo(3.9404f, 13.5078f, 4.0163f, 13.7131f, 4.1797f, 13.8319f)
        curveTo(4.3431f, 13.9506f, 4.5619f, 13.9593f, 4.7342f, 13.854f)
        lineTo(8.0003f, 11.8591f)
        lineTo(11.2664f, 13.854f)
        curveTo(11.4387f, 13.9593f, 11.6575f, 13.9506f, 11.8209f, 13.8319f)
        curveTo(11.9843f, 13.7131f, 12.0602f, 13.5078f, 12.0134f, 13.3113f)
        lineTo(11.1254f, 9.5886f)
        lineTo(14.0319f, 7.0989f)
        curveTo(14.1853f, 6.9675f, 14.2446f, 6.7567f, 14.1822f, 6.5646f)
        curveTo(14.1198f, 6.3726f, 13.9479f, 6.2369f, 13.7466f, 6.2207f)
        lineTo(9.9317f, 5.9149f)
        lineTo(8.462f, 2.3812f)
        close()
    }
}
.build()
