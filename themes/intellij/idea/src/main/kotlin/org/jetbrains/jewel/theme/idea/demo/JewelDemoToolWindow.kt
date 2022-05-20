package org.jetbrains.jewel.theme.idea.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.layout.panel
import com.intellij.util.ui.JBFont
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.jetbrains.jewel.Orientation
import org.jetbrains.jewel.theme.idea.IntelliJTheme
import org.jetbrains.jewel.theme.idea.addComposePanel
import org.jetbrains.jewel.theme.intellij.IntelliJTheme
import org.jetbrains.jewel.theme.intellij.components.Button
import org.jetbrains.jewel.theme.intellij.components.Checkbox
import org.jetbrains.jewel.theme.intellij.components.CheckboxRow
import org.jetbrains.jewel.theme.intellij.components.Divider
import org.jetbrains.jewel.theme.intellij.components.Tab
import org.jetbrains.jewel.theme.intellij.components.TabRow
import org.jetbrains.jewel.theme.intellij.components.TabScope
import org.jetbrains.jewel.theme.intellij.components.Text
import org.jetbrains.jewel.theme.intellij.components.TextField
import org.jetbrains.jewel.theme.intellij.components.rememberTabContainerState

@ExperimentalCoroutinesApi
internal class JewelDemoToolWindow : ToolWindowFactory, DumbAware {

    enum class RadioSample {
        Enabled, Disabled, Automatic, Unavailable
    }

    @OptIn(ExperimentalComposeUiApi::class)
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        toolWindow.addComposePanel("Compose Demo") {
            IntelliJTheme(this) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(IntelliJTheme.palette.background),
                    contentAlignment = Alignment.Center
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.CenterVertically)) {
                        var clicks by remember { mutableStateOf(0) }
                        Button({ clicks++ }) {
                            Text("Hello world, $clicks")
                        }

                        var checked by remember { mutableStateOf(false) }

                        var textFieldValue by remember { mutableStateOf("") }
                        TextField(
                            value = textFieldValue,
                            onValueChange = {
                                textFieldValue = it
                            }
                        )

                        Row(
                            modifier = Modifier.weight(1f),
                            horizontalArrangement = Arrangement.spacedBy(24.dp)
                        ) {
                            Text("One")
                            Divider(orientation = Orientation.Vertical, startIndent = 12.dp)
                            Text("Two")
                            Divider(orientation = Orientation.Vertical)
                            Text("Three")
                            Divider(orientation = Orientation.Vertical)
                            Text("Four")
                        }

                        CheckboxRow(
                            checked = checked,
                            onCheckedChange = { checked = it }
                        ) {
                            Text("Hello, I am a themed checkbox")
                        }

                        val tabState = rememberTabContainerState("1")
                        TabRow(tabState, ) {
                            Section("1", "One")
                            Section("2", "Two")
                            Section("3", "Three")
                        }
                        Column(modifier = Modifier.fillMaxSize()) {
                            when (tabState.selectedKey) {
                                "1" -> Text("Content of One")
                                "2" -> Text("Content of Two")
                                "3" -> Text("Content of Three")
                            }
                        }

                        val radioState = remember { mutableStateOf(RadioSample.Automatic) }
                        Column(
                            Modifier.selectableGroup(),
                            verticalArrangement = Arrangement.spacedBy(IntelliJTheme.metrics.singlePadding)
                        ) {
//                            RadioButtonRow(radioState, RadioSample.Automatic) {
//                                Text("Automatic detection of the property", Modifier.alignByBaseline())
//                            }
//                            RadioButtonRow(radioState, RadioSample.Enabled) {
//                                Text("Enable the property", Modifier.alignByBaseline())
//                            }
//                            RadioButtonRow(radioState, RadioSample.Disabled) {
//                                Text("Disable the property", Modifier.alignByBaseline())
//                            }
//                            RadioButtonRow(radioState, RadioSample.Unavailable, enabled = false) {
//                                Text("Unavailable", Modifier.alignByBaseline())
//                            }
                        }
                    }
                }
            }
        }
        toolWindow.addComposePanel("Compose Demo 2") {
            IntelliJTheme(this) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    var checked by remember { mutableStateOf(true) }
                    Column {
                        Button({}) {
                            Text("Hello world 2")
                        }
                        Checkbox(
                            checked = checked,
                            onCheckedChange = { checked = it }
                        )
                    }
                }
            }
        }

        toolWindow.addComposePanel("Text rendering comparison") {
            val panel = this
            val sampleText = "Lorem ipsum 1234567890"

            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                val colModifiers = Modifier
                    .padding(20.dp)
                    .fillMaxHeight()
                    .weight(1f)

                SwingPanel(
                    background = Color.Transparent,
                    modifier = colModifiers,
                    factory = {
                        panel {
                            row("H0")           {  label(sampleText, JBFont.h0().asBold())  }
                            row("H1")           {  label(sampleText, JBFont.h1().asBold())  }
                            row("H2")           {  label(sampleText, JBFont.h2())  }
                            row("H2 Bold")      {  label(sampleText, JBFont.h2().asBold())  }
                            row("H3")           {  label(sampleText, JBFont.h3())  }
                            row("H3 Bold")      {  label(sampleText, JBFont.h3().asBold())  }
                            row("H4")           {  label(sampleText, JBFont.h4().asBold())  }
                            row("Default")      {  label(sampleText, JBFont.regular())  }
                            row("Default Bold") {  label(sampleText, JBFont.regular().asBold())  }
                            row("Medium")       {  label(sampleText, JBFont.medium())  }
                            row("Medium Bold")  {  label(sampleText, JBFont.medium().asBold())  }
                            row("Small")        {  label(sampleText, JBFont.small())  }
                        }
                    }
                )
                IntelliJTheme(panel) {
                    @Composable
                    fun TypeRow(label: String, style: TextStyle) {
                        Row {
                            Text(
                                label,
                                style = IntelliJTheme.typography.default,
                                modifier = Modifier
                                    .alignByBaseline()
                                    .width(92.dp)
                            )
                            Text(
                                sampleText,
                                style = style,
                                modifier = Modifier
                                    .alignByBaseline()
                                    .weight(1f)
                            )
                        }
                    }

                    Column(
                        modifier = colModifiers,
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        TypeRow("H0", IntelliJTheme.typography.h0.copy(fontWeight = FontWeight.Bold))
                        TypeRow("H1", IntelliJTheme.typography.h1.copy(fontWeight = FontWeight.Bold))
                        TypeRow("H2", IntelliJTheme.typography.h2)
                        TypeRow("H2 Bold", IntelliJTheme.typography.h2.copy(fontWeight = FontWeight.Bold))
                        TypeRow("H3", IntelliJTheme.typography.h3)
                        TypeRow("H3 Bold", IntelliJTheme.typography.h3.copy(fontWeight = FontWeight.Bold))
                        TypeRow("H4", IntelliJTheme.typography.h4.copy(fontWeight = FontWeight.Bold))
                        TypeRow("Default", IntelliJTheme.typography.default)
                        TypeRow("Default Bold", IntelliJTheme.typography.default.copy(fontWeight = FontWeight.Bold))
                        TypeRow("Medium", IntelliJTheme.typography.medium)
                        TypeRow("Medium Bold", IntelliJTheme.typography.medium.copy(fontWeight = FontWeight.Bold))
                        TypeRow("Small", IntelliJTheme.typography.small)
                    }
                }
            }
        }
    }
}

@Composable
private fun TabScope<String>.Section(key: String, caption: String) {
    Tab(key) {
        Text(caption)
    }
}