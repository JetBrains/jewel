package org.jetbrains.jewel.icons.allicons.toolwindow

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
import org.jetbrains.jewel.icons.allicons.ToolwindowGroup

public val ToolwindowGroup.`Ant@20x20`: IntellijIconData
    get() {
        if (`_ant@20x20` != null) {
            return `_ant@20x20`!!
        }
        `_ant@20x20` = IntellijIconData(imageVector = { `Ant@20x20Composable`(it) })
        return `_ant@20x20`!!
    }

private var `_ant@20x20`: IntellijIconData? = null

private fun `Ant@20x20Composable`(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Ant@20x20", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f,
        viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(15.5003f, 18.0f)
        verticalLineTo(17.0f)
        verticalLineTo(13.4f)
        lineTo(13.0078f, 12.3484f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.4977f, 18.0f)
        verticalLineTo(17.0f)
        verticalLineTo(13.4f)
        lineTo(6.9902f, 12.3484f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(15.5f, 5.5f)
        verticalLineTo(8.5f)
        lineTo(12.5f, 10.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(4.5f, 5.5f)
        verticalLineTo(8.5f)
        lineTo(7.5f, 10.5f)
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.0f, 18.0f)
        lineTo(10.0f, 17.25f)
        horizontalLineTo(10.0f)
        lineTo(10.0f, 18.0f)
        close()
        moveTo(11.7125f, 5.7815f)
        curveTo(11.7125f, 6.5963f, 11.5294f, 6.8464f, 11.395f, 6.9517f)
        curveTo(11.2088f, 7.0976f, 10.8346f, 7.2031f, 10.0125f, 7.2031f)
        verticalLineTo(8.7031f)
        curveTo(10.8441f, 8.7031f, 11.6949f, 8.6224f, 12.3203f, 8.1323f)
        curveTo(12.9975f, 7.6015f, 13.2125f, 6.7657f, 13.2125f, 5.7815f)
        horizontalLineTo(11.7125f)
        close()
        moveTo(10.0125f, 3.7031f)
        curveTo(10.3398f, 3.7031f, 10.7666f, 3.8255f, 11.1027f, 4.1287f)
        curveTo(11.4184f, 4.4134f, 11.7125f, 4.9097f, 11.7125f, 5.7815f)
        horizontalLineTo(13.2125f)
        curveTo(13.2125f, 4.5318f, 12.7716f, 3.6138f, 12.1073f, 3.0148f)
        curveTo(11.4634f, 2.4341f, 10.6652f, 2.2031f, 10.0125f, 2.2031f)
        verticalLineTo(3.7031f)
        close()
        moveTo(8.3125f, 5.7815f)
        curveTo(8.3125f, 4.9097f, 8.6066f, 4.4134f, 8.9223f, 4.1287f)
        curveTo(9.2584f, 3.8255f, 9.6852f, 3.7031f, 10.0125f, 3.7031f)
        verticalLineTo(2.2031f)
        curveTo(9.3598f, 2.2031f, 8.5616f, 2.4341f, 7.9177f, 3.0148f)
        curveTo(7.2534f, 3.6138f, 6.8125f, 4.5318f, 6.8125f, 5.7815f)
        horizontalLineTo(8.3125f)
        close()
        moveTo(10.0125f, 7.2031f)
        curveTo(9.1904f, 7.2031f, 8.8162f, 7.0976f, 8.63f, 6.9517f)
        curveTo(8.4956f, 6.8464f, 8.3125f, 6.5963f, 8.3125f, 5.7815f)
        horizontalLineTo(6.8125f)
        curveTo(6.8125f, 6.7657f, 7.0275f, 7.6015f, 7.7047f, 8.1323f)
        curveTo(8.3301f, 8.6224f, 9.1809f, 8.7031f, 10.0125f, 8.7031f)
        verticalLineTo(7.2031f)
        close()
        moveTo(12.25f, 13.0769f)
        curveTo(12.25f, 13.7671f, 12.0269f, 14.8861f, 11.5754f, 15.8155f)
        curveTo(11.1014f, 16.7912f, 10.5399f, 17.25f, 10.0f, 17.25f)
        lineTo(10.0f, 18.75f)
        curveTo(11.4601f, 18.75f, 12.3986f, 17.5536f, 12.9246f, 16.4709f)
        curveTo(13.4731f, 15.342f, 13.75f, 13.9994f, 13.75f, 13.0769f)
        horizontalLineTo(12.25f)
        close()
        moveTo(10.0f, 10.75f)
        curveTo(11.1884f, 10.75f, 12.25f, 11.7122f, 12.25f, 13.0769f)
        horizontalLineTo(13.75f)
        curveTo(13.75f, 10.8731f, 12.0061f, 9.25f, 10.0f, 9.25f)
        verticalLineTo(10.75f)
        close()
        moveTo(7.75f, 13.0769f)
        curveTo(7.75f, 11.7122f, 8.8116f, 10.75f, 10.0f, 10.75f)
        verticalLineTo(9.25f)
        curveTo(7.9939f, 9.25f, 6.25f, 10.8731f, 6.25f, 13.0769f)
        horizontalLineTo(7.75f)
        close()
        moveTo(10.0f, 17.25f)
        curveTo(9.4601f, 17.25f, 8.8986f, 16.7912f, 8.4246f, 15.8155f)
        curveTo(7.9731f, 14.8861f, 7.75f, 13.7671f, 7.75f, 13.0769f)
        horizontalLineTo(6.25f)
        curveTo(6.25f, 13.9994f, 6.5269f, 15.342f, 7.0754f, 16.4709f)
        curveTo(7.6014f, 17.5536f, 8.5399f, 18.75f, 10.0f, 18.75f)
        lineTo(10.0f, 17.25f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(12.0f, 4.0f)
        lineTo(13.0f, 1.5f)
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 4.0f)
        lineTo(7.0f, 1.5f)
    }
}
.build()
