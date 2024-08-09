package org.jetbrains.jewel.bridge.actionSystem

import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.assertIsFocused
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.intellij.openapi.actionSystem.DataKey
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class ProvideDataTest {
    @JvmField @Rule
    val rule = createComposeRule()

    @Test
    fun `one component`() {
        runBlocking {
            val sink = TestDataSink()
            val rootDataProviderModifier = RootDataProviderModifier()
            var focusManager: FocusManager? = null
            rule.setContent {
                focusManager = LocalFocusManager.current
                Box(
                    modifier =
                        rootDataProviderModifier.testTag("provider")
                            .provideData {
                                set(TestDataKeys.DATA, "ok")
                            }
                            .focusable(),
                )
            }
            rule.awaitIdle()
            focusManager!!.moveFocus(FocusDirection.Next)
            rule.awaitIdle()

            rule.onNodeWithTag("provider").assertIsFocused()
            rootDataProviderModifier.uiDataSnapshot(sink)

            assertEquals("ok", sink.get(TestDataKeys.DATA))
            assertEquals(null, sink.get(TestDataKeys.ANOTHER_DATA))
        }
    }

    @Test
    fun `component hierarchy`() {
        runBlocking {
            val rootDataProviderModifier = RootDataProviderModifier()
            var focusManager: FocusManager? = null
            rule.setContent {
                focusManager = LocalFocusManager.current
                Box(
                    modifier =
                        rootDataProviderModifier.testTag("root_provider")
                            .provideData {
                                set(TestDataKeys.IS_ROOT, "yes")
                                set(TestDataKeys.DATA, "notOk")
                            }
                            .focusable(),
                ) {
                    Box(modifier = Modifier.testTag("non_data_provider").focusable()) {
                        Box(
                            modifier =
                                Modifier.testTag("data_provider_item")
                                    .provideData {
                                        set(TestDataKeys.DATA, "ok")
                                        set(TestDataKeys.ONE, "1")
                                    }
                                    .focusable(),
                        )
                    }
                }
            }

            rule.awaitIdle()
            focusManager!!.moveFocus(FocusDirection.Next)
            rule.awaitIdle()

            val sink = TestDataSink()
            rule.onNodeWithTag("root_provider").assertIsFocused()
            rootDataProviderModifier.uiDataSnapshot(sink)
            assertEquals("yes", sink.get(TestDataKeys.IS_ROOT))
            assertEquals("notOk", sink.get(TestDataKeys.DATA))
            assertEquals(null, sink.get(TestDataKeys.ONE))

            focusManager!!.moveFocus(FocusDirection.Next)
            rule.awaitIdle()
            sink.clear()

            rule.onNodeWithTag("non_data_provider").assertIsFocused()
            rootDataProviderModifier.uiDataSnapshot(sink)
            // non_data_provider still should provide isRoot == true because it should be taken from root
            // but shouldn't provide "one" yet
            assertEquals("yes", sink.get(TestDataKeys.IS_ROOT))
            assertEquals("notOk", sink.get(TestDataKeys.DATA))
            assertEquals(null, sink.get(TestDataKeys.ONE))

            focusManager!!.moveFocus(FocusDirection.Next)
            rule.awaitIdle()
            sink.clear()

            rule.onNodeWithTag("data_provider_item").assertIsFocused()
            rootDataProviderModifier.uiDataSnapshot(sink)
            assertEquals("yes", sink.get(TestDataKeys.IS_ROOT))
            assertEquals("ok", sink.get(TestDataKeys.DATA))
            assertEquals("1", sink.get(TestDataKeys.ONE))
        }
    }
}

private object TestDataKeys {
    val DATA = DataKey.create<String>("data")
    val ANOTHER_DATA = DataKey.create<String>("another_data")
    val IS_ROOT = DataKey.create<String>("isRoot")
    val ONE = DataKey.create<String>("one")
}
