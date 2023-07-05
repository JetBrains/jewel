package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.welcome.CreateNewProjectTab
import org.jetbrains.jewel.icons.allicons.welcome.FromVCSTab
import org.jetbrains.jewel.icons.allicons.welcome.Open
import kotlin.collections.List as ____KtList

public object WelcomeGroup

public val AllIcons.Welcome: WelcomeGroup
  get() = WelcomeGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val WelcomeGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(CreateNewProjectTab, Open, FromVCSTab)
    return __AllAssets!!
  }
