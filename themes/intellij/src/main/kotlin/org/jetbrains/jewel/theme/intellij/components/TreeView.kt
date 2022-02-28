package org.jetbrains.jewel.theme.intellij.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.MouseClickScope
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.PointerButtons
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import java.io.File
import java.nio.file.Path

@Immutable
data class Tree<T>(val head: Element<T>) {

    sealed class Element<T> {

        abstract val data: T
        abstract val isSelected: Boolean

        abstract fun withSelection(isSelected: Boolean = this.isSelected): Element<T>

        @Immutable
        data class Leaf<T>(override val data: T, override val isSelected: Boolean) : Element<T>() {

            override fun withSelection(isSelected: Boolean) = copy(isSelected = isSelected)
        }

        @Immutable
        data class Node<T>(
            override val data: T,
            override val isSelected: Boolean,
            val isOpen: Boolean = false,
            val children: List<Element<T>>
        ) : Element<T>() {

            override fun withSelection(isSelected: Boolean) = copy(isSelected = isSelected)
        }
    }

    data class ElementWithDepth<T>(val treeElement: Element<T>, val depth: Int)

    val flattenedTree = buildList {
        val stack = mutableListOf(head.withDepth(0))
        while (stack.isNotEmpty()) {
            val next = stack.removeAt(0)
            add(next)
            if (next.treeElement is Element.Node<T> && next.treeElement.isOpen) {
                stack.addAll(0, next.treeElement.children.map { it.withDepth(next.depth + 1) })
            }
        }
    }

    /**
     * Replaces the first occurrence of [old] in this [Tree] while traversing in depth first.
     *
     * @return Always a new [Tree], eventually with [old] replaced with [new].
     */
    fun replaceElement(old: Element<T>, new: Element<T>): Tree<T> = if (old != new)
        Tree(replaceRecursive(old, new, head, ItemFound(false)))
    else this

    fun selectOnly(element: Element<T>) =
        Tree(replaceAndApplyOnAllRecursive(head) { if (it == element) it.withSelection(true) else it.withSelection(false) })

    fun selectElements(elements: Set<Element<T>>) = if (elements.isNotEmpty())
        Tree(replaceAndApplyOnAllRecursive(head) { if (it in elements) it.withSelection(true) else it.withSelection(false) })
    else this

    private data class ItemFound(var value: Boolean)

    private fun replaceAndApplyOnAllRecursive(
        current: Element<T>,
        action: (Element<T>) -> Element<T>
    ): Element<T> = action(current).let {
        when (it) {
            is Element.Leaf -> it
            is Element.Node -> it.copy(children = it.children.map { replaceAndApplyOnAllRecursive(it, action) })
        }
    }

    private fun replaceRecursive(
        old: Element<T>,
        new: Element<T>,
        current: Element<T>,
        found: ItemFound
    ): Element<T> = when {
        found.value -> current
        current == old -> {
            found.value = true
            new
        }
        current is Element.Node<T> -> current.copy(children = current.children.map { replaceRecursive(old, new, it, found) })
        else -> current
    }
}

fun <T> Tree.Element<T>.withDepth(depth: Int) =
    Tree.ElementWithDepth(this, depth)

fun File.asTree(isOpen: Boolean = false) = Tree(asTreeElement(isOpen))
fun Path.asTree(isOpen: Boolean = false) = Tree(toFile().asTreeElement(isOpen))

fun File.asTreeElement(isOpen: Boolean = false): Tree.Element<File> =
    if (isFile) Tree.Element.Leaf(this, false) else Tree.Element.Node(
        data = this,
        isSelected = false,
        isOpen = isOpen,
        children = listFiles()?.sortedBy {
            when {
                it.isDirectory -> "a"
                else -> "b"
            } + it.name
        }?.map { it.asTreeElement(isOpen) } ?: emptyList()
    )

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun <T> TreeView(
    tree: Tree<T>,
    arrowPainter: Painter,
    onTreeNodeToggle: (Tree.Element.Node<T>) -> Unit,
    onTreeElementClick: MouseClickScope.(Tree.Element<T>) -> Unit,
    onTreeElementDoubleClick: (Tree.Element<T>) -> Unit,
    indentWidth: Dp = 24.dp,
    modifier: Modifier = Modifier,
    nodeContent: @Composable RowScope.(Tree.Element.Node<T>) -> Unit,
    leafContent: @Composable RowScope.(Tree.Element.Leaf<T>) -> Unit,
) {
    LazyColumn(modifier = modifier) {
        items(tree.flattenedTree) { (treeElement, depth) ->
            Row(
                modifier = Modifier
                    .appendIf(treeElement.isSelected) { background(Color.Red) }
                    .combinedClickable(
                        onClick = { EmptyClickContext.onTreeElementClick(treeElement) },
                        onDoubleClick = { onTreeElementDoubleClick(treeElement) }
                    )
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(Modifier.padding(start = depth * indentWidth, end = 4.dp))
                when (treeElement) {
                    is Tree.Element.Leaf -> {
                        Box(modifier = Modifier.alpha(0f).paint(arrowPainter))
                        leafContent(treeElement)
                    }
                    is Tree.Element.Node -> {
                        val rotation by animateFloatAsState(if (treeElement.isOpen) 90f else 0f)
                        Box(
                            modifier = Modifier.rotate(rotation)
                                .paint(painter = arrowPainter)
                                .fillMaxHeight()
                                .clickable { onTreeNodeToggle(treeElement) }
                        )
                        nodeContent(treeElement)
                    }
                }
            }
        }
    }
}

internal fun Modifier.appendIf(condition: Boolean, transformer: Modifier.() -> Modifier): Modifier =
    if (!condition) this else transformer()

private val EmptyClickContext = MouseClickScope(
    PointerButtons(0), PointerKeyboardModifiers(0)
)
