package org.jetbrains.jewel.samples.ideplugin.dialog.wizard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.jetbrains.jewel.samples.ideplugin.dialog.WizardPage
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.TextField
import org.jetbrains.jewel.ui.component.Typography

class ConfigureStepPage(
    override val templateData: Template
) : WizardPage, TemplateWizardPage {
    override val canGoBackwards: StateFlow<Boolean> = MutableStateFlow(true)
    override val canGoForward: StateFlow<Boolean> = MutableStateFlow(true)

    @Composable
    override fun PageContent() {
        val state = rememberTextFieldState("")

        Column {
            Text("Template ${templateData.name}", style = Typography.h1TextStyle())
            Spacer(Modifier.height(20.dp))
            TextField(
                state = state,
                modifier = Modifier.width(200.dp),
                placeholder = { Text("Write something...") },
            )
        }
    }
}
