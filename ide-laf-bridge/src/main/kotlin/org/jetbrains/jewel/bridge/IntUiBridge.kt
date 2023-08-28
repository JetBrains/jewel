package org.jetbrains.jewel.bridge

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.intellij.ide.ui.laf.darcula.DarculaUIUtil
import com.intellij.ide.ui.laf.darcula.ui.DarculaCheckBoxUI
import com.intellij.ide.ui.laf.intellij.IdeaPopupMenuUI
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.util.registry.Registry
import com.intellij.ui.JBColor
import com.intellij.ui.components.ScrollBarPainter
import com.intellij.util.ui.DirProvider
import com.intellij.util.ui.JBUI
import com.intellij.util.ui.StatusText
import org.jetbrains.jewel.CheckboxState
import org.jetbrains.jewel.IntelliJComponentStyling
import org.jetbrains.jewel.IntelliJThemeIconData
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.styling.InputFieldStyle
import org.jetbrains.jewel.styling.ResourcePainterProvider
import org.jetbrains.jewel.themes.intui.core.IntUiThemeDefinition
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiButtonColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiButtonMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiButtonStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiCheckboxColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiCheckboxIcons
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiCheckboxMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiCheckboxStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiChipColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiChipMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiChipStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiDropdownColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiDropdownIcons
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiDropdownMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiDropdownStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiGroupHeaderColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiGroupHeaderMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiGroupHeaderStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiHorizontalProgressBarColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiHorizontalProgressBarMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiHorizontalProgressBarStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLabelledTextFieldColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLabelledTextFieldMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLabelledTextFieldStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLabelledTextFieldTextStyles
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLazyTreeColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLazyTreeIcons
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLazyTreeMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLazyTreeStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLinkColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLinkIcons
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLinkMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLinkStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiLinkTextStyles
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiMenuColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiMenuIcons
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiMenuItemColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiMenuItemMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiMenuMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiMenuStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiRadioButtonColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiRadioButtonIcons
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiRadioButtonMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiRadioButtonStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiScrollbarColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiScrollbarMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiScrollbarStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiSubmenuMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTabColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTabContentAlpha
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTabIcons
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTabMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTabStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTextAreaColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTextAreaMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTextAreaStyle
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTextFieldColors
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTextFieldMetrics
import org.jetbrains.jewel.themes.intui.standalone.styling.IntUiTextFieldStyle
import javax.swing.UIManager
import kotlin.time.Duration.Companion.milliseconds

private val logger = Logger.getInstance("JewelIntUiBridge")

internal val uiDefaults
    get() = UIManager.getDefaults()

internal suspend fun createBridgeIntUiDefinition(): IntUiThemeDefinition {
    val textStyle = retrieveTextStyle("Label.font", "Label.foreground")
    return createBridgeIntUiDefinition(textStyle)
}

internal fun createBridgeIntUiDefinition(textStyle: TextStyle): IntUiThemeDefinition {
    val isDark = !JBColor.isBright()

    logger.debug("Obtaining Int UI theme definition from Swing...")

    return IntUiThemeDefinition(
        isDark = isDark,
        globalColors = BridgeGlobalColors.readFromLaF(),
        colorPalette = BridgeThemeColorPalette.readFromLaF(),
        iconData = BridgeIconData.readFromLaF(),
        metrics = BridgeGlobalMetrics.readFromLaF(),
        defaultTextStyle = textStyle,
    )
}

