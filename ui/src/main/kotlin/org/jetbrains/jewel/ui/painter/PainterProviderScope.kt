package org.jetbrains.jewel.ui.painter

import androidx.compose.ui.unit.Density

interface PainterProviderScope : Density {

    val rawPath: String

    val path: String
}

interface ResourcePainterProviderScope : PainterProviderScope {

    val classLoaders: Set<ClassLoader>
}
