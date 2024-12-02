package org.jetbrains.jewel.samples.standalone.view.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.component.ErrorBanner
import org.jetbrains.jewel.ui.component.ErrorInlineBanner
import org.jetbrains.jewel.ui.component.GroupHeader
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.IconButton
import org.jetbrains.jewel.ui.component.InformationBanner
import org.jetbrains.jewel.ui.component.InformationInlineBanner
import org.jetbrains.jewel.ui.component.Link
import org.jetbrains.jewel.ui.component.SuccessBanner
import org.jetbrains.jewel.ui.component.SuccessInlineBanner
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.WarningBanner
import org.jetbrains.jewel.ui.component.WarningInlineBanner
import org.jetbrains.jewel.ui.icons.AllIconsKeys
import org.jetbrains.jewel.ui.theme.defaultBannerStyle
import org.jetbrains.jewel.ui.theme.inlineBannerStyle

@ExperimentalLayoutApi
@Composable
internal fun Banners() {
    var clickLabel by remember { mutableStateOf("") }
    val scrollState = rememberScrollState()
    Column(Modifier.fillMaxWidth().verticalScroll(scrollState), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(text = "Clicked action: $clickLabel")
        Spacer(Modifier.height(8.dp))

        GroupHeader("Default banner (aka editor banners)")

        InformationBanner(
            style = JewelTheme.defaultBannerStyle.information,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt",
        )

        SuccessBanner(
            style = JewelTheme.defaultBannerStyle.success,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt",
        )

        WarningBanner(
            style = JewelTheme.defaultBannerStyle.warning,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt",
        )

        ErrorBanner(
            style = JewelTheme.defaultBannerStyle.error,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt",
        )

        Spacer(Modifier.height(0.dp)) // The column's arrangement will add 8+8 dps of spacing

        GroupHeader("Inline banner")

        InformationInlineBanner(
            style = JewelTheme.inlineBannerStyle.information,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt",
            actions = {
                Link("Action A", onClick = { clickLabel = "Information Inline Action A clicked" })
                Link("Action B", onClick = { clickLabel = "Information Inline Action B clicked" })
            },
        )
        InformationInlineBanner(
            style = JewelTheme.inlineBannerStyle.information,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt",
        )
        SuccessInlineBanner(
            style = JewelTheme.inlineBannerStyle.success,
            text =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
                    " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " +
                    "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu " +
                    "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa " +
                    "qui officia deserunt mollit anim id est laborum.",
            actions = {
                Link("Action A", onClick = { clickLabel = "Success Inline Action A clicked" })
                Link("Action B", onClick = { clickLabel = "Success Inline Action B clicked" })
            },
            actionIcons = {
                IconButton(onClick = { clickLabel = "Error Close Icon clicked" }) {
                    Icon(AllIconsKeys.General.Close, null)
                }
                IconButton(onClick = { clickLabel = "Error Gear Icon clicked" }) {
                    Icon(AllIconsKeys.General.Gear, null)
                }
            },
        )
        WarningInlineBanner(
            style = JewelTheme.inlineBannerStyle.warning,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt",
            actions = { Link("Action A", onClick = { clickLabel = "Warning Inline Action A clicked" }) },
            actionIcons = {
                IconButton(onClick = { clickLabel = "Error Close Icon clicked" }) {
                    Icon(AllIconsKeys.General.Close, null)
                }
                IconButton(onClick = { clickLabel = "Error Gear Icon clicked" }) {
                    Icon(AllIconsKeys.General.Gear, null)
                }
            },
        )
        ErrorInlineBanner(
            style = JewelTheme.inlineBannerStyle.error,
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt",
            actionIcons = {
                IconButton(onClick = { clickLabel = "Error Inline Action Icon clicked" }) {
                    Icon(AllIconsKeys.General.Close, null)
                }
            },
        )
    }
}