internal suspend fun createSwingIntUiComponentStyling(
    theme: IntUiThemeDefinition,
    svgLoader: SvgLoader,
): IntelliJComponentStyling {
    val menuStyle = readMenuStyle(theme.iconData, svgLoader)
    val textFieldStyle = readTextFieldStyle()

    return IntelliJComponentStyling(
        checkboxStyle = readCheckboxStyle(theme.iconData, svgLoader),
        chipStyle = readChipStyle(),
        defaultButtonStyle = readDefaultButtonStyle(),
        defaultTabStyle = readDefaultTabStyle(),
        dropdownStyle = readDropdownStyle(theme.iconData, svgLoader, menuStyle),
        editorTabStyle = readEditorTabStyle(),
        groupHeaderStyle = readGroupHeaderStyle(),
        horizontalProgressBarStyle = readHorizontalProgressBarStyle(),
        labelledTextFieldStyle = readLabelledTextFieldStyle(textFieldStyle),
        lazyTreeStyle = readLazyTreeStyle(theme.iconData, svgLoader),
        linkStyle = readLinkStyle(theme.iconData, svgLoader),
        menuStyle = menuStyle,
        outlinedButtonStyle = readOutlinedButtonStyle(),
        radioButtonStyle = readRadioButtonStyle(theme.iconData, svgLoader),
        scrollbarStyle = readScrollbarStyle(),
        textAreaStyle = readTextAreaStyle(textFieldStyle),
        textFieldStyle = textFieldStyle,
    )
}

private fun readDefaultButtonStyle(): IntUiButtonStyle {
    val normalBackground =
        Brush.verticalGradient(
            retrieveColorsOrUnspecified(
                "Button.default.startBackground",
                "Button.default.endBackground",
            ),
        )
    val normalContent = retrieveColorOrUnspecified("Button.default.foreground")
    val normalBorder =
        Brush.verticalGradient(
            retrieveColorsOrUnspecified(
                "Button.default.startBorderColor",
                "Button.default.endBorderColor",
            ),
        )

    val colors = IntUiButtonColors(
        background = normalBackground,
        backgroundDisabled = SolidColor(Color.Transparent),
        backgroundFocused = normalBackground,
        backgroundPressed = normalBackground,
        backgroundHovered = normalBackground,
        content = normalContent,
        contentDisabled = retrieveColorOrUnspecified("Button.default.disabledText"),
        contentFocused = normalContent,
        contentPressed = normalContent,
        contentHovered = normalContent,
        border = normalBorder,
        borderDisabled = SolidColor(retrieveColorOrUnspecified("Button.default.disabledBorderColor")),
        borderFocused = SolidColor(retrieveColorOrUnspecified("Button.default.focusedBorderColor")),
        borderPressed = normalBorder,
        borderHovered = normalBorder,
    )

    return IntUiButtonStyle(
        colors = colors,
        metrics = IntUiButtonMetrics(
            cornerSize = retrieveArcAsCornerSize("Button.default.arc"),
            padding = PaddingValues(horizontal = 14.dp), // see DarculaButtonUI.HORIZONTAL_PADDING
            minSize = DpSize(DarculaUIUtil.MINIMUM_WIDTH.unscaled.dp, DarculaUIUtil.MINIMUM_HEIGHT.unscaled.dp),
            borderWidth = 1.dp,
        ),
    )
}

private fun readOutlinedButtonStyle(): IntUiButtonStyle {
    val normalBackground =
        Brush.verticalGradient(retrieveColorsOrUnspecified("Button.startBackground", "Button.endBackground"))
    val normalContent = retrieveColorOrUnspecified("Button.foreground")
    val normalBorder =
        Brush.verticalGradient(retrieveColorsOrUnspecified("Button.startBorderColor", "Button.endBorderColor"))

    val colors = IntUiButtonColors(
        background = normalBackground,
        backgroundDisabled = SolidColor(Color.Transparent),
        backgroundFocused = normalBackground,
        backgroundPressed = normalBackground,
        backgroundHovered = normalBackground,
        content = normalContent,
        contentDisabled = retrieveColorOrUnspecified("Button.disabledText"),
        contentFocused = normalContent,
        contentPressed = normalContent,
        contentHovered = normalContent,
        border = normalBorder,
        borderDisabled = SolidColor(retrieveColorOrUnspecified("Button.disabledBorderColor")),
        borderFocused = SolidColor(retrieveColorOrUnspecified("Button.focusedBorderColor")),
        borderPressed = normalBorder,
        borderHovered = normalBorder,
    )

    return IntUiButtonStyle(
        colors = colors,
        metrics = IntUiButtonMetrics(
            cornerSize = retrieveArcAsCornerSize("Button.arc"),
            padding = PaddingValues(horizontal = 14.dp), // see DarculaButtonUI.HORIZONTAL_PADDING
            minSize = DpSize(DarculaUIUtil.MINIMUM_WIDTH.unscaled.dp, DarculaUIUtil.MINIMUM_HEIGHT.unscaled.dp),
            borderWidth = 1.dp,
        ),
    )
}

