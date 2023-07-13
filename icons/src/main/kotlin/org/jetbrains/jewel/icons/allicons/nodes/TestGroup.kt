package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.TestGroup: IntellijIconData
    get() {
        if (_testGroup != null) {
            return _testGroup!!
        }
        _testGroup = IntellijIconData(name = "TestGroup",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { TestGroupComposable(it) })
        return _testGroup!!
    }

private var _testGroup: IntellijIconData? = null

private fun TestGroupComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "TestGroup", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.4718f, 15.9999f)
        curveTo(14.1968f, 15.9999f, 13.9475f, 15.9413f, 13.7238f, 15.8239f)
        curveTo(13.5001f, 15.7029f, 13.3241f, 15.5379f, 13.1958f, 15.3289f)
        curveTo(13.0675f, 15.1199f, 13.0033f, 14.8853f, 13.0033f, 14.6249f)
        lineTo(12.9978f, 11.2424f)
        horizontalLineTo(12.0078f)
        lineTo(12.0133f, 10.3679f)
        horizontalLineTo(12.6293f)
        curveTo(12.7686f, 10.3679f, 12.8805f, 10.3239f, 12.9648f, 10.2359f)
        curveTo(13.0528f, 10.1479f, 13.0968f, 10.0361f, 13.0968f, 9.9004f)
        verticalLineTo(8.9929f)
        horizontalLineTo(13.9988f)
        verticalLineTo(10.3679f)
        horizontalLineTo(15.3573f)
        lineTo(15.3518f, 11.2424f)
        horizontalLineTo(13.9933f)
        lineTo(13.9988f, 14.5369f)
        curveTo(13.9988f, 14.7056f, 14.0538f, 14.8468f, 14.1638f, 14.9604f)
        curveTo(14.2775f, 15.0704f, 14.4186f, 15.1254f, 14.5873f, 15.1254f)
        horizontalLineTo(15.3518f)
        verticalLineTo(15.9999f)
        horizontalLineTo(14.4718f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0f, 3.8667f)
        curveTo(1.0f, 2.8357f, 1.7835f, 2.0f, 2.75f, 2.0f)
        horizontalLineTo(6.0382f)
        curveTo(6.2987f, 2.0f, 6.5489f, 2.1016f, 6.7356f, 2.2833f)
        lineTo(8.5f, 4.0f)
        lineTo(13.0f, 4.0f)
        curveTo(14.1046f, 4.0f, 15.0f, 4.8954f, 15.0f, 6.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(12.0859f)
        verticalLineTo(9.3594f)
        horizontalLineTo(11.0f)
        verticalLineTo(12.2344f)
        horizontalLineTo(12.0f)
        verticalLineTo(14.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(3.8667f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.0382f, 3.0f)
        lineTo(8.0938f, 5.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        close()
    }
}
.build()
