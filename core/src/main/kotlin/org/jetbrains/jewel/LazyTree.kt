package org.jetbrains.jewel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.takeOrElse
import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope
import org.jetbrains.jewel.foundation.tree.BasicLazyTree
import org.jetbrains.jewel.foundation.tree.DefaultTreeViewKeyActions
import org.jetbrains.jewel.foundation.tree.KeyBindingActions
import org.jetbrains.jewel.foundation.tree.Tree
import org.jetbrains.jewel.foundation.tree.TreeElementState
import org.jetbrains.jewel.foundation.tree.TreeState
import org.jetbrains.jewel.foundation.tree.rememberTreeState
import org.jetbrains.jewel.styling.LazyTreeStyle

@ExperimentalJewelApi
@Composable
fun <T> LazyTree(
    tree: Tree<T>,
    modifier: Modifier = Modifier,
    onElementClick: (Tree.Element<T>) -> Unit = {},
    treeState: TreeState = rememberTreeState(),
    onElementDoubleClick: (Tree.Element<T>) -> Unit = {},
    onSelectionChange: (List<Tree.Element<T>>) -> Unit = {},
    keyActions: KeyBindingActions = DefaultTreeViewKeyActions(treeState),
    style: LazyTreeStyle = IntelliJTheme.treeStyle,
    nodeContent: @Composable (SelectableLazyItemScope.(Tree.Element<T>) -> Unit),
) {
    val colors = style.colors
    val metrics = style.metrics
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
        onSelectionChange = onSelectionChange,
        keyActions = keyActions,
        chevronContent = { elementState ->
            val painterProvider = style.icons.chevron(elementState.isExpanded, elementState.isSelected)
            val painter by painterProvider.getPainter()
            Icon(painter = painter, contentDescription = null)
        },
    ) {
        CompositionLocalProvider(
            LocalContentColor provides (
                style.colors.contentFor(
                    TreeElementState.of(
                        focused = isActive,
                        selected = isSelected,
                        expanded = false,
                    ),
                ).value
                    .takeOrElse { LocalContentColor.current }
                ),
        ) { nodeContent(it) }
    }
}
