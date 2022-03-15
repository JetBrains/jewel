package org.jetbrains.jewel.theme.intellij

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.runBlocking
import org.jetbrains.skiko.AwtFontManager

val TextStyle.Companion.IntelliJLight
    get() = TextStyle(
        color = Color.Black,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily(Font(runBlocking { AwtFontManager.DEFAULT.findFontFamilyFile("Segoe UI")!! }))
    )

val TextStyle.Companion.IntelliJDark
    get() = TextStyle(
        color = Color.IntelliJWhite,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily(Font(runBlocking { AwtFontManager.DEFAULT.findFontFamilyFile("Segoe UI")!! }))
    )

val IntelliJTypography.Companion.light
    get() = IntelliJTypography(
        default = TextStyle.IntelliJLight,
        button = TextStyle.IntelliJLight,
        checkBox = TextStyle.IntelliJLight,
        radioButton = TextStyle.IntelliJLight,
        textField = TextStyle.IntelliJLight
    )

val IntelliJTypography.Companion.darcula
    get() = IntelliJTypography(
        default = TextStyle.IntelliJDark,
        button = TextStyle.IntelliJDark,
        checkBox = TextStyle.IntelliJDark,
        radioButton = TextStyle.IntelliJDark,
        textField = TextStyle.IntelliJDark
    )
