package org.jetbrains.jewel.intui.standalone

import org.jetbrains.jewel.core.painter.ResourcePainterProvider
import org.jetbrains.jewel.foundation.theme.JewelTheme

/**
 * Create a [PainterProvider][org.jetbrains.jewel.painter.PainterProvider] to load a
 * resource from the classpath.
 */
fun standalonePainterProvider(path: String) =
    ResourcePainterProvider(path, JewelTheme::class.java.classLoader)
