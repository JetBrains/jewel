package org.jetbrains.jewel.samples.showcase.views

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.ui.icon.IconKey
import org.jetbrains.skiko.hostOs

public data class KeyBinding(
    val macOs: Set<String> = emptySet(),
    val windows: Set<String> = emptySet(),
    val linux: Set<String> = emptySet(),
)

public fun KeyBinding.forCurrentOs(): Set<String> =
    when {
        hostOs.isMacOS -> macOs
        hostOs.isLinux -> linux
        else -> windows
    }

public data class ViewInfo(
    val title: String,
    val iconKey: IconKey,
    val keyboardShortcut: KeyBinding? = null,
    val content: @Composable () -> Unit,
)
