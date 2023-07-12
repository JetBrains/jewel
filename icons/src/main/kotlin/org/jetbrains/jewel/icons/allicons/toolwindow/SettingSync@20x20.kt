package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.`SettingSync@20x20`: IntellijIconData
    get() {
        if (`_settingSync@20x20` != null) {
            return `_settingSync@20x20`!!
        }
        `_settingSync@20x20` = IntellijIconData(imageVector = { `SettingSync@20x20Composable`(it) })
        return `_settingSync@20x20`!!
    }

private var `_settingSync@20x20`: IntellijIconData? = null

private fun `SettingSync@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "SettingSync@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.3144f, 4.75f)
        curveTo(7.4962f, 4.75f, 5.1967f, 6.9706f, 5.0699f, 9.7575f)
        lineTo(6.0983f, 8.7291f)
        curveTo(6.3912f, 8.4362f, 6.866f, 8.4362f, 7.1589f, 8.7291f)
        curveTo(7.4518f, 9.022f, 7.4518f, 9.4969f, 7.1589f, 9.7898f)
        lineTo(4.3144f, 12.6343f)
        lineTo(1.4699f, 9.7898f)
        curveTo(1.177f, 9.4969f, 1.177f, 9.022f, 1.4699f, 8.7291f)
        curveTo(1.7628f, 8.4362f, 2.2377f, 8.4362f, 2.5306f, 8.7291f)
        lineTo(3.5684f, 9.7669f)
        curveTo(3.6912f, 6.1469f, 6.6645f, 3.25f, 10.3144f, 3.25f)
        curveTo(11.6717f, 3.25f, 12.9374f, 3.6514f, 13.9968f, 4.3421f)
        curveTo(14.3438f, 4.5683f, 14.4417f, 5.033f, 14.2154f, 5.38f)
        curveTo(13.9892f, 5.7269f, 13.5245f, 5.8248f, 13.1775f, 5.5986f)
        curveTo(12.3545f, 5.0619f, 11.372f, 4.75f, 10.3144f, 4.75f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(19.159f, 11.2709f)
        curveTo(19.4518f, 10.978f, 19.4518f, 10.5031f, 19.159f, 10.2102f)
        lineTo(16.3145f, 7.3657f)
        lineTo(13.47f, 10.2102f)
        curveTo(13.1771f, 10.5031f, 13.1771f, 10.978f, 13.47f, 11.2709f)
        curveTo(13.7628f, 11.5638f, 14.2377f, 11.5638f, 14.5306f, 11.2709f)
        lineTo(15.5582f, 10.2433f)
        curveTo(15.4312f, 13.0298f, 13.1317f, 15.25f, 10.3138f, 15.25f)
        curveTo(9.2562f, 15.25f, 8.2737f, 14.9381f, 7.4507f, 14.4014f)
        curveTo(7.1037f, 14.1752f, 6.639f, 14.2731f, 6.4128f, 14.6201f)
        curveTo(6.1866f, 14.967f, 6.2844f, 15.4317f, 6.6314f, 15.6579f)
        curveTo(7.6908f, 16.3487f, 8.9565f, 16.75f, 10.3138f, 16.75f)
        curveTo(13.9639f, 16.75f, 16.9373f, 13.8527f, 17.0598f, 10.2324f)
        lineTo(18.0983f, 11.2709f)
        curveTo(18.3912f, 11.5638f, 18.8661f, 11.5638f, 19.159f, 11.2709f)
        close()
    }
}
.build()
