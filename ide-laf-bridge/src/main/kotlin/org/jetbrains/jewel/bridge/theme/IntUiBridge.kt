package org.jetbrains.jewel.bridge.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.platform.asComposeFontFamily
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.takeOrElse
import com.intellij.ide.ui.laf.darcula.DarculaUIUtil
import com.intellij.openapi.editor.colors.ColorKey
import com.intellij.openapi.editor.colors.EditorFontType
import com.intellij.openapi.util.registry.Registry
import com.intellij.ui.JBColor
import com.intellij.util.ui.DirProvider
import com.intellij.util.ui.JBUI
import org.jetbrains.jewel.bridge.dp
import org.jetbrains.jewel.bridge.lafName
import org.jetbrains.jewel.bridge.readFromLaF
import org.jetbrains.jewel.bridge.retrieveColorOrUnspecified
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
import org.jetbrains.jewel.foundation.theme.ThemeColorPalette
import org.jetbrains.jewel.foundation.theme.ThemeDefinition
import org.jetbrains.jewel.foundation.theme.ThemeIconData
import org.jetbrains.jewel.foundation.util.JewelLogger
import org.jetbrains.jewel.ui.ComponentStyling
import org.jetbrains.jewel.ui.DefaultComponentStyling
import org.jetbrains.jewel.ui.component.styling.DividerMetrics
import org.jetbrains.jewel.ui.component.styling.DividerStyle
import org.jetbrains.jewel.ui.component.styling.GroupHeaderColors
import org.jetbrains.jewel.ui.component.styling.GroupHeaderMetrics
import org.jetbrains.jewel.ui.component.styling.GroupHeaderStyle
import org.jetbrains.jewel.ui.component.styling.IconButtonColors
import org.jetbrains.jewel.ui.component.styling.IconButtonMetrics
import org.jetbrains.jewel.ui.component.styling.IconButtonStyle
import org.jetbrains.jewel.ui.component.styling.LazyTreeIcons
import org.jetbrains.jewel.ui.component.styling.LazyTreeMetrics
import org.jetbrains.jewel.ui.component.styling.LazyTreeStyle
import org.jetbrains.jewel.ui.component.styling.SelectableLazyColumnStyle
import org.jetbrains.jewel.ui.component.styling.SimpleListItemColors
import org.jetbrains.jewel.ui.component.styling.SimpleListItemMetrics
import org.jetbrains.jewel.ui.component.styling.TabColors
import org.jetbrains.jewel.ui.component.styling.TabContentAlpha
import org.jetbrains.jewel.ui.component.styling.TabIcons
import org.jetbrains.jewel.ui.component.styling.TabMetrics
import org.jetbrains.jewel.ui.component.styling.TabStyle
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

internal val isDark: Boolean
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
