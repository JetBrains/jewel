package org.jetbrains.jewel.components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.jewel.themes.expui.standalone.style.LocalAreaColors
import org.jetbrains.jewel.themes.expui.standalone.style.background

@Composable
fun Surface(content: @Composable () -> Unit) {
    Box(Modifier.background(LocalAreaColors.current)) {
        content()
    }
}
