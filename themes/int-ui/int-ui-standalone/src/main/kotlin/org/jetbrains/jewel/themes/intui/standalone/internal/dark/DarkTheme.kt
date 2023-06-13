package org.jetbrains.jewel.themes.intui.standalone.internal.dark

import org.jetbrains.jewel.internal.ButtonDefaults
import org.jetbrains.jewel.internal.CheckboxDefaults
import org.jetbrains.jewel.internal.GroupHeaderDefaults
import org.jetbrains.jewel.internal.IntellijColors
import org.jetbrains.jewel.internal.LabelledTextFieldDefaults
import org.jetbrains.jewel.internal.LinkDefaults
import org.jetbrains.jewel.internal.RadioButtonDefaults
import org.jetbrains.jewel.internal.TextFieldDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiTheme

object DarkTheme : IntUiTheme(DarkPalette) {

    override val colors: IntellijColors = IntellijColors(
        foreground = palette.grey(12),
        background = palette.grey(2),
        borderColor = palette.grey(1),

        disabledForeground = palette.grey(5),
        disabledBackground = palette.grey(1),
        disabledBorderColor = palette.grey(3)
    )

    override val buttonDefaults: ButtonDefaults = DarkButtonDefaults
    override val checkboxDefaults: CheckboxDefaults = DarkCheckboxDefaults
    override val groupHeaderDefaults: GroupHeaderDefaults = DarkGroupHeaderDefaults
    override val linkDefaults: LinkDefaults = DarkLinkDefaults
    override val textFieldDefaults: TextFieldDefaults = DarkTextFieldDefaults
    override val labelledTextFieldDefaults: LabelledTextFieldDefaults = DarkLabelledTextFieldDefaults
    override val radioButtonDefaults: RadioButtonDefaults = DarkRadioButtonDefaults
    override val isLight: Boolean = false
}
