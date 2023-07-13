package org.jetbrains.jewel.icons.allicons.gutter

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
import org.jetbrains.jewel.icons.allicons.GutterGroup

public val GutterGroup.Mnemonic: IntellijIconData
    get() {
        if (_mnemonic != null) {
            return _mnemonic!!
        }
        _mnemonic = IntellijIconData(name = "Mnemonic",size = DpSize(height = 14.0.dp, width =
                14.0.dp),imageVector = { MnemonicComposable(it) })
        return _mnemonic!!
    }

private var _mnemonic: IntellijIconData? = null

private fun MnemonicComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Mnemonic", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth = 14.0f,
        viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFFFFAEB)), stroke = SolidColor(Color(0xFFFFAF0F)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(0.5f, 12.0f)
        verticalLineTo(2.0f)
        curveTo(0.5f, 1.1716f, 1.1716f, 0.5f, 2.0f, 0.5f)
        horizontalLineTo(12.0f)
        curveTo(12.8284f, 0.5f, 13.5f, 1.1716f, 13.5f, 2.0f)
        verticalLineTo(12.0f)
        curveTo(13.5f, 12.8284f, 12.8284f, 13.5f, 12.0f, 13.5f)
        horizontalLineTo(2.0f)
        curveTo(1.1716f, 13.5f, 0.5f, 12.8284f, 0.5f, 12.0f)
        close()
    }
}
.build()
