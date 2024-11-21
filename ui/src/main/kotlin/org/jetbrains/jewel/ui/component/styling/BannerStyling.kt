package org.jetbrains.jewel.ui.component.styling

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@Stable
@GenerateDataFunctions
public class DefaultBannerStyles(
    public val information: DefaultBannerStyle
    //    public val warning: DefaultBannerStyle,
    //    public val error: DefaultBannerStyle,
    //    public val success: DefaultBannerStyle,
) {
    public companion object
}

@Stable
@GenerateDataFunctions
public class DefaultBannerStyle(public val colors: BannerColors, public val metrics: BannerMetrics) {
    public companion object
}

@Immutable
@GenerateDataFunctions
public class BannerColors(
    public val background: Color,
    public val content: Color,
    public val border: Color,
    public val foreground: Color,
) {
    public companion object
}

@Stable
@GenerateDataFunctions
public class BannerMetrics(public val borderWidth: Dp) {
    public companion object
}

public val LocalDefaultBannerStyle: ProvidableCompositionLocal<DefaultBannerStyles> = staticCompositionLocalOf {
    error("No default BannerStyle provided. Have you forgotten the theme?")
}
