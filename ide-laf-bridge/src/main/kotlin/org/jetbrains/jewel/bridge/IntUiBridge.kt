package org.jetbrains.jewel.bridge

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.intellij.ide.ui.laf.darcula.DarculaUIUtil
import com.intellij.ide.ui.laf.darcula.ui.DarculaCheckBoxUI
import com.intellij.openapi.diagnostic.Logger
import com.intellij.ui.JBColor
import com.intellij.util.ui.DirProvider
import org.jetbrains.jewel.CheckboxState
import org.jetbrains.jewel.IntelliJComponentStyling
import org.jetbrains.jewel.IntelliJThemeIconData
import org.jetbrains.jewel.SvgLoader
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
import javax.swing.UIManager

private val logger = Logger.getInstance("JewelIntUiBridge")

internal val uiDefaults
    get() = UIManager.getDefaults()

internal suspend fun createBridgeIntUiDefinition(): IntUiThemeDefinition {
    val isDark = !JBColor.isBright()

    logger.debug("Obtaining Int UI theme definition from Swing...")

    return IntUiThemeDefinition(
        isDark = isDark,
        globalColors = BridgeGlobalColors.readFromLaF(),
        colorPalette = BridgeThemeColorPalette.readFromLaF(),
        iconData = BridgeIconData.readFromLaF(),
        metrics = BridgeGlobalMetrics.readFromLaF(),
        defaultTextStyle = readTextStyle(),
    )
}

private suspend fun readTextStyle(): TextStyle {
    val baseColor = retrieveColorOrUnspecified("Label.foreground")
    return retrieveFont("Label.font", color = baseColor)
}

// Hardcoded values come from DarculaButtonUI (they may be derived from multiple values)
// private fun readButtonDefaults(): ButtonDefaults {
//    val backgroundBrush =
//        Brush.verticalGradient(retrieveColorsOrUnspecified("Button.startBackground", "Button.endBackground"))
//    val contentColor = retrieveColorOrUnspecified("Button.foreground")
//    val borderStroke = Stroke(
//        width = 1.dp,
//        brush = Brush.verticalGradient(retrieveColorsOrUnspecified("Button.startBorderColor", "Button.endBorderColor")),
//        alignment = Stroke.Alignment.Center
//    )
//    val haloStroke = Stroke(
//        width = retrieveIntAsDp("Component.focusWidth"),
//        color = retrieveColorOrUnspecified("Component.focusColor"),
//        alignment = Stroke.Alignment.Outside
//    )
//
//    val disabledContentColor = retrieveColorOrUnspecified("Button.disabledText")
//    val disabledBorderStroke = Stroke(
//        width = 1.dp,
//        brush = SolidColor(retrieveColorOrUnspecified("Button.disabledBorderColor")),
//        alignment = Stroke.Alignment.Center
//    )
//
//    return androidx.compose.material.ButtonDefaults(
//        shape = RoundedCornerShape(retrieveIntAsDp("Button.arc") * 2), // Swing arcs are the diameter
//        contentPadding = PaddingValues(horizontal = 16.dp),
//        minWidth = 72.dp,
//        minHeight = 24.dp, // From DarculaUIUtil#MINIMUM_HEIGHT
//        outlinedButtonColors = buttonColors(
//            backgroundBrush = backgroundBrush,
//            contentColor = contentColor,
//            borderStroke = borderStroke,
//            disabledBackgroundBrush = transparentBrush,
//            disabledContentColor = disabledContentColor,
//            disabledBorderStroke = disabledBorderStroke,
//            hoveredBackgroundBrush = backgroundBrush,
//            hoveredContentColor = contentColor,
//            hoveredBorderStroke = borderStroke,
//            pressedBackgroundBrush = backgroundBrush,
//            pressedContentColor = contentColor,
//            pressedBorderStroke = borderStroke,
//            focusedBackgroundBrush = backgroundBrush,
//            focusedContentColor = contentColor,
//            focusedBorderStroke = borderStroke,
//            focusHaloStroke = haloStroke
//        ),
//        primaryButtonColors = buttonColors(
//            backgroundBrush = defaultBackgroundBrush,
//            contentColor = defaultContentColor,
//            borderStroke = defaultBorderStroke,
//            disabledBackgroundBrush = transparentBrush,
//            disabledContentColor = disabledContentColor,
//            disabledBorderStroke = disabledBorderStroke,
//            hoveredBackgroundBrush = defaultBackgroundBrush,
//            hoveredContentColor = defaultContentColor,
//            hoveredBorderStroke = defaultBorderStroke,
//            pressedBackgroundBrush = defaultBackgroundBrush,
//            pressedContentColor = defaultContentColor,
//            pressedBorderStroke = defaultBorderStroke,
//            focusedBackgroundBrush = defaultBackgroundBrush,
//            focusedContentColor = defaultContentColor,
//            focusedBorderStroke = defaultBorderStroke,
//            focusHaloStroke = defaultHaloStroke
//        ),
//    )
// }
//
// private fun readCheckboxDefaults() = androidx.compose.material.CheckboxDefaults(
//    colors = checkBoxColors(
//        checkmarkTintColor = Color.Unspecified, // There is no tint for the checkmark icon
//        contentColor = retrieveColorOrUnspecified("Checkbox.foreground"),
//        uncheckedBackground = retrieveColorOrUnspecified("Checkbox.background"),
//        uncheckedStroke =,
//        uncheckedFocusedStroke =,
//        uncheckedFocusHoloStroke =,
//        uncheckedErrorHoloStroke =,
//        uncheckedHoveredBackground = retrieveColorOrUnspecified("Checkbox.background"),
//        uncheckedHoveredStroke =,
//        uncheckedDisabledBackground = retrieveColorOrUnspecified("Checkbox.background"),
//        uncheckedDisabledStroke =,
//        checkedBackground = retrieveColorOrUnspecified("Checkbox.background"),
//        checkedStroke =,
//        checkedFocusedStroke =,
//        checkedFocusHoloStroke =,
//        checkedErrorHoloStroke =,
//        checkedHoveredBackground = retrieveColorOrUnspecified("Checkbox.background"),
//        checkedHoveredStroke =,
//        checkedDisabledBackground = retrieveColorOrUnspecified("Checkbox.background"),
//        checkedDisabledStroke =,
//        disabledCheckmarkColor =,
//        disabledTextColor =,
//    ),
//    shape = RoundedCornerShape(),
//    width =,
//    height =,
//    contentSpacing =,
//    textStyle =,
//    checkMarkOn =,
//    checkMarkOff =,
//    checkMarkIndeterminate =,
// )

