@file:Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")

import org.jetbrains.compose.reload.ComposeHotRun
import org.jetbrains.compose.reload.createComposeHotReloadRunClasspath
import java.net.URI

plugins {
    jewel
    `jewel-compose`
    id("org.jetbrains.intellij.platform")
    `android-studio-releases-generator`
}

// Because we need to define IJP dependencies, the dependencyResolutionManagement
// from settings.gradle.kts is overridden and we have to redeclare everything here.
repositories {
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    mavenCentral()
    maven(file("/Users/sebp/src/compose-hot-reload/build/repo"))
    maven("https://packages.jetbrains.team/maven/p/firework/dev")

    intellijPlatform {
        ivy {
            name = "PKGS IJ Snapshots"
            url = URI("https://packages.jetbrains.team/files/p/kpm/public/idea/snapshots/")
            patternLayout {
                artifact("[module]-[revision](-[classifier]).[ext]")
                artifact("[module]-[revision](.[classifier]).[ext]")
            }
            metadataSources { artifact() }
        }

        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity(libs.versions.idea)
        instrumentationTools()
    }

    implementation(projects.ideLafBridge) { exclude(group = "org.jetbrains.kotlinx") }

    implementation(projects.markdown.ideLafBridgeStyling) { exclude(group = "org.jetbrains.kotlinx") }

    implementation(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material")
        exclude(group = "org.jetbrains.kotlinx")
    }
}

intellijPlatform {
    pluginConfiguration { name = "Jewel Demo" }
    buildSearchableOptions = false
    autoReload = false
}

tasks {
    runIde { jvmArgs = listOf("-Xmx16g") }

    register<ComposeHotRun>("runHot") { mainClass.set("org.jetbrains.jewel.samples.standalone.MainKt") }

    afterEvaluate {
        val runIdeTask = runIde.get()
        val hotReloadTask = named("runHot").get() as ComposeHotRun
        runIdeTask.jvmArgs(hotReloadTask.jvmArgs)
        runIdeTask.systemProperties(hotReloadTask.systemProperties)
        runIdeTask.setClasspath(
            project.files(
                { kotlin.target.compilations.getByName("main").createComposeHotReloadRunClasspath() },
                runIdeTask.classpath,
            )
        )
    }
}
