package org.jetbrains.jewel

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.res.ResourceLoader
import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope
import org.jetbrains.jewel.foundation.tree.*
import org.jetbrains.jewel.styling.LazyTreeStyle

@ExperimentalJewelApi
@Composable
fun <T> LazyTree(
    tree: Tree<T>,
    resourceLoader: ResourceLoader,
    modifier: Modifier = Modifier,
    onElementClick: (Tree.Element<T>) -> Unit,
    treeState: TreeState = rememberTreeState(),
    onElementDoubleClick: (Tree.Element<T>) -> Unit = {},
    onSelectionChange: (List<Tree.Element<T>>) -> Unit = {},
    keyActions: KeyBindingActions = DefaultTreeViewKeyActions(treeState),
    style: LazyTreeStyle = IntelliJTheme.treeStyle,
    nodeContent: @Composable SelectableLazyItemScope.(Tree.Element<T>) -> Unit,
) {
    val colors = style.colors
    val metrics = style.metrics
    BasicLazyTree(
        tree = tree,
        onElementClick = onElementClick,
        elementBackgroundFocused = colors.elementBackgroundFocused,
        elementBackgroundSelectedFocused = colors.elementBackgroundSelectedFocused,
        elementBackgroundSelected = colors.elementBackgroundSelected,
        indentSize = metrics.indentSize,
        elementBackgroundCornerSize = metrics.elementBackgroundCornerSize,
        elementPadding = metrics.elementPadding,
        elementContentPadding = metrics.elementContentPadding,
        elementMinHeight = metrics.elementMinHeight,
        chevronContentGap = metrics.chevronContentGap,
        treeState = treeState,
        modifier = modifier,
        onElementDoubleClick = onElementDoubleClick,
        onSelectionChange = onSelectionChange,
        keyActions = keyActions,
        chevronContent = { state ->
            Box(Modifier.rotate(if (state.isExpanded) 90f else 0f)) {
                Icon(
                    painter = painterResource(style.icons.nodeChevron, resourceLoader),
                    contentDescription = "Dropdown link",
                    tint = colors.chevronTintFor(state).value
                )
            }
        },
        nodeContent = {
            CompositionLocalProvider(
                LocalContentColor provides (
                    style.colors.contentFor(
                        TreeElementState.of(
                            isActive,
                            isSelected,
                            false
                        )
                    ).value
                        .takeOrElse { LocalContentColor.current }
                    )
            ) { nodeContent(it) }
        }
    )
}
