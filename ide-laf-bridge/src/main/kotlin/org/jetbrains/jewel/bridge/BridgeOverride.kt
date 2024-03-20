package org.jetbrains.jewel.bridge

import com.intellij.ui.icons.patchIconPath
import com.intellij.util.ui.DirProvider
import org.jetbrains.jewel.ui.painter.PainterPathHint
import org.jetbrains.jewel.ui.painter.PainterProviderScope
import org.jetbrains.jewel.ui.painter.ResourcePainterProviderScope

/**
 * A [PainterPathHint] that implements the
 * [New UI Icon Mapping](https://plugins.jetbrains.com/docs/intellij/icons.html#mapping-entries)
 * by delegating to the IntelliJ Platform.
 */
internal object BridgeOverride : PainterPathHint {

    private const val REFLECTIVE_PATH_PROPERTY = "ide.experimental.ui.use.reflective.path"
    private val dirProvider = DirProvider()

    @Suppress("UnstableApiUsage") // patchIconPath() is explicitly open to us
    override fun PainterProviderScope.patch(): String {
        if (this !is ResourcePainterProviderScope) return path

        // For all provided classloaders, we try to get the patched path, both using
        // the original path, and an "abridged" path that has gotten the icon path prefix
        // removed (the classloader is set up differently in prod IDEs and when running
        // from Gradle, and the icon could be in either place depending on the environment)
        val fallbackPath = path.removePrefix(dirProvider.dir())

        for (classLoader in classLoaders) {
            val patchedPath = withoutReflectivePath {
                patchIconPath(path.removePrefix("/"), classLoader)?.first
                    ?: patchIconPath(fallbackPath, classLoader)?.first
            }

            if (patchedPath != null) {
                return patchedPath
            }
        }
        return path
    }

    private inline fun <T> withoutReflectivePath(action: () -> T): T {
        val prevPropertyValue: String? = System.getProperty(REFLECTIVE_PATH_PROPERTY)
        System.setProperty(REFLECTIVE_PATH_PROPERTY, "false")
        try {
            return action()
        } finally {
            prevPropertyValue?.let { System.setProperty(REFLECTIVE_PATH_PROPERTY, it) }
        }
    }

    override fun toString(): String = "BridgeOverride"
}
