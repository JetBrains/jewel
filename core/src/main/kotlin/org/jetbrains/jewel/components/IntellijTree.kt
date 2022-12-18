package org.jetbrains.jewel.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.LocalPainters
import org.jetbrains.jewel.LocalPalette
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
        selectionFocusedBackgroundColor = LocalPalette.current.treeView.focusedSelectedElementBackground,
        selectionBackgroundColor = LocalPalette.current.treeView.selectedElementBackGroundColor,
        arrowContent = { isOpen ->
            @Suppress("MagicNumber")
            Box(Modifier.size(15.dp, 15.dp)) {
                if (isOpen) LocalPainters.current.treeView.arrowNodeOpen.invoke() else LocalPainters.current.treeView.arrowNodeClosed.invoke()
            }
        },
        elementContent = elementContent
    )
