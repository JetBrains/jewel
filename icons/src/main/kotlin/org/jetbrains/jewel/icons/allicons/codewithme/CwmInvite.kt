package org.jetbrains.jewel.icons.allicons.codewithme

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
import org.jetbrains.jewel.icons.allicons.CodewithmeGroup

public val CodewithmeGroup.CwmInvite: IntellijIconData
    get() {
        if (_cwmInvite != null) {
            return _cwmInvite!!
        }
        _cwmInvite = IntellijIconData(imageVector = { CwmInviteComposable(it) })
        return _cwmInvite!!
    }

private var _cwmInvite: IntellijIconData? = null

private fun CwmInviteComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "CwmInvite", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.7072f, 9.5857f)
        curveTo(11.5119f, 9.3904f, 11.5119f, 9.0738f, 11.7072f, 8.8785f)
        lineTo(13.0507f, 7.535f)
        curveTo(14.317f, 6.2687f, 14.317f, 4.2156f, 13.0507f, 2.9493f)
        curveTo(11.7843f, 1.6829f, 9.7312f, 1.6829f, 8.4649f, 2.9493f)
        lineTo(7.1214f, 4.2928f)
        curveTo(6.9261f, 4.488f, 6.6095f, 4.488f, 6.4143f, 4.2928f)
        curveTo(6.219f, 4.0975f, 6.219f, 3.7809f, 6.4143f, 3.5857f)
        lineTo(7.7578f, 2.2422f)
        curveTo(9.4146f, 0.5853f, 12.1009f, 0.5853f, 13.7578f, 2.2422f)
        curveTo(15.4146f, 3.899f, 15.4146f, 6.5853f, 13.7578f, 8.2422f)
        lineTo(12.4143f, 9.5857f)
        curveTo(12.219f, 9.7809f, 11.9024f, 9.7809f, 11.7072f, 9.5857f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(10.6464f, 4.6464f)
        curveTo(10.8417f, 4.4511f, 11.1583f, 4.4511f, 11.3536f, 4.6464f)
        curveTo(11.5488f, 4.8417f, 11.5488f, 5.1582f, 11.3536f, 5.3535f)
        lineTo(5.3535f, 11.3535f)
        curveTo(5.1583f, 11.5488f, 4.8417f, 11.5488f, 4.6465f, 11.3535f)
        curveTo(4.4512f, 11.1582f, 4.4512f, 10.8416f, 4.6465f, 10.6464f)
        lineTo(10.6464f, 4.6464f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.2929f, 6.4142f)
        curveTo(4.4882f, 6.6094f, 4.4882f, 6.926f, 4.2929f, 7.1213f)
        lineTo(2.9532f, 8.461f)
        curveTo(1.6868f, 9.7273f, 1.6868f, 11.7804f, 2.9532f, 13.0468f)
        curveTo(4.2195f, 14.3131f, 6.2726f, 14.3131f, 7.5389f, 13.0468f)
        lineTo(8.8787f, 11.707f)
        curveTo(9.074f, 11.5118f, 9.3905f, 11.5117f, 9.5858f, 11.707f)
        curveTo(9.7811f, 11.9022f, 9.7811f, 12.2188f, 9.5858f, 12.4141f)
        lineTo(8.2461f, 13.7539f)
        curveTo(6.5892f, 15.4107f, 3.9029f, 15.4107f, 2.2461f, 13.7539f)
        curveTo(0.5892f, 12.097f, 0.5892f, 9.4107f, 2.2461f, 7.7539f)
        lineTo(3.5858f, 6.4142f)
        curveTo(3.781f, 6.2189f, 4.0976f, 6.2189f, 4.2929f, 6.4142f)
        close()
    }
}
.build()
