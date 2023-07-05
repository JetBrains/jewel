package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.meetnewui.DarkTheme
import org.jetbrains.jewel.icons.allicons.meetnewui.DarkThemeSelected
import org.jetbrains.jewel.icons.allicons.meetnewui.LightTheme
import org.jetbrains.jewel.icons.allicons.meetnewui.LightThemeSelected
import org.jetbrains.jewel.icons.allicons.meetnewui.SystemTheme
import org.jetbrains.jewel.icons.allicons.meetnewui.SystemThemeSelected
import kotlin.collections.List as ____KtList

public object MeetnewuiGroup

public val AllIcons.Meetnewui: MeetnewuiGroup
  get() = MeetnewuiGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val MeetnewuiGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(SystemThemeSelected, LightTheme, DarkThemeSelected, SystemTheme, DarkTheme,
        LightThemeSelected)
    return __AllAssets!!
  }
