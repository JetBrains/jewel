package org.jetbrains.jewel.styles

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.BottomLineShape
import org.jetbrains.jewel.IntelliJPalette
import org.jetbrains.jewel.Orientation
import org.jetbrains.jewel.ShapeStroke
import org.jetbrains.jewel.components.state.TabState
import org.jetbrains.jewel.styles.state.ButtonMouseState

typealias TabStyle = ControlStyle<TabState, TabAppearance>

@Immutable
data class TabAppearance(
    val textStyle: TextStyle = TextStyle.Default,
    val backgroundColor: Color = Color.Unspecified,
    val shapeStroke: ShapeStroke<*>? = null,
    val shape: Shape = RectangleShape,

    val contentPadding: PaddingValues = PaddingValues(16.dp, 8.dp),
    val contentArrangement: Arrangement.Horizontal = Arrangement.Start,
    val contentAlignment: Alignment.Vertical = Alignment.Top,

    val adornmentStroke: ShapeStroke<*>? = null,
    val adornmentShape: Shape? = null,
    val minWidth: Dp = 64.dp,
    val minHeight: Dp = 32.dp
)

val LocalTabStyle = compositionLocalOf<TabStyle> { localNotProvided() }
val Styles.tab: TabStyle
    @Composable
    @ReadOnlyComposable
    get() = LocalTabStyle.current

fun TabStyle(
    palette: IntelliJPalette,
    typography: TextStyle
): TabStyle = TabStyle {
    Orientation.values().forEach { orientation ->
        when (orientation) {
            Orientation.Horizontal -> HorizontalTabStyle(palette, typography)
            Orientation.Vertical -> VerticalTabStyle(palette, typography)
        }
    }
}

private fun HorizontalTabStyle(
    palette: IntelliJPalette,
    typography: TextStyle
) = TabStyle {
    val defaultState = TabState()
    for (mouseState in ButtonMouseState.values()) {
        val appearance = when (mouseState) {
            ButtonMouseState.None ->
                TabAppearance(
                    contentAlignment = Alignment.Bottom,
                    contentArrangement = Arrangement.Center,
                    textStyle = typography.copy(palette.text)
                )

            ButtonMouseState.Hovered, ButtonMouseState.Pressed -> {
                TabAppearance(
                    contentAlignment = Alignment.Bottom,
                    contentArrangement = Arrangement.Center,
                    textStyle = typography.copy(palette.text),
                    backgroundColor = palette.tab.hoveredBackgroundColor
                )
            }
        }
        state(defaultState.copy(mouseState), appearance)
    }
    state(
        defaultState.copy(selected = true),
        TabAppearance(
            contentAlignment = Alignment.Bottom,
            contentArrangement = Arrangement.Center,
            textStyle = typography.copy(palette.text),
            adornmentShape = BottomLineShape,
            adornmentStroke = ShapeStroke.SolidColor(3.dp, palette.tab.underlineColor)
        )
    )
}

private fun VerticalTabStyle(
    palette: IntelliJPalette,
    typography: TextStyle
) = TabStyle {
    val defaultState = TabState().copy(tabType = Orientation.Vertical)
    for (mouseState in ButtonMouseState.values()) {
        val appearance = when (mouseState) {
            ButtonMouseState.None ->
                TabAppearance(
                    contentAlignment = Alignment.CenterVertically,
                    contentArrangement = Arrangement.Start,
                    textStyle = typography.copy(palette.text),
                    backgroundColor = palette.background
                )

            ButtonMouseState.Hovered, ButtonMouseState.Pressed -> {
                TabAppearance(
                    contentAlignment = Alignment.CenterVertically,
                    contentArrangement = Arrangement.Start,
                    textStyle = typography.copy(palette.text),
                    backgroundColor = palette.tab.hoveredBackgroundColor
                )
            }
        }
        state(defaultState.copy(mouseState), appearance)
    }
    state(
        state = defaultState.copy(selected = true),
        appearance = TabAppearance(
            contentAlignment = Alignment.Bottom,
            contentArrangement = Arrangement.Center,
            textStyle = typography.copy(palette.text),
            adornmentShape = BottomLineShape,
            adornmentStroke = ShapeStroke.SolidColor(3.dp, palette.tab.underlineColor)
        )
    )

    state(
        state = defaultState.copy(selected = true),
        appearance = TabAppearance(
            contentAlignment = Alignment.CenterVertically,
            contentArrangement = Arrangement.Start,
            textStyle = typography.copy(palette.text),
            adornmentStroke = ShapeStroke.SolidColor(1.dp, palette.tab.underlineColor)
        )
    )
}
