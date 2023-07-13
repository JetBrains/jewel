package org.jetbrains.jewel.icons.allicons.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.ChangedFiles: IntellijIconData
    get() {
        if (_changedFiles != null) {
            return _changedFiles!!
        }
        _changedFiles = IntellijIconData(name = "ChangedFiles",size = DpSize(height = 16.0.dp, width
                = 16.0.dp),imageVector = { ChangedFilesComposable(it) })
        return _changedFiles!!
    }

private var _changedFiles: IntellijIconData? = null

private fun ChangedFilesComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ChangedFiles", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.5f, 12.0f)
        verticalLineTo(6.0f)
        curveTo(2.5f, 5.1716f, 3.1716f, 4.5f, 4.0f, 4.5f)
        horizontalLineTo(10.0f)
        curveTo(10.8284f, 4.5f, 11.5f, 5.1716f, 11.5f, 6.0f)
        verticalLineTo(12.0f)
        curveTo(11.5f, 12.8284f, 10.8284f, 13.5f, 10.0f, 13.5f)
        horizontalLineTo(4.0f)
        curveTo(3.1716f, 13.5f, 2.5f, 12.8284f, 2.5f, 12.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(5.5f, 2.5f)
        horizontalLineTo(12.0f)
        curveTo(12.8284f, 2.5f, 13.5f, 3.1716f, 13.5f, 4.0f)
        verticalLineTo(10.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(5.0f, 10.5f)
        horizontalLineTo(9.0f)
        moveTo(5.0f, 7.5f)
        horizontalLineTo(9.0f)
    }
}
.build()
