package org.jetbrains.jewel.icons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.icons.allicons.AllAssets
import org.jetbrains.jewel.icons.allicons.General
import org.jetbrains.jewel.themes.intui.standalone.dark.DarkTheme
import org.jetbrains.jewel.themes.intui.standalone.light.LightTheme

fun main() {
    singleWindowApplication(
        title = "TODO: sample app"
    ) {
        var isDark by remember { mutableStateOf(false) }

        JetBrainsTheme(isDark = isDark) {
            Surface(
                color = IntelliJTheme.colors.background
            ) {
                Column {
                    TestView()
                    Button(onClick = { isDark = !isDark }) {
                        Text("Theme toggle: $isDark")
                    }
                }
            }
        }
    }
}

@Composable
fun JetBrainsTheme(isDark: Boolean, content: @Composable () -> Unit) =
    IntelliJTheme(
        if (isDark) DarkTheme else LightTheme,
        content
    )

@Composable
fun TestView() {
    val actionsIcons = AllIcons.General.AllAssets

    LazyVerticalGrid(
        columns = GridCells.Adaptive(100.dp),
    ) {
        items(actionsIcons) {
            IntellijIcon(
                iconData = it,
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )
        }
    }
}

