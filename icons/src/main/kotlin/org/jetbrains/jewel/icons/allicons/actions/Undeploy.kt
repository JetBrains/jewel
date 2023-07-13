package org.jetbrains.jewel.icons.allicons.actions

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
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.Undeploy: IntellijIconData
    get() {
        if (_undeploy != null) {
            return _undeploy!!
        }
        _undeploy = IntellijIconData(name = "Undeploy",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { UndeployComposable(it) })
        return _undeploy!!
    }

private var _undeploy: IntellijIconData? = null

private fun UndeployComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Undeploy", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(14.0f, 8.0f)
        lineTo(2.5f, 8.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF369650)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.0f, 2.0f)
        lineTo(8.0f, 5.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF369650)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(11.0f, 14.0f)
        lineTo(8.0f, 11.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.redStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.6758f, 5.0f)
        lineTo(1.6758f, 8.0f)
        lineTo(4.6758f, 11.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF369650)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 1.5f)
        lineTo(11.5f, 1.5f)
        lineTo(11.5f, 5.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF369650)),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 14.5f)
        lineTo(11.5f, 14.5f)
        lineTo(11.5f, 11.0f)
    }
}
.build()
