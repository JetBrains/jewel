package org.jetbrains.jewel.samples.standalone.viewmodel

import androidx.compose.runtime.Composable

data class ViewInfo(
    val title: String,
    val sort: Int,
    val icon: String,
    val content: @Composable () -> Unit,
)

annotation class View(
    val title: String,
    val sort: Int = 0,
    val icon: String = "icons/stub.svg",
)
