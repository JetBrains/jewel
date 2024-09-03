package org.jetbrains.jewel.buildlogic.demodata

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.joinToCode
import java.io.File
import java.time.ZonedDateTime

private val ContentItemClassName =
    ClassName.bestGuess("org.jetbrains.jewel.samples.ideplugin.releasessample.ContentItem.AndroidStudio")

internal object AndroidStudioReleasesReader {

    fun readFrom(releases: ApiAndroidStudioReleases, className: ClassName, url: String, resourceDirs: Set<File>) =
        FileSpec.builder(className)
            .apply {
                indent("    ")
                addFileComment("Generated by the Jewel Android Studio Releases Generator\n")
                addFileComment("Generated from $url on ${ZonedDateTime.now()}")

                addImport("org.jetbrains.jewel.samples.ideplugin.releasessample", "ContentItem.AndroidStudio")
                addImport("kotlinx.datetime", "LocalDate")

                addType(createBaseTypeSpec(className, releases, resourceDirs))
            }
            .build()

    private fun createBaseTypeSpec(className: ClassName, releases: ApiAndroidStudioReleases, resourceDirs: Set<File>) =
        TypeSpec.objectBuilder(className)
            .superclass(
                ClassName.bestGuess("org.jetbrains.jewel.samples.ideplugin.releasessample.ContentSource")
                    .parameterizedBy(ContentItemClassName)
            )
            .apply {
                addProperty(
                    PropertySpec.builder(
                            name = "items",
                            type = List::class.asClassName().parameterizedBy(ContentItemClassName),
                            KModifier.OVERRIDE,
                        )
                        .initializer(readReleases(releases, resourceDirs))
                        .build()
                )

                addProperty(
                    PropertySpec.builder("displayName", type = String::class.asClassName(), KModifier.OVERRIDE)
                        .initializer("\"%L\"", "Android Studio releases")
                        .build()
                )
            }
            .build()

    private fun readReleases(releases: ApiAndroidStudioReleases, resourceDirs: Set<File>) =
        releases.content.item
            .map { readRelease(it, resourceDirs) }
            .joinToCode(prefix = "listOf(\n", separator = ",\n", suffix = ")")

    private fun readRelease(release: ApiAndroidStudioReleases.Content.Item, resourceDirs: Set<File>) =
        CodeBlock.builder()
            .apply {
                add("AndroidStudio(\n")
                add("    displayText = \"%L\",\n", release.name)
                add("    imagePath = %L,\n", imagePathForOrNull(release, resourceDirs))
                add("    versionName = \"%L\",\n", release.version)
                add("    build = \"%L\",\n", release.build)
                add("    platformBuild = \"%L\",\n", release.platformBuild)
                add("    platformVersion = \"%L\",\n", release.platformVersion)
                add("    channel = %L,\n", readChannel(release.channel))
                add("    releaseDate = LocalDate(%L),\n", translateDate(release.date))
                add("    key = \"%L\",\n", release.build)
                add(")")
            }
            .build()

    private fun imagePathForOrNull(release: ApiAndroidStudioReleases.Content.Item, resourceDirs: Set<File>): String? {
        // Take the release animal from the name, remove spaces and voila'
        val releaseAnimal = release.name.substringBefore(" | ").substringAfter("Android Studio").trim().replace(" ", "")

        if (releaseAnimal.isEmpty() || releaseAnimal.any { it.isDigit() }) return null

        // We only have stable and canary splash screens. Betas use the stable ones.
        val channel =
            release.channel.lowercase().let {
                when (it) {
                    "release",
                    "rc",
                    "stable",
                    "beta",
                    "patch" -> "stable"
                    "canary",
                    "preview",
                    "alpha" -> "canary"
                    else -> {
                        println("  Note: channel '${it}' isn't supported for splash screens")
                        null
                    }
                }
            } ?: return null

        val splashPath = "/studio-splash-screens/$releaseAnimal-$channel.png"
        val splashFiles = resourceDirs.map { dir -> File(dir, splashPath) }
        if (splashFiles.none { it.isFile }) {
            println("  Note: expected splash screen file doesn't exist: '${splashPath}'")
            return null
        }

        return "\"$splashPath\""
    }

    // This is the laziest crap ever, I am sorry.
    private fun translateDate(rawDate: String): String {
        val month = rawDate.substringBefore(" ").trimStart('0')
        val year = rawDate.substringAfterLast(" ".trimStart('0'))
        val day = rawDate.substring(month.length + 1, rawDate.length - year.length - 1).trimStart('0')

        if (day.isEmpty()) {
            println("$rawDate\nMonth: '$month'\nYear: '$year'")
        }

        val monthNumber =
            when (month.trim().lowercase()) {
                "january" -> 1
                "february" -> 2
                "march" -> 3
                "april" -> 4
                "may" -> 5
                "june" -> 6
                "july" -> 7
                "august" -> 8
                "september" -> 9
                "october" -> 10
                "november" -> 11
                "december" -> 12
                else -> error("Unrecognized month: $month")
            }

        return "$year, $monthNumber, $day"
    }

    private fun readChannel(rawChannel: String) =
        when (rawChannel.lowercase().trim()) {
            "stable",
            "patch",
            "release" -> "ReleaseChannel.Stable"
            "beta" -> "ReleaseChannel.Beta"
            "canary" -> "ReleaseChannel.Canary"
            else -> "ReleaseChannel.Other"
        }
}
