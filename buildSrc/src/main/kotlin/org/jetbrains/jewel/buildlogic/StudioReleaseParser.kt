package org.jetbrains.jewel.buildlogic

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.kotlin.dsl.container
import org.gradle.kotlin.dsl.property

abstract class AndroidStudioReleasesGeneratorPlugin : Plugin<Project> {

    final override fun apply(target: Project) {
        with(target) {
            val extension =
                StudioVersionsGeneratorContainer(container<StudioVersionsGeneration> {
                    StudioVersionsGeneration(it, project)
                })
            extensions.add("androidStudioReleasesGenerator", extension)

            extension.all {
//                val task = tasks.register<IntelliJThemeGeneratorTask>("generate${GUtil.toCamelCase(name)}Theme") {
//                    outputFile.set(targetDir.file(this@all.themeClassName.map {
//                        val className = ClassName.bestGuess(it)
//                        className.packageName.replace(".", "/")
//                            .plus("/${className.simpleName}.kt")
//                    }))
//                    themeClassName.set(this@all.themeClassName)
//                    ideaVersion.set(this@all.ideaVersion)
//                    themeFile.set(this@all.themeFile)
//                }
//                tasks.withType<BaseKotlinCompile> {
//                    dependsOn(task)
//                }
//                tasks.withType<Detekt> {
//                    dependsOn(task)
//                }
//                pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
//                    extensions.getByType<KotlinJvmProjectExtension>().apply {
//                        sourceSets["main"].kotlin.srcDir(targetDir)
//                    }
//                }
            }
        }
    }
}

class StudioVersionsGeneratorContainer(
    container: NamedDomainObjectContainer<StudioVersionsGeneration>
) : NamedDomainObjectContainer<StudioVersionsGeneration> by container

class StudioVersionsGeneration(val name: String, project: Project) {

    val targetDir: DirectoryProperty = project.objects.directoryProperty()
        .convention(project.layout.buildDirectory.dir("generated/studio-"))
    val dataSource = project.objects.property<String>()
        .convention("https://jb.gg/android-studio-releases-list.xml")
}

class StudioReleaseParser {
}
