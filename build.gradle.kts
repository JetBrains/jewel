plugins {
    alias(libs.plugins.composeDesktop) apply false
    `jewel-linting`
}

dependencies {
    sarif(projects.foundation)
    sarif(projects.ideLafBridge)
    sarif(projects.samples.idePlugin)
    sarif(projects.ui)
}

tasks {
    val mergeSarifReports by registering(MergeSarifTask::class) {
        source(configurations.outgoingSarif)
        include { it.file.extension == "sarif" }
    }

    register("check") { dependsOn(mergeSarifReports) }
}
