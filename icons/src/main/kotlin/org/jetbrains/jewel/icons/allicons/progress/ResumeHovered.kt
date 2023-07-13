package org.jetbrains.jewel.icons.allicons.progress

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
import org.jetbrains.jewel.icons.allicons.ProgressGroup

public val ProgressGroup.ResumeHovered: IntellijIconData
    get() {
        if (_resumeHovered != null) {
            return _resumeHovered!!
        }
        _resumeHovered = IntellijIconData(name = "ResumeHovered",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { ResumeHoveredComposable(it) })
        return _resumeHovered!!
    }

private var _resumeHovered: IntellijIconData? = null

private fun ResumeHoveredComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ResumeHovered", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF313547)), stroke = null, fillAlpha = 0.2f, strokeAlpha = 0.2f,
            strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-8.0f, 0.0f)
        arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
        arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF818594)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.25f, 7.134f)
        curveTo(12.9167f, 7.5189f, 12.9167f, 8.4811f, 12.25f, 8.866f)
        lineTo(6.625f, 12.1136f)
        curveTo(5.9583f, 12.4985f, 5.125f, 12.0174f, 5.125f, 11.2476f)
        lineTo(5.125f, 4.7524f)
        curveTo(5.125f, 3.9826f, 5.9583f, 3.5015f, 6.625f, 3.8864f)
        lineTo(12.25f, 7.134f)
        close()
    }
}
.build()
