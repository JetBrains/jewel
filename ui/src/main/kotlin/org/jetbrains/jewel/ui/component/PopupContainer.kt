package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.input.InputMode
import androidx.compose.ui.input.InputModeManager
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalInputModeManager
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.modifier.onHover
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.OverrideDarkMode
import org.jetbrains.jewel.ui.component.styling.LocalMenuStyle
import org.jetbrains.jewel.ui.component.styling.MenuStyle
import org.jetbrains.jewel.ui.theme.menuStyle

@Composable
public fun PopupContainer(
    onDismissRequest: (InputMode) -> Boolean,
    horizontalAlignment: Alignment.Horizontal,
    modifier: Modifier = Modifier,
    style: MenuStyle = JewelTheme.menuStyle, // TODO: replace with PopupContainerStyle (contained in MenuStyle)
    popupProperties: PopupProperties = PopupProperties(focusable = true),
    content: @Composable () -> Unit,
) {
    val popupPositionProvider =
        AnchorVerticalMenuPositionProvider(
            contentOffset = style.metrics.offset,
            contentMargin = style.metrics.menuMargin,
            alignment = horizontalAlignment,
            density = LocalDensity.current,
        )

    var focusManager: FocusManager? by remember { mutableStateOf(null) }
    var inputModeManager: InputModeManager? by remember { mutableStateOf(null) }
    val menuManager = remember(onDismissRequest) { MenuManager(onDismissRequest = onDismissRequest) }

    Popup(
        popupPositionProvider = popupPositionProvider,
        onDismissRequest = { onDismissRequest(InputMode.Touch) },
        properties = popupProperties,
        onPreviewKeyEvent = { false },
        onKeyEvent = {
            val currentFocusManager = checkNotNull(focusManager) { "FocusManager must not be null" }
            val currentInputModeManager = checkNotNull(inputModeManager) { "InputModeManager must not be null" }
            handlePopupMenuOnKeyEvent(it, currentFocusManager, currentInputModeManager, menuManager)
        },
    ) {
        focusManager = LocalFocusManager.current
        inputModeManager = LocalInputModeManager.current

        OverrideDarkMode(style.isDark) {
            CompositionLocalProvider(LocalMenuManager provides menuManager, LocalMenuStyle provides style) {
                val localMenuManager = LocalMenuManager.current
                val colors = style.colors
                val menuShape = RoundedCornerShape(style.metrics.cornerSize)

                Box(
                    modifier =
                        modifier
                            .shadow(
                                elevation = style.metrics.shadowSize,
                                shape = menuShape,
                                ambientColor = colors.shadow,
                                spotColor = colors.shadow,
                            )
                            .border(Stroke.Alignment.Inside, style.metrics.borderWidth, colors.border, menuShape)
                            .background(colors.background, menuShape)
                            .onHover { localMenuManager.onHoveredChange(it) }
                ) {
                    content()
                }
            }
        }
    }
}
