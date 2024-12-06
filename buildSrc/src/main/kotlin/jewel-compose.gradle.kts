import org.jetbrains.kotlin.compose.compiler.gradle.ComposeFeatureFlag

plugins {
    id("org.jetbrains.compose")
    id("org.jetbrains.compose-hot-reload")
    id("org.jetbrains.kotlin.plugin.compose")
}

composeCompiler { featureFlags.add(ComposeFeatureFlag.OptimizeNonSkippingGroups) }
