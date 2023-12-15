plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("io.gitlab.arturbosch.detekt")

}
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${ProjectConfig.detektVersion}")
    }
}
detekt {
    toolVersion = ProjectConfig.detektVersion
    config.setFrom(file("$rootDir/config/detekt/detekt.yml"))
}

android {
    namespace = "com.abregujuancruz.util"
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        minSdk = ProjectConfig.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    kotlin {
        jvmToolchain(ProjectConfig.jdkVersion)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = ProjectConfig.jvmTarget
    }
}

dependencies {
    // Core
    implementation(libs.core.ktx)
}