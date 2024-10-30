package org.jetbrains.jewel.bridge.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.platform.asComposeFontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.takeOrElse
import com.intellij.ide.ui.laf.darcula.DarculaUIUtil
import com.intellij.ide.ui.laf.intellij.IdeaPopupMenuUI
import com.intellij.openapi.editor.colors.ColorKey
import com.intellij.openapi.editor.colors.EditorFontType
import com.intellij.openapi.util.registry.Registry
import com.intellij.ui.JBColor
import com.intellij.util.ui.DirProvider
import com.intellij.util.ui.JBUI
import com.intellij.util.ui.NamedColorUtil
import org.jetbrains.jewel.bridge.createVerticalBrush
import org.jetbrains.jewel.bridge.dp
import org.jetbrains.jewel.bridge.isNewUiTheme
import org.jetbrains.jewel.bridge.lafName
import org.jetbrains.jewel.bridge.readFromLaF
import org.jetbrains.jewel.bridge.retrieveArcAsCornerSizeOrDefault
import org.jetbrains.jewel.bridge.retrieveArcAsCornerSizeWithFallbacks
import org.jetbrains.jewel.bridge.retrieveColorOrUnspecified
import org.jetbrains.jewel.bridge.retrieveColorsOrUnspecified
import org.jetbrains.jewel.bridge.retrieveEditorColorScheme
import org.jetbrains.jewel.bridge.retrieveInsetsAsPaddingValues
import org.jetbrains.jewel.bridge.retrieveIntAsDpOrUnspecified
import org.jetbrains.jewel.bridge.retrieveTextStyle
import org.jetbrains.jewel.bridge.toComposeColor
import org.jetbrains.jewel.bridge.toComposeColorOrUnspecified
import org.jetbrains.jewel.bridge.toDpSize
import org.jetbrains.jewel.bridge.toPaddingValues
import org.jetbrains.jewel.foundation.GlobalColors
import org.jetbrains.jewel.foundation.GlobalMetrics
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.theme.ThemeColorPalette
import org.jetbrains.jewel.foundation.theme.ThemeDefinition
import org.jetbrains.jewel.foundation.theme.ThemeIconData
import org.jetbrains.jewel.foundation.util.JewelLogger
import org.jetbrains.jewel.ui.ComponentStyling
import org.jetbrains.jewel.ui.DefaultComponentStyling
import org.jetbrains.jewel.ui.component.styling.ButtonColors
import org.jetbrains.jewel.ui.component.styling.ButtonMetrics
import org.jetbrains.jewel.ui.component.styling.ButtonStyle
import org.jetbrains.jewel.ui.component.styling.ChipColors
import org.jetbrains.jewel.ui.component.styling.ChipMetrics
import org.jetbrains.jewel.ui.component.styling.ChipStyle
import org.jetbrains.jewel.ui.component.styling.CircularProgressStyle
import org.jetbrains.jewel.ui.component.styling.ComboBoxColors
import org.jetbrains.jewel.ui.component.styling.ComboBoxIcons
import org.jetbrains.jewel.ui.component.styling.ComboBoxMetrics
import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle
import org.jetbrains.jewel.ui.component.styling.DividerMetrics
import org.jetbrains.jewel.ui.component.styling.DividerStyle
import org.jetbrains.jewel.ui.component.styling.DropdownColors
import org.jetbrains.jewel.ui.component.styling.DropdownIcons
import org.jetbrains.jewel.ui.component.styling.DropdownMetrics
import org.jetbrains.jewel.ui.component.styling.DropdownStyle
import org.jetbrains.jewel.ui.component.styling.GroupHeaderColors
import org.jetbrains.jewel.ui.component.styling.GroupHeaderMetrics
import org.jetbrains.jewel.ui.component.styling.GroupHeaderStyle
import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarColors
import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarMetrics
import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarStyle
import org.jetbrains.jewel.ui.component.styling.IconButtonColors
import org.jetbrains.jewel.ui.component.styling.IconButtonMetrics
import org.jetbrains.jewel.ui.component.styling.IconButtonStyle
import org.jetbrains.jewel.ui.component.styling.LazyTreeIcons
import org.jetbrains.jewel.ui.component.styling.LazyTreeMetrics
import org.jetbrains.jewel.ui.component.styling.LazyTreeStyle
import org.jetbrains.jewel.ui.component.styling.LinkColors
import org.jetbrains.jewel.ui.component.styling.LinkIcons
import org.jetbrains.jewel.ui.component.styling.LinkMetrics
import org.jetbrains.jewel.ui.component.styling.LinkStyle
import org.jetbrains.jewel.ui.component.styling.LinkUnderlineBehavior
import org.jetbrains.jewel.ui.component.styling.MenuColors
import org.jetbrains.jewel.ui.component.styling.MenuIcons
import org.jetbrains.jewel.ui.component.styling.MenuItemColors
import org.jetbrains.jewel.ui.component.styling.MenuItemMetrics
import org.jetbrains.jewel.ui.component.styling.MenuMetrics
import org.jetbrains.jewel.ui.component.styling.MenuStyle
import org.jetbrains.jewel.ui.component.styling.PopupContainerColors
import org.jetbrains.jewel.ui.component.styling.PopupContainerMetrics
import org.jetbrains.jewel.ui.component.styling.PopupContainerStyle
import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonColors
import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonMetrics
import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonStyle
import org.jetbrains.jewel.ui.component.styling.SegmentedControlColors
import org.jetbrains.jewel.ui.component.styling.SegmentedControlMetrics
import org.jetbrains.jewel.ui.component.styling.SegmentedControlStyle
import org.jetbrains.jewel.ui.component.styling.SelectableLazyColumnStyle
import org.jetbrains.jewel.ui.component.styling.SimpleListItemColors
import org.jetbrains.jewel.ui.component.styling.SimpleListItemMetrics
import org.jetbrains.jewel.ui.component.styling.SimpleListItemStyle
import org.jetbrains.jewel.ui.component.styling.SliderColors
import org.jetbrains.jewel.ui.component.styling.SliderMetrics
import org.jetbrains.jewel.ui.component.styling.SliderStyle
import org.jetbrains.jewel.ui.component.styling.SubmenuMetrics
import org.jetbrains.jewel.ui.component.styling.TabColors
import org.jetbrains.jewel.ui.component.styling.TabContentAlpha
import org.jetbrains.jewel.ui.component.styling.TabIcons
import org.jetbrains.jewel.ui.component.styling.TabMetrics
import org.jetbrains.jewel.ui.component.styling.TabStyle
import org.jetbrains.jewel.ui.component.styling.TextAreaColors
import org.jetbrains.jewel.ui.component.styling.TextAreaMetrics
import org.jetbrains.jewel.ui.component.styling.TextAreaStyle
import org.jetbrains.jewel.ui.component.styling.TextFieldColors
import org.jetbrains.jewel.ui.component.styling.TextFieldMetrics
import org.jetbrains.jewel.ui.component.styling.TextFieldStyle
import org.jetbrains.jewel.ui.component.styling.TooltipColors
import org.jetbrains.jewel.ui.component.styling.TooltipMetrics
import org.jetbrains.jewel.ui.component.styling.TooltipStyle
import org.jetbrains.jewel.ui.icons.AllIconsKeys
import javax.swing.UIManager
import kotlin.time.Duration.Companion.milliseconds

