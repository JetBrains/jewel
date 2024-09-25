import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsFocused
import androidx.compose.ui.test.assertIsNotFocused
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performKeyInput
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.standalone.theme.IntUiTheme
import org.jetbrains.jewel.ui.component.ComboBox
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.separator
import org.junit.Rule
import org.junit.Test

class ComboBoxUiTest {
    @get:Rule val composeRule = createComposeRule()

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun `TAB navigation focuses only the text field`() {
        val focusRequester = FocusRequester()
        composeRule.setContent {
            IntUiTheme {
                Box(modifier = Modifier.size(20.dp).focusRequester(focusRequester).testTag("Pre-Box").focusable(true))

                val itemsComboBox = remember {
                    listOf(
                        "Cat",
                        "Elephant",
                        "Sun",
                        "Book",
                        "Laughter",
                        "Whisper",
                        "Ocean",
                        "Serendipity lorem ipsum",
                        "Umbrella",
                        "Joy",
                    )
                }
                var selectedComboBox: String? by remember { mutableStateOf(itemsComboBox.first()) }
                val inputTextFieldState = rememberTextFieldState(itemsComboBox.first())
                ComboBox(
                    isEditable = true,
                    modifier = Modifier.width(140.dp).testTag("ComboBox"),
                    inputTextFieldState = inputTextFieldState,
                    menuContent = {
                        itemsComboBox.forEach {
                            if (it == "---") {
                                separator()
                            } else {
                                selectableItem(
                                    selected = selectedComboBox == it,
                                    onClick = {
                                        selectedComboBox = it
                                        inputTextFieldState.edit { replace(0, length, it) }
                                    },
                                ) {
                                    Text(it)
                                }
                            }
                        }
                    },
                )
            }
        }

        focusRequester.requestFocus()
        composeRule.onNodeWithTag("Pre-Box").assertIsDisplayed().assertIsFocused().performKeyInput {
            keyDown(Key.Tab)
            keyUp(Key.Tab)
        }

        composeRule.onNodeWithTag("ComboBox").assertIsDisplayed().assertIsNotFocused()
        composeRule.onNodeWithText("Cat").assertIsDisplayed().assertIsFocused().performKeyInput {
            keyDown(Key.Tab)
            keyUp(Key.Tab)
        }

        composeRule.onNodeWithTag("Pre-Box").assertIsFocused()
    }
}
