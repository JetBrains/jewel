package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.profiler.CollapseNode
import org.jetbrains.jewel.icons.allicons.profiler.ExpandNode
import org.jetbrains.jewel.icons.allicons.profiler.Rec
import kotlin.collections.List as ____KtList

public object ProfilerGroup

public val AllIcons.Profiler: ProfilerGroup
  get() = ProfilerGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val ProfilerGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(ExpandNode, CollapseNode, Rec)
    return __AllAssets!!
  }
