plugins {
    jewel
    `jewel-publish`
    alias(libs.plugins.composeDesktop)
}

dependencies {
    api(projects.intUi.intUiStandalone)
    compileOnly(libs.bundles.idea233)
}

tasks.withType<AbstractPublishToMaven>().configureEach {
    enabled = supportedIJVersion() == SupportedIJVersion.IJ_233
}