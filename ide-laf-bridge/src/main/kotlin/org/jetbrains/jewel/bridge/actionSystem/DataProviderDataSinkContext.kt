package org.jetbrains.jewel.bridge.actionSystem

import org.jetbrains.jewel.foundation.actionSystem.DataProviderContext

internal class DataProviderDataSinkContext(private val wantedId: String) : DataProviderContext {
    var value: Any? = null
    var lazyValue: (() -> Any?)? = null

    override fun <TValue : Any> set(key: String, value: TValue?) {
        if (key == wantedId) {
            this.value = value
        }
    }

    override fun <TValue : Any> lazy(key: String, initializer: () -> TValue?) {
        if (key == wantedId) {
            lazyValue = initializer
        }
    }
}
