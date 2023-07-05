package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.build.Build
import org.jetbrains.jewel.icons.allicons.build.DependencyAnalyzer
import org.jetbrains.jewel.icons.allicons.build.Task
import org.jetbrains.jewel.icons.allicons.build.TaskGroup
import org.jetbrains.jewel.icons.allicons.build.ToggleOfflineMode
import org.jetbrains.jewel.icons.allicons.build.ToggleSkipTestsMode
import kotlin.collections.List as ____KtList

public object BuildGroup

public val AllIcons.Build: BuildGroup
  get() = BuildGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val BuildGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Task, DependencyAnalyzer, TaskGroup, Build, ToggleOfflineMode,
        ToggleSkipTestsMode)
    return __AllAssets!!
  }
