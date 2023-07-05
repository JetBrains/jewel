package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.graph.GraphLayout
import kotlin.collections.List as ____KtList

public object GraphGroup

public val AllIcons.Graph: GraphGroup
  get() = GraphGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val GraphGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(GraphLayout)
    return __AllAssets!!
  }
