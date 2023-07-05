package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.run.AllAssets
import org.jetbrains.jewel.icons.allicons.run.AttachToProcess
import org.jetbrains.jewel.icons.allicons.run.Debug
import org.jetbrains.jewel.icons.allicons.run.Debug_stroke
import org.jetbrains.jewel.icons.allicons.run.DumpThreads
import org.jetbrains.jewel.icons.allicons.run.EvaluateExpression
import org.jetbrains.jewel.icons.allicons.run.ForceRunToCursor
import org.jetbrains.jewel.icons.allicons.run.ForceStepInto
import org.jetbrains.jewel.icons.allicons.run.ForceStepOver
import org.jetbrains.jewel.icons.allicons.run.KillProcess
import org.jetbrains.jewel.icons.allicons.run.MuteBreakpoints
import org.jetbrains.jewel.icons.allicons.run.Pause
import org.jetbrains.jewel.icons.allicons.run.Profile
import org.jetbrains.jewel.icons.allicons.run.Rerun
import org.jetbrains.jewel.icons.allicons.run.Rerun_stroke
import org.jetbrains.jewel.icons.allicons.run.Restart
import org.jetbrains.jewel.icons.allicons.run.RestartDebug
import org.jetbrains.jewel.icons.allicons.run.RestartDebug_stroke
import org.jetbrains.jewel.icons.allicons.run.RestartFailedTests
import org.jetbrains.jewel.icons.allicons.run.RestartFrame
import org.jetbrains.jewel.icons.allicons.run.Resume
import org.jetbrains.jewel.icons.allicons.run.Run
import org.jetbrains.jewel.icons.allicons.run.RunToCursor
import org.jetbrains.jewel.icons.allicons.run.RunWithCoverage
import org.jetbrains.jewel.icons.allicons.run.Run_stroke
import org.jetbrains.jewel.icons.allicons.run.ShowCurrentFrame
import org.jetbrains.jewel.icons.allicons.run.ShowIgnored
import org.jetbrains.jewel.icons.allicons.run.ShowPassed
import org.jetbrains.jewel.icons.allicons.run.SmartStepInto
import org.jetbrains.jewel.icons.allicons.run.StepInto
import org.jetbrains.jewel.icons.allicons.run.StepOut
import org.jetbrains.jewel.icons.allicons.run.StepOutCodeBlock
import org.jetbrains.jewel.icons.allicons.run.StepOver
import org.jetbrains.jewel.icons.allicons.run.Stop
import org.jetbrains.jewel.icons.allicons.run.StopColored
import org.jetbrains.jewel.icons.allicons.run.Stop_stroke
import org.jetbrains.jewel.icons.allicons.run.TestCustom
import org.jetbrains.jewel.icons.allicons.run.TestError
import org.jetbrains.jewel.icons.allicons.run.TestFailed
import org.jetbrains.jewel.icons.allicons.run.TestIgnored
import org.jetbrains.jewel.icons.allicons.run.TestNotRunYet
import org.jetbrains.jewel.icons.allicons.run.TestPassed
import org.jetbrains.jewel.icons.allicons.run.TestPassedIgnored
import org.jetbrains.jewel.icons.allicons.run.TestPaused
import org.jetbrains.jewel.icons.allicons.run.TestSkipped
import org.jetbrains.jewel.icons.allicons.run.TestTerminated
import org.jetbrains.jewel.icons.allicons.run.TestUnknown
import org.jetbrains.jewel.icons.allicons.run.ViewBreakpoints
import org.jetbrains.jewel.icons.allicons.run.Widget
import kotlin.collections.List as ____KtList

public object RunGroup

public val AllIcons.Run: RunGroup
  get() = RunGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val RunGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= Widget.AllAssets + listOf(TestError, Resume, StepOut, Debug, Stop_stroke, Restart,
        Rerun, ViewBreakpoints, ForceStepOver, TestUnknown, StepOver, TestTerminated, TestCustom,
        DumpThreads, ShowIgnored, Debug_stroke, StopColored, TestFailed, RestartDebug_stroke,
        RestartDebug, ForceStepInto, StepInto, Run_stroke, KillProcess, TestSkipped, Stop,
        RestartFailedTests, TestPassedIgnored, ShowCurrentFrame, MuteBreakpoints, StepOutCodeBlock,
        TestPassed, AttachToProcess, ShowPassed, SmartStepInto, Rerun_stroke, RunWithCoverage,
        TestNotRunYet, Profile, Pause, EvaluateExpression, RunToCursor, ForceRunToCursor,
        RestartFrame, TestIgnored, Run, TestPaused)
    return __AllAssets!!
  }
