package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.OnGloballyPositionedModifier
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

internal class AwaitFirstLayoutModifier : OnGloballyPositionedModifier {

    private var wasPositioned = false
    private var continuation: Continuation<Unit>? = null

    suspend fun waitForFirstLayout() {
        if (!wasPositioned) {
            val oldContinuation = continuation
            suspendCoroutine { continuation = it }
            oldContinuation?.resume(Unit)
        }
    }

    override fun onGloballyPositioned(coordinates: LayoutCoordinates) {
        if (!wasPositioned) {
            wasPositioned = true
            continuation?.resume(Unit)
            continuation = null
        }
    }
}
