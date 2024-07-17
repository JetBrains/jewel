package org.jetbrains.jewel.bridge.icon

import com.intellij.ui.icons.CachedImageIcon
import org.jetbrains.jewel.ui.icon.IconKey
import org.jetbrains.jewel.ui.icon.IntelliJIconKey

@Suppress("UnstableApiUsage") // We have no alternatives before IJP 242
public fun IntelliJIconKey.Companion.fromPlatformIcon(icon: javax.swing.Icon): IconKey {
    check(icon is CachedImageIcon) {
        "Only icons implementing IconPathsProvider are supported (e.g., coming from AllIcons)"
    }

    val oldUiPath =
        checkNotNull(icon.originalPath) {
            "Only resource-backed CachedImageIcons are supported (e.g., coming from AllIcons)"
        }

    // On IJP 233, we don't have expUiPath available yet, so we just use the oldUiPath
    // for both — new UI icon mapping will happen in BridgeOverride.
    return IntelliJIconKey(oldUiPath, oldUiPath)
}
