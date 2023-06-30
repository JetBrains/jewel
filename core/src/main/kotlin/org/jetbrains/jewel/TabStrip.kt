package org.jetbrains.jewel

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.platform.LocalLayoutDirection

@Composable
fun TabStrip(
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: TabStripScope.() -> Unit,
) {
    val tabsData by remember(content) {
        derivedStateOf {
            content.asList()
        }
    }
    var isHovered by remember { mutableStateOf(false) }
    val scrollState = rememberScrollState()
    Box(
        Modifier
            .onPointerEvent(PointerEventType.Enter) {
                isHovered = true
            }
            .onPointerEvent(PointerEventType.Exit) {
                isHovered = false
            }
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .horizontalScroll(scrollState)
                .scrollable(
                    orientation = Orientation.Vertical,
                    reverseDirection = ScrollableDefaults.reverseDirection(
                        LocalLayoutDirection.current,
                        Orientation.Vertical,
                        false
                    ),
                    enabled = isHovered,
                    state = scrollState,
                    interactionSource = interactionSource
                )
        ) {
            tabsData.forEach {
                Tab(
                    it.selected,
                    it.tabNameString,
                    it.tabIconResource,
                    it.closable,
                    interactionSource,
                    when (it.styleType) {
                        TabStyleType.Default -> IntelliJTheme.defaultTabStyle
                        TabStyleType.Editor -> IntelliJTheme.editorTabStyle
                    },
                    it.onTabClose,
                    it.onTabClick
                )
            }
        }
        if (isHovered) {
            Box(
                modifier =
                Modifier
                    .matchParentSize()
            ) {
                HorizontalScrollbar(
                    rememberScrollbarAdapter(scrollState),
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

enum class TabStyleType {
    Default, Editor
}

interface TabStripScope {

    fun tab(
        selected: Boolean,
        tabNameString: String,
        tabIconResource: String? = null,
        closable: Boolean = true,
        styleType: TabStyleType = TabStyleType.Default,
        onTabClose: () -> Unit = {},
        onTabClick: () -> Unit = {},
    )

    fun tabs(
        tabsCount: Int,
        selected: (Int) -> Boolean,
        tabNameString: (Int) -> String,
        tabIconResource: (Int) -> String?,
        closable: (Int) -> Boolean,
        styleType: (Int) -> TabStyleType,
        onTabClose: (Int) -> Unit,
        onTabClick: (Int) -> Unit,
    )
}

internal class TabData(
    val selected: Boolean,
    val tabNameString: String,
    val tabIconResource: String? = null,
    val closable: Boolean = true,
    val styleType: TabStyleType = TabStyleType.Default,
    val onTabClose: () -> Unit = {},
    val onTabClick: () -> Unit = {},
)

private fun (TabStripScope.() -> Unit).asList() = buildList {
    this@asList(
        object : TabStripScope {
            override fun tab(
                selected: Boolean,
                tabNameString: String,
                tabIconResource: String?,
                closable: Boolean,
                styleType: TabStyleType,
                onTabClose: () -> Unit,
                onTabClick: () -> Unit,
            ) {
                add(
                    TabData(
                        selected = selected,
                        tabNameString = tabNameString,
                        tabIconResource = tabIconResource,
                        closable = closable,
                        styleType = styleType,
                        onTabClose = onTabClose,
                        onTabClick = onTabClick
                    )
                )
            }

            override fun tabs(
                tabsCount: Int,
                selected: (Int) -> Boolean,
                tabNameString: (Int) -> String,
                tabIconResource: (Int) -> String?,
                closable: (Int) -> Boolean,
                styleType: (Int) -> TabStyleType,
                onTabClose: (Int) -> Unit,
                onTabClick: (Int) -> Unit,
            ) {
                repeat(tabsCount) {
                    tab(
                        selected(it),
                        tabNameString(it),
                        tabIconResource(it),
                        closable(it),
                        styleType(it),
                        { onTabClose(it) },
                        { onTabClick(it) }
                    )
                }
            }
        }
    )
}
