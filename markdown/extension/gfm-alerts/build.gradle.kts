import org.jetbrains.kotlin.compose.compiler.gradle.ComposeFeatureFlag

plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    `jewel-compose`
}

dependencies {
    implementation(projects.markdown.core)

    testImplementation(compose.desktop.uiTestJUnit4)
}

publicApiValidation {
    // TODO Oleg remove this once migrated to value classes
    excludedClassRegexes = setOf("org.jetbrains.jewel.markdown.extensions.github.alerts.*")
}

publishing.publications.named<MavenPublication>("main") {
    val ijpTarget = project.property("ijp.target") as String
    artifactId = "jewel-markdown-extension-${project.name}-$ijpTarget"
}

composeCompiler { featureFlags.add(ComposeFeatureFlag.OptimizeNonSkippingGroups) }
