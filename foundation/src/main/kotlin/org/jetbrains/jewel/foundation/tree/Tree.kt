package org.jetbrains.jewel.foundation.tree

import org.jetbrains.jewel.foundation.tree.Tree.Element.Node

@Suppress("UNCHECKED_CAST")
fun <T> emptyTree() = Tree.EMPTY as Tree<T>

class Tree<T> internal constructor(val roots: List<Element<T>>) {

    companion object {
        internal val EMPTY = Tree(roots = emptyList<Element<Any?>>())
    }

    fun isEmpty() = roots.isEmpty()

    private fun walk(breathFirst: Boolean) = sequence {
        val queue = roots.toMutableList()
        while (queue.isNotEmpty()) {
            val next = queue.removeFirst()
            yield(next)
            if (next is Node) {
                next.open()
                if (breathFirst) {
                    queue.addAll(next.children.orEmpty())
                } else {
                    queue.addAll(0, next.children.orEmpty())
                }
            }
        }
    }

    fun walkBreadthFirst() = walk(true)
    fun walkDepthFirst() = walk(false)

    sealed interface Element<T> {

        val data: T
        val depth: Int
        val parent: Element<T>?
        val childIndex: Int
        var next: Element<T>?
        var previous: Element<T>?
        val id: Any

        fun path() = buildList {
            var next: Element<T>? = this@Element
            while (next != null) {
                add(next)
                next = next.parent
            }
        }.reversed()

        fun previousElementsIterable() = Iterable { elementIterator(previous) { it.previous } }
        fun nextElementsIterable() = Iterable { elementIterator(next) { it.next } }

        class Leaf<T>(
            override val data: T,
            override val depth: Int,
            override val childIndex: Int,
            override val parent: Element<T>?,
            override var previous: Element<T>?,
            override var next: Element<T>?,
            override val id: Any,
        ) : Element<T>

        class Node<T>(
            override val data: T,
            override val depth: Int,
            override val childIndex: Int,
            override val parent: Element<T>?,
            private val childrenGenerator: (parent: Node<T>) -> List<Element<T>>,
            override var next: Element<T>?,
            override var previous: Element<T>?,
            override val id: Any,
        ) : Element<T> {

            var children: List<Element<T>>? = null
                private set

            private fun evaluateChildren() {
                children = childrenGenerator(this)
            }

            private fun connectChildren() {
                val children = children ?: return
                if (children.isNotEmpty()) {
                    next?.also {
                        it.previous = children.last()
                        children.last().next = it
                    }
                    next = children.first()
                    children.first().previous = this
                }
            }

            private fun detachChildren() {
                val children = children ?: return
                if (children.isNotEmpty()) {
                    next = children.last().next
                    next?.previous = this
                }
            }

            fun open(reloadChildren: Boolean = false) {
                if (reloadChildren || children == null) evaluateChildren()
                connectChildren()
            }

            fun close() {
                detachChildren()
                children?.asSequence()
                    ?.filterIsInstance<Node<*>>()
                    ?.forEach { it.closeRecursively() }
            }

            private fun closeRecursively() {
                children?.forEach { if (it is Node) it.closeRecursively() }
            }
        }
    }
}

private fun <T> elementIterator(initial: Tree.Element<T>?, next: (Tree.Element<T>) -> Tree.Element<T>?) = iterator {
    var current = initial ?: return@iterator
    yield(current)
    while (true) {
        current = next(current) ?: break
        yield(current)
    }
}
