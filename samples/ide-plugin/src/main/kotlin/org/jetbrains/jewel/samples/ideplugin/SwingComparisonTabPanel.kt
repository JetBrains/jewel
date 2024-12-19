package org.jetbrains.jewel.samples.ideplugin

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.intellij.ide.ui.laf.darcula.ui.DarculaButtonUI
import com.intellij.openapi.ui.messages.MessageDialog
import com.intellij.ui.JBColor
import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBOptionButton
import com.intellij.ui.components.JBScrollPane
import com.intellij.ui.dsl.builder.AlignY
import com.intellij.ui.dsl.builder.COLUMNS_SHORT
import com.intellij.ui.dsl.builder.Panel
import com.intellij.ui.dsl.builder.Row
import com.intellij.ui.dsl.builder.RowLayout
import com.intellij.ui.dsl.builder.panel
import com.intellij.util.ui.JBFont
import com.intellij.util.ui.JBUI
import com.intellij.util.ui.components.BorderLayoutPanel
import icons.IdeSampleIconKeys
import icons.JewelIcons
import java.awt.event.ActionEvent
import javax.swing.AbstractAction
import javax.swing.Action
import javax.swing.JComponent
import javax.swing.JPanel
import org.jetbrains.jewel.bridge.JewelComposePanel
import org.jetbrains.jewel.bridge.medium
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.util.JewelLogger
import org.jetbrains.jewel.ui.component.DefaultButton
import org.jetbrains.jewel.ui.component.DefaultSplitButton
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.OutlinedButton
import org.jetbrains.jewel.ui.component.OutlinedSplitButton
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.TextArea
import org.jetbrains.jewel.ui.component.TextField
import org.jetbrains.jewel.ui.component.Typography
import org.jetbrains.jewel.ui.component.items
import org.jetbrains.jewel.ui.component.separator
import org.jetbrains.jewel.ui.icons.AllIconsKeys
import org.jetbrains.jewel.ui.painter.badge.DotBadgeShape
import org.jetbrains.jewel.ui.painter.hints.Badge
import org.jetbrains.jewel.ui.theme.textAreaStyle

internal class SwingComparisonTabPanel : BorderLayoutPanel() {
    private val mainContent: JPanel

    private val scrollingContainer: JComponent

    init {
        // System.setProperty("compose.layers.type", "COMPONENT")

        mainContent =
            panel {
                    buttonsRow()
                    separator()
                    labelsRows()
                    separator()
                    iconsRow()
                    separator()
                    textFieldsRow()
                    separator()
                    textAreasRow()
                }
                .apply {
                    border = JBUI.Borders.empty(0, 10)
                    isOpaque = false
                }

        scrollingContainer =
            JBScrollPane(
                mainContent,
                JBScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JBScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED,
            )

        addToCenter(scrollingContainer)
        scrollingContainer.border = null
        scrollingContainer.isOpaque = false
        isOpaque = false
    }

    //    override fun addNotify() {
    //        super.addNotify()
    //        setWindowContainer(mainContent)
    //    }
    //
    //    private fun setWindowContainer(component: JComponent) {
    //        if (component is ComposePanel) {
    //            component.windowContainer = (component.topLevelAncestor as JFrame).layeredPane
    //        } else {
    //            component.components.forEach { child ->
    //                setWindowContainer(child as JComponent)
    //            }
    //        }
    //    }

