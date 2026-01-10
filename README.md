# Testing

A collection of Kotlin testing libraries and tools.

## `maindispatcher-jupiter-extension`

A JUnit Jupiter Extension that sets `Dispatchers.Main` to a `TestDispatcher` for unit testing coroutines that use the Main dispatcher.

```kotlin
@ExtendWith(MainDispatcherExtension::class)
class MainDispatcherTest {
    
    @Test
    fun `test coroutine with Main dispatcher`() = runTest {
        var result = ""

        launch(Dispatchers.Main) {
            result = "Hello from Main dispatcher"
        }

        assertEquals("Hello from Main dispatcher", result)
    }
}
```

### Setup

#### Version Catalog

```toml
[versions]
maindispatcher-jupiter-extension = "0.0.10"

[dependencies]
maindispatcher-jupiter-extension = { group = "com.alexrdclement.testing", name = "maindispatcher-jupiter-extension", version.ref = "maindispatcher-jupiter-extension" }
```

Then add the following dependency to your `build.gradle.kts` file:

```kotlin
    testImplementation(libs.maindispatcher.jupiter.extension)
```

#### build.gradle.kts

```kotlin
dependencies {
    testImplementation("com.alexrdclement.testing:maindispatcher-jupiter-extension:0.0.10")
}
```


## `maindispatcher-junit-rule`

A JUnit 4 Rule that sets `Dispatchers.Main` to a `TestDispatcher` for unit testing coroutines that use the Main dispatcher.

```kotlin
class MainDispatcherTest {

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    @Test
    fun `test coroutine with Main dispatcher`() = runTest {
        var result = ""

        launch(Dispatchers.Main) {
            result = "Hello from Main dispatcher"
        }

        assertEquals("Hello from Main dispatcher", result)
    }
}
```

### Setup

To use `maindispatcher-junit-rule`, add the following to your version catalog:

```toml
[versions]
maindispatcher-junit-rule = "0.0.10"

[dependencies]
maindispatcher-junit-rule = { group = "com.alexrdclement.testing", name = "maindispatcher-junit-rule", version.ref = "maindispatcher-junit-rule" }
```

Then add the following dependency to your `build.gradle.kts` file:

```kotlin
    testImplementation(libs.maindispatcher.junit.rule)
```

#### build.gradle.kts

```kotlin
dependencies {
    testImplementation("com.alexrdclement.testing:maindispatcher-junit-rule:0.0.10")
}
```
