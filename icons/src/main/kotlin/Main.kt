package org.jetbrains.jewel.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
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
import assets.JetnewsAssets
import assets.jetnewsassets.Actions
import assets.jetnewsassets.actions.BuildChanges
import assets.jetnewsassets.actions.Buildautoreloadchanges
import assets.jetnewsassets.actions.BuildautoreloadchangesDark
import assets.jetnewsassets.actions.Filterdups
import assets.jetnewsassets.actions.Newfolder
import assets.jetnewsassets.actions.Togglevisibility
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
                Column {
                    TestView()
                    Button(onClick = { isDark = !isDark }) {
                        Text("Theme toggle")
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
    Column {
        Image(
            imageVector = BuildChanges,
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )
        Icon(
            imageVector = JetnewsAssets.Actions.Filterdups,
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )
        Image(
            imageVector = JetnewsAssets.Actions.Newfolder,
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )
        Image(
            imageVector = JetnewsAssets.Actions.Togglevisibility,
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )
    }
}

