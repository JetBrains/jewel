package org.jetbrains.jewel.samples.ideplugin

sealed class ContentSource<T : ContentItem> {

    abstract val items: List<T>
}
