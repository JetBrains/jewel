package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.python.AllAssets
import org.jetbrains.jewel.icons.allicons.python.Toolwindow
import kotlin.collections.List as ____KtList

public object PythonGroup

public val AllIcons.Python: PythonGroup
  get() = PythonGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val PythonGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= Toolwindow.AllAssets + listOf()
    return __AllAssets!!
  }
