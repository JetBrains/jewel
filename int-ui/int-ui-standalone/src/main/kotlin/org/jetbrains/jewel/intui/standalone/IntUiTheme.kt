package org.jetbrains.jewel.intui.standalone

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidedValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.jewel.GlobalColors
import org.jetbrains.jewel.GlobalMetrics
import org.jetbrains.jewel.IntelliJComponentStyling
import org.jetbrains.jewel.IntelliJThemeIconData
import org.jetbrains.jewel.intui.core.BaseIntUiTheme
import org.jetbrains.jewel.intui.core.IntUiThemeColorPalette
import org.jetbrains.jewel.intui.core.IntUiThemeDefinition
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.intui.standalone.IntUiTheme.defaultComponentStyling
import org.jetbrains.jewel.intui.standalone.styling.Default
import org.jetbrains.jewel.intui.standalone.styling.Editor
import org.jetbrains.jewel.intui.standalone.styling.IntUiTooltipStyle
import org.jetbrains.jewel.intui.standalone.styling.Outlined
import org.jetbrains.jewel.intui.standalone.styling.Undecorated
import org.jetbrains.jewel.intui.standalone.styling.dark
import org.jetbrains.jewel.intui.standalone.styling.light
import org.jetbrains.jewel.painter.LocalPainterHintsProvider
import org.jetbrains.jewel.styling.ButtonStyle
import org.jetbrains.jewel.styling.CheckboxStyle
import org.jetbrains.jewel.styling.ChipStyle
import org.jetbrains.jewel.styling.CircularProgressStyle
import org.jetbrains.jewel.styling.DividerStyle
import org.jetbrains.jewel.styling.DropdownStyle
import org.jetbrains.jewel.styling.GroupHeaderStyle
import org.jetbrains.jewel.styling.HorizontalProgressBarStyle
import org.jetbrains.jewel.styling.IconButtonStyle
import org.jetbrains.jewel.styling.LabelledTextFieldStyle
import org.jetbrains.jewel.styling.LazyTreeStyle
import org.jetbrains.jewel.styling.LinkStyle
import org.jetbrains.jewel.styling.MenuStyle
import org.jetbrains.jewel.styling.RadioButtonStyle
import org.jetbrains.jewel.styling.ScrollbarStyle
import org.jetbrains.jewel.styling.TabStyle
import org.jetbrains.jewel.styling.TextAreaStyle
import org.jetbrains.jewel.styling.TextFieldStyle

object IntUiTheme : BaseIntUiTheme {

    val defaultTextStyle = TextStyle.Default.copy(
        fontFamily = FontFamily.Inter,
        fontSize = 13.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
    )

    @Composable
    fun lightThemeDefinition(
        colors: GlobalColors = IntUiGlobalColors.light(),
        metrics: GlobalMetrics = IntUiGlobalMetrics(),
        palette: IntUiThemeColorPalette = IntUiLightTheme.colors,
        icons: IntelliJThemeIconData = IntUiLightTheme.icons,
        defaultTextStyle: TextStyle = this.defaultTextStyle,
        contentColor: Color = IntUiLightTheme.colors.grey(1),
    ) = IntUiThemeDefinition(isDark = false, colors, palette, icons, metrics, defaultTextStyle, contentColor)

    @Composable
    fun darkThemeDefinition(
        colors: GlobalColors = IntUiGlobalColors.dark(),
        metrics: GlobalMetrics = IntUiGlobalMetrics(),
        palette: IntUiThemeColorPalette = IntUiDarkTheme.colors,
        icons: IntelliJThemeIconData = IntUiDarkTheme.icons,
        defaultTextStyle: TextStyle = this.defaultTextStyle,
        contentColor: Color = IntUiDarkTheme.colors.grey(12),
    ) = IntUiThemeDefinition(isDark = true, colors, palette, icons, metrics, defaultTextStyle, contentColor)

    @Composable
    fun defaultComponentStyling(theme: IntUiThemeDefinition): IntelliJComponentStyling =
        if (theme.isDark) darkComponentStyling() else lightComponentStyling()

