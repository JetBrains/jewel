plugins {
    `jewel-publish`
    alias(libs.plugins.composeDesktop)
    `intellij-theme-generator`
}

dependencies {
    api(projects.core)
    api(projects.composeUtils)
    api(projects.foundation)
}

intelliJThemeGenerator {
    register("intUiLight") {
        themeClassName.set("org.jetbrains.jewel.themes.intui.core.theme.IntUiLightTheme")
        themeFile.set("platform/platform-resources/src/themes/expUI/expUI_light.theme.json")
        ideaVersion.set("232.6734")
    }
    register("intUiDark") {
        themeClassName.set("org.jetbrains.jewel.themes.intui.core.theme.IntUiDarkTheme")
        themeFile.set("platform/platform-resources/src/themes/expUI/expUI_dark.theme.json")
        ideaVersion.set("232.6734")
    }
}

tasks {
    named("dokkaHtml") {
        dependsOn("generateIntUiDarkTheme")
        dependsOn("generateIntUiLightTheme")
    }
    named<Jar>("sourcesJar") {
        dependsOn("generateIntUiDarkTheme")
        dependsOn("generateIntUiLightTheme")
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }
}

