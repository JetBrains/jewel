package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.debugger.DbPrimitive
import org.jetbrains.jewel.icons.allicons.debugger.Frame
import org.jetbrains.jewel.icons.allicons.debugger.Threads
import org.jetbrains.jewel.icons.allicons.debugger.Value
import org.jetbrains.jewel.icons.allicons.debugger.Watch
import kotlin.collections.List as ____KtList

public object DebuggerGroup

public val AllIcons.Debugger: DebuggerGroup
  get() = DebuggerGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val DebuggerGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Value, Threads, Watch, Frame, DbPrimitive)
    return __AllAssets!!
  }
