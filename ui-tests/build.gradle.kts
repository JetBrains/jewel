plugins {
    jewel
    alias(libs.plugins.composeDesktop)
}

dependencies {
    api(projects.ui)
    api(projects.intUi.intUiStandalone)
    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(compose.desktop.currentOs) { exclude(group = "org.jetbrains.compose.material") }
}
