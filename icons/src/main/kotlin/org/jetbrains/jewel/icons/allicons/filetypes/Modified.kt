package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Modified: IntellijIconData
    get() {
        if (_modified != null) {
            return _modified!!
        }
        _modified = IntellijIconData(name = "Modified",size = DpSize(height = 13.0.dp, width =
                13.0.dp),imageVector = { ModifiedComposable(it) })
        return _modified!!
    }

private var _modified: IntellijIconData? = null

private fun ModifiedComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Modified", defaultWidth = 13.0.dp, defaultHeight = 13.0.dp, viewportWidth = 13.0f,
        viewportHeight = 13.0f).apply {
    path(fill = SolidColor(colorScheme.blueSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.5f, 6.5f)
        moveToRelative(-3.0f, 0.0f)
        arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
        arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
    }
}
.build()
