plugins {
    alias(libs.plugins.maindispatcherrule.jvm.library)
    alias(libs.plugins.maven.publish)
}

dependencies {
    api(libs.kotlinx.coroutines.test)
    api(libs.junit4)
}
