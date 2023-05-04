package org.jetbrains.jewel

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.ResourceLoader

typealias PainterProvider = @Composable () -> Painter

data class IntelliJPainters(
    val checkbox: CheckboxPainters,
    val radioButton: RadioButtonPainters,
    val treeView: TreeViewPainters,
    val painterResourceLoader: ResourceLoader = ResourceLoader.Default
) {

    data class TreeViewPainters(
        val arrow: PainterProvider
    ) {

        companion object
    }

    data class CheckboxPainters(
        val unselected: PainterProvider,
        val unselectedDisabled: PainterProvider,
        val unselectedFocused: PainterProvider,
        val selected: PainterProvider,
        val selectedDisabled: PainterProvider,
        val selectedFocused: PainterProvider,
        val indeterminate: PainterProvider,
        val indeterminateDisabled: PainterProvider,
        val indeterminateFocused: PainterProvider
    ) {

        companion object
    }

    data class RadioButtonPainters(
        val unselected: PainterProvider,
        val unselectedDisabled: PainterProvider,
        val unselectedFocused: PainterProvider,
        val selected: PainterProvider,
        val selectedDisabled: PainterProvider,
        val selectedFocused: PainterProvider
    ) {

        companion object
    }

    companion object
}
