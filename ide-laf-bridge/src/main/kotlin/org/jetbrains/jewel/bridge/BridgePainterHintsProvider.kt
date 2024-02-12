package org.jetbrains.jewel.bridge

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.intellij.ide.ui.UITheme
import com.intellij.openapi.diagnostic.thisLogger
import org.jetbrains.jewel.foundation.InternalJewelApi
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.painter.PainterHint
import org.jetbrains.jewel.ui.painter.PalettePainterHintsProvider
import org.jetbrains.jewel.ui.painter.hints.ColorBasedPaletteReplacement
import org.jetbrains.jewel.ui.painter.hints.Dark
import org.jetbrains.jewel.ui.painter.hints.HiDpi
import org.jetbrains.jewel.ui.util.toRgbaHexString

/**
 * Provide the default [PainterHint]s to use in the IDE.
 *
 * This is an internal Jewel API and should not be used directly.
 */
@InternalJewelApi
public class BridgePainterHintsProvider private constructor(
    isDark: Boolean,
    intellijIconPalette: Map<String, String?> = emptyMap(),
    themeIconPalette: Map<String, String?> = emptyMap(),
    themeColorPalette: Map<String, Color?> = emptyMap(),
) : PalettePainterHintsProvider(isDark, intellijIconPalette, themeIconPalette, themeColorPalette) {

    override val checkBoxByColorPaletteHint: PainterHint
    override val treePaletteHint: PainterHint
    override val uiPaletteHint: PainterHint

    init {
        val ui = mutableMapOf<Color, Color>()
        val checkBoxesByColor = mutableMapOf<Color, Color>()
        val trees = mutableMapOf<Color, Color>()

        @Suppress("LoopWithTooManyJumpStatements")
        for ((key, value) in themeIconPalette) {
            if (value == null) continue

            val map = selectMap(key, checkBoxesByColor, trees, ui) ?: continue
            registerColorBasedReplacement(map, key, value)
        }

        checkBoxByColorPaletteHint = ColorBasedPaletteReplacement(checkBoxesByColor)
        treePaletteHint = ColorBasedPaletteReplacement(trees)
        uiPaletteHint = ColorBasedPaletteReplacement(ui)
    }

    private fun registerColorBasedReplacement(
        map: MutableMap<Color, Color>,
        key: String,
        value: String,
    ) {
        // If either the key or the resolved value aren't valid colors, ignore the entry
        val keyAsColor = resolveKeyColor(key, intellijIconPalette, isDark) ?: return
        val resolvedColor = resolveColor(value) ?: return

        // Save the new entry (oldColor -> newColor) in the map
        map[keyAsColor] = resolvedColor
    }

    @Composable
    override fun hints(path: String): List<PainterHint> =
        buildList {
            add(BridgeOverride)
            add(getPaletteHint(path))
            add(HiDpi())
            add(Dark(JewelTheme.isDark))
        }

    public companion object {

        private val logger = thisLogger()

        @Suppress("UnstableApiUsage") // We need to call @Internal APIs
        public operator fun invoke(isDark: Boolean): PalettePainterHintsProvider {
            val uiTheme = currentUiThemeOrNull() ?: return BridgePainterHintsProvider(isDark)
            logger.info("Parsing theme info from theme ${uiTheme.name} (id: ${uiTheme.id}, isDark: ${uiTheme.isDark})")

            val bean = uiTheme.describe()
            val iconColorPalette =
                (bean.colorPalette as Map<String, Any?>).mapValues {
                    when (val value = it.value) {
                        is String -> value
                        is java.awt.Color -> value.toRgbaHexString()
                        else -> null
                    }
                }
            val keyPalette = UITheme.getColorPalette()
            val themeColors = bean.colors.mapValues { (_, v) -> Color(v) }

            return BridgePainterHintsProvider(
                isDark = isDark,
                intellijIconPalette = keyPalette,
                themeIconPalette = iconColorPalette,
                themeColorPalette = themeColors,
            )
        }
    }
}
