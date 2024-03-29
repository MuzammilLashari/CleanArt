// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.3.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.4")
        classpath ("com.google.gms:google-services:4.3.14")
        classpath ("com.google.firebase:firebase-crashlytics-gradle:2.9.2")
        classpath ("com.google.firebase:perf-plugin:1.4.2")

        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.48.1")
        //! safe args for navigation:
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false


}