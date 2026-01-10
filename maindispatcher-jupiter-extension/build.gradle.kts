plugins {
    id(libs.plugins.alexrdclement.jvm.library.get().pluginId)
    id(libs.plugins.alexrdclement.maven.publish.get().pluginId)
}

dependencies {
    api(libs.kotlinx.coroutines.test)
    api(libs.junit.jupiter.api)

    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.junit.jupiter.api)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testRuntimeOnly(libs.junit.platform.launcher)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
