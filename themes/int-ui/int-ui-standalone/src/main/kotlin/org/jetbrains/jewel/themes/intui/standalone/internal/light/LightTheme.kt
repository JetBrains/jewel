package org.jetbrains.jewel.themes.intui.standalone.internal.light

import org.jetbrains.jewel.internal.ButtonDefaults
import org.jetbrains.jewel.internal.CheckboxDefaults
import org.jetbrains.jewel.internal.ChipDefaults
import org.jetbrains.jewel.internal.DropdownDefaults
import org.jetbrains.jewel.internal.GroupHeaderDefaults
import org.jetbrains.jewel.internal.IntelliJColors
import org.jetbrains.jewel.internal.LabelledTextFieldDefaults
import org.jetbrains.jewel.internal.LinkDefaults
import org.jetbrains.jewel.internal.RadioButtonDefaults
import org.jetbrains.jewel.internal.ScrollerDefaults
import org.jetbrains.jewel.internal.TextFieldDefaults
import org.jetbrains.jewel.internal.TreeDefaults
import org.jetbrains.jewel.themes.intui.standalone.internal.IntUiTheme

object LightTheme : IntUiTheme(LightPalette) {

    override val colors: IntelliJColors = IntelliJColors(
        foreground = palette.grey(1),
        background = palette.grey(13),
        borderColor = palette.grey(12),

        disabledForeground = palette.grey(8),
        disabledBackground = palette.grey(14),
        disabledBorderColor = palette.grey(11)
    )

    override val buttonDefaults: ButtonDefaults = LightButtonDefaults
    override val checkboxDefaults: CheckboxDefaults = LightCheckboxDefaults
    override val groupHeaderDefaults: GroupHeaderDefaults = LightGroupHeaderDefaults
    override val linkDefaults: LinkDefaults = LightLinkDefaults
    override val textFieldDefaults: TextFieldDefaults = LightTextFieldDefaults
    override val labelledTextFieldDefaults: LabelledTextFieldDefaults = LightLabelledTextFieldDefaults
    override val radioButtonDefaults: RadioButtonDefaults = LightRadioButtonDefaults
    override val dropdownDefaults: DropdownDefaults = LightDropdownDefaults
    override val treeDefaults: TreeDefaults = LightTreeDefaults
    override val chipDefaults: ChipDefaults = LightChipDefaults
    override val scrollerDefaults: ScrollerDefaults = LightScrollerDefaults

    override val isLight: Boolean = true
}
