package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.internal.IntelliJColors

class DarkPalette(
    grey: List<Color> = listOf(
        /**
         * Main background (editor)
         */
        Color(0xFF1E1F22),

        /**
         * Secondary background (tool windows, dialogs, tooltips)
         */
        Color(0xFF2B2D30),

        /**
         * Lines & separators
         * Tree hover
         */
        Color(0xFF393B40),

        /**
         * General icons: Fill
         * Inactive selection
         */
        Color(0xFF43454A),

        Color(0xFF4E5157),
        Color(0xFF5A5D63),

        /**
         * Secondary text & icons
         * Disabled text in components
         */
        Color(0xFF6F737A),

        /**
         * Text on lighter backgrounds (hints)
         */
        Color(0xFF868A91),

        /**
         * Current line number
         */
        Color(0xFF9DA0A8),
        Color(0xFFB4B8BF),

        /**
         * General icons: Stroke
         * Solid icons
         * Outline icons
         */
        Color(0xFFCED0D6),

        /**
         * Primary text
         */
        Color(0xFFDFE1E5),
        Color(0xFFF0F1F2),

        Color(0xFFFFFFFF),
    ),
    blue: List<Color> = listOf(
        /**
         * General icons: Fill
         * Editor: Selection
         */
        Color(0xFF25324D),

        /**
         * Selection in tool windows
         */
        Color(0xFF2E436E),
        Color(0xFF35538F),

        /**
         * Button: Pressed
         */
        Color(0xFF375FAD),

        /**
         * Button: Hovered
         */
        Color(0xFF366ACE),

        /**
         * Button: Default
         */
        Color(0xFF3573F0),
        Color(0xFF467FF2),

        /**
         * General icons: Stroke
         * Solid icons
         * Outline icons
         */
        Color(0xFF548AF7),

        /**
         * Link
         */
        Color(0xFF6B9BFA),
        Color(0xFF83ACFC),
        Color(0xFF99BBFF),

        ),
    green: List<Color> = listOf(
        /**
         * General icons: Fill
         */
        Color(0xFF253627),
        Color(0xFF375239),
        Color(0xFF436946),
        Color(0xFF4E8052),

        /**
         * General icons: Stroke
         * Solid icons
         * Outline icons
         */
        Color(0xFF57965C),

        /**
         * Success icons
         */
        Color(0xFF5FAD65),
        Color(0xFF73BD79),
        Color(0xFF89CC8E),
        Color(0xFFA0DBA5),
        Color(0xFFB9EBBD),
        Color(0xFFD4FAD7),
    ),
    red: List<Color> = listOf(
        /**
         * General icons: Fill
         */
        Color(0xFF402929),
        Color(0xFF5E3838),
        Color(0xFF7A4343),
        Color(0xFF9C4E4E),
        Color(0xFFBD5757),

        /**
         * General icons: Stroke
         * Solid icons
         * Outline icons
         */
        Color(0xFFDB5C5C),
        Color(0xFFE37774),
        Color(0xFFEB938D),
        Color(0xFFF2B1AA),
        Color(0xFFF7CCC6),
        Color(0xFFFAE3DE),
    ),
    yellow: List<Color> = listOf(
        /**
         * General icons: Fill
         */
        Color(0xFF3D3223),
        Color(0xFF5E4D33),
        Color(0xFF826A41),
        Color(0xFF9E814A),
        Color(0xFFBA9752),

        /**
         * General icons: Stroke
         */
        Color(0xFFD6AE58),

        /**
         * Solid icons
         * Outline icons
         */
        Color(0xFFF2C55C),
        Color(0xFFF5D273),
        Color(0xFFF7DE8B),
        Color(0xFFFCEBA4),
        Color(0xFFFFF6BD),
    ),
    orange: List<Color> = listOf(
        /**
         * General icons: Fill
         */
        Color(0xFF45322B),
        Color(0xFF614438),
        Color(0xFF825845),
        Color(0xFFA36B4E),

        /**
         * General icons: Stroke
         * Solid icons
         * Outline icons
         */
        Color(0xFFC77D55),
        Color(0xFFE08855),
        Color(0xFFE5986C),
        Color(0xFFF0AC81),
        Color(0xFFF5BD98),
        Color(0xFFFACEAF),
        Color(0xFFFFDFC7),
    ),
    purple: List<Color> = listOf(
        /**
         * General icons: FiRll
         */
        Color(0xFF2F2936),
        Color(0xFF433358),
        Color(0xFF583D7A),
        Color(0xFF6C469C),
        Color(0xFF8150BE),
        Color(0xFF955AE0),

        /**
         * General icons: Stroke
         * Solid icons
         * Outline icons
         */
        Color(0xFFA571E6),
        Color(0xFFB589EC),
        Color(0xFFC4A0F3),
        Color(0xFFD4B8F9),
        Color(0xFFE4CEFF),
    ),
    teal: List<Color> = listOf(
        /**
         * General icons: Fill
         */
        Color(0xFF1D3838),
        Color(0xFF1E4D4A),
        Color(0xFF20635D),
        Color(0xFF21786F),
        Color(0xFF238E82),

        /**
         * General icons: Stroke
         * Solid icons
         * Outline icons
         */
        Color(0xFF24A394),
        Color(0xFF42B1A4),
        Color(0xFF60C0B5),
        Color(0xFF7DCEC5),
        Color(0xFF9BDDD6),
        Color(0xFFB9EBE6),
    ),
) : IntUiPalette(
    grey = grey,
    blue = blue,
    green = green,
    red = red,
    yellow = yellow,
    orange = orange,
    purple = purple,
    teal = teal,
    isLight = false
) {

    init {
        require(grey.size == 14)
        require(blue.size == 11)
        require(green.size == 11)
        require(red.size == 11)
        require(yellow.size == 11)
        require(orange.size == 11)
        require(purple.size == 11)
        require(teal.size == 11)
    }

    override fun toIntelliJColor(): IntelliJColors {
        TODO("Not yet implemented")
    }
}
