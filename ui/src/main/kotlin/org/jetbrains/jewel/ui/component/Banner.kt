package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.component.styling.BannerStyle
import org.jetbrains.jewel.ui.icon.IconKey
import org.jetbrains.jewel.ui.icons.AllIconsKeys
import org.jetbrains.jewel.ui.theme.defaultBannerStyle

@Composable
public fun InformationBanner(
    text: String,
    contentDescription: String,
    modifier: Modifier = Modifier,
    style: BannerStyle = JewelTheme.defaultBannerStyle,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
) {
    Banner(
        text = text,
        contentDescription = contentDescription,
        style = style,
        textStyle = textStyle,
        type = BannerType.Information,
        iconKey = AllIconsKeys.General.Information,
        modifier = modifier,
    )
}

@Composable
private fun Banner(
    text: String,
    contentDescription: String,
    style: BannerStyle,
    textStyle: TextStyle,
    type: BannerType,
    iconKey: IconKey? = null,
    modifier: Modifier = Modifier,
) {
    val dividerColor = when (type) {
        BannerType.Information -> style.colors.dividerInformation
        BannerType.Warning -> TODO()
        BannerType.Error -> TODO()
        BannerType.Success -> TODO()
    }

    Column(modifier.fillMaxWidth()) {
        Divider(orientation = Orientation.Horizontal, color = dividerColor)
        Row(
            modifier = Modifier.background(style.colors.background).padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            iconKey?.let { Icon(it, contentDescription = contentDescription) }
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = text, style = textStyle)
            Spacer(modifier = Modifier.weight(1f))
        }
        Divider(orientation = Orientation.Horizontal, color = style.colors.dividerInformation)
    }
}

private enum class BannerType {
    Information, Warning, Error, Success;
}