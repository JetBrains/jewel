package org.jetbrains.jewel.icons.allicons.general

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.GeneralGroup
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsError
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsErrorEmpty
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsEye
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsMixed
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsOK
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsOKEmpty
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsPause
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsPowerSaveMode
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsTrafficOff
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsTypos
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsWarning
import org.jetbrains.jewel.icons.allicons.general.inspections.InspectionsWarningEmpty
import kotlin.collections.List as ____KtList

public object InspectionsGroup

public val GeneralGroup.Inspections: InspectionsGroup
  get() = InspectionsGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val InspectionsGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(InspectionsOK, InspectionsErrorEmpty, InspectionsTrafficOff,
        InspectionsOKEmpty, InspectionsPowerSaveMode, InspectionsWarning, InspectionsWarningEmpty,
        InspectionsTypos, InspectionsEye, InspectionsMixed, InspectionsPause, InspectionsError)
    return __AllAssets!!
  }
