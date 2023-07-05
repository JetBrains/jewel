package org.jetbrains.jewel.icons.allicons.python

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.PythonGroup
import org.jetbrains.jewel.icons.allicons.python.toolwindow.PythonConsole
import org.jetbrains.jewel.icons.allicons.python.toolwindow.`PythonConsole@20x20`
import kotlin.collections.List as ____KtList

public object ToolwindowGroup

public val PythonGroup.Toolwindow: ToolwindowGroup
  get() = ToolwindowGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val ToolwindowGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(PythonConsole, `PythonConsole@20x20`)
    return __AllAssets!!
  }
