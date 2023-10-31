package org.jetbrains.jewel.samples.ideplugin.releasessample

import kotlinx.datetime.LocalDate
import org.jetbrains.annotations.Nls

public sealed class ContentItem {

    @get:Nls public abstract val displayText: String
    public abstract val imagePath: String?
    public abstract val versionName: String
    public abstract val releaseDate: LocalDate?
    public abstract val key: Any

    public data class AndroidStudio(
        @Nls override val displayText: String,
        override val imagePath: String?,
        override val versionName: String,
        public val build: String,
        public val platformBuild: String,
        public val platformVersion: String,
        public val channel: ReleaseChannel,
        override val releaseDate: LocalDate?,
        override val key: Any = build,
    ) : ContentItem()

    public data class AndroidRelease(
        @Nls override val displayText: String,
        override val imagePath: String?,
        override val versionName: String,
        public val codename: String?,
        public val apiLevel: Int,
        override val releaseDate: LocalDate?,
        override val key: Any = releaseDate ?: displayText,
    ) : ContentItem()
}

public fun ContentItem.matches(text: String): Boolean {
    if (displayText.contains(text, ignoreCase = true)) return true
    if (versionName.contains(text, ignoreCase = true)) return true

    when (this) {
        is ContentItem.AndroidStudio -> {
            if (build.contains(text, ignoreCase = true)) return true
            if (channel.name.contains(text, ignoreCase = true)) return true
            if (platformBuild.contains(text, ignoreCase = true)) return true
            if (platformVersion.contains(text, ignoreCase = true)) return true
        }
        is ContentItem.AndroidRelease -> {
            if (codename?.contains(text, ignoreCase = true) == true) return true
            if (this.apiLevel.toString().contains(text, ignoreCase = true)) return true
        }
    }

    return false
}
