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
    implementation(project(":foundation"))
    implementation(project(":ui"))
    implementation("com.darkrockstudios:mpfilepicker:3.1.0")
    implementation(project(":markdown:core"))
    implementation(project(":markdown:extension:gfm-alerts"))
    implementation(project(":markdown:extension:autolink"))
    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(compose.desktop.currentOs) { exclude(group = "org.jetbrains.compose.material") }
}
