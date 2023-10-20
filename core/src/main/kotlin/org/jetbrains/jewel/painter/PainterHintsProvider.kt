package org.jetbrains.jewel.painter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalDensity
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.painter.hints.Dark
import org.jetbrains.jewel.painter.hints.HiDpi

/**
 * Provides [hints][PainterHint] to a [PainterProvider].
 *
 * @see CommonPainterHintsProvider
 * @see org.jetbrains.jewel.intui.core.IntUiPainterHintsProvider
 * @see org.jetbrains.jewel.intui.standalone.StandalonePainterHintsProvider
 */
@Immutable
interface PainterHintsProvider {

    /**
     * Those hints will be added before the [hints][PainterProvider.getPainter] that passed in [PainterProvider.getPainter].
     */
    @Composable
    fun priorityHints(path: String): List<PainterHint> = emptyList()

    /**
     * Those hints will be added after the [hints][PainterProvider.getPainter] that passed in [PainterProvider.getPainter].
     */
    @Composable
    fun hints(path: String): List<PainterHint>
}

/**
 * The default [PainterHintsProvider] to load dark theme icon variants.
 * It will provide the [Dark] hint when [LocalIsDarkTheme][org.jetbrains.jewel.LocalIsDarkTheme] is true.
 */
object CommonPainterHintsProvider : PainterHintsProvider {

    @Composable
    override fun hints(path: String): List<PainterHint> = listOf(
        HiDpi(LocalDensity.current),
        Dark(IntelliJTheme.isDark),
    )
}

val LocalPainterHintsProvider = staticCompositionLocalOf<PainterHintsProvider> {
    CommonPainterHintsProvider
}
