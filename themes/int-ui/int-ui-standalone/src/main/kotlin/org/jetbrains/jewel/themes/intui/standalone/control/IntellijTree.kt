package org.jetbrains.jewel.themes.intui.standalone.control

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.components.Icon
import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope
import org.jetbrains.jewel.foundation.tree.DefaultTreeViewKeyActions
import org.jetbrains.jewel.foundation.tree.KeyBindingScopedActions
import org.jetbrains.jewel.foundation.tree.Tree
import org.jetbrains.jewel.foundation.tree.TreeState
import org.jetbrains.jewel.foundation.tree.TreeView
import org.jetbrains.jewel.foundation.tree.rememberTreeState

@Composable
fun <T> IntelliJTree(
    modifier: Modifier = Modifier,
    tree: Tree<T>,
    treeState: TreeState = rememberTreeState(),
    onElementClick: (Tree.Element<T>) -> Unit = { println("click") },
    onElementDoubleClick: (Tree.Element<T>) -> Unit = { println("double click") },
    keyActions: KeyBindingScopedActions = DefaultTreeViewKeyActions(treeState),
    elementContent: @Composable SelectableLazyItemScope.(Tree.Element<T>) -> Unit
) =
    TreeView(
        modifier = modifier,
        tree = tree,
        treeState = treeState,
        onElementClick = onElementClick,
        onElementDoubleClick = onElementDoubleClick,
        keyActions = keyActions,
        selectionFocusedBackgroundColor = Color.Unspecified.copy(alpha = .3f),
        selectionBackgroundColor = Color.Unspecified,
        arrowContent = { isOpen ->
            @Suppress("MagicNumber")
            Box(Modifier.rotate(if (isOpen) 0f else 270f)) {
                Icon("icons/linkDropTriangle.svg")
            }
        },
        elementContent = elementContent
    )
