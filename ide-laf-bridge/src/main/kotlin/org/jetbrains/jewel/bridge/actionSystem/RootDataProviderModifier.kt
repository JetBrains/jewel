package org.jetbrains.jewel.bridge.actionSystem

import androidx.compose.ui.Modifier
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.TraversableNode
import androidx.compose.ui.node.traverseDescendants
import com.intellij.openapi.actionSystem.DataKey
import com.intellij.openapi.actionSystem.DataSink
import com.intellij.openapi.actionSystem.UiDataProvider
import org.jetbrains.annotations.VisibleForTesting

private class DataProviderDataSinkContext(
    private val dataSink: DataSink
): DataProviderContext {
    override fun <TValue: Any> set(key: DataKey<TValue>, value: TValue?) {
        if (value == null) {
            dataSink.setNull(key)
        }
        dataSink[key] = value
    }

    override fun <TValue: Any> lazy(key: DataKey<TValue>, initializer: () -> TValue?) {
        dataSink.lazy(key, initializer)
    }
}

internal class RootDataProviderNode: Modifier.Node(), UiDataProvider {
    override fun uiDataSnapshot(sink: DataSink) {
        val context = DataProviderDataSinkContext(sink)

        traverseDescendants(DataProviderNode.TraverseKey) { dp ->
            if (dp is DataProviderNode) {
                if (!dp.hasFocus) {
                    return@traverseDescendants TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal
                } else {
                    dp.dataProvider(context)
                }
            }
            TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal
        }
    }
}

@VisibleForTesting
internal class RootDataProviderModifier : ModifierNodeElement<RootDataProviderNode>(), UiDataProvider {
    private val rootNode = RootDataProviderNode()

    override fun uiDataSnapshot(sink: DataSink) {
        rootNode.uiDataSnapshot(sink)
    }

    override fun create() = rootNode

    override fun update(node: RootDataProviderNode) {
        // do nothing
    }

    override fun hashCode(): Int = rootNode.hashCode()

    override fun equals(other: Any?) = other === this
}
