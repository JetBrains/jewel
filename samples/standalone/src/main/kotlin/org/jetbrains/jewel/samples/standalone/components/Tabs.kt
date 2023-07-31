@file:Suppress("MagicNumber")

package org.jetbrains.jewel.samples.standalone.components

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.GroupHeader
import org.jetbrains.jewel.TabStrip
import org.jetbrains.jewel.TabStyleType

@Composable
fun Tabs() {
    GroupHeader("Tabs")
//    Row(
//        horizontalArrangement = Arrangement.spacedBy(0.dp)
//    ) {
//        var selectedTab by remember { mutableStateOf(0) }
//        TabStrip(Modifier.fillMaxWidth()) {
//            tab(
//                tabNameString = "Tab 1",
//                closable = false,
//                selected = selectedTab == 0,
//                tabIconResource = "icons/kotlin.svg",
//                onTabClick = { selectedTab = 0 }
//            )
//            tabs(
//                10,
//                selected = { selectedTab == it + 1 },
//                closable = { false },
//                tabNameString = { "tab " + (it + 1) },
//                tabIconResource = { "icons/kotlin.svg" },
//                onTabClick = { selectedTab = it + 1 },
//                onTabClose = { },
//                styleType = { Random.nextBoolean().let { if (it) TabStyleType.Default else TabStyleType.Editor } }
//            )
//        }
//    }
    TabStrip {
        tab(
            selected = true,
            tabNameString = "Tab 1",
            closable = true,
            styleType = TabStyleType.Editor
        )
        tab(
            selected = false,
            tabNameString = "Tab 2",
            closable = true,
            styleType = TabStyleType.Editor
        )
        tab(
            selected = true,
            tabNameString = "Tab 2",
            closable = true,
            styleType = TabStyleType.Editor
        )
    }
}
