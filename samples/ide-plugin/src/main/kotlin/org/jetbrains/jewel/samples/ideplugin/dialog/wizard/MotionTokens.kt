package org.jetbrains.jewel.samples.ideplugin.dialog.wizard

// Adopted from Material Expressive motion tokens
object MotionTokens {
    // https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/material3/material3/src/commonMain/kotlin/androidx/compose/material3/tokens/StandardMotionTokens.kt
    object Standard {
        val SpringDefaultSpatialDamping = 0.9f
        val SpringDefaultSpatialStiffness = 700.0f
        val SpringDefaultEffectsDamping = 1.0f
        val SpringDefaultEffectsStiffness = 1600.0f
        val SpringFastSpatialDamping = 0.9f
        val SpringFastSpatialStiffness = 1400.0f
        val SpringFastEffectsDamping = 1.0f
        val SpringFastEffectsStiffness = 3800.0f
        val SpringSlowSpatialDamping = 0.9f
        val SpringSlowSpatialStiffness = 300.0f
        val SpringSlowEffectsDamping = 1.0f
        val SpringSlowEffectsStiffness = 800.0f
    }

    // https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/material3/material3/src/commonMain/kotlin/androidx/compose/material3/tokens/ExpressiveMotionTokens.kt
    object Expressive {
        val SpringDefaultSpatialDamping = 0.8f
        val SpringDefaultSpatialStiffness = 380.0f
        val SpringDefaultEffectsDamping = 1.0f
        val SpringDefaultEffectsStiffness = 1600.0f
        val SpringFastSpatialDamping = 0.6f
        val SpringFastSpatialStiffness = 800.0f
        val SpringFastEffectsDamping = 1.0f
        val SpringFastEffectsStiffness = 3800.0f
        val SpringSlowSpatialDamping = 0.8f
        val SpringSlowSpatialStiffness = 200.0f
        val SpringSlowEffectsDamping = 1.0f
        val SpringSlowEffectsStiffness = 800.0f
    }
}