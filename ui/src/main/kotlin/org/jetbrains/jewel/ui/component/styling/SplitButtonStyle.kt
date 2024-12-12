package org.jetbrains.jewel.ui.component.styling

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@Stable
@GenerateDataFunctions
public class SplitButtonStyle(
    public val button: ButtonStyle,
    public val dividerMetrics: DividerMetrics,
    public val dividerColor: Color,
    public val dividerDisabledColor: Color,
    public val chevronColor: Color,
) {
    public companion object
}

public val LocalDefaultSplitButtonStyle: ProvidableCompositionLocal<SplitButtonStyle> = staticCompositionLocalOf {
    error("No default SplitButtonStyle provided. Have you forgotten the theme?")
}

public val LocalOutlinedSplitButtonStyle: ProvidableCompositionLocal<SplitButtonStyle> = staticCompositionLocalOf {
    error("No outlined SplitButtonStyle provided. Have you forgotten the theme?")
}
