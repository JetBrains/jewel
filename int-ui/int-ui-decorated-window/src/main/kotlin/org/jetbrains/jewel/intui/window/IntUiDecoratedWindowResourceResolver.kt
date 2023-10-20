package org.jetbrains.jewel.intui.window

import org.jetbrains.jewel.intui.standalone.IntUiTheme
import org.jetbrains.jewel.painter.ResourcePainterProvider
import org.jetbrains.jewel.window.styling.DecoratedWindowStyle

/**
 * Create [PainterProvider][org.jetbrains.jewel.painter.PainterProvider] for decorated window module resource.
 */
fun decoratedWindowPainterProvider(path: String) =
    ResourcePainterProvider(path, DecoratedWindowStyle::class.java.classLoader, IntUiTheme::class.java.classLoader)
