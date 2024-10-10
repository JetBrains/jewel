package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.input.pointer.PointerEvent
import androidx.compose.ui.input.pointer.isPrimaryPressed
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.foundation.lazy.SelectableColumnKeybindings
import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState
import org.jetbrains.jewel.foundation.lazy.SelectionMode
import org.jetbrains.jewel.foundation.lazy.tree.BasicLazyTree
import org.jetbrains.jewel.foundation.lazy.tree.DefaultTreeViewKeyActions
import org.jetbrains.jewel.foundation.lazy.tree.DefaultTreeViewPointerEventAction
import org.jetbrains.jewel.foundation.lazy.tree.KeyActions
import org.jetbrains.jewel.foundation.lazy.tree.PointerEventActions
import org.jetbrains.jewel.foundation.lazy.tree.Tree
import org.jetbrains.jewel.foundation.lazy.tree.TreeElementState
import org.jetbrains.jewel.foundation.lazy.tree.TreeState
import org.jetbrains.jewel.foundation.lazy.tree.rememberTreeState
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.LocalContentColor
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.styling.LazyTreeStyle
import org.jetbrains.jewel.ui.theme.treeStyle

@ExperimentalJewelApi
@Composable
fun <T> CustomLazyTree(
    tree: Tree<T>,
    modifier: Modifier = Modifier,
    onElementClick: (Tree.Element<T>) -> Unit = {},
    treeState: TreeState = rememberTreeState(),
    onElementDoubleClick: (Tree.Element<T>) -> Unit = {},
    onSelectionChange: (List<Tree.Element<T>>) -> Unit = {},
    keyActions: KeyActions = DefaultTreeViewKeyActions(treeState),
    style: LazyTreeStyle = JewelTheme.treeStyle,
    nodeContent: @Composable (SelectableLazyItemScope.(Tree.Element<T>) -> Unit),
) {
    val colors = style.colors
    val metrics = style.metrics

    val pointerEventScopedActions: PointerEventActions = remember { CustomTreeViewPointerEventAction(treeState) }

    BasicLazyTree(
        tree = tree,
        onElementClick = onElementClick,
        elementBackgroundFocused = colors.elementBackgroundFocused,
        elementBackgroundSelectedFocused = colors.elementBackgroundSelectedFocused,
        elementBackgroundSelected = colors.elementBackgroundSelected,
        indentSize = metrics.indentSize,
        elementBackgroundCornerSize = metrics.elementBackgroundCornerSize,
        elementPadding = metrics.elementPadding,
        elementContentPadding = metrics.elementContentPadding,
        elementMinHeight = metrics.elementMinHeight,
        chevronContentGap = metrics.chevronContentGap,
        treeState = treeState,
        modifier = modifier,
        onElementDoubleClick = onElementDoubleClick,
        pointerEventScopedActions = pointerEventScopedActions,
        onSelectionChange = onSelectionChange,
        keyActions = keyActions,
        chevronContent = { elementState ->
            val painterProvider = style.icons.chevron(elementState.isExpanded, elementState.isSelected)
            Icon(key = painterProvider, contentDescription = null)
        },
    ) {
        val resolvedContentColor =
            style.colors
                .contentFor(TreeElementState.of(focused = isActive, selected = isSelected, expanded = false))
                .value
                .takeOrElse { LocalContentColor.current }

        CompositionLocalProvider(LocalContentColor provides resolvedContentColor) { nodeContent(it) }
    }
}

// Example detecting long press vs short press to handle pointer events separately. Disable
// selection here for both primary button presses, and long press (drag) use-cases
class CustomTreeViewPointerEventAction(treeState: TreeState) : DefaultTreeViewPointerEventAction(treeState) {
    private var pressStartTime: Long = 0
    private val longPressThreshold: Long = 500L
    private var isPrimary: Boolean = false

    override fun handlePointerEventPress(
        pointerEvent: PointerEvent,
        keybindings: SelectableColumnKeybindings,
        selectableLazyListState: SelectableLazyListState,
        selectionMode: SelectionMode,
        allKeys: List<SelectableLazyListKey>,
        key: Any,
    ) {
        pressStartTime = System.currentTimeMillis()
        isPrimary = pointerEvent.buttons.isPrimaryPressed
    }

    override fun handlePointerEventRelease(
        pointerEvent: PointerEvent,
        keybindings: SelectableColumnKeybindings,
        selectableLazyListState: SelectableLazyListState,
        selectionMode: SelectionMode,
        allKeys: List<SelectableLazyListKey>,
        key: Any,
    ) {
        val pressDuration = System.currentTimeMillis() - pressStartTime

        if (pressDuration >= longPressThreshold) {
            // Handle long press if needed, default action do nothing.
        } else {
            // Handle short press
            if (isPrimary) {
                super.handlePointerEventPress(
                    pointerEvent,
                    keybindings,
                    selectableLazyListState,
                    selectionMode,
                    allKeys,
                    key,
                )
            }
        }
    }
}
