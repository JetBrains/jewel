package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.vcs.BranchLabel
import org.jetbrains.jewel.icons.allicons.vcs.Changelist
import org.jetbrains.jewel.icons.allicons.vcs.Changes
import org.jetbrains.jewel.icons.allicons.vcs.`ChangesPush@12x12`
import org.jetbrains.jewel.icons.allicons.vcs.`ChangesUpdate@12x12`
import org.jetbrains.jewel.icons.allicons.vcs.CherryPick
import org.jetbrains.jewel.icons.allicons.vcs.Commit
import org.jetbrains.jewel.icons.allicons.vcs.CurrentBranchFavoriteLabel
import org.jetbrains.jewel.icons.allicons.vcs.CurrentBranchLabel
import org.jetbrains.jewel.icons.allicons.vcs.Diff
import org.jetbrains.jewel.icons.allicons.vcs.Fetch
import org.jetbrains.jewel.icons.allicons.vcs.`Fetch@20x20`
import org.jetbrains.jewel.icons.allicons.vcs.IncomingUpdate
import org.jetbrains.jewel.icons.allicons.vcs.IntelliSort
import org.jetbrains.jewel.icons.allicons.vcs.Merge
import org.jetbrains.jewel.icons.allicons.vcs.OutgoingPush
import org.jetbrains.jewel.icons.allicons.vcs.Patch
import org.jetbrains.jewel.icons.allicons.vcs.Push
import org.jetbrains.jewel.icons.allicons.vcs.`Push@20x20`
import org.jetbrains.jewel.icons.allicons.vcs.Revert
import org.jetbrains.jewel.icons.allicons.vcs.Stash
import org.jetbrains.jewel.icons.allicons.vcs.Unshelve
import org.jetbrains.jewel.icons.allicons.vcs.Update
import org.jetbrains.jewel.icons.allicons.vcs.`Update@20x20`
import org.jetbrains.jewel.icons.allicons.vcs.Vcs
import kotlin.collections.List as ____KtList

public object VcsGroup

public val AllIcons.Vcs: VcsGroup
  get() = VcsGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val VcsGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(CurrentBranchFavoriteLabel, `Push@20x20`, Revert, OutgoingPush, Commit,
        `Update@20x20`, Unshelve, Diff, Update, Stash, `Fetch@20x20`, CurrentBranchLabel,
        IntelliSort, Changelist, CherryPick, IncomingUpdate, Changes, Push, `ChangesUpdate@12x12`,
        Fetch, Patch, Vcs, `ChangesPush@12x12`, Merge, BranchLabel)
    return __AllAssets!!
  }
