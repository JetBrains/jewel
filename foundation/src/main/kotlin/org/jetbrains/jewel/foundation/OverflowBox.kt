package org.jetbrains.jewel.foundation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.Constraints
import org.jetbrains.jewel.foundation.modifier.onHover

@ExperimentalJewelApi
@Composable
public fun OverflowBox(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    overflowZIndex: Float = 1f,
    content: @Composable BoxScope.() -> Unit,
) {
    var showOverflow by remember { mutableStateOf(false) }

    Box(
        Modifier.layout { measurable, constraints ->
            val predictWidth = measurable.maxIntrinsicWidth(constraints.maxHeight)
            val constraintWith = constraints.maxWidth

            val overflowing = showOverflow && predictWidth > constraintWith

            val targetConstraints = if (overflowing) {
                constraints.copy(
                    minWidth = 0,
                    maxWidth = Constraints.Infinity,
                )
            } else {
                constraints
            }
            val zIndex = if (overflowing) overflowZIndex else 0f

            // Trick for overflow layout, I don't know why cell align center without offset.
            val offset = if (overflowing) (predictWidth - constraintWith) / 2 else 0

            val placements = measurable.measure(targetConstraints)
            layout(placements.width, placements.height) {
                placements.placeRelative(offset, 0, zIndex)
            }
        }.onHover {
            showOverflow = it
        }.then(modifier),
        contentAlignment = contentAlignment,
        content = content,
    )
}
