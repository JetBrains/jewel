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

val noActivityTemplate = Template(name = "Empty", imageKey = TemplateIllustrations.NoActivity)
val PhoneTemplates =
    listOf(
        noActivityTemplate,
        Template(name = "App", imageKey = TemplateIllustrations.EmptyActivity),
        Template(name = "Adaptive", imageKey = TemplateIllustrations.ResponsiveLayout),
        Template(name = "Gemini Starter App", imageKey = TemplateIllustrations.GeminiStarter),
        Template(name = "Fullscreen App", imageKey = TemplateIllustrations.FullscreenActivity),
        Template(name = "Google Maps", imageKey = TemplateIllustrations.GoogleMapsActivity),
        Template(name = "Game", imageKey = TemplateIllustrations.GameActivity),
        Template(name = "C++", imageKey = TemplateIllustrations.Cpp),
    )
