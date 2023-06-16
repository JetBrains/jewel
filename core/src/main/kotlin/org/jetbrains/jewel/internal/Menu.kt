package org.jetbrains.jewel.internal

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import org.jetbrains.jewel.Orientation
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.border

@Composable
internal fun MenuContent(
    modifier: Modifier = Modifier,
    defaults: MenuDefaults = IntelliJTheme.menuDefaults,
    colors: MenuColors = defaults.menuColors(),
    content: MenuScope.() -> Unit
) {
    val items by remember(content) {
        derivedStateOf {
            content.asList()
        }
    }

    val scrollState = rememberScrollState()
    Box(
        modifier = modifier.shadow(
            defaults.menuShadowSize(),
            defaults.menuShape(),
            ambientColor = colors.shadowColor(),
            spotColor = colors.shadowColor()
        )
            .border(colors.borderStroke(), defaults.menuShape())
            .background(colors.background(), defaults.menuShape())
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(scrollState)
                .padding(defaults.menuContentPadding())
                .width(IntrinsicSize.Max)
        ) {
            items.forEach {
                MenuItem(
                    it.isSelected,
                    onClick = it.onClick,
                    enabled = it.isEnabled,
                ) {
                    it.content()
                    it.submenu
                }
            }
        }
        Box(modifier = Modifier.matchParentSize()) {
            VerticalScrollbar(
                rememberScrollbarAdapter(scrollState),
                modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd)
            )
        }
    }
}

interface MenuScope {

    fun selectableItem(
        isSelected: Boolean,
        isEnabled: Boolean = true,
        onItemClicked: () -> Unit = {},
        submenu: (MenuScope.() -> Unit)? = null,
        content: @Composable () -> Unit,
    )

    fun item(content: @Composable () -> Unit)
}

fun MenuScope.divider(content: @Composable () -> Unit) {
    selectableItem(isSelected = false, isEnabled = false, content = content)
}

fun MenuScope.items(
    count: Int,
    isSelected: (Int) -> Boolean,
    onItemClicked: (Int) -> Unit,
    submenu: (Int) -> (MenuScope.() -> Unit)? = { null },
    content: @Composable (Int) -> Unit,
) = repeat(count) {
    selectableItem(isSelected(it), onItemClicked = { onItemClicked(it) }, submenu = submenu(it)) { content(it) }
}

fun <T> MenuScope.items(
    items: List<T>,
    isSelected: (T) -> Boolean,
    onItemClicked: (T) -> Unit,
    submenu: (T) -> (MenuScope.() -> Unit)? = { null },
    content: @Composable (T) -> Unit,
) = repeat(items.count()) {
    selectableItem(isSelected(items[it]), onItemClicked = { onItemClicked(items[it]) }, submenu = submenu(items[it])) { content(items[it]) }
}

private fun (MenuScope.() -> Unit).asList() = buildList {
    this@asList(
        object : MenuScope {
            override fun selectableItem(
                isSelected: Boolean,
                isEnabled: Boolean,
                onItemClicked: () -> Unit,
                submenu: (MenuScope.() -> Unit)?,
                content: @Composable () -> Unit,
            ) {
                add(MenuScopeModel(isSelected, isEnabled, onItemClicked, submenu, content))
            }
        }
    )
}

private data class MenuScopeModel(
    val isSelected: Boolean,
    val isEnabled: Boolean = true,
    val onClick: () -> Unit = {},
    val submenu: (MenuScope.() -> Unit)? = null,
    val content: @Composable () -> Unit,
)

@Composable
fun MenuSeparator(
    modifier: Modifier = Modifier,
    defaults: MenuDefaults = IntelliJTheme.menuDefaults,
    colors: MenuItemColors = defaults.menuItemColors(),
) {
    Divider(
        modifier = modifier.padding(defaults.menuSeparatorPadding()),
        orientation = Orientation.Horizontal,
        color = colors.separatorColor(),
    )
}

