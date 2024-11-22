package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.component.styling.DefaultBannerStyle
import org.jetbrains.jewel.ui.icons.AllIconsKeys
import org.jetbrains.jewel.ui.theme.defaultBannerStyle

@Composable
public fun InformationBanner(
    text: String,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = { Icon(AllIconsKeys.General.BalloonInformation, null) },
    actions: (@Composable RowScope.() -> Unit)? = null,
    style: DefaultBannerStyle = JewelTheme.defaultBannerStyle.information,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
) {
    BannerImpl(text = text, style = style, textStyle = textStyle, icon = icon, actions = actions, modifier = modifier)
}

@Composable
public fun SuccessBanner(
    text: String,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = { Icon(AllIconsKeys.Debugger.ThreadStates.Idle, null) },
    actions: (@Composable RowScope.() -> Unit)? = null,
    style: DefaultBannerStyle = JewelTheme.defaultBannerStyle.success,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
) {
    BannerImpl(text = text, style = style, textStyle = textStyle, icon = icon, actions = actions, modifier = modifier)
}

@Composable
private fun BannerImpl(
    text: String,
    style: DefaultBannerStyle,
    textStyle: TextStyle,
    icon: (@Composable () -> Unit)?,
    actions: (@Composable RowScope.() -> Unit)?,
    modifier: Modifier = Modifier,
) {
    Column(modifier.fillMaxWidth()) {
        Divider(orientation = Orientation.Horizontal, color = style.colors.border)
        Row(
            modifier = Modifier.background(style.colors.background).padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(Modifier.size(16.dp)) { icon?.invoke() }
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = text, style = textStyle)
            Spacer(modifier = Modifier.weight(1f))
            actions?.invoke(this) // TODO: add proper implementation once we have more
            // https://github.com/JetBrains/jewel/issues/686
        }
        Divider(orientation = Orientation.Horizontal, color = style.colors.border)
    }
}
