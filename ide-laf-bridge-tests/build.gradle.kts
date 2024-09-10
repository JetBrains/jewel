plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    `ide-version-checker`
    alias(libs.plugins.composeDesktop)
}

dependencies {
    testApi(projects.ui) { exclude(group = "org.jetbrains.kotlinx") }

    testApi(projects.ideLafBridge)

    testImplementation(libs.bundles.idea)

    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(compose.desktop.currentOs) { exclude(group = "org.jetbrains.compose.material") }
    testImplementation(compose.desktop.currentOs) { exclude(group = "org.jetbrains.compose.material") }
}
