package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.internal.IntelliJTheme
import org.jetbrains.jewel.internal.RadioButtonDefaults
import org.jetbrains.jewel.internal.RadioButtonState

@Suppress("VariableNaming")
abstract class IntUiRadioButtonDefaults : RadioButtonDefaults {

    val RadioButtonSize = 17.dp

    val Shape = CircleShape

    val ContentSpacing = 8.dp

    @Composable
    override fun width(): Dp = RadioButtonSize

    @Composable
    override fun height(): Dp = RadioButtonSize

    @Composable
    override fun shape(): Shape = Shape

    @Composable
    override fun contentSpacing(): Dp = ContentSpacing

    @Composable
    override fun textStyle(): TextStyle = IntelliJTheme.defaultTextStyle

    @Composable
    override fun checkmark(state: RadioButtonState): State<Painter?> {
        val checked = painterResource("intui/radioButtonCheckmark.svg")

        return rememberUpdatedState(
            if (state.isSelected) {
                checked
            } else {
                null
            }
        )
    }
}
