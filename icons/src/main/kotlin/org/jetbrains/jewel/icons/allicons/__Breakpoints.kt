package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.breakpoints.Breakpoint
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointDependent
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointDisabled
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointException
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointExceptionDisabled
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointField
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointFieldDependent
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointFieldDisabled
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointFieldMuted
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointFieldMutedDependent
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointFieldMutedDisabled
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointFieldUnsuspendent
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointFieldUnsuspendentDisabled
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointFieldUnsuspendentValid
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointFieldValid
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointInvalid
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointLambda
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMethod
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMethodDependent
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMethodDisabled
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMethodMuted
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMethodMutedDependent
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMethodMutedDisabled
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMethodUnsuspendent
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMethodUnsuspendentDisabled
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMethodUnsuspendentValid
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMethodValid
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMuted
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMutedDependent
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointMutedDisabled
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointObsolete
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointUnsuspendent
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointUnsuspendentDisabled
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointUnsuspendentValid
import org.jetbrains.jewel.icons.allicons.breakpoints.BreakpointValid
import org.jetbrains.jewel.icons.allicons.breakpoints.MultipleBreakpoints
import org.jetbrains.jewel.icons.allicons.breakpoints.QuestionBadge
import kotlin.collections.List as ____KtList

public object BreakpointsGroup

public val AllIcons.Breakpoints: BreakpointsGroup
  get() = BreakpointsGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val BreakpointsGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(QuestionBadge, BreakpointMethodUnsuspendent, BreakpointObsolete,
        BreakpointMutedDisabled, BreakpointMethodUnsuspendentDisabled,
        BreakpointMethodMutedDisabled, BreakpointLambda, BreakpointException,
        BreakpointMethodUnsuspendentValid, BreakpointMuted, BreakpointFieldValid,
        BreakpointMethodValid, BreakpointExceptionDisabled, BreakpointField,
        BreakpointUnsuspendentValid, BreakpointDisabled, BreakpointUnsuspendent,
        BreakpointFieldDependent, BreakpointDependent, BreakpointFieldUnsuspendentDisabled,
        BreakpointFieldMutedDependent, BreakpointMethodDisabled, BreakpointInvalid,
        BreakpointFieldUnsuspendent, BreakpointFieldMutedDisabled, BreakpointFieldUnsuspendentValid,
        MultipleBreakpoints, BreakpointMethodDependent, Breakpoint, BreakpointFieldDisabled,
        BreakpointMutedDependent, BreakpointUnsuspendentDisabled, BreakpointMethodMutedDependent,
        BreakpointMethodMuted, BreakpointFieldMuted, BreakpointValid, BreakpointMethod)
    return __AllAssets!!
  }
