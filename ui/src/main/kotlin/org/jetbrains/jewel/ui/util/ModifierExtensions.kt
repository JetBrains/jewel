package org.jetbrains.jewel.ui.util

import androidx.compose.ui.Modifier

@Deprecated(
    "Use thenIf instead",
    ReplaceWith("thenIf(precondition, action)"),
)
public inline fun Modifier.appendIf(
    precondition: Boolean,
    action: Modifier.() -> Modifier,
): Modifier = thenIf(precondition, action)

public inline fun Modifier.thenIf(
    precondition: Boolean,
    action: Modifier.() -> Modifier,
): Modifier = if (precondition) action() else this
