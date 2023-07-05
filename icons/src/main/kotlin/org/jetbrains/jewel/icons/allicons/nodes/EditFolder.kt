package org.jetbrains.jewel.icons.allicons.nodes

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

public val NodesGroup.EditFolder: IntellijIconData
    get() {
        if (_editFolder != null) {
            return _editFolder!!
        }
        _editFolder = IntellijIconData(imageVector = { EditFolderComposable(it) })
        return _editFolder!!
    }

private var _editFolder: IntellijIconData? = null

private fun EditFolderComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "EditFolder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
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
        verticalLineTo(7.4777f)
        curveTo(14.2142f, 6.8087f, 13.0333f, 6.8454f, 12.2909f, 7.5879f)
        lineTo(7.0f, 12.8787f)
        verticalLineTo(14.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 14.0f, 1.0f, 13.1643f, 1.0f, 12.1333f)
        verticalLineTo(3.8667f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0938f, 5.0f)
        horizontalLineTo(13.0f)
        curveTo(13.5523f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
        verticalLineTo(7.0238f)
        curveTo(14.3594f, 7.0771f, 14.7072f, 7.2284f, 15.0f, 7.4777f)
        verticalLineTo(6.0f)
        curveTo(15.0f, 4.8954f, 14.1046f, 4.0f, 13.0f, 4.0f)
        lineTo(8.5f, 4.0f)
        lineTo(6.7356f, 2.2833f)
        curveTo(6.5489f, 2.1016f, 6.2987f, 2.0f, 6.0382f, 2.0f)
        horizontalLineTo(2.75f)
        curveTo(1.7835f, 2.0f, 1.0f, 2.8357f, 1.0f, 3.8667f)
        verticalLineTo(12.1333f)
        curveTo(1.0f, 13.1643f, 1.7835f, 14.0f, 2.75f, 14.0f)
        horizontalLineTo(7.0f)
        verticalLineTo(13.0f)
        horizontalLineTo(2.75f)
        curveTo(2.3956f, 13.0f, 2.0f, 12.6738f, 2.0f, 12.1333f)
        verticalLineTo(3.8667f)
        curveTo(2.0f, 3.3262f, 2.3956f, 3.0f, 2.75f, 3.0f)
        horizontalLineTo(6.0382f)
        lineTo(8.0938f, 5.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(14.4122f, 8.295f)
        curveTo(14.0217f, 7.9044f, 13.3885f, 7.9044f, 12.998f, 8.295f)
        lineTo(11.6466f, 9.6463f)
        lineTo(8.0f, 13.2929f)
        verticalLineTo(16.0f)
        horizontalLineTo(10.7071f)
        lineTo(15.7051f, 11.0021f)
        curveTo(16.0956f, 10.6116f, 16.0956f, 9.9784f, 15.7051f, 9.5879f)
        lineTo(14.4122f, 8.295f)
        close()
        moveTo(14.0f, 11.2929f)
        lineTo(14.998f, 10.295f)
        lineTo(13.7051f, 9.0021f)
        lineTo(12.7071f, 10.0f)
        lineTo(14.0f, 11.2929f)
        close()
        moveTo(12.0f, 10.7072f)
        lineTo(13.2929f, 12.0f)
        lineTo(10.2929f, 15.0f)
        horizontalLineTo(9.0f)
        verticalLineTo(13.7072f)
        lineTo(12.0f, 10.7072f)
        close()
    }
}
.build()
