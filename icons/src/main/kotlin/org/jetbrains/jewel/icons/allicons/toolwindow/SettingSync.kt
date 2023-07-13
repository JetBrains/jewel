package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.SettingSync: IntellijIconData
    get() {
        if (_settingSync != null) {
            return _settingSync!!
        }
        _settingSync = IntellijIconData(name = "SettingSync",size = DpSize(height = 16.0.dp, width =
                18.0.dp),imageVector = { SettingSyncComposable(it) })
        return _settingSync!!
    }

private var _settingSync: IntellijIconData? = null

private fun SettingSyncComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "SettingSync", defaultWidth = 18.0.dp, defaultHeight = 16.0.dp, viewportWidth = 18.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.5f, 9.0f)
        verticalLineTo(8.0f)
        curveTo(3.5f, 4.9624f, 5.9624f, 2.5f, 9.0f, 2.5f)
        curveTo(10.1068f, 2.5f, 11.1372f, 2.8269f, 12.0f, 3.3895f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(6.0f, 12.6105f)
        curveTo(6.8628f, 13.1731f, 7.8932f, 13.5f, 9.0f, 13.5f)
        curveTo(12.0376f, 13.5f, 14.5f, 11.0376f, 14.5f, 8.0f)
        verticalLineTo(7.0f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(1.3787f, 7.3213f)
        lineTo(3.5f, 9.4426f)
        lineTo(5.6213f, 7.3213f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.3787f, 8.6787f)
        lineTo(14.5f, 6.5574f)
        lineTo(16.6213f, 8.6787f)
    }
}
.build()
