package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.InputMode
import androidx.compose.ui.input.InputModeManager
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalInputModeManager
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.modifier.onHover
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Active
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Enabled
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Focused
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Hovered
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Pressed
import org.jetbrains.jewel.foundation.state.CommonStateBitMask.Selected
import org.jetbrains.jewel.foundation.state.FocusableComponentState
import org.jetbrains.jewel.foundation.state.SelectableComponentState
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.LocalContentColor
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.component.styling.LocalMenuStyle
import org.jetbrains.jewel.ui.component.styling.MenuItemColors
import org.jetbrains.jewel.ui.component.styling.MenuItemMetrics
import org.jetbrains.jewel.ui.component.styling.MenuStyle
import org.jetbrains.jewel.ui.painter.hints.Stateful
import org.jetbrains.jewel.ui.theme.menuStyle

@Composable
fun PopupMenu(
    onDismissRequest: (InputMode) -> Boolean,
    horizontalAlignment: Alignment.Horizontal,
    modifier: Modifier = Modifier,
    style: MenuStyle = JewelTheme.menuStyle,
    content: MenuScope.() -> Unit,
) {
    val density = LocalDensity.current

    val popupPositionProvider = AnchorVerticalMenuPositionProvider(
        contentOffset = style.metrics.offset,
        contentMargin = style.metrics.menuMargin,
        alignment = horizontalAlignment,
        density = density,
    )

    var focusManager: FocusManager? by remember { mutableStateOf(null) }
    var inputModeManager: InputModeManager? by remember { mutableStateOf(null) }
    val menuManager = remember(onDismissRequest) {
        MenuManager(onDismissRequest = onDismissRequest)
    }

    Popup(
        popupPositionProvider = popupPositionProvider,
        onDismissRequest = { onDismissRequest(InputMode.Touch) },
        properties = PopupProperties(focusable = true),
        onPreviewKeyEvent = { false },
        onKeyEvent = {
            val currentFocusManager = checkNotNull(focusManager) { "FocusManager must not be null" }
            val currentInputModeManager = checkNotNull(inputModeManager) { "InputModeManager must not be null" }
            handlePopupMenuOnKeyEvent(it, currentFocusManager, currentInputModeManager, menuManager)
        },
    ) {
        focusManager = LocalFocusManager.current
        inputModeManager = LocalInputModeManager.current

        CompositionLocalProvider(
            LocalMenuManager provides menuManager,
            LocalMenuStyle provides style,
        ) {
            MenuContent(
                modifier = modifier,
                content = content,
            )
        }
    }
}

@Composable
internal fun MenuContent(
    modifier: Modifier = Modifier,
    style: MenuStyle = JewelTheme.menuStyle,
    content: MenuScope.() -> Unit,
) {
    val items by remember(content) {
        derivedStateOf {
            content.asList()
        }
    }

    val localMenuManager = LocalMenuManager.current
    val scrollState = rememberScrollState()
    val colors = style.colors
    val menuShape = RoundedCornerShape(style.metrics.cornerSize)

    Box(
        modifier = modifier.shadow(
            elevation = style.metrics.shadowSize,
            shape = menuShape,
            ambientColor = colors.shadow,
            spotColor = colors.shadow,
        )
            .border(Stroke.Alignment.Center, style.metrics.borderWidth, colors.border, menuShape)
            .background(colors.background, menuShape)
            .width(IntrinsicSize.Max)
            .onHover {
                localMenuManager.onHoveredChange(it)
            },
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(scrollState)
                .padding(style.metrics.contentPadding),
        ) {
            items.forEach {
                when (it) {
                    is MenuSelectableItem -> {
                        MenuItem(
                            selected = it.isSelected,
                            onClick = it.onClick,
                            enabled = it.isEnabled,
                            content = it.content,
                        )
                    }

                    is SubmenuItem -> {
                        MenuSubmenuItem(
                            enabled = it.isEnabled,
                            submenu = it.submenu,
                            content = it.content,
                        )
                    }

                    else -> {
                        it.content()
                    }
                }
            }
        }
        Box(modifier = Modifier.matchParentSize()) {
            VerticalScrollbar(
                rememberScrollbarAdapter(scrollState),
                modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
            )
        }
    }
}

