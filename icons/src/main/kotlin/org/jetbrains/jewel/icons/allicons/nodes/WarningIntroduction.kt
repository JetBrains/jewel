package org.jetbrains.jewel.icons.allicons.nodes

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.WarningIntroduction: IntellijIconData
    get() {
        if (_warningIntroduction != null) {
            return _warningIntroduction!!
        }
        _warningIntroduction = IntellijIconData(imageVector = { WarningIntroductionComposable(it) })
        return _warningIntroduction!!
    }

private var _warningIntroduction: IntellijIconData? = null

private fun WarningIntroductionComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "WarningIntroduction", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFFAEB)), stroke = SolidColor(Color(0xFFC27D04)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(7.566f, 1.7675f)
        curveTo(7.758f, 1.4316f, 8.2423f, 1.4316f, 8.4343f, 1.7675f)
        lineTo(14.711f, 12.7519f)
        curveTo(14.9014f, 13.0853f, 14.6607f, 13.5f, 14.2768f, 13.5f)
        horizontalLineTo(1.7232f)
        curveTo(1.3393f, 13.5f, 1.0986f, 13.0853f, 1.2891f, 12.7519f)
        lineTo(7.566f, 1.7675f)
        close()
    }
    path(fill = SolidColor(Color(0xFFC27D04)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(7.9999f, 5.0016f)
        curveTo(8.3313f, 5.0016f, 8.5999f, 5.2702f, 8.5999f, 5.6016f)
        lineTo(8.5999f, 9.0f)
        curveTo(8.5999f, 9.3314f, 8.3313f, 9.6f, 7.9999f, 9.6f)
        curveTo(7.6685f, 9.6f, 7.3999f, 9.3314f, 7.3999f, 9.0f)
        lineTo(7.3999f, 5.6016f)
        curveTo(7.3999f, 5.2702f, 7.6685f, 5.0016f, 7.9999f, 5.0016f)
        close()
    }
    path(fill = SolidColor(Color(0xFFC27D04)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.8002f, 11.2f)
        curveTo(8.8002f, 11.6419f, 8.442f, 12.0f, 8.0002f, 12.0f)
        curveTo(7.5584f, 12.0f, 7.2002f, 11.6419f, 7.2002f, 11.2f)
        curveTo(7.2002f, 10.7582f, 7.5584f, 10.4f, 8.0002f, 10.4f)
        curveTo(8.442f, 10.4f, 8.8002f, 10.7582f, 8.8002f, 11.2f)
        close()
    }
}
.build()
