package org.jetbrains.jewel

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.unit.Dp
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
    val lineColor by tabStyle.colors.underlineTintFor(tabState)
    val lineThickness = remember { tabStyle.metrics.underlineThickness }
    val backgroundColor by tabStyle.colors.backGroundColorFor(state = tabState)
    val focusRequester = remember { FocusRequester() }
    println("\u001B $tabState")
    println("\u001B background color: $backgroundColor")

    Box(
        modifier = Modifier
            .background(backgroundColor)
            .focusable(interactionSource = interactionSource)
            .focusRequester(focusRequester)
            .onFocusChanged {
                tabState = tabState.copy(focused = it.isFocused)
            }
            .clickable {
                onTabClick()
                focusRequester.requestFocus()
            }
            .onPointerEvent(PointerEventType.Enter) {
                tabState = tabState.copy(hovered = true)
            }
            .onPointerEvent(PointerEventType.Exit) {
                tabState = tabState.copy(hovered = false)
            }
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
        Row(
            Modifier
                .padding(tabStyle.metrics.elementContentPadding)
                .defaultMinSize(Dp.Unspecified, tabStyle.metrics.elementMinHeight),
            horizontalArrangement = Arrangement.spacedBy(tabStyle.metrics.closeContentGap),
            verticalAlignment = Alignment.CenterVertically
        ) {
            tabIconResource?.let { icon ->
                Icon(icon)
            }
            Text(text = tabNameString, color = tabStyle.colors.foregroundColorFor(tabState).value)
            if (closable) {
                Icon(
                    modifier = Modifier.clickable { onTabClose() },
                    painter = tabStyle.icons.closePainter(LocalResourceLoader.current),
                    contentDescription = "Close tab $tabNameString",
                    tint = tabStyle.colors.closeTintFor(state = tabState).value
                )
            }
        }
    }
}

@Immutable
@JvmInline
value class TabState(val state: ULong) {

    @Stable
    val isFocused: Boolean
        get() = state and Focused != 0UL

    @Stable
    val isHovered: Boolean
        get() = state and Hovered != 0UL

    @Stable
    val isSelected: Boolean
        get() = state and Selected != 0UL

    fun copy(focused: Boolean = isFocused, hovered: Boolean = isHovered, selected: Boolean = isSelected): TabState =
        of(focused, hovered, selected)

    override fun toString(): String = "TabState(focused=$isFocused, Hovered=$isHovered, Selected=$isSelected)"

    companion object {

        private val Focused = 1UL shl 0
        private val Hovered = 1UL shl 1
        private val Selected = 1UL shl 2

        fun of(focused: Boolean = false, hovered: Boolean = false, selected: Boolean = false): TabState {
            return TabState(
                state = (if (focused) Focused else 0UL) or (if (hovered) Hovered else 0UL) or if (selected) Selected else 0UL
            )
        }
    }
}
