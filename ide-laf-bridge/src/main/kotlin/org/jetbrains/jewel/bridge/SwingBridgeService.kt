package org.jetbrains.jewel.bridge

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.TextStyle
import com.intellij.openapi.Disposable
import com.intellij.openapi.components.Service
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.ui.NewUI
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import org.jetbrains.jewel.IntelliJComponentStyling
import org.jetbrains.jewel.IntelliJSvgLoader
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.themes.PaletteMapperFactory
import org.jetbrains.jewel.themes.intui.core.IntUiThemeDefinition
import org.jetbrains.jewel.themes.intui.core.IntelliJSvgPatcher

@Service(Service.Level.APP)
class SwingBridgeService : Disposable, CoroutineScope {

    private val logger = thisLogger()

    // TODO replace with IDE-injected scope once our min IJP version is 232+
    override val coroutineContext = SupervisorJob() + CoroutineName("JewelSwingBridge")

    // TODO we shouldn't assume it's Int UI, but we only have that for now
    private val _themeDefinition = mutableStateOf(createBridgeIntUiDefinition(TextStyle.Default))
    private val _svgLoader = mutableStateOf(createSvgLoader(_themeDefinition.value))

    // TODO @lamberto fix this crap thx
    private val _componentStyling =
        mutableStateOf(runBlocking { createSwingIntUiComponentStyling(_themeDefinition.value, _svgLoader.value) })

    val themeDefinition: State<IntUiThemeDefinition> = _themeDefinition
    val componentStyling: State<IntelliJComponentStyling> = _componentStyling
    val svgLoader: State<SvgLoader> = _svgLoader

    init {
        IntelliJApplication.lookAndFeelFlow
            .onEach {
                val isIntUi = NewUI.isEnabled()

                if (!isIntUi) {
                    // TODO return Darcula/IntelliJ Light theme instead
                    logger.warn("Darcula LaFs (aka \"old UI\") are not supported yet, falling back to Int UI")
                }

                val themeDefinition = createBridgeIntUiDefinition()
                val svgLoader = createSvgLoader(themeDefinition)

                _themeDefinition.value = themeDefinition
                _svgLoader.value = svgLoader
                _componentStyling.value = createSwingIntUiComponentStyling(themeDefinition, svgLoader)
            }
            .flowOn(Dispatchers.Default)
            .launchIn(this)
    }

    private fun createSvgLoader(theme: IntUiThemeDefinition): IntelliJSvgLoader {
        val paletteMapper = PaletteMapperFactory.create(theme.isDark, theme.iconData, theme.colorPalette)
        val svgPatcher = IntelliJSvgPatcher(paletteMapper)
        return IntelliJSvgLoader(svgPatcher)
    }

    override fun dispose() {
        cancel("Disposing Application...")
    }
}
