package org.jetbrains.jewel.intui.window.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.window.styling.DecoratedWindowColors
import org.jetbrains.jewel.window.styling.DecoratedWindowMetrics
import org.jetbrains.jewel.window.styling.DecoratedWindowStyle

@Stable data class IntUiDecoratedWindowStyle(
    override val colors: IntUiDecoratedWindowColors,
    override val metrics: IntUiDecoratedWindowMetrics,
) : DecoratedWindowStyle {

    companion object {

        @Composable fun light(
            intUiDecoratedWindowColors: IntUiDecoratedWindowColors = IntUiDecoratedWindowColors.light(),
            intUiDecoratedWindowMetrics: IntUiDecoratedWindowMetrics = IntUiDecoratedWindowMetrics(1.dp),
        ): IntUiDecoratedWindowStyle = IntUiDecoratedWindowStyle(
            colors = intUiDecoratedWindowColors,
            metrics = intUiDecoratedWindowMetrics,
        )

        @Composable fun dark(
            intUiDecoratedWindowColors: IntUiDecoratedWindowColors = IntUiDecoratedWindowColors.dark(),
            intUiDecoratedWindowMetrics: IntUiDecoratedWindowMetrics = IntUiDecoratedWindowMetrics(1.dp),
        ): IntUiDecoratedWindowStyle = IntUiDecoratedWindowStyle(
            colors = intUiDecoratedWindowColors,
            metrics = intUiDecoratedWindowMetrics,
        )
    }
}

@Stable data class IntUiDecoratedWindowColors(
    override val border: Color,
    override val borderInactive: Color,
) : DecoratedWindowColors {

    companion object {

        @Composable fun light(
            // from Window.undecorated.border
            borderColor: Color = Color(0xFF5A5D6B),
            inactiveBorderColor: Color = borderColor,
        ) = IntUiDecoratedWindowColors(
            borderColor,
            inactiveBorderColor,
        )

        @Composable fun dark(
            // from Window.undecorated.border
            borderColor: Color = Color(0xFF5A5D63),
            inactiveBorderColor: Color = borderColor,
        ) = IntUiDecoratedWindowColors(
            borderColor,
            inactiveBorderColor,
        )
    }
}

@Stable data class IntUiDecoratedWindowMetrics(
    override val borderWidth: Dp,
) : DecoratedWindowMetrics
