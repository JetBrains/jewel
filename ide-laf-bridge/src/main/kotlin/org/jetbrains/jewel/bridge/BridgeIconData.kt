package org.jetbrains.jewel.bridge

import androidx.compose.runtime.Immutable
import com.intellij.ide.ui.LafManager
import com.intellij.ide.ui.UITheme
import com.intellij.ide.ui.laf.UIThemeBasedLookAndFeelInfo
import com.intellij.openapi.diagnostic.thisLogger
import org.jetbrains.jewel.IntelliJThemeIconData
import java.lang.reflect.Field

@Immutable
internal class BridgeIconData(
    override val iconOverrides: Map<String, String>,
    override val colorPalette: Map<String, String>,
    override val selectionColorPalette: Map<String, String>,
) : IntelliJThemeIconData {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BridgeIconData

        if (iconOverrides != other.iconOverrides) return false
        if (colorPalette != other.colorPalette) return false
        if (selectionColorPalette != other.selectionColorPalette) return false

        return true
    }

    override fun hashCode(): Int {
        var result = iconOverrides.hashCode()
        result = 31 * result + colorPalette.hashCode()
        result = 31 * result + selectionColorPalette.hashCode()
        return result
    }

    override fun toString(): String =
        "BridgeIconData(iconOverrides=$iconOverrides, colorPalette=$colorPalette, " +
            "selectionColorPalette=$selectionColorPalette)"

    companion object {

        fun readFromLaF(): BridgeIconData {
            val classUITheme = UITheme::class.java
            val iconMap: Map<String, String> = readMapField(classUITheme.getDeclaredField("icons"))
            val selectionColorPalette: Map<String, String> =
                readMapField(classUITheme.getDeclaredField("selectionColorPalette"))

            val colorPalette = UITheme.getColorPalette()
            return BridgeIconData(iconMap.filterKeys { it != "ColorPalette" }, colorPalette, selectionColorPalette)
        }

        private fun readMapField(field: Field): Map<String, String> {
            @Suppress("DEPRECATION") // We don't have an alternative API to use
            val wasAccessible = field.isAccessible
            field.isAccessible = true

            val iconMap: Map<String, String> = try {
                val laf = LafManager.getInstance().currentLookAndFeel as? UIThemeBasedLookAndFeelInfo

                if (laf != null) {
                    @Suppress("UNCHECKED_CAST")
                    field.get(laf.theme) as? Map<String, String> ?: emptyMap()
                } else {
                    emptyMap()
                }
            } catch (e: IllegalAccessException) {
                thisLogger().warn("Error while retrieving LaF", e)
                emptyMap()
            } finally {
                field.isAccessible = wasAccessible
            }
            return iconMap
        }
    }
}
