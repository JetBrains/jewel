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
import org.jetbrains.jewel.intui.standalone.styling.IntUiLabelledTextFieldStyle
import org.jetbrains.jewel.intui.standalone.styling.IntUiMenuStyle
import org.jetbrains.jewel.intui.standalone.styling.IntUiRadioButtonStyle
import org.jetbrains.jewel.intui.standalone.styling.IntUiScrollbarStyle
import org.jetbrains.jewel.intui.standalone.styling.IntUiTabStyle
import org.jetbrains.jewel.intui.standalone.styling.IntUiTextAreaStyle
import org.jetbrains.jewel.intui.standalone.styling.IntUiTextFieldStyle
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
        defaultTabStyle: TabStyle = IntUiTabStyle.Default.dark(),
        dividerStyle: DividerStyle = DividerStyle.dark(),
        dropdownStyle: DropdownStyle = DropdownStyle.Default.dark(),
        editorTabStyle: TabStyle = IntUiTabStyle.Editor.dark(),
        groupHeaderStyle: GroupHeaderStyle = GroupHeaderStyle.dark(),
        horizontalProgressBarStyle: HorizontalProgressBarStyle = HorizontalProgressBarStyle.dark(),
        iconButtonStyle: IconButtonStyle = IconButtonStyle.dark(),
        labelledTextFieldStyle: LabelledTextFieldStyle = IntUiLabelledTextFieldStyle.dark(),
        lazyTreeStyle: LazyTreeStyle = LazyTreeStyle.dark(),
        linkStyle: LinkStyle = LinkStyle.dark(),
        menuStyle: MenuStyle = IntUiMenuStyle.dark(),
        outlinedButtonStyle: ButtonStyle = ButtonStyle.Outlined.dark(),
        radioButtonStyle: RadioButtonStyle = IntUiRadioButtonStyle.dark(),
        scrollbarStyle: ScrollbarStyle = IntUiScrollbarStyle.dark(),
        textAreaStyle: IntUiTextAreaStyle = IntUiTextAreaStyle.dark(),
        textFieldStyle: TextFieldStyle = IntUiTextFieldStyle.dark(),
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
        defaultTabStyle: TabStyle = IntUiTabStyle.Default.light(),
        dividerStyle: DividerStyle = DividerStyle.light(),
        dropdownStyle: DropdownStyle = DropdownStyle.Default.light(),
        editorTabStyle: TabStyle = IntUiTabStyle.Editor.light(),
        groupHeaderStyle: GroupHeaderStyle = GroupHeaderStyle.light(),
        horizontalProgressBarStyle: HorizontalProgressBarStyle = HorizontalProgressBarStyle.light(),
        iconButtonStyle: IconButtonStyle = IconButtonStyle.light(),
        labelledTextFieldStyle: LabelledTextFieldStyle = IntUiLabelledTextFieldStyle.light(),
        lazyTreeStyle: LazyTreeStyle = LazyTreeStyle.light(),
        linkStyle: LinkStyle = LinkStyle.light(),
        menuStyle: MenuStyle = IntUiMenuStyle.light(),
        outlinedButtonStyle: ButtonStyle = ButtonStyle.Outlined.light(),
        radioButtonStyle: RadioButtonStyle = IntUiRadioButtonStyle.light(),
        scrollbarStyle: ScrollbarStyle = IntUiScrollbarStyle.light(),
        textAreaStyle: IntUiTextAreaStyle = IntUiTextAreaStyle.light(),
        textFieldStyle: TextFieldStyle = IntUiTextFieldStyle.light(),
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
