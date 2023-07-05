package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val RunGroup.ForceStepOver: IntellijIconData
    get() {
        if (_forceStepOver != null) {
            return _forceStepOver!!
        }
        _forceStepOver = IntellijIconData(imageVector = { ForceStepOverComposable(it) })
        return _forceStepOver!!
    }

private var _forceStepOver: IntellijIconData? = null

private fun ForceStepOverComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ForceStepOver", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.5f, 13.0f)
        lineTo(13.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 13.5f)
        lineTo(14.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 14.0f)
        lineTo(2.5f, 14.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 13.5f)
        lineTo(2.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 13.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFDB3B4B)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(13.4804f, 4.7282f)
        curveTo(13.7565f, 4.7271f, 13.9813f, 4.95f, 13.9824f, 5.2262f)
        lineTo(13.9996f, 9.4688f)
        lineTo(14.0017f, 9.9688f)
        lineTo(13.5017f, 9.9708f)
        lineTo(9.2591f, 9.9881f)
        curveTo(8.9829f, 9.9892f, 8.7582f, 9.7662f, 8.757f, 9.4901f)
        curveTo(8.7559f, 9.214f, 8.9789f, 8.9892f, 9.255f, 8.9881f)
        lineTo(10.3648f, 8.9836f)
        lineTo(7.6231f, 6.672f)
        lineTo(4.8477f, 9.3578f)
        curveTo(4.6492f, 9.5498f, 4.3327f, 9.5447f, 4.1406f, 9.3462f)
        curveTo(3.9486f, 9.1478f, 3.9538f, 8.8312f, 4.1522f, 8.6392f)
        lineTo(7.2523f, 5.6392f)
        lineTo(7.5769f, 5.3251f)
        lineTo(7.9223f, 5.6162f)
        lineTo(11.8601f, 8.9363f)
        curveTo(11.8755f, 8.9492f, 11.8899f, 8.963f, 11.9034f, 8.9773f)
        lineTo(12.9976f, 8.9729f)
        lineTo(12.9928f, 7.7784f)
        lineTo(7.5162f, 2.7896f)
        lineTo(2.8537f, 7.4521f)
        curveTo(2.6584f, 7.6473f, 2.3419f, 7.6473f, 2.1466f, 7.4521f)
        curveTo(1.9513f, 7.2568f, 1.9513f, 6.9402f, 2.1466f, 6.745f)
        lineTo(7.1466f, 1.745f)
        lineTo(7.484f, 1.4075f)
        lineTo(7.8368f, 1.7289f)
        lineTo(12.9872f, 6.4207f)
        lineTo(12.9824f, 5.2303f)
        curveTo(12.9813f, 4.9541f, 13.2042f, 4.7294f, 13.4804f, 4.7282f)
        close()
    }
}
.build()
