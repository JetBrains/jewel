package org.jetbrains.jewel.samples.ideplugin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.jetbrains.jewel.CheckboxRow
import org.jetbrains.jewel.Divider
import org.jetbrains.jewel.LocalResourceLoader
import org.jetbrains.jewel.Orientation
import org.jetbrains.jewel.OutlinedButton
import org.jetbrains.jewel.Text
import org.jetbrains.jewel.TextField
import org.jetbrains.jewel.bridge.SwingBridgeTheme
import org.jetbrains.jewel.bridge.addComposePanel
import org.jetbrains.jewel.themes.intui.standalone.IntUiTheme

@ExperimentalCoroutinesApi
internal class JewelDemoToolWindow : ToolWindowFactory, DumbAware {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        toolWindow.addComposePanel("Jewel") {
            SwingBridgeTheme {
                val resourceLoader = LocalResourceLoader.current
                val bgColor = if (IntUiTheme.isDark) {
                    IntUiTheme.colorPalette.grey(2)
                } else {
                    IntUiTheme.colorPalette.grey(14)
                }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(bgColor),
                    contentAlignment = Alignment.Center,
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.CenterVertically)) {
                        var clicks by remember { mutableStateOf(0) }
                        OutlinedButton({ clicks++ }) {
                            Text("Hello world, $clicks")
                        }

                        var checked by remember { mutableStateOf(false) }

                        var textFieldValue by remember { mutableStateOf("") }
                        TextField(
                            value = textFieldValue,
                            onValueChange = {
                                textFieldValue = it
                            },
                        )

                        Row(
                            modifier = Modifier.weight(1f),
                            horizontalArrangement = Arrangement.spacedBy(24.dp),
                        ) {
                            Text("One")
                            Divider(
                                orientation = Orientation.Vertical,
                                startIndent = 12.dp,
                            )
                            Text("Two")
                            Divider(orientation = Orientation.Vertical)
                            Text("Three")
                            Divider(orientation = Orientation.Vertical)
                            Text("Four")
                        }

                        CheckboxRow(
                            checked = checked,
                            onCheckedChange = { checked = it },
                            resourceLoader = resourceLoader,
                        ) {
                            Text("Hello, I am a themed checkbox")
                        }
                    }
                }
            }
        }
    }
}
