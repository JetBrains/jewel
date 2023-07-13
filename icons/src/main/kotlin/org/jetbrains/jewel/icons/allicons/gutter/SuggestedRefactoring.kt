package org.jetbrains.jewel.icons.allicons.gutter

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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.SuggestedRefactoring: IntellijIconData
    get() {
        if (_suggestedRefactoring != null) {
            return _suggestedRefactoring!!
        }
        _suggestedRefactoring = IntellijIconData(name = "SuggestedRefactoring",size = DpSize(height
                = 14.0.dp, width = 14.0.dp),imageVector = { SuggestedRefactoringComposable(it) })
        return _suggestedRefactoring!!
    }

private var _suggestedRefactoring: IntellijIconData? = null

private fun SuggestedRefactoringComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "SuggestedRefactoring", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(4.0f, 14.0f)
        verticalLineTo(11.0f)
        lineTo(10.7031f, 4.2969f)
        curveTo(11.0937f, 3.9063f, 11.7268f, 3.9063f, 12.1173f, 4.2969f)
        lineTo(13.7031f, 5.8827f)
        curveTo(14.0937f, 6.2732f, 14.0937f, 6.9064f, 13.7031f, 7.2969f)
        lineTo(7.0f, 14.0f)
        horizontalLineTo(4.0f)
        close()
        moveTo(5.0f, 13.0f)
        verticalLineTo(11.4142f)
        lineTo(9.3535f, 7.0607f)
        lineTo(10.9393f, 8.6465f)
        lineTo(6.5858f, 13.0f)
        horizontalLineTo(5.0f)
        close()
        moveTo(11.6464f, 7.9394f)
        lineTo(12.996f, 6.5898f)
        lineTo(11.4102f, 5.004f)
        lineTo(10.0607f, 6.3536f)
        lineTo(11.6464f, 7.9394f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(1.0f, 9.0f)
        horizontalLineTo(0.0f)
        verticalLineTo(0.0f)
        horizontalLineTo(3.0349f)
        curveTo(3.7366f, 0.0f, 4.3126f, 0.1199f, 4.7628f, 0.3596f)
        curveTo(5.2131f, 0.5964f, 5.5464f, 0.9224f, 5.7628f, 1.3376f)
        curveTo(5.9791f, 1.7528f, 6.0873f, 2.225f, 6.0873f, 2.7542f)
        curveTo(6.0873f, 3.2834f, 5.9791f, 3.7527f, 5.7628f, 4.162f)
        curveTo(5.5464f, 4.5713f, 5.2145f, 4.8929f, 4.7672f, 5.1268f)
        curveTo(4.6558f, 5.1844f, 4.5366f, 5.2347f, 4.4097f, 5.2779f)
        lineTo(5.7927f, 7.7931f)
        lineTo(4.9799f, 8.6059f)
        lineTo(3.2822f, 5.4689f)
        curveTo(3.2072f, 5.4718f, 3.1306f, 5.4733f, 3.0524f, 5.4733f)
        horizontalLineTo(1.0f)
        verticalLineTo(9.0f)
        close()
        moveTo(3.0173f, 4.4909f)
        horizontalLineTo(1.0f)
        verticalLineTo(1.0f)
        horizontalLineTo(2.9998f)
        curveTo(3.4851f, 1.0f, 3.8755f, 1.0394f, 4.1708f, 1.1885f)
        curveTo(4.4661f, 1.3347f, 4.681f, 1.5423f, 4.8155f, 1.8113f)
        curveTo(4.9499f, 2.0803f, 5.0172f, 2.3946f, 5.0172f, 2.7542f)
        curveTo(5.0172f, 3.1138f, 4.9499f, 3.4237f, 4.8155f, 3.6839f)
        curveTo(4.6839f, 3.9412f, 4.4704f, 4.1401f, 4.1751f, 4.2804f)
        curveTo(3.8828f, 4.4207f, 3.4968f, 4.4909f, 3.0173f, 4.4909f)
        close()
    }
}
.build()
