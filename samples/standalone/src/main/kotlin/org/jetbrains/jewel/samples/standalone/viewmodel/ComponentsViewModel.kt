package org.jetbrains.jewel.samples.standalone.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import org.jetbrains.jewel.samples.standalone.reflection.findViews

public object ComponentsViewModel {

    public val views: SnapshotStateList<ViewInfo> =
        findViews("org.jetbrains.jewel.samples.standalone.view.component")
            .toMutableStateList()

    public var currentView: ViewInfo by mutableStateOf(views.first())
}
