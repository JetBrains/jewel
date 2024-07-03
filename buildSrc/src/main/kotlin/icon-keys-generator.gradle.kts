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

class IconKeysGeneratorContainer(container: NamedDomainObjectContainer<IconKeysGeneration>) :
    NamedDomainObjectContainer<IconKeysGeneration> by container

class IconKeysGeneration(val name: String, project: Project) {

    val targetDir: DirectoryProperty =
        project.objects
            .directoryProperty()
            .convention(project.layout.buildDirectory.dir("generated/iconKeys"))

    val sourceClassName: Property<String> = project.objects.property<String>()

    val generatedClassName: Property<String> = project.objects.property<String>()
}

val extension = IconKeysGeneratorContainer(container<IconKeysGeneration> { IconKeysGeneration(it, project) })

extensions.add("intelliJIconKeysGenerator", extension)

extension.all {
    val task =
        tasks.register<IconKeysGeneratorTask>("generate${name}Keys") {
            val paths = this@all.generatedClassName.map {
                val className = ClassName.bestGuess(it)
                className.canonicalName.replace('.', '/') + ".kt"
            }

            this@register.outputFile = this@all.targetDir.file(paths)
            this@register.sourceClassName = this@all.sourceClassName
            this@register.generatedClassName = this@all.generatedClassName
        }

    tasks {
        withType<BaseKotlinCompile> { dependsOn(task) }
        withType<Detekt> { dependsOn(task) }
    }

    pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
        the<KotlinJvmProjectExtension>().sourceSets["main"].kotlin.srcDir(targetDir)
    }
}

open class IconKeysGeneratorTask() : DefaultTask() {

    @get:OutputFile
    val outputFile: RegularFileProperty = project.objects.fileProperty()

    @get:Input
    val sourceClassName = project.objects.property<String>()

    @get:Input
    val generatedClassName = project.objects.property<String>()

    private val dummyIconClass = Class.forName("com.intellij.ui.DummyIconImpl")
    private val pathField = dummyIconClass.declaredFields.first { it.name == "path" }
    private val keyClassName = ClassName("org.jetbrains.jewel.ui.icon", "IntelliJIconKey")

    init {
        group = "jewel"
    }

    @TaskAction
    fun generate() {
        val iconsClass = Class.forName(sourceClassName.get())
        val json = Json { isLenient = true }
        val iconMapping = iconsClass.getResourceAsStream("/PlatformIconMappings.json").use {
            json.parseToJsonElement(it!!.readAllBytes().decodeToString())
        }

        val map = readIconMapping(iconMapping)
        logger.lifecycle("Icon mapping json read. Has ${map.size} entries")

        val rootHolder = IconKeyHolder(iconsClass.simpleName)

        @Suppress("DEPRECATION")
        val wasAccessible = pathField.isAccessible
        pathField.isAccessible = true
        visit(iconsClass, map, rootHolder)
        pathField.isAccessible = wasAccessible

        logger.lifecycle("Read icon keys from ${iconsClass.name}")
        val fileSpec = generateKotlinCode(rootHolder)
        val outputFile = outputFile.get().asFile
        outputFile.bufferedWriter().use { fileSpec.writeTo(it) }
        logger.lifecycle("Written icon keys for ${sourceClassName.get()} into ${outputFile.path}")
    }

    private fun readIconMapping(rawMapping: JsonElement): Map<String, String> {
        val flattenedMappings = mutableMapOf<String, Set<String>>()

        visitMapping(oldUiPath = "", node = rawMapping, map = flattenedMappings)

        return flattenedMappings.flatMap { (newPath, oldPaths) ->
            oldPaths.map { oldPath -> oldPath to newPath }
        }.toMap()
    }

