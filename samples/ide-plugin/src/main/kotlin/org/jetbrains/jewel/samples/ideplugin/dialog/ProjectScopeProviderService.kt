package org.jetbrains.jewel.samples.ideplugin.dialog

import com.intellij.openapi.components.Service
import kotlinx.coroutines.CoroutineScope

@Service(Service.Level.PROJECT) internal class ProjectScopeProviderService(val scope: CoroutineScope)
