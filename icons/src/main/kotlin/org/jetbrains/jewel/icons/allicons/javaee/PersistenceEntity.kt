package org.jetbrains.jewel.icons.allicons.javaee

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.JavaeeGroup

public val JavaeeGroup.PersistenceEntity: IntellijIconData
    get() {
        if (_persistenceEntity != null) {
            return _persistenceEntity!!
        }
        _persistenceEntity = IntellijIconData(name = "PersistenceEntity",size = DpSize(height =
                16.0.dp, width = 16.0.dp),imageVector = { PersistenceEntityComposable(it) })
        return _persistenceEntity!!
    }

private var _persistenceEntity: IntellijIconData? = null

private fun PersistenceEntityComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "PersistenceEntity", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
        16.0f, viewportHeight = 16.0f).apply {
    group {
        path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                EvenOdd) {
            moveTo(2.0166f, 3.3925f)
            horizontalLineTo(2.0f)
            verticalLineTo(12.5184f)
            horizontalLineTo(2.0026f)
            curveTo(2.0305f, 12.9621f, 2.2768f, 13.3344f, 2.5969f, 13.6237f)
            curveTo(2.9371f, 13.9312f, 3.4013f, 14.1852f, 3.9324f, 14.3882f)
            curveTo(4.9979f, 14.7956f, 6.4362f, 15.0371f, 8.0f, 15.0371f)
            curveTo(8.0001f, 15.0371f, 7.9999f, 15.0371f, 8.0f, 15.0371f)
            curveTo(7.9998f, 15.0247f, 8.0f, 15.0124f, 8.0f, 15.0f)
            verticalLineTo(14.0371f)
            curveTo(6.5262f, 14.0371f, 5.2145f, 13.8078f, 4.2895f, 13.4542f)
            curveTo(3.8252f, 13.2767f, 3.484f, 13.0775f, 3.2675f, 12.8819f)
            curveTo(3.051f, 12.6862f, 3.0f, 12.5341f, 3.0f, 12.4343f)
            verticalLineTo(10.985f)
            curveTo(3.2724f, 11.1599f, 3.5883f, 11.3128f, 3.9324f, 11.4444f)
            curveTo(4.9979f, 11.8518f, 6.4362f, 12.0932f, 8.0f, 12.0932f)
            verticalLineTo(11.0932f)
            curveTo(6.5262f, 11.0932f, 5.2145f, 10.864f, 4.2895f, 10.5103f)
            curveTo(3.8252f, 10.3328f, 3.484f, 10.1337f, 3.2675f, 9.938f)
            curveTo(3.051f, 9.7424f, 3.0f, 9.5903f, 3.0f, 9.4905f)
            verticalLineTo(8.0411f)
            curveTo(3.2724f, 8.2161f, 3.5883f, 8.369f, 3.9324f, 8.5005f)
            curveTo(4.9979f, 8.9079f, 6.4362f, 9.1494f, 8.0f, 9.1494f)
            curveTo(8.0635f, 9.1494f, 8.1269f, 9.149f, 8.1899f, 9.1482f)
            curveTo(8.4369f, 8.6244f, 8.9044f, 8.2252f, 9.4727f, 8.0702f)
            curveTo(9.0078f, 8.1215f, 8.5138f, 8.1494f, 8.0f, 8.1494f)
            curveTo(6.5262f, 8.1494f, 5.2145f, 7.9201f, 4.2895f, 7.5665f)
            curveTo(3.8252f, 7.389f, 3.484f, 7.1898f, 3.2675f, 6.9942f)
            curveTo(3.051f, 6.7985f, 3.0f, 6.6465f, 3.0f, 6.5466f)
            verticalLineTo(5.0972f)
            curveTo(3.2724f, 5.2722f, 3.5883f, 5.4251f, 3.9324f, 5.5567f)
            curveTo(4.9979f, 5.964f, 6.4362f, 6.2055f, 8.0f, 6.2055f)
            curveTo(9.5638f, 6.2055f, 11.0021f, 5.964f, 12.0676f, 5.5567f)
            curveTo(12.4117f, 5.4251f, 12.7276f, 5.2722f, 13.0f, 5.0972f)
            verticalLineTo(6.5466f)
            curveTo(13.0f, 6.6465f, 12.949f, 6.7985f, 12.7325f, 6.9942f)
            curveTo(12.516f, 7.1898f, 12.1748f, 7.389f, 11.7105f, 7.5665f)
            curveTo(11.2335f, 7.7489f, 10.6535f, 7.8982f, 10.0016f, 8.0f)
            lineTo(14.0f, 8.0f)
            verticalLineTo(3.3925f)
            horizontalLineTo(13.9834f)
            curveTo(13.9213f, 3.0041f, 13.6924f, 2.6748f, 13.4031f, 2.4133f)
            curveTo(13.0629f, 2.1059f, 12.5987f, 1.8519f, 12.0676f, 1.6488f)
            curveTo(11.0021f, 1.2415f, 9.5638f, 1.0f, 8.0f, 1.0f)
            curveTo(6.4362f, 1.0f, 4.9979f, 1.2415f, 3.9324f, 1.6488f)
            curveTo(3.4013f, 1.8519f, 2.9371f, 2.1059f, 2.5969f, 2.4133f)
            curveTo(2.3077f, 2.6748f, 2.0786f, 3.0041f, 2.0166f, 3.3925f)
            close()
            moveTo(3.2675f, 3.1552f)
            curveTo(3.051f, 3.3509f, 3.0f, 3.5029f, 3.0f, 3.6028f)
            curveTo(3.0f, 3.7026f, 3.051f, 3.8546f, 3.2675f, 4.0503f)
            curveTo(3.484f, 4.246f, 3.8252f, 4.4451f, 4.2895f, 4.6226f)
            curveTo(5.2145f, 4.9763f, 6.5262f, 5.2055f, 8.0f, 5.2055f)
            curveTo(9.4738f, 5.2055f, 10.7855f, 4.9763f, 11.7105f, 4.6226f)
            curveTo(12.1748f, 4.4451f, 12.516f, 4.246f, 12.7325f, 4.0503f)
            curveTo(12.949f, 3.8546f, 13.0f, 3.7026f, 13.0f, 3.6028f)
            curveTo(13.0f, 3.5029f, 12.949f, 3.3509f, 12.7325f, 3.1552f)
            curveTo(12.516f, 2.9595f, 12.1748f, 2.7604f, 11.7105f, 2.5829f)
            curveTo(10.7855f, 2.2292f, 9.4738f, 2.0f, 8.0f, 2.0f)
            curveTo(6.5262f, 2.0f, 5.2145f, 2.2292f, 4.2895f, 2.5829f)
            curveTo(3.8252f, 2.7604f, 3.484f, 2.9595f, 3.2675f, 3.1552f)
            close()
        }
        path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                EvenOdd) {
            moveTo(10.0f, 9.0f)
            curveTo(9.4477f, 9.0f, 9.0f, 9.4477f, 9.0f, 10.0f)
            lineTo(9.0f, 15.0f)
            curveTo(9.0f, 15.5523f, 9.4477f, 16.0f, 10.0f, 16.0f)
            lineTo(15.0f, 16.0f)
            curveTo(15.5523f, 16.0f, 16.0f, 15.5523f, 16.0f, 15.0f)
            lineTo(16.0f, 10.0f)
            curveTo(16.0f, 9.4477f, 15.5523f, 9.0f, 15.0f, 9.0f)
            lineTo(10.0f, 9.0f)
            close()
            moveTo(10.0f, 11.0f)
            lineTo(10.0f, 10.0f)
            horizontalLineTo(12.0f)
            lineTo(12.0f, 11.0f)
            horizontalLineTo(10.0f)
            close()
            moveTo(10.0f, 12.0f)
            lineTo(10.0f, 15.0f)
            horizontalLineTo(12.0f)
            lineTo(12.0f, 12.0f)
            horizontalLineTo(10.0f)
            close()
            moveTo(13.0f, 15.0f)
            horizontalLineTo(15.0f)
            lineTo(15.0f, 12.0f)
            horizontalLineTo(13.0f)
            lineTo(13.0f, 15.0f)
            close()
            moveTo(15.0f, 11.0f)
            lineTo(15.0f, 10.0f)
            horizontalLineTo(13.0f)
            lineTo(13.0f, 11.0f)
            horizontalLineTo(15.0f)
            close()
        }
    }
}
.build()
