package org.jetbrains.jewel.intui.standalone

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
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
import org.jetbrains.jewel.ButtonState
import org.jetbrains.jewel.LocalContentColor
import org.jetbrains.jewel.intui.standalone.styling.IntUiToolWindowButtonStyle
import org.jetbrains.jewel.intui.standalone.styling.ToolWindowButtonStyle

@Composable
fun ToolWindowButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    active: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: ToolWindowButtonStyle = IntUiToolWindowButtonStyle.Default.light(),
    content: @Composable BoxScope.() -> Unit,
) {
    var buttonState by remember(interactionSource) {
        mutableStateOf(ButtonState.of(active = active))
    }

    remember(active) {
        buttonState = buttonState.copy(active = active)
    }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> buttonState = buttonState.copy(pressed = true)
                is PressInteraction.Cancel, is PressInteraction.Release ->
                    buttonState =
                        buttonState.copy(pressed = false)

                is HoverInteraction.Enter -> buttonState = buttonState.copy(hovered = true)
                is HoverInteraction.Exit -> buttonState = buttonState.copy(hovered = false)
                is FocusInteraction.Focus -> buttonState = buttonState.copy(focused = true)
                is FocusInteraction.Unfocus -> buttonState = buttonState.copy(focused = false)
            }
        }
    }

    val shape = RoundedCornerShape(style.metrics.selectedCornerSize)
    val colors = style.colors

    Box(
        modifier = modifier
            .clickable(
                onClick = onClick,
                role = Role.Button,
                interactionSource = interactionSource,
                indication = null,
            )
            .defaultMinSize(style.metrics.minSize.width, style.metrics.minSize.height)
            .padding(style.metrics.padding)
            .background(colors.backgroundFor(buttonState).value, shape)
            .padding(style.metrics.padding),
        contentAlignment = Alignment.Center,
        propagateMinConstraints = true,
    ) {
        val contentColor by colors.contentFor(buttonState)

        CompositionLocalProvider(
            LocalContentColor provides contentColor.takeOrElse { colors.content },
        ) {
            content()
        }
    }
}

@Immutable
sealed class ToolWindowButtonData {

    abstract val selected: Boolean
    abstract val label: String
    abstract val iconResource: String // TODO use painters instead
    abstract val onClick: () -> Unit

    @Immutable
    class Default(
        override val selected: Boolean = false,
        override val label: String,
        override val iconResource: String,
        override val onClick: () -> Unit = {},
    ) : ToolWindowButtonData() {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Default

            if (selected != other.selected) return false
            if (label != other.label) return false
            if (iconResource != other.iconResource) return false
            if (onClick != other.onClick) return false

            return true
        }

        override fun hashCode(): Int {
            var result = selected.hashCode()
            result = 31 * result + label.hashCode()
            result = 31 * result + (iconResource.hashCode() ?: 0)
            result = 31 * result + onClick.hashCode()
            return result
        }
    }
}

enum class ToolWindow {
    Project,
    Commit,
    Structure,
    Bookmarks,
    Build,
    Terminal,
    Vcs,
    Problems,
    Find,
    Notifications,
    Gradle
}