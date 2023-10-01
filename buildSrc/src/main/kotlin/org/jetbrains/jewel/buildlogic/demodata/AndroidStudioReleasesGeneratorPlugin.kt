package org.jetbrains.jewel.buildlogic.demodata

import com.squareup.kotlinpoet.ClassName
import gradle.kotlin.dsl.accessors._c011fd04eb69b06af6f445fec200c5f6.main
import gradle.kotlin.dsl.accessors._c011fd04eb69b06af6f445fec200c5f6.sourceSets
import io.gitlab.arturbosch.detekt.Detekt
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.provider.SetProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.property
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.setProperty
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.tasks.BaseKotlinCompile
import java.io.File
import java.net.URL

abstract class AndroidStudioReleasesGeneratorPlugin : Plugin<Project> {

    final override fun apply(target: Project) {
        with(target) {
            val extension = extensions.findByType(StudioVersionsGenerationExtension::class.java)
                ?: extensions.create("androidStudioReleasesGenerator", StudioVersionsGenerationExtension::class.java)

            val task =
                tasks.register<AndroidStudioReleasesGeneratorTask>("generateAndroidStudioReleasesList") {
                    val className = ClassName.bestGuess(OUTPUT_CLASS_NAME)
                    outputFile.set(
                        extension.targetDir.file(
                            className.packageName.replace(".", "/")
                                .plus("/${className.simpleName}.kt")
                        )
                    )
                    dataUrl.set(extension.dataUrl)
                    resourcesDirs.set(extension.resourcesDirs)
                }
            tasks.withType<BaseKotlinCompile> {
                dependsOn(task)
            }
            tasks.withType<Detekt> {
                dependsOn(task)
            }
            pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
                extensions.getByType<KotlinJvmProjectExtension>().apply {
                    sourceSets["main"].kotlin.srcDir(extension.targetDir)
                }
            }
        }
    }
}

open class StudioVersionsGenerationExtension(project: Project) {

    val targetDir: DirectoryProperty = project.objects.directoryProperty()
        .convention(project.layout.buildDirectory.dir("generated/studio-releases/"))

    val resourcesDirs: SetProperty<File> = project.objects.setProperty<File>()
        .convention(project.sourceSets.main.get().resources.srcDirs)

    val dataUrl: Property<String> = project.objects.property<String>()
        .convention("https://jb.gg/android-studio-releases-list.json")
}

private const val OUTPUT_CLASS_NAME = "org.jetbrains.jewel.samples.ideplugin.AndroidStudioReleases"

open class AndroidStudioReleasesGeneratorTask : DefaultTask() {

    @get:OutputFile
    val outputFile: RegularFileProperty = project.objects.fileProperty()

    @get:Input
    val dataUrl = project.objects.property<String>()

    @get:Input
    val resourcesDirs = project.objects.setProperty<File>()

    init {
        group = "jewel"
    }

    @TaskAction
    fun generate() {
        val json = Json {
            ignoreUnknownKeys = true
            isLenient = true
        }
        val url = dataUrl.get()
        val lookupDirs = resourcesDirs.get()

        logger.lifecycle("Fetching Android Studio releases list from $url...")
        logger.debug(
            "Registered resources directories:\n" +
                lookupDirs.joinToString("\n") { " * ${it.absolutePath}" }
        )
        val releases = URL(url).openStream()
            .use { json.decodeFromStream<ApiAndroidStudioReleases>(it) }

        val className = ClassName.bestGuess(OUTPUT_CLASS_NAME)
        val file = AndroidStudioReleasesReader.readFrom(releases, className, url, lookupDirs)

        val outputFile = outputFile.get().asFile
        outputFile.bufferedWriter().use { file.writeTo(it) }
        logger.lifecycle("Android Studio releases from $url parsed and code generated into ${outputFile.path}")
    }
}
