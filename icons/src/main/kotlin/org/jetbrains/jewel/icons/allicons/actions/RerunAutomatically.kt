package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.RerunAutomatically: IntellijIconData
    get() {
        if (_rerunAutomatically != null) {
            return _rerunAutomatically!!
        }
        _rerunAutomatically = IntellijIconData(name = "RerunAutomatically",size = DpSize(height =
                16.0.dp, width = 17.0.dp),imageVector = { RerunAutomaticallyComposable(it) })
        return _rerunAutomatically!!
    }

private var _rerunAutomatically: IntellijIconData? = null

private fun RerunAutomaticallyComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "RerunAutomatically", defaultWidth = 17.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 17.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF208A3C)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
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
    path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 9.5023f)
        curveTo(10.0f, 9.1097f, 10.4317f, 8.8702f, 10.7647f, 9.0781f)
        lineTo(14.7667f, 11.5759f)
        curveTo(15.0804f, 11.7717f, 15.0804f, 12.2285f, 14.7667f, 12.4243f)
        lineTo(10.7647f, 14.9221f)
        curveTo(10.4317f, 15.13f, 10.0f, 14.8905f, 10.0f, 14.4979f)
        verticalLineTo(9.5023f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.5f, 2.0f)
        curveTo(10.2239f, 2.0f, 10.0f, 2.2239f, 10.0f, 2.5f)
        verticalLineTo(3.089f)
        curveTo(9.9999f, 3.0959f, 9.9999f, 3.1027f, 10.0f, 3.1095f)
        verticalLineTo(5.5f)
        curveTo(10.0f, 5.7761f, 10.2239f, 6.0f, 10.5f, 6.0f)
        curveTo(10.7761f, 6.0f, 11.0f, 5.7761f, 11.0f, 5.5f)
        verticalLineTo(3.9995f)
        curveTo(12.215f, 4.9122f, 13.0f, 6.3647f, 13.0f, 8.0f)
        curveTo(13.0f, 8.0383f, 12.9996f, 8.0765f, 12.9987f, 8.1146f)
        lineTo(13.958f, 8.7134f)
        curveTo(13.9857f, 8.4794f, 14.0f, 8.2414f, 14.0f, 8.0f)
        curveTo(14.0f, 5.9123f, 12.9337f, 4.0744f, 11.3177f, 3.0f)
        horizontalLineTo(13.5f)
        curveTo(13.7761f, 3.0f, 14.0f, 2.7761f, 14.0f, 2.5f)
        curveTo(14.0f, 2.2239f, 13.7761f, 2.0f, 13.5f, 2.0f)
        horizontalLineTo(10.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.0f, 10.5f)
        curveTo(6.0f, 10.2239f, 5.7761f, 10.0f, 5.5f, 10.0f)
        curveTo(5.2239f, 10.0f, 5.0f, 10.2239f, 5.0f, 10.5f)
        verticalLineTo(12.0004f)
        curveTo(3.785f, 11.0878f, 3.0f, 9.6353f, 3.0f, 8.0f)
        curveTo(3.0f, 5.5495f, 4.7633f, 3.5099f, 7.0903f, 3.0824f)
        curveTo(7.3619f, 3.0326f, 7.5417f, 2.7719f, 7.4918f, 2.5003f)
        curveTo(7.4419f, 2.2287f, 7.1813f, 2.049f, 6.9097f, 2.0989f)
        curveTo(4.1165f, 2.6119f, 2.0f, 5.0583f, 2.0f, 8.0f)
        curveTo(2.0f, 10.0877f, 3.0663f, 11.9256f, 4.6824f, 13.0f)
        horizontalLineTo(2.5f)
        curveTo(2.2239f, 13.0f, 2.0f, 13.2239f, 2.0f, 13.5f)
        curveTo(2.0f, 13.7761f, 2.2239f, 14.0f, 2.5f, 14.0f)
        horizontalLineTo(5.5f)
        curveTo(5.7761f, 14.0f, 6.0f, 13.7761f, 6.0f, 13.5f)
        verticalLineTo(12.911f)
        curveTo(6.0001f, 12.9041f, 6.0001f, 12.8972f, 6.0f, 12.8904f)
        verticalLineTo(10.5f)
        close()
    }
}
.build()
