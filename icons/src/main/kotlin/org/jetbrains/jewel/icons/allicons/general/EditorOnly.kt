package org.jetbrains.jewel.icons.allicons.general

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

public val GeneralGroup.EditorOnly: IntellijIconData
    get() {
        if (_editorOnly != null) {
            return _editorOnly!!
        }
        _editorOnly = IntellijIconData(imageVector = { EditorOnlyComposable(it) })
        return _editorOnly!!
    }

private var _editorOnly: IntellijIconData? = null

private fun EditorOnlyComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "EditorOnly", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.5f, 3.0f)
        lineTo(12.5f, 3.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 3.5f)
        lineTo(13.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 4.0f)
        lineTo(3.5f, 4.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 3.5f)
        lineTo(3.0f, 3.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 3.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.5f, 6.0f)
        lineTo(12.5f, 6.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 6.5f)
        lineTo(13.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 7.0f)
        lineTo(3.5f, 7.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 6.5f)
        lineTo(3.0f, 6.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 6.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.5f, 9.0f)
        lineTo(12.5f, 9.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 9.5f)
        lineTo(13.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 10.0f)
        lineTo(3.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 9.5f)
        lineTo(3.0f, 9.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 9.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(3.5f, 12.0f)
        lineTo(12.5f, 12.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 12.5f)
        lineTo(13.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 13.0f)
        lineTo(3.5f, 13.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 12.5f)
        lineTo(3.0f, 12.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 12.0f)
        close()
    }
}
.build()
