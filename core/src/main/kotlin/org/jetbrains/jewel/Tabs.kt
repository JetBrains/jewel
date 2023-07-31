package org.jetbrains.jewel

import androidx.compose.foundation.Image
import androidx.compose.foundation.Indication
import androidx.compose.foundation.IndicationInstance
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.styling.TabStyle

@Composable
fun Tab(
    selected: Boolean,
    tabNameString: String,
    tabIconResource: String? = null,
    closable: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    tabStyle: TabStyle = IntelliJTheme.defaultTabStyle,
    onTabClose: () -> Unit = {},
    onTabClick: () -> Unit = {},
) = TabImpl(
    selected = selected,
    tabNameString = tabNameString,
    tabIconResource = tabIconResource,
    closable = closable,
    interactionSource = interactionSource,
    tabStyle = tabStyle,
    onTabClose = onTabClose,
    onTabClick = onTabClick
)

@Composable
fun EditorTab(
    selected: Boolean,
    tabNameString: String,
    tabIconResource: String? = null,
    closable: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    tabStyle: TabStyle = IntelliJTheme.editorTabStyle,
    onTabClose: () -> Unit = {},
    onTabClick: () -> Unit = {},
) = TabImpl(
    selected = selected,
    tabNameString = tabNameString,
    tabIconResource = tabIconResource,
    closable = closable,
    interactionSource = interactionSource,
    tabStyle = tabStyle,
    onTabClose = onTabClose,
    onTabClick = onTabClick
)

@Composable
internal fun TabImpl(
    selected: Boolean,
    tabNameString: String,
    tabIconResource: String?,
    closable: Boolean,
    interactionSource: MutableInteractionSource,
    tabStyle: TabStyle,
    onTabClose: () -> Unit,
    onTabClick: () -> Unit,
) {
    var tabState by remember { mutableStateOf(TabState.of(selected = selected)) }
    remember(selected) { tabState = tabState.copy(selected = selected) }

    val lineColor by tabStyle.colors.underlineFor(tabState)
    val lineThickness = remember { tabStyle.metrics.underlineThickness }
    val backgroundColor by tabStyle.colors.backgroundFor(state = tabState)

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> {
                    tabState = tabState.copy(pressed = true)
                    onTabClick()
                }

                is PressInteraction.Cancel, is PressInteraction.Release -> {
                    tabState = tabState.copy(pressed = false)
                }

                is HoverInteraction.Enter -> tabState = tabState.copy(hovered = true)
                is HoverInteraction.Exit -> tabState = tabState.copy(hovered = false)
                is FocusInteraction.Focus -> tabState = tabState.copy(focused = true)
                is FocusInteraction.Unfocus -> tabState = tabState.copy(focused = false)
            }
        }
    }

    CompositionLocalProvider(
        LocalIndication provides NoIndication
    ) {
        Box(
            modifier = Modifier
                .background(backgroundColor)
                .focusable(interactionSource = interactionSource)
                .clickable(onClick = onTabClick, role = Role.Tab)
                .drawBehind {
                    val strokeThickness = lineThickness.toPx()
                    val startY = size.height - strokeThickness
                    val endX = size.width
                    val capDxFix = 3f
                    drawLine(
                        brush = SolidColor(lineColor),
                        start = Offset(0 + capDxFix, startY),
                        end = Offset(endX - capDxFix, startY),
                        strokeWidth = strokeThickness,
                        cap = StrokeCap.Round
                    )
                }
        ) {
            val contentAlpha by tabStyle.contentAlpha.alphaFor(tabState)

            Row(
                Modifier
                    .padding(tabStyle.metrics.elementContentPadding)
                    .defaultMinSize(Dp.Unspecified, tabStyle.metrics.elementMinHeight)
                    .alpha(contentAlpha),
                horizontalArrangement = Arrangement.spacedBy(tabStyle.metrics.closeContentGap),
                verticalAlignment = Alignment.CenterVertically
            ) {
                tabIconResource?.let { icon ->
                    val iconPainter = painterResource(icon, LocalResourceLoader.current)
                    Image(iconPainter, contentDescription = null)
                }
                Text(text = tabNameString, color = tabStyle.colors.contentFor(tabState).value)

                if (closable) {
                    val closePainter by tabStyle.icons.close.getPainter(tabState, LocalResourceLoader.current)
                    Image(
                        modifier = Modifier.clickable(onClick = onTabClose, role = Role.Button)
                            .size(16.dp),
                        painter = closePainter,
                        contentDescription = "Close tab $tabNameString"
                    )
                }
            }
        }
    }
}

private object NoIndication : Indication {
    private object NoIndicationInstance : IndicationInstance {

        override fun ContentDrawScope.drawIndication() {
            drawContent()
        }
    }

    @Composable
    override fun rememberUpdatedInstance(interactionSource: InteractionSource): IndicationInstance {
        return NoIndicationInstance
    }
}

@Immutable
@JvmInline
value class TabState(val state: ULong) : SelectableComponentState {

    @Stable
    override val isSelected: Boolean
        get() = state and Selected != 0UL

    @Stable
    override val isEnabled: Boolean
        get() = state and CommonStateBitMask.Enabled != 0UL

    @Stable
    override val isFocused: Boolean
        get() = state and CommonStateBitMask.Focused != 0UL

    @Stable
    override val isHovered: Boolean
        get() = state and CommonStateBitMask.Hovered != 0UL

    @Stable
    override val isPressed: Boolean
        get() = state and CommonStateBitMask.Pressed != 0UL

    fun copy(
        selected: Boolean = isSelected,
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        pressed: Boolean = isPressed,
        hovered: Boolean = isHovered,
    ) = of(
        selected = selected,
        enabled = enabled,
        focused = focused,
        pressed = pressed,
        hovered = hovered
    )

    override fun toString() =
        "${javaClass.simpleName}(isSelected=$isSelected, isEnabled=$isEnabled, isFocused=$isFocused, " +
            "isHovered=$isHovered, isPressed=$isPressed)"

    companion object {

        private const val SELECTED_BIT_OFFSET = CommonStateBitMask.FIRST_AVAILABLE_OFFSET

        private val Selected = 1UL shl SELECTED_BIT_OFFSET

        fun of(
            selected: Boolean,
            enabled: Boolean = true,
            focused: Boolean = false,
            pressed: Boolean = false,
            hovered: Boolean = false,
        ) = TabState(
            (if (selected) Selected else 0UL) or
                (if (enabled) CommonStateBitMask.Enabled else 0UL) or
                (if (focused) CommonStateBitMask.Focused else 0UL) or
                (if (pressed) CommonStateBitMask.Pressed else 0UL) or
                (if (hovered) CommonStateBitMask.Hovered else 0UL)
        )
    }
}
