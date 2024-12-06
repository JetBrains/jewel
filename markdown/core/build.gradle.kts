import org.jetbrains.kotlin.compose.compiler.gradle.ComposeFeatureFlag

plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    `jewel-compose`
}

dependencies {
    api(projects.ui)
    api(libs.commonmark.core)

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

composeCompiler { featureFlags.add(ComposeFeatureFlag.OptimizeNonSkippingGroups) }
