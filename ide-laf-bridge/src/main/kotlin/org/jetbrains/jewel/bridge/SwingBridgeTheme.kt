package org.jetbrains.jewel.bridge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.intellij.openapi.components.service
import org.jetbrains.jewel.GlobalColors
import org.jetbrains.jewel.GlobalMetrics
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.IntelliJThemeIconData
import org.jetbrains.jewel.styling.ButtonStyle
import org.jetbrains.jewel.styling.CheckboxStyle
import org.jetbrains.jewel.styling.ChipStyle
import org.jetbrains.jewel.styling.DropdownStyle
import org.jetbrains.jewel.styling.GroupHeaderStyle
import org.jetbrains.jewel.styling.HorizontalProgressBarStyle
import org.jetbrains.jewel.styling.LabelledTextFieldStyle
import org.jetbrains.jewel.styling.LazyTreeStyle
import org.jetbrains.jewel.styling.LinkStyle
import org.jetbrains.jewel.styling.MenuStyle
import org.jetbrains.jewel.styling.RadioButtonStyle
import org.jetbrains.jewel.styling.ScrollbarStyle
import org.jetbrains.jewel.styling.TabStyle
import org.jetbrains.jewel.styling.TextAreaStyle
import org.jetbrains.jewel.styling.TextFieldStyle
import org.jetbrains.jewel.themes.intui.core.BaseIntUiTheme
import org.jetbrains.jewel.themes.intui.core.IntUiThemeColorPalette
import org.jetbrains.jewel.themes.intui.core.IntUiThemeDefinition
import org.jetbrains.jewel.themes.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.themes.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.themes.intui.standalone.IntUiGlobalColors
import org.jetbrains.jewel.themes.intui.standalone.IntUiGlobalMetrics
import org.jetbrains.jewel.themes.intui.standalone.Inter

private val bridgeService = service<SwingBridgeService>()

@Composable
fun SwingBridgeTheme(content: @Composable () -> Unit) {
    val themeDefinition by bridgeService.themeDefinition
    val componentStyling by bridgeService.componentStyling

    // TODO handle non-Int UI themes, too
    BaseIntUiTheme(themeDefinition, componentStyling, content)
}
