package org.jetbrains.jewel.samples.standalone.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.samples.standalone.IntUiThemes
import org.jetbrains.jewel.samples.standalone.reflection.findViews

public object MainViewModel {

    public var theme: IntUiThemes by mutableStateOf(IntUiThemes.Light)

    public var swingCompat: Boolean by mutableStateOf(false)

    public val projectColor: Color
        get() = if (theme.isLightHeader()) {
            Color(0xFFF5D4C1)
        } else {
            Color(0xFF654B40)
        }

    public val views: SnapshotStateList<ViewInfo> =
        findViews("org.jetbrains.jewel.samples.standalone.view")
            .toMutableStateList()

    public var currentView: ViewInfo by mutableStateOf(views.first())
}
