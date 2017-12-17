import org.gradle.kotlin.dsl.kotlin

plugins {
    id("com.android.library")
    kotlin("android")
    id("com.novoda.bintray-release")
}

android {
    compileSdkVersion(targetSdk)
    buildToolsVersion(buildTools)
    defaultConfig {
        minSdkVersion(minSdk)
        targetSdkVersion(targetSdk)
        versionName = bintrayPublish
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    sourceSets {
        getByName("main") {
            manifest.srcFile("AndroidManifest.xml")
            java.srcDirs("src")
        }
    }
}

dependencies {
    compile(kotlin("stdlib", kotlinVersion))
    provided(support("support-v4", supportVersion))
    compile(project(":kota"))
}

publish {
    userOrg = bintrayUser
    groupId = bintrayGroup
    artifactId = "$bintrayArtifact-support-v4"
    publishVersion = bintrayPublish
    desc = bintrayDesc
    website = bintrayWeb
}