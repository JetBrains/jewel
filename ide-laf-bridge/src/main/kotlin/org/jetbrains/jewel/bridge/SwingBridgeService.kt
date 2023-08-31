package org.jetbrains.jewel.bridge

import androidx.compose.ui.text.TextStyle
import com.intellij.openapi.Disposable
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.Service.Level
import com.intellij.openapi.diagnostic.thisLogger
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import org.jetbrains.jewel.IntelliJComponentStyling
import org.jetbrains.jewel.IntelliJSvgLoader
import org.jetbrains.jewel.themes.intui.core.IntUiThemeDefinition

@Service(Level.APP)
class SwingBridgeService @JvmOverloads constructor(
    private val coroutineScope: CoroutineScope = CoroutineScope(SupervisorJob() + CoroutineName("JewelSwingBridge")),
) : Disposable {

    data class Components(
        val themeDefinition: IntUiThemeDefinition,
        val svgLoader: IntelliJSvgLoader,
        val componentStyling: IntelliJComponentStyling,
    ) {
        companion object {
            val DEFAULT = run {
                val themeDefinition = createBridgeIntUiDefinition(TextStyle.Default)
                val svgLoader = createSvgLoader(themeDefinition)
                Components(
                    themeDefinition = createBridgeIntUiDefinition(TextStyle.Default),
                    svgLoader = createSvgLoader(themeDefinition),
                    componentStyling = createSwingIntUiComponentStyling(
                        theme = themeDefinition,
                        svgLoader = svgLoader,
                        textFieldStyle = TextStyle.Default,
                        dropdownTextStyle = TextStyle.Default,
                        labelTextStyle = TextStyle.Default,
                        linkTextStyle = TextStyle.Default,
                    ),
                )
            }
        }
    }

    private val logger = thisLogger()

    // TODO we shouldn't assume it's Int UI, but we only have that for now
    val components: StateFlow<Components> = IntelliJApplication.lookAndFeelStateFlow(coroutineScope)
        .map { (_, isIntUi) ->

            if (!isIntUi) {
                // TODO return Darcula/IntelliJ Light theme instead
                logger.warn("Darcula LaFs (aka \"old UI\") are not supported yet, falling back to Int UI")
            }

            val themeDefinition = createBridgeIntUiDefinition()
            val svgLoader = createSvgLoader(themeDefinition)
            Components(
                themeDefinition = createBridgeIntUiDefinition(),
                svgLoader = svgLoader,
                componentStyling = createSwingIntUiComponentStyling(themeDefinition, svgLoader),
            )
        }
        .stateIn(coroutineScope, SharingStarted.Eagerly, Components.DEFAULT)

    // TODO remove when min IJ is 232+
    override fun dispose() = coroutineScope.cancel("Disposing Application...")
}
