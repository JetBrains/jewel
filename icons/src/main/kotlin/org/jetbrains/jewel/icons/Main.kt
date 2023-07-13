package org.jetbrains.jewel.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.jewel.IntelliJTheme
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
                Column(Modifier.fillMaxSize()) {
                    Button(onClick = { isDark = !isDark }) {
                        Text("Theme toggle: $isDark")
                    }
                    TestView()
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
    val actionsIcons = AllIcons.AllAssets

    LazyVerticalGrid(
        columns = GridCells.Adaptive(64.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(actionsIcons) {
            Box(
                modifier = Modifier.size(64.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = it.composeImageVector(),
                    contentDescription = it.name,
                    modifier = Modifier.size(it.size)
                )
            }
        }
    }
}