    private fun Panel.buttonsRow() {
        row("Buttons - Swing:") {
                button("Button") {}.align(AlignY.CENTER)
                button("Default Button") {}
                    .align(AlignY.CENTER)
                    .applyToComponent { putClientProperty(DarculaButtonUI.DEFAULT_STYLE_KEY, true) }
            }
            .layout(RowLayout.PARENT_GRID)

        row("Buttons - Compose:") {
                compose { OutlinedButton({}) { Text("Button") } }
                compose { DefaultButton({}) { Text("Default Button") } }
            }
            .layout(RowLayout.PARENT_GRID)

        row("SplitButtons - Swing:") {
                val options = arrayOf(action("Action 1"), action("Action 2"), action("Action 3"))
                cell(JBOptionButton(action("Split button").apply { isEnabled = true }, options))
                cell(JBOptionButton(action("Split button").apply { isEnabled = false }, options))
                cell(JBOptionButton(action("Split button").apply { isEnabled = true }, options)).applyToComponent {
                    putClientProperty(DarculaButtonUI.DEFAULT_STYLE_KEY, true)
                }
            }
            .layout(RowLayout.PARENT_GRID)
        row("SplitButtons - Compose:") {
                compose {
                    val items = remember { listOf("This is", "---", "A menu", "---", "Item 3") }
                    var selected by remember { mutableStateOf(items.first()) }

                    Row(Modifier.height(150.dp), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        OutlinedSplitButton(
                            onClick = { JewelLogger.getInstance("Jewel").warn("Outlined split button clicked") },
                            secondaryOnClick = {
                                JewelLogger.getInstance("Jewel").warn("Outlined split button chevron clicked")
                            },
                            content = { Text("Split button") },
                            menuContent = {
                                items.forEach {
                                    if (it == "---") {
                                        separator()
                                    } else {
                                        selectableItem(
                                            selected = selected == it,
                                            onClick = {
                                                selected = it
                                                JewelLogger.getInstance("Jewel").warn("Item clicked: $it")
                                            },
                                        ) {
                                            Text(it)
                                        }
                                    }
                                }
                            },
                        )
                        OutlinedSplitButton(
                            onClick = { JewelLogger.getInstance("Jewel").warn("Outlined split button clicked") },
                            secondaryOnClick = {
                                JewelLogger.getInstance("Jewel").warn("Outlined split button chevron clicked")
                            },
                            content = { Text("Split button") },
                            popupContainer = {
                                Column(Modifier.padding(8.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Text("Generic popup content")
                                    Box(Modifier.size(24.dp), contentAlignment = Alignment.Center) {
                                        Icon(
                                            key = AllIconsKeys.Nodes.ConfigFolder,
                                            contentDescription = "taskGroup",
                                            hint = Badge(Color.Red, DotBadgeShape.Default),
                                        )
                                    }
                                }
                            },
                        )
                        OutlinedSplitButton(
                            enabled = false,
                            onClick = {},
                            secondaryOnClick = {},
                            content = { Text("Split button") },
                            menuContent = {},
                        )
                        DefaultSplitButton(
                            onClick = { JewelLogger.getInstance("Jewel").warn("Outlined split button clicked") },
                            secondaryOnClick = {
                                JewelLogger.getInstance("Jewel").warn("Outlined split button chevron clicked")
                            },
                            content = { Text("Split button") },
                            menuContent = {
                                items(
                                    items = listOf("Item 1", "Item 2", "Item 3"),
                                    isSelected = { false },
                                    onItemClick = { JewelLogger.getInstance("Jewel").warn("Item clicked: $it") },
                                    content = { Text(it) },
                                )
                            },
                        )
                    }
                }
            }
            .layout(RowLayout.PARENT_GRID)
    }

    private fun action(text: String): Action {
        return object : AbstractAction(text) {
            override fun actionPerformed(e: ActionEvent?) {
                MessageDialog(null, "Invoked $text", text, emptyArray<String>(), -1, null, false).show()
            }
        }
    }

    private fun Panel.labelsRows() {
        row("Labels:") {
                label("Swing label").align(AlignY.CENTER)
                compose { Text("Compose label") }
            }
            .layout(RowLayout.PARENT_GRID)

        row("Comments:") {
                comment("Swing comment").align(AlignY.CENTER)
                compose {
                    Text("Compose comment", style = Typography.medium(), color = JewelTheme.globalColors.text.info)
                }
            }
            .layout(RowLayout.PARENT_GRID)

        val longText = "WordWrapInsideWordsIsSupported:" + ("NoSpace".repeat(20) + " ").repeat(5) + "End"
        row("Long text (Swing)") { text(longText, maxLineLength = 100) }
        row("Long text (Compose)") {
            compose {
                BoxWithConstraints {
                    Text(
                        longText,
                        modifier =
                            Modifier.width(
                                with(LocalDensity.current) {
                                    // Guesstimate how wide this should be — we can't tell it to be
                                    // "fill", as it crashes natively
                                    JewelTheme.defaultTextStyle.fontSize.toDp() * 60
                                }
                            ),
                    )
                }
            }
        }

        row("Titles (Swing)") {
            text("This will wrap over a couple rows", maxLineLength = 30).component.font = JBFont.h1()
        }
        row("Titles (Compose)") {
            compose {
                BoxWithConstraints {
                    val style = Typography.h1TextStyle()
                    Text(
                        "This will wrap over a couple rows",
                        modifier =
                            Modifier.width(
                                with(LocalDensity.current) {
                                    // Guesstimate how wide this should be — we can't tell it to be
                                    // "fill", as it crashes natively
                                    style.fontSize.toDp() * 10
                                }
                            ),
                        style = style,
                    )
                }
            }
        }
    }

    private fun Panel.iconsRow() {
        row("Icons:") {
                cell(JBLabel(JewelIcons.ToolWindowIcon).apply { border = JBUI.Borders.customLine(JBColor.RED) })
                    .align(AlignY.CENTER)

                compose {
                    Icon(
                        key = IdeSampleIconKeys.jewelToolWindow,
                        contentDescription = null,
                        modifier = Modifier.border(1.dp, Color.Red),
                    )
                }
            }
            .layout(RowLayout.PARENT_GRID)
    }

    private fun Panel.textFieldsRow() {
        row("Text fields:") {
                textField().align(AlignY.CENTER)

                compose {
                    val state = rememberTextFieldState("")
                    TextField(state)
                }
            }
            .layout(RowLayout.PARENT_GRID)
    }

    private fun Panel.textAreasRow() {
        row("Text areas:") {
                textArea().align(AlignY.CENTER).applyToComponent { rows = 3 }

                compose {
                    val metrics = remember(JBFont.label(), LocalDensity.current) { getFontMetrics(JBFont.label()) }
                    val charWidth =
                        remember(metrics.widths) {
                            // Same logic as in JTextArea
                            metrics.charWidth('m')
                        }
                    val lineHeight = metrics.height

                    val width = remember(charWidth) { (COLUMNS_SHORT * charWidth) }
                    val height = remember(lineHeight) { (3 * lineHeight) }

                    val contentPadding = JewelTheme.textAreaStyle.metrics.contentPadding
                    val state = rememberTextFieldState("Hello")
                    TextArea(
                        state = state,
                        modifier =
                            Modifier.size(
                                width = width.dp + contentPadding.horizontal(LocalLayoutDirection.current),
                                height = height.dp + contentPadding.vertical(),
                            ),
                    )
                }
            }
            .layout(RowLayout.PARENT_GRID)
    }

    private fun PaddingValues.vertical(): Dp = calculateTopPadding() + calculateBottomPadding()

    private fun PaddingValues.horizontal(layoutDirection: LayoutDirection): Dp =
        calculateStartPadding(layoutDirection) + calculateEndPadding(layoutDirection)

    private fun Row.compose(content: @Composable () -> Unit) =
        cell(JewelComposePanel { Box(Modifier.padding(8.dp)) { content() } }.apply { isOpaque = false })
}