private val logger = JewelLogger.getInstance("JewelIntUiBridge")

internal val uiDefaults
    get() = UIManager.getDefaults()

internal val iconsBasePath
    get() = DirProvider().dir()

internal fun createBridgeThemeDefinition(): ThemeDefinition {
    val textStyle = retrieveDefaultTextStyle()
    val editorTextStyle = retrieveEditorTextStyle()
    val consoleTextStyle = retrieveConsoleTextStyle()
    return createBridgeThemeDefinition(textStyle, editorTextStyle, consoleTextStyle)
}

public fun retrieveDefaultTextStyle(): TextStyle = retrieveTextStyle("Label.font", "Label.foreground")

@OptIn(ExperimentalTextApi::class)
public fun retrieveEditorTextStyle(): TextStyle {
    val editorColorScheme = retrieveEditorColorScheme()

    val fontSize = editorColorScheme.editorFontSize.sp
    return retrieveDefaultTextStyle()
        .copy(
            color = editorColorScheme.defaultForeground.toComposeColor(),
            fontFamily = editorColorScheme.getFont(EditorFontType.PLAIN).asComposeFontFamily(),
            fontSize = fontSize,
            lineHeight = fontSize * editorColorScheme.lineSpacing,
            fontFeatureSettings = if (!editorColorScheme.isUseLigatures) "liga 0" else "liga 1",
        )
}

