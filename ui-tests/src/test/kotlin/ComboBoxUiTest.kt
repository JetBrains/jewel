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
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.assertHasNoClickAction
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsFocused
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performKeyInput
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.intui.standalone.theme.IntUiTheme
import org.jetbrains.jewel.ui.component.ComboBox
import org.jetbrains.jewel.ui.component.Text
import org.jetbrains.jewel.ui.component.separator
import org.junit.Rule
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class ComboBoxUiTest {
    @get:Rule val composeRule = createComposeRule()

    @Test
    fun `TAB navigation focuses only the text field`() {
        val focusRequester = FocusRequester()
        composeRule.setContent {
            IntUiTheme {
                Box(modifier = Modifier.size(20.dp).focusRequester(focusRequester).testTag("Pre-Box").focusable(true))
                ComboBox(
                    isEditable = true,
                    modifier = Modifier.width(140.dp).testTag("ComboBox"),
                    inputTextFieldState = rememberTextFieldState("First element"),
                    popupContent = { /* ... */ },
                )
            }
        }
        focusRequester.requestFocus()
        composeRule.onNodeWithTag("Pre-Box").assertIsDisplayed().assertIsFocused()

        composeRule.onNodeWithTag("Pre-Box").performKeyInput {
            keyDown(Key.Tab)
            keyUp(Key.Tab)
        }

        composeRule.onNodeWithText("First element").assertIsDisplayed().assertIsFocused()

        composeRule.onNodeWithText("First element").performKeyInput {
            keyDown(Key.Tab)
            keyUp(Key.Tab)
        }

        composeRule.onNodeWithTag("Pre-Box").assertIsFocused()
    }

    @Test
    fun `when not-editable both Box and TextField are focused`() {
        val comboBox = focusedNotEditableComboBox()
        composeRule.onNodeWithText("First element").assertIsDisplayed().assertIsFocused()
    }

    @Test
    fun `when not-editable click opens popup`() {
        val comboBox = focusedNotEditableComboBox()
        comboBox.performClick()
        composeRule.onNodeWithText("Elephant").isDisplayed()
    }

    @Test
    fun `when not-editable double click opens and closes popup`() {
        val comboBox = focusedNotEditableComboBox()

        comboBox.performClick()
        composeRule.onNodeWithText("Elephant").isDisplayed()

        comboBox.performClick()
        composeRule.onNodeWithText("Elephant").assertDoesNotExist()
    }

    @Test
    fun `when not-editable pressing spacebar opens popup`() {
        val comboBox = focusedNotEditableComboBox()

        composeRule.onNodeWithText("Elephant").assertDoesNotExist()

        comboBox.performKeyInput {
            keyDown(Key.Spacebar)
            keyUp(Key.Spacebar)
        }
        composeRule.onNodeWithText("Elephant").assertIsDisplayed()
    }

    @Test
    fun `when not-editable pressing enter opens popup`() {
        val comboBox = focusedNotEditableComboBox()

        composeRule.onNodeWithText("Elephant").assertDoesNotExist()

        comboBox.performKeyInput {
            keyDown(Key.Enter)
            keyUp(Key.Enter)
        }
        composeRule.onNodeWithText("Elephant").assertIsDisplayed()
    }

    @Test
    fun `when editable, textField is displayed and can receive input`() {
        injectComboBox(FocusRequester(), isEditable = true, isEnabled = true)

        composeRule.onNodeWithTag("ComboBox").assertIsDisplayed().performClick()

        composeRule.onNodeWithText("First element").assertIsDisplayed().assertIsFocused().performTextClearance()
        composeRule.onNodeWithText("").performTextInput("First element edited")

        composeRule.onNodeWithText("First element edited").assertIsDisplayed()
    }

    @Test
    fun `when not editable, only Text component is displayed and cannot be edited`() {
        injectComboBox(FocusRequester(), isEditable = false, isEnabled = true)

        composeRule.onNodeWithTag("ComboBox").assertIsDisplayed()

        val textNode = composeRule.onNodeWithText("First element")
        textNode.assertIsDisplayed()

        var exceptionThrown = false
        try {
            textNode.performTextClearance()
        } catch (e: AssertionError) {
            exceptionThrown = true
        }
        assert(exceptionThrown) { "Expected an AssertionError to be thrown when attempting to clear text" }
        textNode.assertIsDisplayed()
    }

    @Test
    fun `when disabled, ComboBox cannot be interacted with`() {
        injectComboBox(FocusRequester(), isEditable = true, isEnabled = false)

        composeRule.onNodeWithTag("ComboBox").assertIsDisplayed().assertHasNoClickAction().performClick()
        composeRule.onNodeWithText("First element").assertExists().assertHasNoClickAction().performClick()
        composeRule.onNodeWithText("Elephant").assertDoesNotExist()
    }

    @Test
    fun `when editable divider is displayed`() {
        injectComboBox(FocusRequester(), isEditable = true, isEnabled = true)

        composeRule
            .onNode(
                hasTestTag("Jewel.ComboBox.Divider") and hasContentDescription("Jewel.ComboBox.Divider"),
                useUnmergedTree = true,
            )
            .assertExists()

        // We can't use assertIsDisplayed() on unmerged nodes, so let's check its bounds instead
        val bounds =
            composeRule
                .onNode(
                    hasTestTag("Jewel.ComboBox.Divider") and hasContentDescription("Jewel.ComboBox.Divider"),
                    useUnmergedTree = true,
                )
                .fetchSemanticsNode()
                .boundsInRoot

        assert(bounds.width > 0f && bounds.height > 0f) {
            "Divider should have non-zero width and height, but was $bounds"
        }
    }

    @Test
    fun `when not-editable divider is not displayed`() {
        injectComboBox(FocusRequester(), isEditable = false, isEnabled = true)
        composeRule
            .onNode(
                hasTestTag("Jewel.ComboBox.Divider") and hasContentDescription("Jewel.ComboBox.Divider"),
                useUnmergedTree = true,
            )
            .assertDoesNotExist()
    }

    @Test
    fun `when not-editable ChevronContainer is clickable and opens popup`() {
        injectComboBox(FocusRequester(), isEditable = false, isEnabled = true)

        val chevronContainer = composeRule.onNode(hasTestTag("Jewel.ComboBox.ChevronContainer"), useUnmergedTree = true)

        chevronContainer.assertExists()

        // We can't use assertIsDisplayed() or assertHasClickAction() on unmerged nodes,
        // so we'll check its bounds and perform the click
        val bounds = chevronContainer.fetchSemanticsNode().boundsInRoot
        assert(bounds.width > 0f && bounds.height > 0f) {
            "ChevronContainer should have non-zero width and height, but was $bounds"
        }

        chevronContainer.performClick()

        // The popup menu should be in the merged tree, so we can assert it's displayed
        composeRule.onNodeWithTag("Jewel.ComboBox.PopupMenu").assertIsDisplayed()
    }

    private fun focusedNotEditableComboBox(
        focusRequester: FocusRequester = FocusRequester(),
        isEditable: Boolean = false,
        isEnabled: Boolean = true,
    ): SemanticsNodeInteraction {
        injectComboBox(focusRequester, isEditable, isEnabled)
        focusRequester.requestFocus()
        val comboBox = composeRule.onNodeWithTag("ComboBox")
        comboBox.assertIsDisplayed().assertIsFocused()
        return comboBox
    }

    private fun injectComboBox(focusRequester: FocusRequester, isEditable: Boolean, isEnabled: Boolean) {
        composeRule.setContent {
            IntUiTheme {
                val itemsComboBox = remember {
                    listOf(
                        "First element",
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
                    isEditable = isEditable,
                    isEnabled = isEnabled,
                    modifier = Modifier.width(140.dp).testTag("ComboBox").focusRequester(focusRequester),
                    inputTextFieldState = inputTextFieldState,
                    popupContent = {
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
    }
}
