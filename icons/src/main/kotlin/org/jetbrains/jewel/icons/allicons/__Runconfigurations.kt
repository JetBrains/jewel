package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.runconfigurations.Application
import org.jetbrains.jewel.icons.allicons.runconfigurations.ApplicationRemote
import org.jetbrains.jewel.icons.allicons.runconfigurations.Compound
import org.jetbrains.jewel.icons.allicons.runconfigurations.InvalidConfigurationLayer
import org.jetbrains.jewel.icons.allicons.runconfigurations.Junit
import org.jetbrains.jewel.icons.allicons.runconfigurations.JunitTestMark
import org.jetbrains.jewel.icons.allicons.runconfigurations.SortByDuration
import org.jetbrains.jewel.icons.allicons.runconfigurations.WebApp
import kotlin.collections.List as ____KtList

public object RunconfigurationsGroup

public val AllIcons.Runconfigurations: RunconfigurationsGroup
  get() = RunconfigurationsGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val RunconfigurationsGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(WebApp, ApplicationRemote, Application, InvalidConfigurationLayer,
        SortByDuration, Junit, Compound, JunitTestMark)
    return __AllAssets!!
  }
