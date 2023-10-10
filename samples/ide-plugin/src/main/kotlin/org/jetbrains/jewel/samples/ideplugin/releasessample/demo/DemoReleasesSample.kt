@file:OptIn(DependsOnJBR::class)

package org.jetbrains.jewel.samples.ideplugin.releasessample.demo

import androidx.compose.runtime.Composable
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import org.jetbrains.jewel.bridge.SwingBridgeService
import org.jetbrains.jewel.bridge.SwingBridgeTheme
import org.jetbrains.skiko.DependsOnJBR

@Composable
internal fun DemoReleasesSample(project: Project) {
    SwingBridgeTheme {
        val svgLoader = service<SwingBridgeService>().svgLoader
    }
}
