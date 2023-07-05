package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.SuccessDialog: IntellijIconData
    get() {
        if (_successDialog != null) {
            return _successDialog!!
        }
        _successDialog = IntellijIconData(imageVector = { SuccessDialogComposable(it) })
        return _successDialog!!
    }

private var _successDialog: IntellijIconData? = null

private fun SuccessDialogComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "SuccessDialog", defaultWidth = 28.0.dp, defaultHeight = 28.0.dp, viewportWidth = 28.0f,
        viewportHeight = 28.0f).apply {
    path(fill = SolidColor(Color(0xFF55A76A)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(14.0f, 14.0f)
        moveToRelative(-12.5f, 0.0f)
        arcToRelative(12.5f, 12.5f, 0.0f, true, true, 25.0f, 0.0f)
        arcToRelative(12.5f, 12.5f, 0.0f, true, true, -25.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 2.2f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.5996f, 14.2373f)
        lineTo(12.5153f, 18.1529f)
        lineTo(19.5996f, 10.5f)
    }
}
.build()
