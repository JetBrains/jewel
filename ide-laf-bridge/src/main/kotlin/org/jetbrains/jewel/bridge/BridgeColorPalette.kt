package org.jetbrains.jewel.bridge

import androidx.compose.ui.graphics.Color
import com.intellij.openapi.diagnostic.Logger
import org.jetbrains.jewel.themes.intui.core.IntUiThemeColorPalette

private val logger = Logger.getInstance("BridgeThemeColorPalette")

class BridgeThemeColorPalette(
    private val grey: List<Color> = readPaletteColors("Grey"),
    private val blue: List<Color> = readPaletteColors("Blue"),
    private val green: List<Color> = readPaletteColors("Green"),
    private val red: List<Color> = readPaletteColors("Red"),
    private val yellow: List<Color> = readPaletteColors("Yellow"),
    private val orange: List<Color> = readPaletteColors("Orange"),
    private val purple: List<Color> = readPaletteColors("Purple"),
    private val teal: List<Color> = readPaletteColors("Teal"),
) : IntUiThemeColorPalette {

    override fun grey(): List<Color> = grey

    override fun grey(index: Int): Color = grey[index]

    override fun blue(): List<Color> = blue

    override fun blue(index: Int): Color = blue[index]

    override fun green(): List<Color> = green

    override fun green(index: Int): Color = green[index]

    override fun red(): List<Color> = red

    override fun red(index: Int): Color = red[index]

    override fun yellow(): List<Color> = yellow

    override fun yellow(index: Int): Color = yellow[index]

    override fun orange(): List<Color> = orange

    override fun orange(index: Int): Color = orange[index]

    override fun purple(): List<Color> = purple

    override fun purple(index: Int): Color = purple[index]

    override fun teal(): List<Color> = teal

    override fun teal(index: Int): Color = teal[index]

    companion object {

        private fun readPaletteColors(colorName: String): List<Color> {
            val defaults = uiDefaults
            val allKeys = defaults.keys
            val colorNameLength = colorName.length

            val lastColorIndex = allKeys.asSequence()
                .filterIsInstance(String::class.java)
                .filter { it.startsWith(colorName) }
                .mapNotNull {
                    val afterName = it.substring(colorNameLength)
                    afterName.toIntOrNull()
                }
                .max()

            return buildList {
                for (i in 1..lastColorIndex) {
                    val value = defaults["$colorName$i"] as? java.awt.Color
                    if (value == null) {
                        logger.error("Unable to find color value for palette key '$colorName$i'")
                        continue
                    }

                    add(value.toComposeColor())
                }
            }
        }
    }
}