private val iconsBasePath
    get() = DirProvider().dir()

private fun readCheckboxStyle(iconData: IntelliJThemeIconData, svgLoader: SvgLoader): IntUiCheckboxStyle {
    val background = retrieveColorOrUnspecified("CheckBox.background")
    val textColor = retrieveColorOrUnspecified("CheckBox.foreground")
    val colors = IntUiCheckboxColors(
        checkboxBackground = background,
        checkboxBackgroundDisabled = background,
        checkboxBackgroundSelected = background,
        content = textColor,
        contentDisabled = retrieveColorOrUnspecified("CheckBox.disabledText"),
        contentSelected = textColor,
    )

    val baseIconPath = "${iconsBasePath}checkBox.svg"
    return IntUiCheckboxStyle(
        colors = colors,
        metrics = IntUiCheckboxMetrics(
            checkboxSize = DarculaCheckBoxUI().defaultIcon.let { DpSize(it.iconWidth.dp, it.iconHeight.dp) },
            checkboxCornerSize = CornerSize(3.dp), // See DarculaCheckBoxUI#drawCheckIcon
            outlineWidth = 3.dp, // See DarculaCheckBoxUI#drawCheckIcon
            iconContentGap = 5.dp, // See DarculaCheckBoxUI#textIconGap
        ),
        icons = IntUiCheckboxIcons(
            checkbox = ResourcePainterProvider(
                iconData.iconOverrides[baseIconPath] ?: baseIconPath,
                svgLoader,
                prefixTokensProvider = { state: CheckboxState ->
                    if (state.toggleableState == ToggleableState.Indeterminate) "Indeterminate" else ""
                },
            ),
        ),
    )
}

// Note: there isn't a chip spec, nor a chip UI, so we're deriving this from the
// styling defined in com.intellij.ide.ui.experimental.meetNewUi.MeetNewUiButton
// To note:
//  1. There is no real disabled state, we're making it sort of up
//  2. Chips can be used as buttons (see run configs) or as radio buttons (see MeetNewUi)
//  3. We also have a toggleable version because why not
private fun readChipStyle(): IntUiChipStyle {
    val normalBackground =
        Brush.verticalGradient(retrieveColorsOrUnspecified("Button.startBackground", "Button.endBackground"))
    val normalContent = retrieveColorOrUnspecified("Label.foreground")
    val normalBorder =
        Brush.verticalGradient(retrieveColorsOrUnspecified("Button.startBorderColor", "Button.endBorderColor"))
    val disabledBorder = SolidColor(retrieveColorOrUnspecified("Button.disabledBorderColor"))
    val selectedBorder = SolidColor(retrieveColorOrUnspecified("Component.focusColor"))

    val colors = IntUiChipColors(
        background = normalBackground,
        backgroundDisabled = normalBackground,
        backgroundFocused = normalBackground,
        backgroundPressed = normalBackground,
        backgroundHovered = normalBackground,
        backgroundSelected = normalBackground,
        backgroundSelectedDisabled = normalBackground,
        backgroundSelectedPressed = normalBackground,
        backgroundSelectedFocused = normalBackground,
        backgroundSelectedHovered = normalBackground,
        content = normalContent,
        contentDisabled = normalContent,
        contentFocused = normalContent,
        contentPressed = normalContent,
        contentHovered = normalContent,
        contentSelected = normalContent,
        contentSelectedDisabled = normalContent,
        contentSelectedPressed = normalContent,
        contentSelectedFocused = normalContent,
        contentSelectedHovered = normalContent,
        border = normalBorder,
        borderDisabled = disabledBorder,
        borderFocused = normalBorder,
        borderPressed = normalBorder,
        borderHovered = normalBorder,
        borderSelected = selectedBorder,
        borderSelectedDisabled = disabledBorder,
        borderSelectedPressed = selectedBorder,
        borderSelectedFocused = selectedBorder,
        borderSelectedHovered = selectedBorder,
    )
    return IntUiChipStyle(
        colors = colors,
        metrics = IntUiChipMetrics(
            cornerSize = CornerSize(6.dp),
            padding = PaddingValues(horizontal = 12.dp, vertical = 8.dp),
            borderWidth = 1.dp,
            borderWidthSelected = 2.dp,
        ),
    )
}

