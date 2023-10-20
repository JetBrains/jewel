package org.jetbrains.jewel.intui.core

import androidx.compose.foundation.LocalIndication
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import org.jetbrains.jewel.GlobalColors
import org.jetbrains.jewel.GlobalMetrics
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.JewelTheme
import org.jetbrains.jewel.LocalColorPalette
import org.jetbrains.jewel.LocalIconData
import org.jetbrains.jewel.NoIndication
import org.jetbrains.jewel.ThemeColorPalette
import org.jetbrains.jewel.ThemeDefinition
import org.jetbrains.jewel.ThemeIconData
import org.jetbrains.jewel.styling.ButtonStyle
import org.jetbrains.jewel.styling.CheckboxStyle
import org.jetbrains.jewel.styling.ChipStyle
import org.jetbrains.jewel.styling.CircularProgressStyle
import org.jetbrains.jewel.styling.DividerStyle
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

interface BaseIntUiTheme : JewelTheme {

    val globalColors: GlobalColors
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.globalColors

    val globalMetrics: GlobalMetrics
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.globalMetrics

    val textStyle: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.textStyle

    val contentColor: Color
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.contentColor

    val isDark: Boolean
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.isDark

    val isSwingCompatMode: Boolean
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.isSwingCompatMode

    val iconData: ThemeIconData
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.iconData

    val colorPalette: ThemeColorPalette
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.colorPalette

    val defaultButtonStyle: ButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.defaultButtonStyle

    val outlinedButtonStyle: ButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.outlinedButtonStyle

    val checkboxStyle: CheckboxStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.checkboxStyle

    val chipStyle: ChipStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.chipStyle

    val dividerStyle: DividerStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.dividerStyle

    val dropdownStyle: DropdownStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.dropdownStyle

    val groupHeaderStyle: GroupHeaderStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.groupHeaderStyle

    val labelledTextFieldStyle: LabelledTextFieldStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.labelledTextFieldStyle

    val linkStyle: LinkStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.linkStyle

    val menuStyle: MenuStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.menuStyle

    val horizontalProgressBarStyle: HorizontalProgressBarStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.horizontalProgressBarStyle

    val radioButtonStyle: RadioButtonStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.radioButtonStyle

    val scrollbarStyle: ScrollbarStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.scrollbarStyle

    val textAreaStyle: TextAreaStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.textAreaStyle

    val textFieldStyle: TextFieldStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.textFieldStyle

    val treeStyle: LazyTreeStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.treeStyle

    val defaultTabStyle: TabStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.defaultTabStyle

    val editorTabStyle: TabStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.editorTabStyle

    val circularProgressStyle: CircularProgressStyle
        @Composable
        @ReadOnlyComposable
        get() = JewelTheme.circularProgressStyle
}

@Composable
fun BaseIntUiTheme(
    theme: ThemeDefinition,
    componentStyling: @Composable () -> Array<ProvidedValue<*>>,
    content: @Composable () -> Unit,
) {
    BaseIntUiTheme(theme, componentStyling, swingCompatMode = false, content)
}

@Composable
fun BaseIntUiTheme(
    theme: ThemeDefinition,
    componentStyling: @Composable () -> Array<ProvidedValue<*>>,
    swingCompatMode: Boolean = false,
    content: @Composable () -> Unit,
) {
    IntelliJTheme(theme, swingCompatMode) {
        CompositionLocalProvider(
            LocalColorPalette provides theme.colorPalette,
            LocalIconData provides theme.iconData,
            LocalIndication provides NoIndication,
        ) {
            CompositionLocalProvider(values = componentStyling(), content = content)
        }
    }
}