internal fun createSwingIntUiComponentStyling(theme: IntUiThemeDefinition, svgLoader: SvgLoader) =
    IntelliJComponentStyling(
        defaultButtonStyle = readDefaultButtonStyle(),
        outlinedButtonStyle = readOutlinedButtonStyle(),
        checkboxStyle = readCheckboxStyle(theme.iconData, svgLoader),
        chipStyle = readChipStyle(),
        dropdownStyle = readDropdownStyle(theme, svgLoader),
        groupHeaderStyle = readGroupHeaderStyle(theme, svgLoader),
        labelledTextFieldStyle = readLabelledTextFieldStyle(theme, svgLoader),
        linkStyle = readLinkStyle(theme, svgLoader),
        menuStyle = readMenuStyle(theme, svgLoader),
        horizontalProgressBarStyle = readHorizontalProgressBarStyle(theme, svgLoader),
        radioButtonStyle = readRadioButtonStyle(theme, svgLoader),
        scrollbarStyle = readScrollbarStyle(theme, svgLoader),
        textAreaStyle = readTextAreaStyle(theme, svgLoader),
        textFieldStyle = readTextFieldStyle(theme, svgLoader),
        lazyTreeStyle = readLazyTreeStyle(theme, svgLoader),
        defaultTabStyle = readDefaultTabStyle(theme, svgLoader),
        editorTabStyle = readEditorTabStyle(theme, svgLoader),
    )

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
            cornerSize = CornerSize(retrieveIntAsDp("Button.default.arc") * 2),
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
            cornerSize = CornerSize(retrieveIntAsDp("Button.arc") * 2),
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
    val iconPath = iconData.iconOverrides[baseIconPath] ?: baseIconPath

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
                iconPath,
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
