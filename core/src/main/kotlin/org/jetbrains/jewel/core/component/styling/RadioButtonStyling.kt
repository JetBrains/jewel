package org.jetbrains.jewel.core.component.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import org.jetbrains.jewel.core.component.RadioButtonState
import org.jetbrains.jewel.core.painter.PainterProvider
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@Immutable
@GenerateDataFunctions
class RadioButtonStyle(
    val colors: RadioButtonColors,
    val metrics: RadioButtonMetrics,
    val icons: RadioButtonIcons,
) {

    companion object
}

@Immutable
@GenerateDataFunctions
class RadioButtonColors(
    val content: Color,
    val contentHovered: Color,
    val contentDisabled: Color,
    val contentSelected: Color,
    val contentSelectedHovered: Color,
    val contentSelectedDisabled: Color,
) {

    @Composable
    fun contentFor(state: RadioButtonState) = rememberUpdatedState(
        when {
            !state.isEnabled && state.isSelected -> contentSelectedDisabled
            !state.isEnabled -> contentDisabled
            state.isSelected && state.isHovered -> contentSelectedHovered
            state.isSelected -> contentSelected
            state.isHovered -> contentHovered
            else -> content
        },
    )

    companion object
}

@Immutable
@GenerateDataFunctions
class RadioButtonMetrics(
    val radioButtonSize: DpSize,
    val iconContentGap: Dp,
) {

    companion object
}

@Immutable
@GenerateDataFunctions
class RadioButtonIcons(val radioButton: PainterProvider) {

    companion object
}

val LocalRadioButtonStyle = staticCompositionLocalOf<RadioButtonStyle> {
    error("No RadioButtonStyle provided")
}
