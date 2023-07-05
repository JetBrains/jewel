package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.actions.BuildAutoReloadChanges
import org.jetbrains.jewel.icons.allicons.actions.ClearCash
import org.jetbrains.jewel.icons.allicons.actions.Deploy
import org.jetbrains.jewel.icons.allicons.actions.DiffWithClipboard
import org.jetbrains.jewel.icons.allicons.actions.Filterdups
import org.jetbrains.jewel.icons.allicons.actions.Generated
import org.jetbrains.jewel.icons.allicons.actions.GroupByMethod
import org.jetbrains.jewel.icons.allicons.actions.GroupByModule
import org.jetbrains.jewel.icons.allicons.actions.GroupByPackage
import org.jetbrains.jewel.icons.allicons.actions.GroupByTestProduction
import org.jetbrains.jewel.icons.allicons.actions.InSelection
import org.jetbrains.jewel.icons.allicons.actions.Install
import org.jetbrains.jewel.icons.allicons.actions.Lightning
import org.jetbrains.jewel.icons.allicons.actions.MoveToBottomLeft
import org.jetbrains.jewel.icons.allicons.actions.MoveToBottomRight
import org.jetbrains.jewel.icons.allicons.actions.MoveToButton
import org.jetbrains.jewel.icons.allicons.actions.MoveToLeftBottom
import org.jetbrains.jewel.icons.allicons.actions.MoveToLeftTop
import org.jetbrains.jewel.icons.allicons.actions.MoveToRightBottom
import org.jetbrains.jewel.icons.allicons.actions.MoveToRightTop
import org.jetbrains.jewel.icons.allicons.actions.NewFolder
import org.jetbrains.jewel.icons.allicons.actions.PlayBack
import org.jetbrains.jewel.icons.allicons.actions.PlayFirst
import org.jetbrains.jewel.icons.allicons.actions.PlayForward
import org.jetbrains.jewel.icons.allicons.actions.PlayLast
import org.jetbrains.jewel.icons.allicons.actions.ProfileCPU
import org.jetbrains.jewel.icons.allicons.actions.ProjectDirectory
import org.jetbrains.jewel.icons.allicons.actions.RunAll
import org.jetbrains.jewel.icons.allicons.actions.ShowImportStatements
import org.jetbrains.jewel.icons.allicons.actions.ShowReadAccess
import org.jetbrains.jewel.icons.allicons.actions.ShowWriteAccess
import org.jetbrains.jewel.icons.allicons.actions.SwapPanels
import org.jetbrains.jewel.icons.allicons.actions.SynchronizeScrolling
import org.jetbrains.jewel.icons.allicons.actions.ToggleVisibility
import org.jetbrains.jewel.icons.allicons.actions.Undeploy
import kotlin.collections.List as ____KtList

public object ActionsGroup

public val AllIcons.Actions: ActionsGroup
  get() = ActionsGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val ActionsGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Lightning, ShowImportStatements, GroupByPackage, MoveToLeftBottom,
        ShowWriteAccess, GroupByTestProduction, NewFolder, ShowReadAccess, SynchronizeScrolling,
        Deploy, Filterdups, RunAll, Undeploy, GroupByModule, Install, MoveToRightTop, PlayFirst,
        MoveToButton, PlayLast, GroupByMethod, DiffWithClipboard, ProjectDirectory, MoveToLeftTop,
        SwapPanels, ClearCash, BuildAutoReloadChanges, MoveToBottomRight, MoveToRightBottom,
        ToggleVisibility, MoveToBottomLeft, Generated, PlayForward, InSelection, PlayBack,
        ProfileCPU)
    return __AllAssets!!
  }
