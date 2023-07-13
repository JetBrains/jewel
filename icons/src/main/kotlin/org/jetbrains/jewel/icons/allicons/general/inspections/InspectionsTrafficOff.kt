package org.jetbrains.jewel.icons.allicons.general.inspections

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
import org.jetbrains.jewel.icons.allicons.general.InspectionsGroup

public val InspectionsGroup.InspectionsTrafficOff: IntellijIconData
    get() {
        if (_inspectionsTrafficOff != null) {
            return _inspectionsTrafficOff!!
        }
        _inspectionsTrafficOff = IntellijIconData(name = "InspectionsTrafficOff",size =
                DpSize(height = 16.0.dp, width = 16.0.dp),imageVector = {
                InspectionsTrafficOffComposable(it) })
        return _inspectionsTrafficOff!!
    }

private var _inspectionsTrafficOff: IntellijIconData? = null

private fun InspectionsTrafficOffComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "InspectionsTrafficOff", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.55f, 12.12f)
        curveTo(3.0534f, 12.12f, 2.6034f, 12.005f, 2.2f, 11.775f)
        curveTo(1.7967f, 11.5417f, 1.4784f, 11.2217f, 1.245f, 10.815f)
        curveTo(1.015f, 10.4083f, 0.9f, 9.95f, 0.9f, 9.44f)
        curveTo(0.9f, 8.93f, 1.015f, 8.4717f, 1.245f, 8.065f)
        curveTo(1.4784f, 7.6583f, 1.7967f, 7.34f, 2.2f, 7.11f)
        curveTo(2.6067f, 6.8767f, 3.0584f, 6.76f, 3.555f, 6.76f)
        curveTo(4.055f, 6.76f, 4.505f, 6.8767f, 4.905f, 7.11f)
        curveTo(5.3084f, 7.34f, 5.625f, 7.6583f, 5.855f, 8.065f)
        curveTo(6.0884f, 8.4717f, 6.205f, 8.93f, 6.205f, 9.44f)
        curveTo(6.205f, 9.95f, 6.0884f, 10.4083f, 5.855f, 10.815f)
        curveTo(5.625f, 11.2217f, 5.3084f, 11.5417f, 4.905f, 11.775f)
        curveTo(4.505f, 12.005f, 4.0534f, 12.12f, 3.55f, 12.12f)
        close()
        moveTo(3.56f, 11.235f)
        curveTo(3.8667f, 11.235f, 4.1434f, 11.16f, 4.39f, 11.01f)
        curveTo(4.6367f, 10.86f, 4.83f, 10.65f, 4.97f, 10.38f)
        curveTo(5.11f, 10.1067f, 5.18f, 9.7933f, 5.18f, 9.44f)
        curveTo(5.18f, 9.0867f, 5.11f, 8.775f, 4.97f, 8.505f)
        curveTo(4.83f, 8.2317f, 4.6367f, 8.02f, 4.39f, 7.87f)
        curveTo(4.1434f, 7.7167f, 3.865f, 7.64f, 3.555f, 7.64f)
        curveTo(3.2484f, 7.64f, 2.97f, 7.7167f, 2.72f, 7.87f)
        curveTo(2.4734f, 8.02f, 2.2784f, 8.2317f, 2.135f, 8.505f)
        curveTo(1.995f, 8.775f, 1.925f, 9.0867f, 1.925f, 9.44f)
        curveTo(1.925f, 9.7933f, 1.995f, 10.1067f, 2.135f, 10.38f)
        curveTo(2.2784f, 10.65f, 2.475f, 10.86f, 2.725f, 11.01f)
        curveTo(2.975f, 11.16f, 3.2534f, 11.235f, 3.56f, 11.235f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(8.0f, 7.735f)
        horizontalLineTo(7.1f)
        verticalLineTo(6.88f)
        horizontalLineTo(8.0f)
        verticalLineTo(6.25f)
        curveTo(8.0f, 6.0067f, 8.0567f, 5.79f, 8.17f, 5.6f)
        curveTo(8.2867f, 5.41f, 8.4467f, 5.2633f, 8.65f, 5.16f)
        curveTo(8.8567f, 5.0533f, 9.0933f, 5.0f, 9.36f, 5.0f)
        horizontalLineTo(10.305f)
        verticalLineTo(5.82f)
        horizontalLineTo(9.51f)
        curveTo(9.3566f, 5.82f, 9.2333f, 5.8667f, 9.14f, 5.96f)
        curveTo(9.0466f, 6.0533f, 9.0f, 6.1767f, 9.0f, 6.33f)
        verticalLineTo(6.88f)
        horizontalLineTo(10.265f)
        verticalLineTo(7.735f)
        horizontalLineTo(9.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(8.0f)
        verticalLineTo(7.735f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(12.0f, 7.735f)
        horizontalLineTo(11.1f)
        verticalLineTo(6.88f)
        horizontalLineTo(12.0f)
        verticalLineTo(6.25f)
        curveTo(12.0f, 6.0067f, 12.0567f, 5.79f, 12.17f, 5.6f)
        curveTo(12.2867f, 5.41f, 12.4666f, 5.2633f, 12.67f, 5.16f)
        curveTo(12.8766f, 5.0533f, 13.0933f, 5.0f, 13.36f, 5.0f)
        horizontalLineTo(14.305f)
        verticalLineTo(5.82f)
        horizontalLineTo(13.51f)
        curveTo(13.3566f, 5.82f, 13.2333f, 5.8667f, 13.14f, 5.96f)
        curveTo(13.0466f, 6.0533f, 13.0f, 6.1767f, 13.0f, 6.33f)
        verticalLineTo(6.88f)
        horizontalLineTo(14.265f)
        verticalLineTo(7.735f)
        horizontalLineTo(13.0f)
        verticalLineTo(12.0f)
        horizontalLineTo(12.0f)
        verticalLineTo(7.735f)
        close()
    }
}
.build()
