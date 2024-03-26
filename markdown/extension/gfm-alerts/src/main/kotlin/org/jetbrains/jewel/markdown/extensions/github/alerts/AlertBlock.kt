package org.jetbrains.jewel.markdown.extensions.github.alerts

import org.commonmark.node.CustomBlock
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@GenerateDataFunctions
internal class AlertBlock(val kind: Kind) : CustomBlock() {

    enum class Kind {
        Note, Tip, Important, Warning, Caution
    }
}
