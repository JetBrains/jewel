package org.jetbrains.jewel.icons.allicons.vcs

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
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.BranchLabel: IntellijIconData
    get() {
        if (_branchLabel != null) {
            return _branchLabel!!
        }
        _branchLabel = IntellijIconData(imageVector = { BranchLabelComposable(it) })
        return _branchLabel!!
    }

private var _branchLabel: IntellijIconData? = null

private fun BranchLabelComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "BranchLabel", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(7.7071f, 2.2929f)
        lineTo(1.295f, 8.705f)
        curveTo(0.9044f, 9.0955f, 0.9044f, 9.7287f, 1.295f, 10.1192f)
        lineTo(5.8808f, 14.705f)
        curveTo(6.2713f, 15.0955f, 6.9044f, 15.0955f, 7.295f, 14.705f)
        lineTo(13.7071f, 8.2929f)
        curveTo(13.8946f, 8.1054f, 14.0f, 7.851f, 14.0f, 7.5858f)
        verticalLineTo(3.0f)
        curveTo(14.0f, 2.4477f, 13.5523f, 2.0f, 13.0f, 2.0f)
        horizontalLineTo(8.4142f)
        curveTo(8.149f, 2.0f, 7.8946f, 2.1054f, 7.7071f, 2.2929f)
        close()
        moveTo(2.0021f, 9.4121f)
        lineTo(8.4142f, 3.0f)
        lineTo(13.0f, 3.0f)
        verticalLineTo(7.5858f)
        lineTo(6.5879f, 13.9979f)
        lineTo(2.0021f, 9.4121f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.0f, 6.0f)
        moveToRelative(-1.5f, 0.0f)
        arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
        arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
    }
}
.build()