@OptIn(ExperimentalTextApi::class)
public fun retrieveConsoleTextStyle(): TextStyle {
    val editorColorScheme = retrieveEditorColorScheme()
    if (editorColorScheme.isUseEditorFontPreferencesInConsole) return retrieveEditorTextStyle()

    val fontSize = editorColorScheme.consoleFontSize.sp
    val fontColor =
        editorColorScheme.getColor(ColorKey.createColorKey("BLOCK_TERMINAL_DEFAULT_FOREGROUND"))
            ?: editorColorScheme.defaultForeground

    return retrieveDefaultTextStyle()
        .copy(
            color = fontColor.toComposeColor(),
            fontFamily = editorColorScheme.getFont(EditorFontType.CONSOLE_PLAIN).asComposeFontFamily(),
            fontSize = fontSize,
            lineHeight = fontSize * editorColorScheme.lineSpacing,
            fontFeatureSettings = if (!editorColorScheme.isUseLigatures) "liga 0" else "liga 1",
        )
}

private val isDark: Boolean
    get() = !JBColor.isBright()

internal fun createBridgeThemeDefinition(
    textStyle: TextStyle,
    editorTextStyle: TextStyle,
    consoleTextStyle: TextStyle,
): ThemeDefinition {
    logger.debug("Obtaining theme definition from Swing...")

    return ThemeDefinition(
        name = lafName(),
        isDark = isDark,
        globalColors = GlobalColors.readFromLaF(),
        globalMetrics = GlobalMetrics.readFromLaF(),
        defaultTextStyle = textStyle,
        editorTextStyle = editorTextStyle,
        consoleTextStyle = consoleTextStyle,
        contentColor = JBColor.foreground().toComposeColor(),
        colorPalette = ThemeColorPalette.readFromLaF(),
        iconData = ThemeIconData.readFromLaF(),
    )
}

internal fun createBridgeComponentStyling(theme: ThemeDefinition): ComponentStyling {
    logger.debug("Obtaining Int UI component styling from Swing...")

    val textFieldStyle = readTextFieldStyle()
    val menuStyle = readMenuStyle()

    return DefaultComponentStyling(
        checkboxStyle = readCheckboxStyle(),
        chipStyle = readChipStyle(),
        circularProgressStyle = readCircularProgressStyle(theme.isDark),
        defaultButtonStyle = readDefaultButtonStyle(),
        comboBoxStyle = readDefaultComboBoxStyle(),
        defaultDropdownStyle = readDefaultDropdownStyle(menuStyle),
        defaultTabStyle = readDefaultTabStyle(),
        dividerStyle = readDividerStyle(),
        editorTabStyle = readEditorTabStyle(),
        groupHeaderStyle = readGroupHeaderStyle(),
        horizontalProgressBarStyle = readHorizontalProgressBarStyle(),
        iconButtonStyle = readIconButtonStyle(),
        lazyTreeStyle = readLazyTreeStyle(),
        linkStyle = readLinkStyle(),
        menuStyle = menuStyle,
        outlinedButtonStyle = readOutlinedButtonStyle(),
        popupContainerStyle = readPopupContainerStyle(),
        radioButtonStyle = readRadioButtonStyle(),
        scrollbarStyle = readScrollbarStyle(theme.isDark),
        segmentedControlButtonStyle = readSegmentedControlButtonStyle(),
        segmentedControlStyle = readSegmentedControlStyle(),
        selectableLazyColumnStyle = readSelectableLazyColumnStyle(),
        simpleListItemStyle = readSimpleListItemStyle(),
        sliderStyle = readSliderStyle(theme.isDark),
        textAreaStyle = readTextAreaStyle(textFieldStyle.metrics),
        textFieldStyle = textFieldStyle,
        tooltipStyle = readTooltipStyle(),
        undecoratedDropdownStyle = readUndecoratedDropdownStyle(menuStyle),
    )
}

private fun readDividerStyle() =
    DividerStyle(color = JBColor.border().toComposeColorOrUnspecified(), metrics = DividerMetrics.defaults())

private fun readSelectableLazyColumnStyle(): SelectableLazyColumnStyle =
    SelectableLazyColumnStyle(
        itemHeight = JBUI.CurrentTheme.ComboBox.minimumSize().toDpSize().height,
        simpleListItemStyle = readSimpleListItemStyle(),
    )

private fun readGroupHeaderStyle() =
    GroupHeaderStyle(
        colors = GroupHeaderColors(divider = retrieveColorOrUnspecified("Separator.separatorColor")),
        metrics =
            GroupHeaderMetrics(
                dividerThickness = 1.dp, // see DarculaSeparatorUI
                indent = 1.dp, // see DarculaSeparatorUI
            ),
    )

