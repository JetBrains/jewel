package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.WarningDialog: IntellijIconData
    get() {
        if (_warningDialog != null) {
            return _warningDialog!!
        }
        _warningDialog = IntellijIconData(name = "WarningDialog",size = DpSize(height = 28.0.dp,
                width = 28.0.dp),imageVector = { WarningDialogComposable(it) })
        return _warningDialog!!
    }

private var _warningDialog: IntellijIconData? = null

private fun WarningDialogComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "WarningDialog", defaultWidth = 28.0.dp, defaultHeight = 28.0.dp, viewportWidth = 28.0f,
        viewportHeight = 28.0f).apply {
    group {
        path(fill = SolidColor(Color(0xFFFCC75B)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(12.72f, 2.7419f)
            curveTo(13.2889f, 1.7527f, 14.7111f, 1.7527f, 15.28f, 2.7419f)
            lineTo(26.7998f, 22.7742f)
            curveTo(27.3687f, 23.7634f, 26.6576f, 25.0f, 25.5198f, 25.0f)
            horizontalLineTo(2.4802f)
            curveTo(1.3424f, 25.0f, 0.6313f, 23.7634f, 1.2002f, 22.7742f)
            lineTo(12.72f, 2.7419f)
            close()
        }
        path(fill = SolidColor(Color(0xFF7D5020)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(15.3f, 10.0f)
            curveTo(15.3f, 9.282f, 14.718f, 8.7f, 14.0f, 8.7f)
            curveTo(13.282f, 8.7f, 12.7f, 9.282f, 12.7f, 10.0f)
            lineTo(15.3f, 10.0f)
            close()
            moveTo(12.7f, 15.5f)
            curveTo(12.7f, 16.218f, 13.282f, 16.8f, 14.0f, 16.8f)
            curveTo(14.718f, 16.8f, 15.3f, 16.218f, 15.3f, 15.5f)
            lineTo(12.7f, 15.5f)
            close()
            moveTo(12.7f, 10.0f)
            lineTo(12.7f, 15.5f)
            lineTo(15.3f, 15.5f)
            lineTo(15.3f, 10.0f)
            lineTo(12.7f, 10.0f)
            close()
        }
        path(fill = SolidColor(Color(0xFF7D5020)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                NonZero) {
            moveTo(15.5f, 20.5f)
            curveTo(15.5f, 21.3284f, 14.8284f, 22.0f, 14.0f, 22.0f)
            curveTo(13.1716f, 22.0f, 12.5f, 21.3284f, 12.5f, 20.5f)
            curveTo(12.5f, 19.6716f, 13.1716f, 19.0f, 14.0f, 19.0f)
            curveTo(14.8284f, 19.0f, 15.5f, 19.6716f, 15.5f, 20.5f)
            close()
        }
    }
}
.build()
