package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.javaee.Home
import org.jetbrains.jewel.icons.allicons.javaee.PersistenceEntity
import org.jetbrains.jewel.icons.allicons.javaee.UpdateRunningApplication
import org.jetbrains.jewel.icons.allicons.javaee.WebModuleGroup
import org.jetbrains.jewel.icons.allicons.javaee.WebService
import org.jetbrains.jewel.icons.allicons.javaee.WebServiceClient
import kotlin.collections.List as ____KtList

public object JavaeeGroup

public val AllIcons.Javaee: JavaeeGroup
  get() = JavaeeGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val JavaeeGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Home, WebService, PersistenceEntity, UpdateRunningApplication,
        WebModuleGroup, WebServiceClient)
    return __AllAssets!!
  }