private suspend fun readDropdownStyle(
    iconData: IntelliJThemeIconData,
    svgLoader: SvgLoader,
    menuStyle: IntUiMenuStyle,
): IntUiDropdownStyle {
    val normalBackground = retrieveColorOrUnspecified("ComboBox.nonEditableBackground")
    val normalContent = retrieveColorOrUnspecified("ComboBox.foreground")
    val normalBorder = retrieveColorOrUnspecified("Component.borderColor")
    val focusedBorder = retrieveColorOrUnspecified("Component.focusedBorderColor")

    val colors = IntUiDropdownColors(
        background = normalBackground,
        backgroundDisabled = retrieveColorOrUnspecified("ComboBox.disabledBackground"),
        backgroundFocused = normalBackground,
        backgroundPressed = normalBackground,
        backgroundHovered = normalBackground,
        content = normalContent,
        contentDisabled = retrieveColorOrUnspecified("ComboBox.disabledForeground"),
        contentFocused = normalContent,
        contentPressed = normalContent,
        contentHovered = normalContent,
        border = normalBorder,
        borderDisabled = retrieveColorOrUnspecified("Component.disabledBorderColor"),
        borderFocused = focusedBorder,
        borderPressed = focusedBorder,
        borderHovered = normalBorder,
        iconTint = Color.Unspecified,
        iconTintDisabled = Color.Unspecified,
        iconTintFocused = Color.Unspecified,
        iconTintPressed = Color.Unspecified,
        iconTintHovered = Color.Unspecified,
    )

    val baseIconPath = "${iconsBasePath}general/chevron-down.svg"
    val arrowWidth = DarculaUIUtil.ARROW_BUTTON_WIDTH.unscaled.dp
    return IntUiDropdownStyle(
        colors = colors,
        metrics = IntUiDropdownMetrics(
            arrowMinSize = DpSize(arrowWidth, DarculaUIUtil.MINIMUM_HEIGHT.unscaled.dp),
            minSize = DpSize(
                DarculaUIUtil.MINIMUM_WIDTH.unscaled.dp + arrowWidth,
                DarculaUIUtil.MINIMUM_HEIGHT.unscaled.dp
            ),
            cornerSize = CornerSize(DarculaUIUtil.COMPONENT_ARC.unscaled.dp),
            contentPadding = retrieveInsetsAsPaddingValues("ComboBox.padding"),
            borderWidth = DarculaUIUtil.BW.unscaled.dp,
        ),
        icons = IntUiDropdownIcons(
            chevronDown = ResourcePainterProvider(
                iconData.iconOverrides[baseIconPath] ?: baseIconPath,
                svgLoader,
            )
        ),
        textStyle = retrieveTextStyle("ComboBox.font"),
        menuStyle = menuStyle,
    )
}

private fun readGroupHeaderStyle() = IntUiGroupHeaderStyle(
    colors = IntUiGroupHeaderColors(
        content = retrieveColorOrUnspecified("Separator.foreground"),
        divider = retrieveColorOrUnspecified("Separator.separatorColor"),
    ),
    metrics = IntUiGroupHeaderMetrics(
        dividerThickness = 1.dp, // see DarculaSeparatorUI
        indent = 1.dp, // see DarculaSeparatorUI
    )
)

