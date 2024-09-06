package org.jetbrains.jewel.bridge

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.jetbrains.jewel.bridge.theme.default
import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility
import org.jetbrains.jewel.ui.component.styling.TrackClickBehavior

internal interface ScrollbarHelper {
    val scrollbarVisibilityStyleFlow: StateFlow<ScrollbarVisibility>
    val trackClickBehaviorFlow: StateFlow<TrackClickBehavior>

    companion object {
        @JvmStatic fun getInstance(): ScrollbarHelper = DummyScrollbarHelper
    }
}

private object DummyScrollbarHelper : ScrollbarHelper {
    override val scrollbarVisibilityStyleFlow: StateFlow<ScrollbarVisibility> =
        MutableStateFlow(ScrollbarVisibility.AlwaysVisible.default())
    override val trackClickBehaviorFlow: StateFlow<TrackClickBehavior> = MutableStateFlow(TrackClickBehavior.JumpToSpot)
}
