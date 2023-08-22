package org.jetbrains.jewel.buildlogic.theme

import com.squareup.kotlinpoet.ClassName
import io.gitlab.arturbosch.detekt.Detekt
import java.net.URL
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromStream
import org.gradle.api.DefaultTask
import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.container
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.property
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType
import org.gradle.util.internal.GUtil
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

abstract class IntelliJThemeGeneratorPlugin : Plugin<Project> {

    final override fun apply(target: Project): Unit = with(target) {
        val extension = ThemeGeneratorContainer(container<ThemeGeneration> { ThemeGeneration(it, project) })
        extensions.add("intelliJThemeGenerator", extension)

        extension.all {
            val task = tasks.register<IntelliJThemeGeneratorTask>("generate${GUtil.toCamelCase(name)}Theme") {
                output.set(targetDir.file(this@all.themeClassName.map {
                    val className = ClassName.bestGuess(it)
                    className.packageName.replace(".", "/")
                        .plus("/${className.simpleName}.kt")
                }))
                themeClassName.set(this@all.themeClassName)
                ideaVersion.set(this@all.ideaVersion)
                themeFile.set(this@all.themeFile)
            }
            tasks.withType<KotlinCompile> {
                dependsOn(task)
            }
            tasks.withType<Detekt> {
                dependsOn(task)
            }
            pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
                extensions.getByType<KotlinJvmProjectExtension>().apply {
                    sourceSets["main"].kotlin.srcDir(targetDir)
                }
            }
        }
    }
}

class ThemeGeneratorContainer(container: NamedDomainObjectContainer<ThemeGeneration>) : NamedDomainObjectContainer<ThemeGeneration> by container

class ThemeGeneration(val name: String, project: Project) {
    val targetDir: DirectoryProperty = project.objects.directoryProperty()
        .convention(project.layout.buildDirectory.dir("generated/theme"))
    val ideaVersion = project.objects.property<String>()
        .convention("232.6734")
    val themeClassName = project.objects.property<String>()
    val themeFile = project.objects.property<String>()
}

open class IntelliJThemeGeneratorTask : DefaultTask() {

    @get:OutputFile
    val output = project.objects.fileProperty()

    @get:Input
    val ideaVersion = project.objects.property<String>()

    @get:Input
    val themeFile = project.objects.property<String>()

    @get:Input
    val themeClassName = project.objects.property<String>()

    init {
        group = "jewel"
    }

    private val json = Json {
        ignoreUnknownKeys = true
    }

    @TaskAction
    fun generate() {
        val url = buildString {
            append("https://raw.githubusercontent.com/JetBrains/intellij-community/")
            append(ideaVersion.get())
            append("/")
            append(themeFile.get())
        }

        val theme = URL(url).openStream()
            .use { json.decodeFromStream<IntellijThemeDescriptor>(it) }

        val className = ClassName.bestGuess(themeClassName.get())
        val file = ThemeDescriptorReader.readThemeFrom(theme, className, ideaVersion.get(), url)

        output.get().asFile.bufferedWriter()
            .use { file.writeTo(it) }
    }
}

@Serializable
data class IntellijThemeDescriptor(
    val name: String,
    val author: String = "",
    val dark: Boolean = false,
    val editorScheme: String,
    val colors: Map<String, String> = emptyMap(),
    val ui: Map<String, JsonElement> = emptyMap(),
    val icons: Map<String, JsonElement> = emptyMap(),
)
