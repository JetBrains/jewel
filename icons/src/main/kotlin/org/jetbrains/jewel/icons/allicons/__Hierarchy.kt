package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.hierarchy.Subtypes
import org.jetbrains.jewel.icons.allicons.hierarchy.Supertypes
import kotlin.collections.List as ____KtList

public object HierarchyGroup

public val AllIcons.Hierarchy: HierarchyGroup
  get() = HierarchyGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val HierarchyGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Supertypes, Subtypes)
    return __AllAssets!!
  }
