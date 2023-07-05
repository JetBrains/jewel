package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.toolbar.Unknown
import org.jetbrains.jewel.icons.allicons.toolbar.`Unknown@20x20`
import kotlin.collections.List as ____KtList

public object ToolbarGroup

public val AllIcons.Toolbar: ToolbarGroup
  get() = ToolbarGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val ToolbarGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Unknown, `Unknown@20x20`)
    return __AllAssets!!
  }
