package org.jetbrains.jewel.samples.ideplugin.journeys

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.component.DefaultButton
import org.jetbrains.jewel.ui.component.Divider
import org.jetbrains.jewel.ui.component.Icon
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.Typography
import org.jetbrains.jewel.ui.icons.AllIconsKeys

@Composable
fun HomeView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Journey", style = Typography.h2TextStyle())
            Spacer(Modifier.height(12.dp))
            Divider(
                orientation = Orientation.Horizontal,
                thickness = 1.dp,
            )
        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .weight(1f)
        ) {
            Text(
                text = "Capture a user journey and Gemini will create repeatable tasks to scale your manual testing",
                color = JewelTheme.globalColors.text.info
            )
            Spacer(Modifier.height(12.dp))
            DefaultButton(onClick = { }) {
                Row {
                    Text("Live Capture on Device")
                    Spacer(Modifier.width(8.dp))
                    Divider(
                        orientation = Orientation.Vertical,
                        thickness = 1.dp
                    )
                    Spacer(Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .clickable {
                                println("split click")
                            }
                            .background(Color.Yellow)
                            .width(40.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            key = AllIconsKeys.General.ArrowDown,
                            contentDescription = null,
                        )
                    }
                }
            }
        }
    }
}