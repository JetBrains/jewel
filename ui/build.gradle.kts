import org.jetbrains.compose.ComposeBuildConfig

plugins {
    jewel
    `jewel-check-public-api`
    `jewel-publish`
    alias(libs.plugins.composeDesktop)
    alias(libs.plugins.kotlinx.serialization)
}

private val composeVersion
    get() = ComposeBuildConfig.composeVersion

dependencies {
    api(projects.foundation)

    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material")
    }
}
