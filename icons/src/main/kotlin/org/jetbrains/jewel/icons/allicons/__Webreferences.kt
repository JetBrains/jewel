package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.webreferences.Server
import kotlin.collections.List as ____KtList

public object WebreferencesGroup

public val AllIcons.Webreferences: WebreferencesGroup
  get() = WebreferencesGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val WebreferencesGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Server)
    return __AllAssets!!
  }
