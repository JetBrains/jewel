package org.jetbrains.jewel.samples.standalone

import org.jetbrains.skiko.SystemTheme
import org.jetbrains.skiko.currentSystemTheme

public enum class IntUiThemes {
    Light, LightWithLightHeader, Dark, SYSTEM;

    public fun isDark(): Boolean {
        val theme = if (this == SYSTEM) {
            fromSystemTheme(currentSystemTheme)
        } else {
            this
        }
        return theme == Dark
    }

    public fun isLightHeader(): Boolean = this == LightWithLightHeader

    public companion object {

        public fun fromSystemTheme(systemTheme: SystemTheme) =
            if (systemTheme == SystemTheme.LIGHT) Light else Dark
    }
}
