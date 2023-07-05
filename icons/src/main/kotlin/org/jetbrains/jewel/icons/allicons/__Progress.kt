package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.progress.Pause
import org.jetbrains.jewel.icons.allicons.progress.PauseHovered
import org.jetbrains.jewel.icons.allicons.progress.Resume
import org.jetbrains.jewel.icons.allicons.progress.ResumeHovered
import org.jetbrains.jewel.icons.allicons.progress.Stop
import org.jetbrains.jewel.icons.allicons.progress.StopHovered
import kotlin.collections.List as ____KtList

public object ProgressGroup

public val AllIcons.Progress: ProgressGroup
  get() = ProgressGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val ProgressGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Resume, Stop, PauseHovered, ResumeHovered, Pause, StopHovered)
    return __AllAssets!!
  }
