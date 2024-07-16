package org.jetbrains.jewel.ui.component.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.ui.component.ToggleState

@Immutable
@GenerateDataFunctions
public class ToggleStyle(
    public val colors: ToggleColors,
    public val metrics: ToggleMetrics
) {
    public companion object
}

@Immutable
@GenerateDataFunctions
public class ToggleColors(
    public val content: Color,
    public val contentDisabled: Color,
) {
    @Composable
    public fun contentFor(state: ToggleState): State<Color> =
        rememberUpdatedState(
            when {
                !state.isEnabled -> contentDisabled
                else -> content
            },
        )

    public companion object
}

@Immutable
@GenerateDataFunctions
public class ToggleMetrics(
    public val cornerSize: CornerSize,
    public val padding: PaddingValues
) {
    public companion object
}

public val LocalToggleStyle: ProvidableCompositionLocal<ToggleStyle> =
    staticCompositionLocalOf {
        error("No ToggleStyle provided. Have you forgotten the theme?")
    }