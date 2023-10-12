package org.jetbrains.jewel.window

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.ComposeWindow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.isUnspecified
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.ParentDataModifierNode
import androidx.compose.ui.platform.InspectableValue
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.NoInspectorInfo
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import androidx.compose.ui.window.WindowPlacement
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.LocalContentColor
import org.jetbrains.jewel.onBackground
import org.jetbrains.jewel.styling.LocalIconButtonStyle
import org.jetbrains.jewel.window.styling.TitleBarStyle
import org.jetbrains.jewel.window.utils.DesktopPlatform
import org.jetbrains.jewel.window.utils.macos.MacUtil
import java.awt.Window
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import kotlin.math.max

internal const val TITLE_BAR_COMPONENT_LAYOUT_ID_PREFIX = "__TITLE_BAR_"

internal const val TITLE_BAR_LAYOUT_ID = "__TITLE_BAR_CONTENT__"

internal const val TITLE_BAR_BORDER_LAYOUT_ID = "__TITLE_BAR_BORDER__"

@Composable fun DecoratedWindowScope.TitleBar(
    modifier: Modifier = Modifier,
    gradientStartColor: Color = Color.Unspecified,
    style: TitleBarStyle = IntelliJTheme.defaultTitleBarStyle,
    content: @Composable TitleBarScope.(TitleBarState) -> Unit,
) {
    when (DesktopPlatform.Current) {
        DesktopPlatform.Linux -> TitleBarOnLinux(modifier, gradientStartColor, style, content)
        DesktopPlatform.Windows -> TitleBarOnWindows(modifier, gradientStartColor, style, content)
        DesktopPlatform.MacOS -> TitleBarOnMacOs(modifier, gradientStartColor, style, content)
        DesktopPlatform.Unknown -> error("TitleBar is not supported on this platform(${System.getProperty("os.name")})")
    }
}

@Composable internal fun DecoratedWindowScope.TitleBarImpl(
    modifier: Modifier = Modifier,
    gradientStartColor: Color = Color.Unspecified,
    style: TitleBarStyle = IntelliJTheme.defaultTitleBarStyle,
    applyTitleBar: (Dp, TitleBarState) -> PaddingValues,
    content: @Composable TitleBarScope.(TitleBarState) -> Unit,
) {
    val titleBarInfo = LocalTitleBarInfo.current

    var titleBarState by remember { mutableStateOf(TitleBarState.of(window)) }

    val background by style.colors.backgroundFor(titleBarState)

    val density = LocalDensity.current

    val backgroundBrush = remember(background, gradientStartColor) {
        if (gradientStartColor.isUnspecified) {
            SolidColor(background)
        } else {
            with(density) {
                Brush.horizontalGradient(
                    0.0f to background,
                    0.5f to gradientStartColor,
                    1.0f to background,
                    startX = style.metrics.gradientStartX.toPx(),
                    endX = style.metrics.gradientEndX.toPx(),
                )
            }
        }
    }

    DisposableEffect(window) {
        val adapter = object : WindowAdapter() {
            override fun windowActivated(e: WindowEvent?) {
                titleBarState = TitleBarState.of(window)
            }

            override fun windowDeactivated(e: WindowEvent?) {
                titleBarState = TitleBarState.of(window)
            }

            override fun windowIconified(e: WindowEvent?) {
                titleBarState = TitleBarState.of(window)
            }

            override fun windowDeiconified(e: WindowEvent?) {
                titleBarState = TitleBarState.of(window)
            }

            override fun windowStateChanged(e: WindowEvent) {
                titleBarState = TitleBarState.of(window)
            }
        }
        window.addWindowListener(adapter)
        window.addWindowStateListener(adapter)
        onDispose {
            window.removeWindowListener(adapter)
            window.removeWindowStateListener(adapter)
        }
    }

    Layout(
        {
            CompositionLocalProvider(
                LocalContentColor provides style.colors.content,
                LocalIconButtonStyle provides style.iconButtonStyle(),
            ) {
                onBackground(background) {
                    val scope = TitleBarScopeImpl(titleBarInfo.title, titleBarInfo.icon)
                    scope.content(titleBarState)
                }
            }
        },
        modifier.background(backgroundBrush).layoutId(TITLE_BAR_LAYOUT_ID).height(style.metrics.height).onSizeChanged {
            with(density) {
                applyTitleBar(it.height.toDp(), titleBarState)
            }
        }.fillMaxWidth(),
        measurePolicy = rememberTitleBarMeasurePolicy(
            LocalWindow.current,
            titleBarState,
            applyTitleBar,
        ),
    )

    Spacer(Modifier.layoutId(TITLE_BAR_BORDER_LAYOUT_ID).height(1.dp).fillMaxWidth().background(style.colors.border))
}

