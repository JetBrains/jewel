package org.jetbrains.jewel.icons.allicons.javaee

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
import org.jetbrains.jewel.icons.allicons.JavaeeGroup

public val JavaeeGroup.WebModuleGroup: IntellijIconData
    get() {
        if (_webModuleGroup != null) {
            return _webModuleGroup!!
        }
        _webModuleGroup = IntellijIconData(imageVector = { WebModuleGroupComposable(it) })
        return _webModuleGroup!!
    }

private var _webModuleGroup: IntellijIconData? = null

private fun WebModuleGroupComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "WebModuleGroup", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.0f, 2.0f)
        curveTo(1.0f, 1.4477f, 1.4477f, 1.0f, 2.0f, 1.0f)
        horizontalLineTo(6.0f)
        curveTo(6.5523f, 1.0f, 7.0f, 1.4477f, 7.0f, 2.0f)
        verticalLineTo(6.0f)
        curveTo(7.0f, 6.5523f, 6.5523f, 7.0f, 6.0f, 7.0f)
        horizontalLineTo(2.0f)
        curveTo(1.4477f, 7.0f, 1.0f, 6.5523f, 1.0f, 6.0f)
        verticalLineTo(2.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.0f, 9.0f)
        curveTo(1.0f, 8.4477f, 1.4477f, 8.0f, 2.0f, 8.0f)
        horizontalLineTo(6.0f)
        curveTo(6.5523f, 8.0f, 7.0f, 8.4477f, 7.0f, 9.0f)
        verticalLineTo(13.0f)
        curveTo(7.0f, 13.5523f, 6.5523f, 14.0f, 6.0f, 14.0f)
        horizontalLineTo(2.0f)
        curveTo(1.4477f, 14.0f, 1.0f, 13.5523f, 1.0f, 13.0f)
        verticalLineTo(9.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(9.0f, 1.0f)
        curveTo(8.4477f, 1.0f, 8.0f, 1.4477f, 8.0f, 2.0f)
        verticalLineTo(6.0f)
        curveTo(8.0f, 6.5523f, 8.4477f, 7.0f, 9.0f, 7.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 7.0f, 14.0f, 6.5523f, 14.0f, 6.0f)
        verticalLineTo(2.0f)
        curveTo(14.0f, 1.4477f, 13.5523f, 1.0f, 13.0f, 1.0f)
        horizontalLineTo(9.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(2.0f, 1.0f)
        curveTo(1.4477f, 1.0f, 1.0f, 1.4477f, 1.0f, 2.0f)
        verticalLineTo(6.0f)
        curveTo(1.0f, 6.5523f, 1.4477f, 7.0f, 2.0f, 7.0f)
        horizontalLineTo(6.0f)
        curveTo(6.5523f, 7.0f, 7.0f, 6.5523f, 7.0f, 6.0f)
        verticalLineTo(2.0f)
        curveTo(7.0f, 1.4477f, 6.5523f, 1.0f, 6.0f, 1.0f)
        horizontalLineTo(2.0f)
        close()
        moveTo(6.0f, 2.0f)
        horizontalLineTo(2.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(2.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(2.0f, 8.0f)
        curveTo(1.4477f, 8.0f, 1.0f, 8.4477f, 1.0f, 9.0f)
        verticalLineTo(13.0f)
        curveTo(1.0f, 13.5523f, 1.4477f, 14.0f, 2.0f, 14.0f)
        horizontalLineTo(6.0f)
        curveTo(6.5523f, 14.0f, 7.0f, 13.5523f, 7.0f, 13.0f)
        verticalLineTo(9.0f)
        curveTo(7.0f, 8.4477f, 6.5523f, 8.0f, 6.0f, 8.0f)
        horizontalLineTo(2.0f)
        close()
        moveTo(6.0f, 9.0f)
        horizontalLineTo(2.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(6.0f)
        verticalLineTo(9.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(8.0f, 2.0f)
        curveTo(8.0f, 1.4477f, 8.4477f, 1.0f, 9.0f, 1.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 1.0f, 14.0f, 1.4477f, 14.0f, 2.0f)
        verticalLineTo(6.0f)
        curveTo(14.0f, 6.5523f, 13.5523f, 7.0f, 13.0f, 7.0f)
        horizontalLineTo(9.0f)
        curveTo(8.4477f, 7.0f, 8.0f, 6.5523f, 8.0f, 6.0f)
        verticalLineTo(2.0f)
        close()
        moveTo(9.0f, 2.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(6.0f)
        horizontalLineTo(9.0f)
        verticalLineTo(2.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.7127f, 14.7107f)
        curveTo(10.4717f, 14.1134f, 10.3093f, 13.3479f, 10.2631f, 12.5f)
        horizontalLineTo(9.041f)
        curveTo(9.2053f, 13.4792f, 9.844f, 14.2976f, 10.7127f, 14.7107f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.6783f, 14.4276f)
        curveTo(11.4715f, 13.955f, 11.3129f, 13.285f, 11.2647f, 12.5f)
        horizontalLineTo(12.7343f)
        curveTo(12.6861f, 13.285f, 12.5276f, 13.955f, 12.3208f, 14.4276f)
        curveTo(12.202f, 14.6991f, 12.085f, 14.8652f, 11.9995f, 14.9529f)
        curveTo(11.9141f, 14.8652f, 11.797f, 14.6991f, 11.6783f, 14.4276f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.6783f, 9.5724f)
        curveTo(11.4715f, 10.0449f, 11.3129f, 10.715f, 11.2647f, 11.5f)
        horizontalLineTo(12.7343f)
        curveTo(12.6861f, 10.715f, 12.5276f, 10.0449f, 12.3208f, 9.5724f)
        curveTo(12.202f, 9.3009f, 12.085f, 9.1348f, 11.9995f, 9.0471f)
        curveTo(11.9141f, 9.1348f, 11.797f, 9.3009f, 11.6783f, 9.5724f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.2864f, 14.7107f)
        curveTo(13.5274f, 14.1134f, 13.6897f, 13.3479f, 13.736f, 12.5f)
        horizontalLineTo(14.9581f)
        curveTo(14.7938f, 13.4792f, 14.1551f, 14.2976f, 13.2864f, 14.7107f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.736f, 11.5f)
        horizontalLineTo(14.9581f)
        curveTo(14.7938f, 10.5207f, 14.1551f, 9.7024f, 13.2864f, 9.2892f)
        curveTo(13.5274f, 9.8866f, 13.6897f, 10.6521f, 13.736f, 11.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(9.041f, 11.5f)
        horizontalLineTo(10.2631f)
        curveTo(10.3093f, 10.6521f, 10.4717f, 9.8866f, 10.7127f, 9.2892f)
        curveTo(9.844f, 9.7024f, 9.2053f, 10.5207f, 9.041f, 11.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(16.0f, 12.0f)
        curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
        curveTo(9.7909f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
        curveTo(8.0f, 14.2091f, 9.7909f, 16.0f, 12.0f, 16.0f)
        curveTo(14.2091f, 16.0f, 16.0f, 14.2091f, 16.0f, 12.0f)
        close()
        moveTo(10.2635f, 12.5f)
        curveTo(10.3098f, 13.3479f, 10.4722f, 14.1134f, 10.7131f, 14.7107f)
        curveTo(9.8444f, 14.2976f, 9.2058f, 13.4792f, 9.0415f, 12.5f)
        horizontalLineTo(10.2635f)
        close()
        moveTo(11.2652f, 12.5f)
        curveTo(11.3134f, 13.285f, 11.472f, 13.955f, 11.6787f, 14.4276f)
        curveTo(11.7975f, 14.6991f, 11.9146f, 14.8652f, 12.0f, 14.9529f)
        curveTo(12.0854f, 14.8652f, 12.2025f, 14.6991f, 12.3213f, 14.4276f)
        curveTo(12.528f, 13.955f, 12.6866f, 13.285f, 12.7348f, 12.5f)
        horizontalLineTo(11.2652f)
        close()
        moveTo(12.7348f, 11.5f)
        horizontalLineTo(11.2652f)
        curveTo(11.3134f, 10.715f, 11.472f, 10.045f, 11.6787f, 9.5724f)
        curveTo(11.7975f, 9.3009f, 11.9146f, 9.1348f, 12.0f, 9.0471f)
        curveTo(12.0854f, 9.1348f, 12.2025f, 9.3009f, 12.3213f, 9.5724f)
        curveTo(12.528f, 10.045f, 12.6866f, 10.715f, 12.7348f, 11.5f)
        close()
        moveTo(13.7365f, 12.5f)
        curveTo(13.6902f, 13.3479f, 13.5278f, 14.1134f, 13.2869f, 14.7107f)
        curveTo(14.1556f, 14.2976f, 14.7942f, 13.4792f, 14.9585f, 12.5f)
        horizontalLineTo(13.7365f)
        close()
        moveTo(14.9585f, 11.5f)
        horizontalLineTo(13.7365f)
        curveTo(13.6902f, 10.6521f, 13.5278f, 9.8866f, 13.2869f, 9.2893f)
        curveTo(14.1556f, 9.7024f, 14.7942f, 10.5208f, 14.9585f, 11.5f)
        close()
        moveTo(10.2635f, 11.5f)
        horizontalLineTo(9.0415f)
        curveTo(9.2058f, 10.5208f, 9.8444f, 9.7024f, 10.7131f, 9.2893f)
        curveTo(10.4722f, 9.8866f, 10.3098f, 10.6521f, 10.2635f, 11.5f)
        close()
    }
}
.build()
