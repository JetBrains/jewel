plugins {
    id("org.jetbrains.jewel.kotlin")
    alias(libs.plugins.composeDesktop)
    id("org.jetbrains.jewel.detekt")
    id("org.jetbrains.jewel.ktlint")
    id("org.jetbrains.jewel.palette.generator.intui")
}

dependencies {
    api(projects.core)
    api(projects.composeUtils)
    api(projects.foundation)
}

intUiPaletteGenerator {
    create("light") {
        paletteClassName("org.jetbrains.jewel.themes.intui.standalone.internal.light.LightPalette")
        themeFile("platform/platform-resources/src/themes/expUI/expUI_light.theme.json")
        ideaVersion("232.6734")
    }
    create("dark") {
        paletteClassName("org.jetbrains.jewel.themes.intui.standalone.internal.dark.DarkPalette")
        themeFile("platform/platform-resources/src/themes/expUI/expUI_dark.theme.json")
        ideaVersion("232.6734")
    }
}
