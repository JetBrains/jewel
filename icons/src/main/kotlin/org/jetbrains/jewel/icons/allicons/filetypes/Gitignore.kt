package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Gitignore: IntellijIconData
    get() {
        if (_gitignore != null) {
            return _gitignore!!
        }
        _gitignore = IntellijIconData(name = "Gitignore",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { GitignoreComposable(it) })
        return _gitignore!!
    }

private var _gitignore: IntellijIconData? = null

private fun GitignoreComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Gitignore", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFF34E29)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(8.7071f, 1.3048f)
        curveTo(8.3166f, 0.9142f, 7.6834f, 0.9142f, 7.2929f, 1.3048f)
        lineTo(6.3807f, 2.217f)
        lineTo(7.3353f, 3.1716f)
        curveTo(7.8371f, 2.8747f, 8.4946f, 2.9419f, 8.9259f, 3.3732f)
        curveTo(9.3572f, 3.8045f, 9.4244f, 4.462f, 9.1274f, 4.9637f)
        lineTo(11.0361f, 6.8724f)
        curveTo(11.5378f, 6.5756f, 12.1952f, 6.6428f, 12.6264f, 7.074f)
        curveTo(13.1373f, 7.5849f, 13.1373f, 8.4131f, 12.6264f, 8.924f)
        curveTo(12.1155f, 9.4348f, 11.2873f, 9.4348f, 10.7764f, 8.924f)
        curveTo(10.3457f, 8.4932f, 10.2781f, 7.8368f, 10.5738f, 7.3353f)
        lineTo(8.6644f, 5.4259f)
        curveTo(8.5579f, 5.4886f, 8.4445f, 5.535f, 8.3277f, 5.565f)
        verticalLineTo(10.4334f)
        curveTo(8.5467f, 10.4898f, 8.7538f, 10.6037f, 8.9253f, 10.7751f)
        curveTo(9.4361f, 11.286f, 9.4361f, 12.1143f, 8.9253f, 12.6251f)
        curveTo(8.4144f, 13.136f, 7.5862f, 13.136f, 7.0753f, 12.6251f)
        curveTo(6.5645f, 12.1143f, 6.5645f, 11.286f, 7.0753f, 10.7751f)
        curveTo(7.2469f, 10.6036f, 7.4543f, 10.4896f, 7.6735f, 10.4333f)
        verticalLineTo(5.5648f)
        curveTo(7.4545f, 5.5085f, 7.2474f, 5.3946f, 7.0759f, 5.2231f)
        curveTo(6.6452f, 4.7924f, 6.5777f, 4.1362f, 6.8731f, 3.6347f)
        lineTo(5.9181f, 2.6796f)
        lineTo(1.3053f, 7.2924f)
        curveTo(0.9148f, 7.6829f, 0.9148f, 8.3161f, 1.3053f, 8.7066f)
        lineTo(7.2929f, 14.6942f)
        curveTo(7.6834f, 15.0847f, 8.3166f, 15.0847f, 8.7071f, 14.6942f)
        lineTo(14.6947f, 8.7066f)
        curveTo(15.0852f, 8.3161f, 15.0852f, 7.6829f, 14.6947f, 7.2924f)
        lineTo(8.7071f, 1.3048f)
        close()
    }
}
.build()