@Composable
fun MenuItem(
    isSelected: Boolean,
    onClick: () -> Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    defaults: MenuDefaults = IntelliJTheme.menuDefaults,
    colors: MenuItemColors = defaults.menuItemColors(),
    shape: Shape = defaults.menuShape(),
    submenu: (MenuScope.() -> Unit)? = null,
    content: @Composable RowScope.() -> Unit
) {
    var itemState by remember(interactionSource) {
        mutableStateOf(MenuItemState.of(enabled = enabled))
    }

    remember(enabled) {
        itemState = itemState.copy(enabled = enabled)
    }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> itemState = itemState.copy(pressed = true)
                is PressInteraction.Cancel, is PressInteraction.Release -> itemState = itemState.copy(pressed = false)
                is HoverInteraction.Enter -> itemState = itemState.copy(hovered = true)
                is HoverInteraction.Exit -> itemState = itemState.copy(hovered = false)
                is FocusInteraction.Focus -> itemState = itemState.copy(focused = true)
                is FocusInteraction.Unfocus -> itemState = itemState.copy(focused = false)
            }
        }
    }

    val onDismiss = LocalPopupDismissRequest.current

    Box(
        modifier = modifier
            .clickable(
                onClick = {
                    val shouldDismiss = onClick()
                    if (shouldDismiss) {
                        onDismiss()
                    }
                },
                enabled = enabled,
                role = Role.Button,
                interactionSource = interactionSource,
                indication = null
            )
            .fillMaxWidth()
            .onGloballyPositioned {

            }
    ) {
        CompositionLocalProvider(
            LocalTextColor provides colors.foreground(itemState).value
        ) {
            Row(
                Modifier
                    .padding(defaults.menuItemPadding())
                    .background(colors.background(itemState).value, shape)
                    .border(colors.borderStroke(itemState).value, shape)
                    .padding(defaults.menuItemContentPadding()),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}

@Immutable
@JvmInline
value class MenuItemState(val state: ULong) {

    @Stable
    val isEnabled: Boolean
        get() = state and Enabled != 0UL

    @Stable
    val isFocused: Boolean
        get() = state and Focused != 0UL

    @Stable
    val isHovered: Boolean
        get() = state and Hovered != 0UL

    @Stable
    val isPressed: Boolean
        get() = state and Pressed != 0UL

    fun copy(
        enabled: Boolean = isEnabled,
        focused: Boolean = isFocused,
        hovered: Boolean = isHovered,
        pressed: Boolean = isPressed
    ): MenuItemState =
        of(enabled, focused, hovered, pressed)

    override fun toString(): String = "MenuItemState(enabled=$isEnabled, focused=$isFocused, hovered=$isHovered, pressed=$isPressed)"

    companion object {

        private val Enabled = 1UL shl 0
        private val Focused = 1UL shl 1
        private val Hovered = 1UL shl 2
        private val Pressed = 1UL shl 3

        fun of(enabled: Boolean, focused: Boolean = false, hovered: Boolean = false, pressed: Boolean = false): MenuItemState {
            var state = 0UL
            if (enabled) state = state or Enabled
            if (focused) state = state or Focused
            if (hovered) state = state or Hovered
            if (pressed) state = state or Pressed
            return MenuItemState(state)
        }
    }
}

@Stable
interface MenuColors {

    @Composable
    fun background(): Color

    @Composable
    fun borderStroke(): Stroke

    @Composable
    fun shadowColor(): Color
}

@Stable
interface MenuItemColors {

    @Composable
    fun foreground(state: MenuItemState): State<Color>

    @Composable
    fun background(state: MenuItemState): State<Color>

    @Composable
    fun borderStroke(state: MenuItemState): State<Stroke>

    @Composable
    fun separatorColor(): Color
}

@Stable
interface MenuDefaults {

    @Composable
    fun menuColors(): MenuColors

    @Composable
    fun menuItemColors(): MenuItemColors

    @Composable
    fun menuShape(): Shape

    @Composable
    fun menuItemShape(): Shape

    @Composable
    fun menuShadowSize(): Dp

    /**
     * The margin between the menu popup and the container(window/screen).
     */
    @Composable
    fun menuMargin(): PaddingValues

    @Composable
    fun menuOffset(): DpOffset

    /**
     * The alignment of the menu relative to the anchor component.
     */
    @Composable
    fun menuAlignment(): Alignment.Horizontal

    @Composable
    fun menuPadding(): PaddingValues

    @Composable
    fun menuContentPadding(): PaddingValues

    @Composable
    fun menuItemPadding(): PaddingValues

    @Composable
    fun menuItemContentPadding(): PaddingValues

    @Composable
    fun menuSeparatorPadding(): PaddingValues

    @Composable
    fun submenuChevronPainter(): Painter
}

fun menuColors(
    background: Color,
    borderStroke: Stroke,
    shadowColor: Color
): MenuColors = DefaultMenuColor(background, borderStroke, shadowColor)

private data class DefaultMenuColor(
    private val background: Color,
    private val borderStroke: Stroke,
    private val shadowColor: Color
) : MenuColors {

    @Composable
    override fun background(): Color = background

    @Composable
    override fun borderStroke(): Stroke = borderStroke

    @Composable
    override fun shadowColor(): Color = shadowColor
}

fun menuItemColors(
    foreground: Color,
    background: Color,
    borderStroke: Stroke,
    hoveredForeground: Color,
    hoveredBackground: Color,
    hoveredBorderStroke: Stroke,
    focusedForeground: Color,
    focusedBackground: Color,
    focusedBorderStroke: Stroke,
    disabledForeground: Color,
    disabledBackground: Color,
    disabledBorderStroke: Stroke,
    separatorColor: Color,
): MenuItemColors = DefaultMenuItemColor(
    foreground = foreground,
    background = background,
    borderStroke = borderStroke,
    hoveredForeground = hoveredForeground,
    hoveredBackground = hoveredBackground,
    hoveredBorderStroke = hoveredBorderStroke,
    focusedForeground = focusedForeground,
    focusedBackground = focusedBackground,
    focusedBorderStroke = focusedBorderStroke,
    disabledForeground = disabledForeground,
    disabledBackground = disabledBackground,
    disabledBorderStroke = disabledBorderStroke,
    separatorColor = separatorColor
)

private data class DefaultMenuItemColor(
    private val foreground: Color,
    private val background: Color,
    private val borderStroke: Stroke,
    private val hoveredForeground: Color,
    private val hoveredBackground: Color,
    private val hoveredBorderStroke: Stroke,
    private val focusedForeground: Color,
    private val focusedBackground: Color,
    private val focusedBorderStroke: Stroke,
    private val disabledForeground: Color,
    private val disabledBackground: Color,
    private val disabledBorderStroke: Stroke,
    private val separatorColor: Color,
) : MenuItemColors {

    @Composable
    override fun foreground(state: MenuItemState): State<Color> = rememberUpdatedState(
        when {
            !state.isEnabled -> disabledForeground
            state.isPressed || state.isHovered -> hoveredForeground
            state.isFocused -> focusedForeground
            else -> foreground
        }
    )

    @Composable
    override fun background(state: MenuItemState): State<Color> = rememberUpdatedState(
        when {
            !state.isEnabled -> disabledBackground
            state.isPressed || state.isHovered -> hoveredBackground
            state.isFocused -> focusedBackground
            else -> background
        }
    )

    @Composable
    override fun borderStroke(state: MenuItemState): State<Stroke> = rememberUpdatedState(
        when {
            !state.isEnabled -> disabledBorderStroke
            state.isPressed || state.isHovered -> hoveredBorderStroke
            state.isFocused -> focusedBorderStroke
            else -> borderStroke
        }
    )

    @Composable
    override fun separatorColor(): Color = separatorColor
}

internal val LocalMenuDefaults = staticCompositionLocalOf<MenuDefaults> {
    error("No MenuDefaults provided")
}
