plugins {
    alias(libs.plugins.composeDesktop)
    jewel
    `jewel-publish`
}

dependencies {
    api(projects.intUi.intUiStandalone)
    compileOnly(libs.bundles.idea)

    testImplementation(compose.desktop.uiTestJUnit4)
}
