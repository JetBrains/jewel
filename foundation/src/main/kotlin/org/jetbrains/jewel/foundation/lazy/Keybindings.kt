package org.jetbrains.jewel.foundation.lazy

import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.input.key.isCtrlPressed
import androidx.compose.ui.input.key.isMetaPressed
import androidx.compose.ui.input.key.isShiftPressed
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers
import androidx.compose.ui.input.pointer.isCtrlPressed
import androidx.compose.ui.input.pointer.isMetaPressed
import androidx.compose.ui.input.pointer.isShiftPressed

interface SelectableColumnKeybindings {

    val KeyEvent.isContiguousSelectionKeyPressed: Boolean

    val PointerKeyboardModifiers.isContiguousSelectionKeyPressed: Boolean

    val KeyEvent.isMultiSelectionKeyPressed: Boolean

    val PointerKeyboardModifiers.isMultiSelectionKeyPressed: Boolean

    /**
     * Select First Node
     */
    fun KeyEvent.selectFirstItem(): Boolean?

    /**
     * Extend Selection to First Node inherited from Move Caret to Text Start with Selection
     */
    fun KeyEvent.extendSelectionToFirstItem(): Boolean?

    /**
     * Select Last Node inherited from Move Caret to Text End
     */
    fun KeyEvent.selectLastItem(): Boolean?

    /**
     * Extend Selection to Last Node inherited from Move Caret to Text End with Selection
     */
    fun KeyEvent.extendSelectionToLastItem(): Boolean?

    /**
     * Select Previous Node inherited from Up
     */
    fun KeyEvent.selectPreviousItem(): Boolean?

    /**
     * Extend Selection with Previous Node inherited from Up with Selection
     */
    fun KeyEvent.extendSelectionWithPreviousItem(): Boolean?

    /**
     * Select Next Node inherited from Down
     */
    fun KeyEvent.selectNextItem(): Boolean?

    /**
     * Extend Selection with Next Node inherited from Down with Selection
     */
    fun KeyEvent.extendSelectionWithNextItem(): Boolean?

    /**
     * Scroll Page Up and Select Node inherited from Page Up
     */
    fun KeyEvent.scrollPageUpAndSelectItem(): Boolean?

    /**
     * Scroll Page Up and Extend Selection inherited from Page Up with Selection
     */
    fun KeyEvent.scrollPageUpAndExtendSelection(): Boolean?

    /**
     * Scroll Page Down and Select Node inherited from Page Down
     */
    fun KeyEvent.scrollPageDownAndSelectItem(): Boolean?

    /**
     * Scroll Page Down and Extend Selection inherited from Page Down with Selection
     */
    fun KeyEvent.scrollPageDownAndExtendSelection(): Boolean?

    /**
     * Edit item
     */
    fun KeyEvent.edit(): Boolean?

    /**
     * SelectAll
     */
    fun KeyEvent.selectAll(): Boolean?
}

open class DefaultMacOsSelectableColumnKeybindings : DefaultSelectableColumnKeybindings() {

    companion object : DefaultMacOsSelectableColumnKeybindings()

    override val KeyEvent.isMultiSelectionKeyPressed: Boolean
        get() = isMetaPressed

    override val PointerKeyboardModifiers.isMultiSelectionKeyPressed: Boolean
        get() = isMetaPressed
}

open class DefaultSelectableColumnKeybindings : SelectableColumnKeybindings {

    override val KeyEvent.isContiguousSelectionKeyPressed: Boolean
        get() = isShiftPressed

    override val PointerKeyboardModifiers.isContiguousSelectionKeyPressed: Boolean
        get() = isShiftPressed

    override val KeyEvent.isMultiSelectionKeyPressed: Boolean
        get() = isCtrlPressed

    override val PointerKeyboardModifiers.isMultiSelectionKeyPressed: Boolean
        get() = isCtrlPressed

    companion object : DefaultSelectableColumnKeybindings()

    override fun KeyEvent.selectFirstItem() =
        key == Key.Home && !isContiguousSelectionKeyPressed

    override fun KeyEvent.extendSelectionToFirstItem() =
        key == Key.Home && isContiguousSelectionKeyPressed

    override fun KeyEvent.selectLastItem() =
        key == Key.MoveEnd && !isContiguousSelectionKeyPressed

    override fun KeyEvent.extendSelectionToLastItem() =
        key == Key.MoveEnd && isContiguousSelectionKeyPressed

    override fun KeyEvent.selectPreviousItem() =
        key == Key.DirectionUp && !isContiguousSelectionKeyPressed

    override fun KeyEvent.extendSelectionWithPreviousItem() =
        key == Key.DirectionUp && isContiguousSelectionKeyPressed

    override fun KeyEvent.selectNextItem() =
        key == Key.DirectionDown && !isContiguousSelectionKeyPressed

    override fun KeyEvent.extendSelectionWithNextItem() =
        key == Key.DirectionDown && isContiguousSelectionKeyPressed

    override fun KeyEvent.scrollPageUpAndSelectItem() =
        key == Key.PageUp && !isContiguousSelectionKeyPressed

    override fun KeyEvent.scrollPageUpAndExtendSelection() =
        key == Key.PageUp && isContiguousSelectionKeyPressed

    override fun KeyEvent.scrollPageDownAndSelectItem() =
        key == Key.PageDown && !isContiguousSelectionKeyPressed

    override fun KeyEvent.scrollPageDownAndExtendSelection() =
        key == Key.PageDown && isContiguousSelectionKeyPressed

    override fun KeyEvent.edit() = false

    override fun KeyEvent.selectAll(): Boolean? =
        key == Key.A && isMultiSelectionKeyPressed
}
