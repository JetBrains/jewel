package org.jetbrains.jewel.samples.ideplugin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.intellij.ui.JBColor
import org.jetbrains.jewel.bridge.LocalComponent
import org.jetbrains.jewel.bridge.toComposeColor
import org.jetbrains.jewel.foundation.modifier.trackActivation
import org.jetbrains.jewel.foundation.modifier.trackComponentActivation
import org.jetbrains.jewel.ui.Orientation
import org.jetbrains.jewel.ui.component.Divider
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.TextArea
import org.jetbrains.jewel.ui.component.VerticalScrollbar
import java.util.Locale

@Composable
internal fun ScrollbarsShowcaseTab() {
    val bgColor by remember(JBColor.PanelBackground.rgb) { mutableStateOf(JBColor.PanelBackground.toComposeColor()) }

    val scrollState = rememberScrollState()
    Row(
        modifier =
            Modifier
                .trackComponentActivation(LocalComponent.current)
                .fillMaxSize()
                .background(bgColor)
                .verticalScroll(scrollState)
                .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Column(
            Modifier.trackActivation().weight(1f),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Row(modifier = Modifier.fillMaxWidth().height(200.dp)) {
                val textFieldState = rememberTextFieldState(ANDROID_IPSUM)
                TextArea(
                    state = textFieldState,
                    modifier = Modifier.size(300.dp),
                )

                Divider(Orientation.Vertical, modifier = Modifier.width(10.dp))

                Row(modifier = Modifier.background(Color(0xff1e1f22))) {
                    val scrollState = rememberLazyListState()
                    LazyColumn(
                        modifier = Modifier.width(300.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp),
                        state = scrollState,
                    ) {
                        items(LIST_ITEMS) { item ->
                            Column(
                                modifier = Modifier.height(48.dp),
                            ) {
                                Text(
                                    modifier = Modifier.padding(horizontal = 8.dp),
                                    text = item,
                                )
                                Divider(orientation = Orientation.Horizontal, color = Color.Gray)
                            }
                        }
                    }
                    VerticalScrollbar(scrollState)
                }
            }
        }
    }
}

private const val ANDROID_IPSUM =
    "Jetpack Compose dolor sit amet, viewBinding consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
        " ut unitTest et dolore magna aliqua. Dependency injection enim ad minim veniam, quis nostrud Dagger-Hilt " +
        "ullamco laboris nisi ut aliquip ex ea Lottie animation consequat. Retrofit irure dolor in reprehenderit in" +
        " AndroidX velit esse cillum dolore eu fugiat nulla pariatur. Gradle sync dolor sit amet, compileSdkVersion" +
        " consectetur adipiscing elit, sed do eiusmod minimSdkVersion tempor incididunt ut labore et dolore magna" +
        " aliqua. Ut enim ad activity_main.xml veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip" +
        " ex ea compileOptions consequat. Duis aute irure dolor in reprehenderit in logcat velit esse cillum dolore" +
        "eu fugiat nulla pariatur. Excepteur sint occaecat proident, sunt in culpa qui officia debugImplementation" +
        " deserunt mollit anim id est laborum. Manifest merger dolor sit amet, androidx.appcompat.app.AppCompatActivity" +
        " adipiscing elit, sed do eiusmod tempor incididunt ut buildToolsVersion et dolore magna aliqua. Proguard" +
        " rules enim ad minim veniam, quis nostrud fragmentContainerView ullamco laboris nisi ut aliquip ex ea" +
        " dataBinding compilerOptions consequat. Kotlin coroutine aute irure dolor in reprehenderit in ViewModel" +
        " velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat Room database non proident," +
        " sunt in culpa qui officia material design deserunt mollit anim id est laborum."

private val LIST_ITEMS =
    ANDROID_IPSUM.split(",")
        .map { lorem ->
            lorem.trim()
                .replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
                }
        }
