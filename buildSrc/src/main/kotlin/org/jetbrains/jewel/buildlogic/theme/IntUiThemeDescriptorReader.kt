package org.jetbrains.jewel.buildlogic.theme

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName
import com.squareup.kotlinpoet.joinToCode
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import org.gradle.util.internal.GUtil

internal object IntUiThemeDescriptorReader {

    private val colorGroups = setOf("Grey", "Blue", "Green", "Red", "Yellow", "Orange", "Purple", "Teal")
    private val list = List::class.asClassName()
    private val colorClassName = ClassName("androidx.compose.ui.graphics", "Color")

    fun readThemeFrom(
        themeDescriptor: IntellijThemeDescriptor,
        className: ClassName,
        ideaVersion: String,
        descriptorUrl: String,
    ) =
        FileSpec.builder(className).apply {
            indent("    ")
            this.addFileComment("Generated by the Jewel Int UI Palette Generator\n")
            addFileComment("Generated from the IntelliJ Platform version $ideaVersion\n")
            addFileComment("Source: $descriptorUrl")

            addType(TypeSpec.objectBuilder(className).apply {
                addSuperinterface(ClassName.bestGuess("org.jetbrains.jewel.IntelliJThemeDescriptor"))

                addProperty(
                    PropertySpec.builder("isDark", Boolean::class, KModifier.OVERRIDE)
                        .initializer("%L", themeDescriptor.dark)
                        .build()
                )

                addProperty(
                    PropertySpec.builder("name", String::class, KModifier.OVERRIDE)
                        .initializer("\"%L (Int UI)\"", themeDescriptor.name)
                        .build()
                )

                readColors(className, themeDescriptor.colors)
                readIcons(themeDescriptor)
            }.build())
        }.build()

    private val colorPaletteClassName =
        ClassName.bestGuess("org.jetbrains.jewel.themes.intui.core.IntUiThemeColorPalette")
    private val iconDataClassName =
        ClassName.bestGuess("org.jetbrains.jewel.IntelliJThemeIconData")

    private fun TypeSpec.Builder.readColors(
        className: ClassName,
        colors: Map<String, String>
    ) {
        addType(TypeSpec.objectBuilder("Colors").apply {
            addSuperinterface(colorPaletteClassName)

            colors.forEach { (name, value) ->
                readColor(name, value)
            }

            colors.entries.groupBy {
                it.key.replace("""\d+""".toRegex(), "")
            }.filterKeys {
                colorGroups.contains(it)
            }.forEach { (group, colors) ->
                readColorGroup(className, group, colors)
            }
        }.build())

        addProperty(
            PropertySpec.builder("colors", colorPaletteClassName, KModifier.OVERRIDE)
                .initializer("Colors")
                .build()
        )
    }

    private fun TypeSpec.Builder.readColor(name: String, value: String) {
        addProperty(PropertySpec.builder(GUtil.toLowerCamelCase(name), colorClassName).apply {
            initializer("Color(%L)", value.replace("#", "0xFF"))
        }.build())
    }

    private fun TypeSpec.Builder.readColorGroup(
        paletteClassName: ClassName,
        group: String,
        colors: List<Map.Entry<String, String>>
    ) {
        val funcName = paletteClassName.member(GUtil.toLowerCamelCase(group))

        addFunction(FunSpec.builder(funcName).apply {
            returns(list.parameterizedBy(colorClassName))
            addModifiers(KModifier.OVERRIDE)
            addCode(CodeBlock.builder().apply {
                when {
                    colors.isEmpty() -> addStatement("return emptyList()")
                    colors.size <= 5 -> {
                        add("return listOf(")
                        colors.forEachIndexed { index, (name, _) ->
                            if (index != 0) add(",")
                            add("%N", paletteClassName.member(GUtil.toLowerCamelCase(name)))
                        }
                        add(")")
                    }

                    else -> {
                        add("return listOf(\n").indent()
                        colors.forEach { (name, _) ->
                            add("%N,\n", paletteClassName.member(GUtil.toLowerCamelCase(name)))
                        }
                        unindent().add(")")
                    }
                }
            }.build())
        }.build())

        addFunction(FunSpec.builder(funcName).apply {
            returns(colorClassName)
            addModifiers(KModifier.OVERRIDE)
            addParameter("index", Int::class)
            addCode(CodeBlock.builder().apply {
                addStatement("return %N()[index - 1]", funcName)
            }.build())
        }.build())
    }

    private fun TypeSpec.Builder.readIcons(theme: IntellijThemeDescriptor) {
        addType(TypeSpec.objectBuilder("Icons").apply {
            addSuperinterface(iconDataClassName)

            val iconOverrides = mutableMapOf<String, String>()

            for ((key, value) in theme.icons) {
                if (value is JsonPrimitive && value.isString) {
                    iconOverrides += key to value.content
                } else if (value is JsonObject && key == "ColorPalette") {
                    val colorPalette = value.entries
                        .mapNotNull {
                            val pairValue = it.value
                            if (pairValue is JsonPrimitive && pairValue.isString) {
                                it.key to pairValue.content
                            } else null
                        }.toMap()

                    addProperty(createOverrideStringMapProperty("colorPalette", colorPalette))
                }
            }

            addProperty(createOverrideStringMapProperty("iconOverrides", iconOverrides))
            addProperty(createOverrideStringMapProperty("selectionColorPalette", theme.iconColorsOnSelection))
        }.build())

        addProperty(
            PropertySpec.builder("icons", iconDataClassName, KModifier.OVERRIDE)
                .initializer("Icons")
                .build()
        )
    }

    private fun createOverrideStringMapProperty(name: String, values: Map<String, String>) =
        PropertySpec.builder(
            name = name,
            type = Map::class.asTypeName()
                .parameterizedBy(String::class.asTypeName(), String::class.asTypeName()),
            KModifier.OVERRIDE
        )
            .initializer(
                values.entries
                    .map { (key, value) -> CodeBlock.of("\"%L\" to \"%L\"", key, value) }
                    .joinToCode(prefix = "mapOf(", separator = ",\n", suffix = ")")
            )
            .build()
}
