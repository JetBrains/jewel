import org.jetbrains.compose.ComposeBuildConfig

plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    alias(libs.plugins.composeDesktop)
}

private val composeVersion
    get() = ComposeBuildConfig.composeVersion

dependencies {
    api("org.jetbrains.compose.foundation:foundation-desktop:$composeVersion")
    implementation("org.jetbrains.compose.ui:ui-util-desktop:$composeVersion")

    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material")
    }
}
