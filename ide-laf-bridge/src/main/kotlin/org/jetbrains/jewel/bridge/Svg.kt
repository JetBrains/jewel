package org.jetbrains.jewel.bridge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.loadSvgPainter
import org.jetbrains.jewel.IntelliJSvgLoader
import org.jetbrains.jewel.themes.PaletteMapperFactory
import org.jetbrains.jewel.themes.intui.core.IntUiThemeDefinition
import org.jetbrains.jewel.themes.intui.core.IntelliJSvgPatcher
import java.io.InputStream

@Composable
fun rememberSvgResource(resourcePath: String, classLoader: ClassLoader): Painter {
    val density = LocalDensity.current
    return remember(resourcePath, density) {
        useResource(resourcePath, classLoader) {
            loadSvgPainter(it, density)
        }
    }
}

inline fun <T> useResource(
    resourcePath: String,
    classLoader: ClassLoader,
    block: (InputStream) -> T,
): T = openResource(resourcePath, classLoader).use(block)

/**
 * Open [InputStream] from a resource stored in resources for the application.
 *
 * @throws IllegalArgumentException if there is no [resourcePath] in resources
 */
@PublishedApi
internal fun openResource(resourcePath: String, classLoader: ClassLoader): InputStream {
    return requireNotNull(classLoader.getResourceAsStream(resourcePath)) {
        "Resource $resourcePath not found"
    }
}

internal fun createSvgLoader(theme: IntUiThemeDefinition): IntelliJSvgLoader {
    val paletteMapper = PaletteMapperFactory.create(theme.isDark, theme.iconData, theme.colorPalette)
    val svgPatcher = IntelliJSvgPatcher(paletteMapper)
    return IntelliJSvgLoader(svgPatcher)
}
