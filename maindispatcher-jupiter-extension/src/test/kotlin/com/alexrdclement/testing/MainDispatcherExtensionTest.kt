package com.alexrdclement.testing

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

class MainDispatcherExtensionTest {

    @JvmField
    @RegisterExtension
    val mainDispatcherExtension = MainDispatcherExtension()

    @Test
    fun `test coroutine with Main dispatcher`() = runTest {
        var result = ""

        launch(Dispatchers.Main) {
            result = "Hello from Main dispatcher"
        }

        assertEquals("Hello from Main dispatcher", result)
    }

    @Test
    fun `test multiple coroutines on Main dispatcher`() = runTest {
        val results = mutableListOf<String>()

        launch(Dispatchers.Main) {
            results.add("First")
        }

        launch(Dispatchers.Main) {
            results.add("Second")
        }

        assertEquals(listOf("First", "Second"), results)
    }
}
