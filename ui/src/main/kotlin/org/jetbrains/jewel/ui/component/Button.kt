package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Active
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Enabled
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Focused
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Hovered
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Pressed
import org.jetbrains.jewel.foundation.state.FocusableComponentState
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.LocalContentColor
import org.jetbrains.jewel.foundation.theme.LocalTextStyle
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.component.styling.ButtonStyle
import org.jetbrains.jewel.ui.component.styling.SplitButtonStyle
import org.jetbrains.jewel.ui.focusOutline
import org.jetbrains.jewel.ui.icons.AllIconsKeys
import org.jetbrains.jewel.ui.theme.defaultButtonStyle
import org.jetbrains.jewel.ui.theme.defaultSplitButtonStyle
import org.jetbrains.jewel.ui.theme.outlinedButtonStyle
import org.jetbrains.jewel.ui.theme.outlinedSplitButtonStyle
import org.jetbrains.jewel.ui.painter.hints.Stroke as PainterHintStroke

/**
 * A composable function that creates a customizable default-styled button. The button's behavior,
 * appearance, and content can be modified using the provided parameters.
 *
 * @param onClick A lambda that is invoked when the button is clicked.
 * @param modifier The modifier for adjusting the layout or adding various behaviors to the button.
 * @param enabled Specifies whether the button is clickable. Defaults to true.
 * @param interactionSource The [MutableInteractionSource] representing the interactions for this button, such as clicks, presses, or hovers.
 * @param style The [ButtonStyle] defining the visual styling of the button, such as colors and metrics.
 * @param textStyle The [TextStyle] used to style the text content of the button.
 * @param content A composable lambda that defines the content inside the button.
 */
@Composable
public fun DefaultButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: ButtonStyle = JewelTheme.defaultButtonStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    content: @Composable () -> Unit,
) {
    ButtonImpl(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        style = style,
        textStyle = textStyle,
        content = content,
    )
}

/**
 * A composable function to create an outlined button with customizable appearance and interaction behavior.
 *
 * @param onClick Lambda function that will be invoked when the button is clicked.
 * @param modifier Modifier to be applied to the button layout.
 * @param enabled Boolean to control whether the button is enabled or disabled. Defaults to true.
 * @param interactionSource Used for managing and observing interaction states for the button.
 * @param style Defines the look and feel of the button such as colors, metrics, and focus outline alignment.
 * @param textStyle TextStyle to be applied to the content inside the button.
 * @param content Composable block that defines the content of the button.
 */
@Composable
public fun OutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: ButtonStyle = JewelTheme.outlinedButtonStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    content: @Composable () -> Unit,
) {
    ButtonImpl(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        style = style,
        textStyle = textStyle,
        content = content,
    )
}

/**
 * A split button is a combination of a regular button and a drop-down
 * button.
 *
 * **Guidelines:**
 * [on IJP SDK webhelp](https://plugins.jetbrains.com/docs/intellij/split-button.html)
 *
 * **Usage example:**
 * [`Buttons.kt`](https://github.com/JetBrains/intellij-community/blob/master/platform/jewel/samples/standalone/src/main/kotlin/org/jetbrains/jewel/samples/standalone/view/component/Buttons.kt)
 *
 * **Swing equivalent:**
 * [`JBOptionButton`](https://github.com/JetBrains/intellij-community/tree/idea/243.22562.145/platform/platform-api/src/com/intellij/ui/components/JBOptionButton.kt)
 *
 * @param onClick the action to perform when the button is clicked
 * @param modifier the [Modifier] to be applied to the button
 * @param enabled whether the button is enabled
 * @param interactionSource the [MutableInteractionSource] representing the
 *    current interaction state
 * @param style the [ButtonStyle] to be applied to the button
 * @param textStyle the [TextStyle] to be applied to the button's text
 * @param content the content of the button
 * @see com.intellij.ui.components.JBOptionButton
 */
@Composable
public fun OutlinedSplitButton(
    onClick: () -> Unit,
    secondaryOnClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: SplitButtonStyle = JewelTheme.outlinedSplitButtonStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    content: @Composable () -> Unit,
) {
    SplitButtonImpl(
        onClick,
        secondaryOnClick,
        modifier,
        enabled,
        interactionSource,
        style,
        textStyle,
        isDefault = false,
        content
    )
}

/**
 * A split button is a combination of a regular button and a drop-down
 * button.
 *
 * **Guidelines:**
 * [on IJP SDK webhelp](https://plugins.jetbrains.com/docs/intellij/split-button.html)
 *
 * **Usage example:**
 * [`Buttons.kt`](https://github.com/JetBrains/intellij-community/blob/master/platform/jewel/samples/standalone/src/main/kotlin/org/jetbrains/jewel/samples/standalone/view/component/Buttons.kt)
 *
 * **Swing equivalent:**
 * [`JBOptionButton`](https://github.com/JetBrains/intellij-community/tree/idea/243.22562.145/platform/platform-api/src/com/intellij/ui/components/JBOptionButton.kt)
 *
 * @param onClick the action to perform when the button is clicked
 * @param modifier the [Modifier] to be applied to the button
 * @param enabled whether the button is enabled
 * @param interactionSource the [MutableInteractionSource] representing the
 *    current interaction state
 * @param style the [ButtonStyle] to be applied to the button
 * @param textStyle the [TextStyle] to be applied to the button's text
 * @param content the content of the button
 * @see com.intellij.ui.components.JBOptionButton
 */
