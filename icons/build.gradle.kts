import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    jewel
    alias(libs.plugins.composeDesktop)
}

dependencies {
    implementation(projects.themes.intUi.intUiStandalone)
    implementation(libs.compose.components.splitpane)
    implementation(projects.foundation)
}

compose.desktop {
    application {
        mainClass = "org.jetbrains.jewel.icons.MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg)
            packageName = "Icons Sample"
            packageVersion = "1.0"
            description = "Jewel Icons"
            vendor = "JetBrains"
        }
    }
}
