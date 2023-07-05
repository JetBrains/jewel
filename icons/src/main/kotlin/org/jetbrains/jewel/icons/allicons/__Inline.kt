package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.`inline`.Browse
import org.jetbrains.jewel.icons.allicons.`inline`.Collapse
import org.jetbrains.jewel.icons.allicons.`inline`.Copy
import org.jetbrains.jewel.icons.allicons.`inline`.ExactWords
import org.jetbrains.jewel.icons.allicons.`inline`.Expand
import org.jetbrains.jewel.icons.allicons.`inline`.InlineAdd
import org.jetbrains.jewel.icons.allicons.`inline`.InlineEdit
import org.jetbrains.jewel.icons.allicons.`inline`.InlineSettings
import org.jetbrains.jewel.icons.allicons.`inline`.MatchCase
import org.jetbrains.jewel.icons.allicons.`inline`.NewLine
import org.jetbrains.jewel.icons.allicons.`inline`.PreserveCase
import org.jetbrains.jewel.icons.allicons.`inline`.Refresh
import org.jetbrains.jewel.icons.allicons.`inline`.Regex
import org.jetbrains.jewel.icons.allicons.`inline`.SearchHistory
import org.jetbrains.jewel.icons.allicons.`inline`.Variables
import kotlin.collections.List as ____KtList

public object InlineGroup

public val AllIcons.Inline: InlineGroup
  get() = InlineGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val InlineGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Variables, NewLine, SearchHistory, InlineSettings, Regex, Expand, Collapse,
        MatchCase, ExactWords, Copy, Refresh, Browse, InlineAdd, InlineEdit, PreserveCase)
    return __AllAssets!!
  }
