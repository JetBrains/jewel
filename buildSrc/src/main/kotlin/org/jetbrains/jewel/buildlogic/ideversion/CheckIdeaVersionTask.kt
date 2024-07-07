package org.jetbrains.jewel.buildlogic.ideversion

import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.tasks.TaskAction
import java.io.File

open class CheckIdeaVersionTask : DefaultTask() {

    private val releasesUrl =
        "https://data.services.jetbrains.com/products?" +
            "fields=code,releases,releases.version,releases.build,releases.type,releases.majorVersion&" +
            "code=IC"

    private val ideaVersionRegex =
        "202\\d\\.(\\d\\.)?\\d".toRegex(RegexOption.IGNORE_CASE)

    private val intelliJPlatformBuildRegex =
        "2\\d{2}\\.\\d+\\.\\d+(?:-EAP-SNAPSHOT)?".toRegex(RegexOption.IGNORE_CASE)

    private val currentIjpVersion = project.currentIjpVersion

    init {
        group = "jewel"
    }

    @TaskAction
    fun generate() {
        logger.lifecycle("Fetching IntelliJ Platform releases from $releasesUrl...")
        val rawIdeaVersion = readCurrentVersionInfo()
        val ideaVersion = validateIdeaVersion(rawIdeaVersion)

        val platformBuildsForThisMajorVersion = IJPVersionsFetcher.fetchBuildsForCurrentMajorVersion(
            releasesUrl,
            ideaVersion.majorVersion,
            logger
        )

        if (platformBuildsForThisMajorVersion == null) {
            logger.error("Cannot check platform version, no builds found for current version $ideaVersion")
            return
        }

        val latestAvailableBuild = platformBuildsForThisMajorVersion.last()
        logger.info("The latest IntelliJ Platform ${ideaVersion.version} build is ${latestAvailableBuild.build}")

        val isCurrentBuildStable = ideaVersion.type.lowercase() != "eap"
        if (IJPVersionsFetcher.compare(ideaVersion, latestAvailableBuild) < 0) {
            throw GradleException(
                buildString {
                    appendLine("IntelliJ Platform version dependency is out of date.")
                    appendLine()

                    append("Current build: ${ideaVersion.build}")
                    if (!isCurrentBuildStable) append("-EAP-SNAPSHOT")
                    appendLine()
                    appendLine("Current version: ${ideaVersion.version}")
                    append("Detected channel: ")
                    appendLine(latestAvailableBuild.type)
                    appendLine()

                    append("Latest build: ${latestAvailableBuild.build}")
                    if (!isCurrentBuildStable) append("-EAP-SNAPSHOT")
                    appendLine()

                    append("Latest version: ")
                    if (isCurrentBuildStable) {
                        appendLine(latestAvailableBuild.version)
                    } else {
                        appendLine(latestAvailableBuild.build.removeSuffix("-EAP-SNAPSHOT"))
                    }

                    appendLine(
                        "Please update the 'idea' and 'intelliJPlatformBuild' " +
                            "versions in the catalog accordingly."
                    )
                })
        }

        logger.lifecycle(
            "No IntelliJ Platform version updates available. " +
                "Current: ${ideaVersion.build} (${ideaVersion.version})"
        )
    }

    private fun readCurrentVersionInfo(): ApiIdeaReleasesItem.Release {
        val catalogFile = project.rootProject.file("gradle/libs.versions.toml")

        val platformBuild = readPlatformBuild(catalogFile)
        val isStableBuild = !platformBuild.endsWith("-EAP-SNAPSHOT")
        val majorVersion = inferMajorPlatformVersion(platformBuild)

        return ApiIdeaReleasesItem.Release(
            build = platformBuild.removeSuffix("-EAP-SNAPSHOT"),
            version = "0.0.0",
            majorVersion = majorVersion,
            type = if (isStableBuild) "release" else "eap",
        )
    }

    private fun inferMajorPlatformVersion(rawBuildNumber: String) =
        "20${rawBuildNumber.take(2)}.${rawBuildNumber.substringBefore('.').last()}"

    private fun readPlatformBuild(catalogFile: File): String {
        val versionName = "idea"

        val catalogDependencyLine =
            catalogFile.useLines { lines -> lines.find { it.startsWith(versionName) } }
                ?: throw GradleException(
                    "Unable to find IJP dependency '$versionName' in the catalog file '${catalogFile.path}'"
                )

        val declaredPlatformBuild =
            catalogDependencyLine
                .substringAfter(versionName)
                .trimStart(' ', '=')
                .trimEnd()
                .trim('"')

        if (!declaredPlatformBuild.matches(intelliJPlatformBuildRegex)) {
            throw GradleException("Invalid IJP build found in version catalog: '$declaredPlatformBuild'")
        }

        return declaredPlatformBuild
    }

    private fun validateIdeaVersion(
        currentVersion: ApiIdeaReleasesItem.Release,
    ): ApiIdeaReleasesItem.Release {
        val candidateMatches = IJPVersionsFetcher.fetchIJPVersions(releasesUrl, logger)
            ?: throw GradleException("Can't fetch all IJP releases.")

        return candidateMatches.find { it.build == currentVersion.build }
            ?: throw GradleException("IJ build ${currentVersion.build} seemingly does not exist")
    }
}
