plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    alias(libs.plugins.composeDesktop)
}

dependencies {
    api(projects.ui)
    api(libs.commonmark.core)
    api(libs.highlights)

    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(projects.ui)
}

publicApiValidation {
    // TODO Oleg remove this once migrated to value classes
    excludedClassRegexes = setOf("org.jetbrains.jewel.markdown.MarkdownBlock.*")
}

publishing.publications.named<MavenPublication>("main") {
    val ijpTarget = project.property("ijp.target") as String
    artifactId = "jewel-markdown-${project.name}-$ijpTarget"
}
