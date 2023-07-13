package org.jetbrains.jewel.icons.allicons.javaee

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.JavaeeGroup

public val JavaeeGroup.WebServiceClient: IntellijIconData
    get() {
        if (_webServiceClient != null) {
            return _webServiceClient!!
        }
        _webServiceClient = IntellijIconData(name = "WebServiceClient",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { WebServiceClientComposable(it) })
        return _webServiceClient!!
    }

private var _webServiceClient: IntellijIconData? = null

private fun WebServiceClientComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "WebServiceClient", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(14.0f, 9.0f)
        curveTo(14.0f, 10.1046f, 13.1046f, 11.0f, 12.0f, 11.0f)
        curveTo(10.8954f, 11.0f, 10.0f, 10.1046f, 10.0f, 9.0f)
        curveTo(10.0f, 7.8954f, 10.8954f, 7.0f, 12.0f, 7.0f)
        curveTo(13.1046f, 7.0f, 14.0f, 7.8954f, 14.0f, 9.0f)
        close()
        moveTo(13.0f, 9.0f)
        curveTo(13.0f, 9.5523f, 12.5523f, 10.0f, 12.0f, 10.0f)
        curveTo(11.4477f, 10.0f, 11.0f, 9.5523f, 11.0f, 9.0f)
        curveTo(11.0f, 8.4477f, 11.4477f, 8.0f, 12.0f, 8.0f)
        curveTo(12.5523f, 8.0f, 13.0f, 8.4477f, 13.0f, 9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(13.0f, 12.0f)
        horizontalLineTo(11.0f)
        curveTo(9.3432f, 12.0f, 8.0f, 13.3431f, 8.0f, 15.0f)
        curveTo(8.0f, 15.5523f, 8.4477f, 16.0f, 9.0f, 16.0f)
        horizontalLineTo(15.0f)
        curveTo(15.5523f, 16.0f, 16.0f, 15.5523f, 16.0f, 15.0f)
        curveTo(16.0f, 13.3431f, 14.6569f, 12.0f, 13.0f, 12.0f)
        close()
        moveTo(9.0f, 15.0f)
        curveTo(9.0f, 13.8954f, 9.8954f, 13.0f, 11.0f, 13.0f)
        horizontalLineTo(13.0f)
        curveTo(14.1046f, 13.0f, 15.0f, 13.8954f, 15.0f, 15.0f)
        horizontalLineTo(9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.0f, 10.0f)
        curveTo(12.5523f, 10.0f, 13.0f, 9.5523f, 13.0f, 9.0f)
        curveTo(13.0f, 8.4477f, 12.5523f, 8.0f, 12.0f, 8.0f)
        curveTo(11.4477f, 8.0f, 11.0f, 8.4477f, 11.0f, 9.0f)
        curveTo(11.0f, 9.5523f, 11.4477f, 10.0f, 12.0f, 10.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.blueFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(11.0f, 13.0f)
        curveTo(9.8954f, 13.0f, 9.0f, 13.8954f, 9.0f, 15.0f)
        horizontalLineTo(15.0f)
        curveTo(15.0f, 13.8954f, 14.1046f, 13.0f, 13.0f, 13.0f)
        horizontalLineTo(11.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(8.0f, 1.0f)
        curveTo(11.866f, 1.0f, 15.0f, 4.134f, 15.0f, 8.0f)
        curveTo(15.0f, 8.2038f, 14.9913f, 8.4056f, 14.9742f, 8.605f)
        curveTo(14.8691f, 7.8058f, 14.4494f, 7.1057f, 13.8436f, 6.6332f)
        curveTo(13.7934f, 6.4174f, 13.7314f, 6.2061f, 13.6586f, 6.0f)
        horizontalLineTo(10.8758f)
        curveTo(10.8845f, 6.0688f, 10.8929f, 6.1381f, 10.9008f, 6.2078f)
        curveTo(10.5473f, 6.347f, 10.2267f, 6.5514f, 9.9537f, 6.8062f)
        curveTo(9.9319f, 6.5298f, 9.9028f, 6.2607f, 9.8671f, 6.0f)
        horizontalLineTo(6.1329f)
        curveTo(6.0474f, 6.6235f, 6.0f, 7.2954f, 6.0f, 8.0f)
        curveTo(6.0f, 8.7046f, 6.0474f, 9.3764f, 6.1329f, 10.0f)
        horizontalLineTo(9.1707f)
        curveTo(9.3024f, 10.3726f, 9.5056f, 10.7115f, 9.7639f, 11.0f)
        horizontalLineTo(6.311f)
        curveTo(6.4412f, 11.586f, 6.6069f, 12.1104f, 6.7978f, 12.5558f)
        curveTo(6.9616f, 12.9379f, 7.1347f, 13.2404f, 7.3037f, 13.4685f)
        curveTo(7.1165f, 13.9196f, 7.0096f, 14.4125f, 7.0006f, 14.9292f)
        curveTo(3.608f, 14.4442f, 1.0f, 11.5267f, 1.0f, 8.0f)
        curveTo(1.0f, 4.134f, 4.134f, 1.0f, 8.0f, 1.0f)
        close()
        moveTo(5.1242f, 10.0f)
        horizontalLineTo(2.3414f)
        curveTo(2.1203f, 9.3744f, 2.0f, 8.7013f, 2.0f, 8.0f)
        curveTo(2.0f, 7.2987f, 2.1203f, 6.6256f, 2.3414f, 6.0f)
        horizontalLineTo(5.1242f)
        curveTo(5.0434f, 6.6337f, 5.0f, 7.305f, 5.0f, 8.0f)
        curveTo(5.0f, 8.695f, 5.0434f, 9.3663f, 5.1242f, 10.0f)
        close()
        moveTo(2.8027f, 11.0f)
        horizontalLineTo(5.2887f)
        curveTo(5.5146f, 12.1094f, 5.8618f, 13.0582f, 6.2904f, 13.7529f)
        curveTo(4.8064f, 13.3126f, 3.5627f, 12.3137f, 2.8027f, 11.0f)
        close()
        moveTo(6.311f, 5.0f)
        horizontalLineTo(9.6889f)
        curveTo(9.5588f, 4.414f, 9.3931f, 3.8896f, 9.2022f, 3.4442f)
        curveTo(8.9625f, 2.8849f, 8.7028f, 2.4962f, 8.4653f, 2.2618f)
        curveTo(8.2321f, 2.0317f, 8.076f, 2.0f, 8.0f, 2.0f)
        curveTo(7.924f, 2.0f, 7.7679f, 2.0317f, 7.5347f, 2.2618f)
        curveTo(7.2972f, 2.4962f, 7.0375f, 2.8849f, 6.7978f, 3.4442f)
        curveTo(6.6069f, 3.8896f, 6.4412f, 4.414f, 6.311f, 5.0f)
        close()
        moveTo(10.7113f, 5.0f)
        horizontalLineTo(13.1973f)
        curveTo(12.4373f, 3.6862f, 11.1936f, 2.6874f, 9.7096f, 2.2471f)
        curveTo(10.1382f, 2.9418f, 10.4854f, 3.8906f, 10.7113f, 5.0f)
        close()
        moveTo(6.2904f, 2.2471f)
        curveTo(5.8618f, 2.9418f, 5.5146f, 3.8906f, 5.2887f, 5.0f)
        horizontalLineTo(2.8027f)
        curveTo(3.5627f, 3.6862f, 4.8064f, 2.6874f, 6.2904f, 2.2471f)
        close()
    }
}
.build()
