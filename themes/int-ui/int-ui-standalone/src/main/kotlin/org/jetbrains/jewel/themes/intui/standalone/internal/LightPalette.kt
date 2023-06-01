package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.ui.graphics.Color

class LightGeryPalette(
    colors: List<Color> = listOf(
        /**
         * Primary text
         */
        /**
         * Primary text
         */
        Color(0xFF000000),

        /**
         * Dark background
         */

        /**
         * Dark background
         */
        Color(0xFF27282E),
        Color(0xFF383A42),
        Color(0xFF494B57),
        Color(0xFF5A5D6B),

        /**
         * Secondary text
         * General icons: Stroke
         * Outline icons
         */

        /**
         * Secondary text
         * General icons: Stroke
         * Outline icons
         */
        Color(0xFF6C707E),

        /**
         * Tertiary text
         */

        /**
         * Tertiary text
         */
        Color(0xFF818594),

        /**
         * Disabled text & placeholders Icons & shortcuts on dark bg
         * Diff removed: Stripe mark
         */

        /**
         * Disabled text & placeholders Icons & shortcuts on dark bg
         * Diff removed: Stripe mark
         */
        Color(0xFFA8ADBD),
        Color(0xFFC9CCD6),

        /**
         * Diff removed: Word
         * Diff removed: Stroke
         */

        /**
         * Diff removed: Word
         * Diff removed: Stroke
         */
        Color(0xFFD3D5DB),

        /**
         * Inactive selection
         */

        /**
         * Inactive selection
         */
        Color(0xFFDFE1E5),

        /**
         * Lines & separators
         * General icons: Fill
         */

        /**
         * Lines & separators
         * General icons: Fill
         */
        Color(0xFFEBECF0),

        /**
         * Secondary background (tool windows)
         * Diff removed: Fill
         */

        /**
         * Secondary background (tool windows)
         * Diff removed: Fill
         */
        Color(0xFFF7F8FA),

        /**
         * Main background (light)
         */

        /**
         * Main background (light)
         */
        Color(0xFFFFFFFF)
    )
) : GreyIntUiPalette(colors = colors, requiredColorCount = 14) {

    override fun mainBackground(): Color = color(14)

    override fun secondaryBackground(): Color = color(13)

    override fun darkBackground(): Color = color(2)

    override fun separator(): Color = color(12)

    override fun inactiveSelection(): Color = color(11)

    override fun disabledText(): Color = color(8)

    override fun disabledBackground(): Color = color(12)

    override fun placeholderText(): Color = color(8)

    override fun iconStrokeOnDark(): Color = color(8)

    override fun textOnDark(): Color = color(14)

    override fun outlineIconStroke(): Color = color(6)

    override fun iconStroke(): Color = color(6)

    override fun iconFill(): Color = color(12)

    override fun primaryText(): Color = color(1)

    override fun secondaryText(): Color = color(6)

    override fun tertiaryText(): Color = color(7)

    override fun primary(): Color = color(1)
}

class LightBluePalette(
    colors: List<Color> = listOf(
        Color(0xFF2E55A3),

        /**
         * Link
         * Button: Pressed
         */

        /**
         * Link
         * Button: Pressed
         */
        Color(0xFF315FBD),

        /**
         * Button: Hovered
         */

        /**
         * Button: Hovered
         */
        Color(0xFF3369D6),

        /**
         * Button: Default
         * General icons: Fill
         * Outline icons
         */

        /**
         * Button: Default
         * General icons: Fill
         * Outline icons
         */
        Color(0xFF3574F0),

        /**
         * Solid icons
         */

        /**
         * Solid icons
         */
        Color(0xFF4682FA),
        Color(0xFF588CF3),
        Color(0xFF709CF5),

        /**
         * Diff changed: Stripe mark
         */

        /**
         * Diff changed: Stripe mark
         */
        Color(0xFF88ADF7),
        Color(0xFFA0BDF8),

        /**
         * Banner stroke
         * Diff changed: Stroke
         * Diff changed: Word
         */

        /**
         * Banner stroke
         * Diff changed: Stroke
         * Diff changed: Word
         */
        Color(0xFFC2D6FC),

        /**
         * Selection active
         */

        /**
         * Selection active
         */
        Color(0xFFD4E2FF),

        /**
         * Diff changed: Fill
         * General icons: Fill
         */

        /**
         * Diff changed: Fill
         * General icons: Fill
         */
        Color(0xFFEDF3FF),

        /**
         * Editor: Current line
         * Banner fill
         */

        /**
         * Editor: Current line
         * Banner fill
         */
        Color(0xFFF5F8FE),
    )
) : BlueIntUiPalette(colors, 13) {

    override fun buttonDefault(): Color = color(4)

    override fun buttonHovered(): Color = color(3)

    override fun buttonPressed(): Color = color(2)

    override fun outlineIconStroke(): Color = color(4)

    override fun iconStroke(): Color = color(4)

    override fun iconFill(): Color = color(12)

    override fun activeSelection(): Color = color(11)

    override fun bannerFill(): Color = color(13)

    override fun bannerStroke(): Color = color(10)

    override fun primary(): Color = color(4)
}

