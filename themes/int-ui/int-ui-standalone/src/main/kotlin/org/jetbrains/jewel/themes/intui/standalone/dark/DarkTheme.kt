package org.jetbrains.jewel.themes.intui.standalone.dark

import org.jetbrains.jewel.ButtonDefaults
import org.jetbrains.jewel.CheckboxDefaults
import org.jetbrains.jewel.ChipDefaults
import org.jetbrains.jewel.DropdownDefaults
import org.jetbrains.jewel.GroupHeaderDefaults
import org.jetbrains.jewel.IntelliJColors
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.LabelledTextFieldDefaults
import org.jetbrains.jewel.LinkDefaults
import org.jetbrains.jewel.MenuDefaults
import org.jetbrains.jewel.ProgressBarDefaults
import org.jetbrains.jewel.RadioButtonDefaults
import org.jetbrains.jewel.ScrollThumbDefaults
import org.jetbrains.jewel.TextAreaDefaults
import org.jetbrains.jewel.TextFieldDefaults
import org.jetbrains.jewel.TreeDefaults
import org.jetbrains.jewel.themes.intui.standalone.IntUiTheme

object DarkTheme : IntUiTheme(DarkPalette) {

    override val colors: IntelliJColors = IntelliJColors(
        foreground = palette.grey(12),
        background = palette.grey(2),
        borderColor = palette.grey(1),

        disabledForeground = palette.grey(5),
        disabledBackground = palette.grey(1),
        disabledBorderColor = palette.grey(3)
    )

    override val iconColors: IntelliJIconColors = IntelliJIconColors(
        generalStroke = palette.grey(11),
        generalFill = palette.grey(4),
        blueSolid = palette.blue(8),
        blueFill = palette.blue(1),
        blueStroke = palette.blue(8),
        greenSolid = palette.green(5),
        greenFill = palette.green(1),
        greenStroke = palette.green(5),
        redSolid = palette.red(6),
        redFill = palette.red(1),
        redStroke = palette.red(6),
        yellowSolid = palette.yellow(7),
        yellowFill = palette.yellow(1),
        yellowStroke = palette.yellow(6),
        orangeFill = palette.orange(1),
        orangeStroke = palette.orange(5),
        purpleFill = palette.purple(1),
        purpleStroke = palette.purple(7),
    )

    override val buttonDefaults: ButtonDefaults = DarkButtonDefaults
    override val checkboxDefaults: CheckboxDefaults = DarkCheckboxDefaults
    override val groupHeaderDefaults: GroupHeaderDefaults = DarkGroupHeaderDefaults
    override val linkDefaults: LinkDefaults = DarkLinkDefaults
    override val textFieldDefaults: TextFieldDefaults = DarkTextFieldDefaults
    override val labelledTextFieldDefaults: LabelledTextFieldDefaults = DarkLabelledTextFieldDefaults
    override val textAreaDefaults: TextAreaDefaults = DarkTextAreaDefaults
    override val radioButtonDefaults: RadioButtonDefaults = DarkRadioButtonDefaults
    override val dropdownDefaults: DropdownDefaults = DarkDropdownDefaults
    override val contextMenuDefaults: MenuDefaults = DarkMenuDefaults
    override val treeDefaults: TreeDefaults = DarkTreeDefaults
    override val chipDefaults: ChipDefaults = DarkChipDefaults
    override val scrollThumbDefaults: ScrollThumbDefaults = DarkScrollThumbDefaults
    override val progressBarDefaults: ProgressBarDefaults = DarkProgressBarDefaults

    override val isLight: Boolean = false
}
