plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.google.dagger.hilt.android") version "2.44.1" apply false
    id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false
    id("io.gitlab.arturbosch.detekt") version "1.23.0" apply true
    id("com.android.library") version "8.1.4" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.4")
    }
}