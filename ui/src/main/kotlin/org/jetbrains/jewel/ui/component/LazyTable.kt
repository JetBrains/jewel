package org.jetbrains.jewel.ui.component

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.ExperimentalJewelApi
import org.jetbrains.jewel.foundation.OverflowBox
import org.jetbrains.jewel.foundation.Stroke
import org.jetbrains.jewel.foundation.modifier.border
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.LocalContentColor
import org.jetbrains.jewel.ui.component.styling.LazyTableStyle
import org.jetbrains.jewel.ui.theme.tableStyle

@ExperimentalJewelApi
@Composable
public fun LazyTableHeader(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    style: LazyTableStyle = JewelTheme.tableStyle,
    content: @Composable () -> Unit,
) {
    OverflowBox(
        modifier = modifier
            .background(style.colors.headerBackground)
            .border(
                alignment = Stroke.Alignment.Outside,
                width = 1.dp,
                color = style.colors.headerSeparatorColor,
            ),
        contentAlignment = contentAlignment,
    ) {
        CompositionLocalProvider(
            LocalContentColor provides style.colors.headerForeground,
        ) {
            content()
        }
    }
}

@ExperimentalJewelApi
@Composable
public fun LazyTableCell(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    style: LazyTableStyle = JewelTheme.tableStyle,
    content: @Composable () -> Unit,
) {
    OverflowBox(
        modifier = modifier
            .background(style.colors.background)
            .border(
                alignment = Stroke.Alignment.Outside,
                width = 1.dp,
                color = style.colors.gridColor,
            ),
        contentAlignment = contentAlignment,
    ) {
        CompositionLocalProvider(
            LocalContentColor provides style.colors.foreground,
        ) {
            content()
        }
    }
}
