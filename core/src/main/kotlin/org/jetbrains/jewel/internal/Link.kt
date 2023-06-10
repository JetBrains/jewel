package org.jetbrains.jewel.internal

import androidx.compose.foundation.Indication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import org.jetbrains.jewel.foundation.MouseState
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.border
import org.jetbrains.jewel.styles.localNotProvided

@Composable
fun Link(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    lineHeight: TextUnit = TextUnit.Unspecified,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    indication: Indication? = null,
    defaults: LinkDefaults = IntelliJTheme.linkDefaults,
    colors: LinkColors = defaults.colors()
) = LinkImpl(
    text = text,
    onClick = onClick,
    modifier = modifier,
    enabled = enabled,
    fontSize = fontSize,
    fontStyle = fontStyle,
    fontWeight = fontWeight,
    fontFamily = fontFamily,
    letterSpacing = letterSpacing,
    textAlign = textAlign,
    overflow = overflow,
    lineHeight = lineHeight,
    interactionSource = interactionSource,
    indication = indication,
    defaults = defaults,
    colors = colors
)

@Composable
fun ExternalLink(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    lineHeight: TextUnit = TextUnit.Unspecified,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    indication: Indication? = null,
    defaults: LinkDefaults = IntelliJTheme.linkDefaults,
    colors: LinkColors = defaults.colors()
) = LinkImpl(
    text = text,
    onClick = onClick,
    modifier = modifier,
    enabled = enabled,
    fontSize = fontSize,
    fontStyle = fontStyle,
    fontWeight = fontWeight,
    fontFamily = fontFamily,
    letterSpacing = letterSpacing,
    textAlign = textAlign,
    overflow = overflow,
    lineHeight = lineHeight,
    interactionSource = interactionSource,
    indication = indication,
    defaults = defaults,
    colors = colors
) {
    Icon(
        painter = defaults.externalLinkIconPainter(),
        contentDescription = "External link",
        tint = colors.iconColor(it).value
    )
}

@Composable
fun DropdownLink(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    lineHeight: TextUnit = TextUnit.Unspecified,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    indication: Indication? = null,
    defaults: LinkDefaults = IntelliJTheme.linkDefaults,
    colors: LinkColors = defaults.colors()
) = LinkImpl(
    text = text,
    onClick = onClick,
    modifier = modifier,
    enabled = enabled,
    fontSize = fontSize,
    fontStyle = fontStyle,
    fontWeight = fontWeight,
    fontFamily = fontFamily,
    letterSpacing = letterSpacing,
    textAlign = textAlign,
    overflow = overflow,
    lineHeight = lineHeight,
    interactionSource = interactionSource,
    indication = indication,
    defaults = defaults,
    colors = colors
) {
    Icon(
        painter = defaults.DropdownLinkIconPainter(),
        contentDescription = "Dropdown link",
        tint = colors.iconColor(it).value
    )
}

@Composable
private fun LinkImpl(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    lineHeight: TextUnit = TextUnit.Unspecified,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    indication: Indication? = null,
    defaults: LinkDefaults = IntelliJTheme.linkDefaults,
    colors: LinkColors = defaults.colors(),
    icon: (@Composable RowScope.(state: LinkState) -> Unit)? = null
) {
    var skipClickFocus by remember(interactionSource) {
        mutableStateOf(false)
    }
    var linkState by remember(interactionSource, enabled) {
        mutableStateOf(LinkState.of(enabled = enabled))
    }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> linkState = linkState.copy(mouseState = MouseState.Pressed)
                is PressInteraction.Cancel -> linkState = linkState.copy(mouseState = MouseState.None)
                is PressInteraction.Release -> linkState = linkState.copy(mouseState = MouseState.Hovered)

                is HoverInteraction.Enter -> if (linkState.mouseState == MouseState.None) {
                    linkState = linkState.copy(mouseState = MouseState.Hovered)
                }

                is HoverInteraction.Exit -> if (linkState.mouseState == MouseState.Hovered) {
                    linkState = linkState.copy(mouseState = MouseState.None)
                }

                is FocusInteraction.Focus -> {
                    if (!skipClickFocus) {
                        linkState = linkState.copy(focused = true)
                    }
                    skipClickFocus = false
                }

                is FocusInteraction.Unfocus -> {
                    linkState = linkState.copy(focused = false)
                    skipClickFocus = false
                }
            }
        }
    }

    val textColor = colors.textColor(linkState).value

    val mergedStyle = defaults.textStyle(linkState).value.merge(
        TextStyle(
            color = textColor,
            fontSize = fontSize,
            fontWeight = fontWeight,
            textAlign = textAlign,
            lineHeight = lineHeight,
            fontFamily = fontFamily,
            fontStyle = fontStyle,
            letterSpacing = letterSpacing
        )
    )

    val clickable = Modifier.clickable(
        onClick = {
            skipClickFocus = true
            linkState = linkState.copy(visited = true, focused = false)
            onClick()
        },
        enabled = enabled,
        role = Role.Button,
        interactionSource = interactionSource,
        indication = indication
    )

    if (icon == null) {
        BasicText(
            text = text,
            modifier = modifier.then(clickable)
                .border(colors.haloStroke(linkState).value, defaults.haloShape()),
            style = mergedStyle,
            overflow = overflow,
            softWrap = true,
            maxLines = 1
        )
    } else {
        Row(
            modifier = modifier.then(clickable)
                .border(colors.haloStroke(linkState).value, defaults.haloShape())
        ) {
            BasicText(
                text = text,
                style = mergedStyle,
                overflow = overflow,
                softWrap = true,
                maxLines = 1
            )
            icon(linkState)
        }
    }
}

