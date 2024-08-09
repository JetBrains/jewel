package org.jetbrains.jewel.bridge.actionSystem

import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusEventModifierNode
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.node.TraversableNode
import com.intellij.openapi.actionSystem.DataKey

public interface DataProviderContext {
    public fun <TValue: Any> set(key: DataKey<TValue>, value: TValue?)
    public fun <TValue: Any> lazy(key: DataKey<TValue>, initializer: () -> TValue?)
}

internal class DataProviderNode(
    var dataProvider: DataProviderContext.() -> Unit,
) : Modifier.Node(), FocusEventModifierNode, TraversableNode {
    // TODO: should we use state here and in parent with children for thread safety? Will it trigger
    // recompositions?
    var hasFocus = false

    override fun onFocusEvent(focusState: FocusState) {
        hasFocus = focusState.hasFocus
    }

    override val traverseKey = TraverseKey

    companion object TraverseKey
}
