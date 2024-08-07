package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.jewel.foundation.OverflowBox

@Composable
public fun LazyTableCellContainer(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    content: @Composable () -> Unit,
) {
    OverflowBox(
        modifier = modifier,
        contentAlignment = contentAlignment,
    ) {
        content()
    }
}
