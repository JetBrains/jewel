package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.windows.Close
import org.jetbrains.jewel.icons.allicons.windows.CloseActive
import org.jetbrains.jewel.icons.allicons.windows.CloseInactive
import org.jetbrains.jewel.icons.allicons.windows.CloseSmall
import org.jetbrains.jewel.icons.allicons.windows.Collapse
import org.jetbrains.jewel.icons.allicons.windows.Help
import org.jetbrains.jewel.icons.allicons.windows.HelpInactive
import org.jetbrains.jewel.icons.allicons.windows.Maximize
import org.jetbrains.jewel.icons.allicons.windows.MaximizeInactive
import org.jetbrains.jewel.icons.allicons.windows.MaximizeSmall
import org.jetbrains.jewel.icons.allicons.windows.Minimize
import org.jetbrains.jewel.icons.allicons.windows.MinimizeInactive
import org.jetbrains.jewel.icons.allicons.windows.MinimizeSmall
import org.jetbrains.jewel.icons.allicons.windows.Restore
import org.jetbrains.jewel.icons.allicons.windows.RestoreInactive
import org.jetbrains.jewel.icons.allicons.windows.RestoreSmall
import kotlin.collections.List as ____KtList

public object WindowsGroup

public val AllIcons.Windows: WindowsGroup
  get() = WindowsGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val WindowsGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(CloseSmall, CloseInactive, Maximize, Minimize, Collapse, Close, CloseActive,
        MinimizeSmall, MinimizeInactive, MaximizeSmall, HelpInactive, RestoreSmall, Restore, Help,
        RestoreInactive, MaximizeInactive)
    return __AllAssets!!
  }
