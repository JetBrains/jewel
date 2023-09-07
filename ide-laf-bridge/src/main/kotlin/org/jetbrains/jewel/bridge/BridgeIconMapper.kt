package org.jetbrains.jewel.bridge

import androidx.compose.ui.res.ResourceLoader
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.util.ui.DirProvider
import org.jetbrains.jewel.ClassLoaderProvider

internal object BridgeIconMapper : IconMapper {

    private val logger = thisLogger()

    private val dirProvider = DirProvider()

    override fun mapPath(originalPath: String, resourceLoader: ResourceLoader): String {
        val classLoaders = (resourceLoader as? ClassLoaderProvider)?.classLoaders
        if (classLoaders == null) {
            logger.warn(
                "Tried loading a resource but the provided ResourceLoader is now a JewelResourceLoader; " +
                    "this is probably a bug. Make sure you always use JewelResourceLoaders.",
            )
            return originalPath
        }

        val clazz = Class.forName("com.intellij.ui.icons.CachedImageIconKt")
        val patchIconPath = clazz.getMethod("patchIconPath", String::class.java, ClassLoader::class.java)
        patchIconPath.isAccessible = true

        val fallbackPath = originalPath.removePrefix(dirProvider.dir())
        val patchedPath = classLoaders.firstNotNullOfOrNull { classLoader ->
            (patchIconPath.invoke(null, originalPath.removePrefix("/"), classLoader)
                ?: patchIconPath.invoke(null, fallbackPath, classLoader)) as? Pair<*, *>
        }?.first as? String

        if (patchedPath != null) {
            logger.info("Found icon mapping: '$originalPath' -> '$patchedPath'")
        }

        return patchedPath ?: originalPath
    }
}
