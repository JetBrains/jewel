package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.UnloadedModule: IntellijIconData
    get() {
        if (_unloadedModule != null) {
            return _unloadedModule!!
        }
        _unloadedModule = IntellijIconData(imageVector = { UnloadedModuleComposable(it) })
        return _unloadedModule!!
    }

private var _unloadedModule: IntellijIconData? = null

private fun UnloadedModuleComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "UnloadedModule", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFEDF3FF)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.0f, 9.5f)
        lineTo(14.0f, 9.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 11.0f)
        lineTo(15.5f, 14.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 15.5f)
        lineTo(11.0f, 15.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 14.0f)
        lineTo(9.5f, 11.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 9.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFFFFF4EB)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(1.0f, 3.8667f)
        curveTo(1.0f, 2.8357f, 1.7835f, 2.0f, 2.75f, 2.0f)
        horizontalLineTo(6.0382f)
        curveTo(6.2987f, 2.0f, 6.5489f, 2.1016f, 6.7356f, 2.2833f)
        lineTo(8.5f, 4.0f)
        lineTo(13.0f, 4.0f)
        curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
        verticalLineTo(8.1707f)
        curveTo(14.6872f, 8.0602f, 14.3506f, 8.0f, 14.0f, 8.0f)
        horizontalLineTo(11.0f)
        curveTo(9.3432f, 8.0f, 8.0f, 9.3432f, 8.0f, 11.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(3.8667f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(7.8026f, 4.7167f)
        lineTo(8.0938f, 5.0f)
        horizontalLineTo(8.5f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(8.0f)
        curveTo(14.3506f, 8.0f, 14.6872f, 8.0602f, 15.0f, 8.1707f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        lineTo(7.8026f, 4.7167f)
        close()
    }
}
.build()