private fun readHorizontalProgressBarStyle() =
    HorizontalProgressBarStyle(
        colors =
            HorizontalProgressBarColors(
                track = retrieveColorOrUnspecified("ProgressBar.trackColor"),
                progress = retrieveColorOrUnspecified("ProgressBar.progressColor"),
                indeterminateBase = retrieveColorOrUnspecified("ProgressBar.indeterminateStartColor"),
                indeterminateHighlight = retrieveColorOrUnspecified("ProgressBar.indeterminateEndColor"),
            ),
        metrics =
            HorizontalProgressBarMetrics(
                cornerSize = CornerSize(100),
                minHeight = 4.dp, // See DarculaProgressBarUI.DEFAULT_WIDTH
                // See DarculaProgressBarUI.CYCLE_TIME_DEFAULT,
                // DarculaProgressBarUI.REPAINT_INTERVAL_DEFAULT,
                // and the "step" constant in DarculaProgressBarUI#paintIndeterminate
                indeterminateHighlightWidth = (800 / 50 * 6).dp,
            ),
        indeterminateCycleDuration = 800.milliseconds, // See DarculaProgressBarUI.CYCLE_TIME_DEFAULT
    )

private fun readLinkStyle(): LinkStyle {
    val normalContent =
        retrieveColorOrUnspecified("Link.activeForeground").takeOrElse {
            retrieveColorOrUnspecified("Link.activeForeground")
        }

    val colors =
        LinkColors(
            content = normalContent,
            contentDisabled =
                retrieveColorOrUnspecified("Link.disabledForeground").takeOrElse {
                    retrieveColorOrUnspecified("Label.disabledForeground")
                },
            contentFocused = normalContent,
            contentPressed =
                retrieveColorOrUnspecified("Link.pressedForeground").takeOrElse {
                    retrieveColorOrUnspecified("link.pressed.foreground")
                },
            contentHovered =
                retrieveColorOrUnspecified("Link.hoverForeground").takeOrElse {
                    retrieveColorOrUnspecified("link.hover.foreground")
                },
            contentVisited =
                retrieveColorOrUnspecified("Link.visitedForeground").takeOrElse {
                    retrieveColorOrUnspecified("link.visited.foreground")
                },
        )

    return LinkStyle(
        colors = colors,
        metrics =
            LinkMetrics(
                focusHaloCornerSize =
                    retrieveArcAsCornerSizeOrDefault(
                        key = "ide.link.button.focus.round.arc",
                        default = CornerSize(4.dp),
                    ),
                textIconGap = 4.dp,
                iconSize = DpSize(16.dp, 16.dp),
            ),
        icons =
            LinkIcons(
                dropdownChevron = AllIconsKeys.General.ChevronDown,
                externalLink = AllIconsKeys.Ide.External_link_arrow,
            ),
        underlineBehavior = LinkUnderlineBehavior.ShowOnHover,
    )
}

private fun readPopupContainerStyle(): PopupContainerStyle {
    val colors =
        PopupContainerColors(
            background = retrieveColorOrUnspecified("PopupMenu.background"),
            border =
                retrieveColorOrUnspecified("Popup.borderColor").takeOrElse {
                    retrieveColorOrUnspecified("Popup.Border.color")
                },
            shadow = Color.Black.copy(alpha = .6f),
        )

    return PopupContainerStyle(
        isDark = isDark,
        colors = colors,
        metrics =
            PopupContainerMetrics(
                cornerSize = CornerSize(IdeaPopupMenuUI.CORNER_RADIUS.dp),
                menuMargin = PaddingValues(),
                contentPadding = PaddingValues(),
                offset = DpOffset(0.dp, 2.dp),
                shadowSize = 12.dp,
                borderWidth = retrieveIntAsDpOrUnspecified("Popup.borderWidth").takeOrElse { 1.dp },
            ),
    )
}

