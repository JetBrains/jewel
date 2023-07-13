package org.jetbrains.jewel.icons.allicons.ide

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
import org.jetbrains.jewel.icons.allicons.IdeGroup

public val IdeGroup.LocalScope: IntellijIconData
    get() {
        if (_localScope != null) {
            return _localScope!!
        }
        _localScope = IntellijIconData(name = "LocalScope",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { LocalScopeComposable(it) })
        return _localScope!!
    }

private var _localScope: IntellijIconData? = null

private fun LocalScopeComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "LocalScope", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalFill), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(colorScheme.blueFill), stroke = SolidColor(colorScheme.blueStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(10.5f, 8.0f)
        curveTo(10.5f, 9.3807f, 9.3807f, 10.5f, 8.0f, 10.5f)
        curveTo(6.6193f, 10.5f, 5.5f, 9.3807f, 5.5f, 8.0f)
        curveTo(5.5f, 6.6193f, 6.6193f, 5.5f, 8.0f, 5.5f)
        curveTo(9.3807f, 5.5f, 10.5f, 6.6193f, 10.5f, 8.0f)
        close()
    }
}
.build()
