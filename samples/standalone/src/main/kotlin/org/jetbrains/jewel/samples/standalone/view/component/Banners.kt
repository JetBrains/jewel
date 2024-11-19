package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.component.InformationBanner
import org.jetbrains.jewel.ui.theme.defaultBannerStyle

@Composable
internal fun Banners() {
    Box(Modifier.fillMaxSize().background(Color.White).padding(16.dp)) {
        InformationBanner(
            style = JewelTheme.defaultBannerStyle.information,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt",
        )
    }
}
