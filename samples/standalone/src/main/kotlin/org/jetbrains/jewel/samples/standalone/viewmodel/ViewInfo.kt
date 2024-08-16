package org.jetbrains.jewel.samples.standalone.viewmodel

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.ui.icon.IconKey

data class ViewInfo(
    val title: String,
    val iconKey: IconKey,
    val keyboardShortcut: Set<String>? = null,
    val content: @Composable () -> Unit,
)
