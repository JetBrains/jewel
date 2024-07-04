@file:Suppress("UnstableApiUsage")

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.gitlab.arturbosch.detekt.Detekt
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.tasks.BaseKotlinCompile
import java.lang.reflect.Field
import java.net.URLClassLoader

val defaultOutputDir = layout.buildDirectory.dir("generated/iconKeys")

class IconKeysGeneratorContainer(
    container: NamedDomainObjectContainer<IconKeysGeneration>,
) : NamedDomainObjectContainer<IconKeysGeneration> by container

class IconKeysGeneration(
    val name: String,
    project: Project,
) {
    val outputDirectory: DirectoryProperty =
        project.objects
            .directoryProperty()
            .convention(defaultOutputDir)

    val sourceClassName: Property<String> = project.objects.property<String>()
    val generatedClassName: Property<String> = project.objects.property<String>()

}

val iconGeneration by configurations.registering {
    isCanBeConsumed = false
    isCanBeResolved = true
}

val extension = IconKeysGeneratorContainer(container<IconKeysGeneration> { IconKeysGeneration(it, project) })

extensions.add("intelliJIconKeysGenerator", extension)

extension.all item@{
    val task =
        tasks.register<IconKeysGeneratorTask>("generate${name}Keys") task@{
            this.outputDirectory = this@item.outputDirectory
            this@task.sourceClassName = this@item.sourceClassName
            this@task.generatedClassName = this@item.generatedClassName
            configuration.from(iconGeneration)
            dependsOn(iconGeneration)
        }

    tasks {
        withType<BaseKotlinCompile> { dependsOn(task) }
        withType<Detekt> { dependsOn(task) }
    }

}

pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
    the<KotlinJvmProjectExtension>().sourceSets["main"].kotlin.srcDir(defaultOutputDir)
}

open class IconKeysGeneratorTask : DefaultTask() {

    @get:OutputDirectory
    val outputDirectory = project.objects.directoryProperty()

    @get:Input
    val sourceClassName = project.objects.property<String>()

    @get:Input
    val generatedClassName = project.objects.property<String>()

    @get:InputFiles
    val configuration = project.objects.fileCollection()

    companion object {
        val dummyIconClassName = "com.intellij.ui.DummyIconImpl"

        fun Class<*>.getPathField() = declaredFields.first { it.name == "path" }

        val keyClassName = ClassName("org.jetbrains.jewel.ui.icon", "IntelliJIconKey")

        val json = Json { isLenient = true }
    }

    init {
        group = "jewel"
    }

    @TaskAction
    fun generate() {
        val arrayOfURLs = configuration.files
            .map { it.toURI().toURL() }
            .toTypedArray()

        val iconClassloader = URLClassLoader(
            arrayOfURLs,
            IconKeysGeneratorTask::class.java.classLoader
        )

        val guessedSourceClassName = sourceClassName
            .map { ClassName.bestGuess(it).canonicalName.replace('.', '/') + ".kt" }
            .get()

        val iconsClass = iconClassloader.loadClass(sourceClassName.get())

        val iconMapping = iconsClass
            .getResourceAsStream("/PlatformIconMappings.json")
            ?.use { it.readAllBytes() }
            ?.let { json.parseToJsonElement(it.decodeToString()) }
            ?: error("Icon mapping json not found")

        val map = readIconMapping(iconMapping)
        logger.lifecycle("Icon mapping json read. Has ${map.size} entries")

        val rootHolder = IconKeyHolder(iconsClass.simpleName)

        val dummyIconClass = iconClassloader.loadClass(dummyIconClassName)

        val pathField = dummyIconClass.getPathField()

        @Suppress("DEPRECATION")
        val wasAccessible = pathField.isAccessible
        pathField.isAccessible = true
        visit(iconsClass, map, rootHolder, pathField, iconClassloader)
        pathField.isAccessible = wasAccessible

        logger.lifecycle("Read icon keys from ${iconsClass.name}")
        val fileSpec = generateKotlinCode(rootHolder)
        val directory = outputDirectory.get().asFile
        fileSpec.writeTo(directory)

        logger.lifecycle("Written icon keys for $guessedSourceClassName into ${directory}")
    }

    private fun readIconMapping(rawMapping: JsonElement): Map<String, String> {
        val flattenedMappings = mutableMapOf<String, Set<String>>()

        visitMapping(oldUiPath = "", node = rawMapping, map = flattenedMappings)

        return flattenedMappings
            .flatMap { (newPath, oldPaths) ->
                oldPaths.map { oldPath -> oldPath to newPath }
            }.toMap()
    }

