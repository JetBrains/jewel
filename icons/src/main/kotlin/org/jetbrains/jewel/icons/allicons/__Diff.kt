package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.diff.ApplyNotConflicts
import org.jetbrains.jewel.icons.allicons.diff.ApplyNotConflictsLeft
import org.jetbrains.jewel.icons.allicons.diff.ApplyNotConflictsRight
import org.jetbrains.jewel.icons.allicons.diff.`Arrow@14x14`
import org.jetbrains.jewel.icons.allicons.diff.`ArrowLeftDown@14x14`
import org.jetbrains.jewel.icons.allicons.diff.ArrowLeftRight
import org.jetbrains.jewel.icons.allicons.diff.`ArrowRight@14x14`
import org.jetbrains.jewel.icons.allicons.diff.`ArrowRightDown@14x14`
import org.jetbrains.jewel.icons.allicons.diff.Compare3LeftMiddle
import org.jetbrains.jewel.icons.allicons.diff.Compare3LeftRight
import org.jetbrains.jewel.icons.allicons.diff.Compare3MiddleRight
import org.jetbrains.jewel.icons.allicons.diff.Compare4LeftBottom
import org.jetbrains.jewel.icons.allicons.diff.Compare4LeftMiddle
import org.jetbrains.jewel.icons.allicons.diff.Compare4LeftRight
import org.jetbrains.jewel.icons.allicons.diff.Compare4MiddleBottom
import org.jetbrains.jewel.icons.allicons.diff.Compare4MiddleRight
import org.jetbrains.jewel.icons.allicons.diff.Compare4RightBottom
import org.jetbrains.jewel.icons.allicons.diff.DisableEditing
import org.jetbrains.jewel.icons.allicons.diff.`GutterCheckBox@14x14`
import org.jetbrains.jewel.icons.allicons.diff.`GutterCheckBoxIndeterminate@14x14`
import org.jetbrains.jewel.icons.allicons.diff.`GutterCheckBoxSelected@14x14`
import org.jetbrains.jewel.icons.allicons.diff.`MagicResolve@14x14`
import org.jetbrains.jewel.icons.allicons.diff.MagicResolveToolbar
import org.jetbrains.jewel.icons.allicons.diff.`Remove@14x14`
import org.jetbrains.jewel.icons.allicons.diff.`Revert@14x14`
import kotlin.collections.List as ____KtList

public object DiffGroup

public val AllIcons.Diff: DiffGroup
  get() = DiffGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val DiffGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(ApplyNotConflictsRight, MagicResolveToolbar, Compare3LeftMiddle,
        Compare4LeftMiddle, Compare4MiddleRight, `GutterCheckBox@14x14`, Compare3MiddleRight,
        `ArrowLeftDown@14x14`, DisableEditing, Compare4MiddleBottom, Compare4RightBottom,
        `Revert@14x14`, ApplyNotConflicts, Compare4LeftRight, Compare3LeftRight,
        `GutterCheckBoxSelected@14x14`, `MagicResolve@14x14`, Compare4LeftBottom, ArrowLeftRight,
        `ArrowRightDown@14x14`, `Arrow@14x14`, `GutterCheckBoxIndeterminate@14x14`,
        ApplyNotConflictsLeft, `ArrowRight@14x14`, `Remove@14x14`)
    return __AllAssets!!
  }
