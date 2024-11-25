@file:Suppress("UnstableApiUsage")

import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import io.github.fourlastor.construo.Target

plugins {
    jewel
    alias(libs.plugins.composeDesktop)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.construo)
    alias(libs.plugins.shadow)
}

dependencies {
    implementation(libs.kotlin.reflect)
    implementation(libs.filePicker)
    implementation(projects.intUi.intUiStandalone)
    implementation(projects.intUi.intUiDecoratedWindow)
    implementation(projects.markdown.intUiStandaloneStyling)
    implementation(projects.markdown.extension.gfmAlerts)
    implementation(projects.markdown.extension.autolink)
    implementation(compose.desktop.currentOs) { exclude(group = "org.jetbrains.compose.material") }
    implementation(compose.components.resources)
    implementation(libs.intellijPlatform.icons)
    testImplementation(compose.desktop.uiTestJUnit4)
    testImplementation(compose.desktop.currentOs) { exclude(group = "org.jetbrains.compose.material") }
}

val jdkLevel = project.property("jdk.level") as String

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(jdkLevel)
        vendor = JvmVendorSpec.JETBRAINS
    }
}

compose.desktop {
    application {
        mainClass = "org.jetbrains.jewel.samples.standalone.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg)
            packageName = "Jewel Sample"
            packageVersion = "1.0"
            description = "Jewel Sample Application"
            vendor = "JetBrains"
            licenseFile = rootProject.file("LICENSE")

            macOS {
                dockName = "Jewel Sample"
                bundleID = "org.jetbrains.jewel.sample.standalone"
                iconFile = file("icons/jewel.icns")
            }
        }
    }
}

tasks {
    withType<JavaExec> {
        // afterEvaluate is needed because the Compose Gradle Plugin
        // register the task in the afterEvaluate block
        afterEvaluate {
            javaLauncher = project.javaToolchains.launcherFor { languageVersion = JavaLanguageVersion.of(jdkLevel) }
            setExecutable(javaLauncher.map { it.executablePath.asFile.absolutePath }.get())
        }
    }
}

construo {
    // name of the executable
    name.set("jewel")
    // human readable name, used for example in the `.app` name for MacOS
    humanName.set("Jewel Standalone")
    // version, required if not specified in project
    version.set("1.0.0")
    // main class, it wouldn't be required if compose used the application plugin
    mainClass.set("org.jetbrains.jewel.samples.standalone.MainKt")
    roast {
        // required to get around compose using context class loader
        useMainAsContextClassLoader.set(true)
    }
    jlink {
        // required as it's used via string by compose, so it's not picked up by jlink automatically
        modules.addAll("jdk.zipfs")
    }
    targets {
        // Linux X64
        create<Target.Linux>("linuxX64") {
            jdkUrl.set("https://cache-redirector.jetbrains.com/intellij-jbr/jbr_jcef-17.0.12-linux-x64-b1207.37.tar.gz")
            architecture.set(Target.Architecture.X86_64)
        }
        // macOS M1
        create<Target.MacOs>("macOsAarch64") {
            jdkUrl.set("https://cache-redirector.jetbrains.com/intellij-jbr/jbr_jcef-17.0.12-osx-aarch64-b1207.37.tar.gz")
            architecture.set(Target.Architecture.AARCH64)
            identifier.set("org.jetbrains.jewel.sample.standalone")
            macIcon.set(file("icons/jewel.icns"))
        }
        // Windows x64
        create<Target.Windows>("winX64") {
            jdkUrl.set("https://cache-redirector.jetbrains.com/intellij-jbr/jbr_jcef-17.0.12-windows-x64-b1207.37.tar.gz")
            useGpuHint.set(false)
            architecture.set(Target.Architecture.X86_64)
        }
    }
}