private fun readHorizontalProgressBarStyle() = IntUiHorizontalProgressBarStyle(
    colors = IntUiHorizontalProgressBarColors(
        track = retrieveColorOrUnspecified("ProgressBar.trackColor"),
        progress = retrieveColorOrUnspecified("ProgressBar.progressColor"),
        indeterminateBase = retrieveColorOrUnspecified("ProgressBar.indeterminateStartColor"),
        indeterminateHighlight = retrieveColorOrUnspecified("ProgressBar.indeterminateEndColor"),
    ),
    metrics = IntUiHorizontalProgressBarMetrics(
        cornerSize = CornerSize(100),
        minHeight = 4.dp, // See DarculaProgressBarUI.DEFAULT_WIDTH
        // See DarculaProgressBarUI.CYCLE_TIME_DEFAULT, DarculaProgressBarUI.REPAINT_INTERVAL_DEFAULT,
        // and the "step" constant in DarculaProgressBarUI#paintIndeterminate
        indeterminateHighlightWidth = (800 / 50 * 6).dp,
    ),
    indeterminateCycleDuration = 800.milliseconds, // See DarculaProgressBarUI.CYCLE_TIME_DEFAULT
)

private suspend fun readLabelledTextFieldStyle(inputFieldStyle: InputFieldStyle): IntUiLabelledTextFieldStyle {
    val colors = IntUiLabelledTextFieldColors(
        background = inputFieldStyle.colors.background,
        backgroundDisabled = inputFieldStyle.colors.backgroundDisabled,
        backgroundFocused = inputFieldStyle.colors.backgroundFocused,
        backgroundPressed = inputFieldStyle.colors.backgroundPressed,
        backgroundHovered = inputFieldStyle.colors.backgroundHovered,
        content = inputFieldStyle.colors.content,
        contentDisabled = inputFieldStyle.colors.contentDisabled,
        contentFocused = inputFieldStyle.colors.contentFocused,
        contentPressed = inputFieldStyle.colors.contentPressed,
        contentHovered = inputFieldStyle.colors.contentHovered,
        border = inputFieldStyle.colors.border,
        borderDisabled = inputFieldStyle.colors.borderDisabled,
        borderFocused = inputFieldStyle.colors.borderFocused,
        borderPressed = inputFieldStyle.colors.borderPressed,
        borderHovered = inputFieldStyle.colors.borderHovered,
        cursor = inputFieldStyle.colors.cursor,
        cursorDisabled = inputFieldStyle.colors.cursorDisabled,
        cursorFocused = inputFieldStyle.colors.cursorFocused,
        cursorPressed = inputFieldStyle.colors.cursorPressed,
        cursorHovered = inputFieldStyle.colors.cursorHovered,
        placeholder = retrieveColorOrUnspecified("Label.infoForeground"),
        label = retrieveColorOrUnspecified("Label.foreground"),
        hint = StatusText.DEFAULT_ATTRIBUTES.fgColor.toComposeColor(),
    )

    val labelTextStyle = retrieveTextStyle("Label.font")
    return IntUiLabelledTextFieldStyle(
        colors = colors,
        metrics = IntUiLabelledTextFieldMetrics(
            cornerSize = inputFieldStyle.metrics.cornerSize,
            contentPadding = inputFieldStyle.metrics.contentPadding,
            minSize = inputFieldStyle.metrics.minSize,
            borderWidth = inputFieldStyle.metrics.borderWidth,
            labelSpacing = 6.dp,
            hintSpacing = 6.dp,
        ),
        textStyle = inputFieldStyle.textStyle,
        textStyles = IntUiLabelledTextFieldTextStyles(
            label = labelTextStyle,
            hint = labelTextStyle.copy(fontSize = labelTextStyle.fontSize - 1f),
        )
    )
}

private operator fun TextUnit.minus(other: Float) =
    when {
        isSp -> TextUnit(value - other, type)
        isEm -> TextUnit(value - other, type)
        else -> this
    }