interface MenuScope {

    fun selectableItem(
        selected: Boolean,
        onClick: () -> Unit,
        enabled: Boolean = true,
        content: @Composable () -> Unit,
    )

    fun submenu(
        enabled: Boolean = true,
        submenu: MenuScope.() -> Unit,
        content: @Composable () -> Unit,
    )

    fun passiveItem(content: @Composable () -> Unit)
}

fun MenuScope.separator() {
    passiveItem {
        MenuSeparator()
    }
}

fun MenuScope.items(
    count: Int,
    isSelected: (Int) -> Boolean,
    onItemClick: (Int) -> Unit,
    content: @Composable (Int) -> Unit,
) {
    repeat(count) {
        selectableItem(isSelected(it), onClick = { onItemClick(it) }) { content(it) }
    }
}

fun <T> MenuScope.items(
    items: List<T>,
    isSelected: (T) -> Boolean,
    onItemClick: (T) -> Unit,
    content: @Composable (T) -> Unit,
) {
    repeat(items.count()) {
        selectableItem(isSelected(items[it]), onClick = { onItemClick(items[it]) }) { content(items[it]) }
    }
}

private fun (MenuScope.() -> Unit).asList() = buildList {
    this@asList(
        object : MenuScope {
            override fun selectableItem(
                selected: Boolean,
                onClick: () -> Unit,
                enabled: Boolean,
                content: @Composable () -> Unit,
            ) {
                add(MenuSelectableItem(selected, enabled, onClick, content))
            }

            override fun passiveItem(content: @Composable () -> Unit) {
                add(MenuPassiveItem(content))
            }

            override fun submenu(enabled: Boolean, submenu: MenuScope.() -> Unit, content: @Composable () -> Unit) {
                add(SubmenuItem(enabled, submenu, content))
            }
        },
    )
}

private interface MenuItem {

    val content: @Composable () -> Unit
}

private data class MenuSelectableItem(
    val isSelected: Boolean,
    val isEnabled: Boolean = true,
    val onClick: () -> Unit = {},
    override val content: @Composable () -> Unit,
) : MenuItem

private data class MenuPassiveItem(
    override val content: @Composable () -> Unit,
) : MenuItem

private data class SubmenuItem(
    val isEnabled: Boolean = true,
    val submenu: MenuScope.() -> Unit,
    override val content: @Composable () -> Unit,
) : MenuItem

@Composable
fun MenuSeparator(
    modifier: Modifier = Modifier,
    metrics: MenuItemMetrics = JewelTheme.menuStyle.metrics.itemMetrics,
    colors: MenuItemColors = JewelTheme.menuStyle.colors.itemColors,
) {
    Divider(
        orientation = Orientation.Horizontal,
        modifier = modifier.padding(metrics.separatorPadding),
        color = colors.separator,
        thickness = metrics.separatorThickness,
    )
}

@Composable
fun MenuItem(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: MenuStyle = JewelTheme.menuStyle,
    content: @Composable () -> Unit,
) {
    var itemState by remember(interactionSource) {
        mutableStateOf(MenuItemState.of(selected = selected, enabled = enabled))
    }

    remember(enabled, selected) {
        itemState = itemState.copy(selected = selected, enabled = enabled)
    }

    val focusRequester = remember { FocusRequester() }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> itemState = itemState.copy(pressed = true)
                is PressInteraction.Cancel, is PressInteraction.Release -> itemState = itemState.copy(pressed = false)
                is HoverInteraction.Enter -> {
                    itemState = itemState.copy(hovered = true)
                    focusRequester.requestFocus()
                }

                is HoverInteraction.Exit -> itemState = itemState.copy(hovered = false)
                is FocusInteraction.Focus -> itemState = itemState.copy(focused = true)
                is FocusInteraction.Unfocus -> itemState = itemState.copy(focused = false)
            }
        }
    }

    val menuManager = LocalMenuManager.current
    val localInputModeManager = LocalInputModeManager.current

    Box(
        modifier = modifier
            .focusRequester(focusRequester)
            .selectable(
                selected = selected,
                onClick = {
                    onClick()
                    menuManager.closeAll(localInputModeManager.inputMode, true)
                },
                enabled = enabled,
                role = Role.Button,
                interactionSource = interactionSource,
                indication = null,
            )
            .fillMaxWidth(),
    ) {
        DisposableEffect(Unit) {
            if (selected) {
                focusRequester.requestFocus()
            }

            onDispose { }
        }

        val itemColors = style.colors.itemColors
        val itemMetrics = style.metrics.itemMetrics

        CompositionLocalProvider(
            LocalContentColor provides itemColors.contentFor(itemState).value,
        ) {
            val backgroundColor by itemColors.backgroundFor(itemState)

            Box(
                Modifier
                    .fillMaxWidth()
                    .drawItemBackground(itemMetrics, backgroundColor)
                    .padding(itemMetrics.contentPadding),
            ) {
                content()
            }
        }
    }
}

