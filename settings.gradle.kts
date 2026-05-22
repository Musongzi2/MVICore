pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        maven { setUrl("https://repo1.maven.org/maven2/")}
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin")}
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://oss.sonatype.org/content/repositories/snapshots")
        }
        maven(url = "https://jitpack.io")
        maven { setUrl("https://repo1.maven.org/maven2/")}
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin")}
    }
}

include(
    ":binder",
    ":mvicore",
    ":mvicore-diff",
    ":mvicore-android",
    ":mvicore-debugdrawer",
    ":mvicore-plugin:middleware",
    ":mvicore-plugin:idea",
    ":mvicore-plugin:common",
    ":mvicore-plugin:templates",
    ":mvicore-demo:mvicore-demo-catapi",
    ":mvicore-demo:mvicore-demo-feature1",
    ":mvicore-demo:mvicore-demo-feature2",
    ":mvicore-demo:mvicore-demo-app",
)

includeBuild("plugins")
