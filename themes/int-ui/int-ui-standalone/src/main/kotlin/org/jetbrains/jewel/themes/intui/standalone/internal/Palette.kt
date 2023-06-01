package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.internal.AreaColor
import org.jetbrains.jewel.internal.IntelliJColors

enum class IntUiPaletteKind {
    GREY, BLUE, GREEN, RED, YELLOW, ORANGE, PURPLE, TEAL
}

abstract class IntUiPalette(
    private val kind: IntUiPaletteKind,
    private val colors: List<Color>,
    private val requiredColorCount: Int
) {

    fun kind() = kind

    fun color(index: Int) = colors[index - 1]

    abstract fun primary(): Color

    init {
        require(colors.size == requiredColorCount) {
            "Expected $requiredColorCount colors for $kind palette, but got ${colors.size}"
        }
    }
}

abstract class GreyIntUiPalette(
    colors: List<Color>,
    requiredColorCount: Int
) : IntUiPalette(IntUiPaletteKind.GREY, colors, requiredColorCount) {

    abstract fun mainBackground(): Color

    abstract fun secondaryBackground(): Color

    abstract fun darkBackground(): Color

    abstract fun separator(): Color

    abstract fun inactiveSelection(): Color

    abstract fun disabledText(): Color

    abstract fun disabledBackground(): Color

    abstract fun placeholderText(): Color

    abstract fun iconStrokeOnDark(): Color

    abstract fun textOnDark(): Color

    abstract fun outlineIconStroke(): Color

    abstract fun iconStroke(): Color

    abstract fun iconFill(): Color

    abstract fun primaryText(): Color

    abstract fun secondaryText(): Color

    abstract fun tertiaryText(): Color
}

abstract class BlueIntUiPalette(
    colors: List<Color>,
    requiredColorCount: Int
) : IntUiPalette(IntUiPaletteKind.BLUE, colors, requiredColorCount) {

    abstract fun buttonDefault(): Color

    abstract fun buttonHovered(): Color

    abstract fun buttonPressed(): Color

    abstract fun outlineIconStroke(): Color

    abstract fun iconStroke(): Color

    abstract fun iconFill(): Color

    abstract fun activeSelection(): Color

    abstract fun bannerFill(): Color

    abstract fun bannerStroke(): Color
}

abstract class GreenIntUiPalette(
    colors: List<Color>,
    requiredColorCount: Int
) : IntUiPalette(IntUiPaletteKind.GREEN, colors, requiredColorCount) {

    abstract fun buttonDefault(): Color

    abstract fun buttonHovered(): Color

    abstract fun buttonPressed(): Color

    abstract fun outlineIconStroke(): Color

    abstract fun iconStroke(): Color

    abstract fun iconFill(): Color

    abstract fun bannerFill(): Color

    abstract fun bannerStroke(): Color
}

abstract class RedIntUiPalette(
    colors: List<Color>,
    requiredColorCount: Int
) : IntUiPalette(IntUiPaletteKind.RED, colors, requiredColorCount) {

    abstract fun buttonDefault(): Color

    abstract fun buttonHovered(): Color

    abstract fun buttonPressed(): Color

    abstract fun outlineIconStroke(): Color

    abstract fun iconStroke(): Color

    abstract fun iconFill(): Color

    abstract fun bannerFill(): Color

    abstract fun bannerStroke(): Color
}

abstract class YellowIntUiPalette(
    colors: List<Color>,
    requiredColorCount: Int
) : IntUiPalette(IntUiPaletteKind.YELLOW, colors, requiredColorCount) {

    abstract fun outlineIconStroke(): Color

    abstract fun iconStroke(): Color

    abstract fun iconFill(): Color

    abstract fun bannerFill(): Color

    abstract fun bannerStroke(): Color
}

abstract class OrangeIntUiPalette(
    colors: List<Color>,
    requiredColorCount: Int
) : IntUiPalette(IntUiPaletteKind.ORANGE, colors, requiredColorCount) {

    abstract fun outlineIconStroke(): Color

    abstract fun iconStroke(): Color

    abstract fun iconFill(): Color
}

abstract class PurpleIntUiPalette(
    colors: List<Color>,
    requiredColorCount: Int
) : IntUiPalette(IntUiPaletteKind.PURPLE, colors, requiredColorCount) {

    abstract fun outlineIconStroke(): Color

    abstract fun iconStroke(): Color

    abstract fun iconFill(): Color
}

abstract class TealIntUiPalette(
    colors: List<Color>,
    requiredColorCount: Int
) : IntUiPalette(IntUiPaletteKind.TEAL, colors, requiredColorCount) {

    abstract fun outlineIconStroke(): Color

    abstract fun iconStroke(): Color

    abstract fun iconFill(): Color
}

class IntUiPalettes(
    private val grey: GreyIntUiPalette,
    private val blue: BlueIntUiPalette,
    private val green: GreenIntUiPalette,
    private val red: RedIntUiPalette,
    private val yellow: YellowIntUiPalette,
    private val orange: OrangeIntUiPalette,
    private val purple: PurpleIntUiPalette,
    private val teal: TealIntUiPalette,
    private val isLight: Boolean
) {

    fun grey() = grey

    fun blue() = blue

    fun green() = green

    fun red() = red

    fun yellow() = yellow

    fun orange() = orange

    fun purple() = purple

    fun teal() = teal

    fun isLight() = isLight

    fun toIntelliJColor(): IntelliJColors {
        return IntelliJColors(
            panelArea = AreaColor(
                background = grey().secondaryBackground(),
                endBackground = Color.Unspecified,
                foreground = grey().primaryText(),
                stroke = grey().iconStroke()
            ),
            contentArea = AreaColor(
                background = grey().mainBackground(),
                endBackground = Color.Unspecified,
                foreground = grey().primaryText(),
                stroke = grey().iconStroke()
            ),
            darkArea = AreaColor(
                background = grey().darkBackground(),
                endBackground = Color.Unspecified,
                foreground = grey().textOnDark(),
                stroke = grey().iconStrokeOnDark()
            ),
            disableArea = AreaColor(
                background = grey().disabledBackground(),
                endBackground = Color.Unspecified,
                foreground = grey().disabledText(),
                stroke = grey().iconStroke()
            ),
            separator = grey().separator(),
            isLight = isLight()
        )
    }
}

internal val LocalIntUiPalettes = staticCompositionLocalOf<IntUiPalettes> {
    error("No IntUiPalettes provided")
}
