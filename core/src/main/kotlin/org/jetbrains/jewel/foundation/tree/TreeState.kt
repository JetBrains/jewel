package org.jetbrains.jewel.foundation.tree

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState
import org.jetbrains.jewel.foundation.utils.Log

@Composable
fun rememberTreeState() = remember {
    TreeState(SelectableLazyListState(LazyListState()))
}

class TreeState(
    internal val delegate: SelectableLazyListState,
) {

    internal val allNodes = mutableStateListOf<Pair<Any,Int>>()
    internal val openNodes = mutableStateListOf<Any>()
//
//    suspend fun selectSingleElement(elementIndex: Int, changeFocus: Boolean = true): Boolean {
////        delegate.selectedKeys.clear()
//
////        delegate.selectSingleItem(elementIndex, changeFocus)
//        return true
//    }
//
//    suspend fun addElementsToSelection(indexList: List<Int>, itemToFocus: Int? = indexList.lastOrNull()) {
////        delegate.addElementsToSelection(indexList, itemToFocus)
//    }
//
//    suspend fun addElementToSelection(elementIndex: Int, changeFocus: Boolean = true) {
////        delegate.addElementToSelection(elementIndex, changeFocus)
//    }
//
//    suspend fun toggleElementSelection(flattenIndex: Int) {
////        delegate.toggleSelection(flattenIndex)
//    }
//
//    suspend fun deselectElement(itemIndex: Int, changeFocus: Boolean = true) {
////        delegate.deselectSingleElement(itemIndex, changeFocus)
//    }
//
//    fun deselectAll() {
////        delegate.deselectAll()
//    }

    fun toggleNode(nodeId: Any) {
        Log.d("toggleNode $nodeId")
        if (nodeId in openNodes) {
            openNodes.remove(nodeId)
        } else {
            openNodes.add(nodeId)
        }
        Log.d("open nodes ${openNodes.map { it.toString() }}")
    }
}
