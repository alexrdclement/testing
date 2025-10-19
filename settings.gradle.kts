pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "maindispatcherrule"

include(":maindispatcherrule-junit4")
include(":maindispatcherrule-junit-jupiter")

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
