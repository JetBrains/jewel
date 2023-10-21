package org.jetbrains.jewel.bridge

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import com.intellij.ide.ui.UITheme
import com.intellij.openapi.diagnostic.thisLogger
import org.jetbrains.jewel.core.painter.PainterHint
import org.jetbrains.jewel.core.painter.hints.Dark
import org.jetbrains.jewel.core.painter.hints.HiDpi
import org.jetbrains.jewel.foundation.InternalJewelApi
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.intui.core.IntUiPainterHintsProvider

@InternalJewelApi
class BridgePainterHintsProvider private constructor(
    isDark: Boolean,
    intellijIconPalette: Map<String, String?> = emptyMap(),
    themeIconPalette: Map<String, String?> = emptyMap(),
    themeColorPalette: Map<String, Color?> = emptyMap(),
) : IntUiPainterHintsProvider(
    isDark,
    intellijIconPalette,
    themeIconPalette,
    themeColorPalette,
) {

    @Composable
    override fun hints(path: String): List<PainterHint> = buildList {
        add(getPaletteHint(path))
        add(BridgeOverride)
        add(HiDpi(LocalDensity.current))
        add(Dark(JewelTheme.isDark))
    }

    companion object {

        private val logger = thisLogger()

        operator fun invoke(isDark: Boolean): IntUiPainterHintsProvider {
            val uiTheme = currentUiThemeOrNull() ?: return BridgePainterHintsProvider(isDark)
            logger.info("Parsing theme info from theme ${uiTheme.name} (id: ${uiTheme.id}, isDark: ${uiTheme.isDark})")

            val bean = uiTheme.describe()
            val iconColorPalette = (bean.colorPalette as Map<String, Any?>).mapValues {
                when (val value = it.value) {
                    is String -> value
                    else -> null
                }
            }
            val keyPalette = UITheme.getColorPalette()
            val themeColors = bean.colors
                .mapValues { (_, v) -> Color(v) }

            return BridgePainterHintsProvider(isDark, keyPalette, iconColorPalette, themeColors)
        }
    }
}
