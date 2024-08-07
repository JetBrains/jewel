package org.jetbrains.jewel.foundation.lazy.selectable

/**
 * Specifies the selection mode for a selectable lazy list.
 */
public enum class SelectionMode {
    /**
     * No selection is allowed.
     */
    None,

    /**
     * Only a single cell can be selected.
     */
    Single,

    /**
     * Multiple cells can be selected.
     */
    Multiple,
}
