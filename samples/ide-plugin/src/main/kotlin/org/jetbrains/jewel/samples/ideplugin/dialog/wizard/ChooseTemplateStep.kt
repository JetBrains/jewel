package org.jetbrains.jewel.samples.ideplugin.dialog.wizard

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.onClick
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.intellij.openapi.project.Project
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.jetbrains.jewel.bridge.medium
import org.jetbrains.jewel.foundation.lazy.tree.buildTree
import org.jetbrains.jewel.foundation.modifier.onHover
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.samples.ideplugin.dialog.WizardPage
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.component.Divider
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.LazyTree
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.Typography
import org.jetbrains.jewel.ui.theme.colorPalette
import org.jetbrains.jewel.ui.util.thenIf

class ChooseTemplateStep(
    private val project: Project,
    override val templateData: Template,
) : WizardPage, TemplateWizardPage {
    override val canGoBackwards: StateFlow<Boolean> = MutableStateFlow(true)
    override val canGoForward: StateFlow<Boolean> = MutableStateFlow(true)

    @Composable
    override fun PageContent() {
        val colors = JewelTheme.colorPalette
        val isDark = JewelTheme.isDark

        Column {
            Row(Modifier.weight(1f)) {
                Column(
                    Modifier
                    .width(200.dp)
                    .padding(top = 20.dp, end = 12.dp)
                ) {
                    Text(
                        text = "Templates",
                        color = JewelTheme.globalColors.text.info,
                        style = Typography.medium(),
                        modifier = Modifier.padding(start = 24.dp)
                    )
                    Spacer(Modifier.height(12.dp))

                    val treeData by remember {
                        mutableStateOf(
                            buildTree {
                                FormFactors.entries.forEach { formFactor ->
                                    addLeaf(formFactor.name)
                                }
                            },
                        )
                    }
                    LazyTree(
                        tree = treeData,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(it.data, modifier = Modifier.weight(1f).padding(vertical = 2.dp))
                    }
//                        FormFactors.entries.forEach { formFactor ->
//                            Text(formFactor.name, modifier = Modifier.padding(vertical = 8.dp))
//                        }

//                    Spacer(Modifier.height(32.dp))
//                    Text(
//                        text = "Samples",
//                        color = JewelTheme.globalColors.text.info,
//                        style = Typography.medium(),
//                        modifier = Modifier.padding(start = 12.dp)
//                    )
//                    Spacer(Modifier.height(12.dp))
//                    Column {
//                        SampleCategories.entries.forEach { formFactor ->
//                            Text(formFactor.name, modifier = Modifier.padding(vertical = 8.dp))
//                        }
//                    }
                }
                Divider(orientation = Orientation.Vertical)
                Column(Modifier.weight(1f)) {
                    var hoverTemplate by remember { mutableIntStateOf(-1) }
                    var activeTemplate by remember { mutableIntStateOf(0) }

                    LazyVerticalGrid(
                        columns = GridCells.Adaptive(128.dp),
                        contentPadding = PaddingValues(20.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier
                            .onHover { if (!it) hoverTemplate = -1 }
                            .fillMaxSize(),
                    ) {
                        itemsIndexed(PhoneTemplates) { idx, template ->
                            Column(
                                Modifier
                                    .onHover { hoverTemplate = idx }
                                    .thenIf(hoverTemplate == idx) {
                                        Modifier.background(
                                            color = colors.blue(if (isDark) 1 else 12),
                                            shape = RoundedCornerShape(4.dp)
                                        )
                                    }
                                    .border(
                                        width = 2.dp,
                                        color = if (activeTemplate == idx) colors.blue(4) else Color.Unspecified,
                                        shape = RoundedCornerShape(4.dp)
                                    )
                                    .onClick {
                                        activeTemplate = idx
                                        //onTemplateUpdate(PhoneTemplates[idx])
                                    }
                            ) {
                                Icon(template.imageKey, contentDescription = null, modifier = Modifier.aspectRatio(1f).fillMaxSize())
                                Text(
                                    text = template.name,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}