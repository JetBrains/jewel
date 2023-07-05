package org.jetbrains.jewel.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.IntelliJTheme

@Composable
fun IntellijIcon(
    iconData: IntellijIconData,
    contentDescription: String?,
    modifier: Modifier = Modifier,
) {
    Image(
        imageVector = iconData.composeImageVector(),
        contentDescription = contentDescription,
        modifier = modifier.size(64.dp)
    )
}

class IntellijIconData(
    private val imageVector: @Composable (IntelliJIconColors) -> ImageVector
) {
    @Composable
    fun composeImageVector(): ImageVector {
        return imageVector(IntelliJTheme.iconColors)
    }
}

