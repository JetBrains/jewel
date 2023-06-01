package org.jetbrains.jewel.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.styles.LocalFrameStyle

@Composable
fun Surface(content: @Composable () -> Unit, backgroundColor: Color = LocalFrameStyle.current.defaultAppearance().backgroundColor) {
    Box(Modifier.background(backgroundColor)) {
        content()
    }
}