    @Composable
    fun darkComponentStyling(
        checkboxStyle: CheckboxStyle = CheckboxStyle.dark(),
        chipStyle: ChipStyle = ChipStyle.dark(),
        circularProgressStyle: CircularProgressStyle = CircularProgressStyle.dark(),
        defaultButtonStyle: ButtonStyle = ButtonStyle.Default.dark(),
        defaultTabStyle: TabStyle = TabStyle.Default.dark(),
        dividerStyle: DividerStyle = DividerStyle.dark(),
        dropdownStyle: DropdownStyle = DropdownStyle.Default.dark(),
        editorTabStyle: TabStyle = TabStyle.Editor.dark(),
        groupHeaderStyle: GroupHeaderStyle = GroupHeaderStyle.dark(),
        horizontalProgressBarStyle: HorizontalProgressBarStyle = HorizontalProgressBarStyle.dark(),
        iconButtonStyle: IconButtonStyle = IconButtonStyle.dark(),
        labelledTextFieldStyle: LabelledTextFieldStyle = LabelledTextFieldStyle.dark(),
        lazyTreeStyle: LazyTreeStyle = LazyTreeStyle.dark(),
        linkStyle: LinkStyle = LinkStyle.dark(),
        menuStyle: MenuStyle = MenuStyle.dark(),
        outlinedButtonStyle: ButtonStyle = ButtonStyle.Outlined.dark(),
        radioButtonStyle: RadioButtonStyle = RadioButtonStyle.dark(),
        scrollbarStyle: ScrollbarStyle = ScrollbarStyle.dark(),
        textAreaStyle: TextAreaStyle = TextAreaStyle.dark(),
        textFieldStyle: TextFieldStyle = TextFieldStyle.dark(),
        tooltipStyle: IntUiTooltipStyle = IntUiTooltipStyle.dark(),
        undecoratedDropdownStyle: DropdownStyle = DropdownStyle.Undecorated.dark(),
    ) = IntelliJComponentStyling(
        checkboxStyle = checkboxStyle,
        chipStyle = chipStyle,
        circularProgressStyle = circularProgressStyle,
        defaultButtonStyle = defaultButtonStyle,
        defaultDropdownStyle = dropdownStyle,
        defaultTabStyle = defaultTabStyle,
        dividerStyle = dividerStyle,
        editorTabStyle = editorTabStyle,
        groupHeaderStyle = groupHeaderStyle,
        horizontalProgressBarStyle = horizontalProgressBarStyle,
        iconButtonStyle = iconButtonStyle,
        labelledTextFieldStyle = labelledTextFieldStyle,
        lazyTreeStyle = lazyTreeStyle,
        linkStyle = linkStyle,
        menuStyle = menuStyle,
        outlinedButtonStyle = outlinedButtonStyle,
        radioButtonStyle = radioButtonStyle,
        scrollbarStyle = scrollbarStyle,
        textAreaStyle = textAreaStyle,
        textFieldStyle = textFieldStyle,
        tooltipStyle = tooltipStyle,
        undecoratedDropdownStyle = undecoratedDropdownStyle,
    )

    @Composable
    fun lightComponentStyling(
        checkboxStyle: CheckboxStyle = CheckboxStyle.light(),
        chipStyle: ChipStyle = ChipStyle.light(),
        circularProgressStyle: CircularProgressStyle = CircularProgressStyle.light(),
        defaultButtonStyle: ButtonStyle = ButtonStyle.Default.light(),
        defaultTabStyle: TabStyle = TabStyle.Default.light(),
        dividerStyle: DividerStyle = DividerStyle.light(),
        dropdownStyle: DropdownStyle = DropdownStyle.Default.light(),
        editorTabStyle: TabStyle = TabStyle.Editor.light(),
        groupHeaderStyle: GroupHeaderStyle = GroupHeaderStyle.light(),
        horizontalProgressBarStyle: HorizontalProgressBarStyle = HorizontalProgressBarStyle.light(),
        iconButtonStyle: IconButtonStyle = IconButtonStyle.light(),
        labelledTextFieldStyle: LabelledTextFieldStyle = LabelledTextFieldStyle.light(),
        lazyTreeStyle: LazyTreeStyle = LazyTreeStyle.light(),
        linkStyle: LinkStyle = LinkStyle.light(),
        menuStyle: MenuStyle = MenuStyle.light(),
        outlinedButtonStyle: ButtonStyle = ButtonStyle.Outlined.light(),
        radioButtonStyle: RadioButtonStyle = RadioButtonStyle.light(),
        scrollbarStyle: ScrollbarStyle = ScrollbarStyle.light(),
        textAreaStyle: TextAreaStyle = TextAreaStyle.light(),
        textFieldStyle: TextFieldStyle = TextFieldStyle.light(),
        tooltipStyle: IntUiTooltipStyle = IntUiTooltipStyle.light(),
        undecoratedDropdownStyle: DropdownStyle = DropdownStyle.Undecorated.light(),
    ) = IntelliJComponentStyling(
        checkboxStyle = checkboxStyle,
        chipStyle = chipStyle,
        circularProgressStyle = circularProgressStyle,
        defaultButtonStyle = defaultButtonStyle,
        defaultDropdownStyle = dropdownStyle,
        defaultTabStyle = defaultTabStyle,
        dividerStyle = dividerStyle,
        editorTabStyle = editorTabStyle,
        groupHeaderStyle = groupHeaderStyle,
        horizontalProgressBarStyle = horizontalProgressBarStyle,
        iconButtonStyle = iconButtonStyle,
        labelledTextFieldStyle = labelledTextFieldStyle,
        lazyTreeStyle = lazyTreeStyle,
        linkStyle = linkStyle,
        menuStyle = menuStyle,
        outlinedButtonStyle = outlinedButtonStyle,
        radioButtonStyle = radioButtonStyle,
        scrollbarStyle = scrollbarStyle,
        textAreaStyle = textAreaStyle,
        textFieldStyle = textFieldStyle,
        tooltipStyle = tooltipStyle,
        undecoratedDropdownStyle = undecoratedDropdownStyle,
    )
}

@Composable
fun IntUiTheme(
    theme: IntUiThemeDefinition,
    componentStyling: @Composable () -> Array<ProvidedValue<*>>,
    swingCompatMode: Boolean = false,
    content: @Composable () -> Unit,
) {
    BaseIntUiTheme(
        theme,
        componentStyling = { defaultComponentStyling(theme).providedStyles() + componentStyling() },
        swingCompatMode,
    ) {
        CompositionLocalProvider(
            LocalPainterHintsProvider provides StandalonePainterHintsProvider(theme),
        ) {
            content()
        }
    }
}
