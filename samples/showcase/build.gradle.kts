import org.jetbrains.compose.ComposeBuildConfig

plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    alias(libs.plugins.composeDesktop)
    alias(libs.plugins.compose.compiler)
}

private val composeVersion
    get() = ComposeBuildConfig.composeVersion

dependencies {
    implementation(projects.foundation)
    implementation(projects.ui)
    implementation(projects.markdown.core)
    implementation(projects.markdown.extension.gfmAlerts)
    implementation(projects.markdown.extension.autolink)
    implementation("com.darkrockstudios:mpfilepicker:3.1.0")

    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(compose.desktop.currentOs) { exclude(group = "org.jetbrains.compose.material") }
}
