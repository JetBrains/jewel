package org.jetbrains.jewel.core

import androidx.compose.foundation.LocalContextMenuRepresentation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.Stable
import org.jetbrains.jewel.core.component.styling.LocalDefaultTabStyle
import org.jetbrains.jewel.core.component.styling.LocalEditorTabStyle
import org.jetbrains.jewel.core.component.styling.LocalTextAreaStyle
import org.jetbrains.jewel.core.component.styling.LocalTextFieldStyle
import org.jetbrains.jewel.core.component.styling.LocalTooltipStyle
import org.jetbrains.jewel.core.component.styling.TabStyle
import org.jetbrains.jewel.core.component.styling.TextAreaStyle
import org.jetbrains.jewel.core.component.styling.TextFieldStyle
import org.jetbrains.jewel.core.component.styling.TooltipStyle
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@Stable
@GenerateDataFunctions
class ComponentStyling(
    val checkboxStyle: org.jetbrains.jewel.core.component.styling.CheckboxStyle,
    val chipStyle: org.jetbrains.jewel.core.component.styling.ChipStyle,
    val circularProgressStyle: org.jetbrains.jewel.core.component.styling.CircularProgressStyle,
    val defaultButtonStyle: org.jetbrains.jewel.core.component.styling.ButtonStyle,
    val defaultDropdownStyle: org.jetbrains.jewel.core.component.styling.DropdownStyle,
    val defaultTabStyle: TabStyle,
    val dividerStyle: org.jetbrains.jewel.core.component.styling.DividerStyle,
    val editorTabStyle: TabStyle,
    val groupHeaderStyle: org.jetbrains.jewel.core.component.styling.GroupHeaderStyle,
    val horizontalProgressBarStyle: org.jetbrains.jewel.core.component.styling.HorizontalProgressBarStyle,
    val iconButtonStyle: org.jetbrains.jewel.core.component.styling.IconButtonStyle,
    val labelledTextFieldStyle: org.jetbrains.jewel.core.component.styling.LabelledTextFieldStyle,
    val lazyTreeStyle: org.jetbrains.jewel.core.component.styling.LazyTreeStyle,
    val linkStyle: org.jetbrains.jewel.core.component.styling.LinkStyle,
    val menuStyle: org.jetbrains.jewel.core.component.styling.MenuStyle,
    val outlinedButtonStyle: org.jetbrains.jewel.core.component.styling.ButtonStyle,
    val radioButtonStyle: org.jetbrains.jewel.core.component.styling.RadioButtonStyle,
    val scrollbarStyle: org.jetbrains.jewel.core.component.styling.ScrollbarStyle,
    val textAreaStyle: TextAreaStyle,
    val textFieldStyle: TextFieldStyle,
    val tooltipStyle: TooltipStyle,
    val undecoratedDropdownStyle: org.jetbrains.jewel.core.component.styling.DropdownStyle,
) {

    @Composable
    fun providedStyles(): Array<ProvidedValue<*>> = arrayOf(
        org.jetbrains.jewel.core.component.styling.LocalCheckboxStyle provides checkboxStyle,
        org.jetbrains.jewel.core.component.styling.LocalChipStyle provides chipStyle,
        org.jetbrains.jewel.core.component.styling.LocalCircularProgressStyle provides circularProgressStyle,
        LocalContextMenuRepresentation provides ContextMenuRepresentation,
        org.jetbrains.jewel.core.component.styling.LocalDefaultButtonStyle provides defaultButtonStyle,
        org.jetbrains.jewel.core.component.styling.LocalDefaultDropdownStyle provides defaultDropdownStyle,
        LocalDefaultTabStyle provides defaultTabStyle,
        org.jetbrains.jewel.core.component.styling.LocalDividerStyle provides dividerStyle,
        LocalEditorTabStyle provides editorTabStyle,
        org.jetbrains.jewel.core.component.styling.LocalGroupHeaderStyle provides groupHeaderStyle,
        org.jetbrains.jewel.core.component.styling.LocalHorizontalProgressBarStyle provides horizontalProgressBarStyle,
        org.jetbrains.jewel.core.component.styling.LocalIconButtonStyle provides iconButtonStyle,
        org.jetbrains.jewel.core.component.styling.LocalLabelledTextFieldStyle provides labelledTextFieldStyle,
        org.jetbrains.jewel.core.component.styling.LocalLazyTreeStyle provides lazyTreeStyle,
        org.jetbrains.jewel.core.component.styling.LocalLinkStyle provides linkStyle,
        org.jetbrains.jewel.core.component.styling.LocalMenuStyle provides menuStyle,
        org.jetbrains.jewel.core.component.styling.LocalOutlinedButtonStyle provides outlinedButtonStyle,
        org.jetbrains.jewel.core.component.styling.LocalRadioButtonStyle provides radioButtonStyle,
        org.jetbrains.jewel.core.component.styling.LocalScrollbarStyle provides scrollbarStyle,
        LocalTextAreaStyle provides textAreaStyle,
        LocalTextFieldStyle provides textFieldStyle,
        LocalTooltipStyle provides tooltipStyle,
        org.jetbrains.jewel.core.component.styling.LocalUndecoratedDropdownStyle provides undecoratedDropdownStyle,
    )
}