@Immutable
@JvmInline
value class LinkState(val state: ULong) {

    @Stable
    val isEnabled: Boolean
        get() = state and Enabled != 0UL

    @Stable
    val isFocused: Boolean
        get() = state and Focused != 0UL

    @Stable
    val isVisited: Boolean
        get() = state and Visited != 0UL

    @Stable
    val mouseState: MouseState
        get() = MouseState(state shr mouseStateBitOffset)

    fun copy(
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        visited: Boolean = isVisited,
        mouseState: MouseState = this.mouseState
    ): LinkState =
        of(enabled, focused, visited, mouseState)

    override fun toString(): String = "LinkState(enabled=$isEnabled, focused=$isFocused, mouseState=$mouseState)"

    companion object {

        private val Enabled = 1UL shl 0
        private val Focused = 1UL shl 1
        private val Visited = 1UL shl 2
        private const val mouseStateBitOffset = 60

        fun of(enabled: Boolean = true, focused: Boolean = false, visited: Boolean = false, mouseState: MouseState = MouseState.None): LinkState {
            return LinkState(
                state = (if (enabled) Enabled else 0UL) or
                    (if (focused) Focused else 0UL) or
                    (if (visited) Visited else 0UL) or
                    (mouseState.state shl mouseStateBitOffset)
            )
        }
    }
}

@Stable
interface LinkColors {

    @Composable
    fun textColor(state: LinkState): State<Color>

    @Composable
    fun iconColor(state: LinkState): State<Color>

    @Composable
    fun haloStroke(state: LinkState): State<Stroke>
}

@Stable
interface LinkDefaults {

    @Composable
    fun haloShape(): Shape

    @Composable
    fun externalLinkIconPainter(): Painter

    @Composable
    fun DropdownLinkIconPainter(): Painter

    @Composable
    fun colors(): LinkColors

    @Composable
    fun textStyle(state: LinkState): State<TextStyle>
}

fun linkColors(
    textColor: Color,
    visitedTextColor: Color,
    disabledTextColor: Color,
    iconColor: Color,
    disabledIconColor: Color,
    haloStroke: Stroke
): LinkColors = DefaultLinkColors(
    textColor = textColor,
    visitedTextColor = visitedTextColor,
    disabledTextColor = disabledTextColor,
    iconColor = iconColor,
    disabledIconColor = disabledIconColor,
    haloStroke = haloStroke
)

@Immutable
private data class DefaultLinkColors(
    val textColor: Color,
    val visitedTextColor: Color,
    val disabledTextColor: Color,
    val iconColor: Color,
    val disabledIconColor: Color,
    val haloStroke: Stroke
) : LinkColors {

    @Composable
    override fun textColor(state: LinkState): State<Color> = rememberUpdatedState(
        when {
            !state.isEnabled -> disabledTextColor
            state.isVisited -> visitedTextColor
            else -> textColor
        }
    )

    @Composable
    override fun iconColor(state: LinkState): State<Color> = rememberUpdatedState(
        when {
            !state.isEnabled -> disabledIconColor
            else -> iconColor
        }
    )

    @Composable
    override fun haloStroke(state: LinkState): State<Stroke> = rememberUpdatedState(
        when {
            !state.isEnabled -> Stroke.None
            state.isFocused -> haloStroke
            else -> Stroke.None
        }
    )
}

internal val LocalLinkDefaults = compositionLocalOf<LinkDefaults> {
    localNotProvided()
}
