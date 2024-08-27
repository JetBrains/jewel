package org.jetbrains.jewel.bridge.actionSystem

import androidx.compose.ui.Modifier
import androidx.compose.ui.node.TraversableNode
import androidx.compose.ui.node.traverseDescendants
import org.jetbrains.annotations.VisibleForTesting
import org.jetbrains.jewel.foundation.InternalJewelApi
import org.jetbrains.jewel.foundation.actionSystem.DataProviderNode

@VisibleForTesting
@InternalJewelApi
public class RootDataProviderNode : Modifier.Node() {
    public fun getData(dataId: String): Any? {
        val context = DataProviderDataSinkContext(dataId)

        traverseDescendants(DataProviderNode) { dp ->
            if (dp is DataProviderNode) {
                if (!dp.hasFocus) {
                    return@traverseDescendants TraversableNode.Companion.TraverseDescendantsAction
                        .SkipSubtreeAndContinueTraversal
                } else {
                    dp.dataProvider(context)
                }
            }
            TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal
        }

        return context.lazyValue ?: context.value
    }
}
