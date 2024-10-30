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
import org.jetbrains.jewel.ui.component.styling.SelectableLazyColumnStyle
import org.jetbrains.jewel.ui.component.styling.TooltipColors
import org.jetbrains.jewel.ui.component.styling.TooltipMetrics
import org.jetbrains.jewel.ui.component.styling.TooltipStyle
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
        comboBoxStyle = readDefaultComboBoxStyle(),
        defaultButtonStyle = readDefaultButtonStyle(),
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

internal val componentArc: CornerSize
    get() = CornerSize(DarculaUIUtil.COMPONENT_ARC.dp / 2)
