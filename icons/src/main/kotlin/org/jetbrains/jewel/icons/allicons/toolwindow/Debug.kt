package org.jetbrains.jewel.icons.allicons.toolwindow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val ToolwindowGroup.Debug: IntellijIconData
    get() {
        if (_debug != null) {
            return _debug!!
        }
        _debug = IntellijIconData(imageVector = { DebugComposable(it) })
        return _debug!!
    }

private var _debug: IntellijIconData? = null

private fun DebugComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Debug",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(13.967f, 13.5331f)
        curveTo(14.2061f, 13.6712f, 14.5119f, 13.5892f, 14.65f, 13.3501f)
        curveTo(14.7881f, 13.1109f, 14.7061f, 12.8052f, 14.467f, 12.6671f)
        lineTo(13.967f, 13.5331f)
        close()
        moveTo(11.75f, 12.2531f)
        lineTo(13.967f, 13.5331f)
        lineTo(14.467f, 12.6671f)
        lineTo(12.25f, 11.3871f)
        lineTo(11.75f, 12.2531f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.9004f, 9.5001f)
        curveTo(15.1765f, 9.5001f, 15.4004f, 9.2762f, 15.4004f, 9.0001f)
        curveTo(15.4004f, 8.7239f, 15.1765f, 8.5001f, 14.9004f, 8.5001f)
        lineTo(14.9004f, 9.5001f)
        close()
        moveTo(12.4004f, 9.5001f)
        lineTo(14.9004f, 9.5001f)
        lineTo(14.9004f, 8.5001f)
        lineTo(12.4004f, 8.5001f)
        lineTo(12.4004f, 9.5001f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.455f, 5.2398f)
        curveTo(14.6979f, 5.1083f, 14.7882f, 4.8049f, 14.6567f, 4.5621f)
        curveTo(14.5253f, 4.3192f, 14.2219f, 4.2289f, 13.979f, 4.3604f)
        lineTo(14.455f, 5.2398f)
        close()
        moveTo(12.238f, 6.4398f)
        lineTo(14.455f, 5.2398f)
        lineTo(13.979f, 4.3604f)
        lineTo(11.762f, 5.5603f)
        lineTo(12.238f, 6.4398f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0299f, 13.5331f)
        curveTo(1.7908f, 13.6712f, 1.4849f, 13.5892f, 1.3469f, 13.3501f)
        curveTo(1.2088f, 13.1109f, 1.2908f, 12.8051f, 1.5299f, 12.6671f)
        lineTo(2.0299f, 13.5331f)
        close()
        moveTo(4.25f, 12.2513f)
        lineTo(2.0299f, 13.5331f)
        lineTo(1.5299f, 12.6671f)
        lineTo(3.75f, 11.3853f)
        lineTo(4.25f, 12.2513f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.0996f, 9.5001f)
        curveTo(0.8235f, 9.5001f, 0.5996f, 9.2762f, 0.5996f, 9.0001f)
        curveTo(0.5996f, 8.7239f, 0.8235f, 8.5001f, 1.0996f, 8.5001f)
        lineTo(1.0996f, 9.5001f)
        close()
        moveTo(3.5996f, 9.5001f)
        lineTo(1.0996f, 9.5001f)
        lineTo(1.0996f, 8.5001f)
        lineTo(3.5996f, 8.5001f)
        lineTo(3.5996f, 9.5001f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5422f, 5.2399f)
        curveTo(1.2992f, 5.1086f, 1.2087f, 4.8053f, 1.34f, 4.5623f)
        curveTo(1.4713f, 4.3194f, 1.7747f, 4.2289f, 2.0176f, 4.3602f)
        lineTo(1.5422f, 5.2399f)
        close()
        moveTo(3.7622f, 6.4399f)
        lineTo(1.5422f, 5.2399f)
        lineTo(2.0176f, 4.3602f)
        lineTo(4.2378f, 5.5602f)
        lineTo(3.7622f, 6.4399f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(6.3008f, 4.2f)
        curveTo(6.3008f, 3.2611f, 7.0619f, 2.5f, 8.0008f, 2.5f)
        curveTo(8.9397f, 2.5f, 9.7008f, 3.2611f, 9.7008f, 4.2f)
        curveTo(9.7008f, 4.4892f, 9.6286f, 4.7616f, 9.5012f, 5.0f)
        horizontalLineTo(10.5f)
        curveTo(10.5267f, 5.0f, 10.5533f, 5.0005f, 10.5798f, 5.0016f)
        curveTo(10.6584f, 4.7483f, 10.7008f, 4.4791f, 10.7008f, 4.2f)
        curveTo(10.7008f, 2.7088f, 9.492f, 1.5f, 8.0008f, 1.5f)
        curveTo(6.5096f, 1.5f, 5.3008f, 2.7088f, 5.3008f, 4.2f)
        curveTo(5.3008f, 4.4791f, 5.3431f, 4.7483f, 5.4217f, 5.0015f)
        curveTo(5.4477f, 5.0005f, 5.4738f, 5.0f, 5.5f, 5.0f)
        horizontalLineTo(6.5004f)
        curveTo(6.373f, 4.7616f, 6.3008f, 4.4892f, 6.3008f, 4.2f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 7.5f)
        curveTo(4.0f, 5.8432f, 5.3432f, 4.5f, 7.0f, 4.5f)
        horizontalLineTo(9.0f)
        curveTo(10.6569f, 4.5f, 12.0f, 5.8432f, 12.0f, 7.5f)
        verticalLineTo(10.0f)
        curveTo(12.0f, 12.2091f, 10.2091f, 14.0f, 8.0f, 14.0f)
        verticalLineTo(14.0f)
        curveTo(5.7909f, 14.0f, 4.0f, 12.2091f, 4.0f, 10.0f)
        verticalLineTo(7.5f)
        close()
    }
}
.build()
