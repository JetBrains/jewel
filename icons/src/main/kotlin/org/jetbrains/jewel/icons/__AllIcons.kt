package org.jetbrains.jewel.icons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.allicons.Actions
import org.jetbrains.jewel.icons.allicons.AllAssets
import org.jetbrains.jewel.icons.allicons.Bookmarks
import org.jetbrains.jewel.icons.allicons.Breakpoints
import org.jetbrains.jewel.icons.allicons.Build
import org.jetbrains.jewel.icons.allicons.Codeinsight
import org.jetbrains.jewel.icons.allicons.Codewithme
import org.jetbrains.jewel.icons.allicons.Debugger
import org.jetbrains.jewel.icons.allicons.Diff
import org.jetbrains.jewel.icons.allicons.Filetypes
import org.jetbrains.jewel.icons.allicons.General
import org.jetbrains.jewel.icons.allicons.Graph
import org.jetbrains.jewel.icons.allicons.Gutter
import org.jetbrains.jewel.icons.allicons.Hierarchy
import org.jetbrains.jewel.icons.allicons.Ide
import org.jetbrains.jewel.icons.allicons.Image
import org.jetbrains.jewel.icons.allicons.Inline
import org.jetbrains.jewel.icons.allicons.Javaee
import org.jetbrains.jewel.icons.allicons.Meetnewui
import org.jetbrains.jewel.icons.allicons.Nodes
import org.jetbrains.jewel.icons.allicons.Objectbrowser
import org.jetbrains.jewel.icons.allicons.Profiler
import org.jetbrains.jewel.icons.allicons.Progress
import org.jetbrains.jewel.icons.allicons.Python
import org.jetbrains.jewel.icons.allicons.Run
import org.jetbrains.jewel.icons.allicons.Runconfigurations
import org.jetbrains.jewel.icons.allicons.Status
import org.jetbrains.jewel.icons.allicons.Stub
import org.jetbrains.jewel.icons.allicons.Stub_20x20
import org.jetbrains.jewel.icons.allicons.Table
import org.jetbrains.jewel.icons.allicons.Toolbar
import org.jetbrains.jewel.icons.allicons.Toolwindow
import org.jetbrains.jewel.icons.allicons.Vcs
import org.jetbrains.jewel.icons.allicons.Webreferences
import org.jetbrains.jewel.icons.allicons.Welcome
import org.jetbrains.jewel.icons.allicons.Windows
import kotlin.collections.List as ____KtList

public object AllIcons

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val AllIcons.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= Ide.AllAssets + Hierarchy.AllAssets + Progress.AllAssets +
        Runconfigurations.AllAssets + Python.AllAssets + Gutter.AllAssets + Javaee.AllAssets +
        Nodes.AllAssets + General.AllAssets + Graph.AllAssets + Toolbar.AllAssets + Diff.AllAssets +
        Status.AllAssets + Welcome.AllAssets + Image.AllAssets + Inline.AllAssets +
        Toolwindow.AllAssets + Filetypes.AllAssets + Meetnewui.AllAssets + Bookmarks.AllAssets +
        Table.AllAssets + Vcs.AllAssets + Actions.AllAssets + Debugger.AllAssets +
        Breakpoints.AllAssets + Profiler.AllAssets + Build.AllAssets + Run.AllAssets +
        Windows.AllAssets + Webreferences.AllAssets + Codeinsight.AllAssets + Codewithme.AllAssets +
        Objectbrowser.AllAssets + listOf(Stub, Stub_20x20)
    return __AllAssets!!
  }