private suspend fun readLinkStyle(iconData: IntelliJThemeIconData, svgLoader: SvgLoader): IntUiLinkStyle {
    val normalContent = retrieveColorOrUnspecified("Link.activeForeground").takeOrElse { retrieveColorOrUnspecified("Link.activeForeground") }

    val colors = IntUiLinkColors(
        content = normalContent,
        contentDisabled = retrieveColorOrUnspecified("Link.disabledForeground").takeOrElse { retrieveColorOrUnspecified("Label.disabledForeground") },
        contentFocused = normalContent,
        contentPressed = retrieveColorOrUnspecified("Link.pressedForeground").takeOrElse { retrieveColorOrUnspecified("link.pressed.foreground") },
        contentHovered = retrieveColorOrUnspecified("Link.hoverForeground").takeOrElse { retrieveColorOrUnspecified("link.hover.foreground") },
        contentVisited = retrieveColorOrUnspecified("Link.visitedForeground").takeOrElse { retrieveColorOrUnspecified("link.visited.foreground") },
    )

    val chevronBaseIconPath = "${iconsBasePath}general/chevron-down.svg"
    val externalLinkBaseIconPath = "${iconsBasePath}ide/external_link_arrow.svg"

    val textStyle = retrieveTextStyle("Label.font")

    return IntUiLinkStyle(
        colors = colors,
        metrics = IntUiLinkMetrics(
            focusHaloCornerSize = CornerSize(Registry.intValue("ide.link.button.focus.round.arc", 4).dp),
            textIconGap = 4.dp,
            iconSize = DpSize.Unspecified
        ),
        icons = IntUiLinkIcons(
            dropdownChevron = ResourcePainterProvider(
                iconData.iconOverrides[chevronBaseIconPath] ?: chevronBaseIconPath,
                svgLoader,
            ),
            externalLink = ResourcePainterProvider(
                iconData.iconOverrides[externalLinkBaseIconPath] ?: externalLinkBaseIconPath,
                svgLoader,
            ),
        ),
        textStyles = IntUiLinkTextStyles(
            normal = textStyle,
            disabled = textStyle,
            focused = textStyle,
            pressed = textStyle,
            hovered = textStyle,
            visited = textStyle,
        )
    )
}

private fun readMenuStyle(iconData: IntelliJThemeIconData, svgLoader: SvgLoader): IntUiMenuStyle {
    val backgroundSelected = retrieveColorOrUnspecified("MenuItem.selectionBackground")
    val foregroundSelected = retrieveColorOrUnspecified("MenuItem.selectionForeground")

    val colors = IntUiMenuColors(
        background = retrieveColorOrUnspecified("PopupMenu.background"),
        border = retrieveColorOrUnspecified("Popup.borderColor").takeOrElse { retrieveColorOrUnspecified("Popup.Border.color") },
        shadow = Color.Black.copy(alpha = .6f),
        itemColors = IntUiMenuItemColors(
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
            separator = retrieveColorOrUnspecified("Menu.separatorColor"),
        )
    )

    val chevronBaseIconPath = "${iconsBasePath}general/chevron-down.svg"
    return IntUiMenuStyle(
        colors = colors,
        metrics = IntUiMenuMetrics(
            cornerSize = CornerSize(IdeaPopupMenuUI.CORNER_RADIUS.unscaled.dp),
            menuMargin = PaddingValues(0.dp),
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 12.dp),
            offset = DpOffset(0.dp, 2.dp),
            shadowSize = 12.dp,
            borderWidth = retrieveIntAsDp("Popup.borderWidth"),
            itemMetrics = IntUiMenuItemMetrics(
                selectionCornerSize = CornerSize(JBUI.CurrentTheme.PopupMenu.Selection.ARC.unscaled.dp),
                outerPadding = PaddingValues(horizontal = 6.dp),
                contentPadding = PaddingValues(horizontal = 10.dp, vertical = 1.dp),
                separatorPadding = PaddingValues(
                    horizontal = retrieveIntAsDp("PopupMenuSeparator.withToEdge"),
                    vertical = retrieveIntAsDp("PopupMenuSeparator.stripeIndent"),
                ),
                separatorThickness = retrieveIntAsDp("PopupMenuSeparator.stripeWidth")
            ),
            submenuMetrics = IntUiSubmenuMetrics(
                offset = DpOffset(0.dp, (-8).dp),
            ),
        ),
        icons = IntUiMenuIcons(
            submenuChevron = ResourcePainterProvider(
                iconData.iconOverrides[chevronBaseIconPath] ?: chevronBaseIconPath,
                svgLoader,
            )
        )
    )
}

