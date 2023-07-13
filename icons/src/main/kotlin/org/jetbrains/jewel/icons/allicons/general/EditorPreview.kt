package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.ui.graphics.Color
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
import org.jetbrains.jewel.icons.allicons.GeneralGroup

public val GeneralGroup.EditorPreview: IntellijIconData
    get() {
        if (_editorPreview != null) {
            return _editorPreview!!
        }
        _editorPreview = IntellijIconData(name = "EditorPreview",size = DpSize(height = 16.0.dp,
                width = 16.0.dp),imageVector = { EditorPreviewComposable(it) })
        return _editorPreview!!
    }

private var _editorPreview: IntellijIconData? = null

private fun EditorPreviewComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "EditorPreview", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 3.0f)
        lineTo(5.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 3.5f)
        lineTo(6.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 4.0f)
        lineTo(1.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 3.5f)
        lineTo(1.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 6.0f)
        lineTo(5.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 6.5f)
        lineTo(6.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 7.0f)
        lineTo(1.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 6.5f)
        lineTo(1.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 9.0f)
        lineTo(5.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 9.5f)
        lineTo(6.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 10.0f)
        lineTo(1.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 9.5f)
        lineTo(1.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(1.5f, 12.0f)
        lineTo(5.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 12.5f)
        lineTo(6.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 13.0f)
        lineTo(1.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 12.5f)
        lineTo(1.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 12.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.5f, 4.0f)
        curveTo(8.5f, 3.1716f, 9.1716f, 2.5f, 10.0f, 2.5f)
        horizontalLineTo(13.0f)
        curveTo(13.8284f, 2.5f, 14.5f, 3.1716f, 14.5f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(14.5f, 12.8284f, 13.8284f, 13.5f, 13.0f, 13.5f)
        horizontalLineTo(10.0f)
        curveTo(9.1716f, 13.5f, 8.5f, 12.8284f, 8.5f, 12.0f)
        verticalLineTo(4.0f)
        close()
    }
}
.build()
