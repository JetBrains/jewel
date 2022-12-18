package org.jetbrains.jewel.themes.expui.standalone

import androidx.compose.ui.res.painterResource
import org.jetbrains.jewel.IntelliJPainters

val IntelliJPainters.Companion.light
    get() = IntelliJPainters(
        checkbox = IntelliJPainters.CheckboxPainters.light,
        radioButton = IntelliJPainters.RadioButtonPainters.light,
        treeView = IntelliJPainters.TreeViewPainters.light
    )

val IntelliJPainters.Companion.dark
    get() = IntelliJPainters(
        checkbox = IntelliJPainters.CheckboxPainters.dark,
        radioButton = IntelliJPainters.RadioButtonPainters.dark,
        treeView = IntelliJPainters.TreeViewPainters.dark
    )

val IntelliJPainters.CheckboxPainters.Companion.light
    get() = IntelliJPainters.CheckboxPainters(
        unselected = { painterResource("expui/light/checkBox.svg") },
        unselectedDisabled = { painterResource("expui/light/checkBoxDisabled.svg") },
        unselectedFocused = { painterResource("expui/light/checkBoxFocused.svg") },
        selected = { painterResource("expui/light/checkBoxSelected.svg") },
        selectedDisabled = { painterResource("expui/light/checkBoxSelectedDisabled.svg") },
        selectedFocused = { painterResource("expui/light/checkBoxSelectedFocused.svg") },
        indeterminate = { painterResource("expui/light/checkBoxIndeterminateSelected.svg") },
        indeterminateDisabled = { painterResource("expui/light/checkBoxIndeterminateSelectedDisabled.svg") },
        indeterminateFocused = { painterResource("expui/light/checkBoxIndeterminateSelectedFocused.svg") }
    )

val IntelliJPainters.CheckboxPainters.Companion.dark
    get() = IntelliJPainters.CheckboxPainters(
        unselected = { painterResource("expui/dark/checkBox.svg") },
        unselectedDisabled = { painterResource("expui/dark/checkBoxDisabled.svg") },
        unselectedFocused = { painterResource("expui/dark/checkBoxFocused.svg") },
        selected = { painterResource("expui/dark/checkBoxSelected.svg") },
        selectedDisabled = { painterResource("expui/dark/checkBoxSelectedDisabled.svg") },
        selectedFocused = { painterResource("expui/dark/checkBoxSelectedFocused.svg") },
        indeterminate = { painterResource("expui/dark/checkBoxIndeterminateSelected.svg") },
        indeterminateDisabled = { painterResource("expui/dark/checkBoxIndeterminateSelectedDisabled.svg") },
        indeterminateFocused = { painterResource("expui/dark/checkBoxIndeterminateSelectedFocused.svg") }
    )

val IntelliJPainters.RadioButtonPainters.Companion.light
    get() = IntelliJPainters.RadioButtonPainters(
        unselected = { painterResource("expui/light/radio.svg") },
        unselectedDisabled = { painterResource("expui/light/radioDisabled.svg") },
        unselectedFocused = { painterResource("expui/light/radioFocused.svg") },
        selected = { painterResource("expui/light/radioSelected.svg") },
        selectedDisabled = { painterResource("expui/light/radioSelectedDisabled.svg") },
        selectedFocused = { painterResource("expui/light/radioSelectedFocused.svg") }
    )

val IntelliJPainters.RadioButtonPainters.Companion.dark
    get() = IntelliJPainters.RadioButtonPainters(
        unselected = { painterResource("expui/dark/radio.svg") },
        unselectedDisabled = { painterResource("expui/dark/radioDisabled.svg") },
        unselectedFocused = { painterResource("expui/dark/radioFocused.svg") },
        selected = { painterResource("expui/dark/radioSelected.svg") },
        selectedDisabled = { painterResource("expui/dark/radioSelectedDisabled.svg") },
        selectedFocused = { painterResource("expui/dark/radioSelectedFocused.svg") }
    )

val IntelliJPainters.TreeViewPainters.Companion.light
    get() = IntelliJPainters.TreeViewPainters(
        arrow = { painterResource("intellij/chevronRight.svg") }
    )

val IntelliJPainters.TreeViewPainters.Companion.dark
    get() = IntelliJPainters.TreeViewPainters(
        arrow = { painterResource("expui/dark/chevronRight.svg") }
    )
