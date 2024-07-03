package org.jetbrains.jewel.ui.icon

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.foundation.GenerateDataFunctions
import org.jetbrains.jewel.foundation.theme.JewelTheme

public interface IconKey {

    public fun path(isNewUi: Boolean): String
}

@GenerateDataFunctions
public class PathIconKey(private val path: String) : IconKey {
    override fun path(isNewUi: Boolean): String = path
}

@GenerateDataFunctions
public class IntelliJIconKey(
    public val oldUiPath: String,
    public val newUiPath: String,
) : IconKey {

    override fun path(isNewUi: Boolean): String =
        if (isNewUi) newUiPath else oldUiPath

    public companion object {
        @Composable
        public fun fromPlatformIconId(
            iconId: String,
            idInterpreter: IconIdInterpreter = JewelTheme.iconIdInterpreter,
        ): IntelliJIconKey {
            val interpretation = idInterpreter.interpret(iconId)
            return IntelliJIconKey(interpretation.oldUiPath, interpretation.newUiPath)
        }
    }
}
