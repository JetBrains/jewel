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

public val NodesGroup.TestResourcesRoot: IntellijIconData
    get() {
        if (_testResourcesRoot != null) {
            return _testResourcesRoot!!
        }
        _testResourcesRoot = IntellijIconData(imageVector = { TestResourcesRootComposable(it) })
        return _testResourcesRoot!!
    }

private var _testResourcesRoot: IntellijIconData? = null

private fun TestResourcesRootComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "TestResourcesRoot", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFF2FCF3)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(2.75f, 2.0f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(10.9616f)
        lineTo(2.6284f, 9.3955f)
        curveTo(3.1899f, 8.8555f, 3.9874f, 8.9075f, 4.499f, 9.33f)
        curveTo(5.0104f, 8.907f, 5.8081f, 8.8545f, 6.37f, 9.3943f)
        lineTo(8.0745f, 11.0318f)
        curveTo(8.2712f, 10.4326f, 8.8351f, 10.0f, 9.5f, 10.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        close()
    }
    path(fill = SolidColor(Color(0xFF55A76A)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(8.3798f, 12.7117f)
        curveTo(8.5435f, 12.8691f, 8.5436f, 13.131f, 8.3799f, 13.2884f)
        lineTo(5.6774f, 15.8876f)
        curveTo(5.4232f, 16.132f, 5.0f, 15.9519f, 5.0f, 15.5993f)
        lineTo(5.0f, 10.4038f)
        curveTo(5.0f, 10.0513f, 5.423f, 9.8712f, 5.6772f, 10.1154f)
        lineTo(8.3798f, 12.7117f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(0.6226f, 13.2883f)
        curveTo(0.4591f, 13.1309f, 0.4592f, 12.8692f, 0.6227f, 12.7119f)
        lineTo(3.3216f, 10.1163f)
        curveTo(3.5757f, 9.8719f, 3.9989f, 10.0519f, 3.9989f, 10.4045f)
        verticalLineTo(15.5986f)
        curveTo(3.9989f, 15.9514f, 3.5755f, 16.1314f, 3.3214f, 15.8868f)
        lineTo(0.6226f, 13.2883f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE66D17)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(9.0f, 11.5f)
        curveTo(9.0f, 11.2239f, 9.2239f, 11.0f, 9.5f, 11.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 11.0f, 16.0f, 11.2239f, 16.0f, 11.5f)
        curveTo(16.0f, 11.7761f, 15.7761f, 12.0f, 15.5f, 12.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 12.0f, 9.0f, 11.7761f, 9.0f, 11.5f)
        close()
        moveTo(9.0f, 13.5f)
        curveTo(9.0f, 13.2239f, 9.2239f, 13.0f, 9.5f, 13.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 13.0f, 16.0f, 13.2239f, 16.0f, 13.5f)
        curveTo(16.0f, 13.7761f, 15.7761f, 14.0f, 15.5f, 14.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 14.0f, 9.0f, 13.7761f, 9.0f, 13.5f)
        close()
        moveTo(9.0f, 15.5f)
        curveTo(9.0f, 15.2239f, 9.2239f, 15.0f, 9.5f, 15.0f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 15.0f, 16.0f, 15.2239f, 16.0f, 15.5f)
        curveTo(16.0f, 15.7761f, 15.7761f, 16.0f, 15.5f, 16.0f)
        horizontalLineTo(9.5f)
        curveTo(9.2239f, 16.0f, 9.0f, 15.7761f, 9.0f, 15.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFF208A3C)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0938f, 5.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(10.0f)
        horizontalLineTo(15.0f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(10.9616f)
        lineTo(2.0f, 9.9999f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        lineTo(8.0938f, 5.0f)
        close()
    }
}
.build()
