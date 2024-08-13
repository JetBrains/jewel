package org.jetbrains.jewel.samples.standalone

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import org.jetbrains.jewel.foundation.GlobalMetrics
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.ThemeColorPalette
import org.jetbrains.jewel.foundation.theme.ThemeDefinition
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.intui.standalone.styling.Default
import org.jetbrains.jewel.intui.standalone.styling.Editor
import org.jetbrains.jewel.intui.standalone.styling.Outlined
import org.jetbrains.jewel.intui.standalone.styling.Undecorated
import org.jetbrains.jewel.intui.standalone.styling.dark
import org.jetbrains.jewel.intui.standalone.styling.light
import org.jetbrains.jewel.intui.standalone.theme.IntUiTheme
import org.jetbrains.jewel.intui.standalone.theme.createDefaultTextStyle
import org.jetbrains.jewel.intui.standalone.theme.createEditorTextStyle
import org.jetbrains.jewel.intui.standalone.theme.dark
import org.jetbrains.jewel.intui.standalone.theme.defaults
import org.jetbrains.jewel.intui.standalone.theme.light
import org.jetbrains.jewel.ui.ComponentStyling
import org.jetbrains.jewel.ui.component.styling.ButtonStyle
import org.jetbrains.jewel.ui.component.styling.CheckboxStyle
import org.jetbrains.jewel.ui.component.styling.ChipStyle
import org.jetbrains.jewel.ui.component.styling.CircularProgressStyle
import org.jetbrains.jewel.ui.component.styling.DividerStyle
import org.jetbrains.jewel.ui.component.styling.DropdownStyle
import org.jetbrains.jewel.ui.component.styling.GroupHeaderStyle
import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarStyle
import org.jetbrains.jewel.ui.component.styling.IconButtonStyle
import org.jetbrains.jewel.ui.component.styling.LazyTreeStyle
import org.jetbrains.jewel.ui.component.styling.LinkStyle
import org.jetbrains.jewel.ui.component.styling.MenuStyle
import org.jetbrains.jewel.ui.component.styling.RadioButtonStyle
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonStyle
import org.jetbrains.jewel.ui.component.styling.SegmentedControlStyle
import org.jetbrains.jewel.ui.component.styling.SliderStyle
import org.jetbrains.jewel.ui.component.styling.TabStyle
import org.jetbrains.jewel.ui.component.styling.TextAreaStyle
import org.jetbrains.jewel.ui.component.styling.TextFieldStyle
import org.jetbrains.jewel.ui.component.styling.TooltipStyle

@Composable
fun JewelTheme.Companion.dynamicLightThemeDefinition(
    palette: ThemeColorPalette = IntUiLightTheme.colors,
    defaultTextStyle: TextStyle = JewelTheme.createDefaultTextStyle(),
    editorTextStyle: TextStyle = JewelTheme.createEditorTextStyle(),
    consoleTextStyle: TextStyle = editorTextStyle,
): ThemeDefinition {
    val globalColors = DynamicTheme.GlobalColors.light()

    return ThemeDefinition(
        name = "Dynamic Color Light",
        isDark = false,
        globalColors,
        GlobalMetrics.defaults(),
        defaultTextStyle,
        editorTextStyle,
        consoleTextStyle,
        globalColors.text.normal,
        palette,
        IntUiLightTheme.iconData,
    )
}

@Composable
fun JewelTheme.Companion.dynamicDarkThemeDefinition(
    palette: ThemeColorPalette = IntUiDarkTheme.colors,
    defaultTextStyle: TextStyle = JewelTheme.createDefaultTextStyle(),
    editorTextStyle: TextStyle = JewelTheme.createEditorTextStyle(),
    consoleTextStyle: TextStyle = editorTextStyle,
): ThemeDefinition {
    val globalColors = DynamicTheme.GlobalColors.dark()

    return ThemeDefinition(
        name = "Dynamic Color Dark",
        isDark = true,
        globalColors,
        GlobalMetrics.defaults(),
        defaultTextStyle,
        editorTextStyle,
        consoleTextStyle,
        globalColors.text.normal,
        palette,
        IntUiDarkTheme.iconData,
    )
}

@Composable
fun ComponentStyling.dynamicDefault(): ComponentStyling =
    with {
        val isDark = JewelTheme.isDark
        if (isDark) dynamicDark() else dynamicLight()
    }

