package org.jetbrains.jewel.ui.painter

interface PainterProviderScope {

    val rawPath: String

    val path: String
}

interface ResourcePainterProviderScope : PainterProviderScope {

    val classLoaders: Set<ClassLoader>
}
