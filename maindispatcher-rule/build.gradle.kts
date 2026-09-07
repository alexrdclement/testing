plugins {
    id(libs.plugins.embarrasdf.jvm.library.get().pluginId)
    id(libs.plugins.embarrasdf.maven.publish.get().pluginId)
}

dependencies {
    api(libs.kotlinx.coroutines.test)
    api(libs.junit4)

    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.junit4)
}
