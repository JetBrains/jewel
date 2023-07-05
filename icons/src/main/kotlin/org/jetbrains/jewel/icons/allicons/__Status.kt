package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.status.Error
import org.jetbrains.jewel.icons.allicons.status.ErrorOutline
import org.jetbrains.jewel.icons.allicons.status.FailedInProgress
import org.jetbrains.jewel.icons.allicons.status.Info
import org.jetbrains.jewel.icons.allicons.status.InfoOutline
import org.jetbrains.jewel.icons.allicons.status.Success
import org.jetbrains.jewel.icons.allicons.status.Warning
import org.jetbrains.jewel.icons.allicons.status.WarningOutline
import kotlin.collections.List as ____KtList

public object StatusGroup

public val AllIcons.Status: StatusGroup
  get() = StatusGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val StatusGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(FailedInProgress, ErrorOutline, InfoOutline, WarningOutline, Warning, Info,
        Success, Error)
    return __AllAssets!!
  }
