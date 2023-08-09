package org.jetbrains.jewel.foundation.tree

import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState

open class DefaultTreeViewOnKeyEvent(
    override val keybindings: TreeViewKeybindings,
    private val treeState: TreeState,
) : TreeViewOnKeyEvent {

    override fun onSelectParent(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        val currentKey = keys[state.lastActiveItemIndex ?: 0].key
        val keyNodeList = treeState.allNodes.map { it.first }

        //case 1 we are a leaf, go upside until we find a node
        if (currentKey !in keyNodeList) {
            keys.indexOf(currentKey)
                .takeIf { it >= 0 }
                ?.let {
                    for (i in it downTo 0) {
                        if (keys[i].key in keyNodeList) {
                            if (keys[i] is SelectableLazyListKey.Selectable) {
                                state.lastActiveItemIndex = i
                                state.selectedKeys = listOf(keys[i].key)
                            }
                            break
                        }
                    }
                }
        } else {
            //case 2 we are a node, go upside until we find first node with a lower depth
            //if is open just close it
            if(treeState.openNodes.contains(currentKey)) {
                treeState.toggleNode(currentKey)
                return
            }
            treeState.allNodes.first { it.first == currentKey }.let { currentNode ->
                treeState.allNodes
                    .subList(0, treeState.allNodes.indexOf(currentNode))
                    .reversed()
                    .firstOrNull { it.second < currentNode.second }
                    ?.let { (parentNodeKey, _) ->
                        keys.first { it.key == parentNodeKey }
                            .takeIf { it is SelectableLazyListKey.Selectable }
                            ?.let {
                                state.lastActiveItemIndex = keys.indexOfFirst { it.key == parentNodeKey }
                                state.selectedKeys = listOf(parentNodeKey)
                            }
                    }
            }
        }
    }

    override fun onSelectChild(keys: List<SelectableLazyListKey>, state: SelectableLazyListState) {
        val currentKey = keys[state.lastActiveItemIndex ?: 0].key
        if (currentKey in treeState.allNodes.map { it.first } && currentKey !in treeState.openNodes)
            treeState.toggleNode(currentKey)
        else {
            super.onSelectNextItem(keys, state)
        }
    }
}