private fun readMenuStyle(): MenuStyle {
    val backgroundSelected = retrieveColorOrUnspecified("MenuItem.selectionBackground")
    val foregroundSelected = retrieveColorOrUnspecified("MenuItem.selectionForeground")
    val keybindingTint = retrieveColorOrUnspecified("MenuItem.acceleratorForeground")
    val keybindingTintSelected = Color.Unspecified

    val colors =
        MenuColors(
            background = retrieveColorOrUnspecified("PopupMenu.background"),
            border =
                retrieveColorOrUnspecified("Popup.borderColor").takeOrElse {
                    retrieveColorOrUnspecified("Popup.Border.color")
                },
            shadow = Color.Black.copy(alpha = .6f),
            itemColors =
                MenuItemColors(
                    background = retrieveColorOrUnspecified("MenuItem.background"),
                    backgroundDisabled = retrieveColorOrUnspecified("MenuItem.disabledBackground"),
                    backgroundFocused = backgroundSelected,
                    backgroundPressed = backgroundSelected,
                    backgroundHovered = backgroundSelected,
                    content = retrieveColorOrUnspecified("PopupMenu.foreground"),
                    contentDisabled = retrieveColorOrUnspecified("PopupMenu.disabledForeground"),
                    contentFocused = foregroundSelected,
                    contentPressed = foregroundSelected,
                    contentHovered = foregroundSelected,
                    iconTint = Color.Unspecified,
                    iconTintDisabled = Color.Unspecified,
                    iconTintFocused = Color.Unspecified,
                    iconTintPressed = Color.Unspecified,
                    iconTintHovered = Color.Unspecified,
                    keybindingTint = keybindingTint,
                    keybindingTintDisabled = keybindingTint,
                    keybindingTintFocused = keybindingTintSelected,
                    keybindingTintPressed = keybindingTintSelected,
                    keybindingTintHovered = keybindingTintSelected,
                    separator = retrieveColorOrUnspecified("Menu.separatorColor"),
                ),
        )

    return MenuStyle(
        isDark = isDark,
        colors = colors,
        metrics =
            MenuMetrics(
                cornerSize = CornerSize(IdeaPopupMenuUI.CORNER_RADIUS.dp),
                menuMargin = PaddingValues(),
                contentPadding = PaddingValues(),
                offset = DpOffset(0.dp, 2.dp),
                shadowSize = 12.dp,
                borderWidth = retrieveIntAsDpOrUnspecified("Popup.borderWidth").takeOrElse { 1.dp },
                itemMetrics =
                    MenuItemMetrics(
                        selectionCornerSize = CornerSize(0.dp),
                        outerPadding = PaddingValues(),
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 4.dp),
                        keybindingsPadding = PaddingValues(start = 36.dp),
                        separatorPadding =
                            PaddingValues(
                                horizontal =
                                    retrieveIntAsDpOrUnspecified("PopupMenuSeparator.withToEdge").takeOrElse { 1.dp },
                                vertical =
                                    retrieveIntAsDpOrUnspecified("PopupMenuSeparator.stripeIndent").takeOrElse { 1.dp },
                            ),
                        separatorThickness =
                            retrieveIntAsDpOrUnspecified("PopupMenuSeparator.stripeWidth").takeOrElse { 1.dp },
                        separatorHeight = retrieveIntAsDpOrUnspecified("PopupMenuSeparator.height").takeOrElse { 3.dp },
                        iconSize = 16.dp,
                        minHeight = if (isNewUiTheme()) JBUI.CurrentTheme.List.rowHeight().dp else Dp.Unspecified,
                    ),
                submenuMetrics = SubmenuMetrics(offset = DpOffset(0.dp, (-8).dp)),
            ),
        icons = MenuIcons(submenuChevron = AllIconsKeys.General.ChevronRight),
    )
}

private fun readSegmentedControlStyle(): SegmentedControlStyle {
    val normalBorder =
        listOf(
                JBUI.CurrentTheme.Button.buttonOutlineColorStart(false).toComposeColor(),
                JBUI.CurrentTheme.Button.buttonOutlineColorEnd(false).toComposeColor(),
            )
            .createVerticalBrush()

    val colors =
        SegmentedControlColors(
            border = normalBorder,
            borderDisabled = SolidColor(JBUI.CurrentTheme.Button.disabledOutlineColor().toComposeColor()),
            borderPressed = normalBorder,
            borderHovered = normalBorder,
            borderFocused = SolidColor(JBUI.CurrentTheme.Button.focusBorderColor(false).toComposeColor()),
        )

    return SegmentedControlStyle(
        colors = colors,
        metrics =
            SegmentedControlMetrics(
                cornerSize = CornerSize(DarculaUIUtil.BUTTON_ARC.dp / 2),
                borderWidth = DarculaUIUtil.LW.dp,
            ),
    )
}

private fun readSliderStyle(dark: Boolean): SliderStyle {
    // There are no values for sliders in IntUi, so we're essentially reusing the
    // standalone colors logic, reading the palette values (and falling back to
    // hardcoded defaults).
    val colors = if (dark) SliderColors.dark() else SliderColors.light()
    return SliderStyle(colors, SliderMetrics.defaults(), CircleShape)
}

