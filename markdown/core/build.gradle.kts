plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    alias(libs.plugins.composeDesktop)
}

dependencies {
    compileOnly(projects.ui)
    api(libs.commonmark.core)
    implementation("io.coil-kt.coil3:coil-compose:3.0.0-alpha06")
//    Exception in thread "AWT-EventQueue-0" java.lang.IllegalStateException: Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'
//	https://github.com/coil-kt/coil/issues/842#issuecomment-1975115060
    runtimeOnly("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.8.1-Beta")

    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(projects.ui)
}

publicApiValidation {
    // We don't foresee changes to the data models for now
    excludedClassRegexes = setOf("org.jetbrains.jewel.markdown.MarkdownBlock.*")
}

publishing.publications.named<MavenPublication>("main") {
    artifactId = "jewel-markdown-${project.name}"
}