private fun readRadioButtonStyle(iconData: IntelliJThemeIconData, svgLoader: SvgLoader): IntUiRadioButtonStyle {
    val normalContent = retrieveColorOrUnspecified("RadioButton.foreground")
    val disabledContent = retrieveColorOrUnspecified("RadioButton.disabledText")
    val colors = IntUiRadioButtonColors(
        content = normalContent,
        contentHovered = normalContent,
        contentDisabled = disabledContent,
        contentSelected = normalContent,
        contentSelectedHovered = normalContent,
        contentSelectedDisabled = disabledContent,
    )

    val baseIconPath = "${iconsBasePath}darcula/radio.svg"
    return IntUiRadioButtonStyle(
        colors = colors,
        metrics = IntUiRadioButtonMetrics(
            radioButtonSize = DpSize(19.dp, 19.dp),
            iconContentGap = retrieveIntAsDp("RadioButton.textIconGap"),
        ),
        icons = IntUiRadioButtonIcons(
            radioButton = ResourcePainterProvider(
                iconData.iconOverrides[baseIconPath] ?: baseIconPath,
                svgLoader,
            )
        )
    )
}

private fun readScrollbarStyle(isDark: Boolean) = IntUiScrollbarStyle(
    colors = IntUiScrollbarColors(
        // See ScrollBarPainter.THUMB_BACKGROUND
        thumbBackground = retrieveColorOrUnspecified("ScrollBar.Mac.Transparent.thumbColor")
            .takeOrElse { if (isDark) Color(0x00000000) else Color(0x00808080) },
        // See ScrollBarPainter.THUMB_HOVERED_BACKGROUND
        thumbBackgroundHovered = retrieveColorOrUnspecified("ScrollBar.Mac.Transparent.hoverThumbColor")
            .takeOrElse { if (isDark) Color(0x00000000) else Color(0x00808080) },
    ),
    metrics = IntUiScrollbarMetrics(
        thumbCornerSize = CornerSize(100),
        thumbThickness = 8.dp,
        minThumbLength = 16.dp,
        trackPadding = PaddingValues(start = 7.dp, end = 3.dp),
    ),
    hoverDuration = 300.milliseconds,
)

private fun readTextAreaStyle(inputFieldStyle: InputFieldStyle): IntUiTextAreaStyle {
    val colors = IntUiTextAreaColors(
        background = inputFieldStyle.colors.background,
        backgroundDisabled = inputFieldStyle.colors.backgroundDisabled,
        backgroundFocused = inputFieldStyle.colors.backgroundFocused,
        backgroundPressed = inputFieldStyle.colors.backgroundPressed,
        backgroundHovered = inputFieldStyle.colors.backgroundHovered,
        content = inputFieldStyle.colors.content,
        contentDisabled = inputFieldStyle.colors.contentDisabled,
        contentFocused = inputFieldStyle.colors.contentFocused,
        contentPressed = inputFieldStyle.colors.contentPressed,
        contentHovered = inputFieldStyle.colors.contentHovered,
        border = inputFieldStyle.colors.border,
        borderDisabled = inputFieldStyle.colors.borderDisabled,
        borderFocused = inputFieldStyle.colors.borderFocused,
        borderPressed = inputFieldStyle.colors.borderPressed,
        borderHovered = inputFieldStyle.colors.borderHovered,
        cursor = inputFieldStyle.colors.cursor,
        cursorDisabled = inputFieldStyle.colors.cursorDisabled,
        cursorFocused = inputFieldStyle.colors.cursorFocused,
        cursorPressed = inputFieldStyle.colors.cursorPressed,
        cursorHovered = inputFieldStyle.colors.cursorHovered,
        placeholder =,
        hintContent =,
        hintContentDisabled =,
    )

    return IntUiTextAreaStyle(
        colors = colors,
        metrics = IntUiTextAreaMetrics(
            cornerSize =,
            contentPadding =,
            minSize =,
            borderWidth =,
        ),
        textStyle =,
        hintTextStyle =,
    )
}

