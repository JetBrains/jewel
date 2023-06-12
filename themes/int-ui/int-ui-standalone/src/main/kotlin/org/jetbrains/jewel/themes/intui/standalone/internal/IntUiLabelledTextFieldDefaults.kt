package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.jewel.internal.IntelliJTheme
import org.jetbrains.jewel.internal.LabelledTextFieldDefaults

@Suppress("VariableNaming")
abstract class IntUiLabelledTextFieldDefaults : IntUiTextFieldDefaults(), LabelledTextFieldDefaults {

    val HintSpacing = 6.dp

    val LabelSpacing = 6.dp

    @Composable
    override fun hintTextStyle(): TextStyle {
        return IntelliJTheme.defaultTextStyle.copy(
            fontSize = 12.sp,
            lineHeight = 16.sp
        )
    }

    @Composable
    override fun labelTextStyle(): TextStyle = IntelliJTheme.defaultTextStyle

    @Composable
    override fun hintSpacing(): Dp = HintSpacing

    @Composable
    override fun labelSpacing(): Dp = LabelSpacing
}
