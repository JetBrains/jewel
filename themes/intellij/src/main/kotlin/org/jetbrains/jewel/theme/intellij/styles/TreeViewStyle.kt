package org.jetbrains.jewel.theme.intellij.styles

import androidx.compose.ui.text.TextStyle
import org.jetbrains.jewel.styles.ControlStyle

typealias TreeViewStyle = ControlStyle<TreeViewAppearance, TreeViewState>

enum class TreeViewState {
    DEFAULT
}

data class TreeViewAppearance(
    val labelsTextStyle: TextStyle
)
