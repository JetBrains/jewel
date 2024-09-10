package org.jetbrains.jewel.bridge.actionSystem

import androidx.compose.ui.node.ModifierNodeElement
import com.intellij.openapi.actionSystem.DataProvider
import org.jetbrains.annotations.VisibleForTesting

@VisibleForTesting
public class RootDataProviderModifier : ModifierNodeElement<RootDataProviderNode>(), DataProvider {
    private val rootNode = RootDataProviderNode()

    override fun getData(dataId: String): Any? = rootNode.getData(dataId)

    override fun create(): RootDataProviderNode = rootNode

    override fun update(node: RootDataProviderNode) {
        // do nothing
    }

    override fun hashCode(): Int = rootNode.hashCode()

    override fun equals(other: Any?): Boolean = other === this
}
