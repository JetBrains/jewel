package org.jetbrains.jewel.icons.allicons.bookmarks

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
import org.jetbrains.jewel.icons.allicons.BookmarksGroup

public val BookmarksGroup.Mnemonic: IntellijIconData
    get() {
        if (_mnemonic != null) {
            return _mnemonic!!
        }
        _mnemonic = IntellijIconData(name = "Mnemonic",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { MnemonicComposable(it) })
        return _mnemonic!!
    }

private var _mnemonic: IntellijIconData? = null

private fun MnemonicComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "Mnemonic", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFFFFFAEB)), stroke = SolidColor(Color(0xFFFFAF0F)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(3.0f, 1.5f)
        lineTo(13.0f, 1.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 3.0f)
        lineTo(14.5f, 13.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 14.5f)
        lineTo(3.0f, 14.5f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 13.0f)
        lineTo(1.5f, 3.0f)
        arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 1.5f)
        close()
    }
}
.build()
