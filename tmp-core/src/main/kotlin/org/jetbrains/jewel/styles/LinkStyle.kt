package org.jetbrains.jewel.styles

import androidx.compose.runtime.compositionLocalOf
import org.jetbrains.jewel.styles.state.TextLinkState

typealias TextLinkStyle = ControlStyle<TextLinkState, TextLinkAppearance>

val LocalTextLinkStyle = compositionLocalOf<TextLinkStyle> { localNotProvided() }

val Styles.textLink: TextLinkStyle
    get() = LocalTextLinkStyle.current


