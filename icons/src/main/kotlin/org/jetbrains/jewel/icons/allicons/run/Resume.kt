package org.jetbrains.jewel.icons.allicons.run

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
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.Resume: IntellijIconData
    get() {
        if (_resume != null) {
            return _resume!!
        }
        _resume = IntellijIconData(name = "Resume",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ResumeComposable(it) })
        return _resume!!
    }

private var _resume: IntellijIconData? = null

private fun ResumeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Resume", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.greenFill), stroke = SolidColor(colorScheme.greenStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(2.0f, 2.5f)
        lineTo(4.0f, 2.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 3.0f)
        lineTo(4.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 13.5f)
        lineTo(2.0f, 13.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 13.0f)
        lineTo(1.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.greenFill), stroke = SolidColor(colorScheme.greenStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(14.3563f, 7.2593f)
        curveTo(14.8171f, 7.6581f, 14.8171f, 8.3728f, 14.3563f, 8.7716f)
        lineTo(9.1575f, 13.2709f)
        curveTo(8.5098f, 13.8315f, 7.5031f, 13.3714f, 7.5031f, 12.5148f)
        lineTo(7.5031f, 3.5161f)
        curveTo(7.5031f, 2.6595f, 8.5098f, 2.1994f, 9.1575f, 2.76f)
        lineTo(14.3563f, 7.2593f)
        close()
    }
}
.build()
