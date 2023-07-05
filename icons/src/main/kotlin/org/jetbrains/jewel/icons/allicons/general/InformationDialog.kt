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

public val GeneralGroup.InformationDialog: IntellijIconData
    get() {
        if (_informationDialog != null) {
            return _informationDialog!!
        }
        _informationDialog = IntellijIconData(imageVector = { InformationDialogComposable(it) })
        return _informationDialog!!
    }

private var _informationDialog: IntellijIconData? = null

private fun InformationDialogComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "InformationDialog", defaultWidth = 28.0.dp, defaultHeight = 28.0.dp, viewportWidth =
        28.0f, viewportHeight = 28.0f).apply {
    path(fill = SolidColor(colorScheme.blueSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.0f, 14.0f)
        moveToRelative(-12.5f, 0.0f)
        arcToRelative(12.5f, 12.5f, 0.0f, true, true, 25.0f, 0.0f)
        arcToRelative(12.5f, 12.5f, 0.0f, true, true, -25.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
            strokeLineWidth = 2.2f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(14.0f, 20.0f)
        lineTo(14.0f, 14.0f)
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.5f, 8.5001f)
        curveTo(12.5f, 7.6717f, 13.1716f, 7.0001f, 14.0f, 7.0001f)
        curveTo(14.8284f, 7.0001f, 15.5f, 7.6717f, 15.5f, 8.5001f)
        curveTo(15.5f, 9.3285f, 14.8284f, 10.0001f, 14.0f, 10.0001f)
        curveTo(13.1716f, 10.0001f, 12.5f, 9.3285f, 12.5f, 8.5001f)
        close()
    }
}
.build()
