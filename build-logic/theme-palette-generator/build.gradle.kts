plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlinSerialization)
}

group = "org.jetbrains.jewel"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.kotlinpoet)
    implementation(libs.kotlinx.serialization.json)
}

gradlePlugin {
    plugins {
        register("intui-palette-generator") {
            id = "org.jetbrains.jewel.palette.generator.intui"
            implementationClass = "org.jetbrains.jewel.buildlogic.palette.IntUiPaletteGeneratePlugin"
        }
    }
}

kotlin.target.compilations.all {
    kotlinOptions {
        jvmTarget = "17"
    }
}
