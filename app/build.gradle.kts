plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("io.gitlab.arturbosch.detekt")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp")
    kotlin("kapt")
}

buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.23.0")
    }
}

detekt {
    toolVersion = "1.23.0"
    config.setFrom(file("../config/detekt/detekt.yml"))
}

android {
    namespace = "com.abregujuancruz.supercalculator"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.abregujuancruz.supercalculator"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        jvmToolchain(17)
    }
    kapt {
        correctErrorTypes = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    val hiltVersion = "2.48"
    val hiltComposeVersion = "1.0.0"
    val coreVersion = "1.12.0"
    val lifecycleVersion = "2.6.2"
    val activityVersion = "1.8.0"
    val composeBomVersion = "2023.09.00"
    val navVersion = "2.7.4"

    // Hilt
    implementation("com.google.dagger:hilt-android:$hiltVersion")
    implementation("androidx.hilt:hilt-navigation-compose:$hiltComposeVersion")
    kapt("com.google.dagger:hilt-android-compiler:$hiltVersion")
    // Compose
    implementation("androidx.activity:activity-compose:$activityVersion")
    implementation(platform("androidx.compose:compose-bom:$composeBomVersion"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose")
    implementation("androidx.lifecycle:lifecycle-runtime-compose")
    implementation("androidx.navigation:navigation-compose:$navVersion")
    // Core
    implementation("androidx.core:core-ktx:$coreVersion")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")
    //Test
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}