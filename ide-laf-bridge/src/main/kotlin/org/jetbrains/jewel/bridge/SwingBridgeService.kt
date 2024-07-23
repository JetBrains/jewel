package org.jetbrains.jewel.bridge

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.Service.Level
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn
import org.jetbrains.jewel.bridge.theme.createBridgeComponentStyling
import org.jetbrains.jewel.bridge.theme.createBridgeThemeDefinition
import org.jetbrains.jewel.foundation.theme.ThemeDefinition
import org.jetbrains.jewel.ui.ComponentStyling
import kotlin.time.Duration.Companion.milliseconds

@Service(Level.APP)
internal class SwingBridgeService(scope: CoroutineScope) {
    internal val currentBridgeThemeData: StateFlow<BridgeThemeData> =
        IntelliJApplication.lookAndFeelChangedFlow(scope)
            .mapLatest { tryGettingThemeData() }
            .stateIn(scope, SharingStarted.Eagerly, BridgeThemeData.DEFAULT)

    private suspend fun tryGettingThemeData(): BridgeThemeData {
        var counter = 0
        while (counter < 20) {
            delay(20.milliseconds)
            counter++
            runCatching { readThemeData() }
                .onSuccess {
                    return it
                }
        }
        return readThemeData()
    }

    private fun readThemeData(): BridgeThemeData {
        val themeDefinition = createBridgeThemeDefinition()
        return BridgeThemeData(
            themeDefinition = createBridgeThemeDefinition(),
            componentStyling = createBridgeComponentStyling(themeDefinition),
        )
    }

    internal data class BridgeThemeData(
        val themeDefinition: ThemeDefinition,
        val componentStyling: ComponentStyling,
    ) {
        companion object {
            val DEFAULT =
                run {
                    val textStyle = TextStyle.Default.copy(fontSize = 13.sp)
                    val monospaceTextStyle = textStyle.copy(fontFamily = FontFamily.Monospace)
                    val themeDefinition = createBridgeThemeDefinition(textStyle, monospaceTextStyle, monospaceTextStyle)

                    BridgeThemeData(
                        themeDefinition = themeDefinition,
                        componentStyling =
                            createBridgeComponentStyling(
                                theme = themeDefinition,
                                textFieldTextStyle = textStyle,
                                textAreaTextStyle = textStyle,
                                linkTextStyle = textStyle,
                            ),
                    )
                }
        }
    }
}
