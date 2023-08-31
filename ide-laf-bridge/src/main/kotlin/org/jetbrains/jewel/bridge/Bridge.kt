@file:Suppress("UnstableApiUsage")

package org.jetbrains.jewel.bridge

import com.intellij.ide.ui.LafManagerListener
import com.intellij.openapi.application.Application
import com.intellij.openapi.application.ApplicationManager
import com.intellij.util.messages.SimpleMessageBusConnection
import com.intellij.util.messages.Topic
import kotlinx.coroutines.channels.ProducerScope
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlin.random.Random

internal val IntelliJApplication: Application
    get() = ApplicationManager.getApplication()

internal val Application.lookAndFeelFlow: Flow<Int>
    get() = messageBusFlow(LafManagerListener.TOPIC, { 0 }) {
        LafManagerListener { trySend(Random.nextInt()) }
    }

internal fun <L : Any, K> Application.messageBusFlow(
    topic: Topic<L>,
    initialValue: (suspend () -> K)? = null,
    @BuilderInference listener: ProducerScope<K>.() -> L,
): Flow<K> = callbackFlow {
    initialValue?.let { send(it()) }
    val connection: SimpleMessageBusConnection = messageBus.simpleConnect()
    connection.subscribe(topic, listener())
    awaitClose { connection.disconnect() }
}
