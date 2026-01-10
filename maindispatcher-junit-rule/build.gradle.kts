plugins {
    id(libs.plugins.alexrdclement.jvm.library.get().pluginId)
    id(libs.plugins.alexrdclement.maven.publish.get().pluginId)
}

dependencies {
    api(libs.kotlinx.coroutines.test)
    api(libs.junit4)

    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.junit4)
}
