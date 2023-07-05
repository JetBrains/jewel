package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.ErrorDialog: IntellijIconData
    get() {
        if (_errorDialog != null) {
            return _errorDialog!!
        }
        _errorDialog = IntellijIconData(imageVector = { ErrorDialogComposable(it) })
        return _errorDialog!!
    }

private var _errorDialog: IntellijIconData? = null

private fun ErrorDialogComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "ErrorDialog", defaultWidth = 28.0.dp, defaultHeight = 28.0.dp, viewportWidth = 28.0f,
        viewportHeight = 28.0f).apply {
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(14.0f, 14.0f)
        moveToRelative(-12.5f, 0.0f)
        arcToRelative(12.5f, 12.5f, 0.0f, true, true, 25.0f, 0.0f)
        arcToRelative(12.5f, 12.5f, 0.0f, true, true, -25.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 2.2f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(14.0f, 8.0f)
        lineTo(14.0f, 14.0f)
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(15.5f, 19.5f)
        curveTo(15.5f, 20.3284f, 14.8284f, 21.0f, 14.0f, 21.0f)
        curveTo(13.1716f, 21.0f, 12.5f, 20.3284f, 12.5f, 19.5f)
        curveTo(12.5f, 18.6716f, 13.1716f, 18.0f, 14.0f, 18.0f)
        curveTo(14.8284f, 18.0f, 15.5f, 18.6716f, 15.5f, 19.5f)
        close()
    }
}
.build()
