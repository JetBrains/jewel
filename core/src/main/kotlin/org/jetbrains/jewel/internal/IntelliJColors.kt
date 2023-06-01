package org.jetbrains.jewel.internal

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.styles.localNotProvided

/**
 * Int UI/Darcula Design color system.
 */
@Stable
class IntelliJColors(
    panelArea: AreaColor,
    contentArea: AreaColor,
    darkArea: AreaColor,
    disableArea: AreaColor,
    separator: Color,
    isLight: Boolean
) {

    var panelArea by mutableStateOf(panelArea, structuralEqualityPolicy())
        internal set
    var contentArea by mutableStateOf(contentArea, structuralEqualityPolicy())
        internal set
    var darkArea by mutableStateOf(darkArea, structuralEqualityPolicy())
        internal set
    var disableArea by mutableStateOf(disableArea, structuralEqualityPolicy())
        internal set
    var separator by mutableStateOf(separator, structuralEqualityPolicy())
        internal set
    var isLight by mutableStateOf(isLight, structuralEqualityPolicy())
        internal set

    fun copy(
        panelArea: AreaColor = this.panelArea,
        contentArea: AreaColor = this.contentArea,
        darkArea: AreaColor = this.darkArea,
        disableArea: AreaColor = this.disableArea,
        separator: Color = this.separator,
        isLight: Boolean = this.isLight
    ): IntelliJColors {
        return IntelliJColors(
            panelArea = panelArea,
            contentArea = contentArea,
            darkArea = darkArea,
            disableArea = disableArea,
            separator = separator,
            isLight = isLight
        )
    }

    override fun toString(): String {
        return "IntelliJColors(" +
            "panelArea=$panelArea, " +
            "contentArea=$contentArea, " +
            "darkArea=$darkArea, " +
            "disableArea=$disableArea, " +
            "separator=$separator, " +
            "isLight=$isLight)"
    }

    companion object
}

internal fun IntelliJColors.updateFrom(other: IntelliJColors) {
    panelArea = other.panelArea
    contentArea = other.contentArea
    darkArea = other.darkArea
    disableArea = other.disableArea
    separator = other.separator
    isLight = other.isLight
}

data class AreaColor(
    val background: Color = Color.Unspecified,
    val endBackground: Color = Color.Unspecified,
    val foreground: Color = Color.Unspecified,
    val stroke: Color = Color.Unspecified,
) {

    override fun toString(): String {
        return "AreaColor(background=$background, endBackground=$endBackground, foreground=$foreground, stroke=$stroke)"
    }
}

internal val LocalIntelliJColors = staticCompositionLocalOf<IntelliJColors> {
    localNotProvided()
}
