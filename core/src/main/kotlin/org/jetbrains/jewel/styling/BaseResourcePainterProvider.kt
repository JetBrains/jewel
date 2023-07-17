package org.jetbrains.jewel.styling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.ResourceLoader
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.painterResource

@Deprecated("Switch to a ResourcePathPainterProvider")
abstract class BaseResourcePainterProvider<T>(private val svgLoader: SvgLoader? = null) : StatefulPainterProvider<T> {

    abstract val normal: String
    abstract val disabled: String
    abstract val focused: String
    abstract val pressed: String
    abstract val hovered: String

    @Composable
    override fun getPainter(state: T, resourceLoader: ResourceLoader): State<Painter> {
        val iconPath = selectVariant(state)
        val isSvg = iconPath.endsWith(".svg", ignoreCase = true)
        val painter = if (isSvg && svgLoader != null) {
            svgLoader.loadSvgResource(iconPath, resourceLoader) { iconPath }
        } else {
            painterResource(iconPath, resourceLoader)
        }

        return rememberUpdatedState(painter)
    }

    @Composable
    protected abstract fun selectVariant(state: T): String
}
