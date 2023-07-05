package org.jetbrains.jewel.icons.allicons.filetypes

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

public val FiletypesGroup.IdeaModule: IntellijIconData
    get() {
        if (_ideaModule != null) {
            return _ideaModule!!
        }
        _ideaModule = IntellijIconData(imageVector = { IdeaModuleComposable(it) })
        return _ideaModule!!
    }

private var _ideaModule: IntellijIconData? = null

private fun IdeaModuleComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "IdeaModule", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = SolidColor(colorScheme.generalStroke),
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
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(5.5f, 10.0f)
        lineTo(8.5f, 10.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 10.5f)
        lineTo(9.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 11.0f)
        lineTo(5.5f, 11.0f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 10.5f)
        lineTo(5.0f, 10.5f)
        arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 10.0f)
        close()
    }
}
.build()
