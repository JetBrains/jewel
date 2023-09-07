package org.jetbrains.jewel.bridge

import androidx.compose.ui.res.ResourceLoader
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.util.ui.DirProvider
import org.jetbrains.jewel.JewelResourceLoader

object IntelliJIconMapper : IconMapper {

    private val logger = thisLogger()

    override fun mapPath(originalPath: String, resourceLoader: ResourceLoader): String {
        val clazz = Class.forName("com.intellij.ui.icons.CachedImageIconKt")
        val patchIconPath = clazz.getMethod("patchIconPath", String::class.java, ClassLoader::class.java)
        patchIconPath.isAccessible = true

        val searchClasses = (resourceLoader as? JewelResourceLoader)?.searchClasses
        if (searchClasses == null) {
            logger.warn(
                "Tried loading a resource but the provided ResourceLoader is now a JewelResourceLoader; " +
                    "this is probably a bug. Make sure you always use JewelResourceLoaders.",
            )
            return originalPath
        }

        return (searchClasses + DirProvider::class.java)
            .map { it.classLoader }
            .firstNotNullOfOrNull { classLoader ->
                patchIconPath.invoke(null, originalPath.removePrefix("/"), classLoader) as? Pair<String, ClassLoader>
            }?.first ?: originalPath
    }
}
