package org.jetbrains.jewel.samples.ideplugin

import kotlinx.datetime.LocalDate
import org.jetbrains.annotations.Nls

sealed class ContentItem {

    @get:Nls abstract val displayText: String
    abstract val imagePath: String?
    abstract val versionName: String
    abstract val releaseDate: LocalDate?
    abstract val key: Any

    data class AndroidStudio(
        @Nls override val displayText: String,
        override val imagePath: String?,
        override val versionName: String,
        val build: String,
        val platformBuild: String,
        val platformVersion: String,
        val channel: ReleaseChannel,
        override val releaseDate: LocalDate?,
        override val key: Any = build,
    ) : ContentItem()

    data class AndroidRelease(
        @Nls override val displayText: String,
        override val imagePath: String?,
        override val versionName: String,
        val codename: String?,
        val apiLevel: Int,
        override val releaseDate: LocalDate?,
        override val key: Any = apiLevel,
    ) : ContentItem()
}

enum class ReleaseChannel {
    Stable, Beta, Canary, Other
}
