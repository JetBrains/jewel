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
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
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
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import androidx.compose.ui.window.WindowPlacement
import com.jetbrains.JBR
import com.jetbrains.WindowDecorations.CustomTitleBar
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.isActive
import org.jetbrains.jewel.IntelliJTheme
import org.jetbrains.jewel.LocalContentColor
import org.jetbrains.jewel.window.styling.TitleBarStyle
import org.jetbrains.jewel.window.utils.DesktopPlatform
import org.jetbrains.jewel.window.utils.macos.MacUtil
import java.awt.Dialog
import java.awt.Frame
import java.awt.Window
import java.awt.event.ComponentEvent
import java.awt.event.ComponentListener
import java.awt.event.WindowEvent
import java.awt.event.WindowFocusListener
import kotlin.math.max

internal const val TITLE_BAR_COMPONENT_LAYOUT_ID_PREFIX = "__TITLE_BAR_"

internal const val TITLE_BAR_LAYOUT_ID = "__TITLE_BAR_CONTENT__"

internal const val TITLE_BAR_BORDER_LAYOUT_ID = "__TITLE_BAR_BORDER__"

@Composable fun DecoratedWindowScope.TitleBar(
    modifier: Modifier = Modifier,
    gradientStartColor: Color = Color.Unspecified,
    style: TitleBarStyle = IntelliJTheme.defaultTitleBarStyle,
    content: @Composable TitleBarScope.() -> Unit,
) {
    when (DesktopPlatform.Current) {
        DesktopPlatform.Linux -> TODO()
        DesktopPlatform.Windows -> TODO()
        DesktopPlatform.MacOS -> TitleBarOnMacOs(modifier, gradientStartColor, style, content)
        DesktopPlatform.Unknown -> TODO()
    }
}

@Composable internal fun DecoratedWindowScope.TitleBarImpl(
    modifier: Modifier = Modifier,
    gradientStartColor: Color = Color.Unspecified,
    style: TitleBarStyle = IntelliJTheme.defaultTitleBarStyle,
    onSizeChanged: (IntSize, TitleBarState) -> Unit,
    calculateTitleBarInsets: (CustomTitleBar, TitleBarState) -> PaddingValues,
    content: @Composable TitleBarScope.() -> Unit,
) {
    val titleBar = LocalTitleBar.current
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
        val componentListener = object : ComponentListener {
            override fun componentResized(e: ComponentEvent?) {
                titleBarState = titleBarState.copy(fullscreen = window.placement == WindowPlacement.Fullscreen)
            }

            override fun componentMoved(e: ComponentEvent?) = Unit

            override fun componentShown(e: ComponentEvent?) = Unit

            override fun componentHidden(e: ComponentEvent?) = Unit
        }
        val focusListener = object : WindowFocusListener {
            override fun windowGainedFocus(e: WindowEvent?) {
                titleBarState = titleBarState.copy(active = true)
            }

            override fun windowLostFocus(e: WindowEvent?) {
                titleBarState = titleBarState.copy(active = false)
            }
        }
        window.addComponentListener(componentListener)
        window.addWindowFocusListener(focusListener)
        onDispose {
            window.removeComponentListener(componentListener)
            window.removeWindowFocusListener(focusListener)
        }
    }

    Layout(
        {
            CompositionLocalProvider(
                LocalContentColor provides style.colors.content,
            ) {
                val scope = TitleBarScopeImpl(titleBarInfo.title, titleBarInfo.icon)
                scope.content()
            }
        },
        modifier.background(backgroundBrush).layoutId(TITLE_BAR_LAYOUT_ID).height(style.metrics.height).onSizeChanged {
            onSizeChanged(it, titleBarState)
        }.fillMaxWidth().pointerInput(Unit) {
            val currentContext = currentCoroutineContext()
            awaitPointerEventScope {
                while (currentContext.isActive) {
                    val event = awaitPointerEvent(PointerEventPass.Main)
                    event.changes.forEach {
                        if (!it.isConsumed) {
                            titleBar.forceHitTest(false)
                            it.consume()
                        }
                    }
                }
            }
        },
        measurePolicy = rememberTitleBarMeasurePolicy(
            LocalWindow.current,
            titleBarState,
            titleBar,
            calculateTitleBarInsets,
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

    fun copy(
        fullscreen: Boolean = isFullscreen,
        active: Boolean = isActive,
    ) = of(
        fullscreen = fullscreen,
        active = active,
    )

    override fun toString() = "${javaClass.simpleName}(isFullscreen=$isFullscreen, isActive=$isActive)"

    companion object {

        val Active = 1UL shl 0
        val Fullscreen = 1UL shl 1

        fun of(
            fullscreen: Boolean = false,
            active: Boolean = true,
        ) = TitleBarState(
            state = (if (fullscreen) Fullscreen else 0UL) or (if (active) Active else 0UL),
        )

        fun of(
            window: ComposeWindow,
        ) = of(window.placement == WindowPlacement.Fullscreen, window.isActive)
    }
}

internal class TitleBarMeasurePolicy(
    private val window: Window,
    private val state: TitleBarState,
    private val titleBar: CustomTitleBar,
    private val calculateTitleBarInsets: (CustomTitleBar, TitleBarState) -> PaddingValues,
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
        titleBar.height = boxHeight.toDp().value
        when (window) {
            is Dialog -> JBR.getWindowDecorations().setCustomTitleBar(window, titleBar)
            is Frame -> JBR.getWindowDecorations().setCustomTitleBar(window, titleBar)
        }

        val contentPadding = calculateTitleBarInsets(titleBar, state)
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
    titleBar: CustomTitleBar,
    calculateTitleBarInsets: (CustomTitleBar, TitleBarState) -> PaddingValues,
): MeasurePolicy {
    return remember(window, state, calculateTitleBarInsets) {
        TitleBarMeasurePolicy(
            window,
            state,
            titleBar,
            calculateTitleBarInsets,
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
