package org.jetbrains.jewel.bridge.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import org.jetbrains.jewel.bridge.retrieveColorOrUnspecified
import org.jetbrains.jewel.ui.component.styling.CircularProgressStyle
import kotlin.time.Duration.Companion.milliseconds

internal fun readCircularProgressStyle(isDark: Boolean) =
    CircularProgressStyle(
        frameTime = 125.milliseconds,
        color =
            retrieveColorOrUnspecified("ProgressIcon.color").takeOrElse {
                if (isDark) Color(0xFF6F737A) else Color(0xFFA8ADBD)
            },
    )