package org.jetbrains.jewel.intui.core

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import org.jetbrains.jewel.GlobalColors
import org.jetbrains.jewel.GlobalMetrics
import org.jetbrains.jewel.IntelliJThemeDefinition
import org.jetbrains.jewel.IntelliJThemeIconData

@Immutable
data class IntUiThemeDefinition(
    override val isDark: Boolean,
    override val globalColors: GlobalColors,
    override val colorPalette: IntUiThemeColorPalette,
    override val iconData: IntelliJThemeIconData,
    override val globalMetrics: GlobalMetrics,
    override val defaultTextStyle: TextStyle,
    override val contentColor: Color,
    override val extensionStyles: Array<ProvidedValue<*>> = arrayOf()
) : IntelliJThemeDefinition {

    override fun withExtension(extension: ProvidedValue<*>): IntUiThemeDefinition =
        copy(extensionStyles = extensionStyles + extension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as IntUiThemeDefinition

        if (isDark != other.isDark) return false
        if (globalColors != other.globalColors) return false
        if (colorPalette != other.colorPalette) return false
        if (iconData != other.iconData) return false
        if (globalMetrics != other.globalMetrics) return false
        if (defaultTextStyle != other.defaultTextStyle) return false
        if (contentColor != other.contentColor) return false
        if (!extensionStyles.contentEquals(other.extensionStyles)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = isDark.hashCode()
        result = 31 * result + globalColors.hashCode()
        result = 31 * result + colorPalette.hashCode()
        result = 31 * result + iconData.hashCode()
        result = 31 * result + globalMetrics.hashCode()
        result = 31 * result + defaultTextStyle.hashCode()
        result = 31 * result + contentColor.hashCode()
        result = 31 * result + extensionStyles.contentHashCode()
        return result
    }
}
