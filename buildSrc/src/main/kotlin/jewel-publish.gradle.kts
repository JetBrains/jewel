@file:Suppress("UnstableApiUsage")

plugins {
    kotlin("jvm")
    `maven-publish`
    id("org.jetbrains.dokka")
    signing
}

val sourcesJar by tasks.registering(Jar::class) {
    from(kotlin.sourceSets.main.map { it.kotlin })
    archiveClassifier = "sources"
    destinationDirectory = layout.buildDirectory.dir("artifacts")
}

val javadocJar by tasks.registering(Jar::class) {
    from(tasks.dokkaHtml)
    archiveClassifier = "javadoc"
    destinationDirectory = layout.buildDirectory.dir("artifacts")
}

val publishingExtension = extensions.getByType<PublishingExtension>()

signing {
    useInMemoryPgpKeys(
        System.getenv("PGP_PRIVATE_KEY") ?: properties["signing.privateKey"] as String?,
        System.getenv("PGP_PASSWORD")?: properties["signing.password"] as String?
    )
    sign(publishingExtension.publications)
}

publishing {
    configureJewelRepositories(project)

    val ijpTarget = project.property("ijp.target") as String

    publications {
        register<MavenPublication>("main") {
            from(components["kotlin"])
            artifact(javadocJar)
            artifact(sourcesJar)
            version = project.properties["jewel.release.version"] as String
            artifactId = "jewel-${project.name}-$ijpTarget"
            pom { configureJewelPom() }
        }
    }
}
