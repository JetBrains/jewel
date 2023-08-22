package org.jetbrains.jewel.bridge

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.intellij.openapi.Disposable
import com.intellij.openapi.components.Service
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.ui.JBColor
import com.intellij.ui.NewUI
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.jetbrains.jewel.IntelliJComponentStyling
import org.jetbrains.jewel.PaletteMapper
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.themes.intui.core.IntUiThemeDefinition
import org.jetbrains.jewel.themes.intui.core.IntelliJSvgLoader
import org.jetbrains.jewel.themes.intui.core.IntelliJSvgPatcher
import org.jetbrains.jewel.themes.PaletteMapperFactory
import org.jetbrains.jewel.themes.intui.standalone.IntUiTheme

@Service(Service.Level.APP)
class SwingBridgeService : Disposable, CoroutineScope {

    private val logger = thisLogger()

    override val coroutineContext = SupervisorJob() + CoroutineName("JewelSwingBridge")

    private val _svgLoader = mutableStateOf(createDummySvgLoader())

    // TODO we shouldn't assume it's Int UI, but we only have that for now
    private val _themeDefinition = mutableStateOf(
        if (JBColor.isBright()) IntUiTheme.lightThemeDefinition() else IntUiTheme.darkThemeDefinition()
    )

    private val _componentStyling = mutableStateOf(
        if (JBColor.isBright()) {
            IntUiTheme.lightComponentStyling(_svgLoader.value)
        } else {
            IntUiTheme.darkComponentStyling(_svgLoader.value)
        }
    )

    // TODO this isn't great to depend on at this stage (initial state computation)
    private fun createDummySvgLoader(): SvgLoader {
        val paletteMapper = PaletteMapper(emptyMap())
        val svgPatcher = IntelliJSvgPatcher(paletteMapper)
        return IntelliJSvgLoader(svgPatcher)
    }

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
                _componentStyling.value = createSwingLaFComponentStyling(themeDefinition, svgLoader)
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
