package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.objectbrowser.CompactEmptyPackages
import org.jetbrains.jewel.icons.allicons.objectbrowser.FlattenModules
import org.jetbrains.jewel.icons.allicons.objectbrowser.FlattenPackages
import org.jetbrains.jewel.icons.allicons.objectbrowser.SortAlphabetically
import org.jetbrains.jewel.icons.allicons.objectbrowser.SortByType
import org.jetbrains.jewel.icons.allicons.objectbrowser.SortByUsage
import org.jetbrains.jewel.icons.allicons.objectbrowser.SortByVisibility
import kotlin.collections.List as ____KtList

public object ObjectbrowserGroup

public val AllIcons.Objectbrowser: ObjectbrowserGroup
  get() = ObjectbrowserGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val ObjectbrowserGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(CompactEmptyPackages, SortByVisibility, FlattenModules, SortAlphabetically,
        FlattenPackages, SortByUsage, SortByType)
    return __AllAssets!!
  }
