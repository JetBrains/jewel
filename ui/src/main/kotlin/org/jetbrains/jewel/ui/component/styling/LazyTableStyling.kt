package org.jetbrains.jewel.ui.component.styling

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@Stable
@GenerateDataFunctions
public class LazyTableStyle(
    public val colors: LazyTableColors,
    public val metrics: LazyTableMetrics,
) {

    public companion object
}

@Immutable
@GenerateDataFunctions
public class LazyTableColors(
    public val background: Color,
    public val backgroundSelected: Color,
    public val backgroundInactiveSelected: Color,

    public val foreground: Color,
    public val foregroundSelected: Color,
    public val foregroundInactiveSelected: Color,

    public val gridColor: Color,
    public val stripeColor: Color,

    public val headerBackground: Color,
    public val headerForeground: Color,
    public val headerSeparatorColor: Color,
) {

    public companion object
}

@Immutable
public class LazyTableMetrics {

    public companion object
}

internal val LocalLazyTableStyle: ProvidableCompositionLocal<LazyTableStyle> =
    staticCompositionLocalOf {
        error("No LazyTableStyle provided. Have you forgotten the theme?")
    }
