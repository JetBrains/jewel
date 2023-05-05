package org.jetbrains.jewel.themes.expui.standalone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJPalette
import org.jetbrains.jewel.themes.expui.standalone.palette.DarkPalette
import org.jetbrains.jewel.themes.expui.standalone.palette.LightPalette
import org.jetbrains.jewel.toBrush
import org.jetbrains.jewel.util.isMacOs

val Color.Companion.ExpUiLight
    get() = LightPalette

val Color.Companion.ExpUiDark
    get() = DarkPalette

val IntelliJPalette.Checkbox.Companion.light
    get() = IntelliJPalette.Checkbox(
        background = Color.ExpUiLight.Grey13,
        foreground = Color.ExpUiLight.Grey13,
        foregroundDisabled = Color.ExpUiLight.Grey8
    )

val IntelliJPalette.Checkbox.Companion.dark
    get() = IntelliJPalette.Checkbox(
        background = Color.ExpUiDark.Grey2,
        foreground = Color.ExpUiDark.Grey14,
        foregroundDisabled = Color.ExpUiDark.Grey5
    )

val IntelliJPalette.RadioButton.Companion.light
    get() = IntelliJPalette.RadioButton(
        background = Color.ExpUiLight.Grey13,
        foreground = Color.ExpUiLight.Grey13,
        foregroundDisabled = Color.ExpUiLight.Grey8
    )

val IntelliJPalette.RadioButton.Companion.dark
    get() = IntelliJPalette.RadioButton(
        background = Color.ExpUiDark.Grey2,
        foreground = Color.ExpUiDark.Grey14,
        foregroundDisabled = Color.ExpUiDark.Grey5
    )

val IntelliJPalette.TextField.Companion.light
    get() = IntelliJPalette.TextField(
        background = Color.ExpUiLight.Grey13,
        backgroundDisabled = Color.ExpUiLight.Grey12,
        foreground = Color.ExpUiLight.Grey1,
        foregroundDisabled = Color.ExpUiLight.Grey8
    )

val IntelliJPalette.TextField.Companion.dark
    get() = IntelliJPalette.TextField(
        background = Color.ExpUiDark.Grey2,
        backgroundDisabled = Color.ExpUiDark.Grey2,
        foreground = Color.ExpUiDark.Grey13,
        foregroundDisabled = Color.ExpUiDark.Grey5
    )

val IntelliJPalette.Button.Companion.light
    get() = IntelliJPalette.Button(
        background = Color.ExpUiLight.Grey13.toBrush(),
        foreground = Color.ExpUiLight.Grey1,
        foregroundDisabled = Color.ExpUiLight.Grey8,
        shadow = Color.Unspecified,
        stroke = Color.ExpUiLight.Grey8.toBrush(),
        strokeFocused = Color.ExpUiLight.Grey13,
        strokeDisabled = Color.ExpUiLight.Grey10,
        defaultBackground = Color.ExpUiLight.Blue6.toBrush(),
        defaultForeground = Color.ExpUiLight.Grey13,
        defaultStroke = Color.ExpUiLight.Blue6.toBrush(),
        defaultStrokeFocused = Color.ExpUiLight.Grey13,
        defaultShadow = Color.Unspecified
    )

val IntelliJPalette.Button.Companion.dark
    get() = IntelliJPalette.Button(
        background = Color.ExpUiDark.Grey2.toBrush(),
        foreground = Color.ExpUiDark.Grey13,
        foregroundDisabled = Color.ExpUiDark.Grey5,
        shadow = Color.Unspecified,
        stroke = Color.ExpUiDark.Grey5.toBrush(),
        strokeFocused = Color.ExpUiDark.Grey5,
        strokeDisabled = Color.ExpUiDark.Grey3,
        defaultBackground = Color.ExpUiDark.Blue6.toBrush(),
        defaultForeground = Color.ExpUiDark.Grey14,
        defaultStroke = Color.ExpUiDark.Blue6.toBrush(),
        defaultStrokeFocused = Color.ExpUiDark.Grey1,
        defaultShadow = Color.Unspecified
    )

val IntelliJPalette.Separator.Companion.light
    get() = IntelliJPalette.Separator(
        color = Color.ExpUiLight.Grey11,
        background = Color.Unspecified
    )

val IntelliJPalette.Separator.Companion.dark
    get() = IntelliJPalette.Separator(
        color = Color.ExpUiDark.Grey1,
        background = Color.Unspecified
    )

val IntelliJPalette.Scrollbar.Companion.light
    get() = IntelliJPalette.Scrollbar(
        thumbIdleColor = if (isMacOs()) Color(0x00000000) else Color(0x33737373),
        thumbHoverColor = if (isMacOs()) Color(0x80000000) else Color(0x47737373)
    )

