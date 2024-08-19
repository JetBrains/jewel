package org.jetbrains.jewel.ui.component.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

@Stable
@GenerateDataFunctions
public class ScrollbarStyle(
    public val colors: ScrollbarColors,
    public val metrics: ScrollbarMetrics,
    public val trackClickBehavior: TrackClickBehavior,
    public val scrollbarVisibility: ScrollbarVisibility,
) {
    public companion object
}

@Immutable
@GenerateDataFunctions
public class ScrollbarColors(
    public val thumbBackground: Color,
    public val thumbBackgroundActive: Color,
    public val thumbOpaqueBackground: Color,
    public val thumbOpaqueBackgroundHovered: Color,
    public val thumbBorder: Color,
    public val thumbBorderActive: Color,
    public val thumbOpaqueBorder: Color,
    public val thumbOpaqueBorderHovered: Color,
    public val trackBackground: Color,
    public val trackBackgroundExpanded: Color,
    public val trackOpaqueBackground: Color,
    public val trackOpaqueBackgroundHovered: Color,
) {
    public companion object
}

@Stable
@GenerateDataFunctions
public class ScrollbarMetrics(
    public val thumbCornerSize: CornerSize,
    public val minThumbLength: Dp,
    public val trackPadding: PaddingValues,
) {
    public companion object
}

public sealed interface ScrollbarVisibility {
    public val thumbThickness: Dp
    public val thumbThicknessExpanded: Dp
    public val appearAnimationDuration: Duration
    public val disappearAnimationDuration: Duration
    public val expandAnimationDuration: Duration
    public val lingerDuration: Duration

    @GenerateDataFunctions
    public class AlwaysVisible(
        public override val thumbThickness: Dp,
    ) : ScrollbarVisibility {
        override val thumbThicknessExpanded: Dp = thumbThickness
        public override val appearAnimationDuration: Duration = 0.milliseconds
        public override val disappearAnimationDuration: Duration = 0.milliseconds
        public override val expandAnimationDuration: Duration = 0.milliseconds
        public override val lingerDuration: Duration = 0.milliseconds

        public companion object
    }

    @GenerateDataFunctions
    public class WhenScrolling(
        public override val thumbThickness: Dp,
        public override val thumbThicknessExpanded: Dp,
        public override val appearAnimationDuration: Duration,
        public override val disappearAnimationDuration: Duration,
        public override val expandAnimationDuration: Duration,
        public override val lingerDuration: Duration,
    ) : ScrollbarVisibility {
        public companion object
    }
}

public enum class TrackClickBehavior {
    NextPage,
    JumpToSpot,
}

public val LocalScrollbarStyle: ProvidableCompositionLocal<ScrollbarStyle> =
    staticCompositionLocalOf {
        error("No ScrollbarStyle provided. Have you forgotten the theme?")
    }
