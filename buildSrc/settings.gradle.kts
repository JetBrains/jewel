@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "buildSrc"

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven(file("/Users/sebp/src/compose-hot-reload/build/repo"))
        maven("https://packages.jetbrains.team/maven/p/firework/dev")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        maven(file("/Users/sebp/src/compose-hot-reload/build/repo"))
        maven("https://packages.jetbrains.team/maven/p/firework/dev")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://www.jetbrains.com/intellij-repository/releases")
        maven("https://www.jetbrains.com/intellij-repository/snapshots")
        maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
        gradlePluginPortal()
        mavenCentral()
    }

    versionCatalogs { create("libs") { from(files("../gradle/libs.versions.toml")) } }
}
