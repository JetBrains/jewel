import org.jetbrains.kotlin.compose.compiler.gradle.ComposeFeatureFlag

plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    `jewel-compose`
    `intellij-theme-generator`
}

dependencies { api(projects.ui) }

intelliJThemeGenerator {
    val targetIdeaVersion = "idea/243.19420.21"
    register("intUiLight") {
        themeClassName = "org.jetbrains.jewel.intui.core.theme.IntUiLightTheme"
        themeFile = "platform/platform-resources/src/themes/expUI/expUI_light.theme.json"
        ideaVersion = targetIdeaVersion
    }
    register("intUiDark") {
        themeClassName = "org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme"
        themeFile = "platform/platform-resources/src/themes/expUI/expUI_dark.theme.json"
        ideaVersion = targetIdeaVersion
    }
}

composeCompiler { featureFlags.add(ComposeFeatureFlag.OptimizeNonSkippingGroups) }
