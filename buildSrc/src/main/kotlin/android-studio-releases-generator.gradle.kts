import com.squareup.kotlinpoet.ClassName
import io.gitlab.arturbosch.detekt.Detekt
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType
import org.jetbrains.jewel.buildlogic.demodata.AndroidStudioReleasesGeneratorTask
import org.jetbrains.jewel.buildlogic.demodata.STUDIO_RELEASES_OUTPUT_CLASS_NAME
import org.jetbrains.jewel.buildlogic.demodata.StudioVersionsGenerationExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.tasks.BaseKotlinCompile

val extension = extensions.findByType(StudioVersionsGenerationExtension::class.java)
    ?: extensions.create("androidStudioReleasesGenerator", StudioVersionsGenerationExtension::class.java)

val task =
    tasks.register<AndroidStudioReleasesGeneratorTask>("generateAndroidStudioReleasesList") {
        val className = ClassName.bestGuess(STUDIO_RELEASES_OUTPUT_CLASS_NAME)
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
