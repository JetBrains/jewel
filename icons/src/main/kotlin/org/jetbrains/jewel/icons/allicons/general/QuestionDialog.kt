package org.jetbrains.jewel.icons.allicons.general

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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.QuestionDialog: IntellijIconData
    get() {
        if (_questionDialog != null) {
            return _questionDialog!!
        }
        _questionDialog = IntellijIconData(imageVector = { QuestionDialogComposable(it) })
        return _questionDialog!!
    }

private var _questionDialog: IntellijIconData? = null

private fun QuestionDialogComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "QuestionDialog", defaultWidth = 28.0.dp, defaultHeight = 28.0.dp, viewportWidth = 28.0f,
        viewportHeight = 28.0f).apply {
    path(fill = SolidColor(colorScheme.blueSolid), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(14.0f, 14.0f)
        moveToRelative(-12.5f, 0.0f)
        arcToRelative(12.5f, 12.5f, 0.0f, true, true, 25.0f, 0.0f)
        arcToRelative(12.5f, 12.5f, 0.0f, true, true, -25.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(13.9366f, 21.004f)
        curveTo(13.5872f, 21.004f, 13.2868f, 20.8805f, 13.0353f, 20.6333f)
        curveTo(12.7839f, 20.3819f, 12.6582f, 20.0793f, 12.6582f, 19.7256f)
        curveTo(12.6582f, 19.3762f, 12.7839f, 19.0779f, 13.0353f, 18.8307f)
        curveTo(13.2868f, 18.5793f, 13.5872f, 18.4536f, 13.9366f, 18.4536f)
        curveTo(14.2818f, 18.4536f, 14.5801f, 18.5793f, 14.8315f, 18.8307f)
        curveTo(15.0872f, 19.0779f, 15.215f, 19.3762f, 15.215f, 19.7256f)
        curveTo(15.215f, 19.96f, 15.1554f, 20.1752f, 15.036f, 20.3712f)
        curveTo(14.921f, 20.563f, 14.7676f, 20.7164f, 14.5758f, 20.8315f)
        curveTo(14.3841f, 20.9465f, 14.171f, 21.004f, 13.9366f, 21.004f)
        close()
    }
    path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(13.8358f, 16.5f)
        curveTo(13.3589f, 16.5f, 12.9724f, 16.1134f, 12.9724f, 15.6366f)
        verticalLineTo(15.6366f)
        curveTo(12.9809f, 14.8791f, 13.0597f, 14.6127f, 13.2089f, 14.1647f)
        curveTo(13.3623f, 13.7168f, 13.5796f, 13.3543f, 13.8609f, 13.0774f)
        curveTo(14.1421f, 12.8005f, 14.4809f, 12.548f, 14.8772f, 12.3199f)
        curveTo(15.1329f, 12.1652f, 15.363f, 11.9921f, 15.5676f, 11.8007f)
        curveTo(15.7721f, 11.6093f, 15.934f, 11.3894f, 16.0533f, 11.1409f)
        curveTo(16.1727f, 10.8925f, 16.2316f, 10.6123f, 16.2316f, 10.3109f)
        curveTo(16.2316f, 9.9485f, 16.1421f, 9.6349f, 15.9632f, 9.3702f)
        curveTo(15.7842f, 9.1054f, 15.5455f, 8.9018f, 15.2472f, 8.7593f)
        curveTo(14.9532f, 8.6127f, 14.6251f, 8.5394f, 14.2629f, 8.5394f)
        curveTo(13.9347f, 8.5394f, 13.6215f, 8.6045f, 13.3232f, 8.7349f)
        curveTo(13.0249f, 8.8652f, 12.7778f, 9.0688f, 12.5818f, 9.3457f)
        curveTo(12.5422f, 9.4008f, 12.5061f, 9.459f, 12.4733f, 9.5205f)
        curveTo(12.2301f, 9.9768f, 11.8418f, 10.4025f, 11.3246f, 10.4025f)
        verticalLineTo(10.4025f)
        curveTo(10.7655f, 10.4025f, 10.2997f, 9.928f, 10.4658f, 9.3941f)
        curveTo(10.5629f, 9.0824f, 10.7014f, 8.7995f, 10.8815f, 8.5455f)
        curveTo(11.2394f, 8.0364f, 11.7124f, 7.6516f, 12.3005f, 7.391f)
        curveTo(12.8928f, 7.1303f, 13.547f, 7.0f, 14.2629f, 7.0f)
        curveTo(15.047f, 7.0f, 15.733f, 7.1405f, 16.3211f, 7.4215f)
        curveTo(16.9092f, 7.6984f, 17.3651f, 8.0873f, 17.689f, 8.5883f)
        curveTo(18.0171f, 9.0851f, 18.1812f, 9.6654f, 18.1812f, 10.3292f)
        curveTo(18.1812f, 10.7853f, 18.1073f, 11.202f, 17.9582f, 11.5685f)
        curveTo(17.809f, 11.931f, 17.596f, 12.2548f, 17.319f, 12.5398f)
        curveTo(17.0462f, 12.8249f, 16.7181f, 13.0774f, 16.3346f, 13.2973f)
        curveTo(15.9724f, 13.5131f, 15.6783f, 13.7371f, 15.4525f, 13.9692f)
        curveTo(15.2309f, 14.2014f, 15.068f, 14.4062f, 14.9658f, 14.7239f)
        curveTo(14.8635f, 15.0415f, 14.809f, 15.1683f, 14.8005f, 15.6366f)
        verticalLineTo(15.6366f)
        curveTo(14.8005f, 16.1134f, 14.4139f, 16.5f, 13.9371f, 16.5f)
        horizontalLineTo(13.8358f)
        close()
    }
}
.build()
