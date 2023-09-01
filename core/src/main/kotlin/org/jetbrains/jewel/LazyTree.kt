package org.jetbrains.jewel

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.res.ResourceLoader
import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope
import org.jetbrains.jewel.foundation.tree.BasicLazyTree
import org.jetbrains.jewel.foundation.tree.DefaultTreeViewKeyActions
import org.jetbrains.jewel.foundation.tree.KeyBindingScopedActions
import org.jetbrains.jewel.foundation.tree.Tree
import org.jetbrains.jewel.foundation.tree.TreeElementState
import org.jetbrains.jewel.foundation.tree.TreeState
import org.jetbrains.jewel.foundation.tree.rememberTreeState
import org.jetbrains.jewel.styling.LazyTreeStyle

@ExperimentalJewelApi
@Composable
fun <T> LazyTree(
    tree: Tree<T>,
    resourceLoader: ResourceLoader,
    modifier: Modifier = Modifier,
    onElementClick: (Tree.Element<T>) -> Unit,
    treeState: TreeState = rememberTreeState(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onElementDoubleClick: (Tree.Element<T>) -> Unit = { },
    keyActions: KeyBindingScopedActions = DefaultTreeViewKeyActions(treeState),
    style: LazyTreeStyle = IntelliJTheme.treeStyle,
    nodeContent: @Composable SelectableLazyItemScope.(Tree.Element<T>) -> Unit,
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
        interactionSource = interactionSource,
        keyActions = keyActions,
        chevronContent = { elementState ->
            val painterProvider = style.icons.nodeChevron(elementState.isExpanded)
            val painter by painterProvider.getPainter(elementState, resourceLoader)
            Icon(painter = painter, contentDescription = null)
        },
        nodeContent = {
            CompositionLocalProvider(
                LocalContentColor provides (
                    style.colors.contentFor(
                        TreeElementState.of(
                            isFocused,
                            isSelected,
                            false,
                        ),
                    ).value
                        .takeOrElse { LocalContentColor.current }
                    ),
            ) { nodeContent(it) }
        },
    )
}
