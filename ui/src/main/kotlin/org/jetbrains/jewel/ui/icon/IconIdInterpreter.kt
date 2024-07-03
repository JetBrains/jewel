package org.jetbrains.jewel.ui.icon

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import org.jetbrains.jewel.foundation.theme.JewelTheme

public fun interface IconIdInterpreter {
    public fun interpret(iconId: String): InterpretedIconId
}

// TODO provide value in theme
public val LocalIconIdInterpreter: ProvidableCompositionLocal<IconIdInterpreter> =
    staticCompositionLocalOf { error("No IconIdInterpreter provided") }

public val JewelTheme.Companion.iconIdInterpreter: IconIdInterpreter
    @Composable get() = LocalIconIdInterpreter.current
