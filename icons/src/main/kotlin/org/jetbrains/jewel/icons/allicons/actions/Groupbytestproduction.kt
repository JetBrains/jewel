package org.jetbrains.jewel.icons.allicons.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.Groupbytestproduction: ImageVector
    get() {
        if (_groupbytestproduction != null) {
            return _groupbytestproduction!!
        }
        _groupbytestproduction = Builder(name = "Groupbytestproduction", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF6C707E)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 13.5f)
                horizontalLineTo(2.5f)
                curveTo(1.9477f, 13.5f, 1.5f, 13.0523f, 1.5f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(1.5f, 2.9477f, 1.9477f, 2.5f, 2.5f, 2.5f)
                horizontalLineTo(3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF6C707E)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 13.5f)
                horizontalLineTo(13.5f)
                curveTo(14.0523f, 13.5f, 14.5f, 13.0523f, 14.5f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(14.5f, 2.9477f, 14.0523f, 2.5f, 13.5f, 2.5f)
                horizontalLineTo(12.5f)
            }
            path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.1352f, 11.8473f)
                lineTo(3.261f, 8.6849f)
                curveTo(2.9128f, 8.3018f, 2.913f, 7.7143f, 3.2615f, 7.3315f)
                lineTo(6.1355f, 4.1746f)
                curveTo(6.4422f, 3.8377f, 7.0f, 4.0562f, 7.0f, 4.5131f)
                verticalLineTo(11.5091f)
                curveTo(7.0f, 11.9662f, 6.4418f, 12.1846f, 6.1352f, 11.8473f)
                close()
            }
            path(fill = SolidColor(Color(0xFF55A76A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.8648f, 4.1749f)
                lineTo(12.739f, 7.3373f)
                curveTo(13.0872f, 7.7204f, 13.087f, 8.3079f, 12.7384f, 8.6907f)
                lineTo(9.8645f, 11.8476f)
                curveTo(9.5578f, 12.1845f, 9.0f, 11.966f, 9.0f, 11.5091f)
                lineTo(9.0f, 4.5131f)
                curveTo(9.0f, 4.056f, 9.5582f, 3.8377f, 9.8648f, 4.1749f)
                close()
            }
        }
        .build()
        return _groupbytestproduction!!
    }

private var _groupbytestproduction: ImageVector? = null
