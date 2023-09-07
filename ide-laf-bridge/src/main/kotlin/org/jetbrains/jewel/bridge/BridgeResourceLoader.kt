package org.jetbrains.jewel.bridge

import androidx.compose.ui.res.ResourceLoader
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.util.ui.DirProvider
import org.jetbrains.jewel.JewelResourceLoader
import java.io.InputStream

object BridgeResourceLoader : ResourceLoader, JewelResourceLoader {

    private val dirProvider = DirProvider()

    override val searchClasses = listOf(dirProvider::class.java, javaClass)

    override fun load(resourcePath: String): InputStream {
        val normalizedPath = resourcePath.removePrefix("/")
        val fallbackPath = resourcePath.removePrefix(dirProvider.dir())
        val resource = tryLoadingResource(resourcePath)
            ?: tryLoadingResource(fallbackPath)

        return requireNotNull(resource) {
            "Resource $resourcePath not found (tried using '$normalizedPath' and '$fallbackPath')"
        }
    }

    private fun tryLoadingResource(path: String): InputStream? {
        for (clazz in searchClasses) {
            val stream = clazz.classLoader.getResourceAsStream(path)
            if (stream != null) {
                thisLogger().info("Found resource: '$path'")
                return stream
            }

            // Didn't work, let's see if we can simplify the icon to a base state
            val simplifiedPath = trySimplifyingPath(path)
            if (simplifiedPath != null) {
                thisLogger().warn("Resource not found: '$path'. Trying simplified path: '$simplifiedPath'")
                return tryLoadingResource(simplifiedPath)
            }
        }

        return null
    }

    private fun trySimplifyingPath(originalPath: String): String? {
        // Step 4: attempt to remove dark qualifier
        val darkIndex = originalPath.lastIndexOf("_dark")
        if (darkIndex > 0) {
            return originalPath.removeRange(darkIndex, darkIndex + "_dark".length)
        }

        // Step 1: attempt to remove extended state qualifiers (pressed, hovered)
        val pressedIndex = originalPath.lastIndexOf("Pressed")
        if (pressedIndex > 0) {
            return originalPath.removeRange(pressedIndex, pressedIndex + "Pressed".length)
        }

        val hoveredIndex = originalPath.lastIndexOf("Hovered")
        if (hoveredIndex > 0) {
            return originalPath.removeRange(hoveredIndex, hoveredIndex + "Hovered".length)
        }

        // Step 2: attempt to remove state qualifiers (indeterminate, selected, focused, disabled)
        val indeterminateIndex = originalPath.lastIndexOf("Indeterminate")
        if (indeterminateIndex > 0) {
            return originalPath.removeRange(indeterminateIndex, indeterminateIndex + "Indeterminate".length)
        }

        val selectedIndex = originalPath.lastIndexOf("Selected")
        if (selectedIndex > 0) {
            return originalPath.removeRange(selectedIndex, selectedIndex + "Selected".length)
        }

        val focusedIndex = originalPath.lastIndexOf("Focused")
        if (focusedIndex > 0) {
            return originalPath.removeRange(focusedIndex, focusedIndex + "Focused".length)
        }

        val disabledIndex = originalPath.lastIndexOf("Disabled")
        if (disabledIndex > 0) {
            return originalPath.removeRange(disabledIndex, disabledIndex + "Disabled".length)
        }

        // Step 3: attempt to remove density and size qualifiers
        val retinaIndex = originalPath.lastIndexOf("@2x")
        if (retinaIndex > 0) {
            return originalPath.removeRange(retinaIndex, retinaIndex + "@2x".length)
        }

        // TODO remove size qualifiers (e.g., "@20x20")

        return null
    }
}
