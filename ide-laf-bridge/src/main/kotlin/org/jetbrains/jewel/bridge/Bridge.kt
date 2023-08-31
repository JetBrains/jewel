@file:Suppress("UnstableApiUsage")

package org.jetbrains.jewel.bridge

import com.intellij.ide.ui.LafManager
import com.intellij.ide.ui.LafManagerListener
import com.intellij.openapi.application.Application
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.service
import com.intellij.ui.NewUI
import com.intellij.util.messages.MessageBus
import com.intellij.util.messages.SimpleMessageBusConnection
import com.intellij.util.messages.Topic
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ProducerScope
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.stateIn

internal val IntelliJApplication: Application
    get() = ApplicationManager.getApplication()

internal data class LookAndFeelEvent(val manager: LafManager, val isIntUi: Boolean) {
    companion object {
        val CURRENT = LookAndFeelEvent(IntelliJApplication.service(), NewUI.isEnabled())
    }
}

internal val Application.lookAndFeelFlow: Flow<LookAndFeelEvent>
    get() = messageBus.flow(LafManagerListener.TOPIC) {
        LafManagerListener { trySend(LookAndFeelEvent(it, NewUI.isEnabled())) }
    }

internal fun Application.lookAndFeelStateFlow(
    scope: CoroutineScope,
    sharingStarted: SharingStarted = SharingStarted.Eagerly,
): StateFlow<LookAndFeelEvent> = lookAndFeelFlow.stateIn(scope, sharingStarted, LookAndFeelEvent.CURRENT)

internal fun <L : Any, K> MessageBus.flow(
    topic: Topic<L>,
    listener: ProducerScope<K>.() -> L,
): Flow<K> = callbackFlow {
    val connection: SimpleMessageBusConnection = simpleConnect()
    connection.subscribe(topic, listener())
    awaitClose { connection.disconnect() }
}