    private fun visitMapping(
        oldUiPath: String,
        node: JsonElement,
        map: MutableMap<String, Set<String>>,
    ) {
        when (node) {
            is JsonPrimitive -> {
                if (!node.isString) return
                map[oldUiPath] = setOf(node.content)
            }

            is JsonArray -> {
                map[oldUiPath] =
                    node
                        .filterIsInstance<JsonPrimitive>()
                        .filter { child -> child.isString }
                        .map { it.content }
                        .toSet()
            }

            is JsonObject -> {
                for ((key, value) in node.entries) {
                    val childOldPath = if (oldUiPath.isNotEmpty()) "$oldUiPath/$key" else key
                    visitMapping(oldUiPath = childOldPath, node = value, map = map)
                }
            }

            JsonNull -> error("Null nodes not supported")
        }
    }

    private fun visit(
        clazz: Class<*>,
        map: Map<String, String>,
        parentHolder: IconKeyHolder,
        pathField: Field,
        classLoader: ClassLoader
    ) {
        for (child in clazz.declaredClasses) {
            val childName = "${parentHolder.name}.${child.simpleName}"
            val childHolder = IconKeyHolder(childName)
            parentHolder.holders += childHolder
            visit(child, map, childHolder, pathField, classLoader)
        }
        parentHolder.holders.sortBy { it.name }

        clazz.declaredFields
            .filter { it.type == javax.swing.Icon::class.java }
            .forEach { field ->
                val fieldName = "${parentHolder.name}.${field.name}"

                if (field.annotations.isNotEmpty()) {
                    logger.lifecycle(
                        "$fieldName -> ${field.annotations.joinToString { it!!.annotationClass.qualifiedName!! }}",
                    )
                }

                if (field.annotations.any { it.annotationClass == java.lang.Deprecated::class }) {
                    logger.lifecycle("Ignoring deprecated field: $fieldName")
                    return
                }

                val icon = field.get(clazz)
                val oldPath = pathField.get(icon) as String

                val newPath = map[oldPath]
                validatePath(oldPath, fieldName, classLoader)
                newPath?.let { validatePath(it, fieldName, classLoader) }
                parentHolder.keys += IconKey(fieldName, oldPath, newPath)
            }
        parentHolder.keys.sortBy { it.name }
    }

    private fun validatePath(
        path: String,
        fieldName: String,
        classLoader: ClassLoader
    ) {
        val iconsClass = classLoader.loadClass(sourceClassName.get())
        if (iconsClass.getResourceAsStream("/${path.trimStart('/')}") == null) {
            logger.warn("Icon $fieldName: '$path' does not exist")
        }
    }

    private fun generateKotlinCode(rootHolder: IconKeyHolder): FileSpec {
        val className = ClassName.bestGuess(generatedClassName.get())

        return FileSpec
            .builder(className)
            .apply {
                indent("    ")
                addFileComment("Generated by the Jewel icon keys generator\n")
                addFileComment("Source class: ${sourceClassName.get()}")

                addImport(keyClassName.packageName, keyClassName.simpleName)

                val objectName = ClassName.bestGuess(generatedClassName.get())
                addType(
                    TypeSpec
                        .objectBuilder(objectName)
                        .apply {
                            for (childHolder in rootHolder.holders) {
                                generateKotlinCodeInner(childHolder)
                            }

                            for (key in rootHolder.keys) {
                                addProperty(
                                    PropertySpec
                                        .builder(key.name.substringAfterLast('.'), keyClassName)
                                        .initializer(
                                            "%L",
                                            """IntelliJIconKey("${key.oldPath}", "${key.newPath ?: key.oldPath}")""",
                                        ).build(),
                                )
                            }
                        }.build(),
                )
            }.build()
    }

    private fun TypeSpec.Builder.generateKotlinCodeInner(holder: IconKeyHolder) {
        val objectName = holder.name.substringAfterLast('.')
        addType(
            TypeSpec
                .objectBuilder(objectName)
                .apply {
                    for (childHolder in holder.holders) {
                        generateKotlinCodeInner(childHolder)
                    }

                    for (key in holder.keys) {
                        addProperty(
                            PropertySpec
                                .builder(key.name.substringAfterLast('.'), keyClassName)
                                .initializer(
                                    "%L",
                                    """IntelliJIconKey("${key.oldPath}", "${key.newPath ?: key.oldPath}")"""
                                )
                                .build(),
                        )
                    }
                }.build(),
        )
    }
}

private data class IconKeyHolder(
    val name: String,
    val holders: MutableList<IconKeyHolder> = mutableListOf(),
    val keys: MutableList<IconKey> = mutableListOf(),
)

private data class IconKey(
    val name: String,
    val oldPath: String,
    val newPath: String?,
)
