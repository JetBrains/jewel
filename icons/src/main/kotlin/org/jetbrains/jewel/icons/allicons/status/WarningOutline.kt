package org.jetbrains.jewel.icons.allicons.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.StatusGroup

public val StatusGroup.WarningOutline: IntellijIconData
    get() {
        if (_warningOutline != null) {
            return _warningOutline!!
        }
        _warningOutline = IntellijIconData(imageVector = { WarningOutlineComposable(it) })
        return _warningOutline!!
    }

private var _warningOutline: IntellijIconData? = null

private fun WarningOutlineComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "WarningOutline", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    group {
        path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero) {
            moveTo(7.134f, 1.6255f)
            curveTo(7.5189f, 0.9588f, 8.4811f, 0.9588f, 8.866f, 1.6255f)
            lineTo(15.1447f, 12.5005f)
            curveTo(15.5296f, 13.1672f, 15.0485f, 14.0005f, 14.2787f, 14.0005f)
            horizontalLineTo(1.7213f)
            curveTo(0.9515f, 14.0005f, 0.4704f, 13.1672f, 0.8553f, 12.5005f)
            lineTo(7.134f, 1.6255f)
            close()
        }
        path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
                strokeLineWidth = 1.2f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero) {
            moveTo(8.0f, 5.5977f)
            verticalLineTo(9.0f)
        }
        path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(8.0f, 11.2594f)
            moveToRelative(-0.75f, 0.0f)
            arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
            arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
        }
    }
}
.build()
