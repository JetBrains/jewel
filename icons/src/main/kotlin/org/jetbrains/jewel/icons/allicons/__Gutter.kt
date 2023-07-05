package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.gutter.Bookmark
import org.jetbrains.jewel.icons.allicons.gutter.Colors
import org.jetbrains.jewel.icons.allicons.gutter.DataSchema
import org.jetbrains.jewel.icons.allicons.gutter.ExtAnnotation
import org.jetbrains.jewel.icons.allicons.gutter.Fold
import org.jetbrains.jewel.icons.allicons.gutter.FoldBottom
import org.jetbrains.jewel.icons.allicons.gutter.ImplementedMethod
import org.jetbrains.jewel.icons.allicons.gutter.ImplementingFunctionalInterface
import org.jetbrains.jewel.icons.allicons.gutter.ImplementingMethod
import org.jetbrains.jewel.icons.allicons.gutter.JavadocEdit
import org.jetbrains.jewel.icons.allicons.gutter.JavadocRead
import org.jetbrains.jewel.icons.allicons.gutter.Mnemonic
import org.jetbrains.jewel.icons.allicons.gutter.OverridenMethod
import org.jetbrains.jewel.icons.allicons.gutter.OverridingMethod
import org.jetbrains.jewel.icons.allicons.gutter.ReadAccess
import org.jetbrains.jewel.icons.allicons.gutter.RecursiveMethod
import org.jetbrains.jewel.icons.allicons.gutter.Rerun
import org.jetbrains.jewel.icons.allicons.gutter.Run
import org.jetbrains.jewel.icons.allicons.gutter.RunError
import org.jetbrains.jewel.icons.allicons.gutter.RunFailed
import org.jetbrains.jewel.icons.allicons.gutter.RunSuccess
import org.jetbrains.jewel.icons.allicons.gutter.SiblingInheritedMethod
import org.jetbrains.jewel.icons.allicons.gutter.SuggestedRefactoring
import org.jetbrains.jewel.icons.allicons.gutter.SuggestedRefactoringDisabled
import org.jetbrains.jewel.icons.allicons.gutter.Unfold
import org.jetbrains.jewel.icons.allicons.gutter.WriteAccess
import kotlin.collections.List as ____KtList

public object GutterGroup

public val AllIcons.Gutter: GutterGroup
  get() = GutterGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val GutterGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(OverridenMethod, FoldBottom, Rerun, Fold, ImplementedMethod, RunFailed,
        SiblingInheritedMethod, ImplementingMethod, ImplementingFunctionalInterface, Colors,
        RunError, ReadAccess, RecursiveMethod, SuggestedRefactoring, WriteAccess, DataSchema,
        JavadocRead, OverridingMethod, RunSuccess, Mnemonic, JavadocEdit, Bookmark, Unfold,
        SuggestedRefactoringDisabled, ExtAnnotation, Run)
    return __AllAssets!!
  }
