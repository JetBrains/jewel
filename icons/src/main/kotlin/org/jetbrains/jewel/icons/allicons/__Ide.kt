package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.ide.ConfigFile
import org.jetbrains.jewel.icons.allicons.ide.ExternalLink
import org.jetbrains.jewel.icons.allicons.ide.FeedbackRating
import org.jetbrains.jewel.icons.allicons.ide.FeedbackRatingFocused
import org.jetbrains.jewel.icons.allicons.ide.FeedbackRatingFocusedOn
import org.jetbrains.jewel.icons.allicons.ide.FeedbackRatingOn
import org.jetbrains.jewel.icons.allicons.ide.LocalScope
import kotlin.collections.List as ____KtList

public object IdeGroup

public val AllIcons.Ide: IdeGroup
  get() = IdeGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val IdeGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(LocalScope, FeedbackRating, FeedbackRatingOn, FeedbackRatingFocused,
        ConfigFile, ExternalLink, FeedbackRatingFocusedOn)
    return __AllAssets!!
  }