@Composable
fun MenuSubmenuItem(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: MenuStyle = JewelTheme.menuStyle,
    submenu: MenuScope.() -> Unit,
    content: @Composable () -> Unit,
) {
    var itemState by remember(interactionSource) {
        mutableStateOf(MenuItemState.of(selected = false, enabled = enabled))
    }

    remember(enabled) {
        itemState = itemState.copy(selected = false, enabled = enabled)
    }

    val focusRequester = remember { FocusRequester() }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> itemState = itemState.copy(pressed = true)
                is PressInteraction.Cancel, is PressInteraction.Release -> itemState = itemState.copy(pressed = false)
                is HoverInteraction.Enter -> {
                    itemState = itemState.copy(hovered = true, selected = true)
                    focusRequester.requestFocus()
                }

                is HoverInteraction.Exit -> itemState = itemState.copy(hovered = false)
                is FocusInteraction.Focus -> itemState = itemState.copy(focused = true)
                is FocusInteraction.Unfocus -> itemState = itemState.copy(focused = false)
            }
        }
    }

    val itemColors = style.colors.itemColors
    val menuMetrics = style.metrics

    val backgroundColor by itemColors.backgroundFor(itemState)
    Box(
        modifier = modifier
            .fillMaxWidth()
            .drawItemBackground(menuMetrics.itemMetrics, backgroundColor)
            .focusRequester(focusRequester)
            .clickable(
                onClick = {
                    itemState = itemState.copy(selected = !itemState.isSelected)
                },
                enabled = enabled,
                role = Role.Button,
                interactionSource = interactionSource,
                indication = null,
            )
            .onKeyEvent {
                if (it.type == KeyEventType.KeyDown && it.key == Key.DirectionRight) {
                    itemState = itemState.copy(selected = true)
                    true
                } else {
                    false
                }
            },
    ) {
        CompositionLocalProvider(
            LocalContentColor provides itemColors.contentFor(itemState).value,
        ) {
            Row(
                Modifier.fillMaxWidth()
                    .padding(menuMetrics.itemMetrics.contentPadding),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(Modifier.weight(1f)) {
                    content()
                }

                val chevronPainter by style.icons.submenuChevron.getPainter(Stateful(itemState))
                Icon(
                    painter = chevronPainter,
                    tint = itemColors.iconTintFor(itemState).value,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp),
                )
            }
        }

        if (itemState.isSelected) {
            Submenu(
                onDismissRequest = {
                    if (it == InputMode.Touch && itemState.isHovered) {
                        false
                    } else {
                        itemState = itemState.copy(selected = false)
                        true
                    }
                },
                style = style,
                content = submenu,
            )
        }
    }
}

private fun Modifier.drawItemBackground(itemMetrics: MenuItemMetrics, backgroundColor: Color) =
    drawBehind {
        val cornerSizePx = itemMetrics.selectionCornerSize.toPx(size, density = this)
        val cornerRadius = CornerRadius(cornerSizePx, cornerSizePx)

        val outerPadding = itemMetrics.outerPadding
        val offset = Offset(
            x = outerPadding.calculateLeftPadding(layoutDirection).toPx(),
            y = outerPadding.calculateTopPadding().toPx(),
        )
        drawRoundRect(
            color = backgroundColor,
            cornerRadius = cornerRadius,
            topLeft = offset,
            size = size.subtract(outerPadding, density = this, layoutDirection),
        )
    }

