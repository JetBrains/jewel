@file:Suppress("MatchingDeclarationName")

package org.jetbrains.jewel.components

import androidx.compose.foundation.Indication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.addOutline
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.styles.LocalTextLinkStyle
import org.jetbrains.jewel.styles.TextLinkStyle
import org.jetbrains.jewel.styles.state.ButtonMouseState
import org.jetbrains.jewel.styles.state.TextLinkState
import java.awt.Cursor

//
//class LinkColors(
//    override val normalAreaColors: AreaColors,
//    val visitedAreaColors: AreaColors,
//    override val focusAreaColors: AreaColors,
//    override val disabledAreaColors: AreaColors,
//    override val hoverAreaColors: AreaColors,
//    override val pressedAreaColors: AreaColors
//) : AreaProvider, HoverAreaProvider, PressedAreaProvider, DisabledAreaProvider, FocusAreaProvider {
//
//    @Composable
//    fun provideArea(
//        enabled: Boolean,
//        visited: Boolean,
//        hover: Boolean,
//        pressed: Boolean,
//        content: @Composable () -> Unit
//    ) {
//        val currentColors = when {
//            !enabled -> disabledAreaColors
//            pressed -> pressedAreaColors
//            hover -> hoverAreaColors
//            visited -> visitedAreaColors
//            else -> normalAreaColors
//        }
//        CompositionLocalProvider(
//            LocalAreaColors provides currentColors,
//            LocalNormalAreaColors provides normalAreaColors,
//            LocalDisabledAreaColors provides disabledAreaColors,
//            LocalPressedAreaColors provides pressedAreaColors,
//            LocalHoverAreaColors provides hoverAreaColors,
//            LocalFocusAreaColors provides focusAreaColors,
//            content = content
//        )
//    }
//}
//
//val LocalLinkStyle = compositionLocalOf {
//    LightTheme.LinkColors
//}

@OptIn(ExperimentalComposeUiApi::class)
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
    lineHeight: TextUnit = TextUnit.Unspecified,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    indication: Indication? = null,
    style: TextLinkStyle = LocalTextLinkStyle.current,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    trailerIcon: @Composable (() -> Unit)? = null
) {
    var textLinkState by remember { mutableStateOf(TextLinkState()) }

    val currentAppearance = style.appearance(textLinkState)!!

    val mergedStyle = currentAppearance.textStyle.merge(
        TextStyle(
            color = currentAppearance.textStyle.color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            textAlign = textAlign,
            lineHeight = lineHeight,
            fontFamily = fontFamily,
            textDecoration = if (textLinkState.mouseState == ButtonMouseState.Hovered) {
                TextDecoration.Underline
            } else {
                TextDecoration.None
            },
            fontStyle = fontStyle,
            letterSpacing = letterSpacing
        )
    )

    Box(
        modifier = Modifier.onFocusEvent {
            textLinkState = textLinkState.copy(focused = it.isFocused)
        }.focusable(enabled, interactionSource).drawWithCache {
            onDrawBehind {
                if (textLinkState.focused) {
                    val controlOutline = RoundedCornerShape(2.dp).createOutline(size, layoutDirection, this)
                    val highlightOutline =
                        RoundRect(controlOutline.bounds.inflate(2.dp.toPx()), CornerRadius(4.dp.toPx()))
                    val highlightPath = Path().apply {
                        this.fillType = PathFillType.EvenOdd
                        addRoundRect(highlightOutline)
                        addOutline(controlOutline)
                        close()
                    }
                    style.appearance(textLinkState)?.let { drawPath(highlightPath, it.cursorBrush) }
                }
            }
        }.onKeyEvent {
            if (it.type != KeyEventType.KeyUp) return@onKeyEvent false
            if (!textLinkState.focused) return@onKeyEvent false
            when (it.key) {
                Key.Enter, Key.NumPadEnter -> {
                    textLinkState = textLinkState.copy(visited = true)
                    onClick()
                    return@onKeyEvent true
                }
            }
            false
        }
    ) {
        val rowInteractionSource = remember { MutableInteractionSource() }
        val focusManager = LocalFocusManager.current
        Row(
            modifier = modifier.focusProperties {
                this.canFocus = false
            }.clickable(
                onClick = {
                    textLinkState = textLinkState.copy(visited = true)
                    if (!textLinkState.focused) {
                        focusManager.clearFocus()
                    }
                    onClick()
                },
                enabled = enabled,
                role = Role.Button,
                indication = indication,
                interactionSource = rowInteractionSource
            ).pointerInput(Unit) {
                awaitPointerEventScope {
                    while (true) {
                        val event = awaitPointerEvent(PointerEventPass.Initial)
                        if (!enabled) {
                            return@awaitPointerEventScope
                        }
                        when (event.type) {
                            PointerEventType.Enter -> textLinkState = textLinkState.copy(mouseState = ButtonMouseState.Hovered)
                            PointerEventType.Exit -> textLinkState = textLinkState.copy(mouseState = ButtonMouseState.None)
                            PointerEventType.Press -> textLinkState = textLinkState.copy(mouseState = ButtonMouseState.Pressed)
                            PointerEventType.Release -> textLinkState = textLinkState.copy(mouseState = ButtonMouseState.Hovered)
                            else -> {}
                        }
                    }
                }
            }.composed {
                if (enabled) {
                    pointerHoverIcon(PointerIcon(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)))
                } else {
                    this
                }
            }
        ) {
            BasicText(
                text = text,
                style = mergedStyle,
                onTextLayout = onTextLayout,
                overflow = TextOverflow.Clip,
                softWrap = false,
                maxLines = 1
            )
            trailerIcon?.invoke()
        }
    }
}

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
    lineHeight: TextUnit = TextUnit.Unspecified,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    indication: Indication? = null,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextLinkStyle = LocalTextLinkStyle.current
) {
    Link(
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
        lineHeight = lineHeight,
        interactionSource = interactionSource,
        indication = indication,
        style = style,
        onTextLayout = onTextLayout,
    ) {
        Icon("icons/external_link_arrow.svg")
    }
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
    lineHeight: TextUnit = TextUnit.Unspecified,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    indication: Indication? = null,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextLinkStyle = LocalTextLinkStyle.current
) {
    Link(
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
        lineHeight = lineHeight,
        interactionSource = interactionSource,
        indication = indication,
        onTextLayout = onTextLayout,
        style = style
    ) {
        Icon("icons/linkDropTriangle.svg")
    }
}
