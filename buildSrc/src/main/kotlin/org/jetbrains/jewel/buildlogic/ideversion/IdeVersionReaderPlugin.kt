package org.jetbrains.jewel.buildlogic.ideversion

import SupportedIJVersion
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.register
import supportedIJVersion
import java.io.IOException
import java.net.URL

abstract class IdeVersionReaderPlugin : Plugin<Project> {

    final override fun apply(target: Project) {
        with(target) {
            tasks.register<CheckIdeaVersionTask>("checkLatestIntelliJPlatformBuild")
        }
    }
}

open class CheckIdeaVersionTask : DefaultTask() {

    private val releasesUrl =
        "https://data.services.jetbrains.com/products?" +
            "fields=code,releases,releases.version,releases.build,releases.type&" +
            "code=IC"

    init {
        group = "jewel"
    }

    @TaskAction
    fun generate() {
        val json = Json {
            ignoreUnknownKeys = true
            isLenient = true
        }

        logger.lifecycle("Fetching IntelliJ Platform releases from $releasesUrl...")
        val icReleases =
            try {
                URL(releasesUrl).openStream()
                    .use { json.decodeFromStream<List<ApiIdeaReleasesItem>>(it) }
                    .first()
            } catch (e: IOException) {
                logger.warn("Couldn't fetch IJ Platform releases, can't check for updates.\n" +
                    "Cause: ${e::class.qualifiedName} — ${e.message}")
                return
            } catch (e: RuntimeException) {
                logger.error("Unexpected error while fetching IJ Platform releases, can't check for updates.", e)
                return
            }

        check(icReleases.code == "IIC") { "Was expecting code IIC but was ${icReleases.code}" }
        check(icReleases.releases.isNotEmpty()) { "Was expecting to have releases but the list is empty" }

        val currentPlatformVersion = project.supportedIJVersion()
        val rawPlatformVersion = when (currentPlatformVersion) {
            SupportedIJVersion.IJ_232 -> "2023.2"
            SupportedIJVersion.IJ_233 -> "2023.3"
        }
        val latestVersion = icReleases.releases.asSequence()
            .filter { it.version == rawPlatformVersion }
            .sortedBy { it.build }
            .first()

        logger.lifecycle("The latest IntelliJ Platform $rawPlatformVersion build is ${latestVersion.build}")
    }
}
