package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntOffset

public interface LazyTableItemScope {

    @ExperimentalFoundationApi
    public fun Modifier.animateItemPlacement(
        animationSpec: FiniteAnimationSpec<IntOffset> = spring(
            stiffness = Spring.StiffnessMediumLow,
            visibilityThreshold = IntOffset.VisibilityThreshold,
        ),
    ): Modifier
}

internal class LazyTableItemScopeImpl : LazyTableItemScope {

    override fun Modifier.animateItemPlacement(animationSpec: FiniteAnimationSpec<IntOffset>): Modifier = this
}
