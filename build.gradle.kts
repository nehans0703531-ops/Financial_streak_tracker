plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.financial_streak"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.financial_streak"
        minSdk = 24
        targetSdk = 36
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    val roomVersion = "2.6.1"
    implementation("com.google.ai.client.generativeai:generativeai:0.9.0")

// Markdown support (so the AI can use Bold/Italics)
    implementation("io.noties.markwon:core:4.6.2")
    implementation("com.google.guava:guava:31.1-android")
    implementation("androidx.room:room-runtime:$roomVersion")
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-runtime:2.6.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata:2.6.2")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation(libs.material)
    implementation(libs.appcompat)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}