@Composable
fun ComponentStyling.dynamicDark(
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
    lazyTreeStyle: LazyTreeStyle = LazyTreeStyle.dark(),
    linkStyle: LinkStyle = LinkStyle.dark(),
    menuStyle: MenuStyle = MenuStyle.dark(),
    outlinedButtonStyle: ButtonStyle = ButtonStyle.Outlined.dark(),
    radioButtonStyle: RadioButtonStyle = RadioButtonStyle.dark(),
    scrollbarStyle: ScrollbarStyle = ScrollbarStyle.dark(),
    segmentedControlButtonStyle: SegmentedControlButtonStyle = SegmentedControlButtonStyle.dark(),
    segmentedControlStyle: SegmentedControlStyle = SegmentedControlStyle.dark(),
    sliderStyle: SliderStyle = SliderStyle.dark(),
    textAreaStyle: TextAreaStyle = TextAreaStyle.dark(),
    textFieldStyle: TextFieldStyle = TextFieldStyle.dark(),
    tooltipStyle: TooltipStyle = TooltipStyle.dark(),
    undecoratedDropdownStyle: DropdownStyle = DropdownStyle.Undecorated.dark(),
): ComponentStyling =
   dark(
        checkboxStyle = checkboxStyle,
        chipStyle = chipStyle,
        circularProgressStyle = circularProgressStyle,
        defaultButtonStyle = defaultButtonStyle,
        dropdownStyle = dropdownStyle,
        defaultTabStyle = defaultTabStyle,
        dividerStyle = dividerStyle,
        editorTabStyle = editorTabStyle,
        groupHeaderStyle = groupHeaderStyle,
        horizontalProgressBarStyle = horizontalProgressBarStyle,
        iconButtonStyle = iconButtonStyle,
        lazyTreeStyle = lazyTreeStyle,
        linkStyle = linkStyle,
        menuStyle = menuStyle,
        outlinedButtonStyle = outlinedButtonStyle,
        radioButtonStyle = radioButtonStyle,
        scrollbarStyle = scrollbarStyle,
        segmentedControlButtonStyle = segmentedControlButtonStyle,
        segmentedControlStyle = segmentedControlStyle,
        sliderStyle = sliderStyle,
        textAreaStyle = textAreaStyle,
        textFieldStyle = textFieldStyle,
        tooltipStyle = tooltipStyle,
        undecoratedDropdownStyle = undecoratedDropdownStyle,
    )

@Composable
fun ComponentStyling.dynamicLight(
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
    lazyTreeStyle: LazyTreeStyle = LazyTreeStyle.light(),
    linkStyle: LinkStyle = LinkStyle.light(),
    menuStyle: MenuStyle = MenuStyle.light(),
    outlinedButtonStyle: ButtonStyle = ButtonStyle.Outlined.light(),
    radioButtonStyle: RadioButtonStyle = RadioButtonStyle.light(),
    scrollbarStyle: ScrollbarStyle = ScrollbarStyle.light(),
    segmentedControlButtonStyle: SegmentedControlButtonStyle = SegmentedControlButtonStyle.light(),
    segmentedControlStyle: SegmentedControlStyle = SegmentedControlStyle.light(),
    sliderStyle: SliderStyle = SliderStyle.light(),
    textAreaStyle: TextAreaStyle = TextAreaStyle.light(),
    textFieldStyle: TextFieldStyle = TextFieldStyle.light(),
    tooltipStyle: TooltipStyle = TooltipStyle.light(),
    undecoratedDropdownStyle: DropdownStyle = DropdownStyle.Undecorated.light(),
): ComponentStyling =
    light(
        checkboxStyle = checkboxStyle,
        chipStyle = chipStyle,
        circularProgressStyle = circularProgressStyle,
        defaultButtonStyle = defaultButtonStyle,
        dropdownStyle = dropdownStyle,
        defaultTabStyle = defaultTabStyle,
        dividerStyle = dividerStyle,
        editorTabStyle = editorTabStyle,
        groupHeaderStyle = groupHeaderStyle,
        horizontalProgressBarStyle = horizontalProgressBarStyle,
        iconButtonStyle = iconButtonStyle,
        lazyTreeStyle = lazyTreeStyle,
        linkStyle = linkStyle,
        menuStyle = menuStyle,
        outlinedButtonStyle = outlinedButtonStyle,
        radioButtonStyle = radioButtonStyle,
        scrollbarStyle = scrollbarStyle,
        segmentedControlButtonStyle = segmentedControlButtonStyle,
        segmentedControlStyle = segmentedControlStyle,
        sliderStyle = sliderStyle,
        textAreaStyle = textAreaStyle,
        textFieldStyle = textFieldStyle,
        tooltipStyle = tooltipStyle,
        undecoratedDropdownStyle = undecoratedDropdownStyle,
    )

@Composable
fun DynamicColorUiTheme(
    isDark: Boolean = false,
    styling: ComponentStyling,
    swingCompatMode: Boolean = false,
    content: @Composable () -> Unit,
) {
    val themeDefinition =
        if (isDark) JewelTheme.dynamicDarkThemeDefinition() else JewelTheme.dynamicLightThemeDefinition()

    IntUiTheme(
        theme = themeDefinition,
        styling = ComponentStyling.dynamicDefault().with(styling),
        swingCompatMode = swingCompatMode,
        content = content,
    )
}
