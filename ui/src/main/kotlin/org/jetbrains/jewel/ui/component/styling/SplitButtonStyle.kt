package org.jetbrains.jewel.ui.component.styling

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@Stable
@GenerateDataFunctions
public class SplitButtonStyle(
    public val button: ButtonStyle,
    public val divider: DividerStyle,
) {
    public companion object
}

public val LocalDefaultSplitButtonStyle: ProvidableCompositionLocal<SplitButtonStyle> = staticCompositionLocalOf {
    error("No default SplitButtonStyle provided. Have you forgotten the theme?")
}

public val LocalOutlinedSplitButtonStyle: ProvidableCompositionLocal<SplitButtonStyle> = staticCompositionLocalOf {
    error("No outlined SplitButtonStyle provided. Have you forgotten the theme?")
}
