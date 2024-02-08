@file:Suppress("UnstableApiUsage")

import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import io.github.fourlastor.construo.Target
import io.github.fourlastor.construo.ToolchainOptions
import io.github.fourlastor.construo.ToolchainVersion

plugins {
    jewel
    alias(libs.plugins.composeDesktop)
    alias(libs.plugins.construo)
    alias(libs.plugins.shadow)
}

dependencies {
    implementation(libs.kotlin.reflect)
    implementation(projects.intUi.intUiStandalone)
    implementation(projects.intUi.intUiDecoratedWindow)
    implementation(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material")
    }
}

compose.desktop {
    application {
        mainClass = "org.jetbrains.jewel.samples.standalone.MainKt"

        jvmArgs("-Dorg.jetbrains.jewel.debug=true")

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
            javaLauncher = project.javaToolchains.launcherFor {
                languageVersion = JavaLanguageVersion.of(17)
                vendor = JvmVendorSpec.JETBRAINS
            }
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
    toolchain.set(ToolchainOptions(
        ToolchainVersion.Companion.of(17),
        JvmVendorSpec.JETBRAINS
    ))
    targets {
        // Linux X64
        create<Target.Linux>("linuxX64") {
            architecture.set(Target.Architecture.X86_64)
        }
        // macOS M1
        create<Target.MacOs>("macOsM1") {
            architecture.set(Target.Architecture.AARCH64)
            identifier.set("org.jetbrains.jewel.sample.standalone")
            macIcon.set(file("icons/jewel.icns"))
        }
        // Windows x64
        create<Target.Windows>("winx64") {
            useGpuHint.set(false)
            architecture.set(Target.Architecture.X86_64)
        }
    }
}
