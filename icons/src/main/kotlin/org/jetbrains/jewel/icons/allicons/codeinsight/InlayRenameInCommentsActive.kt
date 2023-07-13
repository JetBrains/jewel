package org.jetbrains.jewel.icons.allicons.codeinsight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.CodeinsightGroup

public val CodeinsightGroup.InlayRenameInCommentsActive: IntellijIconData
    get() {
        if (_inlayRenameInCommentsActive != null) {
            return _inlayRenameInCommentsActive!!
        }
        _inlayRenameInCommentsActive = IntellijIconData(name = "InlayRenameInCommentsActive",size =
                DpSize(height = 12.0.dp, width = 12.0.dp),imageVector = {
                InlayRenameInCommentsActiveComposable(it) })
        return _inlayRenameInCommentsActive!!
    }

private var _inlayRenameInCommentsActive: IntellijIconData? = null

private fun InlayRenameInCommentsActiveComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "InlayRenameInCommentsActive", defaultWidth = 12.0.dp, defaultHeight =
        12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.3999f, 2.0f)
        lineTo(5.3999f, 10.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.6001f, 2.0f)
        lineTo(1.6001f, 10.0f)
    }
}
.build()