@Immutable @JvmInline
value class TitleBarState(val state: ULong) {

    @Stable val isActive: Boolean
        get() = state and Active != 0UL

    @Stable val isFullscreen: Boolean
        get() = state and Fullscreen != 0UL

    @Stable val isMinimized: Boolean
        get() = state and Minimize != 0UL

    @Stable val isMaximized: Boolean
        get() = state and Maximize != 0UL

    fun copy(
        fullscreen: Boolean = isFullscreen,
        minimized: Boolean = isMinimized,
        maximized: Boolean = isMaximized,
        active: Boolean = isActive,
    ) = of(
        fullscreen = fullscreen,
        minimized = minimized,
        maximized = maximized,
        active = active,
    )

    override fun toString() = "${javaClass.simpleName}(isFullscreen=$isFullscreen, isActive=$isActive)"

    companion object {

        val Active = 1UL shl 0
        val Fullscreen = 1UL shl 1
        val Minimize = 1UL shl 2
        val Maximize = 1UL shl 3

        fun of(
            fullscreen: Boolean = false,
            minimized: Boolean = false,
            maximized: Boolean = false,
            active: Boolean = true,
        ) = TitleBarState(
            state = (if (fullscreen) Fullscreen else 0UL) or
                (if (minimized) Minimize else 0UL) or
                (if (maximized) Maximize else 0UL) or
                (if (active) Active else 0UL),
        )

        fun of(
            window: ComposeWindow,
        ) = of(
            window.placement == WindowPlacement.Fullscreen,
            window.isMinimized,
            window.placement == WindowPlacement.Maximized,
            window.isActive,
        )
    }
}