private fun readTextAreaStyle(metrics: TextFieldMetrics): TextAreaStyle {
    val normalBackground = retrieveColorOrUnspecified("TextArea.background")
    val normalContent = retrieveColorOrUnspecified("TextArea.foreground")
    val normalBorder = DarculaUIUtil.getOutlineColor(true, false).toComposeColor()
    val focusedBorder = DarculaUIUtil.getOutlineColor(true, true).toComposeColor()
    val normalCaret = retrieveColorOrUnspecified("TextArea.caretForeground")

    val colors =
        TextAreaColors(
            background = normalBackground,
            backgroundDisabled = Color.Unspecified,
            backgroundFocused = normalBackground,
            backgroundPressed = normalBackground,
            backgroundHovered = normalBackground,
            content = normalContent,
            contentDisabled = retrieveColorOrUnspecified("TextArea.inactiveForeground"),
            contentFocused = normalContent,
            contentPressed = normalContent,
            contentHovered = normalContent,
            border = normalBorder,
            borderDisabled = DarculaUIUtil.getOutlineColor(false, false).toComposeColor(),
            borderFocused = focusedBorder,
            borderPressed = focusedBorder,
            borderHovered = normalBorder,
            caret = normalCaret,
            caretDisabled = normalCaret,
            caretFocused = normalCaret,
            caretPressed = normalCaret,
            caretHovered = normalCaret,
            placeholder = NamedColorUtil.getInactiveTextColor().toComposeColor(),
        )

    return TextAreaStyle(
        colors = colors,
        metrics =
            TextAreaMetrics(
                cornerSize = metrics.cornerSize,
                contentPadding = PaddingValues(horizontal = 5.dp, vertical = 4.dp),
                minSize = metrics.minSize,
                borderWidth = metrics.borderWidth,
            ),
    )
}

private fun readTextFieldStyle(): TextFieldStyle {
    val normalBackground = retrieveColorOrUnspecified("TextField.background")
    val normalContent = retrieveColorOrUnspecified("TextField.foreground")
    val normalBorder = DarculaUIUtil.getOutlineColor(true, false).toComposeColor()
    val focusedBorder = DarculaUIUtil.getOutlineColor(true, true).toComposeColor()
    val normalCaret = retrieveColorOrUnspecified("TextField.caretForeground")

    val colors =
        TextFieldColors(
            background = normalBackground,
            backgroundDisabled = Color.Unspecified,
            backgroundFocused = normalBackground,
            backgroundPressed = normalBackground,
            backgroundHovered = normalBackground,
            content = normalContent,
            contentDisabled = retrieveColorOrUnspecified("TextField.inactiveForeground"),
            contentFocused = normalContent,
            contentPressed = normalContent,
            contentHovered = normalContent,
            border = normalBorder,
            borderDisabled = DarculaUIUtil.getOutlineColor(false, false).toComposeColor(),
            borderFocused = focusedBorder,
            borderPressed = focusedBorder,
            borderHovered = normalBorder,
            caret = normalCaret,
            caretDisabled = normalCaret,
            caretFocused = normalCaret,
            caretPressed = normalCaret,
            caretHovered = normalCaret,
            placeholder = NamedColorUtil.getInactiveTextColor().toComposeColor(),
        )

    val minimumSize = JBUI.CurrentTheme.TextField.minimumSize().toDpSize()
    return TextFieldStyle(
        colors = colors,
        metrics =
            TextFieldMetrics(
                cornerSize = componentArc,
                contentPadding = PaddingValues(horizontal = 8.dp + DarculaUIUtil.LW.dp),
                minSize = DpSize(144.dp, minimumSize.height),
                borderWidth = DarculaUIUtil.LW.dp,
            ),
    )
}

