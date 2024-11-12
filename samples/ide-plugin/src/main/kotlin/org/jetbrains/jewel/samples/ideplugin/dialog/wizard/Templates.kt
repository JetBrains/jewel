package org.jetbrains.jewel.samples.ideplugin.dialog.wizard

import org.jetbrains.jewel.samples.ideplugin.dialog.TemplateIllustrations
import org.jetbrains.jewel.ui.icon.PathIconKey

interface TemplateWizardPage {
    val templateData: Template
}

enum class FormFactors {
    PhoneAndTablet,
    TV,
    Automotive,
    Wear,
}

enum class SampleCategories {
    Jetpack,
    Compose,
    Architecture,
    Gemini,
    Media,
}

data class Template(val name: String, val description: String? = null, val imageKey: PathIconKey)

val noActivityTemplate =
    Template(name = "Empty", description = "An empty project", imageKey = TemplateIllustrations.NoActivity)

val PhoneTemplates =
    listOf(
        Template(name = "App", description = "Basic app structure", imageKey = TemplateIllustrations.EmptyActivity),
        Template(
            name = "Adaptive",
            description = "Adaptive layout for responsive design",
            imageKey = TemplateIllustrations.ResponsiveLayout,
        ),
        Template(
            name = "Gemini Starter App",
            description = "A starter app for the Gemini framework",
            imageKey = TemplateIllustrations.GeminiStarter,
        ),
        Template(
            name = "Fullscreen App",
            description = "App with a fullscreen UI",
            imageKey = TemplateIllustrations.FullscreenActivity,
        ),
        Template(
            name = "Google Maps",
            description = "Project with Google Maps integration",
            imageKey = TemplateIllustrations.GoogleMapsActivity,
        ),
        Template(name = "Game", description = "Basic game project", imageKey = TemplateIllustrations.GameActivity),
        Template(name = "C++", description = "Project using C++", imageKey = TemplateIllustrations.Cpp),
    )