internal class TitleBarMeasurePolicy(
    private val window: Window,
    private val state: TitleBarState,
    private val applyTitleBar: (Dp, TitleBarState) -> PaddingValues,
) : MeasurePolicy {

    override fun MeasureScope.measure(measurables: List<Measurable>, constraints: Constraints): MeasureResult {
        if (measurables.isEmpty()) {
            return layout(
                constraints.minWidth,
                constraints.minHeight,
            ) {}
        }

        var occupiedSpaceHorizontally = 0

        var maxSpaceVertically = constraints.minHeight
        val contentConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val measuredPlaceable = mutableListOf<Pair<Measurable, Placeable>>()

        for (it in measurables) {
            val placeable = it.measure(contentConstraints.offset(horizontal = -occupiedSpaceHorizontally))
            if (constraints.maxWidth < occupiedSpaceHorizontally + placeable.width) {
                break
            }
            occupiedSpaceHorizontally += placeable.width
            maxSpaceVertically = max(maxSpaceVertically, placeable.height)
            measuredPlaceable += it to placeable
        }

        val boxHeight = maxSpaceVertically

        val contentPadding = applyTitleBar(boxHeight.toDp(), state)

        val leftInset = contentPadding.calculateLeftPadding(LayoutDirection.Ltr).roundToPx()
        val rightInset = contentPadding.calculateRightPadding(LayoutDirection.Ltr).roundToPx()

        occupiedSpaceHorizontally += leftInset
        occupiedSpaceHorizontally += rightInset

        val boxWidth = maxOf(constraints.minWidth, occupiedSpaceHorizontally)

        return layout(boxWidth, boxHeight) {
            if (state.isFullscreen) {
                MacUtil.updateFullScreenButtons(window)
            }
            val placeableGroups = measuredPlaceable.groupBy { (measurable, _) ->
                (measurable.parentData as? TitleBarChildDataNode)?.horizontalAlignment ?: Alignment.CenterHorizontally
            }

            var headUsedSpace = leftInset
            var trailerUsedSpace = rightInset

            placeableGroups[Alignment.Start]?.forEach { (measurable, placeable) ->
                val x = headUsedSpace
                val y = Alignment.CenterVertically.align(placeable.height, boxHeight)
                placeable.placeRelative(x, y)
                headUsedSpace += placeable.width
            }
            placeableGroups[Alignment.End]?.forEach { (measurable, placeable) ->
                val x = boxWidth - placeable.width - trailerUsedSpace
                val y = Alignment.CenterVertically.align(placeable.height, boxHeight)
                placeable.placeRelative(x, y)
                trailerUsedSpace += placeable.width
            }

            val centerPlaceable = placeableGroups[Alignment.CenterHorizontally] ?: listOf()

            val requiredCenterSpace = centerPlaceable.sumOf { it.second.width }
            val minX = headUsedSpace
            val maxX = boxWidth - trailerUsedSpace - requiredCenterSpace
            var centerX = (boxWidth - requiredCenterSpace) / 2

            if (minX <= maxX) {
                if (centerX > maxX) {
                    centerX = maxX
                }
                if (centerX < minX) {
                    centerX = minX
                }

                centerPlaceable.forEach { (measurable, placeable) ->
                    val x = centerX
                    val y = Alignment.CenterVertically.align(placeable.height, boxHeight)
                    placeable.placeRelative(x, y)
                    centerX += placeable.width
                }
            }
        }
    }
}

@Composable internal fun rememberTitleBarMeasurePolicy(
    window: Window,
    state: TitleBarState,
    applyTitleBar: (Dp, TitleBarState) -> PaddingValues,
): MeasurePolicy {
    return remember(window, state, applyTitleBar) {
        TitleBarMeasurePolicy(
            window,
            state,
            applyTitleBar,
        )
    }
}

interface TitleBarScope {

    val title: String

    val icon: Painter?

    @Stable fun Modifier.align(alignment: Alignment.Horizontal): Modifier
}

private class TitleBarScopeImpl(
    override val title: String,
    override val icon: Painter?,
) : TitleBarScope {

    override fun Modifier.align(alignment: Alignment.Horizontal): Modifier {
        return then(
            TitleBarChildDataElement(
                alignment,
                inspectorInfo = debugInspectorInfo {
                    name = "align"
                    value = alignment
                },
            ),
        )
    }
}

private class TitleBarChildDataElement(
    val horizontalAlignment: Alignment.Horizontal,
    val inspectorInfo: InspectorInfo.() -> Unit = NoInspectorInfo,
) : ModifierNodeElement<TitleBarChildDataNode>(), InspectableValue {

    override fun create(): TitleBarChildDataNode = TitleBarChildDataNode(horizontalAlignment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        val otherModifier = other as? TitleBarChildDataElement ?: return false
        return horizontalAlignment == otherModifier.horizontalAlignment
    }

    override fun hashCode(): Int = horizontalAlignment.hashCode()

    override fun update(node: TitleBarChildDataNode) {
        node.horizontalAlignment = horizontalAlignment
    }

    override fun InspectorInfo.inspectableProperties() {
        inspectorInfo()
    }
}

private class TitleBarChildDataNode(
    var horizontalAlignment: Alignment.Horizontal,
) : ParentDataModifierNode, Modifier.Node() {

    override fun Density.modifyParentData(parentData: Any?) = this@TitleBarChildDataNode
}