    private fun visitMapping(oldUiPath: String, node: JsonElement, map: MutableMap<String, Set<String>>) {
        when (node) {
            is JsonPrimitive -> {
                if (!node.isString) return
                map[oldUiPath] = setOf(node.content)
            }

            is JsonArray -> {
                map[oldUiPath] = node.filterIsInstance<JsonPrimitive>()
                    .filter { child -> child.isString }
                    .map { it.content }
                    .toSet()
            }

            is JsonObject -> {
                for ((key, value) in node.entries) {
                    visitMapping(oldUiPath = "$oldUiPath/$key", node = value, map = map)
                }
            }

            JsonNull -> error("dio bavoso")
        }
    }

    private fun visit(
        clazz: Class<*>,
        map: Map<String, String>,
        parentHolder: IconKeyHolder,
    ) {
        for (child in clazz.declaredClasses) {
            val childName = "${parentHolder.name}.${child.simpleName}"
            val childHolder = IconKeyHolder(childName)
            parentHolder.holders += childHolder
            visit(child, map, childHolder)
        }
        parentHolder.holders.sortBy { it.name }

        clazz.declaredFields.filter { it.type == javax.swing.Icon::class.java }
            .forEach { field ->
                val fieldName = "${parentHolder.name}.${field.name}"

                if (field.annotations.isNotEmpty()) {
                    logger.lifecycle(
                        "$fieldName -> ${field.annotations.joinToString { it!!.annotationClass.qualifiedName!! }}"
                    )
                }

                if (field.annotations.any { it.annotationClass == java.lang.Deprecated::class }) {
                    logger.lifecycle("Ignoring deprecated field: $fieldName")
                    return
                }

                val icon = field.get(clazz)
                val oldPath = pathField.get(icon) as String

                val newPath = map[oldPath]
                validatePath(oldPath, fieldName)
                newPath?.let { validatePath(it, fieldName) }
                parentHolder.keys += IconKey(fieldName, oldPath, newPath)
            }
        parentHolder.keys.sortBy { it.name }
    }

    private fun validatePath(path: String, fieldName: String) {
        val iconsClass = Class.forName(sourceClassName.get())
        if (iconsClass.getResourceAsStream("/${path.trimStart('/')}") == null) {
            logger.warn("Icon $fieldName: '$path' does not exist")
        }
    }

    private fun generateKotlinCode(rootHolder: IconKeyHolder): FileSpec {
        val className = ClassName.bestGuess(generatedClassName.get())

        return FileSpec.builder(className).apply {
            indent("    ")
            addFileComment("Generated by the Jewel icon keys generator\n")
            addFileComment("Source class: ${sourceClassName.get()}")

            addImport(keyClassName.packageName, keyClassName.simpleName)

            val objectName = ClassName.bestGuess(generatedClassName.get())
            addType(
                TypeSpec.objectBuilder(objectName).apply {
                    for (childHolder in rootHolder.holders) {
                        generateKotlinCodeInner(childHolder)
                    }

                    for (key in rootHolder.keys) {
                        addProperty(
                            PropertySpec.builder(key.name.substringAfterLast('.'), keyClassName)
                                .initializer(
                                    "%L",
                                    """IntelliJIconKey("${key.oldPath}", "${key.newPath ?: key.oldPath}")"""
                                )
                                .build()
                        )
                    }
                }.build()
            )
        }.build()
    }

    private fun TypeSpec.Builder.generateKotlinCodeInner(holder: IconKeyHolder) {
        val objectName = holder.name.substringAfterLast('.')
        addType(
            TypeSpec.objectBuilder(objectName).apply {
                for (childHolder in holder.holders) {
                    generateKotlinCodeInner(childHolder)
                }

                for (key in holder.keys) {
                    addProperty(
                        PropertySpec.builder(key.name.substringAfterLast('.'), keyClassName)
                            .initializer("%L", """IntelliJIconKey("${key.oldPath}", "${key.newPath ?: key.oldPath}")""")
                            .build()
                    )
                }
            }.build()
        )
    }
}

private data class IconKeyHolder(
    val name: String,
    val holders: MutableList<IconKeyHolder> = mutableListOf(),
    val keys: MutableList<IconKey> = mutableListOf(),
)

private data class IconKey(val name: String, val oldPath: String, val newPath: String?)
