plugins {
    alias(libs.plugins.composeDesktop) apply false
    `jewel-linting`
}

dependencies {
    sarif(projects.decoratedWindow)
    sarif(projects.foundation)
    sarif(projects.ideLafBridge)
    sarif(projects.intUi.intUiDecoratedWindow)
    sarif(projects.intUi.intUiStandalone)
    sarif(projects.markdown.core)
    sarif(projects.markdown.extension.autolink)
    sarif(projects.markdown.extension.gfmAlerts)
    sarif(projects.markdown.ideLafBridgeStyling)
    sarif(projects.markdown.intUiStandaloneStyling)
    sarif(projects.samples.idePlugin)
    sarif(projects.samples.standalone)
    sarif(projects.ui)
}

// TODO remove this once the Skiko fix makes it into CMP 1.7.1
allprojects {
    configurations.all {
        resolutionStrategy {
            eachDependency {
                if (requested.group == "org.jetbrains.skiko") {
                    useVersion("0.8.17")
                    because("Contains important memory usage fix")
                }
            }
        }
    }
}

tasks {
//    val mergeSarifReports by
//        registering(MergeSarifTask::class) {
//            source(configurations.outgoingSarif)
//            include { it.file.extension == "sarif" }
//        }
//
//    register("check") { dependsOn(mergeSarifReports) }
}