@Composable
public fun DefaultSplitButton(
    onClick: () -> Unit,
    secondaryOnClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: SplitButtonStyle = JewelTheme.defaultSplitButtonStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
    content: @Composable () -> Unit,
) {
    SplitButtonImpl(
        onClick,
        secondaryOnClick,
        modifier,
        enabled,
        interactionSource,
        style,
        textStyle,
        isDefault = true,
        content
    )
}

@Composable
private fun SplitButtonImpl(
    onClick: () -> Unit,
    secondaryOnClick: () -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    interactionSource: MutableInteractionSource,
    style: SplitButtonStyle,
    textStyle: TextStyle,
    isDefault: Boolean,
    content: @Composable () -> Unit,
) {
    ButtonImpl(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        style = style.button,
        textStyle = textStyle,
        content = content,
        secondaryContent = {
            Box(Modifier.size(style.button.metrics.minSize.height)) {
                Divider(
                    orientation = Orientation.Vertical,
                    thickness = style.dividerMetrics.thickness,
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(vertical = style.dividerPadding)
                        .align(Alignment.CenterStart),
                    color = style.dividerColor,
                )
                Icon(
                    key = AllIconsKeys.General.ChevronDown,
                    contentDescription = "Chevron",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .clickable(
                            onClick = secondaryOnClick,
                            interactionSource = MutableInteractionSource(),
                            indication = null
                        ),
                    hints = if (isDefault) {
                        arrayOf(PainterHintStroke(style.chevronColor))
                    } else {
                        emptyArray()
                    }
                )
            }
        }
    )
}

@Composable
private fun ButtonImpl(
    onClick: () -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    interactionSource: MutableInteractionSource,
    style: ButtonStyle,
    textStyle: TextStyle,
    content: @Composable () -> Unit,
    secondaryContent: @Composable (() -> Unit)? = null,
) {
    var buttonState by remember(interactionSource) { mutableStateOf(ButtonState.of(enabled = enabled)) }

    remember(enabled) { buttonState = buttonState.copy(enabled = enabled) }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> buttonState = buttonState.copy(pressed = true)
                is PressInteraction.Cancel,
                is PressInteraction.Release,
                    -> buttonState = buttonState.copy(pressed = false)

                is HoverInteraction.Enter -> buttonState = buttonState.copy(hovered = true)
                is HoverInteraction.Exit -> buttonState = buttonState.copy(hovered = false)
                is FocusInteraction.Focus -> buttonState = buttonState.copy(focused = true)
                is FocusInteraction.Unfocus -> buttonState = buttonState.copy(focused = false)
            }
        }
    }

    val shape = RoundedCornerShape(style.metrics.cornerSize)
    val colors = style.colors
    val borderColor by colors.borderFor(buttonState)

    Box(
        modifier =
        modifier
            .clickable(
                onClick = onClick,
                enabled = enabled,
                role = Role.Button,
                interactionSource = interactionSource,
                indication = null,
            )
            .background(colors.backgroundFor(buttonState).value, shape)
            .focusOutline(
                state = buttonState,
                outlineShape = shape,
                alignment = style.focusOutlineAlignment,
                expand = style.metrics.focusOutlineExpand,
            )
            .border(Stroke.Alignment.Inside, style.metrics.borderWidth, borderColor, shape),
        propagateMinConstraints = true,
    ) {
        val contentColor by colors.contentFor(buttonState)

        CompositionLocalProvider(
            LocalContentColor provides contentColor.takeOrElse { textStyle.color },
            LocalTextStyle provides textStyle.copy(color = contentColor.takeOrElse { textStyle.color }),
        ) {
            Row(
                Modifier
                    .defaultMinSize(style.metrics.minSize.width)
                    .height(style.metrics.minSize.height),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(Modifier.padding(style.metrics.padding)) {
                    content()
                }
                secondaryContent?.invoke()
            }
        }
    }
}

@Immutable
@JvmInline
public value class ButtonState(public val state: ULong) : FocusableComponentState {
    override val isActive: Boolean
        get() = state and Active != 0UL

    override val isEnabled: Boolean
        get() = state and Enabled != 0UL

    override val isFocused: Boolean
        get() = state and Focused != 0UL

    override val isHovered: Boolean
        get() = state and Hovered != 0UL

    override val isPressed: Boolean
        get() = state and Pressed != 0UL

    public fun copy(
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        pressed: Boolean = isPressed,
        hovered: Boolean = isHovered,
        active: Boolean = isActive,
    ): ButtonState = of(enabled = enabled, focused = focused, pressed = pressed, hovered = hovered, active = active)

    override fun toString(): String =
        "${javaClass.simpleName}(isEnabled=$isEnabled, isFocused=$isFocused, isHovered=$isHovered, " +
            "isPressed=$isPressed, isActive=$isActive)"

    public companion object {
        public fun of(
            enabled: Boolean = true,
            focused: Boolean = false,
            pressed: Boolean = false,
            hovered: Boolean = false,
            active: Boolean = true,
        ): ButtonState =
            ButtonState(
                (if (enabled) Enabled else 0UL) or
                    (if (focused) Focused else 0UL) or
                    (if (hovered) Hovered else 0UL) or
                    (if (pressed) Pressed else 0UL) or
                    (if (active) Active else 0UL)
            )
    }
}
