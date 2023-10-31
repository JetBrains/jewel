package org.jetbrains.jewel.samples.standalone.viewmodel

import androidx.compose.runtime.Composable

public data class ViewInfo(
    public val title: String,
    public val position: Int,
    public val icon: String,
    public val content: @Composable () -> Unit,
)

@Target(AnnotationTarget.FUNCTION)
public annotation class View(
    public val title: String,
    public val position: Int = 0,
    public val icon: String = "icons/stub.svg",
)
