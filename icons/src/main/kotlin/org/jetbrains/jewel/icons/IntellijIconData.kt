package org.jetbrains.jewel.icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.DpSize
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.IntelliJTheme

class IntellijIconData(
    val name: String,
    val size: DpSize,
    private val imageVector: @Composable (IntelliJIconColors) -> ImageVector
) {
    @Composable
    fun composeImageVector(): ImageVector {
        return imageVector(IntelliJTheme.iconColors)
    }
}

