package org.jetbrains.jewel.theme.idea

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.intellij.openapi.application.Application
import org.jetbrains.jewel.theme.intellij.IntelliJTheme
import org.jetbrains.jewel.theme.intellij.IntelliJThemeDefinition

@Composable
fun IntelliJTheme(app: Application = IntelliJApplication, content: @Composable () -> Unit) {
    val themeDefinition: IntelliJThemeDefinition? by remember { app.intellijThemeFlow }
        .collectAsState(null)

    themeDefinition?.let { themeDefinition ->
        IntelliJTheme(
            palette = themeDefinition.palette,
            metrics = themeDefinition.metrics,
            painters = themeDefinition.painters,
            typography = themeDefinition.typography,
            content = content
        )
    }
}
