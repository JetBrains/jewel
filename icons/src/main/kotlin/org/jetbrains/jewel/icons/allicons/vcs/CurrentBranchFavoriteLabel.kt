package org.jetbrains.jewel.icons.allicons.vcs

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
import org.jetbrains.jewel.icons.allicons.VcsGroup

public val VcsGroup.CurrentBranchFavoriteLabel: IntellijIconData
    get() {
        if (_currentBranchFavoriteLabel != null) {
            return _currentBranchFavoriteLabel!!
        }
        _currentBranchFavoriteLabel = IntellijIconData(name = "CurrentBranchFavoriteLabel",size =
                DpSize(height = 16.0.dp, width = 16.0.dp),imageVector = {
                CurrentBranchFavoriteLabelComposable(it) })
        return _currentBranchFavoriteLabel!!
    }

private var _currentBranchFavoriteLabel: IntellijIconData? = null

private fun CurrentBranchFavoriteLabelComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "CurrentBranchFavoriteLabel", defaultWidth = 16.0.dp, defaultHeight =
        16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.yellowSolid), stroke = null, strokeLineWidth = 0.0f,
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
        moveTo(10.0f, 8.0f)
        curveTo(11.1046f, 8.0f, 12.0f, 7.1046f, 12.0f, 6.0f)
        curveTo(12.0f, 4.8954f, 11.1046f, 4.0f, 10.0f, 4.0f)
        curveTo(8.8954f, 4.0f, 8.0f, 4.8954f, 8.0f, 6.0f)
        curveTo(8.0f, 7.1046f, 8.8954f, 8.0f, 10.0f, 8.0f)
        close()
    }
}
.build()
