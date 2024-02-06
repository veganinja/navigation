pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "postn"
include(":app")
include(":app2")
include(":app2:myapplication")
include(":app:myapplication")
include(":friday")
include(":app3")
include(":app3")
include(":app31")
include(":friday:12")
