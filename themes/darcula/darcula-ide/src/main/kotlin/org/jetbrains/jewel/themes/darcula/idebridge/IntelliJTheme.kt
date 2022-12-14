package org.jetbrains.jewel.themes.darcula.idebridge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.focus.onFocusChanged
import com.intellij.openapi.actionSystem.DataKey
import com.intellij.openapi.application.Application
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.IntelliJThemeDefinition
import org.jetbrains.jewel.styles.localNotProvided

internal val LocalDataProviders: ProvidableCompositionLocal<MutableMap<String, LinkedHashSet<DataHolder>>> = compositionLocalOf { localNotProvided() }

@Composable
fun IntelliJTheme(app: Application = IntelliJApplication, content: @Composable () -> Unit) {
    val themeDefinition: IntelliJThemeDefinition? by remember(app) { app.intellijThemeFlow }
        .collectAsState(null)

    themeDefinition?.let {
        IntelliJTheme(
            palette = it.palette,
            metrics = it.metrics,
            painters = it.painters,
            typography = it.typography,
            content = content
        )
    }
}


fun <T> Modifier.providesData(key: DataKey<T>, dataProvider: () -> T) = composed {
    val map = LocalDataProviders.current

    val holder = remember { DataHolder(dataProvider) }

    SideEffect {
        holder.dataProvider = dataProvider
    }

    DisposableEffect(key) {
        val set = map.getOrPut(key.name, ::linkedSetOf)
        set.add(holder)
        onDispose {
            set.remove(holder)
            if (set.isEmpty()) {
                map.remove(key.name)
            }
        }
    }

    onFocusChanged { holder.hasFocus = it.hasFocus }
}

internal class DataHolder(var dataProvider: () -> Any?) {
    var hasFocus: Boolean = false
}
