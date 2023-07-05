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

public val GeneralGroup.EditorPreviewVertical: IntellijIconData
    get() {
        if (_editorPreviewVertical != null) {
            return _editorPreviewVertical!!
        }
        _editorPreviewVertical = IntellijIconData(imageVector = {
                EditorPreviewVerticalComposable(it) })
        return _editorPreviewVertical!!
    }

private var _editorPreviewVertical: IntellijIconData? = null

private fun EditorPreviewVerticalComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "EditorPreviewVertical", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
        viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0f, 2.5f)
        curveTo(2.0f, 2.2239f, 2.2239f, 2.0f, 2.5f, 2.0f)
        lineTo(13.5f, 2.0f)
        curveTo(13.7761f, 2.0f, 14.0f, 2.2239f, 14.0f, 2.5f)
        curveTo(14.0f, 2.7761f, 13.7761f, 3.0f, 13.5f, 3.0f)
        lineTo(2.5f, 3.0f)
        curveTo(2.2239f, 3.0f, 2.0f, 2.7761f, 2.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(2.0f, 5.5f)
        curveTo(2.0f, 5.2239f, 2.2239f, 5.0f, 2.5f, 5.0f)
        lineTo(13.5f, 5.0f)
        curveTo(13.7761f, 5.0f, 14.0f, 5.2239f, 14.0f, 5.5f)
        curveTo(14.0f, 5.7761f, 13.7761f, 6.0f, 13.5f, 6.0f)
        lineTo(2.5f, 6.0f)
        curveTo(2.2239f, 6.0f, 2.0f, 5.7761f, 2.0f, 5.5f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(12.0f, 8.5f)
        curveTo(12.8284f, 8.5f, 13.5f, 9.1716f, 13.5f, 10.0f)
        lineTo(13.5f, 12.0f)
        curveTo(13.5f, 12.8284f, 12.8284f, 13.5f, 12.0f, 13.5f)
        lineTo(4.0f, 13.5f)
        curveTo(3.1716f, 13.5f, 2.5f, 12.8284f, 2.5f, 12.0f)
        lineTo(2.5f, 10.0f)
        curveTo(2.5f, 9.1716f, 3.1716f, 8.5f, 4.0f, 8.5f)
        lineTo(12.0f, 8.5f)
        close()
    }
}
.build()
