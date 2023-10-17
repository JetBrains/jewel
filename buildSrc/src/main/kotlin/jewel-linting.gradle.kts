@file:Suppress("UnstableApiUsage")

plugins {
    id("io.gitlab.arturbosch.detekt")
    id("org.jmailen.kotlinter")
}

configurations {
    val dependencies = dependencyScope("sarif")
    register("outgoingSarif") {
        isCanBeConsumed = true
        isCanBeResolved = true
        extendsFrom(dependencies.get())
        attributes {
            attribute(Usage.USAGE_ATTRIBUTE, objects.named("sarif"))
        }
    }
}



