package org.jetbrains.jewel.styles

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJPainters
import org.jetbrains.jewel.IntelliJPalette
import org.jetbrains.jewel.ShapeStroke
import org.jetbrains.jewel.styles.state.ButtonMouseState
import org.jetbrains.jewel.styles.state.ComboBoxItemState
import org.jetbrains.jewel.styles.state.ComboBoxState

@Immutable
data class ComboBoxAppearance(
    val backgroundColor: Color = Color.Unspecified,
    val foregroundColor: Color = Color.Unspecified,
    val shapeStroke: ShapeStroke<*>? = ShapeStroke.SolidColor(1.dp, Color.Blue),
    val shape: Shape = RectangleShape,
    val haloStroke: ShapeStroke<*>? = null,
    val haloShape: Shape = shape,

    val iconPainter: (@Composable () -> Painter)? = null,
    val symbolPadding: Dp = 2.dp,
    val baseLine: Dp = 14.dp,
)

@Immutable
data class ComboBoxItemAppearance(
    val textStyle: TextStyle = TextStyle.Default,
    val backgroundColor: Color = Color.Unspecified,
    val foregroundColor: Color = Color.Unspecified,
    val shapeStroke: ShapeStroke<*>? = ShapeStroke.SolidColor(1.dp, Color.Blue),
    val shape: Shape = RectangleShape,
    val haloStroke: ShapeStroke<*>? = null,
    val haloShape: Shape = shape,

    val iconPainter: (@Composable () -> Painter)? = null,
    val symbolPadding: Dp = 2.dp,
    val baseLine: Dp = 14.dp,
)

typealias ComboBoxStyle = ControlStyle<ComboBoxState, ComboBoxAppearance>
typealias ComboBoxItemStyle = ControlStyle<ComboBoxItemState, ComboBoxItemAppearance>

val LocalComboBoxStyle = compositionLocalOf<ComboBoxStyle> { localNotProvided() }
val LocalComboBoxItemStyle = compositionLocalOf<ComboBoxItemStyle> { localNotProvided() }
val Styles.comboBox: ComboBoxStyle
    @Composable
    @ReadOnlyComposable
    get() = LocalComboBoxStyle.current
val Styles.comboBoxItem: ComboBoxItemStyle
    @Composable
    @ReadOnlyComposable
    get() = LocalComboBoxItemStyle.current

fun ComboBoxStyle(
    palette: IntelliJPalette,
    painters: IntelliJPainters,
) = ComboBoxStyle {
    val defaultAppearance = ComboBoxAppearance().copy(
        backgroundColor = palette.comboBox.background,
        foregroundColor = palette.comboBox.foreground,
        shapeStroke = ShapeStroke.SolidColor(1.dp, palette.controlStroke),
        haloStroke = ShapeStroke.SolidColor(1.dp, palette.controlFocusHalo),
        iconPainter = painters.comboBox.arrowClosed,
    )
    for (enabled in listOf(true, false)) {
        if (enabled) {
            state(ComboBoxState(), defaultAppearance)
            for (open in listOf(true, false)) {
                val openDefaultAppearance = defaultAppearance.copy(
                    iconPainter = if (open) painters.comboBox.arrowOpen else painters.comboBox.arrowClosed
                )
                for (mouseState in ButtonMouseState.values()) {
                    if (!open) {
                        when (mouseState) {
                            ButtonMouseState.Hovered, ButtonMouseState.Pressed -> state(
                                ComboBoxState(),
                                openDefaultAppearance.copy(
                                    backgroundColor = palette.comboBox.hoverBackgroundColor
                                )
                            )

                            ButtonMouseState.None -> state(
                                ComboBoxState(),
                                openDefaultAppearance.copy(
                                    backgroundColor = palette.comboBox.background
                                )
                            )
                        }
                    } else {
                        when (mouseState) {
                            ButtonMouseState.Hovered, ButtonMouseState.Pressed -> state(
                                ComboBoxState(),
                                openDefaultAppearance.copy(
                                    backgroundColor = palette.comboBox.hoverBackgroundColor
                                )
                            )

                            ButtonMouseState.None -> state(
                                ComboBoxState(),
                                openDefaultAppearance.copy(
                                    backgroundColor = palette.comboBox.background
                                )
                            )
                        }
                    }
                }
            }
        } else
            state(
                ComboBoxState().copy(enabled = false),
                defaultAppearance.copy(backgroundColor = palette.comboBox.disabledBackground)
            )
    }
}

fun ComboBoxItemStyle(
    palette: IntelliJPalette,
    painters: IntelliJPainters,
    controlTextStyle: TextStyle
) = ComboBoxItemStyle {
    val defaultComboBoxItemAppearance = ComboBoxItemAppearance().copy(
        textStyle = controlTextStyle,
        backgroundColor = palette.comboBoxItem.background,
        foregroundColor = palette.comboBoxItem.foreground,
        shapeStroke = ShapeStroke.SolidColor(1.dp, palette.controlStroke),
        haloStroke = ShapeStroke.SolidColor(1.dp, palette.controlFocusHalo),
        iconPainter = painters.comboBoxItem.icon,
    )
    for (enable in listOf(true, false)) {
        if (!enable) {
            state(
                ComboBoxItemState().copy(enabled = false),
                defaultComboBoxItemAppearance.copy(backgroundColor = palette.comboBoxItem.disabledBackground)
            )
        } else {
            for (mouseState in ButtonMouseState.values()) {
                when (mouseState) {
                    ButtonMouseState.Hovered -> state(
                        ComboBoxItemState(),
                        defaultComboBoxItemAppearance.copy(
                            backgroundColor = palette.comboBoxItem.hoverBackgroundColor
                        )
                    )

                    ButtonMouseState.Pressed -> state(
                        ComboBoxItemState(),
                        defaultComboBoxItemAppearance.copy(
                            backgroundColor = palette.comboBoxItem.pressedBackgroundColor
                        )
                    )

                    ButtonMouseState.None -> state(
                        ComboBoxItemState(),
                        defaultComboBoxItemAppearance.copy(
                            backgroundColor = palette.comboBoxItem.background
                        )
                    )
                }
            }
        }
    }
}
