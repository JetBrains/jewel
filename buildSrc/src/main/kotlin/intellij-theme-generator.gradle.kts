import com.squareup.kotlinpoet.ClassName
import io.gitlab.arturbosch.detekt.Detekt
import org.gradle.kotlin.dsl.container
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType
import org.gradle.util.internal.GUtil
import org.jetbrains.jewel.buildlogic.theme.IntelliJThemeGeneratorTask
import org.jetbrains.jewel.buildlogic.theme.ThemeGeneration
import org.jetbrains.jewel.buildlogic.theme.ThemeGeneratorContainer
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.tasks.BaseKotlinCompile

val extension = ThemeGeneratorContainer(container<ThemeGeneration> { ThemeGeneration(it, project) })
extensions.add("intelliJThemeGenerator", extension)

extension.all {
    val task = tasks.register<IntelliJThemeGeneratorTask>("generate${GUtil.toCamelCase(name)}Theme") {
        outputFile.set(targetDir.file(this@all.themeClassName.map {
            val className = ClassName.bestGuess(it)
            className.packageName.replace(".", "/")
                .plus("/${className.simpleName}.kt")
        }))
        themeClassName.set(this@all.themeClassName)
        ideaVersion.set(this@all.ideaVersion)
        themeFile.set(this@all.themeFile)
    }
    tasks.withType<BaseKotlinCompile> {
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
