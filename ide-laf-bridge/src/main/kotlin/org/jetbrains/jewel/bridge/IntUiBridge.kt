package org.jetbrains.jewel.bridge

import androidx.compose.ui.text.TextStyle
import com.intellij.openapi.diagnostic.Logger
import com.intellij.ui.JBColor
import org.jetbrains.jewel.IntelliJComponentStyling
import org.jetbrains.jewel.themes.intui.core.IntUiThemeDefinition
import org.jetbrains.jewel.themes.intui.core.IntelliJSvgLoader
import org.jetbrains.jewel.themes.intui.standalone.IntUiTheme
import javax.swing.UIManager

private val logger = Logger.getInstance("JewelIntUiBridge")

internal val uiDefaults
    get() = UIManager.getDefaults()

internal fun createBridgeIntUiDefinition(): IntUiThemeDefinition {
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

private fun readTextStyle(): TextStyle {
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
//    val defaultBackgroundBrush =
//        Brush.verticalGradient(
//            retrieveColorsOrUnspecified(
//                "Button.default.startBackground",
//                "Button.default.endBackground"
//            )
//        )
//    val defaultContentColor = retrieveColorOrUnspecified("Button.default.foreground")
//    val defaultBorderStroke = Stroke(
//        width = 1.dp,
//        brush = Brush.verticalGradient(
//            retrieveColorsOrUnspecified(
//                "Button.default.startBorderColor",
//                "Button.default.endBorderColor"
//            )
//        ),
//        alignment = Stroke.Alignment.Center
//    )
//    val defaultHaloStroke = Stroke(
//        width = retrieveIntAsDp("Component.focusWidth"),
//        color = retrieveColorOrUnspecified("Button.default.focusColor"),
//        alignment = Stroke.Alignment.Outside
//    )
//
//    val transparentBrush = SolidColor(Color.Transparent)
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

internal fun createSwingLaFComponentStyling(theme: IntUiThemeDefinition, svgLoader: IntelliJSvgLoader): IntelliJComponentStyling =
    if (theme.isDark) {
        IntUiTheme.darkComponentStyling(svgLoader)
    } else {
        IntUiTheme.lightComponentStyling(svgLoader)
    }
