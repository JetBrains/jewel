package org.jetbrains.jewel.internal

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.toBrush

@Composable
fun AnimatedDefiniteLinearProgressBar(
    modifier: Modifier = Modifier,
    targetProgress: Float, // from 0 to 1
    defaults: ProgressBarDefaults = IntelliJTheme.progressBarDefaults,
    colors: ProgressBarColors = defaults.colors(),
) {
    val progress by animateFloatAsState(
        targetValue = targetProgress,
        animationSpec = tween(durationMillis = 100, easing = LinearEasing)
    )
    val bgColor by colors.backgroundColor()
    val highlightColor by colors.highlightColor()
    val colorsList = listOf(bgColor, highlightColor)

    Box(
        modifier
            .height(4.dp)
            .clip(RoundedCornerShape(2.dp))
            .drawWithContent {
                drawRect(color = bgColor) // Draw the background
                val x = size.width * progress
                // Define the gradient colors

                val brush = Brush.horizontalGradient(
                    colors = colorsList,
                    startX = 0f,
                    endX = x,
                    tileMode = TileMode.Clamp
                )
                // Draw the animated progress
                val progressWidth = size.width * progress
                drawRect(
                    brush = brush,
                    size = size.copy(width = progressWidth)
                )

            }
    )
}

@Composable
fun LinearProgressBar(
    modifier: Modifier = Modifier,
    progress: Float, // from 0 to 1
    defaults: ProgressBarDefaults = IntelliJTheme.progressBarDefaults,
    colors: ProgressBarColors = defaults.colors(),
) {

    val bgColor by colors.backgroundColor()
    val highlightColor by colors.highlightColor()
    Box(
        modifier
            .height(4.dp)
            .clip(RoundedCornerShape(2.dp))
            .drawWithContent {
                drawRect(color = bgColor) // Draw the background
                val progressWidth = size.width * progress
                drawRect(brush = highlightColor.toBrush(), size = size.copy(progressWidth))
            }
    )
}

@Composable
fun IndeterminateLinearProgressBar(
    modifier: Modifier = Modifier,
    defaults: ProgressBarDefaults = IntelliJTheme.progressBarDefaults,
    colors: ProgressBarColors = defaults.colors(),
) {
    val infiniteTransition = rememberInfiniteTransition()
    // startX = Bordo sx + animationIndex * step
    // endX = startX + gradientWidth
    val animatedProgress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 2f,
        animationSpec = infiniteRepeatable(
            tween(durationMillis = defaults.animationDurationMillis(), easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        )
    )

    val gradientWidth = defaults.gradientWidth()
    val bgColor by colors.backgroundColor()
    val highlightColor by colors.highlightColor()
    val colorsList = listOf(bgColor, highlightColor)
    Box(
        modifier
            .height(defaults.height())
            .clip(defaults.clipShape())
            .drawWithContent {
                drawRect(color = bgColor) // Draw the background
                val x = gradientWidth.value * animatedProgress
                // Define the gradient colors
                val gradient = Brush.linearGradient(
                    colors = colorsList,
                    start = Offset(x, 0f),
                    end = Offset(gradientWidth.value + x, 0f),
                    TileMode.Mirror
                )

                // Draw the animated gradient
                drawRect(brush = gradient)
            }
    )
}

@Stable
interface ProgressBarDefaults {

    @Composable
    fun height(): Dp

    @Composable
    fun clipShape(): RoundedCornerShape

    @Composable
    fun gradientWidth(): Dp

    @Composable
    fun animationDurationMillis(): Int

    @Composable
    fun colors(): ProgressBarColors
}

interface ProgressBarColors {

    @Composable
    fun backgroundColor(): State<Color>

    @Composable
    fun highlightColor(): State<Color>
}

fun progressBarDefaultsColors(
    backgroundColor: Color,
    highlightColor: Color
): ProgressBarColors =
    DefaultProgressBarColors(
        backgroundColor,
        highlightColor
    )

@Immutable
private class DefaultProgressBarColors(
    private val backgroundColor: Color,
    private val highlightColor: Color
) : ProgressBarColors {

    @Composable
    override fun backgroundColor(): State<Color> = rememberUpdatedState(backgroundColor)

    @Composable
    override fun highlightColor(): State<Color> = rememberUpdatedState(highlightColor)
}

internal val LocalProgressBarDefaults =
    staticCompositionLocalOf<ProgressBarDefaults> {
        error("No ProgressBarDefaults provided")
    }