val IntelliJPalette.Scrollbar.Companion.dark
    get() = IntelliJPalette.Scrollbar(
        thumbIdleColor = if (isMacOs()) Color(0x00808080) else Color(0x47A6A6A6),
        thumbHoverColor = if (isMacOs()) Color(0x8C808080) else Color(0x59A6A6A6)
    )

val IntelliJPalette.Tab.Companion.light
    get() = IntelliJPalette.Tab(
        underlineColor = Color.ExpUiLight.Blue8,
        hoveredBackgroundColor = Color.ExpUiLight.Grey11,
        tabSelectionHeight = 3.dp
    )

val IntelliJPalette.Tab.Companion.dark
    get() = IntelliJPalette.Tab(
        underlineColor = Color.ExpUiDark.Blue7,
        hoveredBackgroundColor = Color.ExpUiDark.Grey4,
        tabSelectionHeight = 3.dp
    )

val IntelliJPalette.Companion.light
    get() = IntelliJPalette(
        isLight = true,
        button = IntelliJPalette.Button.light,
        checkbox = IntelliJPalette.Checkbox.light,
        radioButton = IntelliJPalette.RadioButton.light,
        textField = IntelliJPalette.TextField.light,
        background = Color.ExpUiLight.Grey12,
        text = Color.ExpUiLight.Grey1,
        textDisabled = Color.ExpUiLight.Grey8,
        controlStroke = Color.ExpUiLight.Grey9,
        controlStrokeDisabled = Color.ExpUiLight.Grey10,
        controlStrokeFocused = Color.ExpUiLight.Grey13, // Component.focusedBorderColor
        controlFocusHalo = Color.ExpUiLight.Blue6,
        controlInactiveHaloError = Color.ExpUiLight.Red10,
        controlInactiveHaloWarning = Color.ExpUiLight.Yellow9,
        controlHaloError = Color.ExpUiLight.Red7,
        controlHaloWarning = Color.ExpUiLight.Yellow6,
        separator = IntelliJPalette.Separator.light,
        scrollbar = IntelliJPalette.Scrollbar.light,
        treeView = IntelliJPalette.TreeView.Companion.light,
        slider = IntelliJPalette.Slider.Companion.light,
        tab = IntelliJPalette.Tab.light
    )

val IntelliJPalette.Companion.dark
    get() = IntelliJPalette(
        isLight = false,
        button = IntelliJPalette.Button.dark,
        checkbox = IntelliJPalette.Checkbox.dark,
        textField = IntelliJPalette.TextField.dark,
        radioButton = IntelliJPalette.RadioButton.dark,
        background = Color.ExpUiDark.Grey2,
        text = Color.ExpUiDark.Grey12,
        textDisabled = Color.ExpUiDark.Grey6,
        controlStroke = Color.ExpUiDark.Grey5,
        controlStrokeDisabled = Color.ExpUiDark.Grey4,
        controlStrokeFocused = Color.ExpUiDark.Grey2,
        controlFocusHalo = Color.ExpUiDark.Blue6,
        controlInactiveHaloError = Color.ExpUiDark.Red2,
        controlInactiveHaloWarning = Color.ExpUiDark.Yellow2,
        controlHaloError = Color.ExpUiDark.Red4,
        controlHaloWarning = Color.ExpUiDark.Yellow4,
        separator = IntelliJPalette.Separator.dark,
        scrollbar = IntelliJPalette.Scrollbar.dark,
        treeView = IntelliJPalette.TreeView.dark,
        slider = IntelliJPalette.Slider.dark,
        tab = IntelliJPalette.Tab.dark
    )

val IntelliJPalette.TreeView.Companion.light
    get() = IntelliJPalette.TreeView(
        focusedSelectedElementBackground = Color.ExpUiLight.Blue13,
        background = Color.ExpUiLight.Grey13
    )

val IntelliJPalette.TreeView.Companion.dark
    get() = IntelliJPalette.TreeView(
        focusedSelectedElementBackground = Color.ExpUiDark.Blue2,
        background = Color.ExpUiDark.Grey2
    )

val IntelliJPalette.Slider.Companion.light
    get() = IntelliJPalette.Slider(
        foreground = Color.ExpUiLight.Grey1,
        background = Color.ExpUiLight.Grey12
    )

val IntelliJPalette.Slider.Companion.dark
    get() = IntelliJPalette.Slider(
        foreground = Color.ExpUiDark.Grey10,
        background = Color.ExpUiDark.Grey2
    )
