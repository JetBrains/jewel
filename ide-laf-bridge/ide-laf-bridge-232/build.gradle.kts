plugins {
    jewel
    `jewel-publish`
    alias(libs.plugins.composeDesktop)
}

dependencies {
    api(projects.intUi.intUiStandalone)
    compileOnly(libs.bundles.idea232)
}

tasks.withType<AbstractPublishToMaven>().configureEach {
    publication.artifactId = "jewel-ide-laf-bridge-ij-232"
    enabled = supportedIJVersion() == SupportedIJVersion.IJ_232
}
