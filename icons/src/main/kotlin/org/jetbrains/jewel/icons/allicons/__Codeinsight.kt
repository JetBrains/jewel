package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.codeinsight.InlayGlobe
import org.jetbrains.jewel.icons.allicons.codeinsight.InlayRenameInComments
import org.jetbrains.jewel.icons.allicons.codeinsight.InlayRenameInCommentsActive
import org.jetbrains.jewel.icons.allicons.codeinsight.InlayRenameInNoCodeFiles
import org.jetbrains.jewel.icons.allicons.codeinsight.InlayRenameInNoCodeFilesActive
import org.jetbrains.jewel.icons.allicons.codeinsight.InlaySecuredShield
import org.jetbrains.jewel.icons.allicons.codeinsight.InlaySettings
import org.jetbrains.jewel.icons.allicons.codeinsight.IntentionBulb
import org.jetbrains.jewel.icons.allicons.codeinsight.IntentionBulbGrey
import org.jetbrains.jewel.icons.allicons.codeinsight.QuickfixBulb
import org.jetbrains.jewel.icons.allicons.codeinsight.QuickfixOffBulb
import kotlin.collections.List as ____KtList

public object CodeinsightGroup

public val AllIcons.Codeinsight: CodeinsightGroup
  get() = CodeinsightGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val CodeinsightGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(QuickfixBulb, InlaySecuredShield, IntentionBulbGrey, InlaySettings,
        QuickfixOffBulb, InlayRenameInComments, IntentionBulb, InlayRenameInCommentsActive,
        InlayRenameInNoCodeFiles, InlayRenameInNoCodeFilesActive, InlayGlobe)
    return __AllAssets!!
  }
