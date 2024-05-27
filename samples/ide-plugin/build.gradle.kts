plugins {
    jewel
    alias(libs.plugins.composeDesktop)
    alias(libs.plugins.ideaPlugin)
    `android-studio-releases-generator`
}
// Because we need to define IJP dependencies, the dependencyResolutionManagement
// from settings.gradle.kts is overridden and we have to redeclare everything here.
repositories {
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    mavenCentral()
    
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity(libs.versions.idea)
        instrumentationTools()
    }

    implementation(projects.ideLafBridge) {
        exclude(group = "org.jetbrains.kotlinx")
    }

    implementation(projects.markdown.ideLafBridgeStyling) {
        exclude(group = "org.jetbrains.kotlinx")
    }

    implementation(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material")
        exclude(group = "org.jetbrains.kotlinx")
    }
}

intellijPlatform {
    pluginConfiguration { name = "Jewel Demo" }
    buildSearchableOptions  = false
}

tasks {
    runIde {
        systemProperties["org.jetbrains.jewel.debug"] = "true"
    }
}
