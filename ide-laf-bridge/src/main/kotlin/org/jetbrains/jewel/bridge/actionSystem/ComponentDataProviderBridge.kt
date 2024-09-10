package org.jetbrains.jewel.bridge.actionSystem

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.ComposePanel
import com.intellij.ide.DataManager

@Suppress("FunctionName")
@Composable
internal fun ComponentDataProviderBridge(
    component: ComposePanel,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    val rootDataProviderModifier = remember { RootDataProviderModifier() }

    Box(modifier = Modifier.then(rootDataProviderModifier).then(modifier)) { content() }

    DisposableEffect(component) {
        DataManager.registerDataProvider(component, rootDataProviderModifier)

        onDispose { DataManager.removeDataProvider(component) }
    }
}
