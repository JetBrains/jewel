import org.jetbrains.compose.ComposeBuildConfig
import org.jetbrains.kotlin.compose.compiler.gradle.ComposeFeatureFlag
import org.jmailen.gradle.kotlinter.tasks.FormatTask
import org.jmailen.gradle.kotlinter.tasks.LintTask

plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    `icon-keys-generator`
    `jewel-compose`
    id("org.jetbrains.kotlin.plugin.serialization")
}

dependencies {
    api(projects.foundation)
    implementation(compose.components.resources)
    iconGeneration(libs.intellijPlatform.util.ui)
    iconGeneration(libs.intellijPlatform.icons)
    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(compose.desktop.currentOs) { exclude(group = "org.jetbrains.compose.material") }
}

intelliJIconKeysGenerator {
    register("AllIcons") {
        sourceClassName = "com.intellij.icons.AllIcons"
        generatedClassName = "org.jetbrains.jewel.ui.icons.AllIconsKeys"
    }
}

tasks.withType<LintTask> {
    include("src/**") // Excluding build/ doesn't work for some reason
}

tasks.withType<FormatTask> {
    include("src/**") // Excluding build/ doesn't work for some reason
}

composeCompiler { featureFlags.add(ComposeFeatureFlag.OptimizeNonSkippingGroups) }
