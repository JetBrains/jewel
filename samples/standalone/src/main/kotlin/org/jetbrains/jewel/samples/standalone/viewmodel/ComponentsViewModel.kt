package org.jetbrains.jewel.samples.standalone.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import org.jetbrains.jewel.samples.standalone.view.component.Borders
import org.jetbrains.jewel.samples.standalone.view.component.Buttons
import org.jetbrains.jewel.samples.standalone.view.component.Checkboxes
import org.jetbrains.jewel.samples.standalone.view.component.ChipsAndTrees
import org.jetbrains.jewel.samples.standalone.view.component.Dropdowns
import org.jetbrains.jewel.samples.standalone.view.component.Icons
import org.jetbrains.jewel.samples.standalone.view.component.Links
import org.jetbrains.jewel.samples.standalone.view.component.ProgressBar
import org.jetbrains.jewel.samples.standalone.view.component.RadioButtons
import org.jetbrains.jewel.samples.standalone.view.component.Scrollbars
import org.jetbrains.jewel.samples.standalone.view.component.SegmentedControls
import org.jetbrains.jewel.samples.standalone.view.component.Sliders
import org.jetbrains.jewel.samples.standalone.view.component.Tabs
import org.jetbrains.jewel.samples.standalone.view.component.TextAreas
import org.jetbrains.jewel.samples.standalone.view.component.TextFields
import org.jetbrains.jewel.ui.icon.PathIconKey

object ComponentsViewModel {
    val views = componentsMenuItems.toMutableStateList()

    var currentView by mutableStateOf(views.first())
}

private val componentsMenuItems = setOf(
    ViewInfo(
        title = "Buttons",
        PathIconKey("icons/components/button.svg", View::class.java),
        content = { Buttons() }
    ),
    ViewInfo(
        title = "Radio Buttons",
        PathIconKey("icons/components/radioButton.svg", View::class.java),
        content = { RadioButtons() }
    ),
    ViewInfo(
        title = "Checkboxes",
        PathIconKey("icons/components/checkBox.svg", View::class.java),
        content = { Checkboxes() }
    ),
    ViewInfo(
        title = "Dropdowns",
        PathIconKey("icons/components/comboBox.svg", View::class.java),
        content = { Dropdowns() }
    ),
    ViewInfo(
        title = "Chips and trees",
        PathIconKey("icons/components/tree.svg", View::class.java),
        content = { ChipsAndTrees() }
    ),
    ViewInfo(
        title = "Progressbar",
        PathIconKey("icons/components/progressbar.svg", View::class.java),
        content = { ProgressBar() }
    ),
    ViewInfo(
        title = "Icons",
        PathIconKey("icons/components/toolbar.svg", View::class.java),
        content = { Icons() }
    ),
    ViewInfo(
        title = "Links",
        PathIconKey("icons/components/links.svg", View::class.java),
        content = { Links() }
    ),
    ViewInfo(
        title = "Borders",
        PathIconKey("icons/components/borders.svg", View::class.java),
        content = { Borders() }
    ),
    ViewInfo(
        title = "Segmented Controls",
        PathIconKey("icons/components/segmentedControl.svg", View::class.java),
        content = { SegmentedControls() }
    ),
    ViewInfo(
        title = "Sliders",
        PathIconKey("icons/components/slider.svg", View::class.java),
        content = { Sliders() }
    ),
    ViewInfo(
        title = "Tabs",
        PathIconKey("icons/components/tabs.svg", View::class.java),
        content = { Tabs() }
    ),
    ViewInfo(
        title = "TextAreas",
        PathIconKey("icons/components/textArea.svg", View::class.java),
        content = { TextAreas() }
    ),
    ViewInfo(
        title = "TextFields",
        PathIconKey("icons/components/textField.svg", View::class.java),
        content = { TextFields() }
    ),
    ViewInfo(
        title = "Scrollbars",
        PathIconKey("icons/components/scrollbar.svg", View::class.java),
        content = { Scrollbars() }
    ),
)
