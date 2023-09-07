package org.jetbrains.jewel.bridge

import androidx.compose.ui.res.ResourceLoader
import com.intellij.openapi.diagnostic.thisLogger
import org.jetbrains.jewel.ClassLoaderProvider

object IntelliJIconMapper : IconMapper {

    private val logger = thisLogger()

    override fun mapPath(originalPath: String, resourceLoader: ResourceLoader): String {
        val clazz = Class.forName("com.intellij.ui.icons.CachedImageIconKt")
        val patchIconPath = clazz.getMethod("patchIconPath", String::class.java, ClassLoader::class.java)
        patchIconPath.isAccessible = true

        val classLoaders = (resourceLoader as? ClassLoaderProvider)?.classLoaders
        if (classLoaders == null) {
            logger.warn(
                "Tried loading a resource but the provided ResourceLoader is now a JewelResourceLoader; " +
                    "this is probably a bug. Make sure you always use JewelResourceLoaders.",
            )
            return originalPath
        }

        return classLoaders.firstNotNullOfOrNull { classLoader ->
            patchIconPath.invoke(null, originalPath.removePrefix("/"), classLoader) as? Pair<String, ClassLoader>
        }?.first ?: originalPath
    }
}
