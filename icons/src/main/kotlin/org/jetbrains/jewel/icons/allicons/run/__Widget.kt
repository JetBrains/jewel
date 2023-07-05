package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunGroup
import org.jetbrains.jewel.icons.allicons.run.widget.Build
import org.jetbrains.jewel.icons.allicons.run.widget.Loader
import org.jetbrains.jewel.icons.allicons.run.widget.Restart
import kotlin.collections.List as ____KtList

public object WidgetGroup

public val RunGroup.Widget: WidgetGroup
  get() = WidgetGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val WidgetGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Restart, Build, Loader)
    return __AllAssets!!
  }