private fun Size.subtract(paddingValues: PaddingValues, density: Density, layoutDirection: LayoutDirection): Size =
    with(density) {
        Size(
            width - paddingValues.calculateLeftPadding(layoutDirection).toPx() -
                paddingValues.calculateRightPadding(layoutDirection).toPx(),
            height - paddingValues.calculateTopPadding().toPx() -
                paddingValues.calculateBottomPadding().toPx(),
        )
    }

@Composable
internal fun Submenu(
    onDismissRequest: (InputMode) -> Boolean,
    modifier: Modifier = Modifier,
    style: MenuStyle = JewelTheme.menuStyle,
    content: MenuScope.() -> Unit,
) {
    val density = LocalDensity.current

    val popupPositionProvider = AnchorHorizontalMenuPositionProvider(
        contentOffset = style.metrics.submenuMetrics.offset,
        contentMargin = style.metrics.menuMargin,
        alignment = Alignment.Top,
        density = density,
    )

    var focusManager: FocusManager? by remember { mutableStateOf(null) }
    var inputModeManager: InputModeManager? by remember { mutableStateOf(null) }
    val parentMenuManager = LocalMenuManager.current
    val menuManager = remember(parentMenuManager, onDismissRequest) {
        parentMenuManager.submenuManager(onDismissRequest)
    }

    Popup(
        popupPositionProvider = popupPositionProvider,
        onDismissRequest = {
            menuManager.closeAll(InputMode.Touch, false)
        },
        properties = PopupProperties(focusable = true),
        onPreviewKeyEvent = { false },
        onKeyEvent = {
            val currentFocusManager = checkNotNull(focusManager) { "FocusManager must not be null" }
            val currentInputModeManager = checkNotNull(inputModeManager) { "InputModeManager must not be null" }
            handlePopupMenuOnKeyEvent(it, currentFocusManager, currentInputModeManager, menuManager)
        },
    ) {
        focusManager = LocalFocusManager.current
        inputModeManager = LocalInputModeManager.current

        CompositionLocalProvider(LocalMenuManager provides menuManager) {
            MenuContent(
                modifier = modifier,
                content = content,
            )
        }
    }
}

@Immutable
@JvmInline
value class MenuItemState(val state: ULong) : SelectableComponentState, FocusableComponentState {

    @Stable
    override val isActive: Boolean
        get() = state and Selected != 0UL

    @Stable
    override val isSelected: Boolean
        get() = state and Selected != 0UL

    @Stable
    override val isEnabled: Boolean
        get() = state and Enabled != 0UL

    @Stable
    override val isFocused: Boolean
        get() = state and Focused != 0UL

    @Stable
    override val isHovered: Boolean
        get() = state and Hovered != 0UL

    @Stable
    override val isPressed: Boolean
        get() = state and Pressed != 0UL

    fun copy(
        selected: Boolean = isSelected,
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        hovered: Boolean = isHovered,
        pressed: Boolean = isPressed,
        active: Boolean = isActive,
    ): MenuItemState =
        of(selected, enabled, focused, hovered, pressed, active)

    override fun toString() =
        "MenuItemState(state=$state, isSelected=$isSelected, isEnabled=$isEnabled, isFocused=$isFocused, " +
            "isHovered=$isHovered, isPressed=$isPressed, isActive=$isActive)"

    companion object {

        fun of(
            selected: Boolean,
            enabled: Boolean,
            focused: Boolean = false,
            hovered: Boolean = false,
            pressed: Boolean = false,
            active: Boolean = false,
        ): MenuItemState {
            var state = 0UL
            if (selected) state = state or Selected
            if (enabled) state = state or Enabled
            if (focused) state = state or Focused
            if (hovered) state = state or Hovered
            if (pressed) state = state or Pressed
            if (active) state = state or Active
            return MenuItemState(state)
        }
    }
}
