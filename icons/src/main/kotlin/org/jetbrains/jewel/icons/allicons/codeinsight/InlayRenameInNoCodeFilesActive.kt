package org.jetbrains.jewel.icons.allicons.codeinsight

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.CodeinsightGroup

public val CodeinsightGroup.InlayRenameInNoCodeFilesActive: IntellijIconData
    get() {
        if (_inlayRenameInNoCodeFilesActive != null) {
            return _inlayRenameInNoCodeFilesActive!!
        }
        _inlayRenameInNoCodeFilesActive = IntellijIconData(name =
                "InlayRenameInNoCodeFilesActive",size = DpSize(height = 12.0.dp, width =
                12.0.dp),imageVector = { InlayRenameInNoCodeFilesActiveComposable(it) })
        return _inlayRenameInNoCodeFilesActive!!
    }

private var _inlayRenameInNoCodeFilesActive: IntellijIconData? = null

private fun InlayRenameInNoCodeFilesActiveComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "InlayRenameInNoCodeFilesActive", defaultWidth = 12.0.dp, defaultHeight =
        12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.75f, 5.0f)
        lineTo(10.25f, 5.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 11.0f, 5.75f)
        lineTo(11.0f, 5.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 10.25f, 6.5f)
        lineTo(1.75f, 6.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 1.0f, 5.75f)
        lineTo(1.0f, 5.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 1.75f, 5.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.75f, 9.0f)
        lineTo(6.25f, 9.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 7.0f, 9.75f)
        lineTo(7.0f, 9.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 6.25f, 10.5f)
        lineTo(1.75f, 10.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 1.0f, 9.75f)
        lineTo(1.0f, 9.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 1.75f, 9.0f)
        close()
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(1.75f, 1.0f)
        lineTo(10.25f, 1.0f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 11.0f, 1.75f)
        lineTo(11.0f, 1.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 10.25f, 2.5f)
        lineTo(1.75f, 2.5f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 1.0f, 1.75f)
        lineTo(1.0f, 1.75f)
        arcTo(0.75f, 0.75f, 0.0f, false, true, 1.75f, 1.0f)
        close()
    }
}
.build()
