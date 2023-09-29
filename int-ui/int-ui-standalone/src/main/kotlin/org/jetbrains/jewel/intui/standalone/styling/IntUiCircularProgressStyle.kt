package org.jetbrains.jewel.intui.standalone.styling

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.styling.CircularProgressStyle
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

@Stable
data class IntUiCircularProgressStyle(
    override val svgLoader: SvgLoader,
    override val frameTime: Duration,
    override val color: Color,
) : CircularProgressStyle {

    companion object {

        fun dark(
            svgLoader: SvgLoader,
            frameTime: Duration = 125.milliseconds,
            color: Color = Color(0xFF6F737A),
        ) = IntUiCircularProgressStyle(svgLoader, frameTime, color)

        fun light(
            svgLoader: SvgLoader,
            frameTime: Duration = 125.milliseconds,
            color: Color = Color(0xFFA8ADBD),
        ) = IntUiCircularProgressStyle(svgLoader, frameTime, color)
    }
}
