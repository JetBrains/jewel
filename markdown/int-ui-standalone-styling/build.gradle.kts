import org.jetbrains.kotlin.compose.compiler.gradle.ComposeFeatureFlag

plugins {
    jewel
    `jewel-publish`
    `jewel-check-public-api`
    `jewel-compose`
}

dependencies {
    api(projects.markdown.core)
    api(projects.intUi.intUiStandalone)
    compileOnly(projects.markdown.extension.gfmAlerts)

    testImplementation(compose.desktop.uiTestJUnit4)
}

publishing.publications.named<MavenPublication>("main") {
    val ijpTarget = project.property("ijp.target") as String
    artifactId = "jewel-markdown-${project.name}-$ijpTarget"
}

composeCompiler { featureFlags.add(ComposeFeatureFlag.OptimizeNonSkippingGroups) }
