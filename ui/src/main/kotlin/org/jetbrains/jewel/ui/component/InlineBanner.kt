@file:OptIn(ExperimentalLayoutApi::class)

package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.FlowRowScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.LocalContentColor
import org.jetbrains.jewel.ui.component.styling.InlineBannerStyle
import org.jetbrains.jewel.ui.icons.AllIconsKeys
import org.jetbrains.jewel.ui.theme.inlineBannerStyle

@Composable
public fun InformationInlineBanner(
    text: String,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = { Icon(AllIconsKeys.General.BalloonInformation, null) },
    actions: (@Composable FlowRowScope.() -> Unit)? = null,
    actionIcons: (@Composable RowScope.() -> Unit)? = null,
    style: InlineBannerStyle = JewelTheme.inlineBannerStyle.information,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
) {
    InlineBannerImpl(
        text = text,
        style = style,
        textStyle = textStyle,
        icon = icon,
        actions = actions,
        modifier = modifier,
        actionIcons = actionIcons,
    )
}

@Composable
public fun SuccessInlineBanner(
    text: String,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = { Icon(AllIconsKeys.Debugger.ThreadStates.Idle, null) },
    actions: (@Composable FlowRowScope.() -> Unit)? = null,
    actionIcons: (@Composable RowScope.() -> Unit)? = null,
    style: InlineBannerStyle = JewelTheme.inlineBannerStyle.success,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
) {
    InlineBannerImpl(
        text = text,
        style = style,
        textStyle = textStyle,
        icon = icon,
        actions = actions,
        modifier = modifier,
        actionIcons = actionIcons,
    )
}

@Composable
public fun WarningInlineBanner(
    text: String,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = { Icon(AllIconsKeys.General.BalloonWarning, null) },
    actions: (@Composable FlowRowScope.() -> Unit)? = null,
    actionIcons: (@Composable RowScope.() -> Unit)? = null,
    style: InlineBannerStyle = JewelTheme.inlineBannerStyle.warning,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
) {
    InlineBannerImpl(
        text = text,
        style = style,
        textStyle = textStyle,
        icon = icon,
        actions = actions,
        modifier = modifier,
        actionIcons = actionIcons,
    )
}

@Composable
public fun ErrorInlineBanner(
    text: String,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = { Icon(AllIconsKeys.General.BalloonError, null) },
    actions: (@Composable FlowRowScope.() -> Unit)? = null,
    actionIcons: (@Composable RowScope.() -> Unit)? = null,
    style: InlineBannerStyle = JewelTheme.inlineBannerStyle.error,
    textStyle: TextStyle = JewelTheme.defaultTextStyle,
) {
    InlineBannerImpl(
        text = text,
        style = style,
        textStyle = textStyle,
        icon = icon,
        actions = actions,
        modifier = modifier,
        actionIcons = actionIcons,
    )
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun InlineBannerImpl(
    text: String,
    style: InlineBannerStyle,
    textStyle: TextStyle,
    icon: @Composable (() -> Unit)?,
    actions: @Composable (FlowRowScope.() -> Unit)?,
    actionIcons: @Composable (RowScope.() -> Unit)?,
    modifier: Modifier,
) {
    val borderColor = style.colors.border
    val containerPadding =
        if (actionIcons == null) {
            PaddingValues(12.dp)
        } else {
            PaddingValues(start = 12.dp, top = 8.dp, end = 8.dp, bottom = 10.dp)
        }
    RoundedCornerBox(
        modifier = modifier.testTag("InlineBanner"),
        borderColor = borderColor,
        backgroundColor = style.colors.background,
        contentColor = JewelTheme.contentColor,
        borderWidth = 1.dp,
        cornerSize = CornerSize(8.dp),
        padding = containerPadding,
    ) {
        val verticalAlignment = if (actions == null) Alignment.CenterVertically else Alignment.Top
        Row(verticalAlignment = verticalAlignment) {
            if (icon != null) {
                Box(modifier = Modifier.size(16.dp)) { icon() }
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f).align(verticalAlignment)) {
                Text(text = text, style = textStyle, modifier = Modifier.fillMaxWidth())
                if (actions != null) {
                    Spacer(Modifier.height(8.dp))
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) { actions() }
                }
            }
            if (actionIcons != null) {
                Spacer(Modifier.width(12.dp))
                Row(modifier = Modifier.align(Alignment.Top), verticalAlignment = Alignment.Top) {
                    actionIcons()
                }
            }
        }
    }
}

@Composable
internal fun RoundedCornerBox(
    modifier: Modifier = Modifier,
    contentColor: Color,
    borderColor: Color,
    borderWidth: Dp,
    cornerSize: CornerSize,
    backgroundColor: Color,
    padding: PaddingValues,
    content: @Composable () -> Unit,
) {
    val shape = RoundedCornerShape(cornerSize)
    Box(
        modifier =
            modifier
                .border(borderWidth, borderColor, shape)
                .background(backgroundColor, shape)
                .clip(shape)
                .padding(padding)
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) { content() }
    }
}
