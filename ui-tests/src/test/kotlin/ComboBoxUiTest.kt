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
import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.assertHasNoClickAction
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsFocused
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.isNotDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performKeyInput
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.intui.standalone.theme.IntUiTheme
import org.jetbrains.jewel.ui.component.ComboBox
import org.jetbrains.jewel.ui.component.ListComboBox
import org.jetbrains.jewel.ui.component.SimpleListItem
import org.jetbrains.jewel.ui.theme.comboBoxStyle
import org.junit.Rule
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class ComboBoxUiTest {
    @get:Rule val composeRule = createComposeRule()

    private val popupMenu: SemanticsNodeInteraction
        get() = composeRule.onNode(hasTestTag("Jewel.ComboBox.PopupMenu"))

    private val chevronContainer: SemanticsNodeInteraction
        get() = composeRule.onNodeWithTag("Jewel.ComboBox.ChevronContainer")

    private val textField: SemanticsNodeInteraction
        get() = composeRule.onNodeWithTag("Jewel.ComboBox.TextField")

    @Test
    fun `when enabled clicking the chevron container opens the popup`() {
        injectComboBox(FocusRequester(), isEditable = true, isEnabled = true)
        chevronContainer.assertExists().assertHasClickAction().performClick()
        popupMenu.assertExists()
    }

    @Test
    fun `when disable clicking the chevron container doesn't open the popup`() {
        injectComboBox(FocusRequester(), isEditable = false, isEnabled = false)
        chevronContainer.assertExists().assertHasNoClickAction().performClick()
        popupMenu.assertDoesNotExist()
    }

    @Test
    fun `when editable clicking chevron twice opens and closed the popup`() {
        injectComboBox(FocusRequester(), isEditable = true, isEnabled = true)

        chevronContainer.assertHasClickAction().performClick()
        popupMenu.assertExists().isDisplayed()

        chevronContainer.performClick()
        popupMenu.isNotDisplayed()
        popupMenu.assertDoesNotExist()
    }

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
        val comboBox = notEditableFocusedComboBox()
        composeRule.onNodeWithText("First element").assertIsDisplayed().assertIsFocused()
    }

    @Test
    fun `when not-editable click opens popup`() {
        val comboBox = notEditableFocusedComboBox()
        comboBox.performClick()
        composeRule.onNodeWithText("Elephant").isDisplayed()
    }

    @Test
    fun `when not-editable click on comboBox opens popup`() {
        val comboBox = notEditableFocusedComboBox()

        comboBox.performClick()
        popupMenu.isDisplayed()
    }

    @Test
    fun `when not-editable double click on comboBox opens and closes popup`() {
        val comboBox = notEditableFocusedComboBox()

        comboBox.performClick()
        popupMenu.isDisplayed()

        comboBox.performClick()
        popupMenu.isNotDisplayed()
    }

    @Test
    fun `when not-editable pressing spacebar opens popup`() {
        val comboBox = notEditableFocusedComboBox()

        popupMenu.assertDoesNotExist()

        comboBox.performKeyInput {
            keyDown(Key.Spacebar)
            keyUp(Key.Spacebar)
        }
        composeRule.onNodeWithText("First element").assertIsDisplayed()
    }

    @Test
    fun `when not-editable pressing enter opens popup`() {
        val comboBox = notEditableFocusedComboBox()

        popupMenu.assertDoesNotExist()

        comboBox.performKeyInput {
            keyDown(Key.Enter)
            keyUp(Key.Enter)
        }
        composeRule.onNodeWithText("First element").assertIsDisplayed()
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

        chevronContainer.assertExists()

        // We can't use assertIsDisplayed() or assertHasClickAction() on unmerged nodes,
        // so we'll check its bounds and perform the click
        val bounds = chevronContainer.fetchSemanticsNode().boundsInRoot
        assert(bounds.width > 0f && bounds.height > 0f) {
            "ChevronContainer should have non-zero width and height, but was $bounds"
        }

        chevronContainer.performClick()
        popupMenu.assertIsDisplayed()
    }

    @Test
    fun `when focused and editable pressing arrow down opens the popup`() {
        editableComboBox()
        popupMenu.assertDoesNotExist()
        textField.performKeyInput {
            keyDown(Key.DirectionDown)
            keyUp(Key.DirectionDown)
        }
        popupMenu.assertIsDisplayed()
    }

    @Test
    fun `when focused and editable pressing twice arrow down opens the popup and selects the first item`() {
        editableComboBox()
        popupMenu.assertDoesNotExist()
        textField.performKeyInput {
            keyDown(Key.DirectionDown)
            keyUp(Key.DirectionDown)
            keyDown(Key.DirectionDown)
            keyUp(Key.DirectionDown)
        }
        popupMenu.assertIsDisplayed()
        composeRule.onNodeWithText("Cat").assertIsDisplayed().assertIsFocused()
    }

    private fun editableComboBox(): SemanticsNodeInteraction {
        val focusRequester = FocusRequester()
        injectComboBox(focusRequester, true, true)
        focusRequester.requestFocus()
        val comboBox = composeRule.onNodeWithTag("ComboBox")
        comboBox.assertIsDisplayed()

        textField.assertIsDisplayed().assertIsFocused()
        return comboBox
    }

    private fun notEditableFocusedComboBox(
        focusRequester: FocusRequester = FocusRequester(),
        isEnabled: Boolean = true,
    ): SemanticsNodeInteraction {
        injectComboBox(focusRequester, false, isEnabled)
        focusRequester.requestFocus()
        val comboBox = composeRule.onNodeWithTag("ComboBox")
        comboBox.assertIsDisplayed().assertIsFocused()
        return comboBox
    }

    private fun injectComboBox(focusRequester: FocusRequester, isEditable: Boolean, isEnabled: Boolean) {
        composeRule.setContent {
            IntUiTheme {
                var selectedComboBox: String? by remember { mutableStateOf(itemsComboBox.first()) }
                ListComboBox(
                    items = itemsComboBox,
                    isEditable = isEditable,
                    isEnabled = isEnabled,
                    modifier = Modifier.testTag("ComboBox").width(200.dp).focusRequester(focusRequester),
                    onSelectedItemChange = { selectedComboBox = it },
                    listItemContent = { item, isSelected, isFocused ->
                        SimpleListItem(
                            text = item,
                            isSelected = isSelected,
                            style = JewelTheme.comboBoxStyle.itemStyle,
                            contentDescription = item,
                        )
                    },
                )
            }
        }
    }
}

private val itemsComboBox =
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
