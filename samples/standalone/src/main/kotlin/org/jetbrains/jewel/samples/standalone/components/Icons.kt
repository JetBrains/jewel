package org.jetbrains.jewel.samples.standalone.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.samples.standalone.StandaloneSampleIcons
import org.jetbrains.jewel.ui.component.GroupHeader
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.painter.badge.DotBadgeShape
import org.jetbrains.jewel.ui.painter.hints.Badge
import org.jetbrains.jewel.ui.painter.hints.Stroke
import org.jetbrains.jewel.ui.painter.rememberResourcePainterProvider
import org.jetbrains.jewel.ui.theme.colorPalette

@Composable
internal fun Icons() {
    GroupHeader("Icons")

    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        val iconProvider = rememberResourcePainterProvider("icons/jewel-logo.svg", StandaloneSampleIcons::class.java)
        val logo by iconProvider.getPainter()

        Icon(logo, "Jewel Logo", Modifier.size(16.dp))
        Icon(logo, "Jewel Logo", Modifier.size(32.dp))
        Icon(logo, "Jewel Logo", Modifier.size(64.dp))
        Icon(logo, "Jewel Logo", Modifier.size(128.dp))
        Icon(
            logo,
            "Jewel Logo",
            ColorFilter.tint(Color.Magenta, BlendMode.Multiply),
            Modifier.size(128.dp),
        )

        val badged by iconProvider.getPainter(Badge(Color.Red, DotBadgeShape.Default))
        Icon(badged, "Jewel Logo", Modifier.size(20.dp))

        val restartIconProvider = rememberResourcePainterProvider("icons/taskGroup.svg", StandaloneSampleIcons::class.java)

        val normal by restartIconProvider.getPainter()
        val stroked by restartIconProvider.getPainter(Stroke(true))

        Box(Modifier.size(24.dp)) {
            Icon(normal, "taskGroup", Modifier.align(Alignment.Center))
        }
        Box(Modifier.size(24.dp).background(JewelTheme.colorPalette.blue(4), shape = RoundedCornerShape(4.dp))) {
            Icon(stroked, "taskGroup", Modifier.align(Alignment.Center))
        }
    }
}
