package org.jetbrains.jewel.themes.intui.standalone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.jewel.IntelliJTypography

val TextStyle.Companion.ExpUiLight
    get() = TextStyle(
        color = Color.ExpUiLight.Grey1,
        fontSize = 13.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily.Inter
    )

val TextStyle.Companion.ExpUiDark
    get() = TextStyle(
        color = Color.ExpUiDark.Grey12,
        fontSize = 13.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily.Inter
    )

val IntelliJTypography.Companion.light
    get() = IntelliJTypography(
        default = TextStyle.ExpUiLight,
        button = TextStyle.ExpUiLight,
        checkBox = TextStyle.ExpUiLight,
        radioButton = TextStyle.ExpUiLight,
        textField = TextStyle.ExpUiLight,
        slider = TextStyle.ExpUiLight
    )

val IntelliJTypography.Companion.dark
    get() = IntelliJTypography(
        default = TextStyle.ExpUiDark,
        button = TextStyle.ExpUiDark,
        checkBox = TextStyle.ExpUiDark,
        radioButton = TextStyle.ExpUiDark,
        textField = TextStyle.ExpUiDark,
        slider = TextStyle.ExpUiDark
    )
