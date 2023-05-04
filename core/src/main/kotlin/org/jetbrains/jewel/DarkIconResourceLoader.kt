package org.jetbrains.jewel

import androidx.compose.ui.res.ResourceLoader
import java.io.InputStream

object DarkIconResourceLoader : ResourceLoader {

    override fun load(resourcePath: String): InputStream {
        val extension = resourcePath.substringAfterLast('.')
        val name = resourcePath.substringBeforeLast('.')

        val realPath = if (name.endsWith("_dark")) {
            "$name.$extension"
        } else {
            "${name}_dark.$extension"
        }
        return try {
            ResourceLoader.Default.load(realPath)
        } catch (ex: IllegalArgumentException) {
            ResourceLoader.Default.load(resourcePath)
        }
    }
}
