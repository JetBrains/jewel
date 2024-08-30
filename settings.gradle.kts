@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "jewel"

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://www.jetbrains.com/intellij-repository/releases")
        maven("https://www.jetbrains.com/intellij-repository/snapshots")
        maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
        mavenCentral()
    }
}

plugins {
    id("com.gradle.enterprise") version "3.15.1"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "2.0.9"
}

include(
    ":decorated-window",
    ":foundation",
    ":ide-laf-bridge",
    ":ide-laf-bridge-tests",
    ":int-ui:int-ui-decorated-window",
    ":int-ui:int-ui-standalone",
    ":markdown:core",
    ":markdown:extension:autolink",
    ":markdown:extension:gfm-alerts",
    ":markdown:int-ui-standalone-styling",
    ":markdown:ide-laf-bridge-styling",
    ":samples:ide-plugin",
    ":samples:standalone",
    ":ui",
)

gradleEnterprise {
    buildScan {
        publishAlwaysIf(System.getenv("CI") == "true")
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

val isWindows
    get() = System.getProperty("os.name").contains("win", true)

val gradleCommand: String by
    lazy(LazyThreadSafetyMode.NONE) {
        val gradlewFilename =
            if (isWindows) {
                "gradlew.bat"
            } else {
                "gradlew"
            }

        val gradlew = File(rootProject.projectDir, gradlewFilename)
        if (gradlew.exists() && gradlew.isFile && gradlew.canExecute()) {
            logger.info("Using gradlew wrapper at ${gradlew.invariantSeparatorsPath}")
            gradlew.invariantSeparatorsPath
        } else {
            "gradle"
        }
    }

val shebang = if (isWindows) "" else "#!/bin/sh"

gitHooks {
    hook("pre-push") {
        from(shebang) {
            // language=Shell Script
            """
            |#### Note: this hook was autogenerated. You can edit it in settings.gradle.kts
            |GRADLEW=$gradleCommand
            |if ! ${'$'}GRADLEW ktfmtCheck ; then
            |  ${'$'}GRADLEW ktfmtFormat
            |  echo 1>&2 "\nktfmt found problems; commit the result and re-push"
            |  exit 1
            |fi
            |
            """
                .trimMargin()
        }
    }

    createHooks(overwriteExisting = true)
}
