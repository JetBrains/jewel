plugins {
    id("org.jetbrains.jewel.kotlin")
    alias(libs.plugins.composeDesktop)
    alias(libs.plugins.kotlinSerialization)
    id("org.jetbrains.jewel.detekt")
    id("org.jetbrains.jewel.ktlint")
    `maven-publish`
}

dependencies {
    api(projects.composeUtils)
}

publishing {
    publications {
        create<MavenPublication>("main") {
            from(components["kotlin"])
            artifact(tasks.sourcesJar)
            artifactId = rootProject.name
        }
    }
}
