package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.OverrideDarkMode
import org.jetbrains.jewel.ui.component.styling.MenuStyle
import org.jetbrains.jewel.ui.theme.menuStyle

@Composable
public fun PopupContainer(
    onDismissRequest: () -> Unit,
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
    Popup(
        popupPositionProvider = popupPositionProvider,
        onDismissRequest = onDismissRequest,
        properties = popupProperties,
    ) {
        OverrideDarkMode(style.isDark) {
            val colors = style.colors
            val popupShape = RoundedCornerShape(style.metrics.cornerSize)

            Box(
                modifier =
                    modifier
                        .shadow(
                            elevation = style.metrics.shadowSize,
                            shape = popupShape,
                            ambientColor = colors.shadow,
                            spotColor = colors.shadow,
                        )
                        .border(Stroke.Alignment.Inside, style.metrics.borderWidth, colors.border, popupShape)
                        .background(colors.background, popupShape)
            ) {
                content()
            }
        }
    }
}
