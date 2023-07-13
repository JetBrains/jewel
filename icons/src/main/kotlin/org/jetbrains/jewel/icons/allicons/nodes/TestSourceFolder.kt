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
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.TestSourceFolder: IntellijIconData
    get() {
        if (_testSourceFolder != null) {
            return _testSourceFolder!!
        }
        _testSourceFolder = IntellijIconData(name = "TestSourceFolder",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { TestSourceFolderComposable(it) })
        return _testSourceFolder!!
    }

private var _testSourceFolder: IntellijIconData? = null

private fun TestSourceFolderComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "TestSourceFolder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF55A76A)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(15.3798f, 12.7117f)
        curveTo(15.5435f, 12.8691f, 15.5436f, 13.131f, 15.3799f, 13.2884f)
        lineTo(12.6774f, 15.8876f)
        curveTo(12.4232f, 16.132f, 12.0f, 15.9519f, 12.0f, 15.5993f)
        lineTo(12.0f, 10.4038f)
        curveTo(12.0f, 10.0513f, 12.423f, 9.8712f, 12.6772f, 10.1154f)
        lineTo(15.3798f, 12.7117f)
        close()
    }
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(7.6226f, 13.2883f)
        curveTo(7.4591f, 13.1309f, 7.4592f, 12.8692f, 7.6227f, 12.7119f)
        lineTo(10.3216f, 10.1163f)
        curveTo(10.5757f, 9.8719f, 10.9989f, 10.0519f, 10.9989f, 10.4045f)
        verticalLineTo(15.5986f)
        curveTo(10.9989f, 15.9514f, 10.5755f, 16.1314f, 10.3214f, 15.8868f)
        lineTo(7.6226f, 13.2883f)
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
        verticalLineTo(10.9602f)
        lineTo(13.37f, 9.3943f)
        curveTo(12.8081f, 8.8545f, 12.0104f, 8.907f, 11.499f, 9.33f)
        curveTo(10.9874f, 8.9075f, 10.1899f, 8.8555f, 9.6284f, 9.3955f)
        lineTo(6.9295f, 11.9912f)
        curveTo(6.36f, 12.5389f, 6.3568f, 13.4482f, 6.9201f, 14.0f)
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
        verticalLineTo(9.9995f)
        lineTo(15.0f, 10.9602f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(6.9201f)
        curveTo(6.64f, 13.7256f, 6.5f, 13.3628f, 6.5f, 13.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        close()
    }
}
.build()
