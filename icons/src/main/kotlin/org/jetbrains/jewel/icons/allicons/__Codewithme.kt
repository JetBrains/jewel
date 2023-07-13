package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.codewithme.CwmAccess
import org.jetbrains.jewel.icons.allicons.codewithme.CwmAccess_20x20
import org.jetbrains.jewel.icons.allicons.codewithme.CwmDisableCall
import org.jetbrains.jewel.icons.allicons.codewithme.CwmEnableCall
import org.jetbrains.jewel.icons.allicons.codewithme.CwmIconModificator
import org.jetbrains.jewel.icons.allicons.codewithme.CwmIconModificator_14x14
import org.jetbrains.jewel.icons.allicons.codewithme.CwmIconModificator_20x20
import org.jetbrains.jewel.icons.allicons.codewithme.CwmInvite
import org.jetbrains.jewel.icons.allicons.codewithme.CwmUsers
import org.jetbrains.jewel.icons.allicons.codewithme.CwmUsers_20x20
import kotlin.collections.List as ____KtList

public object CodewithmeGroup

public val AllIcons.Codewithme: CodewithmeGroup
  get() = CodewithmeGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val CodewithmeGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(CwmIconModificator_14x14, CwmUsers, CwmAccess, CwmAccess_20x20, CwmInvite,
        CwmIconModificator, CwmEnableCall, CwmDisableCall, CwmUsers_20x20, CwmIconModificator_20x20)
    return __AllAssets!!
  }
