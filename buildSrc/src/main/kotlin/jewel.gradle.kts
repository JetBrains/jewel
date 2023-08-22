import io.gitlab.arturbosch.detekt.Detekt
import org.jmailen.gradle.kotlinter.tasks.LintTask

plugins {
    id("io.gitlab.arturbosch.detekt")
    id("org.jmailen.kotlinter")
    kotlin("jvm")
}

group = "org.jetbrains.jewel"

val gitHubRef: String? = System.getenv("GITHUB_REF")
version = when {
    gitHubRef?.startsWith("refs/tags/") == true -> {
        gitHubRef.substringAfter("refs/tags/")
            .removePrefix("v")
    }
    else -> "1.0.0-SNAPSHOT"
}

kotlin {
    jvmToolchain(17)
    target {
        compilations.all {
            kotlinOptions {
                freeCompilerArgs += "-Xcontext-receivers"
            }
        }
        sourceSets.all {
            languageSettings {
                optIn("kotlinx.coroutines.ExperimentalCoroutinesApi")
                optIn("kotlin.experimental.ExperimentalTypeInference")
                optIn("androidx.compose.ui.ExperimentalComposeUiApi")
                optIn("androidx.compose.foundation.ExperimentalFoundationApi")
            }
        }
    }
}

detekt {
    config = files(rootProject.file("detekt.yml"))
    buildUponDefaultConfig = true
}

val sarif by configurations.creating {
    isCanBeConsumed = true
    attributes {
        attribute(Usage.USAGE_ATTRIBUTE, objects.named("sarif"))
    }
}

tasks {
    withType<Detekt> {
        val sarifOutputFile = buildDir.resolve("reports/detekt-${project.name}.sarif")
        exclude { it.file.absolutePath.startsWith(buildDir.absolutePath) }
        reports {
            sarif.required.set(true)
            sarif.outputLocation.set(sarifOutputFile)
        }
        sarif.outgoing {
            artifact(sarifOutputFile) {
                builtBy(this@withType)
            }
        }
    }
    withType<LintTask> {
        exclude { it.file.absolutePath.startsWith(buildDir.absolutePath) }
        val sarifReport = buildDir.resolve("reports/ktlint-${project.name}.sarif")
        reports.set(
            mapOf(
                "plain" to buildDir.resolve("reports/ktlint-${project.name}.txt"),
                "html" to buildDir.resolve("reports/ktlint-${project.name}.html"),
                "sarif" to sarifReport
            )
        )
        sarif.outgoing {
            artifact(sarifReport) {
                builtBy(this@withType)
            }
        }
    }
}
