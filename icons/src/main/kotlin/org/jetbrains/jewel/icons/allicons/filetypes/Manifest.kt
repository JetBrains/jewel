package org.jetbrains.jewel.icons.allicons.filetypes

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
import org.jetbrains.jewel.icons.allicons.FiletypesGroup

public val FiletypesGroup.Manifest: IntellijIconData
    get() {
        if (_manifest != null) {
            return _manifest!!
        }
        _manifest = IntellijIconData(imageVector = { ManifestComposable(it) })
        return _manifest!!
    }

private var _manifest: IntellijIconData? = null

private fun ManifestComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Manifest", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFAF5FF)), stroke = SolidColor(Color(0xFF834DF0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(4.0f, 2.5f)
        lineTo(12.0f, 2.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 4.0f)
        lineTo(13.5f, 12.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 13.5f)
        lineTo(4.0f, 13.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 12.0f)
        lineTo(2.5f, 4.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 2.5f)
        close()
    }
    path(fill = SolidColor(Color(0xFF834DF0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(5.6449f, 11.0f)
        horizontalLineTo(4.5469f)
        verticalLineTo(4.7f)
        horizontalLineTo(5.9734f)
        lineTo(7.9039f, 9.2495f)
        lineTo(8.0119f, 9.6005f)
        lineTo(8.1154f, 9.2495f)
        lineTo(10.0054f, 4.7f)
        horizontalLineTo(11.4499f)
        verticalLineTo(11.0f)
        horizontalLineTo(10.3474f)
        verticalLineTo(6.518f)
        lineTo(10.3609f, 6.2795f)
        lineTo(8.4034f, 11.0f)
        horizontalLineTo(7.5799f)
        lineTo(5.6314f, 6.311f)
        lineTo(5.6449f, 6.518f)
        verticalLineTo(11.0f)
        close()
    }
}
.build()
