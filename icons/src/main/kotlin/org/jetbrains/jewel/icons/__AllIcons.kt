package org.jetbrains.jewel.icons

import androidx.compose.ui.graphics.vector.ImageVector
import org.jetbrains.jewel.icons.allicons.Actions
import org.jetbrains.jewel.icons.allicons.AllAssets
import kotlin.collections.List as ____KtList

public object AllIcons

private var __AllAssets: ____KtList<ImageVector>? = null

public val AllIcons.AllAssets: ____KtList<ImageVector>
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= Actions.AllAssets + listOf()
    return __AllAssets!!
  }