private fun readLazyTreeStyle(): LazyTreeStyle {
    val normalContent = retrieveColorOrUnspecified("Tree.foreground")
    val selectedContent = retrieveColorOrUnspecified("Tree.selectionForeground")
    val selectedElementBackground = retrieveColorOrUnspecified("Tree.selectionBackground")
    val inactiveSelectedElementBackground = retrieveColorOrUnspecified("Tree.selectionInactiveBackground")

    val colors =
        SimpleListItemColors(
            content = normalContent,
            contentFocused = normalContent,
            contentSelected = selectedContent,
            contentSelectedFocused = selectedContent,
            backgroundFocused = Color.Transparent,
            backgroundSelected = inactiveSelectedElementBackground,
            backgroundSelectedFocused = selectedElementBackground,
        )

    val leftIndent = retrieveIntAsDpOrUnspecified("Tree.leftChildIndent").takeOrElse { 7.dp }
    val rightIndent = retrieveIntAsDpOrUnspecified("Tree.rightChildIndent").takeOrElse { 11.dp }

    return LazyTreeStyle(
        colors = colors,
        metrics =
            LazyTreeMetrics(
                indentSize = leftIndent + rightIndent,
                simpleListItemMetrics =
                    SimpleListItemMetrics(
                        innerPadding = PaddingValues(horizontal = 12.dp),
                        outerPadding = PaddingValues(4.dp),
                        selectionBackgroundCornerSize = CornerSize(JBUI.CurrentTheme.Tree.ARC.dp / 2),
                    ),
                elementMinHeight = retrieveIntAsDpOrUnspecified("Tree.rowHeight").takeOrElse { 24.dp },
                chevronContentGap = 2.dp, // See com.intellij.ui.tree.ui.ClassicPainter.GAP
            ),
        icons =
            LazyTreeIcons(
                chevronCollapsed = AllIconsKeys.General.ChevronRight,
                chevronExpanded = AllIconsKeys.General.ChevronDown,
                chevronSelectedCollapsed = AllIconsKeys.General.ChevronRight,
                chevronSelectedExpanded = AllIconsKeys.General.ChevronDown,
            ),
    )
}

// See com.intellij.ui.tabs.impl.themes.DefaultTabTheme
private fun readDefaultTabStyle(): TabStyle {
    val normalBackground = JBUI.CurrentTheme.DefaultTabs.background().toComposeColor()
    val selectedBackground = JBUI.CurrentTheme.DefaultTabs.underlinedTabBackground().toComposeColorOrUnspecified()
    val normalContent = retrieveColorOrUnspecified("TabbedPane.foreground")
    val selectedUnderline = retrieveColorOrUnspecified("TabbedPane.underlineColor")

    val colors =
        TabColors(
            background = normalBackground,
            backgroundDisabled = normalBackground,
            backgroundPressed = selectedBackground,
            backgroundHovered = JBUI.CurrentTheme.DefaultTabs.hoverBackground().toComposeColor(),
            backgroundSelected = selectedBackground,
            content = normalContent,
            contentDisabled = retrieveColorOrUnspecified("TabbedPane.disabledForeground"),
            contentPressed = normalContent,
            contentHovered = normalContent,
            contentSelected = normalContent,
            underline = Color.Unspecified,
            underlineDisabled = retrieveColorOrUnspecified("TabbedPane.disabledUnderlineColor"),
            underlinePressed = selectedUnderline,
            underlineHovered = Color.Unspecified,
            underlineSelected = selectedUnderline,
        )

    return TabStyle(
        colors = colors,
        metrics =
            TabMetrics(
                underlineThickness = retrieveIntAsDpOrUnspecified("TabbedPane.tabSelectionHeight").takeOrElse { 2.dp },
                tabPadding = retrieveInsetsAsPaddingValues("TabbedPane.tabInsets"),
                closeContentGap = 4.dp,
                tabContentSpacing = 4.dp,
                tabHeight = retrieveIntAsDpOrUnspecified("TabbedPane.tabHeight").takeOrElse { 24.dp },
            ),
        icons = TabIcons(close = AllIconsKeys.General.CloseSmall),
        contentAlpha =
            TabContentAlpha(
                iconNormal = 1f,
                iconDisabled = 1f,
                iconPressed = 1f,
                iconHovered = 1f,
                iconSelected = 1f,
                contentNormal = 1f,
                contentDisabled = 1f,
                contentPressed = 1f,
                contentHovered = 1f,
                contentSelected = 1f,
            ),
        scrollbarStyle = readScrollbarStyle(isDark),
    )
}