class LightGreenPalette(
    colors: List<Color> = listOf(
        Color(0xFF1E6B33),

        /**
         * Button: Pressed
         * Text
         */
        Color(0xFF1F7536),

        /**
         * Button: Hovered
         */
        Color(0xFF1F8039),

        /**
         * Button: Default
         * General icons: Stroke
         */
        Color(0xFF208A3C),

        /**
         * Outline icons
         */
        Color(0xFF369650),

        /**
         * Solid icons & modifiers
         */
        Color(0xFF55A76A),

        /**
         * Diff added: Stripe mark
         */
        Color(0xFF89C398),

        Color(0xFFAFDBB8),

        /**
         * Diff added: Stroke
         * Diff added: Word
         * Banner: Stroke
         */
        Color(0xFFC5E5CC),

        /**
         * Test root in project tree
         */
        Color(0xFFE6F7E9),

        /**
         * General icons: Fill
         * Banner: Fill
         * Diff added: Fill
         */
        Color(0xFFF2FCF3),
    )
) : GreenIntUiPalette(colors = colors, requiredColorCount = 11) {

    override fun buttonDefault(): Color = color(4)

    override fun buttonHovered(): Color = color(3)

    override fun buttonPressed(): Color = color(2)

    override fun outlineIconStroke(): Color = color(5)

    override fun iconStroke(): Color = color(4)

    override fun iconFill(): Color = color(11)

    override fun bannerFill(): Color = color(11)

    override fun bannerStroke(): Color = color(9)

    override fun primary(): Color = color(4)
}

class LightRedPalette(
    colors: List<Color> = listOf(
        Color(0xFFAD2B38),

        /**
         * Button: Pressed
         */
        Color(0xFFBC303E),

        /**
         * Button: Hovered
         * Validation (error) text
         */
        Color(0xFFCC3645),

        /**
         * Button: Default
         * General icons: Stroke
         * Outline icons
         */
        Color(0xFFDB3B4B),

        /**
         * Solid icons & modifiers
         */
        Color(0xFFE55765),
        Color(0xFFE46A76),
        Color(0xFFED99A1),

        /**
         * Diff conflict: Stripe mark
         */
        Color(0xFFF2B6BB),

        /**
         * Banner stroke
         * Diff conflict: Stroke
         * Diff conflict: Word
         */
        Color(0xFFFAD4D8),

        /**
         * Diff conflict: Fill
         */
        Color(0xFFFFF2F3),

        /**
         * General icons: Fill
         * Banner: Fill
         */
        Color(0xFFFFF7F7)
    )
) : RedIntUiPalette(colors = colors, requiredColorCount = 11) {

    override fun buttonDefault(): Color = color(4)

    override fun buttonHovered(): Color = color(3)

    override fun buttonPressed(): Color = color(2)

    override fun outlineIconStroke(): Color = color(4)

    override fun iconStroke(): Color = color(4)

    override fun iconFill(): Color = color(11)

    override fun bannerFill(): Color = color(11)

    override fun bannerStroke(): Color = color(9)

    override fun primary(): Color = color(4)
}

class LightYellowPalette(
    colors: List<Color> = listOf(
        /**
         * Text
         */
        Color(0xFFA46704),

        /**
         * General icons: Stroke
         */
        Color(0xFFC27D04),

        Color(0xFFDF9303),

        /**
         * Solid icons
         * Outline icons
         */
        Color(0xFFFFAF0F),

        Color(0xFFFDBD3D),

        /**
         * Banner: Stroke
         */
        Color(0xFFFED277),
        Color(0xFFFEE6B1),
        Color(0xFFFFF1D1),

        /**
         * Target root in project tree
         */
        Color(0xFFFFF6DE),

        /**
         * General icons: Fill
         * Banner: Fill
         */
        Color(0xFFFFFAEB),
    )
) : YellowIntUiPalette(colors = colors, requiredColorCount = 10) {

    override fun outlineIconStroke(): Color = color(4)

    override fun iconStroke(): Color = color(2)

    override fun iconFill(): Color = color(10)

    override fun bannerFill(): Color = color(10)

    override fun bannerStroke(): Color = color(6)

    override fun primary(): Color = color(4)
}

class LightOrangePalette(
    colors: List<Color> = listOf(
        Color(0xFFA14916),
        Color(0xFFB85516),
        Color(0xFFCE6117),
        Color(0xFFE56D17),
        Color(0xFFEC8F4C),
        Color(0xFFF2B181),
        Color(0xFFF9D2B6),
        Color(0xFFFCE6D6),
        Color(0xFFFFF4EB),
    )
) : OrangeIntUiPalette(colors = colors, requiredColorCount = 9) {

    override fun outlineIconStroke(): Color = color(4)
    override fun iconStroke(): Color = color(4)

    override fun iconFill(): Color = color(9)

    override fun primary(): Color = color(4)
}

class LightPurplePalette(
    colors: List<Color> = listOf(
        Color(0xFF55339C),
        Color(0xFF643CB8),
        Color(0xFF7444D4),
        Color(0xFF834DF0),
        Color(0xFFA177F4),
        Color(0xFFBFA1F8),
        Color(0xFFDCCBFB),
        Color(0xFFEFE5FF),
        Color(0xFFFAF5FF),
    )
) : PurpleIntUiPalette(colors = colors, requiredColorCount = 9) {

    override fun outlineIconStroke(): Color = color(4)
    override fun iconStroke(): Color = color(4)

    override fun iconFill(): Color = color(9)

    override fun primary(): Color = color(4)
}

class LightTealPalette(
    colors: List<Color> = listOf(
        Color(0xFF096A6E),
        Color(0xFF077A7F),
        Color(0xFF058B90),
        Color(0xFF039BA1),
        Color(0xFF3FB3B8),
        Color(0xFF7BCCCF),
        Color(0xFFB6E4E5),
        Color(0xFFDAF4F5),
        Color(0xFFF2FCFC),
    )
) : TealIntUiPalette(colors = colors, requiredColorCount = 9) {

    override fun outlineIconStroke(): Color = color(4)
    override fun iconStroke(): Color = color(4)

    override fun iconFill(): Color = color(9)

    override fun primary(): Color = color(4)
}
