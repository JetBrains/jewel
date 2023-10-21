package org.jetbrains.jewel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import org.jetbrains.jewel.core.component.LocalContentColor
import org.jetbrains.jewel.core.component.LocalTextStyle
import org.jetbrains.jewel.core.component.styling.ButtonStyle
import org.jetbrains.jewel.core.component.styling.CheckboxStyle
import org.jetbrains.jewel.core.component.styling.ChipStyle
import org.jetbrains.jewel.core.component.styling.CircularProgressStyle
import org.jetbrains.jewel.core.component.styling.DividerStyle
import org.jetbrains.jewel.core.component.styling.DropdownStyle
import org.jetbrains.jewel.core.component.styling.GroupHeaderStyle
import org.jetbrains.jewel.core.component.styling.HorizontalProgressBarStyle
import org.jetbrains.jewel.core.component.styling.IconButtonStyle
import org.jetbrains.jewel.core.component.styling.LabelledTextFieldStyle
import org.jetbrains.jewel.core.component.styling.LazyTreeStyle
import org.jetbrains.jewel.core.component.styling.LinkStyle
import org.jetbrains.jewel.core.component.styling.LocalCheckboxStyle
import org.jetbrains.jewel.core.component.styling.LocalChipStyle
import org.jetbrains.jewel.core.component.styling.LocalCircularProgressStyle
import org.jetbrains.jewel.core.component.styling.LocalDefaultButtonStyle
import org.jetbrains.jewel.core.component.styling.LocalDefaultDropdownStyle
import org.jetbrains.jewel.core.component.styling.LocalDefaultTabStyle
import org.jetbrains.jewel.core.component.styling.LocalDividerStyle
import org.jetbrains.jewel.core.component.styling.LocalEditorTabStyle
import org.jetbrains.jewel.core.component.styling.LocalGroupHeaderStyle
import org.jetbrains.jewel.core.component.styling.LocalHorizontalProgressBarStyle
import org.jetbrains.jewel.core.component.styling.LocalIconButtonStyle
import org.jetbrains.jewel.core.component.styling.LocalLabelledTextFieldStyle
import org.jetbrains.jewel.core.component.styling.LocalLazyTreeStyle
import org.jetbrains.jewel.core.component.styling.LocalLinkStyle
import org.jetbrains.jewel.core.component.styling.LocalMenuStyle
import org.jetbrains.jewel.core.component.styling.LocalOutlinedButtonStyle
import org.jetbrains.jewel.core.component.styling.LocalRadioButtonStyle
import org.jetbrains.jewel.core.component.styling.LocalScrollbarStyle
import org.jetbrains.jewel.core.component.styling.LocalTextAreaStyle
import org.jetbrains.jewel.core.component.styling.LocalTextFieldStyle
import org.jetbrains.jewel.core.component.styling.LocalTooltipStyle
import org.jetbrains.jewel.core.component.styling.MenuStyle
import org.jetbrains.jewel.core.component.styling.RadioButtonStyle
import org.jetbrains.jewel.core.component.styling.ScrollbarStyle
import org.jetbrains.jewel.core.component.styling.TabStyle
import org.jetbrains.jewel.core.component.styling.TextAreaStyle
import org.jetbrains.jewel.core.component.styling.TextFieldStyle
import org.jetbrains.jewel.core.component.styling.TooltipStyle

interface JewelTheme {

    companion object {

        // -------------
        // Global values
        // -------------

        val globalColors: GlobalColors
            @Composable
            @ReadOnlyComposable
            get() = LocalGlobalColors.current

        val globalMetrics: GlobalMetrics
            @Composable
            @ReadOnlyComposable
            get() = LocalGlobalMetrics.current

        val textStyle: TextStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalTextStyle.current

        val contentColor: Color
            @Composable
            @ReadOnlyComposable
            get() = LocalContentColor.current

        val isDark: Boolean
            @Composable
            @ReadOnlyComposable
            get() = LocalIsDarkTheme.current

        val isSwingCompatMode
            @Composable
            @ReadOnlyComposable
            get() = LocalSwingCompatMode.current

        val colorPalette: ThemeColorPalette
            @Composable
            @ReadOnlyComposable
            get() = LocalColorPalette.current

        val iconData: ThemeIconData
            @Composable
            @ReadOnlyComposable
            get() = LocalIconData.current

        // -----------------
        // Component styling
        // -----------------

        val defaultButtonStyle: ButtonStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalDefaultButtonStyle.current

        val outlinedButtonStyle: ButtonStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalOutlinedButtonStyle.current

        val checkboxStyle: CheckboxStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalCheckboxStyle.current

        val chipStyle: ChipStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalChipStyle.current

        val dividerStyle: DividerStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalDividerStyle.current

        val dropdownStyle: DropdownStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalDefaultDropdownStyle.current

        val groupHeaderStyle: GroupHeaderStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalGroupHeaderStyle.current

        val labelledTextFieldStyle: LabelledTextFieldStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalLabelledTextFieldStyle.current

        val linkStyle: LinkStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalLinkStyle.current

        val menuStyle: MenuStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalMenuStyle.current

        val horizontalProgressBarStyle: HorizontalProgressBarStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalHorizontalProgressBarStyle.current

        val radioButtonStyle: RadioButtonStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalRadioButtonStyle.current

        val scrollbarStyle: ScrollbarStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalScrollbarStyle.current

        val textAreaStyle: TextAreaStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalTextAreaStyle.current

        val textFieldStyle: TextFieldStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalTextFieldStyle.current

        val treeStyle: LazyTreeStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalLazyTreeStyle.current

        val defaultTabStyle: TabStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalDefaultTabStyle.current

        val editorTabStyle: TabStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalEditorTabStyle.current

        val circularProgressStyle: CircularProgressStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalCircularProgressStyle.current

        val tooltipStyle: TooltipStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalTooltipStyle.current

        val iconButtonStyle: IconButtonStyle
            @Composable
            @ReadOnlyComposable
            get() = LocalIconButtonStyle.current
    }
}

@Composable
fun JewelTheme(
    theme: ThemeDefinition,
    swingCompatMode: Boolean,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalSwingCompatMode provides swingCompatMode) {
        JewelTheme(theme, content)
    }
}

@Composable
fun JewelTheme(theme: ThemeDefinition, content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalIsDarkTheme provides theme.isDark,
        LocalContentColor provides theme.contentColor,
        LocalTextStyle provides theme.defaultTextStyle,
        LocalGlobalColors provides theme.globalColors,
        LocalGlobalMetrics provides theme.globalMetrics,
        content = content,
    )
}

internal val LocalIsDarkTheme = staticCompositionLocalOf<Boolean> {
    error("No IsDarkTheme provided")
}

internal val LocalSwingCompatMode = staticCompositionLocalOf {
    // By default, Swing compat is not enabled
    false
}

val LocalColorPalette = staticCompositionLocalOf {
    ThemeColorPalette.Empty
}

val LocalIconData = staticCompositionLocalOf {
    ThemeIconData.Empty
}

/** Overrides the dark mode for the current composition scope. */
@Composable
fun OverrideDarkMode(isDark: Boolean, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalIsDarkTheme provides isDark, content = content)
}
