plugins {
    alias(libs.plugins.alexrdclement.github.release)
}

githubRelease {
    githubToken = System.getenv("GITHUB_TOKEN")
    repository = "alexrdclement/testing"
    enabled = !version.toString().endsWith("SNAPSHOT")
    newTagRevision = System.getenv("GITHUB_SHA")
}
