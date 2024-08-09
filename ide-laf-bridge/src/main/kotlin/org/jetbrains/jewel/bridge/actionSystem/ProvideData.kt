package org.jetbrains.jewel.bridge.actionSystem

import androidx.compose.foundation.focusable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusEventModifierNode
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.actionSystem.DataProvider

/**
 * Configure component to provide data for IntelliJ Actions system.
 *
 * Use this modifier to provide context related data that can be used by
 * IntelliJ Actions functionality such as Search Everywhere, Action Popups
 * etc.
 *
 * Important note: modifiers order is important, so be careful with order
 * of [focusable] and [provideData] (see [FocusEventModifierNode]).
 *
 * @see DataProvider
 * @see DataContext
 * @see ComponentDataProviderBridge
 */
@Suppress("unused")
public fun Modifier.provideData(dataProvider: DataProviderContext.() -> Unit): Modifier = this then DataProviderElement(dataProvider)