private suspend fun readTextFieldStyle(): IntUiTextFieldStyle {
    val colors = IntUiTextFieldColors(
        background =,
        backgroundDisabled =,
        backgroundFocused =,
        backgroundPressed =,
        backgroundHovered =,
        content =,
        contentDisabled =,
        contentFocused =,
        contentPressed =,
        contentHovered =,
        border =,
        borderDisabled =,
        borderFocused =,
        borderPressed =,
        borderHovered =,
        cursor =,
        cursorDisabled =,
        cursorFocused =,
        cursorPressed =,
        cursorHovered =,
        placeholder =,
    )

    return IntUiTextFieldStyle(
        colors = colors,
        metrics = IntUiTextFieldMetrics(
            cornerSize = CornerSize(DarculaUIUtil.COMPONENT_ARC.unscaled.dp),
            contentPadding = PaddingValues(horizontal = 9.dp, vertical = 6.dp),
            minSize = DpSize(DarculaUIUtil.MINIMUM_WIDTH.unscaled.dp, DarculaUIUtil.MINIMUM_HEIGHT.unscaled.dp),
            borderWidth = DarculaUIUtil.BW.unscaled.dp,
        ),
        textStyle =,
    )
}

private fun readLazyTreeStyle(iconData: IntelliJThemeIconData, svgLoader: SvgLoader): IntUiLazyTreeStyle {
    val colors = IntUiLazyTreeColors(
        content =,
        contentFocused =,
        contentSelected =,
        contentSelectedFocused =,
        elementBackgroundFocused =,
        elementBackgroundSelected =,
        elementBackgroundSelectedFocused =,
        chevronTint =,
        chevronTintSelected =,
        chevronTintFocused =,
        chevronTintSelectedFocused =,
    )

    return IntUiLazyTreeStyle(
        colors = colors,
        metrics = IntUiLazyTreeMetrics(
            indentSize =,
            elementBackgroundCornerSize =,
            elementPadding =,
            elementContentPadding =,
            elementMinHeight =,
            chevronContentGap =,
        ),
        icons = IntUiLazyTreeIcons(nodeChevron =),
    )
}

private fun readDefaultTabStyle(): IntUiTabStyle {
    val colors = IntUiTabColors(
        background =,
        backgroundDisabled =,
        backgroundFocused =,
        backgroundPressed =,
        backgroundHovered =,
        backgroundSelected =,
        content =,
        contentDisabled =,
        contentFocused =,
        contentPressed =,
        contentHovered =,
        contentSelected =,
        underline =,
        underlineDisabled =,
        underlineFocused =,
        underlinePressed =,
        underlineHovered =,
        underlineSelected =,
    )

    return IntUiTabStyle(
        colors = colors,
        metrics = IntUiTabMetrics(
            underlineThickness =,
            tabPadding =,
            closeContentGap =,
            tabHeight =
        ),
        icons = IntUiTabIcons(close =),
        contentAlpha = IntUiTabContentAlpha(
            iconNormal =,
            iconDisabled =,
            iconFocused =,
            iconPressed =,
            iconHovered =,
            iconSelected =,
            labelNormal =,
            labelDisabled =,
            labelFocused =,
            labelPressed =,
            labelHovered =,
            labelSelected =,
        ),
    )
}

private fun readEditorTabStyle(): IntUiTabStyle {
    val colors = IntUiTabColors(
        background =,
        backgroundDisabled =,
        backgroundFocused =,
        backgroundPressed =,
        backgroundHovered =,
        backgroundSelected =,
        content =,
        contentDisabled =,
        contentFocused =,
        contentPressed =,
        contentHovered =,
        contentSelected =,
        underline =,
        underlineDisabled =,
        underlineFocused =,
        underlinePressed =,
        underlineHovered =,
        underlineSelected =,
    )

    return IntUiTabStyle(
        colors = colors,
        metrics = IntUiTabMetrics(
            underlineThickness =,
            tabPadding =,
            closeContentGap =,
            tabHeight =
        ),
        icons = IntUiTabIcons(close =),
        contentAlpha = IntUiTabContentAlpha(
            iconNormal =,
            iconDisabled =,
            iconFocused =,
            iconPressed =,
            iconHovered =,
            iconSelected =,
            labelNormal =,
            labelDisabled =,
            labelFocused =,
            labelPressed =,
            labelHovered =,
            labelSelected =,
        ),
    )
}