private fun readEditorTabStyle(): TabStyle {
    val normalBackground = JBUI.CurrentTheme.EditorTabs.background().toComposeColor()
    val selectedBackground = JBUI.CurrentTheme.EditorTabs.underlinedTabBackground().toComposeColorOrUnspecified()
    val normalContent = retrieveColorOrUnspecified("TabbedPane.foreground")
    val selectedUnderline = retrieveColorOrUnspecified("TabbedPane.underlineColor")

    val colors =
        TabColors(
            background = normalBackground,
            backgroundDisabled = normalBackground,
            backgroundPressed = selectedBackground,
            backgroundHovered = JBUI.CurrentTheme.EditorTabs.hoverBackground().toComposeColor(),
            backgroundSelected = selectedBackground,
            content = normalContent,
            contentDisabled = retrieveColorOrUnspecified("TabbedPane.disabledForeground"),
            contentPressed = normalContent,
            contentHovered = normalContent,
            contentSelected = normalContent,
            underline = Color.Unspecified,
            underlineDisabled = retrieveColorOrUnspecified("TabbedPane.disabledUnderlineColor"),
            underlinePressed = selectedUnderline,
            underlineHovered = Color.Unspecified,
            underlineSelected = selectedUnderline,
        )

    return TabStyle(
        colors = colors,
        metrics =
            TabMetrics(
                underlineThickness = retrieveIntAsDpOrUnspecified("TabbedPane.tabSelectionHeight").takeOrElse { 2.dp },
                tabPadding = retrieveInsetsAsPaddingValues("TabbedPane.tabInsets"),
                closeContentGap = 4.dp,
                tabContentSpacing = 4.dp,
                tabHeight = retrieveIntAsDpOrUnspecified("TabbedPane.tabHeight").takeOrElse { 24.dp },
            ),
        icons = TabIcons(close = AllIconsKeys.General.CloseSmall),
        contentAlpha =
            TabContentAlpha(
                iconNormal = .7f,
                iconDisabled = .7f,
                iconPressed = 1f,
                iconHovered = 1f,
                iconSelected = 1f,
                contentNormal = .7f,
                contentDisabled = .7f,
                contentPressed = 1f,
                contentHovered = 1f,
                contentSelected = 1f,
            ),
        scrollbarStyle = readScrollbarStyle(isDark),
    )
}

private fun readTooltipStyle(): TooltipStyle {
    return TooltipStyle(
        metrics =
            TooltipMetrics.defaults(
                contentPadding = JBUI.CurrentTheme.HelpTooltip.smallTextBorderInsets().toPaddingValues(),
                showDelay = Registry.intValue("ide.tooltip.initialDelay").milliseconds,
                cornerSize = CornerSize(JBUI.CurrentTheme.Tooltip.CORNER_RADIUS.dp),
            ),
        colors =
            TooltipColors(
                content = retrieveColorOrUnspecified("ToolTip.foreground"),
                background = retrieveColorOrUnspecified("ToolTip.background"),
                border = JBUI.CurrentTheme.Tooltip.borderColor().toComposeColor(),
                shadow = retrieveColorOrUnspecified("Notification.Shadow.bottom1Color"),
            ),
    )
}

private fun readIconButtonStyle(): IconButtonStyle =
    IconButtonStyle(
        metrics =
            IconButtonMetrics(
                cornerSize = CornerSize(DarculaUIUtil.BUTTON_ARC.dp / 2),
                borderWidth = 1.dp,
                padding = PaddingValues(0.dp),
                minSize = DpSize(24.dp, 24.dp),
            ),
        colors =
            IconButtonColors(
                foregroundSelectedActivated = retrieveColorOrUnspecified("ToolWindow.Button.selectedForeground"),
                background = Color.Unspecified,
                backgroundDisabled = Color.Unspecified,
                backgroundSelected = retrieveColorOrUnspecified("ActionButton.pressedBackground"),
                backgroundSelectedActivated = retrieveColorOrUnspecified("ToolWindow.Button.selectedBackground"),
                backgroundPressed = retrieveColorOrUnspecified("ActionButton.pressedBackground"),
                backgroundHovered = retrieveColorOrUnspecified("ActionButton.hoverBackground"),
                backgroundFocused = retrieveColorOrUnspecified("ActionButton.hoverBackground"),
                border = Color.Unspecified,
                borderDisabled = Color.Unspecified,
                borderSelected = retrieveColorOrUnspecified("ActionButton.pressedBackground"),
                borderSelectedActivated = retrieveColorOrUnspecified("ToolWindow.Button.selectedBackground"),
                borderFocused = Color.Unspecified,
                borderPressed = retrieveColorOrUnspecified("ActionButton.pressedBorderColor"),
                borderHovered = retrieveColorOrUnspecified("ActionButton.hoverBorderColor"),
            ),
    )

internal val componentArc: CornerSize
    get() = CornerSize(DarculaUIUtil.COMPONENT_ARC.dp / 2)
