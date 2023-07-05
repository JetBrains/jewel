package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.image.ActualZoom
import org.jetbrains.jewel.icons.allicons.image.ColorPicker
import org.jetbrains.jewel.icons.allicons.image.FitContent
import org.jetbrains.jewel.icons.allicons.image.Grid
import org.jetbrains.jewel.icons.allicons.image.ZoomIn
import org.jetbrains.jewel.icons.allicons.image.ZoomOut
import kotlin.collections.List as ____KtList

public object ImageGroup

public val AllIcons.Image: ImageGroup
  get() = ImageGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val ImageGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Grid, ZoomIn, ActualZoom, FitContent, ColorPicker, ZoomOut)
    return __AllAssets!!
  }
