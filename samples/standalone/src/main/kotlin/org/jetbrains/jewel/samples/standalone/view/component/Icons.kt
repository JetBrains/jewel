package org.jetbrains.jewel.samples.standalone.view.component

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
import org.jetbrains.jewel.samples.standalone.viewmodel.View
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.painter.badge.DotBadgeShape
import org.jetbrains.jewel.ui.painter.hints.Badge
import org.jetbrains.jewel.ui.painter.hints.Size
import org.jetbrains.jewel.ui.painter.hints.Stroke
import org.jetbrains.jewel.ui.painter.rememberResourcePainterProvider
import org.jetbrains.jewel.ui.theme.colorPalette

@Composable
@View(title = "Icons", position = 6, icon = "icons/components/toolbar.svg")
internal fun Icons() {
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
    }

    Text("Hints:")

    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        val iconProvider =
            rememberResourcePainterProvider("icons/taskGroup.svg", StandaloneSampleIcons::class.java)

        val normal by iconProvider.getPainter()
        val stroked by iconProvider.getPainter(Stroke(Color.White))
        val badged by iconProvider.getPainter(Badge(Color.Red, DotBadgeShape.Default))
        val strokedAndBadged by iconProvider.getPainter(Badge(Color.Red, DotBadgeShape.Default), Stroke(Color.White))
        val resized by iconProvider.getPainter(Size(20))

        Box(Modifier.size(24.dp), contentAlignment = Alignment.Center) {
            Icon(normal, "taskGroup")
        }
        Box(Modifier.size(24.dp), contentAlignment = Alignment.Center) {
            Icon(badged, "taskGroup")
        }
        Box(
            Modifier.size(24.dp).background(JewelTheme.colorPalette.blue(4), shape = RoundedCornerShape(4.dp)),
            contentAlignment = Alignment.Center,
        ) {
            Icon(stroked, "taskGroup")
        }
        Box(
            Modifier.size(24.dp).background(JewelTheme.colorPalette.blue(4), shape = RoundedCornerShape(4.dp)),
            contentAlignment = Alignment.Center,
        ) {
            Icon(strokedAndBadged, "taskGroup")
        }
        Box(Modifier.size(24.dp), contentAlignment = Alignment.Center) {
            Icon(resized, "taskGroup")
        }
    }
}
