package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.table.Pagination
import kotlin.collections.List as ____KtList

public object TableGroup

public val AllIcons.Table: TableGroup
  get() = TableGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val TableGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Pagination)
    return __AllAssets!!
  }
