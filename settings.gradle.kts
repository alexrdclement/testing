pluginManagement {
    if (file("../gradle-plugins").exists()) {
        includeBuild("../gradle-plugins")
    }
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
    versionCatalogs {
        if (file("../gradle-plugins").exists()) {
            create("alexrdclementPluginLibs") {
                from(files("../gradle-plugins/gradle/libs.versions.toml"))
            }
        }
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "testing"

include(":maindispatcher-extension")
include(":maindispatcher-rule")
