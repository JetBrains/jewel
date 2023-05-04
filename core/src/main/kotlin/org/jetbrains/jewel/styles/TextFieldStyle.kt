package org.jetbrains.jewel.styles

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.jewel.IntelliJMetrics
import org.jetbrains.jewel.IntelliJPalette
import org.jetbrains.jewel.components.TextFieldHintState
import org.jetbrains.jewel.components.state.TextFieldState
import org.jetbrains.jewel.toBrush

typealias TextFieldStyle = ControlStyle<TextFieldAppearance, TextFieldState>

data class TextFieldAppearance(
    val textStyle: TextStyle = TextStyle.Default,
    val backgroundColor: Color,
    val borderStroke: BorderStroke? = null,
    val shape: Shape,

    val cursorBrush: Brush = SolidColor(Color.Black),
    val contentPadding: PaddingValues,

    val haloStroke: BorderStroke? = null,

    val minWidth: Dp = Dp.Unspecified
)

val LocalTextFieldStyle = compositionLocalOf<TextFieldStyle> { localNotProvided() }
val Styles.textField: TextFieldStyle
    @Composable
    @ReadOnlyComposable
    get() = LocalTextFieldStyle.current

fun TextFieldStyle(
    palette: IntelliJPalette,
    metrics: IntelliJMetrics,
    textStyle: TextStyle
) = TextFieldStyle {
    val defaultAppearance = TextFieldAppearance(
        textStyle = textStyle.copy(
            color = palette.textField.foreground,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        ),
        backgroundColor = palette.textField.background,
        shape = RoundedCornerShape(0.dp),
        contentPadding = PaddingValues(7.dp, 4.dp),
        cursorBrush = palette.text.toBrush(),
        borderStroke = BorderStroke(1.dp, palette.controlStroke),
        minWidth = 8.dp * 8
    )

    val disabledAppearance = defaultAppearance.copy(
        textStyle = defaultAppearance.textStyle.copy(color = palette.textField.foregroundDisabled),
        backgroundColor = palette.textField.backgroundDisabled
    )

    val focusedAppearance = defaultAppearance.copy(
        borderStroke = BorderStroke(1.dp, palette.controlStrokeFocused),
        haloStroke = BorderStroke(metrics.controlFocusHaloWidth, palette.controlFocusHalo)
    )

    default {
        allStateCombinations { enabled, focused, hovered, hintState ->
            val appearance = when {
                enabled -> when (hintState) {
                    TextFieldHintState.Normal -> when {
                        focused -> focusedAppearance
                        else -> defaultAppearance
                    }

                    TextFieldHintState.Error -> when {
                        focused -> focusedAppearance.copy(
                            borderStroke = BorderStroke(1.dp, palette.controlHaloError),
                            haloStroke = BorderStroke(metrics.controlFocusHaloWidth, palette.controlHaloError)
                        )

                        else -> focusedAppearance.copy(
                            borderStroke = BorderStroke(1.dp, palette.controlInactiveHaloError),
                            haloStroke = BorderStroke(metrics.controlFocusHaloWidth, palette.controlInactiveHaloError)
                        )
                    }

                    TextFieldHintState.Warning -> when {
                        focused -> focusedAppearance.copy(
                            borderStroke = BorderStroke(1.dp, palette.controlHaloWarning),
                            haloStroke = BorderStroke(metrics.controlFocusHaloWidth, palette.controlHaloWarning)
                        )

                        else -> focusedAppearance.copy(
                            borderStroke = BorderStroke(1.dp, palette.controlInactiveHaloWarning),
                            haloStroke = BorderStroke(metrics.controlFocusHaloWidth, palette.controlInactiveHaloWarning)
                        )
                    }
                }

                else -> disabledAppearance
            }

            state(
                TextFieldState(
                    focused = focused,
                    hovered = hovered,
                    enabled = enabled,
                    hintState = hintState
                ),
                appearance
            )
        }
    }
}

private fun ControlStyle.ControlVariationBuilder<TextFieldAppearance, TextFieldState>.allStateCombinations(
    action: ControlStyle.ControlVariationBuilder<TextFieldAppearance, TextFieldState>.(
        enabled: Boolean,
        focused: Boolean,
        hovered: Boolean,
        hintState: TextFieldHintState
    ) -> Unit
) {
    for (enabled in listOf(false, true)) {
        for (focused in listOf(false, true)) {
            for (hovered in listOf(false, true)) {
                for (hintState in TextFieldHintState.values()) {
                    action(enabled, focused, hovered, hintState)
                }
            }
        }
    }
}
